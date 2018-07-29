// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QrCodeResolve.proto

package net.iGap.proto;

public final class ProtoQrCodeResolve {
  private ProtoQrCodeResolve() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface QrCodeResolveOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.QrCodeResolve)
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
     * <code>optional string username = 2;</code>
     */
    java.lang.String getUsername();
    /**
     * <code>optional string username = 2;</code>
     */
    com.google.protobuf.ByteString
        getUsernameBytes();

    /**
     * <code>optional uint64 message_id = 3;</code>
     */
    long getMessageId();
  }
  /**
   * Protobuf type {@code proto.QrCodeResolve}
   */
  public  static final class QrCodeResolve extends
      com.google.protobuf.GeneratedMessageLite<
          QrCodeResolve, QrCodeResolve.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.QrCodeResolve)
      QrCodeResolveOrBuilder {
    private QrCodeResolve() {
      username_ = "";
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
      if (!username_.isEmpty()) {
        output.writeString(2, getUsername());
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
      if (!username_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getUsername());
      }
      if (messageId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, messageId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.QrCodeResolve}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.QrCodeResolve)
        net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveOrBuilder {
      // Construct using net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:proto.QrCodeResolve)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve();
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
          net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve other = (net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          username_ = visitor.visitString(!username_.isEmpty(), username_,
              !other.username_.isEmpty(), other.username_);
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
                case 18: {
                  String s = input.readStringRequireUtf8();

                  username_ = s;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve.class) {
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


    // @@protoc_insertion_point(class_scope:proto.QrCodeResolve)
    private static final net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new QrCodeResolve();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolve getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<QrCodeResolve> PARSER;

    public static com.google.protobuf.Parser<QrCodeResolve> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface QrCodeResolveResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.QrCodeResolveResponse)
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
     * <code>optional bytes qr_code_image = 2;</code>
     */
    com.google.protobuf.ByteString getQrCodeImage();
  }
  /**
   * Protobuf type {@code proto.QrCodeResolveResponse}
   */
  public  static final class QrCodeResolveResponse extends
      com.google.protobuf.GeneratedMessageLite<
          QrCodeResolveResponse, QrCodeResolveResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.QrCodeResolveResponse)
      QrCodeResolveResponseOrBuilder {
    private QrCodeResolveResponse() {
      qrCodeImage_ = com.google.protobuf.ByteString.EMPTY;
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

    public static final int QR_CODE_IMAGE_FIELD_NUMBER = 2;
    private com.google.protobuf.ByteString qrCodeImage_;
    /**
     * <code>optional bytes qr_code_image = 2;</code>
     */
    public com.google.protobuf.ByteString getQrCodeImage() {
      return qrCodeImage_;
    }
    /**
     * <code>optional bytes qr_code_image = 2;</code>
     */
    private void setQrCodeImage(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      qrCodeImage_ = value;
    }
    /**
     * <code>optional bytes qr_code_image = 2;</code>
     */
    private void clearQrCodeImage() {
      
      qrCodeImage_ = getDefaultInstance().getQrCodeImage();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (!qrCodeImage_.isEmpty()) {
        output.writeBytes(2, qrCodeImage_);
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
      if (!qrCodeImage_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(2, qrCodeImage_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.QrCodeResolveResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.QrCodeResolveResponse)
        net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse.newBuilder()
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
       * <code>optional bytes qr_code_image = 2;</code>
       */
      public com.google.protobuf.ByteString getQrCodeImage() {
        return instance.getQrCodeImage();
      }
      /**
       * <code>optional bytes qr_code_image = 2;</code>
       */
      public Builder setQrCodeImage(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setQrCodeImage(value);
        return this;
      }
      /**
       * <code>optional bytes qr_code_image = 2;</code>
       */
      public Builder clearQrCodeImage() {
        copyOnWrite();
        instance.clearQrCodeImage();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.QrCodeResolveResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse();
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
          net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse other = (net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          qrCodeImage_ = visitor.visitByteString(qrCodeImage_ != com.google.protobuf.ByteString.EMPTY, qrCodeImage_,
              other.qrCodeImage_ != com.google.protobuf.ByteString.EMPTY, other.qrCodeImage_);
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

                  qrCodeImage_ = input.readBytes();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.QrCodeResolveResponse)
    private static final net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new QrCodeResolveResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoQrCodeResolve.QrCodeResolveResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<QrCodeResolveResponse> PARSER;

    public static com.google.protobuf.Parser<QrCodeResolveResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
