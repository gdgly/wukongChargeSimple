// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: IDTokenType.proto

package com.zhicheng.wukongcharge.models;

public final class IDTokenTypeProto {
  private IDTokenTypeProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface IDTokenTypeOrBuilder extends
      // @@protoc_insertion_point(interface_extends:IDTokenType)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <pre>
     *存放卡ID，或者手机唯�?识别ID
     * </pre>
     *
     * <code>required string id = 1;</code>
     */
    boolean hasId();
    /**
     * <pre>
     *存放卡ID，或者手机唯�?识别ID
     * </pre>
     *
     * <code>required string id = 1;</code>
     */
    java.lang.String getId();
    /**
     * <pre>
     *存放卡ID，或者手机唯�?识别ID
     * </pre>
     *
     * <code>required string id = 1;</code>
     */
    com.google.protobuf.ByteString
        getIdBytes();

    /**
     * <pre>
     *触发验证类型
     * </pre>
     *
     * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
     */
    boolean hasType();
    /**
     * <pre>
     *触发验证类型
     * </pre>
     *
     * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
     */
    com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType getType();
  }
  /**
   * Protobuf type {@code IDTokenType}
   */
  public  static final class IDTokenType extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:IDTokenType)
      IDTokenTypeOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use IDTokenType.newBuilder() to construct.
    private IDTokenType(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private IDTokenType() {
      id_ = "";
      type_ = 0;
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private IDTokenType(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      this();
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      int mutable_bitField0_ = 0;
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
              com.google.protobuf.ByteString bs = input.readBytes();
              bitField0_ |= 0x00000001;
              id_ = bs;
              break;
            }
            case 16: {
              int rawValue = input.readEnum();
                @SuppressWarnings("deprecation")
              com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType value = com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType.valueOf(rawValue);
              if (value == null) {
                unknownFields.mergeVarintField(2, rawValue);
              } else {
                bitField0_ |= 0x00000002;
                type_ = rawValue;
              }
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
      return com.zhicheng.wukongcharge.models.IDTokenTypeProto.internal_static_IDTokenType_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.zhicheng.wukongcharge.models.IDTokenTypeProto.internal_static_IDTokenType_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.class, com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.Builder.class);
    }

    /**
     * Protobuf enum {@code IDTokenType.IDTokenEnumType}
     */
    public enum IDTokenEnumType
        implements com.google.protobuf.ProtocolMessageEnum {
      /**
       * <pre>
       *后台生成的一串uuid
       * </pre>
       *
       * <code>Central = 0;</code>
       */
      Central(0),
      /**
       * <pre>
       *手机唯一识别
       * </pre>
       *
       * <code>eMAID = 1;</code>
       */
      eMAID(1),
      /**
       * <pre>
       *nfc卡卡ID
       * </pre>
       *
       * <code>ISO14443 = 2;</code>
       */
      ISO14443(2),
      /**
       * <code>Local = 3;</code>
       */
      Local(3),
      /**
       * <pre>
       *用户手动输入PinCode充电
       * </pre>
       *
       * <code>PinCode = 4;</code>
       */
      PinCode(4),
      /**
       * <pre>
       *ISO 15693 uid of RFID card
       * </pre>
       *
       * <code>ISO15693 = 5;</code>
       */
      ISO15693(5),
      /**
       * <code>NoAuthorization = 6;</code>
       */
      NoAuthorization(6),
      ;

      /**
       * <pre>
       *后台生成的一串uuid
       * </pre>
       *
       * <code>Central = 0;</code>
       */
      public static final int Central_VALUE = 0;
      /**
       * <pre>
       *手机唯一识别
       * </pre>
       *
       * <code>eMAID = 1;</code>
       */
      public static final int eMAID_VALUE = 1;
      /**
       * <pre>
       *nfc卡卡ID
       * </pre>
       *
       * <code>ISO14443 = 2;</code>
       */
      public static final int ISO14443_VALUE = 2;
      /**
       * <code>Local = 3;</code>
       */
      public static final int Local_VALUE = 3;
      /**
       * <pre>
       *用户手动输入PinCode充电
       * </pre>
       *
       * <code>PinCode = 4;</code>
       */
      public static final int PinCode_VALUE = 4;
      /**
       * <pre>
       *ISO 15693 uid of RFID card
       * </pre>
       *
       * <code>ISO15693 = 5;</code>
       */
      public static final int ISO15693_VALUE = 5;
      /**
       * <code>NoAuthorization = 6;</code>
       */
      public static final int NoAuthorization_VALUE = 6;


      public final int getNumber() {
        return value;
      }

      /**
       * @deprecated Use {@link #forNumber(int)} instead.
       */
      @java.lang.Deprecated
      public static IDTokenEnumType valueOf(int value) {
        return forNumber(value);
      }

      public static IDTokenEnumType forNumber(int value) {
        switch (value) {
          case 0: return Central;
          case 1: return eMAID;
          case 2: return ISO14443;
          case 3: return Local;
          case 4: return PinCode;
          case 5: return ISO15693;
          case 6: return NoAuthorization;
          default: return null;
        }
      }

      public static com.google.protobuf.Internal.EnumLiteMap<IDTokenEnumType>
          internalGetValueMap() {
        return internalValueMap;
      }
      private static final com.google.protobuf.Internal.EnumLiteMap<
          IDTokenEnumType> internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<IDTokenEnumType>() {
              public IDTokenEnumType findValueByNumber(int number) {
                return IDTokenEnumType.forNumber(number);
              }
            };

      public final com.google.protobuf.Descriptors.EnumValueDescriptor
          getValueDescriptor() {
        return getDescriptor().getValues().get(ordinal());
      }
      public final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptorForType() {
        return getDescriptor();
      }
      public static final com.google.protobuf.Descriptors.EnumDescriptor
          getDescriptor() {
        return com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.getDescriptor().getEnumTypes().get(0);
      }

      private static final IDTokenEnumType[] VALUES = values();

      public static IDTokenEnumType valueOf(
          com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
        if (desc.getType() != getDescriptor()) {
          throw new java.lang.IllegalArgumentException(
            "EnumValueDescriptor is not for this type.");
        }
        return VALUES[desc.getIndex()];
      }

      private final int value;

      private IDTokenEnumType(int value) {
        this.value = value;
      }

      // @@protoc_insertion_point(enum_scope:IDTokenType.IDTokenEnumType)
    }

    private int bitField0_;
    public static final int ID_FIELD_NUMBER = 1;
    private volatile java.lang.Object id_;
    /**
     * <pre>
     *存放卡ID，或者手机唯�?识别ID
     * </pre>
     *
     * <code>required string id = 1;</code>
     */
    public boolean hasId() {
      return ((bitField0_ & 0x00000001) == 0x00000001);
    }
    /**
     * <pre>
     *存放卡ID，或者手机唯�?识别ID
     * </pre>
     *
     * <code>required string id = 1;</code>
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        return (java.lang.String) ref;
      } else {
        com.google.protobuf.ByteString bs = 
            (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (bs.isValidUtf8()) {
          id_ = s;
        }
        return s;
      }
    }
    /**
     * <pre>
     *存放卡ID，或者手机唯�?识别ID
     * </pre>
     *
     * <code>required string id = 1;</code>
     */
    public com.google.protobuf.ByteString
        getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof java.lang.String) {
        com.google.protobuf.ByteString b = 
            com.google.protobuf.ByteString.copyFromUtf8(
                (java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }

    public static final int TYPE_FIELD_NUMBER = 2;
    private int type_;
    /**
     * <pre>
     *触发验证类型
     * </pre>
     *
     * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
     */
    public boolean hasType() {
      return ((bitField0_ & 0x00000002) == 0x00000002);
    }
    /**
     * <pre>
     *触发验证类型
     * </pre>
     *
     * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
     */
    public com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType getType() {
      @SuppressWarnings("deprecation")
      com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType result = com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType.valueOf(type_);
      return result == null ? com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType.Central : result;
    }

    private byte memoizedIsInitialized = -1;
    @java.lang.Override
    public final boolean isInitialized() {
      byte isInitialized = memoizedIsInitialized;
      if (isInitialized == 1) return true;
      if (isInitialized == 0) return false;

      if (!hasId()) {
        memoizedIsInitialized = 0;
        return false;
      }
      if (!hasType()) {
        memoizedIsInitialized = 0;
        return false;
      }
      memoizedIsInitialized = 1;
      return true;
    }

    @java.lang.Override
    public void writeTo(com.google.protobuf.CodedOutputStream output)
                        throws java.io.IOException {
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        output.writeEnum(2, type_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (((bitField0_ & 0x00000001) == 0x00000001)) {
        size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
      }
      if (((bitField0_ & 0x00000002) == 0x00000002)) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, type_);
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
      if (!(obj instanceof com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType)) {
        return super.equals(obj);
      }
      com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType other = (com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType) obj;

      boolean result = true;
      result = result && (hasId() == other.hasId());
      if (hasId()) {
        result = result && getId()
            .equals(other.getId());
      }
      result = result && (hasType() == other.hasType());
      if (hasType()) {
        result = result && type_ == other.type_;
      }
      result = result && unknownFields.equals(other.unknownFields);
      return result;
    }

    @java.lang.Override
    public int hashCode() {
      if (memoizedHashCode != 0) {
        return memoizedHashCode;
      }
      int hash = 41;
      hash = (19 * hash) + getDescriptor().hashCode();
      if (hasId()) {
        hash = (37 * hash) + ID_FIELD_NUMBER;
        hash = (53 * hash) + getId().hashCode();
      }
      if (hasType()) {
        hash = (37 * hash) + TYPE_FIELD_NUMBER;
        hash = (53 * hash) + type_;
      }
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parseFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }

     
    public Builder newBuilderForType() { return newBuilder(); }
    public static Builder newBuilder() {
      return DEFAULT_INSTANCE.toBuilder();
    }
    public static Builder newBuilder(com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType prototype) {
      return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
    }
     
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
     * Protobuf type {@code IDTokenType}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:IDTokenType)
        com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenTypeOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return com.zhicheng.wukongcharge.models.IDTokenTypeProto.internal_static_IDTokenType_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return com.zhicheng.wukongcharge.models.IDTokenTypeProto.internal_static_IDTokenType_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.class, com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.Builder.class);
      }

      // Construct using com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.newBuilder()
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
        id_ = "";
        bitField0_ = (bitField0_ & ~0x00000001);
        type_ = 0;
        bitField0_ = (bitField0_ & ~0x00000002);
        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return com.zhicheng.wukongcharge.models.IDTokenTypeProto.internal_static_IDTokenType_descriptor;
      }

       
      public com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType getDefaultInstanceForType() {
        return com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.getDefaultInstance();
      }

       
      public com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType build() {
        com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

       
      public com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType buildPartial() {
        com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType result = new com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType(this);
        int from_bitField0_ = bitField0_;
        int to_bitField0_ = 0;
        if (((from_bitField0_ & 0x00000001) == 0x00000001)) {
          to_bitField0_ |= 0x00000001;
        }
        result.id_ = id_;
        if (((from_bitField0_ & 0x00000002) == 0x00000002)) {
          to_bitField0_ |= 0x00000002;
        }
        result.type_ = type_;
        result.bitField0_ = to_bitField0_;
        onBuilt();
        return result;
      }

      @java.lang.Override
      public Builder clone() {
        return (Builder) super.clone();
      }
      @java.lang.Override
      public Builder setField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.setField(field, value);
      }
      @java.lang.Override
      public Builder clearField(
          com.google.protobuf.Descriptors.FieldDescriptor field) {
        return (Builder) super.clearField(field);
      }
      @java.lang.Override
      public Builder clearOneof(
          com.google.protobuf.Descriptors.OneofDescriptor oneof) {
        return (Builder) super.clearOneof(oneof);
      }
      @java.lang.Override
      public Builder setRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          int index, java.lang.Object value) {
        return (Builder) super.setRepeatedField(field, index, value);
      }
      @java.lang.Override
      public Builder addRepeatedField(
          com.google.protobuf.Descriptors.FieldDescriptor field,
          java.lang.Object value) {
        return (Builder) super.addRepeatedField(field, value);
      }
      @java.lang.Override
      public Builder mergeFrom(com.google.protobuf.Message other) {
        if (other instanceof com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType) {
          return mergeFrom((com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType other) {
        if (other == com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.getDefaultInstance()) return this;
        if (other.hasId()) {
          bitField0_ |= 0x00000001;
          id_ = other.id_;
          onChanged();
        }
        if (other.hasType()) {
          setType(other.getType());
        }
        this.mergeUnknownFields(other.unknownFields);
        onChanged();
        return this;
      }

      @java.lang.Override
      public final boolean isInitialized() {
        if (!hasId()) {
          return false;
        }
        if (!hasType()) {
          return false;
        }
        return true;
      }

      @java.lang.Override
      public Builder mergeFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
        com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }
      private int bitField0_;

      private java.lang.Object id_ = "";
      /**
       * <pre>
       *存放卡ID，或者手机唯�?识别ID
       * </pre>
       *
       * <code>required string id = 1;</code>
       */
      public boolean hasId() {
        return ((bitField0_ & 0x00000001) == 0x00000001);
      }
      /**
       * <pre>
       *存放卡ID，或者手机唯�?识别ID
       * </pre>
       *
       * <code>required string id = 1;</code>
       */
      public java.lang.String getId() {
        java.lang.Object ref = id_;
        if (!(ref instanceof java.lang.String)) {
          com.google.protobuf.ByteString bs =
              (com.google.protobuf.ByteString) ref;
          java.lang.String s = bs.toStringUtf8();
          if (bs.isValidUtf8()) {
            id_ = s;
          }
          return s;
        } else {
          return (java.lang.String) ref;
        }
      }
      /**
       * <pre>
       *存放卡ID，或者手机唯�?识别ID
       * </pre>
       *
       * <code>required string id = 1;</code>
       */
      public com.google.protobuf.ByteString
          getIdBytes() {
        java.lang.Object ref = id_;
        if (ref instanceof String) {
          com.google.protobuf.ByteString b = 
              com.google.protobuf.ByteString.copyFromUtf8(
                  (java.lang.String) ref);
          id_ = b;
          return b;
        } else {
          return (com.google.protobuf.ByteString) ref;
        }
      }
      /**
       * <pre>
       *存放卡ID，或者手机唯�?识别ID
       * </pre>
       *
       * <code>required string id = 1;</code>
       */
      public Builder setId(
          java.lang.String value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }
      /**
       * <pre>
       *存放卡ID，或者手机唯�?识别ID
       * </pre>
       *
       * <code>required string id = 1;</code>
       */
      public Builder clearId() {
        bitField0_ = (bitField0_ & ~0x00000001);
        id_ = getDefaultInstance().getId();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *存放卡ID，或者手机唯�?识别ID
       * </pre>
       *
       * <code>required string id = 1;</code>
       */
      public Builder setIdBytes(
          com.google.protobuf.ByteString value) {
        if (value == null) {
    throw new NullPointerException();
  }
  bitField0_ |= 0x00000001;
        id_ = value;
        onChanged();
        return this;
      }

      private int type_ = 0;
      /**
       * <pre>
       *触发验证类型
       * </pre>
       *
       * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
       */
      public boolean hasType() {
        return ((bitField0_ & 0x00000002) == 0x00000002);
      }
      /**
       * <pre>
       *触发验证类型
       * </pre>
       *
       * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
       */
      public com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType getType() {
        @SuppressWarnings("deprecation")
        com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType result = com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType.valueOf(type_);
        return result == null ? com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType.Central : result;
      }
      /**
       * <pre>
       *触发验证类型
       * </pre>
       *
       * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
       */
      public Builder setType(com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType.IDTokenEnumType value) {
        if (value == null) {
          throw new NullPointerException();
        }
        bitField0_ |= 0x00000002;
        type_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <pre>
       *触发验证类型
       * </pre>
       *
       * <code>required .IDTokenType.IDTokenEnumType type = 2;</code>
       */
      public Builder clearType() {
        bitField0_ = (bitField0_ & ~0x00000002);
        type_ = 0;
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


      // @@protoc_insertion_point(builder_scope:IDTokenType)
    }

    // @@protoc_insertion_point(class_scope:IDTokenType)
    private static final com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType();
    }

    public static com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    @java.lang.Deprecated public static final com.google.protobuf.Parser<IDTokenType>
        PARSER = new com.google.protobuf.AbstractParser<IDTokenType>() {
      public IDTokenType parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new IDTokenType(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<IDTokenType> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<IDTokenType> getParserForType() {
      return PARSER;
    }

     
    public com.zhicheng.wukongcharge.models.IDTokenTypeProto.IDTokenType getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_IDTokenType_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_IDTokenType_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\021IDTokenType.proto\"\271\001\n\013IDTokenType\022\n\n\002i" +
      "d\030\001 \002(\t\022*\n\004type\030\002 \002(\0162\034.IDTokenType.IDTo" +
      "kenEnumType\"r\n\017IDTokenEnumType\022\013\n\007Centra" +
      "l\020\000\022\t\n\005eMAID\020\001\022\014\n\010ISO14443\020\002\022\t\n\005Local\020\003\022" +
      "\013\n\007PinCode\020\004\022\014\n\010ISO15693\020\005\022\023\n\017NoAuthoriz" +
      "ation\020\006B4\n com.charge.protocol.tomda.mod" +
      "elsB\020IDTokenTypeProto"
    };
    com.google.protobuf.Descriptors.FileDescriptor.InternalDescriptorAssigner assigner =
        new com.google.protobuf.Descriptors.FileDescriptor.    InternalDescriptorAssigner() {
          public com.google.protobuf.ExtensionRegistry assignDescriptors(
              com.google.protobuf.Descriptors.FileDescriptor root) {
            descriptor = root;
            return null;
          }
        };
    com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        }, assigner);
    internal_static_IDTokenType_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_IDTokenType_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_IDTokenType_descriptor,
        new java.lang.String[] { "Id", "Type", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
