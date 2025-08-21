package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbvg implements Runnable {
    final /* synthetic */ zzbwi zza;
    final /* synthetic */ zzbvi zzb;

    zzbvg(zzbvi zzbviVar, zzbwi zzbwiVar) {
        this.zza = zzbwiVar;
        Objects.requireNonNull(zzbviVar);
        this.zzb = zzbviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzb.zzY().zzb(this.zza);
    }
}
