// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientRegisterDevice.proto

package net.iGap.proto;

public final class ProtoClientRegisterDevice {
  private ProtoClientRegisterDevice() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientRegisterDeviceOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientRegisterDevice)
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
     * <code>optional string token = 2;</code>
     */
    java.lang.String getToken();
    /**
     * <code>optional string token = 2;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();

    /**
     * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
     */
    int getTypeValue();
    /**
     * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
     */
    net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type getType();
  }
  /**
   * Protobuf type {@code proto.ClientRegisterDevice}
   */
  public  static final class ClientRegisterDevice extends
      com.google.protobuf.GeneratedMessageLite<
          ClientRegisterDevice, ClientRegisterDevice.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientRegisterDevice)
      ClientRegisterDeviceOrBuilder {
    private ClientRegisterDevice() {
      token_ = "";
    }
    /**
     * Protobuf enum {@code proto.ClientRegisterDevice.Type}
     */
    public enum Type
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>GENERIC = 0;</code>
       */
      GENERIC(0),
      /**
       * <code>ANDROID = 1;</code>
       */
      ANDROID(1),
      /**
       * <code>IOS = 2;</code>
       */
      IOS(2),
      /**
       * <code>WEB = 3;</code>
       */
      WEB(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>GENERIC = 0;</code>
       */
      public static final int GENERIC_VALUE = 0;
      /**
       * <code>ANDROID = 1;</code>
       */
      public static final int ANDROID_VALUE = 1;
      /**
       * <code>IOS = 2;</code>
       */
      public static final int IOS_VALUE = 2;
      /**
       * <code>WEB = 3;</code>
       */
      public static final int WEB_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Type valueOf(int value) {
        return forNumber(value);
      }

      public static Type forNumber(int value) {
        switch (value) {
          case 0: return GENERIC;
          case 1: return ANDROID;
          case 2: return IOS;
          case 3: return WEB;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Type>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Type> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Type>() {
              public Type findValueByNumber(int number) {
                return Type.forNumber(number);
              }
            };

      private final int value;

      private Type(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:proto.ClientRegisterDevice.Type)
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

    public static final int TOKEN_FIELD_NUMBER = 2;
    private java.lang.String token_;
    /**
     * <code>optional string token = 2;</code>
     */
    public java.lang.String getToken() {
      return token_;
    }
    /**
     * <code>optional string token = 2;</code>
     */
    public com.google.protobuf.ByteString
        getTokenBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(token_);
    }
    /**
     * <code>optional string token = 2;</code>
     */
    private void setToken(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      token_ = value;
    }
    /**
     * <code>optional string token = 2;</code>
     */
    private void clearToken() {
      
      token_ = getDefaultInstance().getToken();
    }
    /**
     * <code>optional string token = 2;</code>
     */
    private void setTokenBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      token_ = value.toStringUtf8();
    }

    public static final int TYPE_FIELD_NUMBER = 3;
    private int type_;
    /**
     * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
     */
    public int getTypeValue() {
      return type_;
    }
    /**
     * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
     */
    public net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type getType() {
      net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type result = net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type.forNumber(type_);
      return result == null ? net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
     */
    private void setTypeValue(int value) {
        type_ = value;
    }
    /**
     * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
     */
    private void setType(net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      type_ = value.getNumber();
    }
    /**
     * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
     */
    private void clearType() {
      
      type_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (!token_.isEmpty()) {
        output.writeString(2, getToken());
      }
      if (type_ != net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type.GENERIC.getNumber()) {
        output.writeEnum(3, type_);
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
      if (!token_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getToken());
      }
      if (type_ != net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type.GENERIC.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, type_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientRegisterDevice}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientRegisterDevice)
        net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceOrBuilder {
      // Construct using net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.newBuilder()
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
       * <code>optional string token = 2;</code>
       */
      public java.lang.String getToken() {
        return instance.getToken();
      }
      /**
       * <code>optional string token = 2;</code>
       */
      public com.google.protobuf.ByteString
          getTokenBytes() {
        return instance.getTokenBytes();
      }
      /**
       * <code>optional string token = 2;</code>
       */
      public Builder setToken(
          java.lang.String value) {
        copyOnWrite();
        instance.setToken(value);
        return this;
      }
      /**
       * <code>optional string token = 2;</code>
       */
      public Builder clearToken() {
        copyOnWrite();
        instance.clearToken();
        return this;
      }
      /**
       * <code>optional string token = 2;</code>
       */
      public Builder setTokenBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setTokenBytes(value);
        return this;
      }

      /**
       * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
       */
      public int getTypeValue() {
        return instance.getTypeValue();
      }
      /**
       * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
       */
      public Builder setTypeValue(int value) {
        copyOnWrite();
        instance.setTypeValue(value);
        return this;
      }
      /**
       * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
       */
      public net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type getType() {
        return instance.getType();
      }
      /**
       * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
       */
      public Builder setType(net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.Type value) {
        copyOnWrite();
        instance.setType(value);
        return this;
      }
      /**
       * <code>optional .proto.ClientRegisterDevice.Type type = 3;</code>
       */
      public Builder clearType() {
        copyOnWrite();
        instance.clearType();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.ClientRegisterDevice)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice();
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
          net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice other = (net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          token_ = visitor.visitString(!token_.isEmpty(), token_,
              !other.token_.isEmpty(), other.token_);
          type_ = visitor.visitInt(type_ != 0, type_,    other.type_ != 0, other.type_);
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

                  token_ = s;
                  break;
                }
                case 24: {
                  int rawValue = input.readEnum();

                  type_ = rawValue;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientRegisterDevice)
    private static final net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientRegisterDevice();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDevice getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientRegisterDevice> PARSER;

    public static com.google.protobuf.Parser<ClientRegisterDevice> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface ClientRegisterDeviceResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.ClientRegisterDeviceResponse)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    boolean hasResponse();
    /**
     * <code>optional .proto.Response response = 1;</code>
     */
    net.iGap.proto.ProtoResponse.Response getResponse();
  }
  /**
   * Protobuf type {@code proto.ClientRegisterDeviceResponse}
   */
  public  static final class ClientRegisterDeviceResponse extends
      com.google.protobuf.GeneratedMessageLite<
          ClientRegisterDeviceResponse, ClientRegisterDeviceResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.ClientRegisterDeviceResponse)
      ClientRegisterDeviceResponseOrBuilder {
    private ClientRegisterDeviceResponse() {
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

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
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
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.ClientRegisterDeviceResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.ClientRegisterDeviceResponse)
        net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:proto.ClientRegisterDeviceResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse();
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
          net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse other = (net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.ClientRegisterDeviceResponse)
    private static final net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientRegisterDeviceResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientRegisterDevice.ClientRegisterDeviceResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientRegisterDeviceResponse> PARSER;

    public static com.google.protobuf.Parser<ClientRegisterDeviceResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
