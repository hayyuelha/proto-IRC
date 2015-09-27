package io.grpc.chatservice;

import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;

@javax.annotation.Generated("by gRPC proto compiler")
public class ChatServiceGrpc {

  private ChatServiceGrpc() {}

  public static final String SERVICE_NAME = "chatservice.ChatService";

  // Static method descriptors that strictly reflect the proto.
  public static final io.grpc.MethodDescriptor<io.grpc.chatservice.User,
      io.grpc.chatservice.User> METHOD_NICK =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "chatservice.ChatService", "nick"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.User.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.User.getDefaultInstance()));
  public static final io.grpc.MethodDescriptor<io.grpc.chatservice.Channel,
      io.grpc.chatservice.Channel> METHOD_JOIN =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "chatservice.ChatService", "join"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.Channel.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.Channel.getDefaultInstance()));
  public static final io.grpc.MethodDescriptor<io.grpc.chatservice.Channel,
      io.grpc.chatservice.Channel> METHOD_LEAVE =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "chatservice.ChatService", "leave"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.Channel.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.Channel.getDefaultInstance()));
  public static final io.grpc.MethodDescriptor<io.grpc.chatservice.User,
      io.grpc.chatservice.User> METHOD_EXIT =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "chatservice.ChatService", "exit"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.User.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.User.getDefaultInstance()));
  public static final io.grpc.MethodDescriptor<io.grpc.chatservice.User,
      io.grpc.chatservice.Message> METHOD_GET_MESSAGES =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.SERVER_STREAMING,
          generateFullMethodName(
              "chatservice.ChatService", "getMessages"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.User.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.Message.getDefaultInstance()));
  public static final io.grpc.MethodDescriptor<io.grpc.chatservice.Message,
      io.grpc.chatservice.Message> METHOD_SEND =
      io.grpc.MethodDescriptor.create(
          io.grpc.MethodDescriptor.MethodType.UNARY,
          generateFullMethodName(
              "chatservice.ChatService", "send"),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.Message.getDefaultInstance()),
          io.grpc.protobuf.ProtoUtils.marshaller(io.grpc.chatservice.Message.getDefaultInstance()));

  public static ChatServiceStub newStub(io.grpc.Channel channel) {
    return new ChatServiceStub(channel);
  }

  public static ChatServiceBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    return new ChatServiceBlockingStub(channel);
  }

  public static ChatServiceFutureStub newFutureStub(
      io.grpc.Channel channel) {
    return new ChatServiceFutureStub(channel);
  }

  public static interface ChatService {

    public void nick(io.grpc.chatservice.User request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.User> responseObserver);

    public void join(io.grpc.chatservice.Channel request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Channel> responseObserver);

    public void leave(io.grpc.chatservice.Channel request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Channel> responseObserver);

    public void exit(io.grpc.chatservice.User request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.User> responseObserver);

    public void getMessages(io.grpc.chatservice.User request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Message> responseObserver);

    public void send(io.grpc.chatservice.Message request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Message> responseObserver);
  }

  public static interface ChatServiceBlockingClient {

    public io.grpc.chatservice.User nick(io.grpc.chatservice.User request);

    public io.grpc.chatservice.Channel join(io.grpc.chatservice.Channel request);

    public io.grpc.chatservice.Channel leave(io.grpc.chatservice.Channel request);

    public io.grpc.chatservice.User exit(io.grpc.chatservice.User request);

    public java.util.Iterator<io.grpc.chatservice.Message> getMessages(
        io.grpc.chatservice.User request);

    public io.grpc.chatservice.Message send(io.grpc.chatservice.Message request);
  }

  public static interface ChatServiceFutureClient {

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.User> nick(
        io.grpc.chatservice.User request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.Channel> join(
        io.grpc.chatservice.Channel request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.Channel> leave(
        io.grpc.chatservice.Channel request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.User> exit(
        io.grpc.chatservice.User request);

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.Message> send(
        io.grpc.chatservice.Message request);
  }

  public static class ChatServiceStub extends io.grpc.stub.AbstractStub<ChatServiceStub>
      implements ChatService {
    private ChatServiceStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceStub(channel, callOptions);
    }

    public void nick(io.grpc.chatservice.User request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_NICK, getCallOptions()), request, responseObserver);
    }

    public void join(io.grpc.chatservice.Channel request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Channel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request, responseObserver);
    }

    public void leave(io.grpc.chatservice.Channel request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Channel> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request, responseObserver);
    }

    public void exit(io.grpc.chatservice.User request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.User> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_EXIT, getCallOptions()), request, responseObserver);
    }

    public void getMessages(io.grpc.chatservice.User request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Message> responseObserver) {
      asyncServerStreamingCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request, responseObserver);
    }

    public void send(io.grpc.chatservice.Message request,
        io.grpc.stub.StreamObserver<io.grpc.chatservice.Message> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request, responseObserver);
    }
  }

  public static class ChatServiceBlockingStub extends io.grpc.stub.AbstractStub<ChatServiceBlockingStub>
      implements ChatServiceBlockingClient {
    private ChatServiceBlockingStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceBlockingStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceBlockingStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceBlockingStub(channel, callOptions);
    }

    public io.grpc.chatservice.User nick(io.grpc.chatservice.User request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_NICK, getCallOptions()), request);
    }

    public io.grpc.chatservice.Channel join(io.grpc.chatservice.Channel request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    public io.grpc.chatservice.Channel leave(io.grpc.chatservice.Channel request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    public io.grpc.chatservice.User exit(io.grpc.chatservice.User request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_EXIT, getCallOptions()), request);
    }

    public java.util.Iterator<io.grpc.chatservice.Message> getMessages(
        io.grpc.chatservice.User request) {
      return blockingServerStreamingCall(
          getChannel().newCall(METHOD_GET_MESSAGES, getCallOptions()), request);
    }

    public io.grpc.chatservice.Message send(io.grpc.chatservice.Message request) {
      return blockingUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request);
    }
  }

  public static class ChatServiceFutureStub extends io.grpc.stub.AbstractStub<ChatServiceFutureStub>
      implements ChatServiceFutureClient {
    private ChatServiceFutureStub(io.grpc.Channel channel) {
      super(channel);
    }

    private ChatServiceFutureStub(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected ChatServiceFutureStub build(io.grpc.Channel channel,
        io.grpc.CallOptions callOptions) {
      return new ChatServiceFutureStub(channel, callOptions);
    }

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.User> nick(
        io.grpc.chatservice.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_NICK, getCallOptions()), request);
    }

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.Channel> join(
        io.grpc.chatservice.Channel request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_JOIN, getCallOptions()), request);
    }

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.Channel> leave(
        io.grpc.chatservice.Channel request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_LEAVE, getCallOptions()), request);
    }

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.User> exit(
        io.grpc.chatservice.User request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_EXIT, getCallOptions()), request);
    }

    public com.google.common.util.concurrent.ListenableFuture<io.grpc.chatservice.Message> send(
        io.grpc.chatservice.Message request) {
      return futureUnaryCall(
          getChannel().newCall(METHOD_SEND, getCallOptions()), request);
    }
  }

  public static io.grpc.ServerServiceDefinition bindService(
      final ChatService serviceImpl) {
    return io.grpc.ServerServiceDefinition.builder(SERVICE_NAME)
      .addMethod(
        METHOD_NICK,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.chatservice.User,
              io.grpc.chatservice.User>() {
            public void invoke(
                io.grpc.chatservice.User request,
                io.grpc.stub.StreamObserver<io.grpc.chatservice.User> responseObserver) {
              serviceImpl.nick(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_JOIN,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.chatservice.Channel,
              io.grpc.chatservice.Channel>() {
            public void invoke(
                io.grpc.chatservice.Channel request,
                io.grpc.stub.StreamObserver<io.grpc.chatservice.Channel> responseObserver) {
              serviceImpl.join(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_LEAVE,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.chatservice.Channel,
              io.grpc.chatservice.Channel>() {
            public void invoke(
                io.grpc.chatservice.Channel request,
                io.grpc.stub.StreamObserver<io.grpc.chatservice.Channel> responseObserver) {
              serviceImpl.leave(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_EXIT,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.chatservice.User,
              io.grpc.chatservice.User>() {
            public void invoke(
                io.grpc.chatservice.User request,
                io.grpc.stub.StreamObserver<io.grpc.chatservice.User> responseObserver) {
              serviceImpl.exit(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_GET_MESSAGES,
        asyncServerStreamingCall(
          new io.grpc.stub.ServerCalls.ServerStreamingMethod<
              io.grpc.chatservice.User,
              io.grpc.chatservice.Message>() {
            public void invoke(
                io.grpc.chatservice.User request,
                io.grpc.stub.StreamObserver<io.grpc.chatservice.Message> responseObserver) {
              serviceImpl.getMessages(request, responseObserver);
            }
          }))
      .addMethod(
        METHOD_SEND,
        asyncUnaryCall(
          new io.grpc.stub.ServerCalls.UnaryMethod<
              io.grpc.chatservice.Message,
              io.grpc.chatservice.Message>() {
            public void invoke(
                io.grpc.chatservice.Message request,
                io.grpc.stub.StreamObserver<io.grpc.chatservice.Message> responseObserver) {
              serviceImpl.send(request, responseObserver);
            }
          })).build();
  }
}
