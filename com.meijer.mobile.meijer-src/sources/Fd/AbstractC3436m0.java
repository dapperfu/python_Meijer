package Fd;

import java.util.Set;

/* renamed from: Fd.m0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3436m0 extends AbstractC3340e0 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient AbstractC3400j0 f10202b;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return F0.b(this, obj);
    }

    public final AbstractC3400j0 l() {
        AbstractC3400j0 abstractC3400j0 = this.f10202b;
        if (abstractC3400j0 != null) {
            return abstractC3400j0;
        }
        AbstractC3400j0 abstractC3400j0M = m();
        this.f10202b = abstractC3400j0M;
        return abstractC3400j0M;
    }

    AbstractC3436m0() {
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return F0.a(this);
    }

    AbstractC3400j0 m() {
        Object[] array = toArray();
        int i10 = AbstractC3400j0.f10135c;
        return AbstractC3400j0.m(array, array.length);
    }
}
