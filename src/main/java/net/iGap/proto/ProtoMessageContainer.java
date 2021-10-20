// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: MessageContainer.proto

package net.iGap.proto;

public final class ProtoMessageContainer {
  private ProtoMessageContainer() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface MessageContainerOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.MessageContainer)
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
     * <code>optional uint32 action_id = 2;</code>
     */
    int getActionId();

    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    long getTimestamp();

    /**
     * <code>optional bytes wrapped_proto = 4;</code>
     */
    com.google.protobuf.ByteString getWrappedProto();
  }
  /**
   * Protobuf type {@code proto.MessageContainer}
   */
  public  static final class MessageContainer extends
      com.google.protobuf.GeneratedMessageLite<
          MessageContainer, MessageContainer.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.MessageContainer)
      MessageContainerOrBuilder {
    private MessageContainer() {
      id_ = "";
      wrappedProto_ = com.google.protobuf.ByteString.EMPTY;
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

    public static final int ACTION_ID_FIELD_NUMBER = 2;
    private int actionId_;
    /**
     * <code>optional uint32 action_id = 2;</code>
     */
    public int getActionId() {
      return actionId_;
    }
    /**
     * <code>optional uint32 action_id = 2;</code>
     */
    private void setActionId(int value) {
      
      actionId_ = value;
    }
    /**
     * <code>optional uint32 action_id = 2;</code>
     */
    private void clearActionId() {
      
      actionId_ = 0;
    }

    public static final int TIMESTAMP_FIELD_NUMBER = 3;
    private long timestamp_;
    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    private void setTimestamp(long value) {
      
      timestamp_ = value;
    }
    /**
     * <code>optional uint64 timestamp = 3;</code>
     */
    private void clearTimestamp() {
      
      timestamp_ = 0L;
    }

    public static final int WRAPPED_PROTO_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString wrappedProto_;
    /**
     * <code>optional bytes wrapped_proto = 4;</code>
     */
    public com.google.protobuf.ByteString getWrappedProto() {
      return wrappedProto_;
    }
    /**
     * <code>optional bytes wrapped_proto = 4;</code>
     */
    private void setWrappedProto(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      wrappedProto_ = value;
    }
    /**
     * <code>optional bytes wrapped_proto = 4;</code>
     */
    private void clearWrappedProto() {
      
      wrappedProto_ = getDefaultInstance().getWrappedProto();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (!id_.isEmpty()) {
        output.writeString(1, getId());
      }
      if (actionId_ != 0) {
        output.writeUInt32(2, actionId_);
      }
      if (timestamp_ != 0L) {
        output.writeUInt64(3, timestamp_);
      }
      if (!wrappedProto_.isEmpty()) {
        output.writeBytes(4, wrappedProto_);
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
      if (actionId_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(2, actionId_);
      }
      if (timestamp_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(3, timestamp_);
      }
      if (!wrappedProto_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, wrappedProto_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoMessageContainer.MessageContainer parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoMessageContainer.MessageContainer prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.MessageContainer}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoMessageContainer.MessageContainer, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.MessageContainer)
        net.iGap.proto.ProtoMessageContainer.MessageContainerOrBuilder {
      // Construct using net.iGap.proto.ProtoMessageContainer.MessageContainer.newBuilder()
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
       * <code>optional uint32 action_id = 2;</code>
       */
      public int getActionId() {
        return instance.getActionId();
      }
      /**
       * <code>optional uint32 action_id = 2;</code>
       */
      public Builder setActionId(int value) {
        copyOnWrite();
        instance.setActionId(value);
        return this;
      }
      /**
       * <code>optional uint32 action_id = 2;</code>
       */
      public Builder clearActionId() {
        copyOnWrite();
        instance.clearActionId();
        return this;
      }

      /**
       * <code>optional uint64 timestamp = 3;</code>
       */
      public long getTimestamp() {
        return instance.getTimestamp();
      }
      /**
       * <code>optional uint64 timestamp = 3;</code>
       */
      public Builder setTimestamp(long value) {
        copyOnWrite();
        instance.setTimestamp(value);
        return this;
      }
      /**
       * <code>optional uint64 timestamp = 3;</code>
       */
      public Builder clearTimestamp() {
        copyOnWrite();
        instance.clearTimestamp();
        return this;
      }

      /**
       * <code>optional bytes wrapped_proto = 4;</code>
       */
      public com.google.protobuf.ByteString getWrappedProto() {
        return instance.getWrappedProto();
      }
      /**
       * <code>optional bytes wrapped_proto = 4;</code>
       */
      public Builder setWrappedProto(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setWrappedProto(value);
        return this;
      }
      /**
       * <code>optional bytes wrapped_proto = 4;</code>
       */
      public Builder clearWrappedProto() {
        copyOnWrite();
        instance.clearWrappedProto();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.MessageContainer)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoMessageContainer.MessageContainer();
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
          net.iGap.proto.ProtoMessageContainer.MessageContainer other = (net.iGap.proto.ProtoMessageContainer.MessageContainer) arg1;
          id_ = visitor.visitString(!id_.isEmpty(), id_,
              !other.id_.isEmpty(), other.id_);
          actionId_ = visitor.visitInt(actionId_ != 0, actionId_,
              other.actionId_ != 0, other.actionId_);
          timestamp_ = visitor.visitLong(timestamp_ != 0L, timestamp_,
              other.timestamp_ != 0L, other.timestamp_);
          wrappedProto_ = visitor.visitByteString(wrappedProto_ != com.google.protobuf.ByteString.EMPTY, wrappedProto_,
              other.wrappedProto_ != com.google.protobuf.ByteString.EMPTY, other.wrappedProto_);
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
                case 16: {

                  actionId_ = input.readUInt32();
                  break;
                }
                case 24: {

                  timestamp_ = input.readUInt64();
                  break;
                }
                case 34: {

                  wrappedProto_ = input.readBytes();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoMessageContainer.MessageContainer.class) {
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


    // @@protoc_insertion_point(class_scope:proto.MessageContainer)
    private static final net.iGap.proto.ProtoMessageContainer.MessageContainer DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new MessageContainer();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoMessageContainer.MessageContainer getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<MessageContainer> PARSER;

    public static com.google.protobuf.Parser<MessageContainer> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
