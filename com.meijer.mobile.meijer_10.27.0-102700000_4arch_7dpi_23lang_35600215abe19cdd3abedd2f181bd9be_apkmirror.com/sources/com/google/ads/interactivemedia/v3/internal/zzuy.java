package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
final class zzuy extends zzue implements ScheduledFuture, zzuu {
    private final ScheduledFuture zza;

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.zza.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.zza.getDelay(timeUnit);
    }

    public zzuy(zzuu zzuuVar, ScheduledFuture scheduledFuture) {
        super(zzuuVar);
        this.zza = scheduledFuture;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzud, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean zCancel = zzb().cancel(z10);
        if (zCancel) {
            this.zza.cancel(z10);
        }
        return zCancel;
    }
}
