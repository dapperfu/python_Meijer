package com.scandit.datacapture.core.internal.module.source.dynamicresolution;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final int f126010a;

    /* renamed from: b, reason: collision with root package name */
    public final int f126011b;

    /* renamed from: c, reason: collision with root package name */
    public final int f126012c;

    /* renamed from: d, reason: collision with root package name */
    public final String f126013d;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return this.f126010a == kVar.f126010a && this.f126011b == kVar.f126011b && this.f126012c == kVar.f126012c && Intrinsics.e(this.f126013d, kVar.f126013d);
    }

    public final int hashCode() {
        return this.f126013d.hashCode() + ((Integer.hashCode(this.f126012c) + ((Integer.hashCode(this.f126011b) + (Integer.hashCode(this.f126010a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DynamicResolutionSettings(lowFpsBar=" + this.f126010a + ", highPreviewOffsetBar=" + this.f126011b + ", measuringIntervalMillis=" + this.f126012c + ", currentResolution=" + this.f126013d + ')';
    }

    public k(int i10, int i11, int i12, String currentResolution) {
        Intrinsics.j(currentResolution, "currentResolution");
        this.f126010a = i10;
        this.f126011b = i11;
        this.f126012c = i12;
        this.f126013d = currentResolution;
    }
}
