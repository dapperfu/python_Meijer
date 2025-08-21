package fl;

import j$.time.Instant;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* renamed from: fl.a, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final /* synthetic */ class C14016a implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
