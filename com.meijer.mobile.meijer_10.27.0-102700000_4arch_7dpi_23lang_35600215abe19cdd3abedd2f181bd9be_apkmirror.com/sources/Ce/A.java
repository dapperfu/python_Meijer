package Ce;

import java.io.Serializable;
import java.util.Comparator;

/* loaded from: classes6.dex */
final class A<T> extends g0<T> implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator<T> f3836a;

    @Override // Ce.g0, java.util.Comparator
    public int compare(T t10, T t11) {
        return this.f3836a.compare(t10, t11);
    }

    @Override // java.util.Comparator
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof A) {
            return this.f3836a.equals(((A) obj).f3836a);
        }
        return false;
    }

    public int hashCode() {
        return this.f3836a.hashCode();
    }

    public String toString() {
        return this.f3836a.toString();
    }

    A(Comparator<T> comparator) {
        this.f3836a = (Comparator) Be.p.q(comparator);
    }
}
