package Ce;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class r0<T> extends g0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final g0<? super T> f4108a;

    @Override // Ce.g0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f4108a.compare(t11, t10);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r0) {
            return this.f4108a.equals(((r0) obj).f4108a);
        }
        return false;
    }

    @Override // Ce.g0
    public <S extends T> g0<S> f() {
        return this.f4108a;
    }

    public int hashCode() {
        return -this.f4108a.hashCode();
    }

    public String toString() {
        return this.f4108a + ".reverse()";
    }

    r0(g0<? super T> g0Var) {
        this.f4108a = (g0) Be.p.q(g0Var);
    }
}
