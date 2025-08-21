package j$.time.temporal;

import j$.time.LocalDate;

/* loaded from: classes3.dex */
public interface Temporal extends TemporalAccessor {
    Temporal a(long j10, TemporalField temporalField);

    Temporal b(long j10, TemporalUnit temporalUnit);

    long until(Temporal temporal, TemporalUnit temporalUnit);

    /* renamed from: e */
    default Temporal i(LocalDate localDate) {
        return localDate.f(this);
    }

    default Temporal c(long j10, TemporalUnit temporalUnit) {
        return j10 == Long.MIN_VALUE ? b(Long.MAX_VALUE, temporalUnit).b(1L, temporalUnit) : b(-j10, temporalUnit);
    }
}
