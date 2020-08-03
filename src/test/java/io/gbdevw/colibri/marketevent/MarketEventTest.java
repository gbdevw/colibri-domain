package io.gbdevw.colibri.marketevent;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.time.Instant;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import io.gbdevw.colibri.domain.marketevent.MarketEvent.Match;
import io.gbdevw.colibri.domain.marketevent.MarketEvent.Ticker;
import io.gbdevw.colibri.domain.utils.Utils.Currency;
import io.gbdevw.colibri.domain.utils.Utils.Side;

public class MarketEventTest {

    static Logger LOG = LoggerFactory.getLogger(MarketEventTest.class.getSimpleName());

    @Test
    public void testMatch () {

        try {
            LOG.info("testMatch - BEGIN");

            // Test parameters
            Instant now = Instant.now();
            Currency base = Currency.EUR;
            Currency quote = Currency.BTC;
            double price = 191.91;
            double size = 0.00015;
            Side side = Side.BUY;

            // Build a Match object
            Match match = Match.newBuilder()
                .setTimestamp(now.toEpochMilli())
                .setUnit(base)
                .setQuote(quote)
                .setPrice(price)
                .setSize(size)
                .setSide(side)
                .build();

            // Assert
            assertEquals(now.toEpochMilli(), match.getTimestamp());
            assertEquals(base, match.getUnit());
            assertEquals(quote, match.getQuote());
            assertEquals(price, match.getPrice(), 0.0000001);
            assertEquals(size, match.getSize(), 0.0000001);
            assertEquals(side, match.getSide());

            // Test paylaod size
            long payloadSize = match.toByteArray().length * 8;
            LOG.info("testMatch - Match payload size : " + payloadSize + " bytes");

            LOG.info("testMatch - SUCCESS");
        }
        catch(Exception ex) {
            LOG.error("testMatch - ERROR", ex);
            fail("testMatch - An error occured during the test");
        }
    }

    @Test
    public void testTick () {

        try {
            LOG.info("testTick - BEGIN");

            // Test parameters
            Instant now = Instant.now();
            Currency base = Currency.EUR;
            Currency quote = Currency.BTC;
            double ltprice = 190.93;
            double ltsize = 0.0312458;
            Side ltside = Side.BUY;
            double bb = 190.91;
            double ba = 190.97;

            // Build test object
            Ticker tick = Ticker.newBuilder()
                .setTimestamp(now.toEpochMilli())
                .setUnit(base)
                .setQuote(quote)
                .setLastTradePrice(ltprice)
                .setLastTradeSize(ltsize)
                .setLastTradeSide(ltside)
                .setBestBid(bb)
                .setBestAsk(ba)
                .build();

            // Assert
            assertEquals(now.toEpochMilli(), tick.getTimestamp());
            assertEquals(base, tick.getUnit());
            assertEquals(quote, tick.getQuote());
            assertEquals(ltprice, tick.getLastTradePrice(), 0.0000001);
            assertEquals(ltsize, tick.getLastTradeSize(), 0.0000001);
            assertEquals(ltside, tick.getLastTradeSide());
            assertEquals(bb, tick.getBestBid(), 0.0000001);
            assertEquals(ba, tick.getBestAsk(), 0.0000001);

            // Test payload size
            long payloadSize = tick.toByteArray().length * 8;
            LOG.info("testTick - Tick payload size : " + payloadSize + " bytes");

            LOG.info("testTick - SUCCESS");
        }
        catch(Exception ex) {
            LOG.error("testTick - ERROR", ex);
            fail("testTick - An error occured during the test");
        }
    }
}