package com.scandit.datacapture.barcode.internal.module.ar.ui.overlay;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final long f122169a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f122170b;

    /* renamed from: c, reason: collision with root package name */
    public final a f122171c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f122169a == kVar.f122169a && this.f122170b == kVar.f122170b && Intrinsics.e(this.f122171c, kVar.f122171c);
    }

    public final int hashCode() {
        return this.f122171c.hashCode() + ((Boolean.hashCode(this.f122170b) + (Long.hashCode(this.f122169a) * 31)) * 31);
    }

    public final String toString() {
        return "BarcodeArPendingRemovalData(removeAtTimestamp=" + this.f122169a + ", wasAnnotationShowing=" + this.f122170b + ", augmentationData=" + this.f122171c + ')';
    }

    public k(long j10, boolean z10, a augmentationData) {
        Intrinsics.j(augmentationData, "augmentationData");
        this.f122169a = j10;
        this.f122170b = z10;
        this.f122171c = augmentationData;
    }
}
