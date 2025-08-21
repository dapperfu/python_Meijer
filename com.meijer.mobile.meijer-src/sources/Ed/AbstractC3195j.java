package Ed;

import java.util.Set;

/* renamed from: Ed.j, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3195j extends AbstractC3188c implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC3191f f7125b;

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

    public final AbstractC3191f k() {
        AbstractC3191f abstractC3191f = this.f7125b;
        if (abstractC3191f != null) {
            return abstractC3191f;
        }
        AbstractC3191f abstractC3191fL = l();
        this.f7125b = abstractC3191fL;
        return abstractC3191fL;
    }

    AbstractC3195j() {
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return r.a(this);
    }

    AbstractC3191f l() {
        Object[] array = toArray();
        int i10 = AbstractC3191f.f7115c;
        return AbstractC3191f.l(array, array.length);
    }
}
