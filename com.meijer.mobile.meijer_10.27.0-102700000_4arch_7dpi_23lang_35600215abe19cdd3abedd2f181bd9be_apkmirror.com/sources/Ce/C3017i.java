package Ce;

import java.io.Serializable;

/* renamed from: Ce.i, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C3017i<F, T> extends g0<F> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Be.g<F, ? extends T> f4075a;

    /* renamed from: b, reason: collision with root package name */
    final g0<T> f4076b;

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3017i) {
            C3017i c3017i = (C3017i) obj;
            if (this.f4075a.equals(c3017i.f4075a) && this.f4076b.equals(c3017i.f4076b)) {
                return true;
            }
        }
        return false;
    }

    @Override // Ce.g0, java.util.Comparator
    public int compare(F f10, F f11) {
        return this.f4076b.compare(this.f4075a.apply(f10), this.f4075a.apply(f11));
    }

    public int hashCode() {
        return Be.l.b(this.f4075a, this.f4076b);
    }

    public String toString() {
        return this.f4076b + ".onResultOf(" + this.f4075a + ")";
    }

    C3017i(Be.g<F, ? extends T> gVar, g0<T> g0Var) {
        this.f4075a = (Be.g) Be.p.q(gVar);
        this.f4076b = (g0) Be.p.q(g0Var);
    }
}
