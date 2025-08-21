package lj;

import j$.time.LocalTime;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* renamed from: lj.c, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C15514c implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return LocalTime.from(temporalAccessor);
    }
}
