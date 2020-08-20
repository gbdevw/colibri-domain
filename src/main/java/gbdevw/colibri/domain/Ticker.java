// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package gbdevw.colibri.domain;

/**
 * <pre>
 * Message that contain data of a market tick.
 * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
 * id : coinbase id for the event
 * unit : Unit Currency (Ex : BTC, ETH)
 * quote : Quote Currency (Ex : EUR, USD)
 * lastTradePrice : Price in quote Currency for one unit of unit Currency from the last trade
 * lastTradeSize : Number of unit Currency exchanged during last trade
 * lastTradeSide : Side of the last trade
 * bestBid : Best offered price in quote Currency for one unit of unit Currency
 * bestAsk : Best asked price in quote Currency for one unit of unit Currency
 * </pre>
 *
 * Protobuf type {@code gbdevw.colibri.domain.Ticker}
 */
public  final class Ticker extends
    com.google.protobuf.GeneratedMessageV3 implements
    // @@protoc_insertion_point(message_implements:gbdevw.colibri.domain.Ticker)
    TickerOrBuilder {
private static final long serialVersionUID = 0L;
  // Use Ticker.newBuilder() to construct.
  private Ticker(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }
  private Ticker() {
    unit_ = 0;
    quote_ = 0;
    lastTradeSide_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(
      UnusedPrivateParameter unused) {
    return new Ticker();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet
  getUnknownFields() {
    return this.unknownFields;
  }
  private Ticker(
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

            lastTradePrice_ = input.readDouble();
            break;
          }
          case 49: {

            lastTradeSize_ = input.readDouble();
            break;
          }
          case 56: {
            int rawValue = input.readEnum();

            lastTradeSide_ = rawValue;
            break;
          }
          case 65: {

            bestBid_ = input.readDouble();
            break;
          }
          case 73: {

            bestAsk_ = input.readDouble();
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
    return gbdevw.colibri.domain.Domain.internal_static_gbdevw_colibri_domain_Ticker_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return gbdevw.colibri.domain.Domain.internal_static_gbdevw_colibri_domain_Ticker_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            gbdevw.colibri.domain.Ticker.class, gbdevw.colibri.domain.Ticker.Builder.class);
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
   * <code>.gbdevw.colibri.domain.Currency unit = 3;</code>
   * @return The enum numeric value on the wire for unit.
   */
  public int getUnitValue() {
    return unit_;
  }
  /**
   * <code>.gbdevw.colibri.domain.Currency unit = 3;</code>
   * @return The unit.
   */
  public gbdevw.colibri.domain.Currency getUnit() {
    @SuppressWarnings("deprecation")
    gbdevw.colibri.domain.Currency result = gbdevw.colibri.domain.Currency.valueOf(unit_);
    return result == null ? gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
  }

  public static final int QUOTE_FIELD_NUMBER = 4;
  private int quote_;
  /**
   * <code>.gbdevw.colibri.domain.Currency quote = 4;</code>
   * @return The enum numeric value on the wire for quote.
   */
  public int getQuoteValue() {
    return quote_;
  }
  /**
   * <code>.gbdevw.colibri.domain.Currency quote = 4;</code>
   * @return The quote.
   */
  public gbdevw.colibri.domain.Currency getQuote() {
    @SuppressWarnings("deprecation")
    gbdevw.colibri.domain.Currency result = gbdevw.colibri.domain.Currency.valueOf(quote_);
    return result == null ? gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
  }

  public static final int LASTTRADEPRICE_FIELD_NUMBER = 5;
  private double lastTradePrice_;
  /**
   * <code>double lastTradePrice = 5;</code>
   * @return The lastTradePrice.
   */
  public double getLastTradePrice() {
    return lastTradePrice_;
  }

  public static final int LASTTRADESIZE_FIELD_NUMBER = 6;
  private double lastTradeSize_;
  /**
   * <code>double lastTradeSize = 6;</code>
   * @return The lastTradeSize.
   */
  public double getLastTradeSize() {
    return lastTradeSize_;
  }

  public static final int LASTTRADESIDE_FIELD_NUMBER = 7;
  private int lastTradeSide_;
  /**
   * <code>.gbdevw.colibri.domain.Side lastTradeSide = 7;</code>
   * @return The enum numeric value on the wire for lastTradeSide.
   */
  public int getLastTradeSideValue() {
    return lastTradeSide_;
  }
  /**
   * <code>.gbdevw.colibri.domain.Side lastTradeSide = 7;</code>
   * @return The lastTradeSide.
   */
  public gbdevw.colibri.domain.Side getLastTradeSide() {
    @SuppressWarnings("deprecation")
    gbdevw.colibri.domain.Side result = gbdevw.colibri.domain.Side.valueOf(lastTradeSide_);
    return result == null ? gbdevw.colibri.domain.Side.UNRECOGNIZED : result;
  }

  public static final int BESTBID_FIELD_NUMBER = 8;
  private double bestBid_;
  /**
   * <code>double bestBid = 8;</code>
   * @return The bestBid.
   */
  public double getBestBid() {
    return bestBid_;
  }

  public static final int BESTASK_FIELD_NUMBER = 9;
  private double bestAsk_;
  /**
   * <code>double bestAsk = 9;</code>
   * @return The bestAsk.
   */
  public double getBestAsk() {
    return bestAsk_;
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
    if (unit_ != gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      output.writeEnum(3, unit_);
    }
    if (quote_ != gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      output.writeEnum(4, quote_);
    }
    if (lastTradePrice_ != 0D) {
      output.writeDouble(5, lastTradePrice_);
    }
    if (lastTradeSize_ != 0D) {
      output.writeDouble(6, lastTradeSize_);
    }
    if (lastTradeSide_ != gbdevw.colibri.domain.Side.BUY.getNumber()) {
      output.writeEnum(7, lastTradeSide_);
    }
    if (bestBid_ != 0D) {
      output.writeDouble(8, bestBid_);
    }
    if (bestAsk_ != 0D) {
      output.writeDouble(9, bestAsk_);
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
    if (unit_ != gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(3, unit_);
    }
    if (quote_ != gbdevw.colibri.domain.Currency.EUR.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(4, quote_);
    }
    if (lastTradePrice_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(5, lastTradePrice_);
    }
    if (lastTradeSize_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(6, lastTradeSize_);
    }
    if (lastTradeSide_ != gbdevw.colibri.domain.Side.BUY.getNumber()) {
      size += com.google.protobuf.CodedOutputStream
        .computeEnumSize(7, lastTradeSide_);
    }
    if (bestBid_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(8, bestBid_);
    }
    if (bestAsk_ != 0D) {
      size += com.google.protobuf.CodedOutputStream
        .computeDoubleSize(9, bestAsk_);
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
    if (!(obj instanceof gbdevw.colibri.domain.Ticker)) {
      return super.equals(obj);
    }
    gbdevw.colibri.domain.Ticker other = (gbdevw.colibri.domain.Ticker) obj;

    if (getTimestamp()
        != other.getTimestamp()) return false;
    if (getId()
        != other.getId()) return false;
    if (unit_ != other.unit_) return false;
    if (quote_ != other.quote_) return false;
    if (java.lang.Double.doubleToLongBits(getLastTradePrice())
        != java.lang.Double.doubleToLongBits(
            other.getLastTradePrice())) return false;
    if (java.lang.Double.doubleToLongBits(getLastTradeSize())
        != java.lang.Double.doubleToLongBits(
            other.getLastTradeSize())) return false;
    if (lastTradeSide_ != other.lastTradeSide_) return false;
    if (java.lang.Double.doubleToLongBits(getBestBid())
        != java.lang.Double.doubleToLongBits(
            other.getBestBid())) return false;
    if (java.lang.Double.doubleToLongBits(getBestAsk())
        != java.lang.Double.doubleToLongBits(
            other.getBestAsk())) return false;
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
    hash = (37 * hash) + LASTTRADEPRICE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLastTradePrice()));
    hash = (37 * hash) + LASTTRADESIZE_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getLastTradeSize()));
    hash = (37 * hash) + LASTTRADESIDE_FIELD_NUMBER;
    hash = (53 * hash) + lastTradeSide_;
    hash = (37 * hash) + BESTBID_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBestBid()));
    hash = (37 * hash) + BESTASK_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
        java.lang.Double.doubleToLongBits(getBestAsk()));
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static gbdevw.colibri.domain.Ticker parseFrom(
      java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(
      java.nio.ByteBuffer data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(
      byte[] data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input, extensionRegistry);
  }
  public static gbdevw.colibri.domain.Ticker parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input);
  }
  public static gbdevw.colibri.domain.Ticker parseDelimitedFrom(
      java.io.InputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(
      com.google.protobuf.CodedInputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3
        .parseWithIOException(PARSER, input);
  }
  public static gbdevw.colibri.domain.Ticker parseFrom(
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
  public static Builder newBuilder(gbdevw.colibri.domain.Ticker prototype) {
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
   * Message that contain data of a market tick.
   * timestamp : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z.
   * id : coinbase id for the event
   * unit : Unit Currency (Ex : BTC, ETH)
   * quote : Quote Currency (Ex : EUR, USD)
   * lastTradePrice : Price in quote Currency for one unit of unit Currency from the last trade
   * lastTradeSize : Number of unit Currency exchanged during last trade
   * lastTradeSide : Side of the last trade
   * bestBid : Best offered price in quote Currency for one unit of unit Currency
   * bestAsk : Best asked price in quote Currency for one unit of unit Currency
   * </pre>
   *
   * Protobuf type {@code gbdevw.colibri.domain.Ticker}
   */
  public static final class Builder extends
      com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
      // @@protoc_insertion_point(builder_implements:gbdevw.colibri.domain.Ticker)
      gbdevw.colibri.domain.TickerOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor
        getDescriptor() {
      return gbdevw.colibri.domain.Domain.internal_static_gbdevw_colibri_domain_Ticker_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return gbdevw.colibri.domain.Domain.internal_static_gbdevw_colibri_domain_Ticker_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              gbdevw.colibri.domain.Ticker.class, gbdevw.colibri.domain.Ticker.Builder.class);
    }

    // Construct using gbdevw.colibri.domain.Ticker.newBuilder()
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

      lastTradePrice_ = 0D;

      lastTradeSize_ = 0D;

      lastTradeSide_ = 0;

      bestBid_ = 0D;

      bestAsk_ = 0D;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor
        getDescriptorForType() {
      return gbdevw.colibri.domain.Domain.internal_static_gbdevw_colibri_domain_Ticker_descriptor;
    }

    @java.lang.Override
    public gbdevw.colibri.domain.Ticker getDefaultInstanceForType() {
      return gbdevw.colibri.domain.Ticker.getDefaultInstance();
    }

    @java.lang.Override
    public gbdevw.colibri.domain.Ticker build() {
      gbdevw.colibri.domain.Ticker result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public gbdevw.colibri.domain.Ticker buildPartial() {
      gbdevw.colibri.domain.Ticker result = new gbdevw.colibri.domain.Ticker(this);
      result.timestamp_ = timestamp_;
      result.id_ = id_;
      result.unit_ = unit_;
      result.quote_ = quote_;
      result.lastTradePrice_ = lastTradePrice_;
      result.lastTradeSize_ = lastTradeSize_;
      result.lastTradeSide_ = lastTradeSide_;
      result.bestBid_ = bestBid_;
      result.bestAsk_ = bestAsk_;
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
      if (other instanceof gbdevw.colibri.domain.Ticker) {
        return mergeFrom((gbdevw.colibri.domain.Ticker)other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(gbdevw.colibri.domain.Ticker other) {
      if (other == gbdevw.colibri.domain.Ticker.getDefaultInstance()) return this;
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
      if (other.getLastTradePrice() != 0D) {
        setLastTradePrice(other.getLastTradePrice());
      }
      if (other.getLastTradeSize() != 0D) {
        setLastTradeSize(other.getLastTradeSize());
      }
      if (other.lastTradeSide_ != 0) {
        setLastTradeSideValue(other.getLastTradeSideValue());
      }
      if (other.getBestBid() != 0D) {
        setBestBid(other.getBestBid());
      }
      if (other.getBestAsk() != 0D) {
        setBestAsk(other.getBestAsk());
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
      gbdevw.colibri.domain.Ticker parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (gbdevw.colibri.domain.Ticker) e.getUnfinishedMessage();
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
     * <code>.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @return The enum numeric value on the wire for unit.
     */
    public int getUnitValue() {
      return unit_;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @param value The enum numeric value on the wire for unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnitValue(int value) {
      unit_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @return The unit.
     */
    public gbdevw.colibri.domain.Currency getUnit() {
      @SuppressWarnings("deprecation")
      gbdevw.colibri.domain.Currency result = gbdevw.colibri.domain.Currency.valueOf(unit_);
      return result == null ? gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @param value The unit to set.
     * @return This builder for chaining.
     */
    public Builder setUnit(gbdevw.colibri.domain.Currency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      unit_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency unit = 3;</code>
     * @return This builder for chaining.
     */
    public Builder clearUnit() {
      
      unit_ = 0;
      onChanged();
      return this;
    }

    private int quote_ = 0;
    /**
     * <code>.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @return The enum numeric value on the wire for quote.
     */
    public int getQuoteValue() {
      return quote_;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @param value The enum numeric value on the wire for quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuoteValue(int value) {
      quote_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @return The quote.
     */
    public gbdevw.colibri.domain.Currency getQuote() {
      @SuppressWarnings("deprecation")
      gbdevw.colibri.domain.Currency result = gbdevw.colibri.domain.Currency.valueOf(quote_);
      return result == null ? gbdevw.colibri.domain.Currency.UNRECOGNIZED : result;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @param value The quote to set.
     * @return This builder for chaining.
     */
    public Builder setQuote(gbdevw.colibri.domain.Currency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      quote_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gbdevw.colibri.domain.Currency quote = 4;</code>
     * @return This builder for chaining.
     */
    public Builder clearQuote() {
      
      quote_ = 0;
      onChanged();
      return this;
    }

    private double lastTradePrice_ ;
    /**
     * <code>double lastTradePrice = 5;</code>
     * @return The lastTradePrice.
     */
    public double getLastTradePrice() {
      return lastTradePrice_;
    }
    /**
     * <code>double lastTradePrice = 5;</code>
     * @param value The lastTradePrice to set.
     * @return This builder for chaining.
     */
    public Builder setLastTradePrice(double value) {
      
      lastTradePrice_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double lastTradePrice = 5;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastTradePrice() {
      
      lastTradePrice_ = 0D;
      onChanged();
      return this;
    }

    private double lastTradeSize_ ;
    /**
     * <code>double lastTradeSize = 6;</code>
     * @return The lastTradeSize.
     */
    public double getLastTradeSize() {
      return lastTradeSize_;
    }
    /**
     * <code>double lastTradeSize = 6;</code>
     * @param value The lastTradeSize to set.
     * @return This builder for chaining.
     */
    public Builder setLastTradeSize(double value) {
      
      lastTradeSize_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double lastTradeSize = 6;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastTradeSize() {
      
      lastTradeSize_ = 0D;
      onChanged();
      return this;
    }

    private int lastTradeSide_ = 0;
    /**
     * <code>.gbdevw.colibri.domain.Side lastTradeSide = 7;</code>
     * @return The enum numeric value on the wire for lastTradeSide.
     */
    public int getLastTradeSideValue() {
      return lastTradeSide_;
    }
    /**
     * <code>.gbdevw.colibri.domain.Side lastTradeSide = 7;</code>
     * @param value The enum numeric value on the wire for lastTradeSide to set.
     * @return This builder for chaining.
     */
    public Builder setLastTradeSideValue(int value) {
      lastTradeSide_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>.gbdevw.colibri.domain.Side lastTradeSide = 7;</code>
     * @return The lastTradeSide.
     */
    public gbdevw.colibri.domain.Side getLastTradeSide() {
      @SuppressWarnings("deprecation")
      gbdevw.colibri.domain.Side result = gbdevw.colibri.domain.Side.valueOf(lastTradeSide_);
      return result == null ? gbdevw.colibri.domain.Side.UNRECOGNIZED : result;
    }
    /**
     * <code>.gbdevw.colibri.domain.Side lastTradeSide = 7;</code>
     * @param value The lastTradeSide to set.
     * @return This builder for chaining.
     */
    public Builder setLastTradeSide(gbdevw.colibri.domain.Side value) {
      if (value == null) {
        throw new NullPointerException();
      }
      
      lastTradeSide_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     * <code>.gbdevw.colibri.domain.Side lastTradeSide = 7;</code>
     * @return This builder for chaining.
     */
    public Builder clearLastTradeSide() {
      
      lastTradeSide_ = 0;
      onChanged();
      return this;
    }

    private double bestBid_ ;
    /**
     * <code>double bestBid = 8;</code>
     * @return The bestBid.
     */
    public double getBestBid() {
      return bestBid_;
    }
    /**
     * <code>double bestBid = 8;</code>
     * @param value The bestBid to set.
     * @return This builder for chaining.
     */
    public Builder setBestBid(double value) {
      
      bestBid_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bestBid = 8;</code>
     * @return This builder for chaining.
     */
    public Builder clearBestBid() {
      
      bestBid_ = 0D;
      onChanged();
      return this;
    }

    private double bestAsk_ ;
    /**
     * <code>double bestAsk = 9;</code>
     * @return The bestAsk.
     */
    public double getBestAsk() {
      return bestAsk_;
    }
    /**
     * <code>double bestAsk = 9;</code>
     * @param value The bestAsk to set.
     * @return This builder for chaining.
     */
    public Builder setBestAsk(double value) {
      
      bestAsk_ = value;
      onChanged();
      return this;
    }
    /**
     * <code>double bestAsk = 9;</code>
     * @return This builder for chaining.
     */
    public Builder clearBestAsk() {
      
      bestAsk_ = 0D;
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


    // @@protoc_insertion_point(builder_scope:gbdevw.colibri.domain.Ticker)
  }

  // @@protoc_insertion_point(class_scope:gbdevw.colibri.domain.Ticker)
  private static final gbdevw.colibri.domain.Ticker DEFAULT_INSTANCE;
  static {
    DEFAULT_INSTANCE = new gbdevw.colibri.domain.Ticker();
  }

  public static gbdevw.colibri.domain.Ticker getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Ticker>
      PARSER = new com.google.protobuf.AbstractParser<Ticker>() {
    @java.lang.Override
    public Ticker parsePartialFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return new Ticker(input, extensionRegistry);
    }
  };

  public static com.google.protobuf.Parser<Ticker> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Ticker> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public gbdevw.colibri.domain.Ticker getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }

}

