package com.google.android.libraries.places.internal;

import java.net.SocketAddress;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* loaded from: classes6.dex */
final class zzbpr implements Runnable {
    final /* synthetic */ List zza;
    final /* synthetic */ zzbqg zzb;

    zzbpr(zzbqg zzbqgVar, List list) {
        this.zza = list;
        Objects.requireNonNull(zzbqgVar);
        this.zzb = zzbqgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzbsj zzbsjVarZzC;
        zzbqg zzbqgVar = this.zzb;
        zzbqa zzbqaVarZzr = zzbqgVar.zzr();
        List list = this.zza;
        SocketAddress socketAddressZze = zzbqgVar.zzr().zze();
        zzbqaVarZzr.zzg(list);
        zzbqgVar.zzs(list);
        zzbfy zzbfyVarZzc = zzbqgVar.zzE().zzc();
        zzbfy zzbfyVar = zzbfy.READY;
        if ((zzbfyVarZzc != zzbfyVar && zzbqgVar.zzE().zzc() != zzbfy.CONNECTING) || zzbqgVar.zzr().zzh(socketAddressZze)) {
            zzbsjVarZzC = null;
        } else if (zzbqgVar.zzE().zzc() == zzbfyVar) {
            zzbsjVarZzC = zzbqgVar.zzC();
            zzbqgVar.zzD(null);
            zzbqgVar.zzr().zzd();
            zzbqgVar.zzh(zzbfy.IDLE);
        } else {
            zzbqgVar.zzA().zzd(zzbjv.zzi.zze("InternalSubchannel closed pending transport due to address change"));
            zzbqgVar.zzB(null);
            zzbqgVar.zzr().zzd();
            zzbqgVar.zzf();
            zzbsjVarZzC = null;
        }
        if (zzbsjVarZzC != null) {
            if (zzbqgVar.zzu() != null) {
                zzbqgVar.zzw().zzd(zzbjv.zzi.zze("InternalSubchannel closed transport early due to address change"));
                zzbqgVar.zzu().zza();
                zzbqgVar.zzv(null);
                zzbqgVar.zzx(null);
            }
            zzbqgVar.zzx(zzbsjVarZzC);
            zzbqgVar.zzv(zzbqgVar.zzq().zzd(new zzbpq(this), 5L, TimeUnit.SECONDS, zzbqgVar.zzm()));
        }
    }
}
