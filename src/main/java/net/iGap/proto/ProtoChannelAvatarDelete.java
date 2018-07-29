// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ChannelAvatarDelete.proto

package net.iGap.proto;

public final class ProtoChannelAvatarDelete {
  private ProtoChannelAvatarDelete() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ChannelAvatarDeleteOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChannelAvatarDelete)
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
     * <code>optional uint64 id = 2;</code>
     */
    long getId();

    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    long getRoomId();
  }
  /**
   * Protobuf type {@code proto.ChannelAvatarDelete}
   */
  public  static final class ChannelAvatarDelete extends
      com.google.protobuf.GeneratedMessageLite<
          ChannelAvatarDelete, ChannelAvatarDelete.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ChannelAvatarDelete)
      ChannelAvatarDeleteOrBuilder {
    private ChannelAvatarDelete() {
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

    public static final int ID_FIELD_NUMBER = 2;
    private long id_;
    /**
     * <code>optional uint64 id = 2;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional uint64 id = 2;</code>
     */
    private void setId(long value) {
      
      id_ = value;
    }
    /**
     * <code>optional uint64 id = 2;</code>
     */
    private void clearId() {
      
      id_ = 0L;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 3;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    private void setRoomId(long value) {
      
      roomId_ = value;
    }
    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    private void clearRoomId() {
      
      roomId_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (id_ != 0L) {
        output.writeUInt64(2, id_);
      }
      if (roomId_ != 0L) {
        output.writeUInt64(3, roomId_);
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
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, id_);
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, roomId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ChannelAvatarDelete}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChannelAvatarDelete)
        net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteOrBuilder {
      // Construct using net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete.newBuilder()
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
       * <code>optional uint64 id = 2;</code>
       */
      public long getId() {
        return instance.getId();
      }
      /**
       * <code>optional uint64 id = 2;</code>
       */
      public Builder setId(long value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>optional uint64 id = 2;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>optional uint64 room_id = 3;</code>
       */
      public long getRoomId() {
        return instance.getRoomId();
      }
      /**
       * <code>optional uint64 room_id = 3;</code>
       */
      public Builder setRoomId(long value) {
        copyOnWrite();
        instance.setRoomId(value);
        return this;
      }
      /**
       * <code>optional uint64 room_id = 3;</code>
       */
      public Builder clearRoomId() {
        copyOnWrite();
        instance.clearRoomId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ChannelAvatarDelete)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete();
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
          net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete other = (net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          id_ = visitor.visitLong(id_ != 0L, id_,
              other.id_ != 0L, other.id_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
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

                  id_ = input.readUInt64();
                  break;
                }
                case 24: {

                  roomId_ = input.readUInt64();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ChannelAvatarDelete)
    private static final net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChannelAvatarDelete();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDelete getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ChannelAvatarDelete> PARSER;

    public static com.google.protobuf.Parser<ChannelAvatarDelete> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ChannelAvatarDeleteResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ChannelAvatarDeleteResponse)
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
     * <code>optional uint64 id = 2;</code>
     */
    long getId();

    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    long getRoomId();
  }
  /**
   * Protobuf type {@code proto.ChannelAvatarDeleteResponse}
   */
  public  static final class ChannelAvatarDeleteResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ChannelAvatarDeleteResponse, ChannelAvatarDeleteResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ChannelAvatarDeleteResponse)
      ChannelAvatarDeleteResponseOrBuilder {
    private ChannelAvatarDeleteResponse() {
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

    public static final int ID_FIELD_NUMBER = 2;
    private long id_;
    /**
     * <code>optional uint64 id = 2;</code>
     */
    public long getId() {
      return id_;
    }
    /**
     * <code>optional uint64 id = 2;</code>
     */
    private void setId(long value) {
      
      id_ = value;
    }
    /**
     * <code>optional uint64 id = 2;</code>
     */
    private void clearId() {
      
      id_ = 0L;
    }

    public static final int ROOM_ID_FIELD_NUMBER = 3;
    private long roomId_;
    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    public long getRoomId() {
      return roomId_;
    }
    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    private void setRoomId(long value) {
      
      roomId_ = value;
    }
    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    private void clearRoomId() {
      
      roomId_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (id_ != 0L) {
        output.writeUInt64(2, id_);
      }
      if (roomId_ != 0L) {
        output.writeUInt64(3, roomId_);
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
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, id_);
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, roomId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ChannelAvatarDeleteResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ChannelAvatarDeleteResponse)
        net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse.newBuilder()
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
       * <code>optional uint64 id = 2;</code>
       */
      public long getId() {
        return instance.getId();
      }
      /**
       * <code>optional uint64 id = 2;</code>
       */
      public Builder setId(long value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>optional uint64 id = 2;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }

      /**
       * <code>optional uint64 room_id = 3;</code>
       */
      public long getRoomId() {
        return instance.getRoomId();
      }
      /**
       * <code>optional uint64 room_id = 3;</code>
       */
      public Builder setRoomId(long value) {
        copyOnWrite();
        instance.setRoomId(value);
        return this;
      }
      /**
       * <code>optional uint64 room_id = 3;</code>
       */
      public Builder clearRoomId() {
        copyOnWrite();
        instance.clearRoomId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ChannelAvatarDeleteResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse();
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
          net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse other = (net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          id_ = visitor.visitLong(id_ != 0L, id_,
              other.id_ != 0L, other.id_);
          roomId_ = visitor.visitLong(roomId_ != 0L, roomId_,
              other.roomId_ != 0L, other.roomId_);
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
                case 16: {

                  id_ = input.readUInt64();
                  break;
                }
                case 24: {

                  roomId_ = input.readUInt64();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ChannelAvatarDeleteResponse)
    private static final net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ChannelAvatarDeleteResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoChannelAvatarDelete.ChannelAvatarDeleteResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ChannelAvatarDeleteResponse> PARSER;

    public static com.google.protobuf.Parser<ChannelAvatarDeleteResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
