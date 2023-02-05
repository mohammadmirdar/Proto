// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

package net.iGap.proto;

public final class ProtoRequest {
  private ProtoRequest() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.Request)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <code>optional string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <code>optional string token = 2;</code>
     */
    java.lang.String getToken();
    /**
     * <code>optional string token = 2;</code>
     */
    com.google.protobuf.ByteString
        getTokenBytes();
  }
  /**
   * Protobuf type {@code proto.Request}
   */
  public  static final class Request extends
      com.google.protobuf.GeneratedMessageLite<
          Request, Request.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.Request)
      RequestOrBuilder {
    private Request() {
      id_ = "";
      token_ = "";
    }
    public static final int ID_FIELD_NUMBER = 1;
    private java.lang.String id_;
    /**
     * <code>optional string id = 1;</code>
     */
    public java.lang.String getId() {
      return id_;
    }
    /**
     * <code>optional string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      return com.google.protobuf.ByteString.copyFromUtf8(id_);
    }
    /**
     * <code>optional string id = 1;</code>
     */
    private void setId(
        java.lang.String value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      id_ = value;
    }
    /**
     * <code>optional string id = 1;</code>
     */
    private void clearId() {
      
      id_ = getDefaultInstance().getId();
    }
    /**
     * <code>optional string id = 1;</code>
     */
    private void setIdBytes(
        com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
      
      id_ = value.toStringUtf8();
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

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!id_.isEmpty()) {
        output.writeString(1, getId());
      }
      if (!token_.isEmpty()) {
        output.writeString(2, getToken());
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (!id_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(1, getId());
      }
      if (!token_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeStringSize(2, getToken());
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoRequest.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoRequest.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoRequest.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoRequest.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoRequest.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoRequest.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoRequest.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoRequest.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoRequest.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoRequest.Request parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoRequest.Request prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoRequest.Request, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.Request)
        net.iGap.proto.ProtoRequest.RequestOrBuilder {
      // Construct using net.iGap.proto.ProtoRequest.Request.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional string id = 1;</code>
       */
      public java.lang.String getId() {
        return instance.getId();
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        return instance.getIdBytes();
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        copyOnWrite();
        instance.setId(value);
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder clearId() {
        copyOnWrite();
        instance.clearId();
        return this;
      }
      /**
       * <code>optional string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setIdBytes(value);
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

      // @@protoc_insertion_point(builder_scope:proto.Request)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoRequest.Request();
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
          net.iGap.proto.ProtoRequest.Request other = (net.iGap.proto.ProtoRequest.Request) arg1;
          id_ = visitor.visitString(!id_.isEmpty(), id_,
              !other.id_.isEmpty(), other.id_);
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
                  String s = input.readStringRequireUtf8();

                  id_ = s;
                  break;
                }
                case 18: {
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoRequest.Request.class) {
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


    // @@protoc_insertion_point(class_scope:proto.Request)
    private static final net.iGap.proto.ProtoRequest.Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new Request();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoRequest.Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<Request> PARSER;

    public static com.google.protobuf.Parser<Request> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
