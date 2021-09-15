// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: StoryAddView.proto

package net.iGap.proto;

public final class ProtoStoryAddView {
  private ProtoStoryAddView() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface StoryAddViewOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.StoryAddView)
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
     * <code>optional string story_id = 2;</code>
     */
    java.lang.String getStoryId();
    /**
     * <code>optional string story_id = 2;</code>
     */
    com.google.protobuf.ByteString
        getStoryIdBytes();
  }
  /**
   * Protobuf type {@code proto.StoryAddView}
   */
  public  static final class StoryAddView extends
      com.google.protobuf.GeneratedMessageLite<
          StoryAddView, StoryAddView.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.StoryAddView)
      StoryAddViewOrBuilder {
    private StoryAddView() {
      storyId_ = "";
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

    public static final int STORY_ID_FIELD_NUMBER = 2;
    private java.lang.String storyId_;
    /**
     * <code>optional string story_id = 2;</code>
     */
    public java.lang.String getStoryId() {
      return storyId_;
    }
    /**
     * <code>optional string story_id = 2;</code>
     */
    public com.google.protobuf.ByteString
        getStoryIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(storyId_);
    }
    /**
     * <code>optional string story_id = 2;</code>
     */
    private void setStoryId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      storyId_ = value;
    }
    /**
     * <code>optional string story_id = 2;</code>
     */
    private void clearStoryId() {
      
      storyId_ = getDefaultInstance().getStoryId();
    }
    /**
     * <code>optional string story_id = 2;</code>
     */
    private void setStoryIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      storyId_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (!storyId_.isEmpty()) {
        output.writeString(2, getStoryId());
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
      if (!storyId_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getStoryId());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddView parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoStoryAddView.StoryAddView prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.StoryAddView}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoStoryAddView.StoryAddView, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.StoryAddView)
        net.iGap.proto.ProtoStoryAddView.StoryAddViewOrBuilder {
      // Construct using net.iGap.proto.ProtoStoryAddView.StoryAddView.newBuilder()
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
       * <code>optional string story_id = 2;</code>
       */
      public java.lang.String getStoryId() {
        return instance.getStoryId();
      }
      /**
       * <code>optional string story_id = 2;</code>
       */
      public com.google.protobuf.ByteString
          getStoryIdBytes() {
        return instance.getStoryIdBytes();
      }
      /**
       * <code>optional string story_id = 2;</code>
       */
      public Builder setStoryId(
          java.lang.String value) {
        copyOnWrite();
        instance.setStoryId(value);
        return this;
      }
      /**
       * <code>optional string story_id = 2;</code>
       */
      public Builder clearStoryId() {
        copyOnWrite();
        instance.clearStoryId();
        return this;
      }
      /**
       * <code>optional string story_id = 2;</code>
       */
      public Builder setStoryIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setStoryIdBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.StoryAddView)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoStoryAddView.StoryAddView();
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
          net.iGap.proto.ProtoStoryAddView.StoryAddView other = (net.iGap.proto.ProtoStoryAddView.StoryAddView) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          storyId_ = visitor.visitString(!storyId_.isEmpty(), storyId_,
              !other.storyId_.isEmpty(), other.storyId_);
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

                  storyId_ = s;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoStoryAddView.StoryAddView.class) {
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


    // @@protoc_insertion_point(class_scope:proto.StoryAddView)
    private static final net.iGap.proto.ProtoStoryAddView.StoryAddView DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StoryAddView();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoStoryAddView.StoryAddView getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StoryAddView> PARSER;

    public static com.google.protobuf.Parser<StoryAddView> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface StoryAddViewResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.StoryAddViewResponse)
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
     * <code>optional uint32 viewed_at = 2;</code>
     */
    int getViewedAt();

    /**
     * <code>optional uint64 story_id = 3 [jstype = JS_STRING];</code>
     */
    long getStoryId();

    /**
     * <code>optional uint64 user_id = 4 [jstype = JS_STRING];</code>
     */
    long getUserId();

    /**
     * <code>optional uint64 story_owner_user_id = 5 [jstype = JS_STRING];</code>
     */
    long getStoryOwnerUserId();
  }
  /**
   * Protobuf type {@code proto.StoryAddViewResponse}
   */
  public  static final class StoryAddViewResponse extends
      com.google.protobuf.GeneratedMessageLite<
          StoryAddViewResponse, StoryAddViewResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.StoryAddViewResponse)
      StoryAddViewResponseOrBuilder {
    private StoryAddViewResponse() {
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

    public static final int VIEWED_AT_FIELD_NUMBER = 2;
    private int viewedAt_;
    /**
     * <code>optional uint32 viewed_at = 2;</code>
     */
    public int getViewedAt() {
      return viewedAt_;
    }
    /**
     * <code>optional uint32 viewed_at = 2;</code>
     */
    private void setViewedAt(int value) {
      
      viewedAt_ = value;
    }
    /**
     * <code>optional uint32 viewed_at = 2;</code>
     */
    private void clearViewedAt() {
      
      viewedAt_ = 0;
    }

    public static final int STORY_ID_FIELD_NUMBER = 3;
    private long storyId_;
    /**
     * <code>optional uint64 story_id = 3 [jstype = JS_STRING];</code>
     */
    public long getStoryId() {
      return storyId_;
    }
    /**
     * <code>optional uint64 story_id = 3 [jstype = JS_STRING];</code>
     */
    private void setStoryId(long value) {
      
      storyId_ = value;
    }
    /**
     * <code>optional uint64 story_id = 3 [jstype = JS_STRING];</code>
     */
    private void clearStoryId() {
      
      storyId_ = 0L;
    }

    public static final int USER_ID_FIELD_NUMBER = 4;
    private long userId_;
    /**
     * <code>optional uint64 user_id = 4 [jstype = JS_STRING];</code>
     */
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>optional uint64 user_id = 4 [jstype = JS_STRING];</code>
     */
    private void setUserId(long value) {
      
      userId_ = value;
    }
    /**
     * <code>optional uint64 user_id = 4 [jstype = JS_STRING];</code>
     */
    private void clearUserId() {
      
      userId_ = 0L;
    }

    public static final int STORY_OWNER_USER_ID_FIELD_NUMBER = 5;
    private long storyOwnerUserId_;
    /**
     * <code>optional uint64 story_owner_user_id = 5 [jstype = JS_STRING];</code>
     */
    public long getStoryOwnerUserId() {
      return storyOwnerUserId_;
    }
    /**
     * <code>optional uint64 story_owner_user_id = 5 [jstype = JS_STRING];</code>
     */
    private void setStoryOwnerUserId(long value) {
      
      storyOwnerUserId_ = value;
    }
    /**
     * <code>optional uint64 story_owner_user_id = 5 [jstype = JS_STRING];</code>
     */
    private void clearStoryOwnerUserId() {
      
      storyOwnerUserId_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (viewedAt_ != 0) {
        output.writeUInt32(2, viewedAt_);
      }
      if (storyId_ != 0L) {
        output.writeUInt64(3, storyId_);
      }
      if (userId_ != 0L) {
        output.writeUInt64(4, userId_);
      }
      if (storyOwnerUserId_ != 0L) {
        output.writeUInt64(5, storyOwnerUserId_);
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
      if (viewedAt_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, viewedAt_);
      }
      if (storyId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, storyId_);
      }
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, userId_);
      }
      if (storyOwnerUserId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(5, storyOwnerUserId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.StoryAddViewResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.StoryAddViewResponse)
        net.iGap.proto.ProtoStoryAddView.StoryAddViewResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse.newBuilder()
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
       * <code>optional uint32 viewed_at = 2;</code>
       */
      public int getViewedAt() {
        return instance.getViewedAt();
      }
      /**
       * <code>optional uint32 viewed_at = 2;</code>
       */
      public Builder setViewedAt(int value) {
        copyOnWrite();
        instance.setViewedAt(value);
        return this;
      }
      /**
       * <code>optional uint32 viewed_at = 2;</code>
       */
      public Builder clearViewedAt() {
        copyOnWrite();
        instance.clearViewedAt();
        return this;
      }

      /**
       * <code>optional uint64 story_id = 3 [jstype = JS_STRING];</code>
       */
      public long getStoryId() {
        return instance.getStoryId();
      }
      /**
       * <code>optional uint64 story_id = 3 [jstype = JS_STRING];</code>
       */
      public Builder setStoryId(long value) {
        copyOnWrite();
        instance.setStoryId(value);
        return this;
      }
      /**
       * <code>optional uint64 story_id = 3 [jstype = JS_STRING];</code>
       */
      public Builder clearStoryId() {
        copyOnWrite();
        instance.clearStoryId();
        return this;
      }

      /**
       * <code>optional uint64 user_id = 4 [jstype = JS_STRING];</code>
       */
      public long getUserId() {
        return instance.getUserId();
      }
      /**
       * <code>optional uint64 user_id = 4 [jstype = JS_STRING];</code>
       */
      public Builder setUserId(long value) {
        copyOnWrite();
        instance.setUserId(value);
        return this;
      }
      /**
       * <code>optional uint64 user_id = 4 [jstype = JS_STRING];</code>
       */
      public Builder clearUserId() {
        copyOnWrite();
        instance.clearUserId();
        return this;
      }

      /**
       * <code>optional uint64 story_owner_user_id = 5 [jstype = JS_STRING];</code>
       */
      public long getStoryOwnerUserId() {
        return instance.getStoryOwnerUserId();
      }
      /**
       * <code>optional uint64 story_owner_user_id = 5 [jstype = JS_STRING];</code>
       */
      public Builder setStoryOwnerUserId(long value) {
        copyOnWrite();
        instance.setStoryOwnerUserId(value);
        return this;
      }
      /**
       * <code>optional uint64 story_owner_user_id = 5 [jstype = JS_STRING];</code>
       */
      public Builder clearStoryOwnerUserId() {
        copyOnWrite();
        instance.clearStoryOwnerUserId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.StoryAddViewResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse();
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
          net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse other = (net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          viewedAt_ = visitor.visitInt(viewedAt_ != 0, viewedAt_,
              other.viewedAt_ != 0, other.viewedAt_);
          storyId_ = visitor.visitLong(storyId_ != 0L, storyId_,
              other.storyId_ != 0L, other.storyId_);
          userId_ = visitor.visitLong(userId_ != 0L, userId_,
              other.userId_ != 0L, other.userId_);
          storyOwnerUserId_ = visitor.visitLong(storyOwnerUserId_ != 0L, storyOwnerUserId_,
              other.storyOwnerUserId_ != 0L, other.storyOwnerUserId_);
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

                  viewedAt_ = input.readUInt32();
                  break;
                }
                case 24: {

                  storyId_ = input.readUInt64();
                  break;
                }
                case 32: {

                  userId_ = input.readUInt64();
                  break;
                }
                case 40: {

                  storyOwnerUserId_ = input.readUInt64();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.StoryAddViewResponse)
    private static final net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new StoryAddViewResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoStoryAddView.StoryAddViewResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<StoryAddViewResponse> PARSER;

    public static com.google.protobuf.Parser<StoryAddViewResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
