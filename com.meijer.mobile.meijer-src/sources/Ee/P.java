package Ee;

import java.util.Comparator;
import java.util.NavigableSet;

/* loaded from: classes6.dex */
public abstract class P<E> extends O<E> implements NavigableSet<E>, u0<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient Comparator<? super E> f7224c;

    /* renamed from: d, reason: collision with root package name */
    transient P<E> f7225d;

    abstract P<E> G();

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public P<E> headSet(E e10) {
        return headSet(e10, false);
    }

    abstract P<E> M(E e10, boolean z10);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public P<E> subSet(E e10, E e11) {
        return subSet(e10, true, e11, false);
    }

    abstract P<E> Q(E e10, boolean z10, E e11, boolean z11);

    @Override // java.util.NavigableSet, java.util.SortedSet
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public P<E> tailSet(E e10) {
        return tailSet(e10, true);
    }

    abstract P<E> T(E e10, boolean z10);

    @Override // java.util.NavigableSet
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public P<E> descendingSet() {
        P<E> p10 = this.f7225d;
        if (p10 != null) {
            return p10;
        }
        P<E> pG = G();
        this.f7225d = pG;
        pG.f7225d = this;
        return pG;
    }

    int U(Object obj, Object obj2) {
        return V(this.f7224c, obj, obj2);
    }

    @Override // java.util.SortedSet, Ee.u0
    public Comparator<? super E> comparator() {
        return this.f7224c;
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollFirst() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.NavigableSet
    @Deprecated
    public final E pollLast() {
        throw new UnsupportedOperationException();
    }

    P(Comparator<? super E> comparator) {
        this.f7224c = comparator;
    }

    static <E> p0<E> I(Comparator<? super E> comparator) {
        if (g0.d().equals(comparator)) {
            return (p0<E>) p0.f7417f;
        }
        return new p0<>(L.x(), comparator);
    }

    static int V(Comparator<?> comparator, Object obj, Object obj2) {
        return comparator.compare(obj, obj2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public P<E> headSet(E e10, boolean z10) {
        return M(De.p.q(e10), z10);
    }

    @Override // java.util.NavigableSet
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public P<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        boolean z12;
        De.p.q(e10);
        De.p.q(e11);
        if (this.f7224c.compare(e10, e11) <= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        De.p.d(z12);
        return Q(e10, z10, e11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public P<E> tailSet(E e10, boolean z10) {
        return T(De.p.q(e10), z10);
    }
}
