package com.google.android.libraries.places.internal;

import He.d;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbpm implements zzbwk {
    zzbpm() {
    }

    @Override // com.google.android.libraries.places.internal.zzbwk
    public final long zza() {
        return d.d(TimeUnit.SECONDS.toNanos(Instant.now().getEpochSecond()), r0.getNano());
    }
}
