package pt.ulisboa.tecnico.simplebnb.contract.guest;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: Guest_bnbserver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class guestServiceGrpc {

  private guestServiceGrpc() {}

  public static final String SERVICE_NAME = "pt.ulisboa.tecnico.simplebnb.contract.guest.guestService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse> getGuestJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "guestJoin",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse> getGuestJoinMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse> getGuestJoinMethod;
    if ((getGuestJoinMethod = guestServiceGrpc.getGuestJoinMethod) == null) {
      synchronized (guestServiceGrpc.class) {
        if ((getGuestJoinMethod = guestServiceGrpc.getGuestJoinMethod) == null) {
          guestServiceGrpc.getGuestJoinMethod = getGuestJoinMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "guestJoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new guestServiceMethodDescriptorSupplier("guestJoin"))
              .build();
        }
      }
    }
    return getGuestJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse> getListAllMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listAll",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse> getListAllMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse> getListAllMethod;
    if ((getListAllMethod = guestServiceGrpc.getListAllMethod) == null) {
      synchronized (guestServiceGrpc.class) {
        if ((getListAllMethod = guestServiceGrpc.getListAllMethod) == null) {
          guestServiceGrpc.getListAllMethod = getListAllMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listAll"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse.getDefaultInstance()))
              .setSchemaDescriptor(new guestServiceMethodDescriptorSupplier("listAll"))
              .build();
        }
      }
    }
    return getListAllMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse> getFilterByMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "filterBy",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse> getFilterByMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse> getFilterByMethod;
    if ((getFilterByMethod = guestServiceGrpc.getFilterByMethod) == null) {
      synchronized (guestServiceGrpc.class) {
        if ((getFilterByMethod = guestServiceGrpc.getFilterByMethod) == null) {
          guestServiceGrpc.getFilterByMethod = getFilterByMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "filterBy"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse.getDefaultInstance()))
              .setSchemaDescriptor(new guestServiceMethodDescriptorSupplier("filterBy"))
              .build();
        }
      }
    }
    return getFilterByMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse> getBookHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "bookHouse",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest,
      pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse> getBookHouseMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse> getBookHouseMethod;
    if ((getBookHouseMethod = guestServiceGrpc.getBookHouseMethod) == null) {
      synchronized (guestServiceGrpc.class) {
        if ((getBookHouseMethod = guestServiceGrpc.getBookHouseMethod) == null) {
          guestServiceGrpc.getBookHouseMethod = getBookHouseMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest, pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "bookHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new guestServiceMethodDescriptorSupplier("bookHouse"))
              .build();
        }
      }
    }
    return getBookHouseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static guestServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<guestServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<guestServiceStub>() {
        @java.lang.Override
        public guestServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new guestServiceStub(channel, callOptions);
        }
      };
    return guestServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static guestServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<guestServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<guestServiceBlockingStub>() {
        @java.lang.Override
        public guestServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new guestServiceBlockingStub(channel, callOptions);
        }
      };
    return guestServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static guestServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<guestServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<guestServiceFutureStub>() {
        @java.lang.Override
        public guestServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new guestServiceFutureStub(channel, callOptions);
        }
      };
    return guestServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class guestServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void guestJoin(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getGuestJoinMethod(), responseObserver);
    }

    /**
     */
    public void listAll(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getListAllMethod(), responseObserver);
    }

    /**
     */
    public void filterBy(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getFilterByMethod(), responseObserver);
    }

    /**
     */
    public void bookHouse(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getBookHouseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGuestJoinMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest,
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse>(
                  this, METHODID_GUEST_JOIN)))
          .addMethod(
            getListAllMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest,
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse>(
                  this, METHODID_LIST_ALL)))
          .addMethod(
            getFilterByMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest,
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse>(
                  this, METHODID_FILTER_BY)))
          .addMethod(
            getBookHouseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest,
                pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse>(
                  this, METHODID_BOOK_HOUSE)))
          .build();
    }
  }

  /**
   */
  public static final class guestServiceStub extends io.grpc.stub.AbstractAsyncStub<guestServiceStub> {
    private guestServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected guestServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new guestServiceStub(channel, callOptions);
    }

    /**
     */
    public void guestJoin(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getGuestJoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listAll(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getListAllMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void filterBy(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getFilterByMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void bookHouse(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getBookHouseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class guestServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<guestServiceBlockingStub> {
    private guestServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected guestServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new guestServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse guestJoin(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getGuestJoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse listAll(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getListAllMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse filterBy(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getFilterByMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse bookHouse(pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getBookHouseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class guestServiceFutureStub extends io.grpc.stub.AbstractFutureStub<guestServiceFutureStub> {
    private guestServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected guestServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new guestServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse> guestJoin(
        pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getGuestJoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse> listAll(
        pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getListAllMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse> filterBy(
        pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getFilterByMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse> bookHouse(
        pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getBookHouseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GUEST_JOIN = 0;
  private static final int METHODID_LIST_ALL = 1;
  private static final int METHODID_FILTER_BY = 2;
  private static final int METHODID_BOOK_HOUSE = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final guestServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(guestServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GUEST_JOIN:
          serviceImpl.guestJoin((pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.guestJoinResponse>) responseObserver);
          break;
        case METHODID_LIST_ALL:
          serviceImpl.listAll((pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.listAllResponse>) responseObserver);
          break;
        case METHODID_FILTER_BY:
          serviceImpl.filterBy((pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.filterByResponse>) responseObserver);
          break;
        case METHODID_BOOK_HOUSE:
          serviceImpl.bookHouse((pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.bookHouseResponse>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class guestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    guestServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ulisboa.tecnico.simplebnb.contract.guest.GuestBnbserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("guestService");
    }
  }

  private static final class guestServiceFileDescriptorSupplier
      extends guestServiceBaseDescriptorSupplier {
    guestServiceFileDescriptorSupplier() {}
  }

  private static final class guestServiceMethodDescriptorSupplier
      extends guestServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    guestServiceMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (guestServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new guestServiceFileDescriptorSupplier())
              .addMethod(getGuestJoinMethod())
              .addMethod(getListAllMethod())
              .addMethod(getFilterByMethod())
              .addMethod(getBookHouseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
