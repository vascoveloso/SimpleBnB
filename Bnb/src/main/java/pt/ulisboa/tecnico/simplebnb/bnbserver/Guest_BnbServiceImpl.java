package pt.ulisboa.tecnico.simplebnb.bnbserver;

import io.grpc.stub.StreamObserver;
import pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.*;
import pt.ulisboa.tecnico.simplebnb.contract.guest.guestServiceGrpc;

public class Guest_BnbServiceImpl extends guestServiceGrpc.guestServiceImplBase{
    private final BnBDomain bnBDomain;

    public Guest_BnbServiceImpl(BnBDomain bnBDomain) {
        this.bnBDomain = bnBDomain;
    }

    @Override
    public void guestJoin(guestJoinRequest request, StreamObserver<guestJoinResponse> responseObserver) {
        if(bnBDomain.guestJoin(request.getGuestName(), request.getGuestId()) == -1){
            responseObserver.onNext(guestJoinResponse
                    .newBuilder()
                    .setGuestId(-1)
                    .build());
        }
        else{
            responseObserver.onNext(guestJoinResponse
                    .newBuilder()
                    .setGuestId(request.getGuestId())
                    .build());
        }

        responseObserver.onCompleted();
    }

    @Override
    public void listAll(listAllRequest request, StreamObserver<listAllResponse> responseObserver) {
        responseObserver.onNext(bnBDomain.listAll());
        responseObserver.onCompleted();
    }

    @Override
    public void filterBy(filterByRequest request, StreamObserver<filterByResponse> responseObserver) {
        responseObserver.onNext(bnBDomain.filterBy(request.getGuestFilter(), request.getGuestValue()));
        responseObserver.onCompleted();
    }

    @Override
    public void bookHouse(bookHouseRequest request, StreamObserver<bookHouseResponse> responseObserver){

    }
}
