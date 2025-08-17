package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9767vy0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f79389a;

    /* renamed from: b, reason: collision with root package name */
    private final List f79390b;

    public final C9767vy0 a(InterfaceC9339ry0 interfaceC9339ry0) {
        this.f79390b.add(interfaceC9339ry0);
        return this;
    }

    public final C9767vy0 b(InterfaceC9339ry0 interfaceC9339ry0) {
        this.f79389a.add(interfaceC9339ry0);
        return this;
    }

    public final C9874wy0 c() {
        return new C9874wy0(this.f79389a, this.f79390b, null);
    }

    /* synthetic */ C9767vy0(int i10, int i11, C9660uy0 c9660uy0) {
        this.f79389a = C8058fy0.c(i10);
        this.f79390b = C8058fy0.c(i11);
    }
}
