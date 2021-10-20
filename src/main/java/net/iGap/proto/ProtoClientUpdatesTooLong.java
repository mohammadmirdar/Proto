// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ClientUpdatesTooLong.proto

package net.iGap.proto;

public final class ProtoClientUpdatesTooLong {
  private ProtoClientUpdatesTooLong() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface ClientUpdatesTooLongOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.updatequeue.ClientUpdatesTooLong)
      com.google.protobuf.MessageLiteOrBuilder {

    /**
     * <code>optional uint64 user_id = 1;</code>
     */
    long getUserId();
  }
  /**
   * Protobuf type {@code proto.updatequeue.ClientUpdatesTooLong}
   */
  public  static final class ClientUpdatesTooLong extends
      com.google.protobuf.GeneratedMessageLite<
          ClientUpdatesTooLong, ClientUpdatesTooLong.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.updatequeue.ClientUpdatesTooLong)
      ClientUpdatesTooLongOrBuilder {
    private ClientUpdatesTooLong() {
    }
    public static final int USER_ID_FIELD_NUMBER = 1;
    private long userId_;
    /**
     * <code>optional uint64 user_id = 1;</code>
     */
    public long getUserId() {
      return userId_;
    }
    /**
     * <code>optional uint64 user_id = 1;</code>
     */
    private void setUserId(long value) {
      
      userId_ = value;
    }
    /**
     * <code>optional uint64 user_id = 1;</code>
     */
    private void clearUserId() {
      
      userId_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (userId_ != 0L) {
        output.writeUInt64(1, userId_);
      }
    }

    public int getSerializedSize() {
      int size = memoizedSerializedSize;
      if (size != -1) return size;

      size = 0;
      if (userId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, userId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.updatequeue.ClientUpdatesTooLong}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.updatequeue.ClientUpdatesTooLong)
        net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLongOrBuilder {
      // Construct using net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.newBuilder()
      private Builder() {
        super(DEFAULT_INSTANCE);
      }


      /**
       * <code>optional uint64 user_id = 1;</code>
       */
      public long getUserId() {
        return instance.getUserId();
      }
      /**
       * <code>optional uint64 user_id = 1;</code>
       */
      public Builder setUserId(long value) {
        copyOnWrite();
        instance.setUserId(value);
        return this;
      }
      /**
       * <code>optional uint64 user_id = 1;</code>
       */
      public Builder clearUserId() {
        copyOnWrite();
        instance.clearUserId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.updatequeue.ClientUpdatesTooLong)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong();
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
          net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong other = (net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong) arg1;
          userId_ = visitor.visitLong(userId_ != 0L, userId_,
              other.userId_ != 0L, other.userId_);
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
                case 8: {

                  userId_ = input.readUInt64();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong.class) {
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


    // @@protoc_insertion_point(class_scope:proto.updatequeue.ClientUpdatesTooLong)
    private static final net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new ClientUpdatesTooLong();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoClientUpdatesTooLong.ClientUpdatesTooLong getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<ClientUpdatesTooLong> PARSER;

    public static com.google.protobuf.Parser<ClientUpdatesTooLong> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}