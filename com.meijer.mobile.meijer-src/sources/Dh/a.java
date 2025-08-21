package Dh;

import j$.time.LocalDate;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* loaded from: classes8.dex */
public final /* synthetic */ class a implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return LocalDate.from(temporalAccessor);
    }
}
