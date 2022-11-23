package pt.ulisboa.tecnico.simplebnb.host;

import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import pt.ulisboa.tecnico.simplebnb.contract.BnbDefinitions;
import pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.*;
import pt.ulisboa.tecnico.simplebnb.contract.host.HostServiceGrpc;

public class HostFrontend {

    private ManagedChannel channel;
    private HostServiceGrpc.HostServiceBlockingStub stub;

    public HostFrontend(String address, int port) {
        channel = ManagedChannelBuilder.forAddress(address, port).usePlaintext().build();
        stub = HostServiceGrpc.newBlockingStub(channel);
    }

    public HostJoinResponse hostJoin(String name, int id) {
        HostJoinRequest request = HostJoinRequest
                .newBuilder()
                .setHostName(name)
                .setHostId(id)
                .build();

        return stub.hostJoin(request);
    }

    public addHouseResponse addHouse(String name, String address, int number, String floor,
                                     String location, String code, String capacity, int cost) {
        addHouseRequest request = addHouseRequest
                .newBuilder()
                .setHouse(BnbDefinitions.House
                        .newBuilder()
                        .setHouseName(name)
                        .setHouseAddress(address)
                        .setHouseNumber(number)
                        .setHouseFloor(floor)
                        .setHouseLocation(location)
                        .setHousePostalCode(code)
                        .setHouseCapacity(capacity)
                        .setHouseCost(cost)
                        .build())
                .build();

        return  stub.addHouse(request);
    }

    public removeHouseResponse removeHouse(int id) {
        removeHouseRequest request = removeHouseRequest
                .newBuilder()
                .setHouseId(id)
                .build();

        return stub.removeHouse(request);
    }
}
