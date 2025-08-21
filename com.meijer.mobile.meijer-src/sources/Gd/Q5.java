package Gd;

import java.util.Set;

/* loaded from: classes6.dex */
public abstract class Q5 extends M4 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient N5 f11830b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this || obj == this) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            try {
                if (size() == set.size()) {
                    return containsAll(set);
                }
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public final N5 k() {
        N5 n52 = this.f11830b;
        if (n52 != null) {
            return n52;
        }
        N5 n5L = l();
        this.f11830b = n5L;
        return n5L;
    }

    Q5() {
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return C3623b.a(this);
    }

    N5 l() {
        return N5.l(toArray());
    }
}
