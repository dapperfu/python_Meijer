package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;

@TargetApi(21)
/* renamed from: com.google.android.gms.internal.ads.Xt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7473Xt extends C7440Wt {
    @Override // android.webkit.WebViewClient
    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || webResourceRequest.getUrl() == null) {
            return null;
        }
        return Y0(webView, webResourceRequest.getUrl().toString(), webResourceRequest.getRequestHeaders());
    }

    public C7473Xt(InterfaceC9133ot interfaceC9133ot, C7517Zc c7517Zc, boolean z10, GS gs2) {
        super(interfaceC9133ot, c7517Zc, z10, gs2);
    }
}
