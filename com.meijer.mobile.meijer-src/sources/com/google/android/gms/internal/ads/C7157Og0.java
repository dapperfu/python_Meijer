package com.google.android.gms.internal.ads;

import java.io.Serializable;
import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Og0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7157Og0 extends AbstractC7193Ph0 implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    final Comparator f69968a;

    @Override // com.google.android.gms.internal.ads.AbstractC7193Ph0, java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return this.f69968a.compare(obj, obj2);
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C7157Og0) {
            return this.f69968a.equals(((C7157Og0) obj).f69968a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69968a.hashCode();
    }

    public final String toString() {
        return this.f69968a.toString();
    }

    C7157Og0(Comparator comparator) {
        this.f69968a = comparator;
    }
}
