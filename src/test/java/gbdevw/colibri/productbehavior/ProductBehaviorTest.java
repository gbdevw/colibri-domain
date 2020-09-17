package gbdevw.colibri.productbehavior;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.Instant;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import tech.gbdevw.colibri.domain.Currency;
import tech.gbdevw.colibri.domain.OHLCV;

public class ProductBehaviorTest {

    static Logger LOG = LoggerFactory.getLogger(ProductBehaviorTest.class.getSimpleName());

    @Test
    public void testOLHCV () {

        try {
            LOG.info("testOLHCV - BEGIN");

            // Test parameters
            Instant now = Instant.now();
            Currency base = Currency.EUR;
            Currency quote = Currency.BTC;
            int duration = 10;
            double open = 190.91;
            double high = 191.11;
            double low = 190.89;
            double close = 190.97;
            double volume = 1.100042;
            
            // Build OHLCV
            OHLCV ohlcv = OHLCV.newBuilder()
                .setPeriodStart(now.toEpochMilli())
                .setUnit(base)
                .setQuote(quote)
                .setPeriodDuration(duration)
                .setOpen(open)
                .setHigh(high)
                .setLow(low)
                .setClose(close)
                .setVolume(volume)
                .build();

            // Assert
            assertEquals(now.toEpochMilli(), ohlcv.getPeriodStart());
            assertEquals(base, ohlcv.getUnit());
            assertEquals(quote, ohlcv.getQuote());
            assertEquals(duration, ohlcv.getPeriodDuration());
            assertEquals(open, ohlcv.getOpen(), 0.0000001);
            assertEquals(high, ohlcv.getHigh(), 0.0000001);
            assertEquals(low, ohlcv.getLow(), 0.0000001);
            assertEquals(close, ohlcv.getClose(), 0.0000001);
            assertEquals(volume, ohlcv.getVolume(), 0.0000001);

            // Test payload size
            long payloadSize = ohlcv.toByteArray().length * 8;
            LOG.info("testOLHCV - OHLCV payload size : " + payloadSize + " bytes");

            LOG.info("testOLHCV - SUCCESS");
        }
        catch (Exception ex) {
            LOG.error("testOLHCV - ERROR", ex);
            fail("testOLHCV - An error occured during the test");
        }
    }
}