// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: domain.proto

package tech.gbdevw.colibri.domain;

public interface MatchOrBuilder extends
    // @@protoc_insertion_point(interface_extends:tech.gbdevw.colibri.domain.Match)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>uint64 timestamp = 1;</code>
   * @return The timestamp.
   */
  long getTimestamp();

  /**
   * <code>uint64 id = 2;</code>
   * @return The id.
   */
  long getId();

  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
   * @return The enum numeric value on the wire for unit.
   */
  int getUnitValue();
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency unit = 3;</code>
   * @return The unit.
   */
  tech.gbdevw.colibri.domain.Currency getUnit();

  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
   * @return The enum numeric value on the wire for quote.
   */
  int getQuoteValue();
  /**
   * <code>.tech.gbdevw.colibri.domain.Currency quote = 4;</code>
   * @return The quote.
   */
  tech.gbdevw.colibri.domain.Currency getQuote();

  /**
   * <code>double price = 5;</code>
   * @return The price.
   */
  double getPrice();

  /**
   * <code>double size = 6;</code>
   * @return The size.
   */
  double getSize();

  /**
   * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
   * @return The enum numeric value on the wire for side.
   */
  int getSideValue();
  /**
   * <code>.tech.gbdevw.colibri.domain.Side side = 7;</code>
   * @return The side.
   */
  tech.gbdevw.colibri.domain.Side getSide();
}
