package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbvh implements Runnable {
    final /* synthetic */ zzbvi zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zza.zzb;
        if (zzbvlVar.zzad()) {
            return;
        }
        zzbvlVar.zzY().zzd();
    }

    zzbvh(zzbvi zzbviVar) {
        Objects.requireNonNull(zzbviVar);
        this.zza = zzbviVar;
    }
}
