package com.google.android.gms.internal.ads;

import android.webkit.WebView;

/* renamed from: com.google.android.gms.internal.ads.wb0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC9953wb0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final WebView f80339a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C10060xb0 f80340b;

    RunnableC9953wb0(C10060xb0 c10060xb0) {
        this.f80340b = c10060xb0;
        this.f80339a = c10060xb0.f80659e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f80339a.destroy();
    }
}
