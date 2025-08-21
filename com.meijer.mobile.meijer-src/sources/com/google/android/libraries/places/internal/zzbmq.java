package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbmq implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzbna zzb;

    zzbmq(zzbna zzbnaVar, Object obj) {
        this.zza = obj;
        Objects.requireNonNull(zzbnaVar);
        this.zzb = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzb(this.zza);
    }
}
