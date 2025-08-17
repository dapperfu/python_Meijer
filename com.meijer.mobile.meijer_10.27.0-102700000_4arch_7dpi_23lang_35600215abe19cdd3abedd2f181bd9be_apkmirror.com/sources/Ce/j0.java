package Ce;

import java.io.Serializable;
import java.lang.Comparable;

/* loaded from: classes6.dex */
public final class j0<C extends Comparable> extends k0 implements Be.q<C>, Serializable {

    /* renamed from: c, reason: collision with root package name */
    private static final j0<Comparable> f4077c = new j0<>(D.e(), D.a());

    /* renamed from: a, reason: collision with root package name */
    final D<C> f4078a;

    /* renamed from: b, reason: collision with root package name */
    final D<C> f4079b;

    private static class a extends g0<j0<?>> implements Serializable {

        /* renamed from: a, reason: collision with root package name */
        static final g0<?> f4080a = new a();

        private a() {
        }

        @Override // Ce.g0, java.util.Comparator
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compare(j0<?> j0Var, j0<?> j0Var2) {
            return B.k().f(j0Var.f4078a, j0Var2.f4078a).f(j0Var.f4079b, j0Var2.f4079b).j();
        }
    }

    public static <C extends Comparable<?>> j0<C> a() {
        return (j0<C>) f4077c;
    }

    static <C extends Comparable<?>> j0<C> h(D<C> d10, D<C> d11) {
        return new j0<>(d10, d11);
    }

    static <C extends Comparable<?>> g0<j0<C>> l() {
        return (g0<j0<C>>) a.f4080a;
    }

    private static String n(D<?> d10, D<?> d11) {
        StringBuilder sb2 = new StringBuilder(16);
        d10.o(sb2);
        sb2.append("..");
        d11.p(sb2);
        return sb2.toString();
    }

    public boolean equals(Object obj) {
        if (obj instanceof j0) {
            j0 j0Var = (j0) obj;
            if (this.f4078a.equals(j0Var.f4078a) && this.f4079b.equals(j0Var.f4079b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (this.f4078a.hashCode() * 31) + this.f4079b.hashCode();
    }

    public j0<C> i(j0<C> j0Var) {
        int iM = this.f4078a.compareTo(j0Var.f4078a);
        int iM2 = this.f4079b.compareTo(j0Var.f4079b);
        if (iM >= 0 && iM2 <= 0) {
            return this;
        }
        if (iM <= 0 && iM2 >= 0) {
            return j0Var;
        }
        D<C> d10 = iM >= 0 ? this.f4078a : j0Var.f4078a;
        D<C> d11 = iM2 <= 0 ? this.f4079b : j0Var.f4079b;
        Be.p.m(d10.compareTo(d11) <= 0, "intersection is undefined for disconnected ranges %s and %s", this, j0Var);
        return h(d10, d11);
    }

    public boolean j(j0<C> j0Var) {
        return this.f4078a.compareTo(j0Var.f4079b) <= 0 && j0Var.f4078a.compareTo(this.f4079b) <= 0;
    }

    public boolean k() {
        return this.f4078a.equals(this.f4079b);
    }

    public j0<C> m(j0<C> j0Var) {
        int iM = this.f4078a.compareTo(j0Var.f4078a);
        int iM2 = this.f4079b.compareTo(j0Var.f4079b);
        if (iM <= 0 && iM2 >= 0) {
            return this;
        }
        if (iM < 0 || iM2 > 0) {
            return h(iM <= 0 ? this.f4078a : j0Var.f4078a, iM2 >= 0 ? this.f4079b : j0Var.f4079b);
        }
        return j0Var;
    }

    public String toString() {
        return n(this.f4078a, this.f4079b);
    }

    private j0(D<C> d10, D<C> d11) {
        this.f4078a = (D) Be.p.q(d10);
        this.f4079b = (D) Be.p.q(d11);
        if (d10.compareTo(d11) <= 0 && d10 != D.a() && d11 != D.e()) {
            return;
        }
        throw new IllegalArgumentException("Invalid range: " + n(d10, d11));
    }

    public static <C extends Comparable<?>> j0<C> c(C c10) {
        return h(D.l(c10), D.a());
    }

    public static <C extends Comparable<?>> j0<C> d(C c10, C c11) {
        return h(D.l(c10), D.b(c11));
    }

    public static <C extends Comparable<?>> j0<C> e(C c10, C c11) {
        return h(D.l(c10), D.l(c11));
    }

    static int f(Comparable comparable, Comparable comparable2) {
        return comparable.compareTo(comparable2);
    }

    @Override // Be.q
    @Deprecated
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public boolean apply(C c10) {
        return g(c10);
    }

    public boolean g(C c10) {
        Be.p.q(c10);
        if (this.f4078a.t(c10) && !this.f4079b.t(c10)) {
            return true;
        }
        return false;
    }
}
