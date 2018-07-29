// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientGetRoomMessage.proto

package net.iGap.proto;

public final class ProtoClientGetRoomMessage {
  private ProtoClientGetRoomMessage() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientGetRoomMessageOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientGetRoomMessage)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    boolean hasRequest();
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    net.iGap.proto.ProtoRequest.Request getRequest();

    /**
     * <code>optional uint64 room_id = 2;</code>
     */
    long getRoomId();

    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    long getMessageId();
  }
  /**
   * Protobuf type {@code proto.ClientGetRoomMessage}
   */
  public  static final class ClientGetRoomMessage extends
      com.google.protobuf.GeneratedMessageLite<
          ClientGetRoomMessage, ClientGetRoomMessage.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientGetRoomMessage)
      ClientGetRoomMessageOrBuilder {
    private ClientGetRoomMessage() {
    }
    public static final int REQUEST_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoRequest.Request request_;
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public boolean hasRequest() {
      return request_ != null;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    public net.iGap.proto.ProtoRequest.Request getRequest() {
      return request_ == null ? net.iGap.proto.ProtoRequest.Request.getDefaultInstance() : request_;
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (value == null) {
        throw new NullPointerException();
      }
      request_ = value;
      
      }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void setRequest(
        net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
      request_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
      if (request_ != null &&
          request_ != net.iGap.proto.ProtoRequest.Request.getDefaultInstance()) {
        request_ =
          net.iGap.proto.ProtoRequest.Request.newBuilder(request_).mergeFrom(value).buildPartial();
      } else {
        request_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Request request = 1;</code>
     */
    private void clearRequest() {  request_ = null;
      
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

    public static final int MESSAGE_ID_FIELD_NUMBER = 3;
    private long messageId_;
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    public long getMessageId() {
      return messageId_;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void setMessageId(long value) {
      
      messageId_ = value;
    }
    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    private void clearMessageId() {
      
      messageId_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (roomId_ != 0L) {
        output.writeUInt64(2, roomId_);
      }
      if (messageId_ != 0L) {
        output.writeUInt64(3, messageId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (request_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getRequest());
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, roomId_);
      }
      if (messageId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, messageId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientGetRoomMessage}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientGetRoomMessage)
        net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageOrBuilder {
      // Construct using net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public boolean hasRequest() {
        return instance.hasRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public net.iGap.proto.ProtoRequest.Request getRequest() {
        return instance.getRequest();
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.setRequest(value);
        return this;
        }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder setRequest(
          net.iGap.proto.ProtoRequest.Request.Builder builderForValue) {
        copyOnWrite();
        instance.setRequest(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder mergeRequest(net.iGap.proto.ProtoRequest.Request value) {
        copyOnWrite();
        instance.mergeRequest(value);
        return this;
      }
      /**
       * <code>optional .proto.Request request = 1;</code>
       */
      public Builder clearRequest() {  copyOnWrite();
        instance.clearRequest();
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
       * <code>optional uint64 message_id = 3;</code>
       */
      public long getMessageId() {
        return instance.getMessageId();
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder setMessageId(long value) {
        copyOnWrite();
        instance.setMessageId(value);
        return this;
      }
      /**
       * <code>optional uint64 message_id = 3;</code>
       */
      public Builder clearMessageId() {
        copyOnWrite();
        instance.clearMessageId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientGetRoomMessage)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage();
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
          net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage other = (net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
          messageId_ = visitor.visitLong(messageId_ != 0L, messageId_,
              other.messageId_ != 0L, other.messageId_);
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
                case 10: {
                  net.iGap.proto.ProtoRequest.Request.Builder subBuilder = null;
                  if (request_ != null) {
                    subBuilder = request_.toBuilder();
                  }
                  request_ = input.readMessage(net.iGap.proto.ProtoRequest.Request.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(request_);
                    request_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 16: {

                  roomId_ = input.readUInt64();
                  break;
                }
                case 24: {

                  messageId_ = input.readUInt64();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientGetRoomMessage)
    private static final net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientGetRoomMessage();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessage getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientGetRoomMessage> PARSER;

    public static com.google.protobuf.Parser<ClientGetRoomMessage> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ClientGetRoomMessageResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientGetRoomMessageResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    boolean hasResponse();
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    net.iGap.proto.ProtoResponse.Response getResponse();

    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    boolean hasMessage();
    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    net.iGap.proto.ProtoGlobal.RoomMessage getMessage();
  }
  /**
   * Protobuf type {@code proto.ClientGetRoomMessageResponse}
   */
  public  static final class ClientGetRoomMessageResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ClientGetRoomMessageResponse, ClientGetRoomMessageResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientGetRoomMessageResponse)
      ClientGetRoomMessageResponseOrBuilder {
    private ClientGetRoomMessageResponse() {
    }
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoResponse.Response response_;
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public boolean hasResponse() {
      return response_ != null;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    public net.iGap.proto.ProtoResponse.Response getResponse() {
      return response_ == null ? net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (value == null) {
        throw new NullPointerException();
      }
      response_ = value;
      
      }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void setResponse(
        net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
      response_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
      if (response_ != null &&
          response_ != net.iGap.proto.ProtoResponse.Response.getDefaultInstance()) {
        response_ =
          net.iGap.proto.ProtoResponse.Response.newBuilder(response_).mergeFrom(value).buildPartial();
      } else {
        response_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    private void clearResponse() {  response_ = null;
      
    }

    public static final int MESSAGE_FIELD_NUMBER = 2;
    private net.iGap.proto.ProtoGlobal.RoomMessage message_;
    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    public boolean hasMessage() {
      return message_ != null;
    }
    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    public net.iGap.proto.ProtoGlobal.RoomMessage getMessage() {
      return message_ == null ? net.iGap.proto.ProtoGlobal.RoomMessage.getDefaultInstance() : message_;
    }
    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    private void setMessage(net.iGap.proto.ProtoGlobal.RoomMessage value) {
      if (value == null) {
        throw new NullPointerException();
      }
      message_ = value;
      
      }
    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    private void setMessage(
        net.iGap.proto.ProtoGlobal.RoomMessage.Builder builderForValue) {
      message_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    private void mergeMessage(net.iGap.proto.ProtoGlobal.RoomMessage value) {
      if (message_ != null &&
          message_ != net.iGap.proto.ProtoGlobal.RoomMessage.getDefaultInstance()) {
        message_ =
          net.iGap.proto.ProtoGlobal.RoomMessage.newBuilder(message_).mergeFrom(value).buildPartial();
      } else {
        message_ = value;
      }
      
    }
    /**
     * <code>optional .proto.RoomMessage message = 2;</code>
     */
    private void clearMessage() {  message_ = null;
      
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (message_ != null) {
        output.writeMessage(2, getMessage());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (response_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResponse());
      }
      if (message_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getMessage());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientGetRoomMessageResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientGetRoomMessageResponse)
        net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public boolean hasResponse() {
        return instance.hasResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public net.iGap.proto.ProtoResponse.Response getResponse() {
        return instance.getResponse();
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.setResponse(value);
        return this;
        }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder setResponse(
          net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
        copyOnWrite();
        instance.setResponse(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
        copyOnWrite();
        instance.mergeResponse(value);
        return this;
      }
      /**
       * <code>optional .proto.Response response = 1;</code>
       */
      public Builder clearResponse() {  copyOnWrite();
        instance.clearResponse();
        return this;
      }

      /**
       * <code>optional .proto.RoomMessage message = 2;</code>
       */
      public boolean hasMessage() {
        return instance.hasMessage();
      }
      /**
       * <code>optional .proto.RoomMessage message = 2;</code>
       */
      public net.iGap.proto.ProtoGlobal.RoomMessage getMessage() {
        return instance.getMessage();
      }
      /**
       * <code>optional .proto.RoomMessage message = 2;</code>
       */
      public Builder setMessage(net.iGap.proto.ProtoGlobal.RoomMessage value) {
        copyOnWrite();
        instance.setMessage(value);
        return this;
        }
      /**
       * <code>optional .proto.RoomMessage message = 2;</code>
       */
      public Builder setMessage(
          net.iGap.proto.ProtoGlobal.RoomMessage.Builder builderForValue) {
        copyOnWrite();
        instance.setMessage(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.RoomMessage message = 2;</code>
       */
      public Builder mergeMessage(net.iGap.proto.ProtoGlobal.RoomMessage value) {
        copyOnWrite();
        instance.mergeMessage(value);
        return this;
      }
      /**
       * <code>optional .proto.RoomMessage message = 2;</code>
       */
      public Builder clearMessage() {  copyOnWrite();
        instance.clearMessage();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientGetRoomMessageResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse();
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
          net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse other = (net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          message_ = visitor.visitMessage(message_, other.message_);
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
                case 10: {
                  net.iGap.proto.ProtoResponse.Response.Builder subBuilder = null;
                  if (response_ != null) {
                    subBuilder = response_.toBuilder();
                  }
                  response_ = input.readMessage(net.iGap.proto.ProtoResponse.Response.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(response_);
                    response_ = subBuilder.buildPartial();
                  }

                  break;
                }
                case 18: {
                  net.iGap.proto.ProtoGlobal.RoomMessage.Builder subBuilder = null;
                  if (message_ != null) {
                    subBuilder = message_.toBuilder();
                  }
                  message_ = input.readMessage(net.iGap.proto.ProtoGlobal.RoomMessage.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(message_);
                    message_ = subBuilder.buildPartial();
                  }

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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientGetRoomMessageResponse)
    private static final net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientGetRoomMessageResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientGetRoomMessage.ClientGetRoomMessageResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientGetRoomMessageResponse> PARSER;

    public static com.google.protobuf.Parser<ClientGetRoomMessageResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
