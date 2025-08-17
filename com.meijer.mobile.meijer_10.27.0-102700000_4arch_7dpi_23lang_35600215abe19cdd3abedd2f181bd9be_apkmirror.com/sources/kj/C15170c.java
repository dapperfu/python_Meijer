package kj;

import j$.time.LocalTime;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;

/* renamed from: kj.c, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C15170c implements TemporalQuery {
    @Override // j$.time.temporal.TemporalQuery
    public final Object queryFrom(TemporalAccessor temporalAccessor) {
        return LocalTime.from(temporalAccessor);
    }
}
