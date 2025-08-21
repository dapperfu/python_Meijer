package j$.time.temporal;

import j$.time.Duration;

/* loaded from: classes3.dex */
public enum g implements TemporalUnit {
    WEEK_BASED_YEARS("WeekBasedYears"),
    QUARTER_YEARS("QuarterYears");


    /* renamed from: a, reason: collision with root package name */
    public final String f139532a;

    static {
        Duration.ofSeconds(31556952L);
        Duration.ofSeconds(7889238L);
    }

    g(String str) {
        this.f139532a = str;
    }

    @Override // j$.time.temporal.TemporalUnit
    public final Temporal C(Temporal temporal, long j10) {
        int i10 = a.f139528a[ordinal()];
        if (i10 == 1) {
            return temporal.a(Math.addExact(temporal.get(r0), j10), h.f139535c);
        }
        if (i10 == 2) {
            return temporal.b(j10 / 4, ChronoUnit.YEARS).b((j10 % 4) * 3, ChronoUnit.MONTHS);
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // j$.time.temporal.TemporalUnit
    public final long between(Temporal temporal, Temporal temporal2) {
        if (temporal.getClass() != temporal2.getClass()) {
            return temporal.until(temporal2, this);
        }
        int i10 = a.f139528a[ordinal()];
        if (i10 == 1) {
            f fVar = h.f139535c;
            return Math.subtractExact(temporal2.j(fVar), temporal.j(fVar));
        }
        if (i10 == 2) {
            return temporal.until(temporal2, ChronoUnit.MONTHS) / 3;
        }
        throw new IllegalStateException("Unreachable");
    }

    @Override // java.lang.Enum
    public final String toString() {
        return this.f139532a;
    }
}
