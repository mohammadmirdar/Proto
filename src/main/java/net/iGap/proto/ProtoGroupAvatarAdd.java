// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: GroupAvatarAdd.proto

package net.iGap.proto;

public final class ProtoGroupAvatarAdd {
  private ProtoGroupAvatarAdd() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface GroupAvatarAddOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.GroupAvatarAdd)
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
     * <code>optional string attachment = 2;</code>
     */
    java.lang.String getAttachment();
    /**
     * <code>optional string attachment = 2;</code>
     */
    com.google.protobuf.ByteString
        getAttachmentBytes();

    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    long getRoomId();
  }
  /**
   * Protobuf type {@code proto.GroupAvatarAdd}
   */
  public  static final class GroupAvatarAdd extends
      com.google.protobuf.GeneratedMessageLite<
          GroupAvatarAdd, GroupAvatarAdd.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.GroupAvatarAdd)
      GroupAvatarAddOrBuilder {
    private GroupAvatarAdd() {
      attachment_ = "";
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

    public static final int ATTACHMENT_FIELD_NUMBER = 2;
    private java.lang.String attachment_;
    /**
     * <code>optional string attachment = 2;</code>
     */
    public java.lang.String getAttachment() {
      return attachment_;
    }
    /**
     * <code>optional string attachment = 2;</code>
     */
    public com.google.protobuf.ByteString
        getAttachmentBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(attachment_);
    }
    /**
     * <code>optional string attachment = 2;</code>
     */
    private void setAttachment(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      attachment_ = value;
    }
    /**
     * <code>optional string attachment = 2;</code>
     */
    private void clearAttachment() {
      
      attachment_ = getDefaultInstance().getAttachment();
    }
    /**
     * <code>optional string attachment = 2;</code>
     */
    private void setAttachmentBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      attachment_ = value.toStringUtf8();
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
      if (!attachment_.isEmpty()) {
        output.writeString(2, getAttachment());
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
      if (!attachment_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getAttachment());
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, roomId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.GroupAvatarAdd}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.GroupAvatarAdd)
        net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddOrBuilder {
      // Construct using net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd.newBuilder()
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
       * <code>optional string attachment = 2;</code>
       */
      public java.lang.String getAttachment() {
        return instance.getAttachment();
      }
      /**
       * <code>optional string attachment = 2;</code>
       */
      public com.google.protobuf.ByteString
          getAttachmentBytes() {
        return instance.getAttachmentBytes();
      }
      /**
       * <code>optional string attachment = 2;</code>
       */
      public Builder setAttachment(
          java.lang.String value) {
        copyOnWrite();
        instance.setAttachment(value);
        return this;
      }
      /**
       * <code>optional string attachment = 2;</code>
       */
      public Builder clearAttachment() {
        copyOnWrite();
        instance.clearAttachment();
        return this;
      }
      /**
       * <code>optional string attachment = 2;</code>
       */
      public Builder setAttachmentBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setAttachmentBytes(value);
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

      // @@protoc_insertion_point(builder_scope:proto.GroupAvatarAdd)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd();
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
          net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd other = (net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          attachment_ = visitor.visitString(!attachment_.isEmpty(), attachment_,
              !other.attachment_.isEmpty(), other.attachment_);
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
                case 18: {
                  String s = input.readStringRequireUtf8();

                  attachment_ = s;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd.class) {
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


    // @@protoc_insertion_point(class_scope:proto.GroupAvatarAdd)
    private static final net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GroupAvatarAdd();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAdd getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<GroupAvatarAdd> PARSER;

    public static com.google.protobuf.Parser<GroupAvatarAdd> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface GroupAvatarAddResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.GroupAvatarAddResponse)
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
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    boolean hasAvatar();
    /**
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    net.iGap.proto.ProtoGlobal.Avatar getAvatar();

    /**
     * <code>optional uint64 room_id = 3;</code>
     */
    long getRoomId();
  }
  /**
   * Protobuf type {@code proto.GroupAvatarAddResponse}
   */
  public  static final class GroupAvatarAddResponse extends
      com.google.protobuf.GeneratedMessageLite<
          GroupAvatarAddResponse, GroupAvatarAddResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.GroupAvatarAddResponse)
      GroupAvatarAddResponseOrBuilder {
    private GroupAvatarAddResponse() {
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

    public static final int AVATAR_FIELD_NUMBER = 2;
    private net.iGap.proto.ProtoGlobal.Avatar avatar_;
    /**
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    public boolean hasAvatar() {
      return avatar_ != null;
    }
    /**
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    public net.iGap.proto.ProtoGlobal.Avatar getAvatar() {
      return avatar_ == null ? net.iGap.proto.ProtoGlobal.Avatar.getDefaultInstance() : avatar_;
    }
    /**
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    private void setAvatar(net.iGap.proto.ProtoGlobal.Avatar value) {
      if (value == null) {
        throw new NullPointerException();
      }
      avatar_ = value;
      
      }
    /**
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    private void setAvatar(
        net.iGap.proto.ProtoGlobal.Avatar.Builder builderForValue) {
      avatar_ = builderForValue.build();
      
    }
    /**
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    private void mergeAvatar(net.iGap.proto.ProtoGlobal.Avatar value) {
      if (avatar_ != null &&
          avatar_ != net.iGap.proto.ProtoGlobal.Avatar.getDefaultInstance()) {
        avatar_ =
          net.iGap.proto.ProtoGlobal.Avatar.newBuilder(avatar_).mergeFrom(value).buildPartial();
      } else {
        avatar_ = value;
      }
      
    }
    /**
     * <code>optional .proto.Avatar avatar = 2;</code>
     */
    private void clearAvatar() {  avatar_ = null;
      
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
      if (avatar_ != null) {
        output.writeMessage(2, getAvatar());
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
      if (avatar_ != null) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(2, getAvatar());
      }
      if (roomId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, roomId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.GroupAvatarAddResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.GroupAvatarAddResponse)
        net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse.newBuilder()
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
       * <code>optional .proto.Avatar avatar = 2;</code>
       */
      public boolean hasAvatar() {
        return instance.hasAvatar();
      }
      /**
       * <code>optional .proto.Avatar avatar = 2;</code>
       */
      public net.iGap.proto.ProtoGlobal.Avatar getAvatar() {
        return instance.getAvatar();
      }
      /**
       * <code>optional .proto.Avatar avatar = 2;</code>
       */
      public Builder setAvatar(net.iGap.proto.ProtoGlobal.Avatar value) {
        copyOnWrite();
        instance.setAvatar(value);
        return this;
        }
      /**
       * <code>optional .proto.Avatar avatar = 2;</code>
       */
      public Builder setAvatar(
          net.iGap.proto.ProtoGlobal.Avatar.Builder builderForValue) {
        copyOnWrite();
        instance.setAvatar(builderForValue);
        return this;
      }
      /**
       * <code>optional .proto.Avatar avatar = 2;</code>
       */
      public Builder mergeAvatar(net.iGap.proto.ProtoGlobal.Avatar value) {
        copyOnWrite();
        instance.mergeAvatar(value);
        return this;
      }
      /**
       * <code>optional .proto.Avatar avatar = 2;</code>
       */
      public Builder clearAvatar() {  copyOnWrite();
        instance.clearAvatar();
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

      // @@protoc_insertion_point(builder_scope:proto.GroupAvatarAddResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse();
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
          net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse other = (net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          avatar_ = visitor.visitMessage(avatar_, other.avatar_);
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
                case 18: {
                  net.iGap.proto.ProtoGlobal.Avatar.Builder subBuilder = null;
                  if (avatar_ != null) {
                    subBuilder = avatar_.toBuilder();
                  }
                  avatar_ = input.readMessage(net.iGap.proto.ProtoGlobal.Avatar.parser(), extensionRegistry);
                  if (subBuilder != null) {
                    subBuilder.mergeFrom(avatar_);
                    avatar_ = subBuilder.buildPartial();
                  }

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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.GroupAvatarAddResponse)
    private static final net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new GroupAvatarAddResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoGroupAvatarAdd.GroupAvatarAddResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<GroupAvatarAddResponse> PARSER;

    public static com.google.protobuf.Parser<GroupAvatarAddResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
