package jj;

import j$.time.Year;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* loaded from: classes7.dex */
public final /* synthetic */ class C implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Year.from(temporalAccessor);
    }
}
