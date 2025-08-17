package Ad;

import java.util.Objects;

/* loaded from: classes6.dex */
final class q0 extends p0 {

    /* renamed from: e, reason: collision with root package name */
    static final p0 f281e = new q0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f282c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f283d;

    @Override // Ad.m0
    final int f() {
        return 0;
    }

    @Override // Ad.m0
    final boolean l() {
        return false;
    }

    @Override // Ad.m0
    final Object[] e() {
        return this.f282c;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        j0.a(i10, this.f283d, "index");
        Object obj = this.f282c[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // Ad.m0
    final int h() {
        return this.f283d;
    }

    @Override // Ad.p0, Ad.m0
    final int m(Object[] objArr, int i10) {
        System.arraycopy(this.f282c, 0, objArr, 0, this.f283d);
        return this.f283d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f283d;
    }

    q0(Object[] objArr, int i10) {
        this.f282c = objArr;
        this.f283d = i10;
    }
}
