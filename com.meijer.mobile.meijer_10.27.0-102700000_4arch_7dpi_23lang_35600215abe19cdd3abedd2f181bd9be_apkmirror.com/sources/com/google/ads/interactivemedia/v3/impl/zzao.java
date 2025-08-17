package com.google.ads.interactivemedia.v3.impl;

import android.content.Context;
import android.os.Message;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.fullstory.FS;
import com.google.ads.interactivemedia.v3.internal.zzgi;
import java.util.List;

/* loaded from: classes4.dex */
final class zzao extends WebChromeClient {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzgi zzb;
    final /* synthetic */ List zzc;

    zzao(Context context, zzgi zzgiVar, List list) {
        this.zza = context;
        this.zzb = zzgiVar;
        this.zzc = list;
    }

    @Override // android.webkit.WebChromeClient
    public final boolean onCreateWindow(WebView webView, boolean z10, boolean z11, Message message) {
        WebView.WebViewTransport webViewTransport = (WebView.WebViewTransport) message.obj;
        WebView webView2 = new WebView(this.zza);
        webViewTransport.setWebView(webView2);
        FS.setWebViewClient(webView2, new zzan(this));
        message.sendToTarget();
        return true;
    }
}
