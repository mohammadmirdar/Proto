// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: InternalUpdateRoom.proto

package net.iGap.proto.updateQueue.core;

public final class ProtoInternalUpdateRoom {
  private ProtoInternalUpdateRoom() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface InternalUpdateRoomOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.updatequeue.InternalUpdateRoom)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional uint64 sender_user_id = 1;</code>
     */
    long getSenderUserId();

    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    long getRoomId();

    /**
     * <code>optional string class_name = 3;</code>
     */
    java.lang.String getClassName();
    /**
     * <code>optional string class_name = 3;</code>
     */
    com.google.protobuf.ByteString
        getClassNameBytes();

    /**
     * <code>optional uint64 action_id = 4;</code>
     */
    long getActionId();

    /**
     * <code>optional string request_id = 5;</code>
     */
    java.lang.String getRequestId();
    /**
     * <code>optional string request_id = 5;</code>
     */
    com.google.protobuf.ByteString
        getRequestIdBytes();

    /**
     * <code>optional bytes wrapped_proto = 6;</code>
     */
    com.google.protobuf.ByteString getWrappedProto();

    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    java.lang.String getSenderSessionId();
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    com.google.protobuf.ByteString
        getSenderSessionIdBytes();

    /**
     * <code>optional uint64 expiration_time = 8;</code>
     */
    long getExpirationTime();
  }
  /**
   * Protobuf type {@code proto.updatequeue.InternalUpdateRoom}
   */
  public  static final class InternalUpdateRoom extends
      com.google.protobuf.GeneratedMessageLite<
          InternalUpdateRoom, InternalUpdateRoom.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.updatequeue.InternalUpdateRoom)
      InternalUpdateRoomOrBuilder {
    private InternalUpdateRoom() {
      className_ = "";
      requestId_ = "";
      wrappedProto_ = com.google.protobuf.ByteString.EMPTY;
      senderSessionId_ = "";
    }
    public static final int SENDER_USER_ID_FIELD_NUMBER = 1;
    private long senderUserId_;
    /**
     * <code>optional uint64 sender_user_id = 1;</code>
     */
    public long getSenderUserId() {
      return senderUserId_;
    }
    /**
     * <code>optional uint64 sender_user_id = 1;</code>
     */
    private void setSenderUserId(long value) {
      
      senderUserId_ = value;
    }
    /**
     * <code>optional uint64 sender_user_id = 1;</code>
     */
    private void clearSenderUserId() {
      
      senderUserId_ = 0L;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 2;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void setRoomId(long value) {
      
      roomId_ = value;
    }
    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    private void clearRoomId() {
      
      roomId_ = 0L;
    }

    public static final int CLASS_NAME_FIELD_NUMBER = 3;
    private java.lang.String className_;
    /**
     * <code>optional string class_name = 3;</code>
     */
    public java.lang.String getClassName() {
      return className_;
    }
    /**
     * <code>optional string class_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getClassNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(className_);
    }
    /**
     * <code>optional string class_name = 3;</code>
     */
    private void setClassName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      className_ = value;
    }
    /**
     * <code>optional string class_name = 3;</code>
     */
    private void clearClassName() {
      
      className_ = getDefaultInstance().getClassName();
    }
    /**
     * <code>optional string class_name = 3;</code>
     */
    private void setClassNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      className_ = value.toStringUtf8();
    }

    public static final int ACTION_ID_FIELD_NUMBER = 4;
    private long actionId_;
    /**
     * <code>optional uint64 action_id = 4;</code>
     */
    public long getActionId() {
      return actionId_;
    }
    /**
     * <code>optional uint64 action_id = 4;</code>
     */
    private void setActionId(long value) {
      
      actionId_ = value;
    }
    /**
     * <code>optional uint64 action_id = 4;</code>
     */
    private void clearActionId() {
      
      actionId_ = 0L;
    }

    public static final int REQUEST_ID_FIELD_NUMBER = 5;
    private java.lang.String requestId_;
    /**
     * <code>optional string request_id = 5;</code>
     */
    public java.lang.String getRequestId() {
      return requestId_;
    }
    /**
     * <code>optional string request_id = 5;</code>
     */
    public com.google.protobuf.ByteString
        getRequestIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(requestId_);
    }
    /**
     * <code>optional string request_id = 5;</code>
     */
    private void setRequestId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      requestId_ = value;
    }
    /**
     * <code>optional string request_id = 5;</code>
     */
    private void clearRequestId() {
      
      requestId_ = getDefaultInstance().getRequestId();
    }
    /**
     * <code>optional string request_id = 5;</code>
     */
    private void setRequestIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      requestId_ = value.toStringUtf8();
    }

    public static final int WRAPPED_PROTO_FIELD_NUMBER = 6;
    private com.google.protobuf.ByteString wrappedProto_;
    /**
     * <code>optional bytes wrapped_proto = 6;</code>
     */
    public com.google.protobuf.ByteString getWrappedProto() {
      return wrappedProto_;
    }
    /**
     * <code>optional bytes wrapped_proto = 6;</code>
     */
    private void setWrappedProto(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      wrappedProto_ = value;
    }
    /**
     * <code>optional bytes wrapped_proto = 6;</code>
     */
    private void clearWrappedProto() {
      
      wrappedProto_ = getDefaultInstance().getWrappedProto();
    }

    public static final int SENDER_SESSION_ID_FIELD_NUMBER = 7;
    private java.lang.String senderSessionId_;
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    public java.lang.String getSenderSessionId() {
      return senderSessionId_;
    }
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    public com.google.protobuf.ByteString
        getSenderSessionIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(senderSessionId_);
    }
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    private void setSenderSessionId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      senderSessionId_ = value;
    }
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    private void clearSenderSessionId() {
      
      senderSessionId_ = getDefaultInstance().getSenderSessionId();
    }
    /**
     * <code>optional string sender_session_id = 7;</code>
     */
    private void setSenderSessionIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      senderSessionId_ = value.toStringUtf8();
    }

    public static final int EXPIRATION_TIME_FIELD_NUMBER = 8;
    private long expirationTime_;
    /**
     * <code>optional uint64 expiration_time = 8;</code>
     */
    public long getExpirationTime() {
      return expirationTime_;
    }
    /**
     * <code>optional uint64 expiration_time = 8;</code>
     */
    private void setExpirationTime(long value) {
      
      expirationTime_ = value;
    }
    /**
     * <code>optional uint64 expiration_time = 8;</code>
     */
    private void clearExpirationTime() {
      
      expirationTime_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (senderUserId_ != 0L) {
        output.writeUInt64(1, senderUserId_);
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
      }
      if (!className_.isEmpty()) {
        output.writeString(3, getClassName());
      }
      if (actionId_ != 0L) {
        output.writeUInt64(4, actionId_);
      }
      if (!requestId_.isEmpty()) {
        output.writeString(5, getRequestId());
      }
      if (!wrappedProto_.isEmpty()) {
        output.writeBytes(6, wrappedProto_);
      }
      if (!senderSessionId_.isEmpty()) {
        output.writeString(7, getSenderSessionId());
      }
      if (expirationTime_ != 0L) {
        output.writeUInt64(8, expirationTime_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (senderUserId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, senderUserId_);
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      if (!className_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getClassName());
      }
      if (actionId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, actionId_);
      }
      if (!requestId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getRequestId());
      }
      if (!wrappedProto_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(6, wrappedProto_);
      }
      if (!senderSessionId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(7, getSenderSessionId());
      }
      if (expirationTime_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(8, expirationTime_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.updatequeue.InternalUpdateRoom}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.updatequeue.InternalUpdateRoom)
        net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoomOrBuilder {
      // Construct using net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional uint64 sender_user_id = 1;</code>
       */
      public long getSenderUserId() {
        return instance.getSenderUserId();
      }
      /**
       * <code>optional uint64 sender_user_id = 1;</code>
       */
      public Builder setSenderUserId(long value) {
        copyOnWrite();
        instance.setSenderUserId(value);
        return this;
      }
      /**
       * <code>optional uint64 sender_user_id = 1;</code>
       */
      public Builder clearSenderUserId() {
        copyOnWrite();
        instance.clearSenderUserId();
        return this;
      }

      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public long getRoomId() {
        return instance.getRoomId();
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder setRoomId(long value) {
        copyOnWrite();
        instance.setRoomId(value);
        return this;
      }
      /**
       * <code>optional uint64 room_id = 2;</code>
       */
      public Builder clearRoomId() {
        copyOnWrite();
        instance.clearRoomId();
        return this;
      }

      /**
       * <code>optional string class_name = 3;</code>
       */
      public java.lang.String getClassName() {
        return instance.getClassName();
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getClassNameBytes() {
        return instance.getClassNameBytes();
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public Builder setClassName(
          java.lang.String value) {
        copyOnWrite();
        instance.setClassName(value);
        return this;
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public Builder clearClassName() {
        copyOnWrite();
        instance.clearClassName();
        return this;
      }
      /**
       * <code>optional string class_name = 3;</code>
       */
      public Builder setClassNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setClassNameBytes(value);
        return this;
      }

      /**
       * <code>optional uint64 action_id = 4;</code>
       */
      public long getActionId() {
        return instance.getActionId();
      }
      /**
       * <code>optional uint64 action_id = 4;</code>
       */
      public Builder setActionId(long value) {
        copyOnWrite();
        instance.setActionId(value);
        return this;
      }
      /**
       * <code>optional uint64 action_id = 4;</code>
       */
      public Builder clearActionId() {
        copyOnWrite();
        instance.clearActionId();
        return this;
      }

      /**
       * <code>optional string request_id = 5;</code>
       */
      public java.lang.String getRequestId() {
        return instance.getRequestId();
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public com.google.protobuf.ByteString
          getRequestIdBytes() {
        return instance.getRequestIdBytes();
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public Builder setRequestId(
          java.lang.String value) {
        copyOnWrite();
        instance.setRequestId(value);
        return this;
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public Builder clearRequestId() {
        copyOnWrite();
        instance.clearRequestId();
        return this;
      }
      /**
       * <code>optional string request_id = 5;</code>
       */
      public Builder setRequestIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setRequestIdBytes(value);
        return this;
      }

      /**
       * <code>optional bytes wrapped_proto = 6;</code>
       */
      public com.google.protobuf.ByteString getWrappedProto() {
        return instance.getWrappedProto();
      }
      /**
       * <code>optional bytes wrapped_proto = 6;</code>
       */
      public Builder setWrappedProto(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setWrappedProto(value);
        return this;
      }
      /**
       * <code>optional bytes wrapped_proto = 6;</code>
       */
      public Builder clearWrappedProto() {
        copyOnWrite();
        instance.clearWrappedProto();
        return this;
      }

      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public java.lang.String getSenderSessionId() {
        return instance.getSenderSessionId();
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public com.google.protobuf.ByteString
          getSenderSessionIdBytes() {
        return instance.getSenderSessionIdBytes();
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public Builder setSenderSessionId(
          java.lang.String value) {
        copyOnWrite();
        instance.setSenderSessionId(value);
        return this;
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public Builder clearSenderSessionId() {
        copyOnWrite();
        instance.clearSenderSessionId();
        return this;
      }
      /**
       * <code>optional string sender_session_id = 7;</code>
       */
      public Builder setSenderSessionIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setSenderSessionIdBytes(value);
        return this;
      }

      /**
       * <code>optional uint64 expiration_time = 8;</code>
       */
      public long getExpirationTime() {
        return instance.getExpirationTime();
      }
      /**
       * <code>optional uint64 expiration_time = 8;</code>
       */
      public Builder setExpirationTime(long value) {
        copyOnWrite();
        instance.setExpirationTime(value);
        return this;
      }
      /**
       * <code>optional uint64 expiration_time = 8;</code>
       */
      public Builder clearExpirationTime() {
        copyOnWrite();
        instance.clearExpirationTime();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.updatequeue.InternalUpdateRoom)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom();
        }
        case IS_INITIALIZED: {
          return DEFAULT_INSTANCE;
        }
        case MAKE_IMMUTABLE: {
          return null;
        }
        case NEW_BUILDER: {
          return new Builder();
        }
        case VISIT: {
          Visitor visitor = (Visitor) arg0;
          net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom other = (net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom) arg1;
          senderUserId_ = visitor.visitLong(senderUserId_ != 0L, senderUserId_,
              other.senderUserId_ != 0L, other.senderUserId_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
          className_ = visitor.visitString(!className_.isEmpty(), className_,
              !other.className_.isEmpty(), other.className_);
          actionId_ = visitor.visitLong(actionId_ != 0L, actionId_,
              other.actionId_ != 0L, other.actionId_);
          requestId_ = visitor.visitString(!requestId_.isEmpty(), requestId_,
              !other.requestId_.isEmpty(), other.requestId_);
          wrappedProto_ = visitor.visitByteString(wrappedProto_ != com.google.protobuf.ByteString.EMPTY, wrappedProto_,
              other.wrappedProto_ != com.google.protobuf.ByteString.EMPTY, other.wrappedProto_);
          senderSessionId_ = visitor.visitString(!senderSessionId_.isEmpty(), senderSessionId_,
              !other.senderSessionId_.isEmpty(), other.senderSessionId_);
          expirationTime_ = visitor.visitLong(expirationTime_ != 0L, expirationTime_,
              other.expirationTime_ != 0L, other.expirationTime_);
          if (visitor == com.google.protobuf.GeneratedMessageLite.MergeFromVisitor
              .INSTANCE) {
          }
          return this;
        }
        case MERGE_FROM_STREAM: {
          com.google.protobuf.CodedInputStream input =
              (com.google.protobuf.CodedInputStream) arg0;
          com.google.protobuf.ExtensionRegistryLite extensionRegistry =
              (com.google.protobuf.ExtensionRegistryLite) arg1;
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
                case 8: {

                  senderUserId_ = input.readUInt64();
                  break;
                }
                case 16: {

                  roomId_ = input.readUInt64();
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  className_ = s;
                  break;
                }
                case 32: {

                  actionId_ = input.readUInt64();
                  break;
                }
                case 42: {
                  String s = input.readStringRequireUtf8();

                  requestId_ = s;
                  break;
                }
                case 50: {

                  wrappedProto_ = input.readBytes();
                  break;
                }
                case 58: {
                  String s = input.readStringRequireUtf8();

                  senderSessionId_ = s;
                  break;
                }
                case 64: {

                  expirationTime_ = input.readUInt64();
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
          }
        }
        case GET_DEFAULT_INSTANCE: {
          return DEFAULT_INSTANCE;
        }
        case GET_PARSER: {
          if (PARSER == null) {    synchronized (net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom.class) {
              if (PARSER == null) {
                PARSER = new DefaultInstanceBasedParser(DEFAULT_INSTANCE);
              }
            }
          }
          return PARSER;
        }
      }
      throw new UnsupportedOperationException();
    }


    // @@protoc_insertion_point(class_scope:proto.updatequeue.InternalUpdateRoom)
    private static final net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new InternalUpdateRoom();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.updateQueue.core.ProtoInternalUpdateRoom.InternalUpdateRoom getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<InternalUpdateRoom> PARSER;

    public static com.google.protobuf.Parser<InternalUpdateRoom> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
