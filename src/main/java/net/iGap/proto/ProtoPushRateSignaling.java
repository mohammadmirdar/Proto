// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: PushRateSignaling.proto

// Protobuf Java Version: 3.25.1
package net.iGap.proto;

public final class ProtoPushRateSignaling {
  private ProtoPushRateSignaling() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface PushRateSignalingResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.PushRateSignalingResponse)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>.proto.Response response = 1;</code>
     * @return Whether the response field is set.
     */
    boolean hasResponse();
    /**
     * <code>.proto.Response response = 1;</code>
     * @return The response.
     */
    net.iGap.proto.ProtoResponse.Response getResponse();
    /**
     * <code>.proto.Response response = 1;</code>
     */
    net.iGap.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder();

    /**
     * <code>uint64 id = 2;</code>
     * @return The id.
     */
    long getId();
  }
  /**
   * Protobuf type {@code proto.PushRateSignalingResponse}
   */
  public static final class PushRateSignalingResponse extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:proto.PushRateSignalingResponse)
      PushRateSignalingResponseOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use PushRateSignalingResponse.newBuilder() to construct.
    private PushRateSignalingResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private PushRateSignalingResponse() {
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new PushRateSignalingResponse();
    }

    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return net.iGap.proto.ProtoPushRateSignaling.internal_static_proto_PushRateSignalingResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return net.iGap.proto.ProtoPushRateSignaling.internal_static_proto_PushRateSignalingResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse.class, net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse.Builder.class);
    }

    private int bitField0_;
    public static final int RESPONSE_FIELD_NUMBER = 1;
    private net.iGap.proto.ProtoResponse.Response response_;
    /**
     * <code>.proto.Response response = 1;</code>
     * @return Whether the response field is set.
     */
    @java.lang.Override
    public boolean hasResponse() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>.proto.Response response = 1;</code>
     * @return The response.
     */
    @java.lang.Override
    public net.iGap.proto.ProtoResponse.Response getResponse() {
      return response_ == null ? net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }
    /**
     * <code>.proto.Response response = 1;</code>
     */
    @java.lang.Override
    public net.iGap.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder() {
      return response_ == null ? net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
    }

    public static final int ID_FIELD_NUMBER = 2;
    private long id_ = 0L;
    /**
     * <code>uint64 id = 2;</code>
     * @return The id.
     */
    @java.lang.Override
    public long getId() {
      return id_;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) != 0)) {
        output.writeMessage(1, getResponse());
      }
      if (id_ != 0L) {
        output.writeUInt64(2, id_);
      }
      getUnknownFields().writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) != 0)) {
        size += com.google.protobuf.CodedOutputStream
          .computeMessageSize(1, getResponse());
      }
      if (id_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(2, id_);
      }
      size += getUnknownFields().getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse)) {
        return super.equals(obj);
      }
      net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse other = (net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse) obj;

      if (hasResponse() != other.hasResponse()) return false;
      if (hasResponse()) {
        if (!getResponse()
            .equals(other.getResponse())) return false;
      }
      if (getId()
          != other.getId()) return false;
      if (!getUnknownFields().equals(other.getUnknownFields())) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasResponse()) {
        hash = (37 * hash) + RESPONSE_FIELD_NUMBER;
        hash = (53 * hash) + getResponse().hashCode();
      }
      hash = (37 * hash) + ID_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getId());
      hash = (29 * hash) + getUnknownFields().hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }

    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

    @java.lang.Override
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
    @java.lang.Override
    public Builder toBuilder() {
      return this == DEFAULT_INSTANCE
          ? new Builder() : new Builder().mergeFrom(this);
    }

    @java.lang.Override
    protected Builder newBuilderForType(
        com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      Builder builder = new Builder(parent);
      return builder;
    }
    /**
     * Protobuf type {@code proto.PushRateSignalingResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.PushRateSignalingResponse)
        net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponseOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return net.iGap.proto.ProtoPushRateSignaling.internal_static_proto_PushRateSignalingResponse_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return net.iGap.proto.ProtoPushRateSignaling.internal_static_proto_PushRateSignalingResponse_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse.class, net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse.Builder.class);
      }

      // Construct using net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse.newBuilder()
      private Builder() {
        maybeForceBuilderInitialization();
      }

      private Builder(
          com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
        super(parent);
        maybeForceBuilderInitialization();
      }
      private void maybeForceBuilderInitialization() {
        if (com.google.protobuf.GeneratedMessageV3
                .alwaysUseFieldBuilders) {
          getResponseFieldBuilder();
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        bitField0_ = 0;
        response_ = null;
        if (responseBuilder_ != null) {
          responseBuilder_.dispose();
          responseBuilder_ = null;
        }
        id_ = 0L;
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return net.iGap.proto.ProtoPushRateSignaling.internal_static_proto_PushRateSignalingResponse_descriptor;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse getDefaultInstanceForType() {
        return net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse.getDefaultInstance();
      }

      @java.lang.Override
      public net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse build() {
        net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse buildPartial() {
        net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse result = new net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse(this);
        if (bitField0_ != 0) { buildPartial0(result); }
        onBuilt();
        return result;
      }

      private void buildPartial0(net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse result) {
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) != 0)) {
          result.response_ = responseBuilder_ == null
              ? response_
              : responseBuilder_.build();
          to_bitField0_ |= 0x00000001;
        }
        if (((from_bitField0_ & 0x00000002) != 0)) {
          result.id_ = id_;
        }
        result.bitField0_ |= to_bitField0_;
      }

      @java.lang.Override
      public Builder clone() {
        return super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse) {
          return mergeFrom((net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse other) {
        if (other == net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse.getDefaultInstance()) return this;
        if (other.hasResponse()) {
          mergeResponse(other.getResponse());
        }
        if (other.getId() != 0L) {
          setId(other.getId());
        }
        this.mergeUnknownFields(other.getUnknownFields());
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        if (extensionRegistry == null) {
          throw new java.lang.NullPointerException();
        }
        try {
          boolean done = false;
          while (!done) {
            int tag = input.readTag();
            switch (tag) {
              case 0:
                done = true;
                break;
              case 10: {
                input.readMessage(
                    getResponseFieldBuilder().getBuilder(),
                    extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
              case 16: {
                id_ = input.readUInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
              default: {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
            } // switch (tag)
          } // while (!done)
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.unwrapIOException();
        } finally {
          onChanged();
        } // finally
        return this;
      }
      private int bitField0_;

      private net.iGap.proto.ProtoResponse.Response response_;
      private com.google.protobuf.SingleFieldBuilderV3<
          net.iGap.proto.ProtoResponse.Response, net.iGap.proto.ProtoResponse.Response.Builder, net.iGap.proto.ProtoResponse.ResponseOrBuilder> responseBuilder_;
      /**
       * <code>.proto.Response response = 1;</code>
       * @return Whether the response field is set.
       */
      public boolean hasResponse() {
        return ((bitField0_ & 0x00000001) != 0);
      }
      /**
       * <code>.proto.Response response = 1;</code>
       * @return The response.
       */
      public net.iGap.proto.ProtoResponse.Response getResponse() {
        if (responseBuilder_ == null) {
          return response_ == null ? net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
        } else {
          return responseBuilder_.getMessage();
        }
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder setResponse(net.iGap.proto.ProtoResponse.Response value) {
        if (responseBuilder_ == null) {
          if (value == null) {
            throw new NullPointerException();
          }
          response_ = value;
        } else {
          responseBuilder_.setMessage(value);
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder setResponse(
          net.iGap.proto.ProtoResponse.Response.Builder builderForValue) {
        if (responseBuilder_ == null) {
          response_ = builderForValue.build();
        } else {
          responseBuilder_.setMessage(builderForValue.build());
        }
        bitField0_ |= 0x00000001;
        onChanged();
        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder mergeResponse(net.iGap.proto.ProtoResponse.Response value) {
        if (responseBuilder_ == null) {
          if (((bitField0_ & 0x00000001) != 0) &&
            response_ != null &&
            response_ != net.iGap.proto.ProtoResponse.Response.getDefaultInstance()) {
            getResponseBuilder().mergeFrom(value);
          } else {
            response_ = value;
          }
        } else {
          responseBuilder_.mergeFrom(value);
        }
        if (response_ != null) {
          bitField0_ |= 0x00000001;
          onChanged();
        }
        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public Builder clearResponse() {
        bitField0_ = (bitField0_ & ~0x00000001);
        response_ = null;
        if (responseBuilder_ != null) {
          responseBuilder_.dispose();
          responseBuilder_ = null;
        }
        onChanged();
        return this;
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public net.iGap.proto.ProtoResponse.Response.Builder getResponseBuilder() {
        bitField0_ |= 0x00000001;
        onChanged();
        return getResponseFieldBuilder().getBuilder();
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      public net.iGap.proto.ProtoResponse.ResponseOrBuilder getResponseOrBuilder() {
        if (responseBuilder_ != null) {
          return responseBuilder_.getMessageOrBuilder();
        } else {
          return response_ == null ?
              net.iGap.proto.ProtoResponse.Response.getDefaultInstance() : response_;
        }
      }
      /**
       * <code>.proto.Response response = 1;</code>
       */
      private com.google.protobuf.SingleFieldBuilderV3<
          net.iGap.proto.ProtoResponse.Response, net.iGap.proto.ProtoResponse.Response.Builder, net.iGap.proto.ProtoResponse.ResponseOrBuilder> 
          getResponseFieldBuilder() {
        if (responseBuilder_ == null) {
          responseBuilder_ = new com.google.protobuf.SingleFieldBuilderV3<
              net.iGap.proto.ProtoResponse.Response, net.iGap.proto.ProtoResponse.Response.Builder, net.iGap.proto.ProtoResponse.ResponseOrBuilder>(
                  getResponse(),
                  getParentForChildren(),
                  isClean());
          response_ = null;
        }
        return responseBuilder_;
      }

      private long id_ ;
      /**
       * <code>uint64 id = 2;</code>
       * @return The id.
       */
      @java.lang.Override
      public long getId() {
        return id_;
      }
      /**
       * <code>uint64 id = 2;</code>
       * @param value The id to set.
       * @return This builder for chaining.
       */
      public Builder setId(long value) {

        id_ = value;
        bitField0_ |= 0x00000002;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 id = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000002);
        id_ = 0L;
        onChanged();
        return this;
      }
      @java.lang.Override
      public final Builder setUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.setUnknownFields(unknownFields);
      }

      @java.lang.Override
      public final Builder mergeUnknownFields(
          final com.google.protobuf.UnknownFieldSet unknownFields) {
        return super.mergeUnknownFields(unknownFields);
      }


      // @@protoc_insertion_point(builder_scope:proto.PushRateSignalingResponse)
    }

    // @@protoc_insertion_point(class_scope:proto.PushRateSignalingResponse)
    private static final net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse();
    }

    public static net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<PushRateSignalingResponse>
        PARSER = new com.google.protobuf.AbstractParser<PushRateSignalingResponse>() {
      @java.lang.Override
      public PushRateSignalingResponse parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        Builder builder = newBuilder();
        try {
          builder.mergeFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          throw e.setUnfinishedMessage(builder.buildPartial());
        } catch (com.google.protobuf.UninitializedMessageException e) {
          throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
        } catch (java.io.IOException e) {
          throw new com.google.protobuf.InvalidProtocolBufferException(e)
              .setUnfinishedMessage(builder.buildPartial());
        }
        return builder.buildPartial();
      }
    };

    public static com.google.protobuf.Parser<PushRateSignalingResponse> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<PushRateSignalingResponse> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public net.iGap.proto.ProtoPushRateSignaling.PushRateSignalingResponse getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_proto_PushRateSignalingResponse_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_proto_PushRateSignalingResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\027PushRateSignaling.proto\022\005proto\032\016Respon" +
      "se.proto\"J\n\031PushRateSignalingResponse\022!\n" +
      "\010response\030\001 \001(\0132\017.proto.Response\022\n\n\002id\030\002" +
      " \001(\004B(\n\016net.iGap.protoB\026ProtoPushRateSig" +
      "nalingb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          net.iGap.proto.ProtoResponse.getDescriptor(),
        });
    internal_static_proto_PushRateSignalingResponse_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_proto_PushRateSignalingResponse_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_proto_PushRateSignalingResponse_descriptor,
        new java.lang.String[] { "Response", "Id", });
    net.iGap.proto.ProtoResponse.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
