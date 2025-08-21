package kj;

import j$.time.OffsetDateTime;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* loaded from: classes8.dex */
public final /* synthetic */ class r implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return OffsetDateTime.from(temporalAccessor);
    }
}
