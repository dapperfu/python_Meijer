package j$.time.chrono;

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
import java.util.Objects;

/* loaded from: classes3.dex */
public interface ChronoLocalDateTime<D extends ChronoLocalDate> extends Temporal, j$.time.temporal.k, Comparable<ChronoLocalDateTime<?>> {
    ChronoZonedDateTime N(ZoneId zoneId);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime a(long j10, TemporalField temporalField);

    @Override // j$.time.temporal.Temporal
    ChronoLocalDateTime b(long j10, TemporalUnit temporalUnit);

    ChronoLocalDate l();

    LocalTime toLocalTime();

    default Chronology g() {
        return l().g();
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime i(j$.time.temporal.k kVar) {
        return C14874e.C(g(), kVar.f(this));
    }

    @Override // j$.time.temporal.Temporal
    default ChronoLocalDateTime c(long j10, TemporalUnit temporalUnit) {
        return C14874e.C(g(), super.c(j10, temporalUnit));
    }

    @Override // j$.time.temporal.TemporalAccessor
    default Object d(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.n.f139546a || temporalQuery == j$.time.temporal.n.f139550e || temporalQuery == j$.time.temporal.n.f139549d) {
            return null;
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

    @Override // j$.time.temporal.k
    default Temporal f(Temporal temporal) {
        return temporal.a(l().S(), ChronoField.EPOCH_DAY).a(toLocalTime().n0(), ChronoField.NANO_OF_DAY);
    }

    default long A(ZoneOffset zoneOffset) {
        Objects.requireNonNull(zoneOffset, "offset");
        return ((l().S() * 86400) + toLocalTime().o0()) - zoneOffset.f139317b;
    }

    @Override // java.lang.Comparable
    /* renamed from: Y */
    default int compareTo(ChronoLocalDateTime chronoLocalDateTime) {
        int iCompareTo = l().compareTo(chronoLocalDateTime.l());
        return (iCompareTo == 0 && (iCompareTo = toLocalTime().compareTo(chronoLocalDateTime.toLocalTime())) == 0) ? g().compareTo(chronoLocalDateTime.g()) : iCompareTo;
    }
}
