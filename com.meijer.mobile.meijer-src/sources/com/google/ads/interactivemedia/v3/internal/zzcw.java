package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.content.Context;

/* loaded from: classes4.dex */
public final class zzcw {

    @SuppressLint({"StaticFieldLeak"})
    private static final zzcw zza = new zzcw();
    private Context zzb;

    private zzcw() {
    }

    public static zzcw zzb() {
        return zza;
    }

    public final Context zza() {
        return this.zzb;
    }

    public final void zzc(Context context) {
        this.zzb = context != null ? context.getApplicationContext() : null;
    }
}
