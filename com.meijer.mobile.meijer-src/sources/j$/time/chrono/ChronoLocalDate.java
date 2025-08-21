package j$.time.chrono;

import j$.time.LocalTime;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes3.dex */
public interface ChronoLocalDate extends Temporal, j$.time.temporal.k, Comparable<ChronoLocalDate> {
    boolean equals(Object obj);

    Chronology g();

    int hashCode();

    String toString();

    @Override // j$.time.temporal.Temporal
    long until(Temporal temporal, TemporalUnit temporalUnit);

    default ChronoLocalDateTime T(LocalTime localTime) {
        return new C14874e(this, localTime);
    }

    default j W() {
        return g().I(get(ChronoField.ERA));
    }

    default boolean E() {
        return g().g0(j(ChronoField.YEAR));
    }

    default int e0() {
        return E() ? 366 : 365;
    }

    @Override // j$.time.temporal.TemporalAccessor
    default boolean h(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            return ((ChronoField) temporalField).isDateBased();
        }
        return temporalField != null && temporalField.C(this);
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate i(j$.time.temporal.k kVar) {
        return AbstractC14872c.C(g(), kVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate a(long j10, TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            throw new j$.time.temporal.o(j$.time.b.a("Unsupported field: ", temporalField));
        }
        return AbstractC14872c.C(g(), temporalField.f0(this, j10));
    }

    default ChronoLocalDate b0(j$.time.temporal.m mVar) {
        return AbstractC14872c.C(g(), mVar.C(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate b(long j10, TemporalUnit temporalUnit) {
        if (temporalUnit instanceof ChronoUnit) {
            throw new j$.time.temporal.o("Unsupported unit: " + temporalUnit);
        }
        return AbstractC14872c.C(g(), temporalUnit.C(this, j10));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDate c(long j10, TemporalUnit temporalUnit) {
        return AbstractC14872c.C(g(), super.c(j10, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139546a || temporalQuery == j$.time.temporal.n.f139550e || temporalQuery == j$.time.temporal.n.f139549d || temporalQuery == j$.time.temporal.n.f139552g) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.n.f139547b) {
            return g();
        }
        if (temporalQuery == j$.time.temporal.n.f139548c) {
            return ChronoUnit.DAYS;
        }
        return temporalQuery.queryFrom(this);
    }

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(S(), ChronoField.EPOCH_DAY);
    }

    default long S() {
        return j(ChronoField.EPOCH_DAY);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.lang.Comparable
    default int compareTo(ChronoLocalDate chronoLocalDate) {
        int iCompare = Long.compare(S(), chronoLocalDate.S());
        if (iCompare != 0) {
            return iCompare;
        }
        return ((AbstractC14870a) g()).compareTo(chronoLocalDate.g());
    }
}
