package Ce;

import java.util.Objects;

/* loaded from: classes6.dex */
class m0<E> extends L<E> {

    /* renamed from: e, reason: collision with root package name */
    static final L<Object> f4081e = new m0(new Object[0], 0);

    /* renamed from: c, reason: collision with root package name */
    final transient Object[] f4082c;

    /* renamed from: d, reason: collision with root package name */
    private final transient int f4083d;

    @Override // Ce.J
    int k() {
        return 0;
    }

    @Override // Ce.J
    boolean l() {
        return false;
    }

    @Override // Ce.L, Ce.J
    int e(Object[] objArr, int i10) {
        System.arraycopy(this.f4082c, 0, objArr, i10, this.f4083d);
        return i10 + this.f4083d;
    }

    @Override // Ce.J
    Object[] f() {
        return this.f4082c;
    }

    @Override // java.util.List
    public E get(int i10) {
        Be.p.o(i10, this.f4083d);
        E e10 = (E) this.f4082c[i10];
        Objects.requireNonNull(e10);
        return e10;
    }

    @Override // Ce.J
    int h() {
        return this.f4083d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f4083d;
    }

    m0(Object[] objArr, int i10) {
        this.f4082c = objArr;
        this.f4083d = i10;
    }
}
