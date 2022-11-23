package pt.ulisboa.tecnico.simplebnb.contract.host;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.44.1)",
    comments = "Source: Host_bnbserver.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class HostServiceGrpc {

  private HostServiceGrpc() {}

  public static final String SERVICE_NAME = "pt.ulisboa.tecnico.simplebnb.contract.host.HostService";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest,
      pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse> getHostJoinMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "hostJoin",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest,
      pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse> getHostJoinMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest, pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse> getHostJoinMethod;
    if ((getHostJoinMethod = HostServiceGrpc.getHostJoinMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getHostJoinMethod = HostServiceGrpc.getHostJoinMethod) == null) {
          HostServiceGrpc.getHostJoinMethod = getHostJoinMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest, pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "hostJoin"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("hostJoin"))
              .build();
        }
      }
    }
    return getHostJoinMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest,
      pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse> getAddHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "addHouse",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest,
      pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse> getAddHouseMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest, pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse> getAddHouseMethod;
    if ((getAddHouseMethod = HostServiceGrpc.getAddHouseMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getAddHouseMethod = HostServiceGrpc.getAddHouseMethod) == null) {
          HostServiceGrpc.getAddHouseMethod = getAddHouseMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest, pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "addHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("addHouse"))
              .build();
        }
      }
    }
    return getAddHouseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest,
      pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse> getRemoveHouseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "removeHouse",
      requestType = pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest.class,
      responseType = pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest,
      pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse> getRemoveHouseMethod() {
    io.grpc.MethodDescriptor<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest, pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse> getRemoveHouseMethod;
    if ((getRemoveHouseMethod = HostServiceGrpc.getRemoveHouseMethod) == null) {
      synchronized (HostServiceGrpc.class) {
        if ((getRemoveHouseMethod = HostServiceGrpc.getRemoveHouseMethod) == null) {
          HostServiceGrpc.getRemoveHouseMethod = getRemoveHouseMethod =
              io.grpc.MethodDescriptor.<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest, pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "removeHouse"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HostServiceMethodDescriptorSupplier("removeHouse"))
              .build();
        }
      }
    }
    return getRemoveHouseMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HostServiceStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HostServiceStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HostServiceStub>() {
        @java.lang.Override
        public HostServiceStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HostServiceStub(channel, callOptions);
        }
      };
    return HostServiceStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HostServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HostServiceBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HostServiceBlockingStub>() {
        @java.lang.Override
        public HostServiceBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HostServiceBlockingStub(channel, callOptions);
        }
      };
    return HostServiceBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HostServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HostServiceFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HostServiceFutureStub>() {
        @java.lang.Override
        public HostServiceFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HostServiceFutureStub(channel, callOptions);
        }
      };
    return HostServiceFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HostServiceImplBase implements io.grpc.BindableService {

    /**
     */
    public void hostJoin(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getHostJoinMethod(), responseObserver);
    }

    /**
     */
    public void addHouse(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getAddHouseMethod(), responseObserver);
    }

    /**
     */
    public void removeHouse(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse> responseObserver) {
      io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall(getRemoveHouseMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getHostJoinMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest,
                pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse>(
                  this, METHODID_HOST_JOIN)))
          .addMethod(
            getAddHouseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest,
                pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse>(
                  this, METHODID_ADD_HOUSE)))
          .addMethod(
            getRemoveHouseMethod(),
            io.grpc.stub.ServerCalls.asyncUnaryCall(
              new MethodHandlers<
                pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest,
                pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse>(
                  this, METHODID_REMOVE_HOUSE)))
          .build();
    }
  }

  /**
   */
  public static final class HostServiceStub extends io.grpc.stub.AbstractAsyncStub<HostServiceStub> {
    private HostServiceStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostServiceStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HostServiceStub(channel, callOptions);
    }

    /**
     */
    public void hostJoin(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getHostJoinMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void addHouse(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getAddHouseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void removeHouse(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest request,
        io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse> responseObserver) {
      io.grpc.stub.ClientCalls.asyncUnaryCall(
          getChannel().newCall(getRemoveHouseMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HostServiceBlockingStub extends io.grpc.stub.AbstractBlockingStub<HostServiceBlockingStub> {
    private HostServiceBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostServiceBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HostServiceBlockingStub(channel, callOptions);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse hostJoin(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getHostJoinMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse addHouse(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getAddHouseMethod(), getCallOptions(), request);
    }

    /**
     */
    public pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse removeHouse(pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest request) {
      return io.grpc.stub.ClientCalls.blockingUnaryCall(
          getChannel(), getRemoveHouseMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HostServiceFutureStub extends io.grpc.stub.AbstractFutureStub<HostServiceFutureStub> {
    private HostServiceFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HostServiceFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HostServiceFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse> hostJoin(
        pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getHostJoinMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse> addHouse(
        pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getAddHouseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse> removeHouse(
        pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest request) {
      return io.grpc.stub.ClientCalls.futureUnaryCall(
          getChannel().newCall(getRemoveHouseMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_HOST_JOIN = 0;
  private static final int METHODID_ADD_HOUSE = 1;
  private static final int METHODID_REMOVE_HOUSE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HostServiceImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HostServiceImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_HOST_JOIN:
          serviceImpl.hostJoin((pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.HostJoinResponse>) responseObserver);
          break;
        case METHODID_ADD_HOUSE:
          serviceImpl.addHouse((pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.addHouseResponse>) responseObserver);
          break;
        case METHODID_REMOVE_HOUSE:
          serviceImpl.removeHouse((pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseRequest) request,
              (io.grpc.stub.StreamObserver<pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.removeHouseResponse>) responseObserver);
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

  private static abstract class HostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HostServiceBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return pt.ulisboa.tecnico.simplebnb.contract.host.HostBnbserver.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HostService");
    }
  }

  private static final class HostServiceFileDescriptorSupplier
      extends HostServiceBaseDescriptorSupplier {
    HostServiceFileDescriptorSupplier() {}
  }

  private static final class HostServiceMethodDescriptorSupplier
      extends HostServiceBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HostServiceMethodDescriptorSupplier(String methodName) {
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
      synchronized (HostServiceGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HostServiceFileDescriptorSupplier())
              .addMethod(getHostJoinMethod())
              .addMethod(getAddHouseMethod())
              .addMethod(getRemoveHouseMethod())
              .build();
        }
      }
    }
    return result;
  }
}
