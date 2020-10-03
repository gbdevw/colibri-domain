// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

/**
 * <pre>
 * Money Flow Index
 * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z. - When the indicator is produced
 * unit : Unit Currency (Ex : BTC, ETH)
 * quote : Quote Currency (Ex : EUR, USD)
 * mfi : MFI value
 * </pre>
 *
 * Protobuf type {@code tech.gbdevw.colibri.domain.MFI}
 */
public  final class MFI extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech.gbdevw.colibri.domain.MFI)
    MFIOrBuilder {
private static final long serialVersionUID = 0L;
  // Use MFI.newBuilder() to construct.
  private MFI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private MFI() {
    unit_ = 0;
    quote_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new MFI();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private MFI(
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
          case 8: {

            timestamp_ = input.readUInt64();
            break;
          }
          case 16: {
            int rawValue = input.readEnum();

            unit_ = rawValue;
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            quote_ = rawValue;
            break;
          }
          case 33: {

            mfi_ = input.readDouble();
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
    return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_MFI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_MFI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.gbdevw.colibri.domain.MFI.class, tech.gbdevw.colibri.domain.MFI.Builder.class);
  }

  public static final int TIMESTAMP_FIELD_NUMBER = 1;
  private long timestamp_;
  /**
   * <code>uint64 timestamp = 1;</code>
   * @return The timestamp.
   */
  public long getTimestamp() {
    return timestamp_;
  }

  public static final int UNIT_FIELD_NUMBER = 2;
  private int unit_;
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  public int getUnitValue() {
    return unit_;
  }
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
   * @return The unit.
   */
  public tech.gbdevw.colibri.domain.Currency getUnit() {
    @SuppressWarnings("deprecation")
    tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(unit_);
    return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
  }

  public static final int QUOTE_FIELD_NUMBER = 3;
  private int quote_;
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
   * @return The enum numeric value on the wire for quote.
   */
  public int getQuoteValue() {
    return quote_;
  }
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
   * @return The quote.
   */
  public tech.gbdevw.colibri.domain.Currency getQuote() {
    @SuppressWarnings("deprecation")
    tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(quote_);
    return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
  }

  public static final int MFI_FIELD_NUMBER = 4;
  private double mfi_;
  /**
   * <code>double mfi = 4;</code>
   * @return The mfi.
   */
  public double getMfi() {
    return mfi_;
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
    if (timestamp_ != 0L) {
      output.writeUInt64(1, timestamp_);
    }
    if (unit_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      output.writeEnum(2, unit_);
    }
    if (quote_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      output.writeEnum(3, quote_);
    }
    if (mfi_ != 0D) {
      output.writeDouble(4, mfi_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (timestamp_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(1, timestamp_);
    }
    if (unit_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(2, unit_);
    }
    if (quote_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, quote_);
    }
    if (mfi_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, mfi_);
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
    if (!(obj instanceof tech.gbdevw.colibri.domain.MFI)) {
      return super.equals(obj);
    }
    tech.gbdevw.colibri.domain.MFI other = (tech.gbdevw.colibri.domain.MFI) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (unit_ != other.unit_) return false;
    if (quote_ != other.quote_) return false;
    if (java.lang.Double.doubleToLongBits(getMfi())
        != java.lang.Double.doubleToLongBits(
            other.getMfi())) return false;
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
    hash = (37 * hash) + TIMESTAMP_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getTimestamp());
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (37 * hash) + QUOTE_FIELD_NUMBER;
    hash = (53 * hash) + quote_;
    hash = (37 * hash) + MFI_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getMfi()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.gbdevw.colibri.domain.MFI parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.MFI parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.MFI parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.MFI parseFrom(
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
  public static Builder newBuilder(tech.gbdevw.colibri.domain.MFI prototype) {
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
   * <pre>
   * Money Flow Index
   * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z. - When the indicator is produced
   * unit : Unit Currency (Ex : BTC, ETH)
   * quote : Quote Currency (Ex : EUR, USD)
   * mfi : MFI value
   * </pre>
   *
   * Protobuf type {@code tech.gbdevw.colibri.domain.MFI}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech.gbdevw.colibri.domain.MFI)
      tech.gbdevw.colibri.domain.MFIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_MFI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_MFI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.gbdevw.colibri.domain.MFI.class, tech.gbdevw.colibri.domain.MFI.Builder.class);
    }

    // Construct using tech.gbdevw.colibri.domain.MFI.newBuilder()
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
      timestamp_ = 0L;

      unit_ = 0;

      quote_ = 0;

      mfi_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_MFI_descriptor;
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.MFI getDefaultInstanceForType() {
      return tech.gbdevw.colibri.domain.MFI.getDefaultInstance();
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.MFI build() {
      tech.gbdevw.colibri.domain.MFI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.MFI buildPartial() {
      tech.gbdevw.colibri.domain.MFI result = new tech.gbdevw.colibri.domain.MFI(this);
      result.timestamp_ = timestamp_;
      result.unit_ = unit_;
      result.quote_ = quote_;
      result.mfi_ = mfi_;
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
      if (other instanceof tech.gbdevw.colibri.domain.MFI) {
        return mergeFrom((tech.gbdevw.colibri.domain.MFI)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.gbdevw.colibri.domain.MFI other) {
      if (other == tech.gbdevw.colibri.domain.MFI.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
      }
      if (other.quote_ != 0) {
        setQuoteValue(other.getQuoteValue());
      }
      if (other.getMfi() != 0D) {
        setMfi(other.getMfi());
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
      tech.gbdevw.colibri.domain.MFI parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech.gbdevw.colibri.domain.MFI) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private long timestamp_ ;
    /**
     * <code>uint64 timestamp = 1;</code>
     * @return The timestamp.
     */
    public long getTimestamp() {
      return timestamp_;
    }
    /**
     * <code>uint64 timestamp = 1;</code>
     * @param value The timestamp to set.
     * @return This builder for chaining.
     */
    public Builder setTimestamp(long value) {
      
      timestamp_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>uint64 timestamp = 1;</code>
     * @return This builder for chaining.
     */
    public Builder clearTimestamp() {
      
      timestamp_ = 0L;
      onChanged();
      return this;
    }

    private int unit_ = 0;
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
     * @return The enum numeric value on the wire for unit.
     */
    public int getUnitValue() {
      return unit_;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
     * @return The unit.
     */
    public tech.gbdevw.colibri.domain.Currency getUnit() {
      @SuppressWarnings("deprecation")
      tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(unit_);
      return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(tech.gbdevw.colibri.domain.Currency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      
      unit_ = 0;
      onChanged();
      return this;
    }

    private int quote_ = 0;
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
     * @return The enum numeric value on the wire for quote.
     */
    public int getQuoteValue() {
      return quote_;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
     * @param value The enum numeric value on the wire for quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteValue(int value) {
      quote_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
     * @return The quote.
     */
    public tech.gbdevw.colibri.domain.Currency getQuote() {
      @SuppressWarnings("deprecation")
      tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(quote_);
      return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
     * @param value The quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuote(tech.gbdevw.colibri.domain.Currency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      quote_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuote() {
      
      quote_ = 0;
      onChanged();
      return this;
    }

    private double mfi_ ;
    /**
     * <code>double mfi = 4;</code>
     * @return The mfi.
     */
    public double getMfi() {
      return mfi_;
    }
    /**
     * <code>double mfi = 4;</code>
     * @param value The mfi to set.
     * @return This builder for chaining.
     */
    public Builder setMfi(double value) {
      
      mfi_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double mfi = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearMfi() {
      
      mfi_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:tech.gbdevw.colibri.domain.MFI)
  }

  // @@protoc_insertion_point(class_scope:tech.gbdevw.colibri.domain.MFI)
  private static final tech.gbdevw.colibri.domain.MFI DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.gbdevw.colibri.domain.MFI();
  }

  public static tech.gbdevw.colibri.domain.MFI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MFI>
      PARSER = new com.google.protobuf.AbstractParser<MFI>() {
    @java.lang.Override
    public MFI parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new MFI(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<MFI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MFI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.gbdevw.colibri.domain.MFI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

