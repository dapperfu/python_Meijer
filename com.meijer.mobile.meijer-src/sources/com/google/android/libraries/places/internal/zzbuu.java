package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
final class zzbuu {
    private final AtomicLong zza = new AtomicLong();

    final long zza(long j10) {
        return this.zza.addAndGet(j10);
    }

    zzbuu() {
    }
}
