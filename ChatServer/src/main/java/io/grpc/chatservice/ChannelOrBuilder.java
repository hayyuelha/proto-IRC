// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoExercise/chat_proto/chat.proto

package main.java.io.grpc.chatservice;

public interface ChannelOrBuilder extends
    // @@protoc_insertion_point(interface_extends:chatservice.Channel)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>optional string channelName = 1;</code>
   */
  java.lang.String getChannelName();
  /**
   * <code>optional string channelName = 1;</code>
   */
  com.google.protobuf.ByteString
      getChannelNameBytes();

  /**
   * <code>repeated .chatservice.User users = 2;</code>
   */
  java.util.List<main.java.io.grpc.chatservice.User> 
      getUsersList();
  /**
   * <code>repeated .chatservice.User users = 2;</code>
   */
  main.java.io.grpc.chatservice.User getUsers(int index);
  /**
   * <code>repeated .chatservice.User users = 2;</code>
   */
  int getUsersCount();
  /**
   * <code>repeated .chatservice.User users = 2;</code>
   */
  java.util.List<? extends main.java.io.grpc.chatservice.UserOrBuilder> 
      getUsersOrBuilderList();
  /**
   * <code>repeated .chatservice.User users = 2;</code>
   */
  main.java.io.grpc.chatservice.UserOrBuilder getUsersOrBuilder(
      int index);
}
