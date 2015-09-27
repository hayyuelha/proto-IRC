// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat_proto/chat.proto

package io.grpc.chatservice;

/**
 * Protobuf type {@code chatservice.User}
 */
public  final class User extends
    com.google.protobuf.GeneratedMessage implements
    // @@protoc_insertion_point(message_implements:chatservice.User)
    UserOrBuilder {
  // Use User.newBuilder() to construct.
  private User(com.google.protobuf.GeneratedMessage.Builder<?> builder) {
    super(builder);
  }
  private User() {
    clientKey_ = "";
    nick_ = "";
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return com.google.protobuf.UnknownFieldSet.getDefaultInstance();
  }
  private User(
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

            clientKey_ = s;
            break;
          }
          case 18: {
            String s = input.readStringRequireUtf8();

            nick_ = s;
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
    return io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_User_descriptor;
  }

  protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_User_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            io.grpc.chatservice.User.class, io.grpc.chatservice.User.Builder.class);
  }

  public static final int CLIENTKEY_FIELD_NUMBER = 1;
  private volatile java.lang.Object clientKey_;
  /**
   * <code>optional string clientKey = 1;</code>
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
   * <code>optional string clientKey = 1;</code>
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

  public static final int NICK_FIELD_NUMBER = 2;
  private volatile java.lang.Object nick_;
  /**
   * <code>optional string nick = 2;</code>
   */
  public java.lang.String getNick() {
    java.lang.Object ref = nick_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = 
          (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nick_ = s;
      return s;
    }
  }
  /**
   * <code>optional string nick = 2;</code>
   */
  public com.google.protobuf.ByteString
      getNickBytes() {
    java.lang.Object ref = nick_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b = 
          com.google.protobuf.ByteString.copyFromUtf8(
              (java.lang.String) ref);
      nick_ = b;
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
    if (!getClientKeyBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 1, clientKey_);
    }
    if (!getNickBytes().isEmpty()) {
      com.google.protobuf.GeneratedMessage.writeString(output, 2, nick_);
    }
  }

  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!getClientKeyBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(1, clientKey_);
    }
    if (!getNickBytes().isEmpty()) {
      size += com.google.protobuf.GeneratedMessage.computeStringSize(2, nick_);
    }
    memoizedSize = size;
    return size;
  }

  private static final long serialVersionUID = 0L;
  public static io.grpc.chatservice.User parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.chatservice.User parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.chatservice.User parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static io.grpc.chatservice.User parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static io.grpc.chatservice.User parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.chatservice.User parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }
  public static io.grpc.chatservice.User parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input);
  }
  public static io.grpc.chatservice.User parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseDelimitedFrom(input, extensionRegistry);
  }
  public static io.grpc.chatservice.User parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return PARSER.parseFrom(input);
  }
  public static io.grpc.chatservice.User parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return PARSER.parseFrom(input, extensionRegistry);
  }

  public Builder newBuilderForType() { return newBuilder(); }
  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }
  public static Builder newBuilder(io.grpc.chatservice.User prototype) {
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
   * Protobuf type {@code chatservice.User}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessage.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:chatservice.User)
      io.grpc.chatservice.UserOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_User_descriptor;
    }

    protected com.google.protobuf.GeneratedMessage.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_User_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.grpc.chatservice.User.class, io.grpc.chatservice.User.Builder.class);
    }

    // Construct using io.grpc.chatservice.User.newBuilder()
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
      clientKey_ = "";

      nick_ = "";

      return this;
    }

    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return io.grpc.chatservice.ChatServiceProto.internal_static_chatservice_User_descriptor;
    }

    public io.grpc.chatservice.User getDefaultInstanceForType() {
      return io.grpc.chatservice.User.getDefaultInstance();
    }

    public io.grpc.chatservice.User build() {
      io.grpc.chatservice.User result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    public io.grpc.chatservice.User buildPartial() {
      io.grpc.chatservice.User result = new io.grpc.chatservice.User(this);
      result.clientKey_ = clientKey_;
      result.nick_ = nick_;
      onBuilt();
      return result;
    }

    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof io.grpc.chatservice.User) {
        return mergeFrom((io.grpc.chatservice.User)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(io.grpc.chatservice.User other) {
      if (other == io.grpc.chatservice.User.getDefaultInstance()) return this;
      if (!other.getClientKey().isEmpty()) {
        clientKey_ = other.clientKey_;
        onChanged();
      }
      if (!other.getNick().isEmpty()) {
        nick_ = other.nick_;
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
      io.grpc.chatservice.User parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (io.grpc.chatservice.User) e.getUnfinishedMessage();
        throw e;
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object clientKey_ = "";
    /**
     * <code>optional string clientKey = 1;</code>
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
     * <code>optional string clientKey = 1;</code>
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
     * <code>optional string clientKey = 1;</code>
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
     * <code>optional string clientKey = 1;</code>
     */
    public Builder clearClientKey() {
      
      clientKey_ = getDefaultInstance().getClientKey();
      onChanged();
      return this;
    }
    /**
     * <code>optional string clientKey = 1;</code>
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

    private java.lang.Object nick_ = "";
    /**
     * <code>optional string nick = 2;</code>
     */
    public java.lang.String getNick() {
      java.lang.Object ref = nick_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs =
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nick_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     * <code>optional string nick = 2;</code>
     */
    public com.google.protobuf.ByteString
        getNickBytes() {
      java.lang.Object ref = nick_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        nick_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     * <code>optional string nick = 2;</code>
     */
    public Builder setNick(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      nick_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>optional string nick = 2;</code>
     */
    public Builder clearNick() {
      
      nick_ = getDefaultInstance().getNick();
      onChanged();
      return this;
    }
    /**
     * <code>optional string nick = 2;</code>
     */
    public Builder setNickBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      nick_ = value;
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


    // @@protoc_insertion_point(builder_scope:chatservice.User)
  }

  // @@protoc_insertion_point(class_scope:chatservice.User)
  private static final io.grpc.chatservice.User DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new io.grpc.chatservice.User();
  }

  public static io.grpc.chatservice.User getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<User>
      PARSER = new com.google.protobuf.AbstractParser<User>() {
    public User parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      try {
        return new User(input, extensionRegistry);
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

  public static com.google.protobuf.Parser<User> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<User> getParserForType() {
    return PARSER;
  }

  public io.grpc.chatservice.User getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

