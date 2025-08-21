package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;
import android.content.pm.PackageInfo;

/* loaded from: classes4.dex */
final class zzjh implements Runnable {
    final /* synthetic */ int zza;
    final /* synthetic */ zzjj zzb;

    zzjh(zzjj zzjjVar, int i10, boolean z10) {
        this.zza = i10;
        this.zzb = zzjjVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws InterruptedException {
        zzbp zzbpVarZza;
        int i10 = this.zza;
        zzjj zzjjVar = this.zzb;
        if (i10 > 0) {
            try {
                Thread.sleep(i10 * 1000);
            } catch (InterruptedException unused) {
            }
        }
        try {
            PackageInfo packageInfo = zzjjVar.zza.getPackageManager().getPackageInfo(zzjjVar.zza.getPackageName(), 0);
            Context context = zzjjVar.zza;
            zzbpVarZza = zzob.zza(context, context.getPackageName(), Integer.toString(packageInfo.versionCode));
        } catch (Throwable unused2) {
            zzbpVarZza = null;
        }
        this.zzb.zzm = zzbpVarZza;
        if (this.zza < 4) {
            if (zzbpVarZza != null && zzbpVarZza.zzaj() && !zzbpVarZza.zzg().equals("0000000000000000000000000000000000000000000000000000000000000000") && zzbpVarZza.zzak() && zzbpVarZza.zze().zzd() && zzbpVarZza.zze().zza() != -2) {
                return;
            }
            this.zzb.zzo(this.zza + 1, true);
        }
    }
}
