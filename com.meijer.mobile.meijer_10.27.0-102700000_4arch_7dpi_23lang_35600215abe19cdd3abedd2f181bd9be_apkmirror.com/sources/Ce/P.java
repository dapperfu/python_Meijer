package Ce;

import java.util.Comparator;
import java.util.NavigableSet;

/* loaded from: classes6.dex */
public abstract class P<E> extends O<E> implements NavigableSet<E>, u0<E> {

    /* renamed from: c, reason: collision with root package name */
    final transient Comparator<? super E> f3912c;

    /* renamed from: d, reason: collision with root package name */
    transient P<E> f3913d;

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
        P<E> p10 = this.f3913d;
        if (p10 != null) {
            return p10;
        }
        P<E> pG = G();
        this.f3913d = pG;
        pG.f3913d = this;
        return pG;
    }

    int U(Object obj, Object obj2) {
        return V(this.f3912c, obj, obj2);
    }

    @Override // java.util.SortedSet, Ce.u0
    public Comparator<? super E> comparator() {
        return this.f3912c;
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
        this.f3912c = comparator;
    }

    static <E> p0<E> I(Comparator<? super E> comparator) {
        if (g0.d().equals(comparator)) {
            return (p0<E>) p0.f4105f;
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
        return M(Be.p.q(e10), z10);
    }

    @Override // java.util.NavigableSet
    /* renamed from: P, reason: merged with bridge method [inline-methods] */
    public P<E> subSet(E e10, boolean z10, E e11, boolean z11) {
        boolean z12;
        Be.p.q(e10);
        Be.p.q(e11);
        if (this.f3912c.compare(e10, e11) <= 0) {
            z12 = true;
        } else {
            z12 = false;
        }
        Be.p.d(z12);
        return Q(e10, z10, e11, z11);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.NavigableSet
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public P<E> tailSet(E e10, boolean z10) {
        return T(Be.p.q(e10), z10);
    }
}
