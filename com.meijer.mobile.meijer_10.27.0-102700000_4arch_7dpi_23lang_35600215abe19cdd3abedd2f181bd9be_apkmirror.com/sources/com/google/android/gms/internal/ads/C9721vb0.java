package com.google.android.gms.internal.ads;

import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;

/* renamed from: com.google.android.gms.internal.ads.vb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9721vb0 extends WebViewClient {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9935xb0 f79092a;

    C9721vb0(C9935xb0 c9935xb0) {
        this.f79092a = c9935xb0;
    }

    @Override // android.webkit.WebViewClient
    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        com.fullstory.FS.log_w("NativeBridge", "WebView renderer gone: " + renderProcessGoneDetail.toString() + "for WebView: " + String.valueOf(webView));
        if (this.f79092a.a() == webView) {
            com.fullstory.FS.log_w("NativeBridge", "Deallocating the Native bridge as it is unusable. No further events will be generated for this session.");
            this.f79092a.n(null);
        }
        webView.destroy();
        return true;
    }
}
