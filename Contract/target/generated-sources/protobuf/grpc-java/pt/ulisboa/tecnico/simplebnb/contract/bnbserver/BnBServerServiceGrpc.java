package pt.ulisboa.tecnico.simplebnb.contract.bnbserver;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: BnbServer_bnbserver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class BnBServerServiceGrpc {

  private BnBServerServiceGrpc() {}

  public static final String SERVICE_NAME = "pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnBServerService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest,
      pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse> getPropagateStateMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "propagateState",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest,
      pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse> getPropagateStateMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest, pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse> getPropagateStateMethod;
    if ((getPropagateStateMethod = BnBServerServiceGrpc.getPropagateStateMethod) == null) {
      synchronized (BnBServerServiceGrpc.class) {
        if ((getPropagateStateMethod = BnBServerServiceGrpc.getPropagateStateMethod) == null) {
          BnBServerServiceGrpc.getPropagateStateMethod = getPropagateStateMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest, pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "propagateState"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse.getDefaultInstance()))
              .setSchemaDescriptor(new BnBServerServiceMethodDescriptorSupplier("propagateState"))
              .build();
        }
      }
    }
    return getPropagateStateMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static BnBServerServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BnBServerServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BnBServerServiceStub>() {
        @java.lang.Override
        public BnBServerServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BnBServerServiceStub(channel, callOptions);
        }
      };
    return BnBServerServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static BnBServerServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BnBServerServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BnBServerServiceBlockingStub>() {
        @java.lang.Override
        public BnBServerServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BnBServerServiceBlockingStub(channel, callOptions);
        }
      };
    return BnBServerServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static BnBServerServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<BnBServerServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<BnBServerServiceFutureStub>() {
        @java.lang.Override
        public BnBServerServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new BnBServerServiceFutureStub(channel, callOptions);
        }
      };
    return BnBServerServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class BnBServerServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void propagateState(pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getPropagateStateMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPropagateStateMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest,
                pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse>(
                  this, METHODID_PROPAGATE_STATE)))
          .build();
    }
  }

  /**
   */
  public static final class BnBServerServiceStub extends io.grpc.stub.AbstractAsyncStub<BnBServerServiceStub> {
    private BnBServerServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BnBServerServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BnBServerServiceStub(channel, callOptions);
    }

    /**
     */
    public void propagateState(pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getPropagateStateMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class BnBServerServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<BnBServerServiceBlockingStub> {
    private BnBServerServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BnBServerServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BnBServerServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse propagateState(pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getPropagateStateMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class BnBServerServiceFutureStub extends io.grpc.stub.AbstractFutureStub<BnBServerServiceFutureStub> {
    private BnBServerServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected BnBServerServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new BnBServerServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse> propagateState(
        pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getPropagateStateMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PROPAGATE_STATE = 0;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final BnBServerServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(BnBServerServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PROPAGATE_STATE:
          serviceImpl.propagateState((pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.PropagateStateResponse>) responseObserver);
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

  private static abstract class BnBServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    BnBServerServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ulisboa.tecnico.simplebnb.contract.bnbserver.BnbServerBnbserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("BnBServerService");
    }
  }

  private static final class BnBServerServiceFileDescriptorSupplier
      extends BnBServerServiceBaseDescriptorSupplier {
    BnBServerServiceFileDescriptorSupplier() {}
  }

  private static final class BnBServerServiceMethodDescriptorSupplier
      extends BnBServerServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    BnBServerServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (BnBServerServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new BnBServerServiceFileDescriptorSupplier())
              .addMethod(getPropagateStateMethod())
              .build();
        }
      }
    }
    return result;
  }
}
