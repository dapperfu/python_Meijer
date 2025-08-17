package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbmw implements Runnable {
    final /* synthetic */ Object zza;
    final /* synthetic */ zzbmz zzb;

    zzbmw(zzbmz zzbmzVar, Object obj) {
        this.zza = obj;
        Objects.requireNonNull(zzbmzVar);
        this.zzb = zzbmzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.zzf().zzb(this.zza);
    }
}
