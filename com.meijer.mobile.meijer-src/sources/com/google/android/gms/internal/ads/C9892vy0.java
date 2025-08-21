package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.vy0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9892vy0 {

    /* renamed from: a, reason: collision with root package name */
    private final List f80229a;

    /* renamed from: b, reason: collision with root package name */
    private final List f80230b;

    public final C9892vy0 a(InterfaceC9464ry0 interfaceC9464ry0) {
        this.f80230b.add(interfaceC9464ry0);
        return this;
    }

    public final C9892vy0 b(InterfaceC9464ry0 interfaceC9464ry0) {
        this.f80229a.add(interfaceC9464ry0);
        return this;
    }

    public final C9999wy0 c() {
        return new C9999wy0(this.f80229a, this.f80230b, null);
    }

    /* synthetic */ C9892vy0(int i10, int i11, C9785uy0 c9785uy0) {
        this.f80229a = C8183fy0.c(i10);
        this.f80230b = C8183fy0.c(i11);
    }
}
