package gbdevw.colibri.technicalindicator;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.Instant;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.gbdevw.colibri.domain.Currency;
import tech.gbdevw.colibri.domain.MACD;
import tech.gbdevw.colibri.domain.ROC;
import tech.gbdevw.colibri.domain.RSI;


public class TechnicalIndicatorsTest {

    static Logger LOG = LoggerFactory.getLogger(TechnicalIndicatorsTest.class.getSimpleName());

    @Test
    public void testROC () {

        try {
            LOG.info("testROC - BEGIN");

            // Test parameters
            Instant now = Instant.now();
            Currency base = Currency.EUR;
            Currency quote = Currency.BTC;
            int xperiod = 10;
            double value = 0.0132; // 1.32%
            double resistance = 199.11;
            double support = 185.89;
            
            // Build CRSLX
            ROC roc = ROC.newBuilder()
                .setTimestamp(now.toEpochMilli())
                .setUnit(base)
                .setQuote(quote)
                .setXPeriod(xperiod)
                .setRoc(value)
                .setResistance(resistance)
                .setSupport(support)
                .build();

            // Assert
            assertEquals(now.toEpochMilli(), roc.getTimestamp());
            assertEquals(base, roc.getUnit());
            assertEquals(quote, roc.getQuote());
            assertEquals(xperiod, roc.getXPeriod());
            assertEquals(resistance, roc.getResistance(), 0.0000001);
            assertEquals(support, roc.getSupport(), 0.0000001);

            // Test payload size
            long payloadSize = roc.toByteArray().length * 8;
            LOG.info("testROC - ROC payload size : " + payloadSize + " bytes");

            LOG.info("testROC - SUCCESS");
        }
        catch (Exception ex) {
            LOG.error("testROC - ERROR", ex);
            fail("testROC - An error occured during the test");
        }
    }

    @Test
    public void testMACD () {

        try {
            LOG.info("testMACD - BEGIN");

            // Test parameters
            Instant now = Instant.now();
            Currency base = Currency.EUR;
            Currency quote = Currency.BTC;
            double macd = 199.11;
            double signal = 188.42;
            
            // Build MACDX
            MACD macdx = MACD.newBuilder()
                .setTimestamp(now.toEpochMilli())
                .setUnit(base)
                .setQuote(quote)
                .setMacd(macd)
                .setSignal(signal)
                .build();

            // Assert
            assertEquals(now.toEpochMilli(), macdx.getTimestamp());
            assertEquals(base, macdx.getUnit());
            assertEquals(quote, macdx.getQuote());
            assertEquals(macd, macdx.getMacd(), 0.0000001);
            assertEquals(signal, macdx.getSignal(), 0.0000001);

            // Test payload size
            long payloadSize = macdx.toByteArray().length * 8;
            LOG.info("testMACD - MACD payload size : " + payloadSize + " bytes");

            LOG.info("testMACD - SUCCESS");
        }
        catch (Exception ex) {
            LOG.error("testMACD - ERROR", ex);
            fail("testMACD - An error occured during the test");
        }
    }

    @Test
    public void testRSI () {

        try {
            LOG.info("testRSI - BEGIN");

            // Test parameters
            Instant now = Instant.now();
            Currency base = Currency.EUR;
            Currency quote = Currency.BTC;
            int xPeriod = 10;
            double rsi = -0.725;
            
            // Build RSIX
            RSI rsix = RSI.newBuilder()
                .setTimestamp(now.toEpochMilli())
                .setUnit(base)
                .setQuote(quote)
                .setXPeriod(xPeriod)
                .setRsi(rsi)
                .build();

            // Assert
            assertEquals(now.toEpochMilli(), rsix.getTimestamp());
            assertEquals(base, rsix.getUnit());
            assertEquals(quote, rsix.getQuote());
            assertEquals(xPeriod, rsix.getXPeriod());
            assertEquals(rsi, rsix.getRsi(), 0.0000001);

            // Test payload size
            long payloadSize = rsix.toByteArray().length * 8;
            LOG.info("testRSI - RSI payload size : " + payloadSize + " bytes");

            LOG.info("testRSI - SUCCESS");
        }
        catch (Exception ex) {
            LOG.error("testRSI - ERROR", ex);
            fail("testRSI - An error occured during the test");
        }
    }
}