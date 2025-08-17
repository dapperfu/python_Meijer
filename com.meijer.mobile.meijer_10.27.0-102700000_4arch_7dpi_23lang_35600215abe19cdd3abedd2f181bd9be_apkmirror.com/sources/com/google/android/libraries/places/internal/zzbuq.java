package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbuq implements Runnable {
    final /* synthetic */ zzbvl zza;

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zza;
        if (zzbvlVar.zzad()) {
            return;
        }
        zzbvlVar.zzY().zzd();
    }

    zzbuq(zzbvl zzbvlVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zza = zzbvlVar;
    }
}
