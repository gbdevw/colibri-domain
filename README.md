### Introduction 

This repository contains the protobuf schemas and generated java classes that describe the domain objects of the coinsight project.

### Domain

- Market events

Describe raw markent events such as market ticks and matches.

- Product behavior

Describe some base indicator produced from market events such as the OHLCV candles that describe the market behavior.

- Technical indicators

Describe some tehcnical indicators produced from the base indicators such as the MACD, RSI or ROC.

- Utils

Describe some codes such as currncy codes, etc...


### Project structure

src/main/resources/protobuf contains the schemas

src/main/java contains the java classes generated from the schemas

src/test/java contains some unit tests on the generated java classes

### Generate sources

```mvn clean generate-sources```

### Build and Test

```mvn clean test```
