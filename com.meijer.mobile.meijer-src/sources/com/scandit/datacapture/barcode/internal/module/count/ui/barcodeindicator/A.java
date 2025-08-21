package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

/* loaded from: classes12.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f122298a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122299b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f122298a == a10.f122298a && this.f122299b == a10.f122299b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f122299b) + (Boolean.hashCode(this.f122298a) * 31);
    }

    public final String toString() {
        return "ClusterLoadingStatus(isLoading=" + this.f122298a + ", animate=" + this.f122299b + ')';
    }

    public A(boolean z10, boolean z11) {
        this.f122298a = z10;
        this.f122299b = z11;
    }
}
