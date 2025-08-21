package com.google.ads.interactivemedia.v3.internal;

import android.app.AppOpsManager$OnOpActiveChangedListener;

/* loaded from: classes4.dex */
final class zzjr implements AppOpsManager$OnOpActiveChangedListener {
    final /* synthetic */ zzjs zza;

    zzjr(zzjs zzjsVar) {
        this.zza = zzjsVar;
    }

    public final void onOpActiveChanged(String str, int i10, String str2, boolean z10) {
        if (z10) {
            this.zza.zzb = System.currentTimeMillis();
            this.zza.zze = true;
            return;
        }
        zzjs zzjsVar = this.zza;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (zzjsVar.zzc > 0) {
            zzjs zzjsVar2 = this.zza;
            if (jCurrentTimeMillis >= zzjsVar2.zzc) {
                zzjsVar2.zzd = jCurrentTimeMillis - zzjsVar2.zzc;
            }
        }
        this.zza.zze = false;
    }
}
