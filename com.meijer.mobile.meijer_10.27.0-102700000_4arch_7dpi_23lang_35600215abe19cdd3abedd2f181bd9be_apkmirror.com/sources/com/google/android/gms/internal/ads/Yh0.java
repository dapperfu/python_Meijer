package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class Yh0 extends AbstractC7068Ph0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7068Ph0 f71598a;

    @Override // com.google.android.gms.internal.ads.AbstractC7068Ph0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f71598a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Yh0) {
            return this.f71598a.equals(((Yh0) obj).f71598a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f71598a.hashCode();
    }

    public final String toString() {
        return this.f71598a.toString().concat(".reverse()");
    }

    Yh0(AbstractC7068Ph0 abstractC7068Ph0) {
        this.f71598a = abstractC7068Ph0;
    }
}
