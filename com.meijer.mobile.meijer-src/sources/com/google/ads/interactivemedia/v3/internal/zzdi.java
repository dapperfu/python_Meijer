package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* loaded from: classes4.dex */
final class zzdi implements Runnable {
    final /* synthetic */ zzdj zza;
    private final WebView zzb;

    zzdi(zzdj zzdjVar) {
        this.zza = zzdjVar;
        this.zzb = zzdjVar.zza;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zzb.destroy();
    }
}
