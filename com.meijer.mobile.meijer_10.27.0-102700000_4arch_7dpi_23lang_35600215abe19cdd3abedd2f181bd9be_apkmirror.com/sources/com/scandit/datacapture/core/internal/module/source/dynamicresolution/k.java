package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes11.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f125058a;

    /* renamed from: b, reason: collision with root package name */
    public final int f125059b;

    /* renamed from: c, reason: collision with root package name */
    public final int f125060c;

    /* renamed from: d, reason: collision with root package name */
    public final String f125061d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f125058a == kVar.f125058a && this.f125059b == kVar.f125059b && this.f125060c == kVar.f125060c && Intrinsics.e(this.f125061d, kVar.f125061d);
    }

    public final int hashCode() {
        return this.f125061d.hashCode() + ((Integer.hashCode(this.f125060c) + ((Integer.hashCode(this.f125059b) + (Integer.hashCode(this.f125058a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DynamicResolutionSettings(lowFpsBar=" + this.f125058a + ", highPreviewOffsetBar=" + this.f125059b + ", measuringIntervalMillis=" + this.f125060c + ", currentResolution=" + this.f125061d + ')';
    }

    public k(int i10, int i11, int i12, String currentResolution) {
        Intrinsics.j(currentResolution, "currentResolution");
        this.f125058a = i10;
        this.f125059b = i11;
        this.f125060c = i12;
        this.f125061d = currentResolution;
    }
}
