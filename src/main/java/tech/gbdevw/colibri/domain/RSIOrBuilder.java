// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

public interface RSIOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech.gbdevw.colibri.domain.RSI)
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
   * <code>double rsi = 4;</code>
   * @return The rsi.
   */
  double getRsi();
}
