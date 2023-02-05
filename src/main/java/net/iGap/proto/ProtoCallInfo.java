// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: CallInfo.proto

package net.iGap.proto;

public final class ProtoCallInfo {
  private ProtoCallInfo() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface CallInfoOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.CallInfo)
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
     * <code>optional int64 call_id = 2;</code>
     */
    long getCallId();
  }
  /**
   * Protobuf type {@code proto.CallInfo}
   */
  public  static final class CallInfo extends
      com.google.protobuf.GeneratedMessageLite<
          CallInfo, CallInfo.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.CallInfo)
      CallInfoOrBuilder {
    private CallInfo() {
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

    public static final int CALL_ID_FIELD_NUMBER = 2;
    private long callId_;
    /**
     * <code>optional int64 call_id = 2;</code>
     */
    public long getCallId() {
      return callId_;
    }
    /**
     * <code>optional int64 call_id = 2;</code>
     */
    private void setCallId(long value) {
      
      callId_ = value;
    }
    /**
     * <code>optional int64 call_id = 2;</code>
     */
    private void clearCallId() {
      
      callId_ = 0L;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (callId_ != 0L) {
        output.writeInt64(2, callId_);
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
      if (callId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, callId_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfo parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoCallInfo.CallInfo prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.CallInfo}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoCallInfo.CallInfo, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.CallInfo)
        net.iGap.proto.ProtoCallInfo.CallInfoOrBuilder {
      // Construct using net.iGap.proto.ProtoCallInfo.CallInfo.newBuilder()
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
       * <code>optional int64 call_id = 2;</code>
       */
      public long getCallId() {
        return instance.getCallId();
      }
      /**
       * <code>optional int64 call_id = 2;</code>
       */
      public Builder setCallId(long value) {
        copyOnWrite();
        instance.setCallId(value);
        return this;
      }
      /**
       * <code>optional int64 call_id = 2;</code>
       */
      public Builder clearCallId() {
        copyOnWrite();
        instance.clearCallId();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.CallInfo)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoCallInfo.CallInfo();
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
          net.iGap.proto.ProtoCallInfo.CallInfo other = (net.iGap.proto.ProtoCallInfo.CallInfo) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          callId_ = visitor.visitLong(callId_ != 0L, callId_,
              other.callId_ != 0L, other.callId_);
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
                case 16: {

                  callId_ = input.readInt64();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoCallInfo.CallInfo.class) {
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


    // @@protoc_insertion_point(class_scope:proto.CallInfo)
    private static final net.iGap.proto.ProtoCallInfo.CallInfo DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CallInfo();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoCallInfo.CallInfo getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<CallInfo> PARSER;

    public static com.google.protobuf.Parser<CallInfo> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface CallInfoResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.CallInfoResponse)
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
     * <code>optional int64 create_at = 2;</code>
     */
    long getCreateAt();

    /**
     * <code>optional int64 call_id = 3;</code>
     */
    long getCallId();

    /**
     * <code>optional int64 phone_number = 4;</code>
     */
    long getPhoneNumber();

    /**
     * <code>optional uint32 duration = 5;</code>
     */
    int getDuration();

    /**
     * <code>optional uint32 price = 6;</code>
     */
    int getPrice();

    /**
     * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
     */
    int getFinalStateValue();
    /**
     * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
     */
    net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum getFinalState();
  }
  /**
   * Protobuf type {@code proto.CallInfoResponse}
   */
  public  static final class CallInfoResponse extends
      com.google.protobuf.GeneratedMessageLite<
          CallInfoResponse, CallInfoResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.CallInfoResponse)
      CallInfoResponseOrBuilder {
    private CallInfoResponse() {
    }
    /**
     * Protobuf enum {@code proto.CallInfoResponse.FinalStateEnum}
     */
    public enum FinalStateEnum
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>UNKNOWN = 0;</code>
       */
      UNKNOWN(0),
      /**
       * <code>DONE = 1;</code>
       */
      DONE(1),
      /**
       * <code>BUSY = 2;</code>
       */
      BUSY(2),
      /**
       * <code>ROUTE_ERROR = 3;</code>
       */
      ROUTE_ERROR(3),
      /**
       * <code>REJECT = 4;</code>
       */
      REJECT(4),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>UNKNOWN = 0;</code>
       */
      public static final int UNKNOWN_VALUE = 0;
      /**
       * <code>DONE = 1;</code>
       */
      public static final int DONE_VALUE = 1;
      /**
       * <code>BUSY = 2;</code>
       */
      public static final int BUSY_VALUE = 2;
      /**
       * <code>ROUTE_ERROR = 3;</code>
       */
      public static final int ROUTE_ERROR_VALUE = 3;
      /**
       * <code>REJECT = 4;</code>
       */
      public static final int REJECT_VALUE = 4;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static FinalStateEnum valueOf(int value) {
        return forNumber(value);
      }

      public static FinalStateEnum forNumber(int value) {
        switch (value) {
          case 0: return UNKNOWN;
          case 1: return DONE;
          case 2: return BUSY;
          case 3: return ROUTE_ERROR;
          case 4: return REJECT;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<FinalStateEnum>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          FinalStateEnum> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<FinalStateEnum>() {
              public FinalStateEnum findValueByNumber(int number) {
                return FinalStateEnum.forNumber(number);
              }
            };

      private final int value;

      private FinalStateEnum(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:proto.CallInfoResponse.FinalStateEnum)
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

    public static final int CREATE_AT_FIELD_NUMBER = 2;
    private long createAt_;
    /**
     * <code>optional int64 create_at = 2;</code>
     */
    public long getCreateAt() {
      return createAt_;
    }
    /**
     * <code>optional int64 create_at = 2;</code>
     */
    private void setCreateAt(long value) {
      
      createAt_ = value;
    }
    /**
     * <code>optional int64 create_at = 2;</code>
     */
    private void clearCreateAt() {
      
      createAt_ = 0L;
    }

    public static final int CALL_ID_FIELD_NUMBER = 3;
    private long callId_;
    /**
     * <code>optional int64 call_id = 3;</code>
     */
    public long getCallId() {
      return callId_;
    }
    /**
     * <code>optional int64 call_id = 3;</code>
     */
    private void setCallId(long value) {
      
      callId_ = value;
    }
    /**
     * <code>optional int64 call_id = 3;</code>
     */
    private void clearCallId() {
      
      callId_ = 0L;
    }

    public static final int PHONE_NUMBER_FIELD_NUMBER = 4;
    private long phoneNumber_;
    /**
     * <code>optional int64 phone_number = 4;</code>
     */
    public long getPhoneNumber() {
      return phoneNumber_;
    }
    /**
     * <code>optional int64 phone_number = 4;</code>
     */
    private void setPhoneNumber(long value) {
      
      phoneNumber_ = value;
    }
    /**
     * <code>optional int64 phone_number = 4;</code>
     */
    private void clearPhoneNumber() {
      
      phoneNumber_ = 0L;
    }

    public static final int DURATION_FIELD_NUMBER = 5;
    private int duration_;
    /**
     * <code>optional uint32 duration = 5;</code>
     */
    public int getDuration() {
      return duration_;
    }
    /**
     * <code>optional uint32 duration = 5;</code>
     */
    private void setDuration(int value) {
      
      duration_ = value;
    }
    /**
     * <code>optional uint32 duration = 5;</code>
     */
    private void clearDuration() {
      
      duration_ = 0;
    }

    public static final int PRICE_FIELD_NUMBER = 6;
    private int price_;
    /**
     * <code>optional uint32 price = 6;</code>
     */
    public int getPrice() {
      return price_;
    }
    /**
     * <code>optional uint32 price = 6;</code>
     */
    private void setPrice(int value) {
      
      price_ = value;
    }
    /**
     * <code>optional uint32 price = 6;</code>
     */
    private void clearPrice() {
      
      price_ = 0;
    }

    public static final int FINALSTATE_FIELD_NUMBER = 7;
    private int finalState_;
    /**
     * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
     */
    public int getFinalStateValue() {
      return finalState_;
    }
    /**
     * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
     */
    public net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum getFinalState() {
      net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum result = net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum.forNumber(finalState_);
      return result == null ? net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
     */
    private void setFinalStateValue(int value) {
        finalState_ = value;
    }
    /**
     * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
     */
    private void setFinalState(net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      finalState_ = value.getNumber();
    }
    /**
     * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
     */
    private void clearFinalState() {
      
      finalState_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (createAt_ != 0L) {
        output.writeInt64(2, createAt_);
      }
      if (callId_ != 0L) {
        output.writeInt64(3, callId_);
      }
      if (phoneNumber_ != 0L) {
        output.writeInt64(4, phoneNumber_);
      }
      if (duration_ != 0) {
        output.writeUInt32(5, duration_);
      }
      if (price_ != 0) {
        output.writeUInt32(6, price_);
      }
      if (finalState_ != net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum.UNKNOWN.getNumber()) {
        output.writeEnum(7, finalState_);
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
      if (createAt_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(2, createAt_);
      }
      if (callId_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, callId_);
      }
      if (phoneNumber_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(4, phoneNumber_);
      }
      if (duration_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(5, duration_);
      }
      if (price_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt32Size(6, price_);
      }
      if (finalState_ != net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum.UNKNOWN.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(7, finalState_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoCallInfo.CallInfoResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.CallInfoResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoCallInfo.CallInfoResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.CallInfoResponse)
        net.iGap.proto.ProtoCallInfo.CallInfoResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoCallInfo.CallInfoResponse.newBuilder()
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
       * <code>optional int64 create_at = 2;</code>
       */
      public long getCreateAt() {
        return instance.getCreateAt();
      }
      /**
       * <code>optional int64 create_at = 2;</code>
       */
      public Builder setCreateAt(long value) {
        copyOnWrite();
        instance.setCreateAt(value);
        return this;
      }
      /**
       * <code>optional int64 create_at = 2;</code>
       */
      public Builder clearCreateAt() {
        copyOnWrite();
        instance.clearCreateAt();
        return this;
      }

      /**
       * <code>optional int64 call_id = 3;</code>
       */
      public long getCallId() {
        return instance.getCallId();
      }
      /**
       * <code>optional int64 call_id = 3;</code>
       */
      public Builder setCallId(long value) {
        copyOnWrite();
        instance.setCallId(value);
        return this;
      }
      /**
       * <code>optional int64 call_id = 3;</code>
       */
      public Builder clearCallId() {
        copyOnWrite();
        instance.clearCallId();
        return this;
      }

      /**
       * <code>optional int64 phone_number = 4;</code>
       */
      public long getPhoneNumber() {
        return instance.getPhoneNumber();
      }
      /**
       * <code>optional int64 phone_number = 4;</code>
       */
      public Builder setPhoneNumber(long value) {
        copyOnWrite();
        instance.setPhoneNumber(value);
        return this;
      }
      /**
       * <code>optional int64 phone_number = 4;</code>
       */
      public Builder clearPhoneNumber() {
        copyOnWrite();
        instance.clearPhoneNumber();
        return this;
      }

      /**
       * <code>optional uint32 duration = 5;</code>
       */
      public int getDuration() {
        return instance.getDuration();
      }
      /**
       * <code>optional uint32 duration = 5;</code>
       */
      public Builder setDuration(int value) {
        copyOnWrite();
        instance.setDuration(value);
        return this;
      }
      /**
       * <code>optional uint32 duration = 5;</code>
       */
      public Builder clearDuration() {
        copyOnWrite();
        instance.clearDuration();
        return this;
      }

      /**
       * <code>optional uint32 price = 6;</code>
       */
      public int getPrice() {
        return instance.getPrice();
      }
      /**
       * <code>optional uint32 price = 6;</code>
       */
      public Builder setPrice(int value) {
        copyOnWrite();
        instance.setPrice(value);
        return this;
      }
      /**
       * <code>optional uint32 price = 6;</code>
       */
      public Builder clearPrice() {
        copyOnWrite();
        instance.clearPrice();
        return this;
      }

      /**
       * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
       */
      public int getFinalStateValue() {
        return instance.getFinalStateValue();
      }
      /**
       * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
       */
      public Builder setFinalStateValue(int value) {
        copyOnWrite();
        instance.setFinalStateValue(value);
        return this;
      }
      /**
       * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
       */
      public net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum getFinalState() {
        return instance.getFinalState();
      }
      /**
       * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
       */
      public Builder setFinalState(net.iGap.proto.ProtoCallInfo.CallInfoResponse.FinalStateEnum value) {
        copyOnWrite();
        instance.setFinalState(value);
        return this;
      }
      /**
       * <code>optional .proto.CallInfoResponse.FinalStateEnum finalState = 7;</code>
       */
      public Builder clearFinalState() {
        copyOnWrite();
        instance.clearFinalState();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.CallInfoResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoCallInfo.CallInfoResponse();
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
          net.iGap.proto.ProtoCallInfo.CallInfoResponse other = (net.iGap.proto.ProtoCallInfo.CallInfoResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          createAt_ = visitor.visitLong(createAt_ != 0L, createAt_,
              other.createAt_ != 0L, other.createAt_);
          callId_ = visitor.visitLong(callId_ != 0L, callId_,
              other.callId_ != 0L, other.callId_);
          phoneNumber_ = visitor.visitLong(phoneNumber_ != 0L, phoneNumber_,
              other.phoneNumber_ != 0L, other.phoneNumber_);
          duration_ = visitor.visitInt(duration_ != 0, duration_,
              other.duration_ != 0, other.duration_);
          price_ = visitor.visitInt(price_ != 0, price_,
              other.price_ != 0, other.price_);
          finalState_ = visitor.visitInt(finalState_ != 0, finalState_,    other.finalState_ != 0, other.finalState_);
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

                  createAt_ = input.readInt64();
                  break;
                }
                case 24: {

                  callId_ = input.readInt64();
                  break;
                }
                case 32: {

                  phoneNumber_ = input.readInt64();
                  break;
                }
                case 40: {

                  duration_ = input.readUInt32();
                  break;
                }
                case 48: {

                  price_ = input.readUInt32();
                  break;
                }
                case 56: {
                  int rawValue = input.readEnum();

                  finalState_ = rawValue;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoCallInfo.CallInfoResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.CallInfoResponse)
    private static final net.iGap.proto.ProtoCallInfo.CallInfoResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new CallInfoResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoCallInfo.CallInfoResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<CallInfoResponse> PARSER;

    public static com.google.protobuf.Parser<CallInfoResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
