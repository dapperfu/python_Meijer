package com.google.android.libraries.places.internal;

import De.p;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbqc implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbqe zzb;

    zzbqc(zzbqe zzbqeVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbqeVar);
        this.zzb = zzbqeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbqe zzbqeVar = this.zzb;
        zzbqg zzbqgVar = zzbqeVar.zzc;
        if (zzbqgVar.zzE().zzc() == zzbfy.SHUTDOWN) {
            return;
        }
        zzbmg zzbmgVar = zzbqeVar.zza;
        if (zzbqgVar.zzC() == zzbmgVar) {
            zzbqgVar.zzD(null);
            zzbqgVar.zzr().zzd();
            zzbqgVar.zzh(zzbfy.IDLE);
        } else if (zzbqgVar.zzA() == zzbmgVar) {
            p.z(zzbqgVar.zzE().zzc() == zzbfy.CONNECTING, "Expected state is CONNECTING, actual state is %s", zzbqgVar.zzE().zzc());
            zzbqgVar.zzr().zzc();
            if (zzbqgVar.zzr().zza()) {
                zzbqgVar.zzf();
                return;
            }
            zzbqgVar.zzB(null);
            zzbqgVar.zzr().zzd();
            zzbqgVar.zzg(this.zza);
        }
    }
}
