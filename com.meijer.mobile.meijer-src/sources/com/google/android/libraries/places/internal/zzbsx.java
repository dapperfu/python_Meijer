package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbsx implements Runnable {
    final /* synthetic */ zzbti zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbti zzbtiVar = this.zza;
        zzbtiVar.zzn(null);
        zzbtiVar.zzk().zzc();
        zzbtiVar.zzd();
    }

    zzbsx(zzbti zzbtiVar) {
        Objects.requireNonNull(zzbtiVar);
        this.zza = zzbtiVar;
    }
}
