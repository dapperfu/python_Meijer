package Ce;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;

/* loaded from: classes6.dex */
final class p0<E> extends P<E> {

    /* renamed from: f, reason: collision with root package name */
    static final p0<Comparable> f4105f = new p0<>(L.x(), g0.d());

    /* renamed from: e, reason: collision with root package name */
    final transient L<E> f4106e;

    @Override // Ce.P
    P<E> M(E e10, boolean z10) {
        return X(0, Y(e10, z10));
    }

    @Override // java.util.NavigableSet
    public E ceiling(E e10) {
        int iZ = Z(e10, true);
        if (iZ == size()) {
            return null;
        }
        return this.f4106e.get(iZ);
    }

    @Override // Ce.J, java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj != null) {
            try {
                if (a0(obj) >= 0) {
                    return true;
                }
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    @Override // Ce.O, java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof Set)) {
            return false;
        }
        Set set = (Set) obj;
        if (size() != set.size()) {
            return false;
        }
        if (isEmpty()) {
            return true;
        }
        if (!v0.b(this.f3912c, set)) {
            return containsAll(set);
        }
        Iterator<E> it = set.iterator();
        try {
            y0<E> it2 = iterator();
            while (it2.hasNext()) {
                E next = it2.next();
                E next2 = it.next();
                if (next2 == null || U(next, next2) != 0) {
                    return false;
                }
            }
            return true;
        } catch (ClassCastException | NoSuchElementException unused) {
            return false;
        }
    }

    @Override // java.util.NavigableSet
    public E floor(E e10) {
        int iY = Y(e10, true) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f4106e.get(iY);
    }

    @Override // java.util.NavigableSet
    public E higher(E e10) {
        int iZ = Z(e10, false);
        if (iZ == size()) {
            return null;
        }
        return this.f4106e.get(iZ);
    }

    @Override // java.util.NavigableSet
    public E lower(E e10) {
        int iY = Y(e10, false) - 1;
        if (iY == -1) {
            return null;
        }
        return this.f4106e.get(iY);
    }

    private int a0(Object obj) throws ClassCastException {
        return Collections.binarySearch(this.f4106e, obj, b0());
    }

    @Override // Ce.P
    P<E> G() {
        Comparator comparatorReverseOrder = Collections.reverseOrder(this.f3912c);
        return isEmpty() ? P.I(comparatorReverseOrder) : new p0(this.f4106e.F(), comparatorReverseOrder);
    }

    @Override // java.util.NavigableSet
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public y0<E> descendingIterator() {
        return this.f4106e.F().iterator();
    }

    p0<E> X(int i10, int i11) {
        return (i10 == 0 && i11 == size()) ? this : i10 < i11 ? new p0<>(this.f4106e.subList(i10, i11), this.f3912c) : P.I(this.f3912c);
    }

    int Y(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f4106e, Be.p.q(e10), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch + 1 : iBinarySearch : ~iBinarySearch;
    }

    int Z(E e10, boolean z10) {
        int iBinarySearch = Collections.binarySearch(this.f4106e, Be.p.q(e10), comparator());
        return iBinarySearch >= 0 ? z10 ? iBinarySearch : iBinarySearch + 1 : ~iBinarySearch;
    }

    @Override // Ce.O, Ce.J
    public L<E> a() {
        return this.f4106e;
    }

    Comparator<Object> b0() {
        return this.f3912c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection<?> collection) {
        if (collection instanceof c0) {
            collection = ((c0) collection).V1();
        }
        if (!v0.b(comparator(), collection) || collection.size() <= 1) {
            return super.containsAll(collection);
        }
        y0<E> it = iterator();
        Iterator<?> it2 = collection.iterator();
        if (!it.hasNext()) {
            return false;
        }
        Object next = it2.next();
        E next2 = it.next();
        while (true) {
            try {
                int iU = U(next2, next);
                if (iU < 0) {
                    if (!it.hasNext()) {
                        return false;
                    }
                    next2 = it.next();
                } else if (iU == 0) {
                    if (!it2.hasNext()) {
                        return true;
                    }
                    next = it2.next();
                } else if (iU > 0) {
                    break;
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    @Override // Ce.J
    int e(Object[] objArr, int i10) {
        return this.f4106e.e(objArr, i10);
    }

    @Override // Ce.J
    Object[] f() {
        return this.f4106e.f();
    }

    @Override // Ce.J
    int h() {
        return this.f4106e.h();
    }

    @Override // Ce.J
    int k() {
        return this.f4106e.k();
    }

    @Override // Ce.J
    boolean l() {
        return this.f4106e.l();
    }

    @Override // Ce.O, Ce.J, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    /* renamed from: m */
    public y0<E> iterator() {
        return this.f4106e.iterator();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public int size() {
        return this.f4106e.size();
    }

    p0(L<E> l10, Comparator<? super E> comparator) {
        super(comparator);
        this.f4106e = l10;
    }

    @Override // Ce.P
    P<E> Q(E e10, boolean z10, E e11, boolean z11) {
        return T(e10, z10).M(e11, z11);
    }

    @Override // Ce.P
    P<E> T(E e10, boolean z10) {
        return X(Z(e10, z10), size());
    }

    @Override // java.util.SortedSet
    public E first() {
        if (!isEmpty()) {
            return this.f4106e.get(0);
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.SortedSet
    public E last() {
        if (!isEmpty()) {
            return this.f4106e.get(size() - 1);
        }
        throw new NoSuchElementException();
    }
}
