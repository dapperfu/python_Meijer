package Ce;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class d0 extends g0<Comparable<?>> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    static final d0 f4068a = new d0();

    @Override // Ce.g0
    public <S extends Comparable<?>> g0<S> f() {
        return q0.f4107a;
    }

    public String toString() {
        return "Ordering.natural()";
    }

    private d0() {
    }

    @Override // Ce.g0, java.util.Comparator
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public int compare(Comparable<?> comparable, Comparable<?> comparable2) {
        Be.p.q(comparable);
        Be.p.q(comparable2);
        return comparable.compareTo(comparable2);
    }
}
