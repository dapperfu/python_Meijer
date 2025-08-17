package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.Xt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7348Xt extends C7315Wt {
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return Y0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }

    public C7348Xt(InterfaceC9008ot interfaceC9008ot, C7392Zc c7392Zc, boolean z10, GS gs2) {
        super(interfaceC9008ot, c7392Zc, z10, gs2);
    }
}
