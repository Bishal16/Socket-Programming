package protoClass;// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Request.proto

public final class RequestOuterClass {
  private RequestOuterClass() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface RequestOrBuilder extends
      // @@protoc_insertion_point(interface_extends:Request)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>string callingNumber = 1;</code>
     * @return The callingNumber.
     */
    java.lang.String getCallingNumber();
    /**
     * <code>string callingNumber = 1;</code>
     * @return The bytes for callingNumber.
     */
    com.google.protobuf.ByteString
        getCallingNumberBytes();

    /**
     * <code>string calledNumber = 2;</code>
     * @return The calledNumber.
     */
    java.lang.String getCalledNumber();
    /**
     * <code>string calledNumber = 2;</code>
     * @return The bytes for calledNumber.
     */
    com.google.protobuf.ByteString
        getCalledNumberBytes();

    /**
     * <code>string callerIp = 3;</code>
     * @return The callerIp.
     */
    java.lang.String getCallerIp();
    /**
     * <code>string callerIp = 3;</code>
     * @return The bytes for callerIp.
     */
    com.google.protobuf.ByteString
        getCallerIpBytes();

    /**
     * <code>string callId = 4;</code>
     * @return The callId.
     */
    java.lang.String getCallId();
    /**
     * <code>string callId = 4;</code>
     * @return The bytes for callId.
     */
    com.google.protobuf.ByteString
        getCallIdBytes();
  }
  /**
   * Protobuf type {@code Request}
   */
  public static final class Request extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:Request)
      RequestOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use Request.newBuilder() to construct.
    private Request(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private Request() {
      callingNumber_ = "";
      calledNumber_ = "";
      callerIp_ = "";
      callId_ = "";
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new Request();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private Request(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      com.google.protobuf.UnknownFieldSet.Builder unknownFields =
          com.google.protobuf.UnknownFieldSet.newBuilder();
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 10: {
              java.lang.String s = input.readStringRequireUtf8();

              callingNumber_ = s;
              break;
            }
            case 18: {
              java.lang.String s = input.readStringRequireUtf8();

              calledNumber_ = s;
              break;
            }
            case 26: {
              java.lang.String s = input.readStringRequireUtf8();

              callerIp_ = s;
              break;
            }
            case 34: {
              java.lang.String s = input.readStringRequireUtf8();

              callId_ = s;
              break;
            }
            default: {
              if (!parseUnknownField(
                  input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
          }
        }
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.setUnfinishedMessage(this);
      } catch (java.io.IOException e) {
        throw new com.google.protobuf.InvalidProtocolBufferException(
            e).setUnfinishedMessage(this);
      } finally {
        this.unknownFields = unknownFields.build();
        makeExtensionsImmutable();
      }
    }
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return RequestOuterClass.internal_static_Request_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return RequestOuterClass.internal_static_Request_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              RequestOuterClass.Request.class, RequestOuterClass.Request.Builder.class);
    }

    public static final int CALLINGNUMBER_FIELD_NUMBER = 1;
    private volatile java.lang.Object callingNumber_;
    /**
     * <code>string callingNumber = 1;</code>
     * @return The callingNumber.
     */
    @java.lang.Override
    public java.lang.String getCallingNumber() {
      java.lang.Object ref = callingNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callingNumber_ = s;
        return s;
      }
    }
    /**
     * <code>string callingNumber = 1;</code>
     * @return The bytes for callingNumber.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCallingNumberBytes() {
      java.lang.Object ref = callingNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callingNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CALLEDNUMBER_FIELD_NUMBER = 2;
    private volatile java.lang.Object calledNumber_;
    /**
     * <code>string calledNumber = 2;</code>
     * @return The calledNumber.
     */
    @java.lang.Override
    public java.lang.String getCalledNumber() {
      java.lang.Object ref = calledNumber_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        calledNumber_ = s;
        return s;
      }
    }
    /**
     * <code>string calledNumber = 2;</code>
     * @return The bytes for calledNumber.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCalledNumberBytes() {
      java.lang.Object ref = calledNumber_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        calledNumber_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CALLERIP_FIELD_NUMBER = 3;
    private volatile java.lang.Object callerIp_;
    /**
     * <code>string callerIp = 3;</code>
     * @return The callerIp.
     */
    @java.lang.Override
    public java.lang.String getCallerIp() {
      java.lang.Object ref = callerIp_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callerIp_ = s;
        return s;
      }
    }
    /**
     * <code>string callerIp = 3;</code>
     * @return The bytes for callerIp.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCallerIpBytes() {
      java.lang.Object ref = callerIp_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callerIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int CALLID_FIELD_NUMBER = 4;
    private volatile java.lang.Object callId_;
    /**
     * <code>string callId = 4;</code>
     * @return The callId.
     */
    @java.lang.Override
    public java.lang.String getCallId() {
      java.lang.Object ref = callId_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        callId_ = s;
        return s;
      }
    }
    /**
     * <code>string callId = 4;</code>
     * @return The bytes for callId.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString
        getCallIdBytes() {
      java.lang.Object ref = callId_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        callId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
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
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callingNumber_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, callingNumber_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(calledNumber_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 2, calledNumber_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callerIp_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 3, callerIp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callId_)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 4, callId_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callingNumber_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, callingNumber_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(calledNumber_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, calledNumber_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callerIp_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, callerIp_);
      }
      if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(callId_)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, callId_);
      }
      size += unknownFields.getSerializedSize();
      memoizedSize = size;
      return size;
    }

    @java.lang.Override
    public boolean equals(final java.lang.Object obj) {
      if (obj == this) {
       return true;
      }
      if (!(obj instanceof RequestOuterClass.Request)) {
        return super.equals(obj);
      }
      RequestOuterClass.Request other = (RequestOuterClass.Request) obj;

      if (!getCallingNumber()
          .equals(other.getCallingNumber())) return false;
      if (!getCalledNumber()
          .equals(other.getCalledNumber())) return false;
      if (!getCallerIp()
          .equals(other.getCallerIp())) return false;
      if (!getCallId()
          .equals(other.getCallId())) return false;
      if (!unknownFields.equals(other.unknownFields)) return false;
      return true;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      hash = (37 * hash) + CALLINGNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getCallingNumber().hashCode();
      hash = (37 * hash) + CALLEDNUMBER_FIELD_NUMBER;
      hash = (53 * hash) + getCalledNumber().hashCode();
      hash = (37 * hash) + CALLERIP_FIELD_NUMBER;
      hash = (53 * hash) + getCallerIp().hashCode();
      hash = (37 * hash) + CALLID_FIELD_NUMBER;
      hash = (53 * hash) + getCallId().hashCode();
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static RequestOuterClass.Request parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestOuterClass.Request parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestOuterClass.Request parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static RequestOuterClass.Request parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestOuterClass.Request parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestOuterClass.Request parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static RequestOuterClass.Request parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static RequestOuterClass.Request parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static RequestOuterClass.Request parseFrom(
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
    public static Builder newBuilder(RequestOuterClass.Request prototype) {
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
     * Protobuf type {@code Request}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:Request)
        RequestOuterClass.RequestOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return RequestOuterClass.internal_static_Request_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return RequestOuterClass.internal_static_Request_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                RequestOuterClass.Request.class, RequestOuterClass.Request.Builder.class);
      }

      // Construct using RequestOuterClass.Request.newBuilder()
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
        }
      }
      @java.lang.Override
      public Builder clear() {
        super.clear();
        callingNumber_ = "";

        calledNumber_ = "";

        callerIp_ = "";

        callId_ = "";

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return RequestOuterClass.internal_static_Request_descriptor;
      }

      @java.lang.Override
      public RequestOuterClass.Request getDefaultInstanceForType() {
        return RequestOuterClass.Request.getDefaultInstance();
      }

      @java.lang.Override
      public RequestOuterClass.Request build() {
        RequestOuterClass.Request result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public RequestOuterClass.Request buildPartial() {
        RequestOuterClass.Request result = new RequestOuterClass.Request(this);
        result.callingNumber_ = callingNumber_;
        result.calledNumber_ = calledNumber_;
        result.callerIp_ = callerIp_;
        result.callId_ = callId_;
        onBuilt();
        return result;
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
        if (other instanceof RequestOuterClass.Request) {
          return mergeFrom((RequestOuterClass.Request)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(RequestOuterClass.Request other) {
        if (other == RequestOuterClass.Request.getDefaultInstance()) return this;
        if (!other.getCallingNumber().isEmpty()) {
          callingNumber_ = other.callingNumber_;
          onChanged();
        }
        if (!other.getCalledNumber().isEmpty()) {
          calledNumber_ = other.calledNumber_;
          onChanged();
        }
        if (!other.getCallerIp().isEmpty()) {
          callerIp_ = other.callerIp_;
          onChanged();
        }
        if (!other.getCallId().isEmpty()) {
          callId_ = other.callId_;
          onChanged();
        }
        this.mergeUnknownFields(other.unknownFields);
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
        RequestOuterClass.Request parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (RequestOuterClass.Request) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private java.lang.Object callingNumber_ = "";
      /**
       * <code>string callingNumber = 1;</code>
       * @return The callingNumber.
       */
      public java.lang.String getCallingNumber() {
        java.lang.Object ref = callingNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          callingNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string callingNumber = 1;</code>
       * @return The bytes for callingNumber.
       */
      public com.google.protobuf.ByteString
          getCallingNumberBytes() {
        java.lang.Object ref = callingNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          callingNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string callingNumber = 1;</code>
       * @param value The callingNumber to set.
       * @return This builder for chaining.
       */
      public Builder setCallingNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        callingNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string callingNumber = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearCallingNumber() {
        
        callingNumber_ = getDefaultInstance().getCallingNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string callingNumber = 1;</code>
       * @param value The bytes for callingNumber to set.
       * @return This builder for chaining.
       */
      public Builder setCallingNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        callingNumber_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object calledNumber_ = "";
      /**
       * <code>string calledNumber = 2;</code>
       * @return The calledNumber.
       */
      public java.lang.String getCalledNumber() {
        java.lang.Object ref = calledNumber_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          calledNumber_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string calledNumber = 2;</code>
       * @return The bytes for calledNumber.
       */
      public com.google.protobuf.ByteString
          getCalledNumberBytes() {
        java.lang.Object ref = calledNumber_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          calledNumber_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string calledNumber = 2;</code>
       * @param value The calledNumber to set.
       * @return This builder for chaining.
       */
      public Builder setCalledNumber(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        calledNumber_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string calledNumber = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearCalledNumber() {
        
        calledNumber_ = getDefaultInstance().getCalledNumber();
        onChanged();
        return this;
      }
      /**
       * <code>string calledNumber = 2;</code>
       * @param value The bytes for calledNumber to set.
       * @return This builder for chaining.
       */
      public Builder setCalledNumberBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        calledNumber_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object callerIp_ = "";
      /**
       * <code>string callerIp = 3;</code>
       * @return The callerIp.
       */
      public java.lang.String getCallerIp() {
        java.lang.Object ref = callerIp_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          callerIp_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string callerIp = 3;</code>
       * @return The bytes for callerIp.
       */
      public com.google.protobuf.ByteString
          getCallerIpBytes() {
        java.lang.Object ref = callerIp_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          callerIp_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string callerIp = 3;</code>
       * @param value The callerIp to set.
       * @return This builder for chaining.
       */
      public Builder setCallerIp(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        callerIp_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string callerIp = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearCallerIp() {
        
        callerIp_ = getDefaultInstance().getCallerIp();
        onChanged();
        return this;
      }
      /**
       * <code>string callerIp = 3;</code>
       * @param value The bytes for callerIp to set.
       * @return This builder for chaining.
       */
      public Builder setCallerIpBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        callerIp_ = value;
        onChanged();
        return this;
      }

      private java.lang.Object callId_ = "";
      /**
       * <code>string callId = 4;</code>
       * @return The callId.
       */
      public java.lang.String getCallId() {
        java.lang.Object ref = callId_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          callId_ = s;
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <code>string callId = 4;</code>
       * @return The bytes for callId.
       */
      public com.google.protobuf.ByteString
          getCallIdBytes() {
        java.lang.Object ref = callId_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          callId_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <code>string callId = 4;</code>
       * @param value The callId to set.
       * @return This builder for chaining.
       */
      public Builder setCallId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  
        callId_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>string callId = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearCallId() {
        
        callId_ = getDefaultInstance().getCallId();
        onChanged();
        return this;
      }
      /**
       * <code>string callId = 4;</code>
       * @param value The bytes for callId to set.
       * @return This builder for chaining.
       */
      public Builder setCallIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  checkByteStringIsUtf8(value);
        
        callId_ = value;
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


      // @@protoc_insertion_point(builder_scope:Request)
    }

    // @@protoc_insertion_point(class_scope:Request)
    private static final RequestOuterClass.Request DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new RequestOuterClass.Request();
    }

    public static RequestOuterClass.Request getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<Request>
        PARSER = new com.google.protobuf.AbstractParser<Request>() {
      @java.lang.Override
      public Request parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new Request(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<Request> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<Request> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public RequestOuterClass.Request getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_Request_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_Request_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\rRequest.proto\"X\n\007Request\022\025\n\rcallingNum" +
      "ber\030\001 \001(\t\022\024\n\014calledNumber\030\002 \001(\t\022\020\n\010calle" +
      "rIp\030\003 \001(\t\022\016\n\006callId\030\004 \001(\tb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_Request_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_Request_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_Request_descriptor,
        new java.lang.String[] { "CallingNumber", "CalledNumber", "CallerIp", "CallId", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
