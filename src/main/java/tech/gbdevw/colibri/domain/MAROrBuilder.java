// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

public interface MAROrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech.gbdevw.colibri.domain.MAR)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 timestamp = 1;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 2;</code>
   * @return The unit.
   */
  tech.gbdevw.colibri.domain.Currency getUnit();

  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
   * @return The enum numeric value on the wire for quote.
   */
  int getQuoteValue();
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 3;</code>
   * @return The quote.
   */
  tech.gbdevw.colibri.domain.Currency getQuote();

  /**
   * <code>uint32 xPeriod1 = 4;</code>
   * @return The xPeriod1.
   */
  int getXPeriod1();

  /**
   * <code>uint32 xPeriod2 = 5;</code>
   * @return The xPeriod2.
   */
  int getXPeriod2();

  /**
   * <code>uint32 xPeriod3 = 6;</code>
   * @return The xPeriod3.
   */
  int getXPeriod3();

  /**
   * <code>double fast = 7;</code>
   * @return The fast.
   */
  double getFast();

  /**
   * <code>double medium = 8;</code>
   * @return The medium.
   */
  double getMedium();

  /**
   * <code>double slow = 9;</code>
   * @return The slow.
   */
  double getSlow();
}
