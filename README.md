### Introduction 

This repository contains the protobuf schemas and generated java classes that describe the domain objects of the colibri project.

### Domain

- Market events

Describe raw markent events such as market Ticker and Match.

- Technical indicators

Describe some technical indicators produced from OHLCV candles such as the MACD, RSI or ROC.

- Utils

Describe some codes for currencies, etc...


### Project structure

- src/main/resources/protobuf contains the schemas

- src/main/java contains the java classes generated from the schemas

- serde contains KafkaSerializer and KafkaDeserializer for all the objects of the domain

- src/test/java contains some unit tests on the generated java classes

### Generate sources

```mvn clean generate-sources```

### Build and Test

```mvn clean test```
