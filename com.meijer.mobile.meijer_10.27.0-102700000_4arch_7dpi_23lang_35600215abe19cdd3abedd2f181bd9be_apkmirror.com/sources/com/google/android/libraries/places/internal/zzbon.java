package com.google.android.libraries.places.internal;

import Be.p;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
public final class zzbon {
    private final Random zza = new Random();
    private final long zzb;
    private final long zzc;
    private long zzd;

    public final long zza() {
        long j10 = this.zzd;
        double d10 = j10;
        this.zzd = Math.min((long) (1.6d * d10), this.zzc);
        double d11 = 0.2d * d10;
        double d12 = d10 * (-0.2d);
        p.d(d11 >= d12);
        return j10 + ((long) ((this.zza.nextDouble() * (d11 - d12)) + d12));
    }

    public zzbon() {
        long nanos = TimeUnit.SECONDS.toNanos(1L);
        this.zzb = nanos;
        this.zzc = TimeUnit.MINUTES.toNanos(2L);
        this.zzd = nanos;
    }
}
