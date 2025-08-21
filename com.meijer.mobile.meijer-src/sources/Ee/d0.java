package Ee;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class d0 extends g0<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final d0 f7380a = new d0();

    @Override // Ee.g0
    public <S extends Comparable<?>> g0<S> f() {
        return q0.f7419a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private d0() {
    }

    @Override // Ee.g0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        De.p.q(comparable);
        De.p.q(comparable2);
        return comparable.compareTo(comparable2);
    }
}
