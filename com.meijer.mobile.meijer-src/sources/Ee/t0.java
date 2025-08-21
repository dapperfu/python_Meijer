package Ee;

/* loaded from: classes6.dex */
final class t0<E> extends O<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient E f7430c;

    @Override // Ee.J
    boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // Ee.O, Ee.J
    public L<E> a() {
        return L.y(this.f7430c);
    }

    @Override // Ee.J, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f7430c.equals(obj);
    }

    @Override // Ee.J
    int e(Object[] objArr, int i10) {
        objArr[i10] = this.f7430c;
        return i10 + 1;
    }

    @Override // Ee.O, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f7430c.hashCode();
    }

    @Override // Ee.O, Ee.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public y0<E> iterator() {
        return S.x(this.f7430c);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f7430c.toString() + ']';
    }

    t0(E e10) {
        this.f7430c = (E) De.p.q(e10);
    }
}
