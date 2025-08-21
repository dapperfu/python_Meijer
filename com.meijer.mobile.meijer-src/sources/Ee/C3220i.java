package Ee;

import java.io.Serializable;

/* renamed from: Ee.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3220i<F, T> extends g0<F> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final De.g<F, ? extends T> f7387a;

    /* renamed from: b, reason: collision with root package name */
    final g0<T> f7388b;

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3220i) {
            C3220i c3220i = (C3220i) obj;
            if (this.f7387a.equals(c3220i.f7387a) && this.f7388b.equals(c3220i.f7388b)) {
                return true;
            }
        }
        return false;
    }

    @Override // Ee.g0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f7388b.compare(this.f7387a.apply(f10), this.f7387a.apply(f11));
    }

    public int hashCode() {
        return De.l.b(this.f7387a, this.f7388b);
    }

    public String toString() {
        return this.f7388b + ".onResultOf(" + this.f7387a + ")";
    }

    C3220i(De.g<F, ? extends T> gVar, g0<T> g0Var) {
        this.f7387a = (De.g) De.p.q(gVar);
        this.f7388b = (g0) De.p.q(g0Var);
    }
}
