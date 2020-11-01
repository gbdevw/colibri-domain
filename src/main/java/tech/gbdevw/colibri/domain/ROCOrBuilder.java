// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

public interface ROCOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech.gbdevw.colibri.domain.ROC)
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
   * <code>uint32 xPeriod = 4;</code>
   * @return The xPeriod.
   */
  int getXPeriod();

  /**
   * <code>double roc = 5;</code>
   * @return The roc.
   */
  double getRoc();

  /**
   * <code>double resistance = 6;</code>
   * @return The resistance.
   */
  double getResistance();

  /**
   * <code>double support = 7;</code>
   * @return The support.
   */
  double getSupport();
}
