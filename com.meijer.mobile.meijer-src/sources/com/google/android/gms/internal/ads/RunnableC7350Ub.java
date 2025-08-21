package com.google.android.gms.internal.ads;

import android.webkit.ValueCallback;
import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.Ub, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC7350Ub implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final ValueCallback f71475a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C7045Lb f71476b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ WebView f71477c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f71478d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C7416Wb f71479e;

    RunnableC7350Ub(C7416Wb c7416Wb, final C7045Lb c7045Lb, final WebView webView, final boolean z10) {
        this.f71476b = c7045Lb;
        this.f71477c = webView;
        this.f71478d = z10;
        this.f71479e = c7416Wb;
        this.f71475a = new ValueCallback() { // from class: com.google.android.gms.internal.ads.Tb
            @Override // android.webkit.ValueCallback
            public final void onReceiveValue(Object obj) {
                this.f71252a.f71479e.c(c7045Lb, webView, (String) obj, z10);
            }
        };
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.f71477c.getSettings().getJavaScriptEnabled()) {
            try {
                this.f71477c.evaluateJavascript("(function() { return  {text:document.body.innerText}})();", this.f71475a);
            } catch (Throwable unused) {
                this.f71475a.onReceiveValue("");
            }
        }
    }
}
