package com.google.android.libraries.places.internal;

import De.p;
import java.util.concurrent.atomic.AtomicLong;
import java.util.logging.Logger;

/* loaded from: classes6.dex */
public final class zzbku {
    private static final Logger zza = Logger.getLogger(zzbku.class.getName());
    private final String zzb;
    private final AtomicLong zzc;

    final /* synthetic */ String zzc() {
        return this.zzb;
    }

    final /* synthetic */ AtomicLong zzd() {
        return this.zzc;
    }

    public final zzbkt zza() {
        return new zzbkt(this, this.zzc.get(), null);
    }

    public zzbku(String str, long j10) {
        AtomicLong atomicLong = new AtomicLong();
        this.zzc = atomicLong;
        p.e(true, "value must be positive");
        this.zzb = "keepalive time nanos";
        atomicLong.set(Long.MAX_VALUE);
    }
}
