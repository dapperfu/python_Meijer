package com.google.android.libraries.places.internal;

import android.os.SystemClock;
import j$.time.Instant;

/* loaded from: classes6.dex */
public final class zzeb implements zzdy {
    @Override // com.google.android.libraries.places.internal.zzdy
    public final Instant zza() {
        return Instant.now();
    }

    @Override // com.google.android.libraries.places.internal.zzdy
    public final long zzb() {
        return SystemClock.elapsedRealtime();
    }
}
