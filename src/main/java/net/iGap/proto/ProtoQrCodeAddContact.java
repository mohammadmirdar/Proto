// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: QrCodeAddContact.proto

package net.iGap.proto;

public final class ProtoQrCodeAddContact {
  private ProtoQrCodeAddContact() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface QrCodeAddContactOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.QrCodeAddContact)
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
     * <code>optional string phone = 2;</code>
     */
    java.lang.String getPhone();
    /**
     * <code>optional string phone = 2;</code>
     */
    com.google.protobuf.ByteString
        getPhoneBytes();

    /**
     * <code>optional string first_name = 3;</code>
     */
    java.lang.String getFirstName();
    /**
     * <code>optional string first_name = 3;</code>
     */
    com.google.protobuf.ByteString
        getFirstNameBytes();

    /**
     * <code>optional string last_name = 4;</code>
     */
    java.lang.String getLastName();
    /**
     * <code>optional string last_name = 4;</code>
     */
    com.google.protobuf.ByteString
        getLastNameBytes();
  }
  /**
   * Protobuf type {@code proto.QrCodeAddContact}
   */
  public  static final class QrCodeAddContact extends
      com.google.protobuf.GeneratedMessageLite<
          QrCodeAddContact, QrCodeAddContact.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.QrCodeAddContact)
      QrCodeAddContactOrBuilder {
    private QrCodeAddContact() {
      phone_ = "";
      firstName_ = "";
      lastName_ = "";
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

    public static final int PHONE_FIELD_NUMBER = 2;
    private java.lang.String phone_;
    /**
     * <code>optional string phone = 2;</code>
     */
    public java.lang.String getPhone() {
      return phone_;
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    public com.google.protobuf.ByteString
        getPhoneBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(phone_);
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    private void setPhone(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      phone_ = value;
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    private void clearPhone() {
      
      phone_ = getDefaultInstance().getPhone();
    }
    /**
     * <code>optional string phone = 2;</code>
     */
    private void setPhoneBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      phone_ = value.toStringUtf8();
    }

    public static final int FIRST_NAME_FIELD_NUMBER = 3;
    private java.lang.String firstName_;
    /**
     * <code>optional string first_name = 3;</code>
     */
    public java.lang.String getFirstName() {
      return firstName_;
    }
    /**
     * <code>optional string first_name = 3;</code>
     */
    public com.google.protobuf.ByteString
        getFirstNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(firstName_);
    }
    /**
     * <code>optional string first_name = 3;</code>
     */
    private void setFirstName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      firstName_ = value;
    }
    /**
     * <code>optional string first_name = 3;</code>
     */
    private void clearFirstName() {
      
      firstName_ = getDefaultInstance().getFirstName();
    }
    /**
     * <code>optional string first_name = 3;</code>
     */
    private void setFirstNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      firstName_ = value.toStringUtf8();
    }

    public static final int LAST_NAME_FIELD_NUMBER = 4;
    private java.lang.String lastName_;
    /**
     * <code>optional string last_name = 4;</code>
     */
    public java.lang.String getLastName() {
      return lastName_;
    }
    /**
     * <code>optional string last_name = 4;</code>
     */
    public com.google.protobuf.ByteString
        getLastNameBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(lastName_);
    }
    /**
     * <code>optional string last_name = 4;</code>
     */
    private void setLastName(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      lastName_ = value;
    }
    /**
     * <code>optional string last_name = 4;</code>
     */
    private void clearLastName() {
      
      lastName_ = getDefaultInstance().getLastName();
    }
    /**
     * <code>optional string last_name = 4;</code>
     */
    private void setLastNameBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      lastName_ = value.toStringUtf8();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (!phone_.isEmpty()) {
        output.writeString(2, getPhone());
      }
      if (!firstName_.isEmpty()) {
        output.writeString(3, getFirstName());
      }
      if (!lastName_.isEmpty()) {
        output.writeString(4, getLastName());
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
      if (!phone_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getPhone());
      }
      if (!firstName_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(3, getFirstName());
      }
      if (!lastName_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(4, getLastName());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.QrCodeAddContact}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.QrCodeAddContact)
        net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactOrBuilder {
      // Construct using net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact.newBuilder()
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
       * <code>optional string phone = 2;</code>
       */
      public java.lang.String getPhone() {
        return instance.getPhone();
      }
      /**
       * <code>optional string phone = 2;</code>
       */
      public com.google.protobuf.ByteString
          getPhoneBytes() {
        return instance.getPhoneBytes();
      }
      /**
       * <code>optional string phone = 2;</code>
       */
      public Builder setPhone(
          java.lang.String value) {
        copyOnWrite();
        instance.setPhone(value);
        return this;
      }
      /**
       * <code>optional string phone = 2;</code>
       */
      public Builder clearPhone() {
        copyOnWrite();
        instance.clearPhone();
        return this;
      }
      /**
       * <code>optional string phone = 2;</code>
       */
      public Builder setPhoneBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setPhoneBytes(value);
        return this;
      }

      /**
       * <code>optional string first_name = 3;</code>
       */
      public java.lang.String getFirstName() {
        return instance.getFirstName();
      }
      /**
       * <code>optional string first_name = 3;</code>
       */
      public com.google.protobuf.ByteString
          getFirstNameBytes() {
        return instance.getFirstNameBytes();
      }
      /**
       * <code>optional string first_name = 3;</code>
       */
      public Builder setFirstName(
          java.lang.String value) {
        copyOnWrite();
        instance.setFirstName(value);
        return this;
      }
      /**
       * <code>optional string first_name = 3;</code>
       */
      public Builder clearFirstName() {
        copyOnWrite();
        instance.clearFirstName();
        return this;
      }
      /**
       * <code>optional string first_name = 3;</code>
       */
      public Builder setFirstNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setFirstNameBytes(value);
        return this;
      }

      /**
       * <code>optional string last_name = 4;</code>
       */
      public java.lang.String getLastName() {
        return instance.getLastName();
      }
      /**
       * <code>optional string last_name = 4;</code>
       */
      public com.google.protobuf.ByteString
          getLastNameBytes() {
        return instance.getLastNameBytes();
      }
      /**
       * <code>optional string last_name = 4;</code>
       */
      public Builder setLastName(
          java.lang.String value) {
        copyOnWrite();
        instance.setLastName(value);
        return this;
      }
      /**
       * <code>optional string last_name = 4;</code>
       */
      public Builder clearLastName() {
        copyOnWrite();
        instance.clearLastName();
        return this;
      }
      /**
       * <code>optional string last_name = 4;</code>
       */
      public Builder setLastNameBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setLastNameBytes(value);
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.QrCodeAddContact)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact();
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
          net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact other = (net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          phone_ = visitor.visitString(!phone_.isEmpty(), phone_,
              !other.phone_.isEmpty(), other.phone_);
          firstName_ = visitor.visitString(!firstName_.isEmpty(), firstName_,
              !other.firstName_.isEmpty(), other.firstName_);
          lastName_ = visitor.visitString(!lastName_.isEmpty(), lastName_,
              !other.lastName_.isEmpty(), other.lastName_);
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

                  phone_ = s;
                  break;
                }
                case 26: {
                  String s = input.readStringRequireUtf8();

                  firstName_ = s;
                  break;
                }
                case 34: {
                  String s = input.readStringRequireUtf8();

                  lastName_ = s;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact.class) {
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


    // @@protoc_insertion_point(class_scope:proto.QrCodeAddContact)
    private static final net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new QrCodeAddContact();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContact getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<QrCodeAddContact> PARSER;

    public static com.google.protobuf.Parser<QrCodeAddContact> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface QrCodeAddContactResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.QrCodeAddContactResponse)
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
   * Protobuf type {@code proto.QrCodeAddContactResponse}
   */
  public  static final class QrCodeAddContactResponse extends
      com.google.protobuf.GeneratedMessageLite<
          QrCodeAddContactResponse, QrCodeAddContactResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.QrCodeAddContactResponse)
      QrCodeAddContactResponseOrBuilder {
    private QrCodeAddContactResponse() {
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

    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.QrCodeAddContactResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.QrCodeAddContactResponse)
        net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse.newBuilder()
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

      // @@protoc_insertion_point(builder_scope:proto.QrCodeAddContactResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse();
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
          net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse other = (net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse) arg1;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.QrCodeAddContactResponse)
    private static final net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new QrCodeAddContactResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoQrCodeAddContact.QrCodeAddContactResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<QrCodeAddContactResponse> PARSER;

    public static com.google.protobuf.Parser<QrCodeAddContactResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
