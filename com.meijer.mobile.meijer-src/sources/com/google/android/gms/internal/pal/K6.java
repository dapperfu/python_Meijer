package com.google.android.gms.internal.pal;

import java.util.Set;

/* loaded from: classes6.dex */
public abstract class K6 extends C6 implements Set {

    /* renamed from: b, reason: collision with root package name */
    private transient F6 f83568b;

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

    public abstract S6 k();

    public final F6 l() {
        F6 f62 = this.f83568b;
        if (f62 != null) {
            return f62;
        }
        F6 f6M = m();
        this.f83568b = f6M;
        return f6M;
    }

    K6() {
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return R6.a(this);
    }

    F6 m() {
        return F6.l(toArray());
    }
}
