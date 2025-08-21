package uh;

import j$.time.LocalDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* loaded from: classes8.dex */
public final /* synthetic */ class j implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return LocalDateTime.from(temporalAccessor);
    }
}
