// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ProductBehavior.proto

package io.gbdevw.colibri.domain.productbehavior;

public final class ProductBehavior {
  private ProductBehavior() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  public interface OHLCVOrBuilder extends
      // @@protoc_insertion_point(interface_extends:colibri.OHLCV)
      com.google.protobuf.MessageOrBuilder {

    /**
     * <code>uint64 periodStart = 1;</code>
     * @return The periodStart.
     */
    long getPeriodStart();

    /**
     * <code>.colibri.Currency unit = 2;</code>
     * @return The enum numeric value on the wire for unit.
     */
    int getUnitValue();
    /**
     * <code>.colibri.Currency unit = 2;</code>
     * @return The unit.
     */
    io.gbdevw.colibri.domain.utils.Utils.Currency getUnit();

    /**
     * <code>.colibri.Currency quote = 3;</code>
     * @return The enum numeric value on the wire for quote.
     */
    int getQuoteValue();
    /**
     * <code>.colibri.Currency quote = 3;</code>
     * @return The quote.
     */
    io.gbdevw.colibri.domain.utils.Utils.Currency getQuote();

    /**
     * <code>uint64 periodDuration = 4;</code>
     * @return The periodDuration.
     */
    long getPeriodDuration();

    /**
     * <code>double open = 5;</code>
     * @return The open.
     */
    double getOpen();

    /**
     * <code>double high = 6;</code>
     * @return The high.
     */
    double getHigh();

    /**
     * <code>double low = 7;</code>
     * @return The low.
     */
    double getLow();

    /**
     * <code>double close = 8;</code>
     * @return The close.
     */
    double getClose();

    /**
     * <code>double volume = 9;</code>
     * @return The volume.
     */
    double getVolume();
  }
  /**
   * <pre>
   * Open, High, Low, Close &amp; Volume candle
   * periodStart : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z. - Start of the period
   * unit : Unit currency (Ex : BTC, ETH)
   * quote : Quote currency (Ex : EUR, USD)
   * periodDuration : Duration of the period in milliseconds
   * open : Open price in quote currency for one unit of unit currency
   * high : Max. price in quote currency for one unit of unit currency
   * low : Min. price in quote currency for one unit of unit currency
   * close : Close price in quote currency for one unit of unit currency
   * volume : Volume of unit currency exchanged
   * </pre>
   *
   * Protobuf type {@code colibri.OHLCV}
   */
  public  static final class OHLCV extends
      com.google.protobuf.GeneratedMessageV3 implements
      // @@protoc_insertion_point(message_implements:colibri.OHLCV)
      OHLCVOrBuilder {
  private static final long serialVersionUID = 0L;
    // Use OHLCV.newBuilder() to construct.
    private OHLCV(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
      super(builder);
    }
    private OHLCV() {
      unit_ = 0;
      quote_ = 0;
    }

    @java.lang.Override
    @SuppressWarnings({"unused"})
    protected java.lang.Object newInstance(
        UnusedPrivateParameter unused) {
      return new OHLCV();
    }

    @java.lang.Override
    public final com.google.protobuf.UnknownFieldSet
    getUnknownFields() {
      return this.unknownFields;
    }
    private OHLCV(
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

              periodStart_ = input.readUInt64();
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
            case 32: {

              periodDuration_ = input.readUInt64();
              break;
            }
            case 41: {

              open_ = input.readDouble();
              break;
            }
            case 49: {

              high_ = input.readDouble();
              break;
            }
            case 57: {

              low_ = input.readDouble();
              break;
            }
            case 65: {

              close_ = input.readDouble();
              break;
            }
            case 73: {

              volume_ = input.readDouble();
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
      return io.gbdevw.colibri.domain.productbehavior.ProductBehavior.internal_static_colibri_OHLCV_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return io.gbdevw.colibri.domain.productbehavior.ProductBehavior.internal_static_colibri_OHLCV_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV.class, io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV.Builder.class);
    }

    public static final int PERIODSTART_FIELD_NUMBER = 1;
    private long periodStart_;
    /**
     * <code>uint64 periodStart = 1;</code>
     * @return The periodStart.
     */
    public long getPeriodStart() {
      return periodStart_;
    }

    public static final int UNIT_FIELD_NUMBER = 2;
    private int unit_;
    /**
     * <code>.colibri.Currency unit = 2;</code>
     * @return The enum numeric value on the wire for unit.
     */
    public int getUnitValue() {
      return unit_;
    }
    /**
     * <code>.colibri.Currency unit = 2;</code>
     * @return The unit.
     */
    public io.gbdevw.colibri.domain.utils.Utils.Currency getUnit() {
      @SuppressWarnings("deprecation")
      io.gbdevw.colibri.domain.utils.Utils.Currency result = io.gbdevw.colibri.domain.utils.Utils.Currency.valueOf(unit_);
      return result == null ? io.gbdevw.colibri.domain.utils.Utils.Currency.UNRECOGNIZED : result;
    }

    public static final int QUOTE_FIELD_NUMBER = 3;
    private int quote_;
    /**
     * <code>.colibri.Currency quote = 3;</code>
     * @return The enum numeric value on the wire for quote.
     */
    public int getQuoteValue() {
      return quote_;
    }
    /**
     * <code>.colibri.Currency quote = 3;</code>
     * @return The quote.
     */
    public io.gbdevw.colibri.domain.utils.Utils.Currency getQuote() {
      @SuppressWarnings("deprecation")
      io.gbdevw.colibri.domain.utils.Utils.Currency result = io.gbdevw.colibri.domain.utils.Utils.Currency.valueOf(quote_);
      return result == null ? io.gbdevw.colibri.domain.utils.Utils.Currency.UNRECOGNIZED : result;
    }

    public static final int PERIODDURATION_FIELD_NUMBER = 4;
    private long periodDuration_;
    /**
     * <code>uint64 periodDuration = 4;</code>
     * @return The periodDuration.
     */
    public long getPeriodDuration() {
      return periodDuration_;
    }

    public static final int OPEN_FIELD_NUMBER = 5;
    private double open_;
    /**
     * <code>double open = 5;</code>
     * @return The open.
     */
    public double getOpen() {
      return open_;
    }

    public static final int HIGH_FIELD_NUMBER = 6;
    private double high_;
    /**
     * <code>double high = 6;</code>
     * @return The high.
     */
    public double getHigh() {
      return high_;
    }

    public static final int LOW_FIELD_NUMBER = 7;
    private double low_;
    /**
     * <code>double low = 7;</code>
     * @return The low.
     */
    public double getLow() {
      return low_;
    }

    public static final int CLOSE_FIELD_NUMBER = 8;
    private double close_;
    /**
     * <code>double close = 8;</code>
     * @return The close.
     */
    public double getClose() {
      return close_;
    }

    public static final int VOLUME_FIELD_NUMBER = 9;
    private double volume_;
    /**
     * <code>double volume = 9;</code>
     * @return The volume.
     */
    public double getVolume() {
      return volume_;
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
      if (periodStart_ != 0L) {
        output.writeUInt64(1, periodStart_);
      }
      if (unit_ != io.gbdevw.colibri.domain.utils.Utils.Currency.EUR.getNumber()) {
        output.writeEnum(2, unit_);
      }
      if (quote_ != io.gbdevw.colibri.domain.utils.Utils.Currency.EUR.getNumber()) {
        output.writeEnum(3, quote_);
      }
      if (periodDuration_ != 0L) {
        output.writeUInt64(4, periodDuration_);
      }
      if (open_ != 0D) {
        output.writeDouble(5, open_);
      }
      if (high_ != 0D) {
        output.writeDouble(6, high_);
      }
      if (low_ != 0D) {
        output.writeDouble(7, low_);
      }
      if (close_ != 0D) {
        output.writeDouble(8, close_);
      }
      if (volume_ != 0D) {
        output.writeDouble(9, volume_);
      }
      unknownFields.writeTo(output);
    }

    @java.lang.Override
    public int getSerializedSize() {
      int size = memoizedSize;
      if (size != -1) return size;

      size = 0;
      if (periodStart_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(1, periodStart_);
      }
      if (unit_ != io.gbdevw.colibri.domain.utils.Utils.Currency.EUR.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(2, unit_);
      }
      if (quote_ != io.gbdevw.colibri.domain.utils.Utils.Currency.EUR.getNumber()) {
        size += com.google.protobuf.CodedOutputStream
          .computeEnumSize(3, quote_);
      }
      if (periodDuration_ != 0L) {
        size += com.google.protobuf.CodedOutputStream
          .computeUInt64Size(4, periodDuration_);
      }
      if (open_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(5, open_);
      }
      if (high_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(6, high_);
      }
      if (low_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(7, low_);
      }
      if (close_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(8, close_);
      }
      if (volume_ != 0D) {
        size += com.google.protobuf.CodedOutputStream
          .computeDoubleSize(9, volume_);
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
      if (!(obj instanceof io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV)) {
        return super.equals(obj);
      }
      io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV other = (io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV) obj;

      if (getPeriodStart()
          != other.getPeriodStart()) return false;
      if (unit_ != other.unit_) return false;
      if (quote_ != other.quote_) return false;
      if (getPeriodDuration()
          != other.getPeriodDuration()) return false;
      if (java.lang.Double.doubleToLongBits(getOpen())
          != java.lang.Double.doubleToLongBits(
              other.getOpen())) return false;
      if (java.lang.Double.doubleToLongBits(getHigh())
          != java.lang.Double.doubleToLongBits(
              other.getHigh())) return false;
      if (java.lang.Double.doubleToLongBits(getLow())
          != java.lang.Double.doubleToLongBits(
              other.getLow())) return false;
      if (java.lang.Double.doubleToLongBits(getClose())
          != java.lang.Double.doubleToLongBits(
              other.getClose())) return false;
      if (java.lang.Double.doubleToLongBits(getVolume())
          != java.lang.Double.doubleToLongBits(
              other.getVolume())) return false;
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
      hash = (37 * hash) + PERIODSTART_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPeriodStart());
      hash = (37 * hash) + UNIT_FIELD_NUMBER;
      hash = (53 * hash) + unit_;
      hash = (37 * hash) + QUOTE_FIELD_NUMBER;
      hash = (53 * hash) + quote_;
      hash = (37 * hash) + PERIODDURATION_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          getPeriodDuration());
      hash = (37 * hash) + OPEN_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getOpen()));
      hash = (37 * hash) + HIGH_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getHigh()));
      hash = (37 * hash) + LOW_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getLow()));
      hash = (37 * hash) + CLOSE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getClose()));
      hash = (37 * hash) + VOLUME_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(
          java.lang.Double.doubleToLongBits(getVolume()));
      hash = (29 * hash) + unknownFields.hashCode();
      memoizedHashCode = hash;
      return hash;
    }

    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
        java.nio.ByteBuffer data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
        java.nio.ByteBuffer data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
        com.google.protobuf.ByteString data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
        com.google.protobuf.ByteString data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(byte[] data)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
        byte[] data,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws com.google.protobuf.InvalidProtocolBufferException {
      return PARSER.parseFrom(data, extensionRegistry);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseDelimitedFrom(java.io.InputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseDelimitedFrom(
        java.io.InputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseDelimitedWithIOException(PARSER, input, extensionRegistry);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
        com.google.protobuf.CodedInputStream input)
        throws java.io.IOException {
      return com.google.protobuf.GeneratedMessageV3
          .parseWithIOException(PARSER, input);
    }
    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parseFrom(
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
    public static Builder newBuilder(io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV prototype) {
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
     * Open, High, Low, Close &amp; Volume candle
     * periodStart : The number of milliseconds from the epoch of 1970-01-01T00:00:00Z. - Start of the period
     * unit : Unit currency (Ex : BTC, ETH)
     * quote : Quote currency (Ex : EUR, USD)
     * periodDuration : Duration of the period in milliseconds
     * open : Open price in quote currency for one unit of unit currency
     * high : Max. price in quote currency for one unit of unit currency
     * low : Min. price in quote currency for one unit of unit currency
     * close : Close price in quote currency for one unit of unit currency
     * volume : Volume of unit currency exchanged
     * </pre>
     *
     * Protobuf type {@code colibri.OHLCV}
     */
    public static final class Builder extends
        com.google.protobuf.GeneratedMessageV3.Builder<Builder> implements
        // @@protoc_insertion_point(builder_implements:colibri.OHLCV)
        io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCVOrBuilder {
      public static final com.google.protobuf.Descriptors.Descriptor
          getDescriptor() {
        return io.gbdevw.colibri.domain.productbehavior.ProductBehavior.internal_static_colibri_OHLCV_descriptor;
      }

      @java.lang.Override
      protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
          internalGetFieldAccessorTable() {
        return io.gbdevw.colibri.domain.productbehavior.ProductBehavior.internal_static_colibri_OHLCV_fieldAccessorTable
            .ensureFieldAccessorsInitialized(
                io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV.class, io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV.Builder.class);
      }

      // Construct using io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV.newBuilder()
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
        periodStart_ = 0L;

        unit_ = 0;

        quote_ = 0;

        periodDuration_ = 0L;

        open_ = 0D;

        high_ = 0D;

        low_ = 0D;

        close_ = 0D;

        volume_ = 0D;

        return this;
      }

      @java.lang.Override
      public com.google.protobuf.Descriptors.Descriptor
          getDescriptorForType() {
        return io.gbdevw.colibri.domain.productbehavior.ProductBehavior.internal_static_colibri_OHLCV_descriptor;
      }

      @java.lang.Override
      public io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV getDefaultInstanceForType() {
        return io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV.getDefaultInstance();
      }

      @java.lang.Override
      public io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV build() {
        io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV result = buildPartial();
        if (!result.isInitialized()) {
          throw newUninitializedMessageException(result);
        }
        return result;
      }

      @java.lang.Override
      public io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV buildPartial() {
        io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV result = new io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV(this);
        result.periodStart_ = periodStart_;
        result.unit_ = unit_;
        result.quote_ = quote_;
        result.periodDuration_ = periodDuration_;
        result.open_ = open_;
        result.high_ = high_;
        result.low_ = low_;
        result.close_ = close_;
        result.volume_ = volume_;
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
        if (other instanceof io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV) {
          return mergeFrom((io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV)other);
        } else {
          super.mergeFrom(other);
          return this;
        }
      }

      public Builder mergeFrom(io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV other) {
        if (other == io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV.getDefaultInstance()) return this;
        if (other.getPeriodStart() != 0L) {
          setPeriodStart(other.getPeriodStart());
        }
        if (other.unit_ != 0) {
          setUnitValue(other.getUnitValue());
        }
        if (other.quote_ != 0) {
          setQuoteValue(other.getQuoteValue());
        }
        if (other.getPeriodDuration() != 0L) {
          setPeriodDuration(other.getPeriodDuration());
        }
        if (other.getOpen() != 0D) {
          setOpen(other.getOpen());
        }
        if (other.getHigh() != 0D) {
          setHigh(other.getHigh());
        }
        if (other.getLow() != 0D) {
          setLow(other.getLow());
        }
        if (other.getClose() != 0D) {
          setClose(other.getClose());
        }
        if (other.getVolume() != 0D) {
          setVolume(other.getVolume());
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
        io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV parsedMessage = null;
        try {
          parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
        } catch (com.google.protobuf.InvalidProtocolBufferException e) {
          parsedMessage = (io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV) e.getUnfinishedMessage();
          throw e.unwrapIOException();
        } finally {
          if (parsedMessage != null) {
            mergeFrom(parsedMessage);
          }
        }
        return this;
      }

      private long periodStart_ ;
      /**
       * <code>uint64 periodStart = 1;</code>
       * @return The periodStart.
       */
      public long getPeriodStart() {
        return periodStart_;
      }
      /**
       * <code>uint64 periodStart = 1;</code>
       * @param value The periodStart to set.
       * @return This builder for chaining.
       */
      public Builder setPeriodStart(long value) {
        
        periodStart_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 periodStart = 1;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeriodStart() {
        
        periodStart_ = 0L;
        onChanged();
        return this;
      }

      private int unit_ = 0;
      /**
       * <code>.colibri.Currency unit = 2;</code>
       * @return The enum numeric value on the wire for unit.
       */
      public int getUnitValue() {
        return unit_;
      }
      /**
       * <code>.colibri.Currency unit = 2;</code>
       * @param value The enum numeric value on the wire for unit to set.
       * @return This builder for chaining.
       */
      public Builder setUnitValue(int value) {
        unit_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.colibri.Currency unit = 2;</code>
       * @return The unit.
       */
      public io.gbdevw.colibri.domain.utils.Utils.Currency getUnit() {
        @SuppressWarnings("deprecation")
        io.gbdevw.colibri.domain.utils.Utils.Currency result = io.gbdevw.colibri.domain.utils.Utils.Currency.valueOf(unit_);
        return result == null ? io.gbdevw.colibri.domain.utils.Utils.Currency.UNRECOGNIZED : result;
      }
      /**
       * <code>.colibri.Currency unit = 2;</code>
       * @param value The unit to set.
       * @return This builder for chaining.
       */
      public Builder setUnit(io.gbdevw.colibri.domain.utils.Utils.Currency value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        unit_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.colibri.Currency unit = 2;</code>
       * @return This builder for chaining.
       */
      public Builder clearUnit() {
        
        unit_ = 0;
        onChanged();
        return this;
      }

      private int quote_ = 0;
      /**
       * <code>.colibri.Currency quote = 3;</code>
       * @return The enum numeric value on the wire for quote.
       */
      public int getQuoteValue() {
        return quote_;
      }
      /**
       * <code>.colibri.Currency quote = 3;</code>
       * @param value The enum numeric value on the wire for quote to set.
       * @return This builder for chaining.
       */
      public Builder setQuoteValue(int value) {
        quote_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>.colibri.Currency quote = 3;</code>
       * @return The quote.
       */
      public io.gbdevw.colibri.domain.utils.Utils.Currency getQuote() {
        @SuppressWarnings("deprecation")
        io.gbdevw.colibri.domain.utils.Utils.Currency result = io.gbdevw.colibri.domain.utils.Utils.Currency.valueOf(quote_);
        return result == null ? io.gbdevw.colibri.domain.utils.Utils.Currency.UNRECOGNIZED : result;
      }
      /**
       * <code>.colibri.Currency quote = 3;</code>
       * @param value The quote to set.
       * @return This builder for chaining.
       */
      public Builder setQuote(io.gbdevw.colibri.domain.utils.Utils.Currency value) {
        if (value == null) {
          throw new NullPointerException();
        }
        
        quote_ = value.getNumber();
        onChanged();
        return this;
      }
      /**
       * <code>.colibri.Currency quote = 3;</code>
       * @return This builder for chaining.
       */
      public Builder clearQuote() {
        
        quote_ = 0;
        onChanged();
        return this;
      }

      private long periodDuration_ ;
      /**
       * <code>uint64 periodDuration = 4;</code>
       * @return The periodDuration.
       */
      public long getPeriodDuration() {
        return periodDuration_;
      }
      /**
       * <code>uint64 periodDuration = 4;</code>
       * @param value The periodDuration to set.
       * @return This builder for chaining.
       */
      public Builder setPeriodDuration(long value) {
        
        periodDuration_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>uint64 periodDuration = 4;</code>
       * @return This builder for chaining.
       */
      public Builder clearPeriodDuration() {
        
        periodDuration_ = 0L;
        onChanged();
        return this;
      }

      private double open_ ;
      /**
       * <code>double open = 5;</code>
       * @return The open.
       */
      public double getOpen() {
        return open_;
      }
      /**
       * <code>double open = 5;</code>
       * @param value The open to set.
       * @return This builder for chaining.
       */
      public Builder setOpen(double value) {
        
        open_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double open = 5;</code>
       * @return This builder for chaining.
       */
      public Builder clearOpen() {
        
        open_ = 0D;
        onChanged();
        return this;
      }

      private double high_ ;
      /**
       * <code>double high = 6;</code>
       * @return The high.
       */
      public double getHigh() {
        return high_;
      }
      /**
       * <code>double high = 6;</code>
       * @param value The high to set.
       * @return This builder for chaining.
       */
      public Builder setHigh(double value) {
        
        high_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double high = 6;</code>
       * @return This builder for chaining.
       */
      public Builder clearHigh() {
        
        high_ = 0D;
        onChanged();
        return this;
      }

      private double low_ ;
      /**
       * <code>double low = 7;</code>
       * @return The low.
       */
      public double getLow() {
        return low_;
      }
      /**
       * <code>double low = 7;</code>
       * @param value The low to set.
       * @return This builder for chaining.
       */
      public Builder setLow(double value) {
        
        low_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double low = 7;</code>
       * @return This builder for chaining.
       */
      public Builder clearLow() {
        
        low_ = 0D;
        onChanged();
        return this;
      }

      private double close_ ;
      /**
       * <code>double close = 8;</code>
       * @return The close.
       */
      public double getClose() {
        return close_;
      }
      /**
       * <code>double close = 8;</code>
       * @param value The close to set.
       * @return This builder for chaining.
       */
      public Builder setClose(double value) {
        
        close_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double close = 8;</code>
       * @return This builder for chaining.
       */
      public Builder clearClose() {
        
        close_ = 0D;
        onChanged();
        return this;
      }

      private double volume_ ;
      /**
       * <code>double volume = 9;</code>
       * @return The volume.
       */
      public double getVolume() {
        return volume_;
      }
      /**
       * <code>double volume = 9;</code>
       * @param value The volume to set.
       * @return This builder for chaining.
       */
      public Builder setVolume(double value) {
        
        volume_ = value;
        onChanged();
        return this;
      }
      /**
       * <code>double volume = 9;</code>
       * @return This builder for chaining.
       */
      public Builder clearVolume() {
        
        volume_ = 0D;
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


      // @@protoc_insertion_point(builder_scope:colibri.OHLCV)
    }

    // @@protoc_insertion_point(class_scope:colibri.OHLCV)
    private static final io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV DEFAULT_INSTANCE;
    static {
      DEFAULT_INSTANCE = new io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV();
    }

    public static io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV getDefaultInstance() {
      return DEFAULT_INSTANCE;
    }

    private static final com.google.protobuf.Parser<OHLCV>
        PARSER = new com.google.protobuf.AbstractParser<OHLCV>() {
      @java.lang.Override
      public OHLCV parsePartialFrom(
          com.google.protobuf.CodedInputStream input,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
        return new OHLCV(input, extensionRegistry);
      }
    };

    public static com.google.protobuf.Parser<OHLCV> parser() {
      return PARSER;
    }

    @java.lang.Override
    public com.google.protobuf.Parser<OHLCV> getParserForType() {
      return PARSER;
    }

    @java.lang.Override
    public io.gbdevw.colibri.domain.productbehavior.ProductBehavior.OHLCV getDefaultInstanceForType() {
      return DEFAULT_INSTANCE;
    }

  }

  private static final com.google.protobuf.Descriptors.Descriptor
    internal_static_colibri_OHLCV_descriptor;
  private static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_colibri_OHLCV_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\025ProductBehavior.proto\022\007colibri\032\013Utils." +
      "proto\"\277\001\n\005OHLCV\022\023\n\013periodStart\030\001 \001(\004\022\037\n\004" +
      "unit\030\002 \001(\0162\021.colibri.Currency\022 \n\005quote\030\003" +
      " \001(\0162\021.colibri.Currency\022\026\n\016periodDuratio" +
      "n\030\004 \001(\004\022\014\n\004open\030\005 \001(\001\022\014\n\004high\030\006 \001(\001\022\013\n\003l" +
      "ow\030\007 \001(\001\022\r\n\005close\030\010 \001(\001\022\016\n\006volume\030\t \001(\001B" +
      "*\n(io.gbdevw.colibri.domain.productbehav" +
      "iorb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          io.gbdevw.colibri.domain.utils.Utils.getDescriptor(),
        });
    internal_static_colibri_OHLCV_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_colibri_OHLCV_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_colibri_OHLCV_descriptor,
        new java.lang.String[] { "PeriodStart", "Unit", "Quote", "PeriodDuration", "Open", "High", "Low", "Close", "Volume", });
    io.gbdevw.colibri.domain.utils.Utils.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
