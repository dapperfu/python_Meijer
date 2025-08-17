package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbsy implements Runnable {
    final /* synthetic */ zzbti zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbti zzbtiVar = this.zza;
        zzbtiVar.zzl(null);
        if (zzbtiVar.zzk().zzb()) {
            zzbtiVar.zzd();
        }
    }

    zzbsy(zzbti zzbtiVar) {
        Objects.requireNonNull(zzbtiVar);
        this.zza = zzbtiVar;
    }
}
