package com.google.ads.interactivemedia.v3.internal;

import android.webkit.WebView;

/* loaded from: classes4.dex */
final class zzcx implements Runnable {
    final /* synthetic */ WebView zza;
    final /* synthetic */ String zzb;

    zzcx(zzcy zzcyVar, WebView webView, String str) {
        this.zza = webView;
        this.zzb = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzcy.zzj(this.zza, this.zzb);
    }
}
