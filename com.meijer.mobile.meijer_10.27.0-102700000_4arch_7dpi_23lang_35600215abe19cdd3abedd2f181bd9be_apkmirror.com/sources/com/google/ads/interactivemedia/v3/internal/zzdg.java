package com.google.ads.interactivemedia.v3.internal;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* loaded from: classes4.dex */
public final class zzdg extends zzdf {
    @SuppressLint({"SetJavaScriptEnabled"})
    public zzdg(String str, WebView webView) {
        super(str);
        if (webView != null && !webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        zzm(webView);
    }
}
