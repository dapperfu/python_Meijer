package uh;

import j$.time.YearMonth;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* loaded from: classes8.dex */
public final /* synthetic */ class i implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return YearMonth.from(temporalAccessor);
    }
}
