package pt.ulisboa.tecnico.simplebnb.bnbserver;

import io.grpc.stub.StreamObserver;
import pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.*;
import pt.ulisboa.tecnico.simplebnb.contract.host.HostServiceGrpc;

public class Host_BnbServiceImpl  extends
HostServiceGrpc.HostServiceImplBase {
    private final BnBDomain bnBDomain;

    public Host_BnbServiceImpl(BnBDomain bnBDomain) {
        this.bnBDomain = bnBDomain;
    }

    @Override
    public void hostJoin(HostJoinRequest request, StreamObserver<HostJoinResponse> responseObserver) {
        int newId = bnBDomain.hostJoin(request.getHostName(), request.getHostId());
        if(newId == -1) {
            responseObserver.onNext(HostJoinResponse
                    .newBuilder()
                    .setHostId(-1)
                    .build());
        }
        else{
            responseObserver.onNext(HostJoinResponse
                    .newBuilder()
                    .setHostId(newId)
                    .build());
        }
        responseObserver.onCompleted();
    }

    @Override
    public void addHouse(addHouseRequest request, StreamObserver<addHouseResponse> responseObserver) {
        int newId = bnBDomain.addHouse(request.getHouse());

        responseObserver.onNext(addHouseResponse
                .newBuilder()
                .setHouseId(newId)
                .build());
        responseObserver.onCompleted();
    }

    @Override
    public void removeHouse(removeHouseRequest request, StreamObserver<removeHouseResponse> responseObserver) {
        int check = bnBDomain.removeHouse(request.getHouseId());
        responseObserver.onNext(removeHouseResponse
                .newBuilder()
                .setCheck(check)
                .build());
        responseObserver.onCompleted();
    }
}
