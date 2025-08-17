package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.gms.internal.ads.Si, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7171Si {

    /* renamed from: a, reason: collision with root package name */
    private boolean f70141a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f70142b = false;

    /* renamed from: c, reason: collision with root package name */
    private float f70143c = 0.0f;

    /* renamed from: d, reason: collision with root package name */
    private final AtomicBoolean f70144d = new AtomicBoolean(false);

    public final synchronized float a() {
        return this.f70143c;
    }

    public final synchronized void b(boolean z10, float f10) {
        this.f70142b = z10;
        this.f70143c = f10;
    }

    public final synchronized void c(boolean z10) {
        this.f70141a = z10;
        this.f70144d.set(true);
    }

    public final synchronized boolean d() {
        return this.f70142b;
    }

    public final synchronized boolean e(boolean z10) {
        if (!this.f70144d.get()) {
            return z10;
        }
        return this.f70141a;
    }
}
