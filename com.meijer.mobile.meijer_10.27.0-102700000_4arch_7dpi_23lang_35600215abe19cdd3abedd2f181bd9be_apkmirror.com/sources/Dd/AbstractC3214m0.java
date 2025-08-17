package Dd;

import java.util.Set;

/* renamed from: Dd.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3214m0 extends AbstractC3118e0 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC3178j0 f6169b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return F0.b(this, obj);
    }

    public final AbstractC3178j0 l() {
        AbstractC3178j0 abstractC3178j0 = this.f6169b;
        if (abstractC3178j0 != null) {
            return abstractC3178j0;
        }
        AbstractC3178j0 abstractC3178j0M = m();
        this.f6169b = abstractC3178j0M;
        return abstractC3178j0M;
    }

    AbstractC3214m0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return F0.a(this);
    }

    AbstractC3178j0 m() {
        Object[] array = toArray();
        int i10 = AbstractC3178j0.f6102c;
        return AbstractC3178j0.m(array, array.length);
    }
}
