package Ce;

/* loaded from: classes6.dex */
final class t0<E> extends O<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient E f4118c;

    @Override // Ce.J
    boolean l() {
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // Ce.O, Ce.J
    public L<E> a() {
        return L.y(this.f4118c);
    }

    @Override // Ce.J, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        return this.f4118c.equals(obj);
    }

    @Override // Ce.J
    int e(Object[] objArr, int i10) {
        objArr[i10] = this.f4118c;
        return i10 + 1;
    }

    @Override // Ce.O, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f4118c.hashCode();
    }

    @Override // Ce.O, Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public y0<E> iterator() {
        return S.x(this.f4118c);
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f4118c.toString() + ']';
    }

    t0(E e10) {
        this.f4118c = (E) Be.p.q(e10);
    }
}
