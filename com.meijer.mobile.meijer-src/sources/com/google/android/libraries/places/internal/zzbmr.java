package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbmr implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzbna zzb;

    zzbmr(zzbna zzbnaVar, int i10) {
        this.zza = i10;
        Objects.requireNonNull(zzbnaVar);
        this.zzb = zzbnaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzk().zzc(this.zza);
    }
}
