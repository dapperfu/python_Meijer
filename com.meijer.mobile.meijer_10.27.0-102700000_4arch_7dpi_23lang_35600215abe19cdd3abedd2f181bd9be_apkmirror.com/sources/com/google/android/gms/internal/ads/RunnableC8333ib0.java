package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.ib0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8333ib0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f74983a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f74984b;

    RunnableC8333ib0(C8438jb0 c8438jb0, WebView webView, String str) {
        this.f74983a = webView;
        this.f74984b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8438jb0.k(this.f74983a, this.f74984b);
    }
}
