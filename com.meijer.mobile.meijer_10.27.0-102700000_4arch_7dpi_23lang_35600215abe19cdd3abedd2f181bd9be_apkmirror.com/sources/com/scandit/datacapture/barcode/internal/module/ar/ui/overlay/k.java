package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f121217a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f121218b;

    /* renamed from: c, reason: collision with root package name */
    public final a f121219c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f121217a == kVar.f121217a && this.f121218b == kVar.f121218b && Intrinsics.e(this.f121219c, kVar.f121219c);
    }

    public final int hashCode() {
        return this.f121219c.hashCode() + ((Boolean.hashCode(this.f121218b) + (Long.hashCode(this.f121217a) * 31)) * 31);
    }

    public final String toString() {
        return "BarcodeArPendingRemovalData(removeAtTimestamp=" + this.f121217a + ", wasAnnotationShowing=" + this.f121218b + ", augmentationData=" + this.f121219c + ')';
    }

    public k(long j10, boolean z10, a augmentationData) {
        Intrinsics.j(augmentationData, "augmentationData");
        this.f121217a = j10;
        this.f121218b = z10;
        this.f121219c = augmentationData;
    }
}
