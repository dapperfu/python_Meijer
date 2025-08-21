package com.google.zxing;

/* loaded from: classes8.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final h f91624a;

    public abstract b a(h hVar);

    public abstract Ig.b b() throws NotFoundException;

    public abstract Ig.a c(int i10, Ig.a aVar) throws NotFoundException;

    public final int d() {
        return this.f91624a.a();
    }

    public final h e() {
        return this.f91624a;
    }

    public final int f() {
        return this.f91624a.d();
    }

    protected b(h hVar) {
        this.f91624a = hVar;
    }
}
