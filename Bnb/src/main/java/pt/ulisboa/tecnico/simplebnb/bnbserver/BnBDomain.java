package pt.ulisboa.tecnico.simplebnb.bnbserver;

import pt.ulisboa.tecnico.simplebnb.contract.BnbDefinitions;
import pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class BnBDomain {

    private final ConcurrentHashMap<Integer, BnbDefinitions.House> houses;
    private final ConcurrentHashMap<Integer, BnbDefinitions.Host> hosts;
    private final ConcurrentHashMap<Integer, BnbDefinitions.Guest> guests;
    private int houseCount;

    public BnBDomain() {
        houseCount = 0;
        houses = new ConcurrentHashMap<>();
        hosts = new ConcurrentHashMap<>();
        guests = new ConcurrentHashMap<>();
    }

    public synchronized Map<Integer, BnbDefinitions.House> getHouses() {
        return this.houses;
    }

    public synchronized Map<Integer, BnbDefinitions.Host> getHosts() {
        return this.hosts;
    }

    public synchronized Map<Integer, BnbDefinitions.Guest> getGuests() {
        return this.guests;
    }

    //============================ HOUSE(HOST) functions ==================================
    public synchronized int addHouse(BnbDefinitions.House newHouse) {
        houseCount++;
        newHouse.newBuilderForType().setHouseId(houseCount).build();
        houses.put(houseCount, newHouse);
        System.out.println("[OK]: house " + houseCount + " was added to the system.");
        return houseCount;
    }

    public synchronized int removeHouse(int houseId) {
        int check = -1;
        for(Map.Entry<Integer, BnbDefinitions.House> entry : houses.entrySet()) {
            if(entry.getKey() == houseId) {
                houses.remove(houseId);
                check = 0;
            }
        }
        if(check != 0){
            System.out.println("[ABORT]: house " + houseId + " does not exist.");
        }
        else{
            System.out.println("[OK]: house " + houseId + " was eliminated from the system.");
        }
        return check;
    }

    //============================ HOST functions =====================================
    public synchronized int hostJoin(String name, int id) {
        if(hosts.containsKey(id)) {
            System.out.println("[ABORT]: Request received from host "
                    + id + " to join, but hostId already exists.");
            return -1;
        }
        else{
            hosts.put(id, BnbDefinitions.Host
                    .newBuilder()
                    .setHostName(name)
                    .setHostId(id)
                    .build());

            System.out.println("[OK]: Host " + id + " was introduced into the system.");
            return id;
        }
    }

    //=============================== GUEST functions ==================================
    public synchronized int guestJoin(String name, int id) {
        if(guests.containsKey(id)) {
            System.out.println("[ABORT]: Request received from guest "
                    + id + " to join, but guestId already exists.");
            return -1;
        }
        else{
            guests.put(id, BnbDefinitions.Guest
                    .newBuilder()
                    .setGuestName(name)
                    .setGuestId(id)
                    .build());

            System.out.println("[OK]: Guest " + id + " was introduced into the system.");
            return id;
        }
    }

    public synchronized listAllResponse listAll(){
        return listAllResponse
                .newBuilder()
                .addAllHouseList(houses.values())
                .build();
    }

    public synchronized filterByResponse filterBy(String filter, String value) {
        List<BnbDefinitions.House> list = new ArrayList<>();

        if(filter.equals("NAME")){
            for(Map.Entry<Integer, BnbDefinitions.House> houseEntry : houses.entrySet()){
                if(houseEntry.getValue().getHouseName().equals(value)) {
                    list.add(houseEntry.getValue());
                }
            }
        }
        else if(filter.equals("LOCATION")){
            for(Map.Entry<Integer, BnbDefinitions.House> houseEntry : houses.entrySet()){
                if(houseEntry.getValue().getHouseLocation().equals(value)) {
                    list.add(houseEntry.getValue());
                }
            }
        }
        else if(filter.equals("CAPACITY")) {
            for (Map.Entry<Integer, BnbDefinitions.House> houseEntry : houses.entrySet()) {
                if (houseEntry.getValue().getHouseCapacity().equals(value)) {
                    list.add(houseEntry.getValue());
                }
            }
        }
        else {
            for(Map.Entry<Integer, BnbDefinitions.House> houseEntry : houses.entrySet()) {
                if (houseEntry.getValue().getHouseCost() == Integer.parseInt(value)) {
                    list.add(houseEntry.getValue());
                }
            }
        }

        return filterByResponse.newBuilder().addAllFilterList(list).build();
    }

    public synchronized int bookHouse(int houseId, String date, int nights) {
        return houseId;
    }
}
