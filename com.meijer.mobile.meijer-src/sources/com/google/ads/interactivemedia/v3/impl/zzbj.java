package com.google.ads.interactivemedia.v3.impl;

import android.graphics.Bitmap;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.google.ads.interactivemedia.v3.internal.zzahg;
import com.google.ads.interactivemedia.v3.internal.zzahh;
import com.google.ads.interactivemedia.v3.internal.zzahj;
import com.google.ads.interactivemedia.v3.internal.zzfk;

/* loaded from: classes4.dex */
final class zzbj extends WebViewClient {
    final /* synthetic */ zzbk zza;
    private final zzahj zzb;
    private long zzc;

    zzbj(zzbk zzbkVar, zzahj zzahjVar) {
        this.zza = zzbkVar;
        this.zzb = zzahjVar;
    }

    @Override // android.webkit.WebViewClient
    public final void onReceivedError(WebView webView, int i10, String str, String str2) {
        zzfk.zzc("Error: " + i10 + " " + str + " " + str2);
    }

    @Override // android.webkit.WebViewClient
    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        if (!str.startsWith("gmsg://")) {
            return false;
        }
        this.zza.zzh(str, "0");
        return true;
    }

    @Override // android.webkit.WebViewClient
    public final void onPageFinished(WebView webView, String str) {
        zzahg zzahgVarZzc = zzahh.zzc();
        zzahgVarZzc.zzb(this.zzc);
        zzahgVarZzc.zza(System.currentTimeMillis());
        this.zzb.zzd(zzahgVarZzc);
        zzfk.zzc("Finished loading WebView".concat(String.valueOf(str)));
    }

    @Override // android.webkit.WebViewClient
    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        this.zzc = System.currentTimeMillis();
        zzfk.zzc("Started loading WebView".concat(String.valueOf(str)));
    }
}
