package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.ib0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC8458ib0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ WebView f75823a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f75824b;

    RunnableC8458ib0(C8563jb0 c8563jb0, WebView webView, String str) {
        this.f75823a = webView;
        this.f75824b = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C8563jb0.k(this.f75823a, this.f75824b);
    }
}
