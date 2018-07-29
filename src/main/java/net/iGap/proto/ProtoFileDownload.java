// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: FileDownload.proto

package net.iGap.proto;

public final class ProtoFileDownload {
  private ProtoFileDownload() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }
  public interface FileDownloadOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.FileDownload)
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
     * <code>optional int64 offset = 3;</code>
     */
    long getOffset();

    /**
     * <code>optional int32 max_limit = 4;</code>
     */
    int getMaxLimit();

    /**
     * <code>optional .proto.FileDownload.Selector selector = 5;</code>
     */
    int getSelectorValue();
    /**
     * <code>optional .proto.FileDownload.Selector selector = 5;</code>
     */
    net.iGap.proto.ProtoFileDownload.FileDownload.Selector getSelector();
  }
  /**
   * Protobuf type {@code proto.FileDownload}
   */
  public  static final class FileDownload extends
      com.google.protobuf.GeneratedMessageLite<
          FileDownload, FileDownload.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.FileDownload)
      FileDownloadOrBuilder {
    private FileDownload() {
      token_ = "";
    }
    /**
     * Protobuf enum {@code proto.FileDownload.Selector}
     */
    public enum Selector
        implements com.google.protobuf.Internal.EnumLite {
      /**
       * <code>FILE = 0;</code>
       */
      FILE(0),
      /**
       * <code>SMALL_THUMBNAIL = 1;</code>
       */
      SMALL_THUMBNAIL(1),
      /**
       * <code>LARGE_THUMBNAIL = 2;</code>
       */
      LARGE_THUMBNAIL(2),
      /**
       * <code>WAVEFORM_THUMBNAIL = 3;</code>
       */
      WAVEFORM_THUMBNAIL(3),
      UNRECOGNIZED(-1),
      ;

      /**
       * <code>FILE = 0;</code>
       */
      public static final int FILE_VALUE = 0;
      /**
       * <code>SMALL_THUMBNAIL = 1;</code>
       */
      public static final int SMALL_THUMBNAIL_VALUE = 1;
      /**
       * <code>LARGE_THUMBNAIL = 2;</code>
       */
      public static final int LARGE_THUMBNAIL_VALUE = 2;
      /**
       * <code>WAVEFORM_THUMBNAIL = 3;</code>
       */
      public static final int WAVEFORM_THUMBNAIL_VALUE = 3;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static Selector valueOf(int value) {
        return forNumber(value);
      }

      public static Selector forNumber(int value) {
        switch (value) {
          case 0: return FILE;
          case 1: return SMALL_THUMBNAIL;
          case 2: return LARGE_THUMBNAIL;
          case 3: return WAVEFORM_THUMBNAIL;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<Selector>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          Selector> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<Selector>() {
              public Selector findValueByNumber(int number) {
                return Selector.forNumber(number);
              }
            };

      private final int value;

      private Selector(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:proto.FileDownload.Selector)
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

    public static final int OFFSET_FIELD_NUMBER = 3;
    private long offset_;
    /**
     * <code>optional int64 offset = 3;</code>
     */
    public long getOffset() {
      return offset_;
    }
    /**
     * <code>optional int64 offset = 3;</code>
     */
    private void setOffset(long value) {
      
      offset_ = value;
    }
    /**
     * <code>optional int64 offset = 3;</code>
     */
    private void clearOffset() {
      
      offset_ = 0L;
    }

    public static final int MAX_LIMIT_FIELD_NUMBER = 4;
    private int maxLimit_;
    /**
     * <code>optional int32 max_limit = 4;</code>
     */
    public int getMaxLimit() {
      return maxLimit_;
    }
    /**
     * <code>optional int32 max_limit = 4;</code>
     */
    private void setMaxLimit(int value) {
      
      maxLimit_ = value;
    }
    /**
     * <code>optional int32 max_limit = 4;</code>
     */
    private void clearMaxLimit() {
      
      maxLimit_ = 0;
    }

    public static final int SELECTOR_FIELD_NUMBER = 5;
    private int selector_;
    /**
     * <code>optional .proto.FileDownload.Selector selector = 5;</code>
     */
    public int getSelectorValue() {
      return selector_;
    }
    /**
     * <code>optional .proto.FileDownload.Selector selector = 5;</code>
     */
    public net.iGap.proto.ProtoFileDownload.FileDownload.Selector getSelector() {
      net.iGap.proto.ProtoFileDownload.FileDownload.Selector result = net.iGap.proto.ProtoFileDownload.FileDownload.Selector.forNumber(selector_);
      return result == null ? net.iGap.proto.ProtoFileDownload.FileDownload.Selector.UNRECOGNIZED : result;
    }
    /**
     * <code>optional .proto.FileDownload.Selector selector = 5;</code>
     */
    private void setSelectorValue(int value) {
        selector_ = value;
    }
    /**
     * <code>optional .proto.FileDownload.Selector selector = 5;</code>
     */
    private void setSelector(net.iGap.proto.ProtoFileDownload.FileDownload.Selector value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      selector_ = value.getNumber();
    }
    /**
     * <code>optional .proto.FileDownload.Selector selector = 5;</code>
     */
    private void clearSelector() {
      
      selector_ = 0;
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (request_ != null) {
        output.writeMessage(1, getRequest());
      }
      if (!token_.isEmpty()) {
        output.writeString(2, getToken());
      }
      if (offset_ != 0L) {
        output.writeInt64(3, offset_);
      }
      if (maxLimit_ != 0) {
        output.writeInt32(4, maxLimit_);
      }
      if (selector_ != net.iGap.proto.ProtoFileDownload.FileDownload.Selector.FILE.getNumber()) {
        output.writeEnum(5, selector_);
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
      if (offset_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt64Size(3, offset_);
      }
      if (maxLimit_ != 0) {
        size += com.google.protobuf.CodedOutputStream
          .computeInt32Size(4, maxLimit_);
      }
      if (selector_ != net.iGap.proto.ProtoFileDownload.FileDownload.Selector.FILE.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(5, selector_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownload parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoFileDownload.FileDownload prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.FileDownload}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoFileDownload.FileDownload, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.FileDownload)
        net.iGap.proto.ProtoFileDownload.FileDownloadOrBuilder {
      // Construct using net.iGap.proto.ProtoFileDownload.FileDownload.newBuilder()
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
       * <code>optional int64 offset = 3;</code>
       */
      public long getOffset() {
        return instance.getOffset();
      }
      /**
       * <code>optional int64 offset = 3;</code>
       */
      public Builder setOffset(long value) {
        copyOnWrite();
        instance.setOffset(value);
        return this;
      }
      /**
       * <code>optional int64 offset = 3;</code>
       */
      public Builder clearOffset() {
        copyOnWrite();
        instance.clearOffset();
        return this;
      }

      /**
       * <code>optional int32 max_limit = 4;</code>
       */
      public int getMaxLimit() {
        return instance.getMaxLimit();
      }
      /**
       * <code>optional int32 max_limit = 4;</code>
       */
      public Builder setMaxLimit(int value) {
        copyOnWrite();
        instance.setMaxLimit(value);
        return this;
      }
      /**
       * <code>optional int32 max_limit = 4;</code>
       */
      public Builder clearMaxLimit() {
        copyOnWrite();
        instance.clearMaxLimit();
        return this;
      }

      /**
       * <code>optional .proto.FileDownload.Selector selector = 5;</code>
       */
      public int getSelectorValue() {
        return instance.getSelectorValue();
      }
      /**
       * <code>optional .proto.FileDownload.Selector selector = 5;</code>
       */
      public Builder setSelectorValue(int value) {
        copyOnWrite();
        instance.setSelectorValue(value);
        return this;
      }
      /**
       * <code>optional .proto.FileDownload.Selector selector = 5;</code>
       */
      public net.iGap.proto.ProtoFileDownload.FileDownload.Selector getSelector() {
        return instance.getSelector();
      }
      /**
       * <code>optional .proto.FileDownload.Selector selector = 5;</code>
       */
      public Builder setSelector(net.iGap.proto.ProtoFileDownload.FileDownload.Selector value) {
        copyOnWrite();
        instance.setSelector(value);
        return this;
      }
      /**
       * <code>optional .proto.FileDownload.Selector selector = 5;</code>
       */
      public Builder clearSelector() {
        copyOnWrite();
        instance.clearSelector();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.FileDownload)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoFileDownload.FileDownload();
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
          net.iGap.proto.ProtoFileDownload.FileDownload other = (net.iGap.proto.ProtoFileDownload.FileDownload) arg1;
          request_ = visitor.visitMessage(request_, other.request_);
          token_ = visitor.visitString(!token_.isEmpty(), token_,
              !other.token_.isEmpty(), other.token_);
          offset_ = visitor.visitLong(offset_ != 0L, offset_,
              other.offset_ != 0L, other.offset_);
          maxLimit_ = visitor.visitInt(maxLimit_ != 0, maxLimit_,
              other.maxLimit_ != 0, other.maxLimit_);
          selector_ = visitor.visitInt(selector_ != 0, selector_,    other.selector_ != 0, other.selector_);
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

                  offset_ = input.readInt64();
                  break;
                }
                case 32: {

                  maxLimit_ = input.readInt32();
                  break;
                }
                case 40: {
                  int rawValue = input.readEnum();

                  selector_ = rawValue;
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoFileDownload.FileDownload.class) {
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


    // @@protoc_insertion_point(class_scope:proto.FileDownload)
    private static final net.iGap.proto.ProtoFileDownload.FileDownload DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FileDownload();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoFileDownload.FileDownload getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<FileDownload> PARSER;

    public static com.google.protobuf.Parser<FileDownload> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }

  public interface FileDownloadResponseOrBuilder extends
      // @@protoc_insertion_point(interface_extends:proto.FileDownloadResponse)
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
     * <code>optional bytes bytes = 4;</code>
     */
    com.google.protobuf.ByteString getBytes();
  }
  /**
   * Protobuf type {@code proto.FileDownloadResponse}
   */
  public  static final class FileDownloadResponse extends
      com.google.protobuf.GeneratedMessageLite<
          FileDownloadResponse, FileDownloadResponse.Builder> implements
      // @@protoc_insertion_point(message_implements:proto.FileDownloadResponse)
      FileDownloadResponseOrBuilder {
    private FileDownloadResponse() {
      bytes_ = com.google.protobuf.ByteString.EMPTY;
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

    public static final int BYTES_FIELD_NUMBER = 4;
    private com.google.protobuf.ByteString bytes_;
    /**
     * <code>optional bytes bytes = 4;</code>
     */
    public com.google.protobuf.ByteString getBytes() {
      return bytes_;
    }
    /**
     * <code>optional bytes bytes = 4;</code>
     */
    private void setBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
    throw new NullPointerException();
  }
  
      bytes_ = value;
    }
    /**
     * <code>optional bytes bytes = 4;</code>
     */
    private void clearBytes() {
      
      bytes_ = getDefaultInstance().getBytes();
    }

    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (response_ != null) {
        output.writeMessage(1, getResponse());
      }
      if (!bytes_.isEmpty()) {
        output.writeBytes(4, bytes_);
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
      if (!bytes_.isEmpty()) {
        size += com.google.protobuf.CodedOutputStream
          .computeBytesSize(4, bytes_);
      }
      memoizedSerializedSize = size;
      return size;
    }

    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, data, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return parseDelimitedFrom(DEFAULT_INSTANCE, input, extensionRegistry);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input);
    }
    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageLite.parseFrom(
          DEFAULT_INSTANCE, input, extensionRegistry);
    }

    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(net.iGap.proto.ProtoFileDownload.FileDownloadResponse prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }

    /**
     * Protobuf type {@code proto.FileDownloadResponse}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageLite.Builder<
          net.iGap.proto.ProtoFileDownload.FileDownloadResponse, Builder> implements
        // @@protoc_insertion_point(builder_implements:proto.FileDownloadResponse)
        net.iGap.proto.ProtoFileDownload.FileDownloadResponseOrBuilder {
      // Construct using net.iGap.proto.ProtoFileDownload.FileDownloadResponse.newBuilder()
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
       * <code>optional bytes bytes = 4;</code>
       */
      public com.google.protobuf.ByteString getBytes() {
        return instance.getBytes();
      }
      /**
       * <code>optional bytes bytes = 4;</code>
       */
      public Builder setBytes(com.google.protobuf.ByteString value) {
        copyOnWrite();
        instance.setBytes(value);
        return this;
      }
      /**
       * <code>optional bytes bytes = 4;</code>
       */
      public Builder clearBytes() {
        copyOnWrite();
        instance.clearBytes();
        return this;
      }

      // @@protoc_insertion_point(builder_scope:proto.FileDownloadResponse)
    }
    protected final Object dynamicMethod(
        com.google.protobuf.GeneratedMessageLite.MethodToInvoke method,
        Object arg0, Object arg1) {
      switch (method) {
        case NEW_MUTABLE_INSTANCE: {
          return new net.iGap.proto.ProtoFileDownload.FileDownloadResponse();
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
          net.iGap.proto.ProtoFileDownload.FileDownloadResponse other = (net.iGap.proto.ProtoFileDownload.FileDownloadResponse) arg1;
          response_ = visitor.visitMessage(response_, other.response_);
          bytes_ = visitor.visitByteString(bytes_ != com.google.protobuf.ByteString.EMPTY, bytes_,
              other.bytes_ != com.google.protobuf.ByteString.EMPTY, other.bytes_);
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
                case 34: {

                  bytes_ = input.readBytes();
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
          if (PARSER == null) {    synchronized (net.iGap.proto.ProtoFileDownload.FileDownloadResponse.class) {
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


    // @@protoc_insertion_point(class_scope:proto.FileDownloadResponse)
    private static final net.iGap.proto.ProtoFileDownload.FileDownloadResponse DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new FileDownloadResponse();
      DEFAULT_INSTANCE.makeImmutable();
    }

    public static net.iGap.proto.ProtoFileDownload.FileDownloadResponse getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static volatile com.google.protobuf.Parser<FileDownloadResponse> PARSER;

    public static com.google.protobuf.Parser<FileDownloadResponse> parser() {
      return DEFAULT_INSTANCE.getParserForType();
    }
  }


  static {
  }

  // @@protoc_insertion_point(outer_class_scope)
}
