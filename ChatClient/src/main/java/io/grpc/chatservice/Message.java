// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoExercise/chat_proto/chat.proto

package main.java.io.grpc.chatservice;

/**
 * Protobuf type {@code chatservice.Message}
 */
public  final class Message extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chatservice.Message)
    MessageOrBuilder {
  // Use Message.newBuilder() to construct.
  private Message(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private Message() {
    channel_ = "";
    message_ = "";
    clientKey_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private Message(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry) {
    this();
    int mutable_bitField0_ = 0;
    try {
      boolean done = false;
      while (!done) {
        int tag = input.readTag();
        switch (tag) {
          case 0:
            done = true;
            break;
          default: {
            if (!input.skipField(tag)) {
              done = true;
            }
            break;
          }
          case 10: {
            String s = input.readStringRequireUtf8();

            channel_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            message_ = s;
            break;
          }
          case 26: {
            String s = input.readStringRequireUtf8();

            clientKey_ = s;
            break;
          }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw new RuntimeException(e.setUnfinishedMessage(this));
    } catch (java.io.IOException e) {
      throw new RuntimeException(
          new com.google.protobuf.InvalidProtocolBufferException(
              e.getMessage()).setUnfinishedMessage(this));
    } finally {
      makeExtensionsImmutable();
    }
  }
  public static final com.google.protobuf.Descriptors.Descriptor
      getDescriptor() {
    return main.java.io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_Message_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return main.java.io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_Message_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            main.java.io.grpc.chatservice.Message.class, main.java.io.grpc.chatservice.Message.Builder.class);
  }

  public static final int CHANNEL_FIELD_NUMBER = 1;
  private volatile java.lang.Object channel_;
  /**
   * <code>optional string channel = 1;</code>
   */
  public java.lang.String getChannel() {
    java.lang.Object ref = channel_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      channel_ = s;
      return s;
    }
  }
  /**
   * <code>optional string channel = 1;</code>
   */
  public com.google.protobuf.ByteString
      getChannelBytes() {
    java.lang.Object ref = channel_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      channel_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 2;
  private volatile java.lang.Object message_;
  /**
   * <code>optional string message = 2;</code>
   */
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   * <code>optional string message = 2;</code>
   */
  public com.google.protobuf.ByteString
      getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLIENTKEY_FIELD_NUMBER = 3;
  private volatile java.lang.Object clientKey_;
  /**
   * <code>optional string clientKey = 3;</code>
   */
  public java.lang.String getClientKey() {
    java.lang.Object ref = clientKey_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      clientKey_ = s;
      return s;
    }
  }
  /**
   * <code>optional string clientKey = 3;</code>
   */
  public com.google.protobuf.ByteString
      getClientKeyBytes() {
    java.lang.Object ref = clientKey_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      clientKey_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  public void writeTo(com.google.protobuf.CodedOutputStream output)
                      throws java.io.IOException {
    if (!getChannelBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, channel_);
    }
    if (!getMessageBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, message_);
    }
    if (!getClientKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 3, clientKey_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getChannelBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, channel_);
    }
    if (!getMessageBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, message_);
    }
    if (!getClientKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(3, clientKey_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static main.java.io.grpc.chatservice.Message parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static main.java.io.grpc.chatservice.Message parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static main.java.io.grpc.chatservice.Message parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static main.java.io.grpc.chatservice.Message parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static main.java.io.grpc.chatservice.Message parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static main.java.io.grpc.chatservice.Message parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static main.java.io.grpc.chatservice.Message parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static main.java.io.grpc.chatservice.Message parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static main.java.io.grpc.chatservice.Message parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static main.java.io.grpc.chatservice.Message parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(main.java.io.grpc.chatservice.Message prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE
        ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(
      com.google.protobuf.GeneratedMessage.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   * Protobuf type {@code chatservice.Message}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chatservice.Message)
      main.java.io.grpc.chatservice.MessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return main.java.io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_Message_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return main.java.io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_Message_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              main.java.io.grpc.chatservice.Message.class, main.java.io.grpc.chatservice.Message.Builder.class);
    }

    // Construct using main.java.io.grpc.chatservice.Message.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(
        com.google.protobuf.GeneratedMessage.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }
    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessage.alwaysUseFieldBuilders) {
      }
    }
    public Builder clear() {
      super.clear();
      channel_ = "";

      message_ = "";

      clientKey_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return main.java.io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_Message_descriptor;
    }

    public main.java.io.grpc.chatservice.Message getDefaultInstanceForType() {
      return main.java.io.grpc.chatservice.Message.getDefaultInstance();
    }

    public main.java.io.grpc.chatservice.Message build() {
      main.java.io.grpc.chatservice.Message result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public main.java.io.grpc.chatservice.Message buildPartial() {
      main.java.io.grpc.chatservice.Message result = new main.java.io.grpc.chatservice.Message(this);
      result.channel_ = channel_;
      result.message_ = message_;
      result.clientKey_ = clientKey_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof main.java.io.grpc.chatservice.Message) {
        return mergeFrom((main.java.io.grpc.chatservice.Message)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(main.java.io.grpc.chatservice.Message other) {
      if (other == main.java.io.grpc.chatservice.Message.getDefaultInstance()) return this;
      if (!other.getChannel().isEmpty()) {
        channel_ = other.channel_;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        onChanged();
      }
      if (!other.getClientKey().isEmpty()) {
        clientKey_ = other.clientKey_;
        onChanged();
      }
      onChanged();
      return this;
    }

    public final boolean isInitialized() {
      return true;
    }

    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      main.java.io.grpc.chatservice.Message parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (main.java.io.grpc.chatservice.Message) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object channel_ = "";
    /**
     * <code>optional string channel = 1;</code>
     */
    public java.lang.String getChannel() {
      java.lang.Object ref = channel_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        channel_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public com.google.protobuf.ByteString
        getChannelBytes() {
      java.lang.Object ref = channel_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        channel_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public Builder setChannel(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      channel_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public Builder clearChannel() {
      
      channel_ = getDefaultInstance().getChannel();
      onChanged();
      return this;
    }
    /**
     * <code>optional string channel = 1;</code>
     */
    public Builder setChannelBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      channel_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     * <code>optional string message = 2;</code>
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string message = 2;</code>
     */
    public com.google.protobuf.ByteString
        getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string message = 2;</code>
     */
    public Builder setMessage(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      message_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 2;</code>
     */
    public Builder clearMessage() {
      
      message_ = getDefaultInstance().getMessage();
      onChanged();
      return this;
    }
    /**
     * <code>optional string message = 2;</code>
     */
    public Builder setMessageBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      message_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object clientKey_ = "";
    /**
     * <code>optional string clientKey = 3;</code>
     */
    public java.lang.String getClientKey() {
      java.lang.Object ref = clientKey_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        clientKey_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string clientKey = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClientKeyBytes() {
      java.lang.Object ref = clientKey_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        clientKey_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string clientKey = 3;</code>
     */
    public Builder setClientKey(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      clientKey_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string clientKey = 3;</code>
     */
    public Builder clearClientKey() {
      
      clientKey_ = getDefaultInstance().getClientKey();
      onChanged();
      return this;
    }
    /**
     * <code>optional string clientKey = 3;</code>
     */
    public Builder setClientKeyBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      clientKey_ = value;
      onChanged();
      return this;
    }
    public final Builder setUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }

    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return this;
    }


    // @@protoc_insertion_point(builder_scope:chatservice.Message)
  }

  // @@protoc_insertion_point(class_scope:chatservice.Message)
  private static final main.java.io.grpc.chatservice.Message DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new main.java.io.grpc.chatservice.Message();
  }

  public static main.java.io.grpc.chatservice.Message getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Message>
      PARSER = new com.google.protobuf.AbstractParser<Message>() {
    public Message parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new Message(input, extensionRegistry);
      } catch (RuntimeException e) {
        if (e.getCause() instanceof
            com.google.protobuf.InvalidProtocolBufferException) {
          throw (com.google.protobuf.InvalidProtocolBufferException)
              e.getCause();
        }
        throw e;
      }
    }
  };

  public static com.google.protobuf.Parser<Message> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Message> getParserForType() {
    return PARSER;
  }

  public main.java.io.grpc.chatservice.Message getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

