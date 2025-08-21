package com.google.android.libraries.places.internal;

import De.p;
import java.util.concurrent.ScheduledFuture;

/* loaded from: classes6.dex */
public final class zzbkc {
    private final zzbkb zza;
    private final ScheduledFuture zzb;

    public final void zza() {
        this.zza.zzb = true;
        this.zzb.cancel(false);
    }

    public final boolean zzb() {
        zzbkb zzbkbVar = this.zza;
        return (zzbkbVar.zzc || zzbkbVar.zzb) ? false : true;
    }

    /* synthetic */ zzbkc(zzbkb zzbkbVar, ScheduledFuture scheduledFuture, byte[] bArr) {
        this.zza = (zzbkb) p.r(zzbkbVar, "runnable");
        this.zzb = (ScheduledFuture) p.r(scheduledFuture, "future");
    }
}
