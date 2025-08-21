package Ee;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes6.dex */
final class A<T> extends g0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator<T> f7148a;

    @Override // Ee.g0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f7148a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            return this.f7148a.equals(((A) obj).f7148a);
        }
        return false;
    }

    public int hashCode() {
        return this.f7148a.hashCode();
    }

    public String toString() {
        return this.f7148a.toString();
    }

    A(Comparator<T> comparator) {
        this.f7148a = (Comparator) De.p.q(comparator);
    }
}
