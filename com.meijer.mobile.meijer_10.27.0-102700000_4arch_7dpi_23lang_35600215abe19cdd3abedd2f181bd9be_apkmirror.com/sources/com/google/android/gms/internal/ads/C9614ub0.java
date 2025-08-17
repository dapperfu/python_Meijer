package com.google.android.gms.internal.ads;

import android.annotation.SuppressLint;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.ub0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9614ub0 extends C9507tb0 {
    @SuppressLint({"SetJavaScriptEnabled"})
    public C9614ub0(String str, WebView webView) {
        super(str);
        if (!webView.getSettings().getJavaScriptEnabled()) {
            webView.getSettings().setJavaScriptEnabled(true);
        }
        n(webView);
    }
}
