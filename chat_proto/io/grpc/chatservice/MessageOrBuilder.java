// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: chat_proto/chat.proto

package io.grpc.chatservice;

public interface MessageOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chatservice.Message)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string channel = 1;</code>
   */
  java.lang.String getChannel();
  /**
   * <code>optional string channel = 1;</code>
   */
  com.google.protobuf.ByteString
      getChannelBytes();

  /**
   * <code>optional string message = 2;</code>
   */
  java.lang.String getMessage();
  /**
   * <code>optional string message = 2;</code>
   */
  com.google.protobuf.ByteString
      getMessageBytes();

  /**
   * <code>optional string clientKey = 3;</code>
   */
  java.lang.String getClientKey();
  /**
   * <code>optional string clientKey = 3;</code>
   */
  com.google.protobuf.ByteString
      getClientKeyBytes();
}
