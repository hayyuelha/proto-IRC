// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: protoExercise/chat_proto/chat.proto

package main.java.io.grpc.chatservice;

public final class ChatServiceProto {
  private ChatServiceProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
  }
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_Message_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chatservice_Message_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_User_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chatservice_User_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_ChannelUser_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chatservice_ChannelUser_fieldAccessorTable;
  static com.google.protobuf.Descriptors.Descriptor
    internal_static_chatservice_Channel_descriptor;
  static
    com.google.protobuf.GeneratedMessage.FieldAccessorTable
      internal_static_chatservice_Channel_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n#protoExercise/chat_proto/chat.proto\022\013c" +
      "hatservice\">\n\007Message\022\017\n\007channel\030\001 \001(\t\022\017" +
      "\n\007message\030\002 \001(\t\022\021\n\tclientKey\030\003 \001(\t\"\'\n\004Us" +
      "er\022\021\n\tclientKey\030\001 \001(\t\022\014\n\004nick\030\002 \001(\t\"5\n\013C" +
      "hannelUser\022\023\n\013channelName\030\001 \001(\t\022\021\n\tclien" +
      "tKey\030\002 \001(\t\"@\n\007Channel\022\023\n\013channelName\030\001 \001" +
      "(\t\022 \n\005users\030\002 \003(\0132\021.chatservice.User2\324\002\n" +
      "\013ChatService\022.\n\004nick\022\021.chatservice.User\032" +
      "\021.chatservice.User\"\000\0228\n\004join\022\030.chatservi" +
      "ce.ChannelUser\032\024.chatservice.Channel\"\000\0229",
      "\n\005leave\022\030.chatservice.ChannelUser\032\024.chat" +
      "service.Channel\"\000\022.\n\004exit\022\021.chatservice." +
      "User\032\021.chatservice.User\"\000\022:\n\013getMessages" +
      "\022\021.chatservice.User\032\024.chatservice.Messag" +
      "e\"\0000\001\0224\n\004send\022\024.chatservice.Message\032\024.ch" +
      "atservice.Message\"\000B3\n\035main.java.io.grpc" +
      ".chatserviceB\020ChatServiceProtoP\001b\006proto3"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_chatservice_Message_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_chatservice_Message_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chatservice_Message_descriptor,
        new java.lang.String[] { "Channel", "Message", "ClientKey", });
    internal_static_chatservice_User_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_chatservice_User_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chatservice_User_descriptor,
        new java.lang.String[] { "ClientKey", "Nick", });
    internal_static_chatservice_ChannelUser_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_chatservice_ChannelUser_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chatservice_ChannelUser_descriptor,
        new java.lang.String[] { "ChannelName", "ClientKey", });
    internal_static_chatservice_Channel_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_chatservice_Channel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessage.FieldAccessorTable(
        internal_static_chatservice_Channel_descriptor,
        new java.lang.String[] { "ChannelName", "Users", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
