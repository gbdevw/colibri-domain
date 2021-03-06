// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

/**
 * <pre>
 * Message that contains the data of a trade
 * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
 * id : coinbase id for the event
 * unit : Unit Currency (Ex : BTC, ETH)
 * quote : Quote Currency (Ex : EUR, USD)
 * price : Price in quote Currency for one unit of unit Currency
 * size : Number of unit Currency exchanged during last trade
 * side : Side of the trade
 * </pre>
 *
 * Protobuf type {@code tech.gbdevw.colibri.domain.Match}
 */
public  final class Match extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:tech.gbdevw.colibri.domain.Match)
    MatchOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Match.newBuilder() to construct.
  private Match(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Match() {
    unit_ = 0;
    quote_ = 0;
    side_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Match();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Match(
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

            id_ = input.readUInt64();
            break;
          }
          case 24: {
            int rawValue = input.readEnum();

            unit_ = rawValue;
            break;
          }
          case 32: {
            int rawValue = input.readEnum();

            quote_ = rawValue;
            break;
          }
          case 41: {

            price_ = input.readDouble();
            break;
          }
          case 49: {

            size_ = input.readDouble();
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            side_ = rawValue;
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
    return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_Match_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_Match_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            tech.gbdevw.colibri.domain.Match.class, tech.gbdevw.colibri.domain.Match.Builder.class);
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

  public static final int ID_FIELD_NUMBER = 2;
  private long id_;
  /**
   * <code>uint64 id = 2;</code>
   * @return The id.
   */
  public long getId() {
    return id_;
  }

  public static final int UNIT_FIELD_NUMBER = 3;
  private int unit_;
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
   * @return The enum numeric value on the wire for unit.
   */
  public int getUnitValue() {
    return unit_;
  }
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
   * @return The unit.
   */
  public tech.gbdevw.colibri.domain.Currency getUnit() {
    @SuppressWarnings("deprecation")
    tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(unit_);
    return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
  }

  public static final int QUOTE_FIELD_NUMBER = 4;
  private int quote_;
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
   * @return The enum numeric value on the wire for quote.
   */
  public int getQuoteValue() {
    return quote_;
  }
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
   * @return The quote.
   */
  public tech.gbdevw.colibri.domain.Currency getQuote() {
    @SuppressWarnings("deprecation")
    tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(quote_);
    return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
  }

  public static final int PRICE_FIELD_NUMBER = 5;
  private double price_;
  /**
   * <code>double price = 5;</code>
   * @return The price.
   */
  public double getPrice() {
    return price_;
  }

  public static final int SIZE_FIELD_NUMBER = 6;
  private double size_;
  /**
   * <code>double size = 6;</code>
   * @return The size.
   */
  public double getSize() {
    return size_;
  }

  public static final int SIDE_FIELD_NUMBER = 7;
  private int side_;
  /**
   * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
   * @return The enum numeric value on the wire for side.
   */
  public int getSideValue() {
    return side_;
  }
  /**
   * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
   * @return The side.
   */
  public tech.gbdevw.colibri.domain.Side getSide() {
    @SuppressWarnings("deprecation")
    tech.gbdevw.colibri.domain.Side result = tech.gbdevw.colibri.domain.Side.valueOf(side_);
    return result == null ? tech.gbdevw.colibri.domain.Side.UNRECOGNIZED : result;
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
    if (id_ != 0L) {
      output.writeUInt64(2, id_);
    }
    if (unit_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      output.writeEnum(3, unit_);
    }
    if (quote_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      output.writeEnum(4, quote_);
    }
    if (price_ != 0D) {
      output.writeDouble(5, price_);
    }
    if (size_ != 0D) {
      output.writeDouble(6, size_);
    }
    if (side_ != tech.gbdevw.colibri.domain.Side.BUY.getNumber()) {
      output.writeEnum(7, side_);
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
    if (id_ != 0L) {
      size += com.google.protobuf.CodedOutputStream
        .computeUInt64Size(2, id_);
    }
    if (unit_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, unit_);
    }
    if (quote_ != tech.gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, quote_);
    }
    if (price_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, price_);
    }
    if (size_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, size_);
    }
    if (side_ != tech.gbdevw.colibri.domain.Side.BUY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, side_);
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
    if (!(obj instanceof tech.gbdevw.colibri.domain.Match)) {
      return super.equals(obj);
    }
    tech.gbdevw.colibri.domain.Match other = (tech.gbdevw.colibri.domain.Match) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (getId()
        != other.getId()) return false;
    if (unit_ != other.unit_) return false;
    if (quote_ != other.quote_) return false;
    if (java.lang.Double.doubleToLongBits(getPrice())
        != java.lang.Double.doubleToLongBits(
            other.getPrice())) return false;
    if (java.lang.Double.doubleToLongBits(getSize())
        != java.lang.Double.doubleToLongBits(
            other.getSize())) return false;
    if (side_ != other.side_) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        getId());
    hash = (37 * hash) + UNIT_FIELD_NUMBER;
    hash = (53 * hash) + unit_;
    hash = (37 * hash) + QUOTE_FIELD_NUMBER;
    hash = (53 * hash) + quote_;
    hash = (37 * hash) + PRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getPrice()));
    hash = (37 * hash) + SIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getSize()));
    hash = (37 * hash) + SIDE_FIELD_NUMBER;
    hash = (53 * hash) + side_;
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static tech.gbdevw.colibri.domain.Match parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.Match parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.Match parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static tech.gbdevw.colibri.domain.Match parseFrom(
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
  public static Builder newBuilder(tech.gbdevw.colibri.domain.Match prototype) {
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
   * Message that contains the data of a trade
   * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
   * id : coinbase id for the event
   * unit : Unit Currency (Ex : BTC, ETH)
   * quote : Quote Currency (Ex : EUR, USD)
   * price : Price in quote Currency for one unit of unit Currency
   * size : Number of unit Currency exchanged during last trade
   * side : Side of the trade
   * </pre>
   *
   * Protobuf type {@code tech.gbdevw.colibri.domain.Match}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:tech.gbdevw.colibri.domain.Match)
      tech.gbdevw.colibri.domain.MatchOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_Match_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_Match_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              tech.gbdevw.colibri.domain.Match.class, tech.gbdevw.colibri.domain.Match.Builder.class);
    }

    // Construct using tech.gbdevw.colibri.domain.Match.newBuilder()
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

      id_ = 0L;

      unit_ = 0;

      quote_ = 0;

      price_ = 0D;

      size_ = 0D;

      side_ = 0;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return tech.gbdevw.colibri.domain.Domain.internal_static_tech_gbdevw_colibri_domain_Match_descriptor;
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.Match getDefaultInstanceForType() {
      return tech.gbdevw.colibri.domain.Match.getDefaultInstance();
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.Match build() {
      tech.gbdevw.colibri.domain.Match result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public tech.gbdevw.colibri.domain.Match buildPartial() {
      tech.gbdevw.colibri.domain.Match result = new tech.gbdevw.colibri.domain.Match(this);
      result.timestamp_ = timestamp_;
      result.id_ = id_;
      result.unit_ = unit_;
      result.quote_ = quote_;
      result.price_ = price_;
      result.size_ = size_;
      result.side_ = side_;
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
      if (other instanceof tech.gbdevw.colibri.domain.Match) {
        return mergeFrom((tech.gbdevw.colibri.domain.Match)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(tech.gbdevw.colibri.domain.Match other) {
      if (other == tech.gbdevw.colibri.domain.Match.getDefaultInstance()) return this;
      if (other.getTimestamp() != 0L) {
        setTimestamp(other.getTimestamp());
      }
      if (other.getId() != 0L) {
        setId(other.getId());
      }
      if (other.unit_ != 0) {
        setUnitValue(other.getUnitValue());
      }
      if (other.quote_ != 0) {
        setQuoteValue(other.getQuoteValue());
      }
      if (other.getPrice() != 0D) {
        setPrice(other.getPrice());
      }
      if (other.getSize() != 0D) {
        setSize(other.getSize());
      }
      if (other.side_ != 0) {
        setSideValue(other.getSideValue());
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
      tech.gbdevw.colibri.domain.Match parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (tech.gbdevw.colibri.domain.Match) e.getUnfinishedMessage();
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

    private long id_ ;
    /**
     * <code>uint64 id = 2;</code>
     * @return The id.
     */
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
      onChanged();
      return this;
    }
    /**
     * <code>uint64 id = 2;</code>
     * @return This builder for chaining.
     */
    public Builder clearId() {
      
      id_ = 0L;
      onChanged();
      return this;
    }

    private int unit_ = 0;
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @return The enum numeric value on the wire for unit.
     */
    public int getUnitValue() {
      return unit_;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @return The unit.
     */
    public tech.gbdevw.colibri.domain.Currency getUnit() {
      @SuppressWarnings("deprecation")
      tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(unit_);
      return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
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
     * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      
      unit_ = 0;
      onChanged();
      return this;
    }

    private int quote_ = 0;
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @return The enum numeric value on the wire for quote.
     */
    public int getQuoteValue() {
      return quote_;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @param value The enum numeric value on the wire for quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteValue(int value) {
      quote_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @return The quote.
     */
    public tech.gbdevw.colibri.domain.Currency getQuote() {
      @SuppressWarnings("deprecation")
      tech.gbdevw.colibri.domain.Currency result = tech.gbdevw.colibri.domain.Currency.valueOf(quote_);
      return result == null ? tech.gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
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
     * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuote() {
      
      quote_ = 0;
      onChanged();
      return this;
    }

    private double price_ ;
    /**
     * <code>double price = 5;</code>
     * @return The price.
     */
    public double getPrice() {
      return price_;
    }
    /**
     * <code>double price = 5;</code>
     * @param value The price to set.
     * @return This builder for chaining.
     */
    public Builder setPrice(double value) {
      
      price_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double price = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearPrice() {
      
      price_ = 0D;
      onChanged();
      return this;
    }

    private double size_ ;
    /**
     * <code>double size = 6;</code>
     * @return The size.
     */
    public double getSize() {
      return size_;
    }
    /**
     * <code>double size = 6;</code>
     * @param value The size to set.
     * @return This builder for chaining.
     */
    public Builder setSize(double value) {
      
      size_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double size = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearSize() {
      
      size_ = 0D;
      onChanged();
      return this;
    }

    private int side_ = 0;
    /**
     * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
     * @return The enum numeric value on the wire for side.
     */
    public int getSideValue() {
      return side_;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
     * @param value The enum numeric value on the wire for side to set.
     * @return This builder for chaining.
     */
    public Builder setSideValue(int value) {
      side_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
     * @return The side.
     */
    public tech.gbdevw.colibri.domain.Side getSide() {
      @SuppressWarnings("deprecation")
      tech.gbdevw.colibri.domain.Side result = tech.gbdevw.colibri.domain.Side.valueOf(side_);
      return result == null ? tech.gbdevw.colibri.domain.Side.UNRECOGNIZED : result;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
     * @param value The side to set.
     * @return This builder for chaining.
     */
    public Builder setSide(tech.gbdevw.colibri.domain.Side value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      side_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearSide() {
      
      side_ = 0;
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


    // @@protoc_insertion_point(builder_scope:tech.gbdevw.colibri.domain.Match)
  }

  // @@protoc_insertion_point(class_scope:tech.gbdevw.colibri.domain.Match)
  private static final tech.gbdevw.colibri.domain.Match DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new tech.gbdevw.colibri.domain.Match();
  }

  public static tech.gbdevw.colibri.domain.Match getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Match>
      PARSER = new com.google.protobuf.AbstractParser<Match>() {
    @java.lang.Override
    public Match parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Match(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Match> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Match> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public tech.gbdevw.colibri.domain.Match getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

