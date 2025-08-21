package Ee;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class r0<T> extends g0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final g0<? super T> f7420a;

    @Override // Ee.g0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f7420a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            return this.f7420a.equals(((r0) obj).f7420a);
        }
        return false;
    }

    @Override // Ee.g0
    public <S extends T> g0<S> f() {
        return this.f7420a;
    }

    public int hashCode() {
        return -this.f7420a.hashCode();
    }

    public String toString() {
        return this.f7420a + ".reverse()";
    }

    r0(g0<? super T> g0Var) {
        this.f7420a = (g0) De.p.q(g0Var);
    }
}
