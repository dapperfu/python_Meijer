package Ee;

import java.util.Objects;

/* loaded from: classes6.dex */
class m0<E> extends L<E> {

    /* renamed from: e, reason: collision with root package name */
    static final L<Object> f7393e = new m0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f7394c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f7395d;

    @Override // Ee.J
    int k() {
        return 0;
    }

    @Override // Ee.J
    boolean l() {
        return false;
    }

    @Override // Ee.L, Ee.J
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f7394c, 0, objArr, i10, this.f7395d);
        return i10 + this.f7395d;
    }

    @Override // Ee.J
    Object[] f() {
        return this.f7394c;
    }

    @Override // java.util.List
    public E get(int i10) {
        De.p.o(i10, this.f7395d);
        E e10 = (E) this.f7394c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // Ee.J
    int h() {
        return this.f7395d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7395d;
    }

    m0(Object[] objArr, int i10) {
        this.f7394c = objArr;
        this.f7395d = i10;
    }
}
