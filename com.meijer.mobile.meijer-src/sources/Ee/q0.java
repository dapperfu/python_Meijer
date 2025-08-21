package Ee;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class q0 extends g0<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final q0 f7419a = new q0();

    public String toString() {
        return "Ordering.natural().reverse()";
    }

    private q0() {
    }

    @Override // Ee.g0
    public <S extends Comparable<?>> g0<S> f() {
        return g0.d();
    }

    @Override // Ee.g0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        De.p.q(comparable);
        if (comparable == comparable2) {
            return 0;
        }
        return comparable2.compareTo(comparable);
    }
}
