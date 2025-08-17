package jj;

import j$.time.Month;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* renamed from: jj.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C14976B implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Month.from(temporalAccessor);
    }
}
