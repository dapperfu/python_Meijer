package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes6.dex */
final class zzbkv implements zzbqm {
    private final AtomicLong zza = new AtomicLong();

    @Override // com.google.android.libraries.places.internal.zzbqm
    public final void zza(long j10) {
        this.zza.getAndAdd(1L);
    }

    zzbkv() {
    }
}
