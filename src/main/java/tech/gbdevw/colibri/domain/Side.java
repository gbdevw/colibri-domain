// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

/**
 * <pre>
 * Side codes 
 * </pre>
 *
 * Protobuf enum {@code tech.gbdevw.colibri.domain.Side}
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
    return tech.gbdevw.colibri.domain.Domain.getDescriptor().getEnumTypes().get(1);
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

  // @@protoc_insertion_point(enum_scope:tech.gbdevw.colibri.domain.Side)
}

