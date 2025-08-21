package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbwb implements Runnable {
    final /* synthetic */ zzbwc zza;
    final /* synthetic */ zzbwd zzb;
    final /* synthetic */ Object zzc;
    final /* synthetic */ zzbwe zzd;

    zzbwb(zzbwe zzbweVar, zzbwc zzbwcVar, zzbwd zzbwdVar, Object obj) {
        this.zza = zzbwcVar;
        this.zzb = zzbwdVar;
        this.zzc = obj;
        Objects.requireNonNull(zzbweVar);
        this.zzd = zzbweVar;
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzd) {
            try {
                if (this.zza.zzb == 0) {
                    try {
                        this.zzb.zza(this.zzc);
                        zzbwe zzbweVar = this.zzd;
                        zzbweVar.zze().remove(this.zzb);
                        if (zzbweVar.zze().isEmpty()) {
                            zzbweVar.zzf().shutdown();
                            zzbweVar.zzg(null);
                        }
                    } catch (Throwable th2) {
                        zzbwe zzbweVar2 = this.zzd;
                        zzbweVar2.zze().remove(this.zzb);
                        if (zzbweVar2.zze().isEmpty()) {
                            zzbweVar2.zzf().shutdown();
                            zzbweVar2.zzg(null);
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
