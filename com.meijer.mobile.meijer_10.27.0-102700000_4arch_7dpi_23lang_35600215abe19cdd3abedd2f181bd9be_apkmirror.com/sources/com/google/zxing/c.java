package com.google.zxing;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f90786a;

    /* renamed from: b, reason: collision with root package name */
    private Gg.b f90787b;

    public Gg.b a() throws NotFoundException {
        if (this.f90787b == null) {
            this.f90787b = this.f90786a.b();
        }
        return this.f90787b;
    }

    public Gg.a b(int i10, Gg.a aVar) throws NotFoundException {
        return this.f90786a.c(i10, aVar);
    }

    public int c() {
        return this.f90786a.d();
    }

    public int d() {
        return this.f90786a.f();
    }

    public boolean e() {
        return this.f90786a.e().f();
    }

    public c f() {
        return new c(this.f90786a.a(this.f90786a.e().g()));
    }

    public c(b bVar) {
        if (bVar != null) {
            this.f90786a = bVar;
            return;
        }
        throw new IllegalArgumentException("Binarizer must be non-null.");
    }

    public String toString() {
        try {
            return a().toString();
        } catch (NotFoundException unused) {
            return "";
        }
    }
}
