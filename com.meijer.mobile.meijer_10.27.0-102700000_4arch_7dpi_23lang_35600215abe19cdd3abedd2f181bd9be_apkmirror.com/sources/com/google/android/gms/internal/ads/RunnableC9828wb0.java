package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.wb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9828wb0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f79499a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C9935xb0 f79500b;

    RunnableC9828wb0(C9935xb0 c9935xb0) {
        this.f79500b = c9935xb0;
        this.f79499a = c9935xb0.f79819e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f79499a.destroy();
    }
}
