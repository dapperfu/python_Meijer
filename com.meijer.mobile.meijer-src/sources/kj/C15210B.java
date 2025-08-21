package kj;

import j$.time.Month;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* renamed from: kj.B, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final /* synthetic */ class C15210B implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Month.from(temporalAccessor);
    }
}
