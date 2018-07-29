// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushLoginToken.proto

package net.iGap.proto;

public final class ProtoPushLoginToken {
  private ProtoPushLoginToken() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface PushLoginTokenResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.PushLoginTokenResponse)
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
     * <code>optional string username = 2;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>optional string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>optional uint64 user_id = 3;</code>
     */
    long getUserId();

    /**
     * <code>optional string author_hash = 4;</code>
     */
    java.lang.String getAuthorHash();
    /**
     * <code>optional string author_hash = 4;</code>
     */
    com.google.protobuf.ByteString
        getAuthorHashBytes();

    /**
     * <code>optional string token = 5;</code>
     */
    java.lang.String getToken();
    /**
     * <code>optional string token = 5;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();
  }
  /**
   * Protobuf type {@code proto.PushLoginTokenResponse}
   */
  public  static final class PushLoginTokenResponse extends
      com.google.protobuf.GeneratedMessageLite<
          PushLoginTokenResponse, PushLoginTokenResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.PushLoginTokenResponse)
      PushLoginTokenResponseOrBuilder {
    private PushLoginTokenResponse() {
      username_ = "";
      authorHash_ = "";
      token_ = "";
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

    public static final int USERNAME_FIELD_NUMBER = 2;
    private java.lang.String username_;
    /**
     * <code>optional string username = 2;</code>
     */
    public java.lang.String getUsername() {
      return username_;
    }
    /**
     * <code>optional string username = 2;</code>
     */
    public com.google.protobuf.ByteString
        getUsernameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(username_);
    }
    /**
     * <code>optional string username = 2;</code>
     */
    private void setUsername(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      username_ = value;
    }
    /**
     * <code>optional string username = 2;</code>
     */
    private void clearUsername() {
      
      username_ = getDefaultInstance().getUsername();
    }
    /**
     * <code>optional string username = 2;</code>
     */
    private void setUsernameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      username_ = value.toStringUtf8();
    }

    public static final int USER_ID_FIELD_NUMBER = 3;
    private long userId_;
    /**
     * <code>optional uint64 user_id = 3;</code>
     */
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>optional uint64 user_id = 3;</code>
     */
    private void setUserId(long value) {
      
      userId_ = value;
    }
    /**
     * <code>optional uint64 user_id = 3;</code>
     */
    private void clearUserId() {
      
      userId_ = 0L;
    }

    public static final int AUTHOR_HASH_FIELD_NUMBER = 4;
    private java.lang.String authorHash_;
    /**
     * <code>optional string author_hash = 4;</code>
     */
    public java.lang.String getAuthorHash() {
      return authorHash_;
    }
    /**
     * <code>optional string author_hash = 4;</code>
     */
    public com.google.protobuf.ByteString
        getAuthorHashBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(authorHash_);
    }
    /**
     * <code>optional string author_hash = 4;</code>
     */
    private void setAuthorHash(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      authorHash_ = value;
    }
    /**
     * <code>optional string author_hash = 4;</code>
     */
    private void clearAuthorHash() {
      
      authorHash_ = getDefaultInstance().getAuthorHash();
    }
    /**
     * <code>optional string author_hash = 4;</code>
     */
    private void setAuthorHashBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      authorHash_ = value.toStringUtf8();
    }

    public static final int TOKEN_FIELD_NUMBER = 5;
    private java.lang.String token_;
    /**
     * <code>optional string token = 5;</code>
     */
    public java.lang.String getToken() {
      return token_;
    }
    /**
     * <code>optional string token = 5;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(token_);
    }
    /**
     * <code>optional string token = 5;</code>
     */
    private void setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
    }
    /**
     * <code>optional string token = 5;</code>
     */
    private void clearToken() {
      
      token_ = getDefaultInstance().getToken();
    }
    /**
     * <code>optional string token = 5;</code>
     */
    private void setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (!username_.isEmpty()) {
        output.writeString(2, getUsername());
      }
      if (userId_ != 0L) {
        output.writeUInt64(3, userId_);
      }
      if (!authorHash_.isEmpty()) {
        output.writeString(4, getAuthorHash());
      }
      if (!token_.isEmpty()) {
        output.writeString(5, getToken());
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
      if (!username_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getUsername());
      }
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, userId_);
      }
      if (!authorHash_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getAuthorHash());
      }
      if (!token_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(5, getToken());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.PushLoginTokenResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PushLoginTokenResponse)
        net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse.newBuilder()
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
       * <code>optional string username = 2;</code>
       */
      public java.lang.String getUsername() {
        return instance.getUsername();
      }
      /**
       * <code>optional string username = 2;</code>
       */
      public com.google.protobuf.ByteString
          getUsernameBytes() {
        return instance.getUsernameBytes();
      }
      /**
       * <code>optional string username = 2;</code>
       */
      public Builder setUsername(
          java.lang.String value) {
        copyOnWrite();
        instance.setUsername(value);
        return this;
      }
      /**
       * <code>optional string username = 2;</code>
       */
      public Builder clearUsername() {
        copyOnWrite();
        instance.clearUsername();
        return this;
      }
      /**
       * <code>optional string username = 2;</code>
       */
      public Builder setUsernameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setUsernameBytes(value);
        return this;
      }

      /**
       * <code>optional uint64 user_id = 3;</code>
       */
      public long getUserId() {
        return instance.getUserId();
      }
      /**
       * <code>optional uint64 user_id = 3;</code>
       */
      public Builder setUserId(long value) {
        copyOnWrite();
        instance.setUserId(value);
        return this;
      }
      /**
       * <code>optional uint64 user_id = 3;</code>
       */
      public Builder clearUserId() {
        copyOnWrite();
        instance.clearUserId();
        return this;
      }

      /**
       * <code>optional string author_hash = 4;</code>
       */
      public java.lang.String getAuthorHash() {
        return instance.getAuthorHash();
      }
      /**
       * <code>optional string author_hash = 4;</code>
       */
      public com.google.protobuf.ByteString
          getAuthorHashBytes() {
        return instance.getAuthorHashBytes();
      }
      /**
       * <code>optional string author_hash = 4;</code>
       */
      public Builder setAuthorHash(
          java.lang.String value) {
        copyOnWrite();
        instance.setAuthorHash(value);
        return this;
      }
      /**
       * <code>optional string author_hash = 4;</code>
       */
      public Builder clearAuthorHash() {
        copyOnWrite();
        instance.clearAuthorHash();
        return this;
      }
      /**
       * <code>optional string author_hash = 4;</code>
       */
      public Builder setAuthorHashBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setAuthorHashBytes(value);
        return this;
      }

      /**
       * <code>optional string token = 5;</code>
       */
      public java.lang.String getToken() {
        return instance.getToken();
      }
      /**
       * <code>optional string token = 5;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        return instance.getTokenBytes();
      }
      /**
       * <code>optional string token = 5;</code>
       */
      public Builder setToken(
          java.lang.String value) {
        copyOnWrite();
        instance.setToken(value);
        return this;
      }
      /**
       * <code>optional string token = 5;</code>
       */
      public Builder clearToken() {
        copyOnWrite();
        instance.clearToken();
        return this;
      }
      /**
       * <code>optional string token = 5;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTokenBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.PushLoginTokenResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse();
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
          net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse other = (net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          username_ = visitor.visitString(!username_.isEmpty(), username_,
              !other.username_.isEmpty(), other.username_);
          userId_ = visitor.visitLong(userId_ != 0L, userId_,
              other.userId_ != 0L, other.userId_);
          authorHash_ = visitor.visitString(!authorHash_.isEmpty(), authorHash_,
              !other.authorHash_.isEmpty(), other.authorHash_);
          token_ = visitor.visitString(!token_.isEmpty(), token_,
              !other.token_.isEmpty(), other.token_);
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
                  String s = input.readStringRequireUtf8();

                  username_ = s;
                  break;
                }
                case 24: {

                  userId_ = input.readUInt64();
                  break;
                }
                case 34: {
                  String s = input.readStringRequireUtf8();

                  authorHash_ = s;
                  break;
                }
                case 42: {
                  String s = input.readStringRequireUtf8();

                  token_ = s;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.PushLoginTokenResponse)
    private static final net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new PushLoginTokenResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoPushLoginToken.PushLoginTokenResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<PushLoginTokenResponse> PARSER;

    public static com.google.protobuf.Parser<PushLoginTokenResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
