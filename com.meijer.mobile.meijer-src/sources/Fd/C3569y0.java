package Fd;

import java.util.Objects;

/* renamed from: Fd.y0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3569y0 extends AbstractC3400j0 {

    /* renamed from: f, reason: collision with root package name */
    static final AbstractC3400j0 f10369f = new C3569y0(new Object[0], 0);

    /* renamed from: d, reason: collision with root package name */
    final transient Object[] f10370d;

    /* renamed from: e, reason: collision with root package name */
    private final transient int f10371e;

    @Override // Fd.AbstractC3340e0
    final int f() {
        return 0;
    }

    @Override // Fd.AbstractC3400j0, Fd.AbstractC3340e0
    final int a(Object[] objArr, int i10) {
        System.arraycopy(this.f10370d, 0, objArr, i10, this.f10371e);
        return i10 + this.f10371e;
    }

    @Override // Fd.AbstractC3340e0
    final int e() {
        return this.f10371e;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        C3513t.a(i10, this.f10371e, "index");
        Object obj = this.f10370d[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // Fd.AbstractC3340e0
    final Object[] k() {
        return this.f10370d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f10371e;
    }

    C3569y0(Object[] objArr, int i10) {
        this.f10370d = objArr;
        this.f10371e = i10;
    }
}
