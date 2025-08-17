package com.google.android.libraries.places.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class zzbps implements Runnable {
    final /* synthetic */ zzbjv zza;
    final /* synthetic */ zzbqg zzb;

    zzbps(zzbqg zzbqgVar, zzbjv zzbjvVar) {
        this.zza = zzbjvVar;
        Objects.requireNonNull(zzbqgVar);
        this.zzb = zzbqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbqg zzbqgVar = this.zzb;
        zzbfy zzbfyVarZzc = zzbqgVar.zzE().zzc();
        zzbfy zzbfyVar = zzbfy.SHUTDOWN;
        if (zzbfyVarZzc == zzbfyVar) {
            return;
        }
        zzbjv zzbjvVar = this.zza;
        zzbqgVar.zzG(zzbjvVar);
        zzbsj zzbsjVarZzC = zzbqgVar.zzC();
        zzbqgVar.zzD(null);
        zzbqgVar.zzB(null);
        zzbqgVar.zzh(zzbfyVar);
        zzbqgVar.zzr().zzd();
        if (zzbqgVar.zzy().isEmpty()) {
            zzbqgVar.zzi();
        }
        zzbqgVar.zzk();
        if (zzbqgVar.zzu() != null) {
            zzbqgVar.zzu().zza();
            zzbqgVar.zzw().zzd(zzbjvVar);
            zzbqgVar.zzv(null);
            zzbqgVar.zzx(null);
        }
        if (zzbsjVarZzC != null) {
            zzbsjVarZzC.zzd(zzbjvVar);
        }
        zzbmg zzbmgVarZzA = zzbqgVar.zzA();
        if (zzbmgVarZzA != null) {
            zzbmgVarZzA.zzd(zzbjvVar);
        }
    }
}
