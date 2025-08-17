package com.google.ads.interactivemedia.v3.internal;

import android.content.Context;

/* loaded from: classes4.dex */
public final class zzck {
    private boolean zza;

    final boolean zzb() {
        return this.zza;
    }

    final void zza(Context context) {
        zzdp.zzb(context, "Application Context cannot be null");
        if (this.zza) {
            return;
        }
        this.zza = true;
        zzcz.zzb().zzd(context);
        zzcq.zza().zzd(context);
        zzdk.zzb(context);
        zzdl.zzd(context);
        zzdo.zza(context);
        zzcw.zzb().zzc(context);
        zzcp.zza().zzd(context);
    }
}
