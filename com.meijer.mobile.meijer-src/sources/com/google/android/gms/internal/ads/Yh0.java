package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* loaded from: classes6.dex */
final class Yh0 extends AbstractC7193Ph0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final AbstractC7193Ph0 f72438a;

    @Override // com.google.android.gms.internal.ads.AbstractC7193Ph0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f72438a.compare(obj2, obj);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof Yh0) {
            return this.f72438a.equals(((Yh0) obj).f72438a);
        }
        return false;
    }

    public final int hashCode() {
        return -this.f72438a.hashCode();
    }

    public final String toString() {
        return this.f72438a.toString().concat(".reverse()");
    }

    Yh0(AbstractC7193Ph0 abstractC7193Ph0) {
        this.f72438a = abstractC7193Ph0;
    }
}
