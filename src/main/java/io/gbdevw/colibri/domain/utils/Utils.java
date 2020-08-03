// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: Utils.proto

package io.gbdevw.colibri.domain.utils;

public final class Utils {
  private Utils() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  /**
   * Protobuf enum {@code colibri.Currency}
   */
  public enum Currency
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>EUR = 0;</code>
     */
    EUR(0),
    /**
     * <code>USD = 1;</code>
     */
    USD(1),
    /**
     * <code>BTC = 2;</code>
     */
    BTC(2),
    /**
     * <code>ETH = 3;</code>
     */
    ETH(3),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>EUR = 0;</code>
     */
    public static final int EUR_VALUE = 0;
    /**
     * <code>USD = 1;</code>
     */
    public static final int USD_VALUE = 1;
    /**
     * <code>BTC = 2;</code>
     */
    public static final int BTC_VALUE = 2;
    /**
     * <code>ETH = 3;</code>
     */
    public static final int ETH_VALUE = 3;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Currency valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Currency forNumber(int value) {
      switch (value) {
        case 0: return EUR;
        case 1: return USD;
        case 2: return BTC;
        case 3: return ETH;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Currency>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Currency> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Currency>() {
            public Currency findValueByNumber(int number) {
              return Currency.forNumber(number);
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
      return io.gbdevw.colibri.domain.utils.Utils.getDescriptor().getEnumTypes().get(0);
    }

    private static final Currency[] VALUES = values();

    public static Currency valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Currency(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:colibri.Currency)
  }

  /**
   * Protobuf enum {@code colibri.Side}
   */
  public enum Side
      implements com.google.protobuf.ProtocolMessageEnum {
    /**
     * <code>BUY = 0;</code>
     */
    BUY(0),
    /**
     * <code>SELL = 1;</code>
     */
    SELL(1),
    UNRECOGNIZED(-1),
    ;

    /**
     * <code>BUY = 0;</code>
     */
    public static final int BUY_VALUE = 0;
    /**
     * <code>SELL = 1;</code>
     */
    public static final int SELL_VALUE = 1;


    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Side valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Side forNumber(int value) {
      switch (value) {
        case 0: return BUY;
        case 1: return SELL;
        default: return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Side>
        internalGetValueMap() {
      return internalValueMap;
    }
    private static final com.google.protobuf.Internal.EnumLiteMap<
        Side> internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<Side>() {
            public Side findValueByNumber(int number) {
              return Side.forNumber(number);
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
      return io.gbdevw.colibri.domain.utils.Utils.getDescriptor().getEnumTypes().get(1);
    }

    private static final Side[] VALUES = values();

    public static Side valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException(
          "EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Side(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:colibri.Side)
  }


  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\013Utils.proto\022\007colibri*.\n\010Currency\022\007\n\003EU" +
      "R\020\000\022\007\n\003USD\020\001\022\007\n\003BTC\020\002\022\007\n\003ETH\020\003*\031\n\004Side\022\007" +
      "\n\003BUY\020\000\022\010\n\004SELL\020\001B \n\036io.gbdevw.colibri.d" +
      "omain.utilsb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
