package el;

import j$.time.Instant;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* renamed from: el.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C13684a implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return Instant.from(temporalAccessor);
    }
}
