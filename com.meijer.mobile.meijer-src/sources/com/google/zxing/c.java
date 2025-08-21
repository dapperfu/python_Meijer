package com.google.zxing;

/* loaded from: classes8.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private final b f91625a;

    /* renamed from: b, reason: collision with root package name */
    private Ig.b f91626b;

    public Ig.b a() throws NotFoundException {
        if (this.f91626b == null) {
            this.f91626b = this.f91625a.b();
        }
        return this.f91626b;
    }

    public Ig.a b(int i10, Ig.a aVar) throws NotFoundException {
        return this.f91625a.c(i10, aVar);
    }

    public int c() {
        return this.f91625a.d();
    }

    public int d() {
        return this.f91625a.f();
    }

    public boolean e() {
        return this.f91625a.e().f();
    }

    public c f() {
        return new c(this.f91625a.a(this.f91625a.e().g()));
    }

    public c(b bVar) {
        if (bVar != null) {
            this.f91625a = bVar;
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
