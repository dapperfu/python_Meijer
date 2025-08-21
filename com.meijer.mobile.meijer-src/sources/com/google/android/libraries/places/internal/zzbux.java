package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbux implements Runnable {
    final zzbuv zza;
    final /* synthetic */ zzbvl zzb;

    @Override // java.lang.Runnable
    public final void run() {
        zzbvl zzbvlVar = this.zzb;
        zzbvj zzbvjVarZzq = zzbvlVar.zzq(zzbvlVar.zzQ().zze, false);
        if (zzbvjVarZzq == null) {
            return;
        }
        zzbvlVar.zzE().execute(new zzbuw(this, zzbvjVarZzq));
    }

    zzbux(zzbvl zzbvlVar, zzbuv zzbuvVar) {
        Objects.requireNonNull(zzbvlVar);
        this.zzb = zzbvlVar;
        this.zza = zzbuvVar;
    }
}
