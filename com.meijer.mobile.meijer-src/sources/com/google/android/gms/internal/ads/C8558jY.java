package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.jY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8558jY {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f76295a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private C8453iY f76296b;

    final C8453iY a() {
        return this.f76296b;
    }

    final void b(C8453iY c8453iY) {
        this.f76296b = c8453iY;
    }

    public final void c(boolean z10) {
        this.f76295a.set(true);
    }

    public final boolean d() {
        return this.f76295a.get();
    }
}
