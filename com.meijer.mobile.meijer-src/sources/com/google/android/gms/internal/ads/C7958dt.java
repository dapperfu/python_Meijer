package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.dt, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7958dt {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f74333a = new AtomicBoolean(false);

    public final void a() {
        this.f74333a.set(false);
    }

    public final void b() {
        this.f74333a.set(true);
    }

    public final void c() {
        this.f74333a.set(false);
    }

    public final boolean d() {
        return this.f74333a.get();
    }

    public C7958dt(String str) {
    }
}
