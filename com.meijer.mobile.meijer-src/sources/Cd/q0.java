package Cd;

import java.util.Objects;

/* loaded from: classes6.dex */
final class q0 extends p0 {

    /* renamed from: e, reason: collision with root package name */
    static final p0 f4277e = new q0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f4278c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f4279d;

    @Override // Cd.m0
    final int f() {
        return 0;
    }

    @Override // Cd.m0
    final boolean l() {
        return false;
    }

    @Override // Cd.m0
    final Object[] e() {
        return this.f4278c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0.a(i10, this.f4279d, "index");
        Object obj = this.f4278c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // Cd.m0
    final int h() {
        return this.f4279d;
    }

    @Override // Cd.p0, Cd.m0
    final int m(Object[] objArr, int i10) {
        System.arraycopy(this.f4278c, 0, objArr, 0, this.f4279d);
        return this.f4279d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f4279d;
    }

    q0(Object[] objArr, int i10) {
        this.f4278c = objArr;
        this.f4279d = i10;
    }
}
