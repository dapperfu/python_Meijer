package Cd;

import java.util.Set;

/* renamed from: Cd.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC2992j extends AbstractC2985c implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC2988f f3813b;

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

    public final AbstractC2988f k() {
        AbstractC2988f abstractC2988f = this.f3813b;
        if (abstractC2988f != null) {
            return abstractC2988f;
        }
        AbstractC2988f abstractC2988fL = l();
        this.f3813b = abstractC2988fL;
        return abstractC2988fL;
    }

    AbstractC2992j() {
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.a(this);
    }

    AbstractC2988f l() {
        Object[] array = toArray();
        int i10 = AbstractC2988f.f3803c;
        return AbstractC2988f.l(array, array.length);
    }
}
