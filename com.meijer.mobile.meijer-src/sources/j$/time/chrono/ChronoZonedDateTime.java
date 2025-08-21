package j$.time.chrono;

import j$.time.Instant;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.ChronoLocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.ChronoUnit;
import j$.time.temporal.Temporal;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.time.temporal.TemporalUnit;

/* loaded from: classes3.dex */
public interface ChronoZonedDateTime<D extends ChronoLocalDate> extends Temporal, Comparable<ChronoZonedDateTime<?>> {
    ChronoLocalDateTime D();

    ChronoZonedDateTime M(ZoneId zoneId);

    ZoneId R();

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime a(long j10, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    ChronoZonedDateTime b(long j10, TemporalUnit temporalUnit);

    ZoneOffset m();

    ChronoZonedDateTime n(ZoneId zoneId);

    @Override // j$.time.temporal.TemporalAccessor
    default j$.time.temporal.p k(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            if (temporalField != ChronoField.INSTANT_SECONDS && temporalField != ChronoField.OFFSET_SECONDS) {
                return D().k(temporalField);
            }
            return ((ChronoField) temporalField).f139516d;
        }
        return temporalField.H(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default int get(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = g.f139343a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                throw new j$.time.temporal.o("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
            }
            if (i10 != 2) {
                return D().get(temporalField);
            }
            return m().f139317b;
        }
        return super.get(temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    default long j(TemporalField temporalField) {
        if (temporalField instanceof ChronoField) {
            int i10 = g.f139343a[((ChronoField) temporalField).ordinal()];
            if (i10 == 1) {
                return h0();
            }
            if (i10 != 2) {
                return D().j(temporalField);
            }
            return m().f139317b;
        }
        return temporalField.Z(this);
    }

    default ChronoLocalDate l() {
        return D().l();
    }

    default LocalTime toLocalTime() {
        return D().toLocalTime();
    }

    default Chronology g() {
        return l().g();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime i(j$.time.temporal.k kVar) {
        return i.C(g(), kVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoZonedDateTime c(long j10, TemporalUnit temporalUnit) {
        return i.C(g(), super.c(j10, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139550e || temporalQuery == j$.time.temporal.n.f139546a) {
            return R();
        }
        if (temporalQuery == j$.time.temporal.n.f139549d) {
            return m();
        }
        if (temporalQuery == j$.time.temporal.n.f139552g) {
            return toLocalTime();
        }
        if (temporalQuery == j$.time.temporal.n.f139547b) {
            return g();
        }
        if (temporalQuery == j$.time.temporal.n.f139548c) {
            return ChronoUnit.NANOS;
        }
        return temporalQuery.queryFrom(this);
    }

    default Instant toInstant() {
        return Instant.ofEpochSecond(h0(), toLocalTime().f139297d);
    }

    default long h0() {
        return ((l().S() * 86400) + toLocalTime().o0()) - m().f139317b;
    }

    @Override // java.lang.Comparable
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    default int compareTo(ChronoZonedDateTime chronoZonedDateTime) {
        int iCompare = Long.compare(h0(), chronoZonedDateTime.h0());
        return (iCompare == 0 && (iCompare = toLocalTime().f139297d - chronoZonedDateTime.toLocalTime().f139297d) == 0 && (iCompare = D().compareTo(chronoZonedDateTime.D())) == 0 && (iCompare = R().getId().compareTo(chronoZonedDateTime.R().getId())) == 0) ? g().compareTo(chronoZonedDateTime.g()) : iCompare;
    }

    default boolean isBefore(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long jH0 = h0();
        long jH02 = chronoZonedDateTime.h0();
        if (jH0 >= jH02) {
            return jH0 == jH02 && toLocalTime().f139297d < chronoZonedDateTime.toLocalTime().f139297d;
        }
        return true;
    }

    default boolean isAfter(ChronoZonedDateTime<?> chronoZonedDateTime) {
        long jH0 = h0();
        long jH02 = chronoZonedDateTime.h0();
        if (jH0 <= jH02) {
            return jH0 == jH02 && toLocalTime().f139297d > chronoZonedDateTime.toLocalTime().f139297d;
        }
        return true;
    }
}
