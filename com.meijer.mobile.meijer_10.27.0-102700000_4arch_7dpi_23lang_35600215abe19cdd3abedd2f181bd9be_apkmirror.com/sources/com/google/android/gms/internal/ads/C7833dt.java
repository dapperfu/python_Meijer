package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7833dt {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f73493a = new AtomicBoolean(false);

    public final void a() {
        this.f73493a.set(false);
    }

    public final void b() {
        this.f73493a.set(true);
    }

    public final void c() {
        this.f73493a.set(false);
    }

    public final boolean d() {
        return this.f73493a.get();
    }

    public C7833dt(String str) {
    }
}
