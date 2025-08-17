package com.scandit.datacapture.barcode.internal.module.count.ui.barcodeindicator;

/* loaded from: classes11.dex */
public final class A {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f121346a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121347b;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a10 = (A) obj;
        return this.f121346a == a10.f121346a && this.f121347b == a10.f121347b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f121347b) + (Boolean.hashCode(this.f121346a) * 31);
    }

    public final String toString() {
        return "ClusterLoadingStatus(isLoading=" + this.f121346a + ", animate=" + this.f121347b + ')';
    }

    public A(boolean z10, boolean z11) {
        this.f121346a = z10;
        this.f121347b = z11;
    }
}
