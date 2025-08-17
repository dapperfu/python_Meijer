package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbnu implements Runnable {
    final /* synthetic */ zzbwi zza;
    final /* synthetic */ zzbny zzb;

    zzbnu(zzbny zzbnyVar, zzbwi zzbwiVar) {
        this.zza = zzbwiVar;
        Objects.requireNonNull(zzbnyVar);
        this.zzb = zzbnyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zzb(this.zza);
    }
}
