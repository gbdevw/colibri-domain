### Introduction 

This repository contains the protobuf schemas and generated java classes that describe the domain objects of the colibri project.

### Domain

#### Market events

| Event | Description |
| --- | --- |
| Match | Produced every time a trade occurs. Contains trade data. |
| Ticker | Produced on a regular time basis. Contains last trade data as well as some data about the market state. |

#### Technical indicators

| Indicator | Description |
| --- | --- |
| OHLCV | Open, High, Low, Close, Volume |
| SMA | Simple Moving Average |
| EMA | Exponential Moving Average |
| ROC | Rate Of Change + Support/Resistance |
| FSO | Fast Stochastic Oscillator |
| SSO | Slow Stochastic Oscillator |
| MAR | Moving Average Ribbon |
| BOL | Bolinger Bands |

#### Utils

| Utils | Description |
| --- | --- |
| Currency | Currency codes (crypto. & fiat) |
| Side | Code for the side of the trade (BUY | SELL) |

### Project structure

- src/main/resources/protobuf contains the schemas

- src/main/java contains the java classes generated from the schemas

- serde contains KafkaSerializer and KafkaDeserializer for all the objects of the domain

- src/test/java contains some unit tests on the generated java classes

### Generate sources

```mvn clean generate-sources```

### Build and Test

```mvn clean test```
