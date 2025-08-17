package ff;

import ef.C13655f;

/* renamed from: ff.B, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
final class C13882B<E> extends l<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient E f130993c;

    /* renamed from: d, reason: collision with root package name */
    private transient int f130994d;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return 1;
    }

    @Override // ff.i
    int a(Object[] objArr, int i10) {
        objArr[i10] = this.f130993c;
        return i10 + 1;
    }

    @Override // ff.i, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean contains(Object obj) {
        return this.f130993c.equals(obj);
    }

    @Override // ff.l, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    /* renamed from: e */
    public AbstractC13883C<E> iterator() {
        return o.f(this.f130993c);
    }

    @Override // ff.l, java.util.Collection, java.util.Set
    public final int hashCode() {
        int i10 = this.f130994d;
        if (i10 != 0) {
            return i10;
        }
        int iHashCode = this.f130993c.hashCode();
        this.f130994d = iHashCode;
        return iHashCode;
    }

    @Override // ff.l
    k<E> l() {
        return k.n(this.f130993c);
    }

    @Override // ff.l
    boolean n() {
        return this.f130994d != 0;
    }

    @Override // java.util.AbstractCollection
    public String toString() {
        return '[' + this.f130993c.toString() + ']';
    }

    C13882B(E e10) {
        this.f130993c = (E) C13655f.h(e10);
    }
}
