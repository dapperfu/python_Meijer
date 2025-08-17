package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7225Ub implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final ValueCallback f70635a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C6920Lb f70636b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ WebView f70637c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f70638d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7291Wb f70639e;

    RunnableC7225Ub(C7291Wb c7291Wb, final C6920Lb c6920Lb, final WebView webView, final boolean z10) {
        this.f70636b = c6920Lb;
        this.f70637c = webView;
        this.f70638d = z10;
        this.f70639e = c7291Wb;
        this.f70635a = new ValueCallback() { // from class: com.google.android.gms.internal.ads.Tb
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f70412a.f70639e.c(c6920Lb, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f70637c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f70637c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f70635a);
            } catch (Throwable unused) {
                this.f70635a.onReceiveValue("");
            }
        }
    }
}
