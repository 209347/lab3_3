package edu.iis.mto.time;

import java.time.Clock;
import java.time.Instant;
import java.time.ZoneId;

public class FakeClock extends Clock {

    private long clockOffset;

    public void setClockOffset(long clockOffset) {
        this.clockOffset = clockOffset;
    }

    @Override
    public ZoneId getZone() {
        return ZoneId.systemDefault();
    }

    @Override
    public Clock withZone(ZoneId zone) {
        return Clock.fixed(instant(), zone);
    }

    @Override
    public Instant instant() {
        return Instant.now();
    }

    public Instant instantWithOffset() {
        return instant().plusSeconds(clockOffset);
    }
}
