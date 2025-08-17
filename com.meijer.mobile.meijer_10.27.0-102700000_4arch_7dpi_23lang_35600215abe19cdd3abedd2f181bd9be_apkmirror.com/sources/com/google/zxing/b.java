package com.google.zxing;

/* loaded from: classes7.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final h f90785a;

    public abstract b a(h hVar);

    public abstract Gg.b b() throws NotFoundException;

    public abstract Gg.a c(int i10, Gg.a aVar) throws NotFoundException;

    public final int d() {
        return this.f90785a.a();
    }

    public final h e() {
        return this.f90785a;
    }

    public final int f() {
        return this.f90785a.d();
    }

    protected b(h hVar) {
        this.f90785a = hVar;
    }
}
