// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

public interface BOLOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech.gbdevw.colibri.domain.BOL)
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
   * <code>double bolu1 = 5;</code>
   * @return The bolu1.
   */
  double getBolu1();

  /**
   * <code>double bolu2 = 6;</code>
   * @return The bolu2.
   */
  double getBolu2();

  /**
   * <code>double bolu3 = 7;</code>
   * @return The bolu3.
   */
  double getBolu3();

  /**
   * <code>double bolu4 = 8;</code>
   * @return The bolu4.
   */
  double getBolu4();

  /**
   * <code>double bold1 = 9;</code>
   * @return The bold1.
   */
  double getBold1();

  /**
   * <code>double bold2 = 10;</code>
   * @return The bold2.
   */
  double getBold2();

  /**
   * <code>double bold3 = 11;</code>
   * @return The bold3.
   */
  double getBold3();

  /**
   * <code>double bold4 = 12;</code>
   * @return The bold4.
   */
  double getBold4();
}
