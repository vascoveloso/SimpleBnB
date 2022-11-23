package pt.ulisboa.tecnico.simplebnb.guest;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import pt.ulisboa.tecnico.simplebnb.contract.BnbDefinitions;
import pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.*;

public class Guest {

    private static final String GUEST_JOIN_CMD = "guest_join";
    private static final String LIST_ALL_CMD = "list_all";
    private static final String FILTER_BY_CMD = "filter_by";
    private static final String BOOK_HOUSE_CMD = "book_house";
    private static final String EXIT_CMD = "";
    private static final String DEBUG = "-debug";

    static Boolean debugFlag = false;

    private static void debug(String debugMessage) {
        if(debugFlag) System.err.println(debugMessage);
    }

    public static void main(String[] args) {
        System.out.println(Guest.class.getSimpleName());
        System.out.printf("Received %d Argument(s)%n", args.length);

        // receive and print arguments
        for (int i = 0; i < args.length; i++) {
            System.out.printf("args[%d] = %s%n", i, args[i]);
        }

        // Check arguments given; input expected: server + port + guestId and/or debug flag
        if (args.length < 2) {
            System.exit(1);
        }

        final String server = args[0];
        final int port = Integer.parseInt(args[1]);
        final int guestId = Integer.parseInt(args[2]);

        GuestFrontend guestFrontend = new GuestFrontend(server, port);

        Scanner scanner = new Scanner(System.in);

        while(true) {
            System.out.printf("%n> ");
            String line = scanner.nextLine();
            String[] splitLine = line.split(" ");
            int argSize = splitLine.length;

            if(GUEST_JOIN_CMD.equals(splitLine[0])) {
                StringBuilder guestNameBuild = null;

                // Process Guest input, to join
                if(argSize >= 2) {
                    int i = 1;
                    guestNameBuild = new StringBuilder(splitLine[i]);
                    while(i < argSize - 1) {
                        i++;
                        guestNameBuild.append(" ").append(splitLine[i]);
                    }
                }
                assert guestNameBuild != null;
                String[] guestInfo = guestNameBuild.toString().split(",");

                // Check if guestId given is not doubled.
                // If response ID comes as -1, then operation got CANCELLED
                guestJoinResponse response = guestFrontend.guestJoin(guestInfo[0], Integer.parseInt(guestInfo[1]));
                if(response.getGuestId() == -1){
                    System.out.println("\nInvalid Command\nGuestID given already exists.");
                }
                else{
                    System.out.println("Guest " + response.getGuestId() + " joined SimpleBnB");
                }
            }

            else if(LIST_ALL_CMD.equals(splitLine[0])) {
                listAllResponse response = guestFrontend.listAll();
                List<BnbDefinitions.House> list= response.getHouseListList();
                int id = 0;
                for (BnbDefinitions.House house : list) {
                    System.out.println(house.getHouseName() + "," + house.getHouseAddress() + ","
                    + house.getHouseNumber() + "," + house.getHouseFloor() + ","
                    + house.getHouseLocation() + "," + house.getHousePostalCode() + ","
                    + house.getHouseCapacity() + "," + house.getHouseCost() + "," + id);
                    id++;
                }
            }

            else if(FILTER_BY_CMD.equals(splitLine[0])) {
                StringBuilder filterBuild = null;
                if(argSize >= 2) {
                    int i = 1;
                    filterBuild = new StringBuilder(splitLine[i]);
                    while(i < argSize - 1) {
                        i++;
                        filterBuild.append(" ").append(splitLine[i]);
                    }
                }
                assert filterBuild != null;
                String[] filterInfo = filterBuild.toString().split(",");

                filterByResponse response = guestFrontend.filterBy(filterInfo[0], filterInfo[1]);
                List<BnbDefinitions.House> list = response.getFilterListList();

                for(BnbDefinitions.House house : list) {
                    System.out.println(house.getHouseName() + "," + house.getHouseAddress() + ","
                            + house.getHouseNumber() + "," + house.getHouseFloor() + ","
                            + house.getHouseLocation() + "," + house.getHousePostalCode() + ","
                            + house.getHouseCapacity() + "," + house.getHouseCost() + "," + house.getHouseId());
                }
            }

            else if(BOOK_HOUSE_CMD.equals(splitLine[0])) {
                StringBuilder bookHOuseBuilder = null;
                if(argSize >= 2) {
                    int i = 1;
                    bookHOuseBuilder = new StringBuilder(splitLine[i]);
                    while(i < argSize - 1) {
                        i++;
                        bookHOuseBuilder.append(" ").append(splitLine[i]);
                    }
                }
                assert bookHOuseBuilder != null;
                String[] bookInfo = bookHOuseBuilder.toString().split(",");

                bookHouseResponse response = guestFrontend.bookHouse(bookInfo[0], bookInfo[1], bookInfo[2]);
                System.out.println("Booked house " + response.getHouseId() + " for "
                + bookInfo[2] + " nights starting in " + bookInfo[1]);
            }

            else if(EXIT_CMD.equals(splitLine[0])) {
                System.out.println("Shutting down connection to " + server + " at port " + port);
                System.exit(0);
            }

            else {
                System.out.println("\nInvalid Command.");
            }
        }
    }
}
