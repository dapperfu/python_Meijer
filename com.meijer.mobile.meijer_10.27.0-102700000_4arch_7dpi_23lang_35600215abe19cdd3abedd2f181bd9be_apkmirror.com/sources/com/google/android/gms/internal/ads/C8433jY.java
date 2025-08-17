package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.jY, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8433jY {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f75455a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    private C8328iY f75456b;

    final C8328iY a() {
        return this.f75456b;
    }

    final void b(C8328iY c8328iY) {
        this.f75456b = c8328iY;
    }

    public final void c(boolean z10) {
        this.f75455a.set(true);
    }

    public final boolean d() {
        return this.f75455a.get();
    }
}
