package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbvd implements Runnable {
    final /* synthetic */ zzbuv zza;
    final /* synthetic */ zzbvj zzb;
    final /* synthetic */ zzbvi zzc;

    zzbvd(zzbvi zzbviVar, zzbuv zzbuvVar, zzbvj zzbvjVar) {
        this.zza = zzbuvVar;
        this.zzb = zzbvjVar;
        Objects.requireNonNull(zzbviVar);
        this.zzc = zzbviVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbuv zzbuvVar = this.zza;
        synchronized (zzbuvVar.zza) {
            if (zzbuvVar.zzc) {
                return;
            }
            zzbuvVar.zzb();
            zzbvi zzbviVar = this.zzc;
            zzbviVar.zzb.zzE().execute(new zzbvc(this, this.zzb));
        }
    }
}
