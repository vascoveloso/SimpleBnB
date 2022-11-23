package pt.ulisboa.tecnico.simplebnb.guest;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pt.ulisboa.tecnico.simplebnb.contract.guest.guestServiceGrpc;
import pt.ulisboa.tecnico.simplebnb.contract.BnbDefinitions;
import pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.*;

public class GuestFrontend {

    private ManagedChannel channel;
    private guestServiceGrpc.guestServiceBlockingStub stub;

    private String host;
    private int port;

    private BnbDefinitions.ServerEntry serverEntry;

    public GuestFrontend(String address, int port) {
        channel = ManagedChannelBuilder.forAddress(address, port).usePlaintext().build();
        stub = guestServiceGrpc.newBlockingStub(channel);
    }

    public guestJoinResponse guestJoin(String name, int id) {
        guestJoinRequest request = guestJoinRequest
                .newBuilder()
                .setGuestName(name)
                .setGuestId(id)
                .build();

        return stub.guestJoin(request);
    }

    public listAllResponse listAll() {
        return stub.listAll(listAllRequest.getDefaultInstance());
    }

    public filterByResponse filterBy(String filter, String value) {
        filterByRequest request = filterByRequest
                .newBuilder()
                .setGuestFilter(filter)
                .setGuestValue(value)
                .build();

        return stub.filterBy(request);
    }

    public bookHouseResponse bookHouse(String id, String date, String num) {
        bookHouseRequest request = bookHouseRequest
                .newBuilder()
                .setHouseId(Integer.parseInt(id))
                .setDate(date)
                .setNights(Integer.parseInt(num))
                .build();

        return stub.bookHouse(request);
    }

    public void closeChannel() {
        if (channel != null) {
            channel.shutdown();
        }
    }



}
