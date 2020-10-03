// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

/**
 * <pre>
 * Bolinger Bands
 * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z. - When the indicator is produced
 * unit : Unit Currency (Ex : BTC, ETH)
 * quote : Quote Currency (Ex : EUR, USD)
 * bolu1 : Upper Bolinger band for 1 standard deviation
 * bolu2 : Upper Bolinger band for 2 standard deviations 
 * bold1 : Lower Bolinger band for 1 standard deviation
 * bold2 : Lower Bolinger band for 2 standard deviations 
 * </pre>
 *
 * Protobuf type {@code tech.gbdevw.colibri.domain.BOL}
 */
public  final class BOL extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech.gbdevw.colibri.domain.BOL)
    BOLOrBuilder {
private static final long serialVersionUID = 0L;
  // Use BOL.newBuilder() to construct.
  private BOL(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private BOL() {
    unit_ = 0;
    quote_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new BOL();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private BOL(
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

            bolu1_ = input.readDouble();
            break;
          }
          case 41: {

            bolu2_ = input.readDouble();
            break;
          }
          case 49: {

            bold1_ = input.readDouble();
            break;
          }
          case 57: {

            bold2_ = input.readDouble();
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
    return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_BOL_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_BOL_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.gbdevw.colibri.domain.BOL.class, tech.gbdevw.colibri.domain.BOL.Builder.class);
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

  public static final int BOLU1_FIELD_NUMBER = 4;
  private double bolu1_;
  /**
   * <code>double bolu1 = 4;</code>
   * @return The bolu1.
   */
  public double getBolu1() {
    return bolu1_;
  }

  public static final int BOLU2_FIELD_NUMBER = 5;
  private double bolu2_;
  /**
   * <code>double bolu2 = 5;</code>
   * @return The bolu2.
   */
  public double getBolu2() {
    return bolu2_;
  }

  public static final int BOLD1_FIELD_NUMBER = 6;
  private double bold1_;
  /**
   * <code>double bold1 = 6;</code>
   * @return The bold1.
   */
  public double getBold1() {
    return bold1_;
  }

  public static final int BOLD2_FIELD_NUMBER = 7;
  private double bold2_;
  /**
   * <code>double bold2 = 7;</code>
   * @return The bold2.
   */
  public double getBold2() {
    return bold2_;
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
    if (bolu1_ != 0D) {
      output.writeDouble(4, bolu1_);
    }
    if (bolu2_ != 0D) {
      output.writeDouble(5, bolu2_);
    }
    if (bold1_ != 0D) {
      output.writeDouble(6, bold1_);
    }
    if (bold2_ != 0D) {
      output.writeDouble(7, bold2_);
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
    if (bolu1_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(4, bolu1_);
    }
    if (bolu2_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, bolu2_);
    }
    if (bold1_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, bold1_);
    }
    if (bold2_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(7, bold2_);
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
    if (!(obj instanceof tech.gbdevw.colibri.domain.BOL)) {
      return super.equals(obj);
    }
    tech.gbdevw.colibri.domain.BOL other = (tech.gbdevw.colibri.domain.BOL) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (unit_ != other.unit_) return false;
    if (quote_ != other.quote_) return false;
    if (java.lang.Double.doubleToLongBits(getBolu1())
        != java.lang.Double.doubleToLongBits(
            other.getBolu1())) return false;
    if (java.lang.Double.doubleToLongBits(getBolu2())
        != java.lang.Double.doubleToLongBits(
            other.getBolu2())) return false;
    if (java.lang.Double.doubleToLongBits(getBold1())
        != java.lang.Double.doubleToLongBits(
            other.getBold1())) return false;
    if (java.lang.Double.doubleToLongBits(getBold2())
        != java.lang.Double.doubleToLongBits(
            other.getBold2())) return false;
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
    hash = (37 * hash) + BOLU1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBolu1()));
    hash = (37 * hash) + BOLU2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBolu2()));
    hash = (37 * hash) + BOLD1_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBold1()));
    hash = (37 * hash) + BOLD2_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBold2()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.gbdevw.colibri.domain.BOL parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.BOL parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.BOL parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.BOL parseFrom(
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
  public static Builder newBuilder(tech.gbdevw.colibri.domain.BOL prototype) {
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
   * Bolinger Bands
   * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z. - When the indicator is produced
   * unit : Unit Currency (Ex : BTC, ETH)
   * quote : Quote Currency (Ex : EUR, USD)
   * bolu1 : Upper Bolinger band for 1 standard deviation
   * bolu2 : Upper Bolinger band for 2 standard deviations 
   * bold1 : Lower Bolinger band for 1 standard deviation
   * bold2 : Lower Bolinger band for 2 standard deviations 
   * </pre>
   *
   * Protobuf type {@code tech.gbdevw.colibri.domain.BOL}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech.gbdevw.colibri.domain.BOL)
      tech.gbdevw.colibri.domain.BOLOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_BOL_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_BOL_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.gbdevw.colibri.domain.BOL.class, tech.gbdevw.colibri.domain.BOL.Builder.class);
    }

    // Construct using tech.gbdevw.colibri.domain.BOL.newBuilder()
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

      bolu1_ = 0D;

      bolu2_ = 0D;

      bold1_ = 0D;

      bold2_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_BOL_descriptor;
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.BOL getDefaultInstanceForType() {
      return tech.gbdevw.colibri.domain.BOL.getDefaultInstance();
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.BOL build() {
      tech.gbdevw.colibri.domain.BOL result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.BOL buildPartial() {
      tech.gbdevw.colibri.domain.BOL result = new tech.gbdevw.colibri.domain.BOL(this);
      result.timestamp_ = timestamp_;
      result.unit_ = unit_;
      result.quote_ = quote_;
      result.bolu1_ = bolu1_;
      result.bolu2_ = bolu2_;
      result.bold1_ = bold1_;
      result.bold2_ = bold2_;
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
      if (other instanceof tech.gbdevw.colibri.domain.BOL) {
        return mergeFrom((tech.gbdevw.colibri.domain.BOL)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.gbdevw.colibri.domain.BOL other) {
      if (other == tech.gbdevw.colibri.domain.BOL.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
      }
      if (other.quote_ != 0) {
        setQuoteValue(other.getQuoteValue());
      }
      if (other.getBolu1() != 0D) {
        setBolu1(other.getBolu1());
      }
      if (other.getBolu2() != 0D) {
        setBolu2(other.getBolu2());
      }
      if (other.getBold1() != 0D) {
        setBold1(other.getBold1());
      }
      if (other.getBold2() != 0D) {
        setBold2(other.getBold2());
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
      tech.gbdevw.colibri.domain.BOL parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech.gbdevw.colibri.domain.BOL) e.getUnfinishedMessage();
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

    private double bolu1_ ;
    /**
     * <code>double bolu1 = 4;</code>
     * @return The bolu1.
     */
    public double getBolu1() {
      return bolu1_;
    }
    /**
     * <code>double bolu1 = 4;</code>
     * @param value The bolu1 to set.
     * @return This builder for chaining.
     */
    public Builder setBolu1(double value) {
      
      bolu1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bolu1 = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearBolu1() {
      
      bolu1_ = 0D;
      onChanged();
      return this;
    }

    private double bolu2_ ;
    /**
     * <code>double bolu2 = 5;</code>
     * @return The bolu2.
     */
    public double getBolu2() {
      return bolu2_;
    }
    /**
     * <code>double bolu2 = 5;</code>
     * @param value The bolu2 to set.
     * @return This builder for chaining.
     */
    public Builder setBolu2(double value) {
      
      bolu2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bolu2 = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearBolu2() {
      
      bolu2_ = 0D;
      onChanged();
      return this;
    }

    private double bold1_ ;
    /**
     * <code>double bold1 = 6;</code>
     * @return The bold1.
     */
    public double getBold1() {
      return bold1_;
    }
    /**
     * <code>double bold1 = 6;</code>
     * @param value The bold1 to set.
     * @return This builder for chaining.
     */
    public Builder setBold1(double value) {
      
      bold1_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bold1 = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearBold1() {
      
      bold1_ = 0D;
      onChanged();
      return this;
    }

    private double bold2_ ;
    /**
     * <code>double bold2 = 7;</code>
     * @return The bold2.
     */
    public double getBold2() {
      return bold2_;
    }
    /**
     * <code>double bold2 = 7;</code>
     * @param value The bold2 to set.
     * @return This builder for chaining.
     */
    public Builder setBold2(double value) {
      
      bold2_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bold2 = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearBold2() {
      
      bold2_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:tech.gbdevw.colibri.domain.BOL)
  }

  // @@protoc_insertion_point(class_scope:tech.gbdevw.colibri.domain.BOL)
  private static final tech.gbdevw.colibri.domain.BOL DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.gbdevw.colibri.domain.BOL();
  }

  public static tech.gbdevw.colibri.domain.BOL getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BOL>
      PARSER = new com.google.protobuf.AbstractParser<BOL>() {
    @java.lang.Override
    public BOL parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new BOL(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<BOL> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BOL> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.gbdevw.colibri.domain.BOL getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

