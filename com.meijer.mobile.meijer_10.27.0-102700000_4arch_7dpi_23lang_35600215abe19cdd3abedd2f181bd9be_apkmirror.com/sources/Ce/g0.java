package Ce;

import java.util.Comparator;

/* loaded from: classes6.dex */
public abstract class g0<T> implements Comparator<T> {
    @Override // java.util.Comparator
    public abstract int compare(T t10, T t11);

    public static <T> g0<T> b(Comparator<T> comparator) {
        return comparator instanceof g0 ? (g0) comparator : new A(comparator);
    }

    public static <C extends Comparable> g0<C> d() {
        return d0.f4068a;
    }

    public <U extends T> g0<U> a(Comparator<? super U> comparator) {
        return new C(this, (Comparator) Be.p.q(comparator));
    }

    public <F> g0<F> e(Be.g<F, ? extends T> gVar) {
        return new C3017i(gVar, this);
    }

    public <S extends T> g0<S> f() {
        return new r0(this);
    }

    protected g0() {
    }

    public <E extends T> L<E> c(Iterable<E> iterable) {
        return L.G(this, iterable);
    }
}
