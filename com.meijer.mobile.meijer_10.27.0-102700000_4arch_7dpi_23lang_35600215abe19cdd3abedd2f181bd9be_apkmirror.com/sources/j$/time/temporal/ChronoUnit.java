package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public enum ChronoUnit implements TemporalUnit {
    NANOS("Nanos"),
    MICROS("Micros"),
    MILLIS("Millis"),
    SECONDS("Seconds"),
    MINUTES("Minutes"),
    HOURS("Hours"),
    HALF_DAYS("HalfDays"),
    DAYS("Days"),
    WEEKS("Weeks"),
    MONTHS("Months"),
    YEARS("Years"),
    DECADES("Decades"),
    CENTURIES("Centuries"),
    MILLENNIA("Millennia"),
    ERAS("Eras"),
    FOREVER("Forever");


    /* renamed from: a, reason: collision with root package name */
    public final String f138928a;

    static {
        Duration.O(1L);
        Duration.O(1000L);
        Duration.O(1000000L);
        Duration.ofSeconds(1L);
        Duration.ofSeconds(60L);
        Duration.ofSeconds(3600L);
        Duration.ofSeconds(43200L);
        Duration.ofSeconds(86400L);
        Duration.ofSeconds(604800L);
        Duration.ofSeconds(2629746L);
        Duration.ofSeconds(31556952L);
        Duration.ofSeconds(315569520L);
        Duration.ofSeconds(3155695200L);
        Duration.ofSeconds(31556952000L);
        Duration.ofSeconds(31556952000000000L);
        Duration.ofSeconds(Long.MAX_VALUE, 999999999L);
    }

    ChronoUnit(String str) {
        this.f138928a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal C(Temporal temporal, long j10) {
        return temporal.b(j10, this);
    }

    @Override // j$.time.temporal.TemporalUnit
    public long between(Temporal temporal, Temporal temporal2) {
        return temporal.until(temporal2, this);
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f138928a;
    }
}
