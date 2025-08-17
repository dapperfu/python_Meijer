package com.scandit.datacapture.core.internal.module.device.profiles.camera;

/* loaded from: classes11.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f124226a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f124227b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f124228c;

    /* renamed from: d, reason: collision with root package name */
    public final float f124229d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f124230e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f124231f;

    /* renamed from: g, reason: collision with root package name */
    public final int f124232g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f124226a == fVar.f124226a && this.f124227b == fVar.f124227b && this.f124228c == fVar.f124228c && Float.compare(this.f124229d, fVar.f124229d) == 0 && this.f124230e == fVar.f124230e && this.f124231f == fVar.f124231f && this.f124232g == fVar.f124232g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f124232g) + ((Boolean.hashCode(this.f124231f) + ((Boolean.hashCode(this.f124230e) + ((Float.hashCode(this.f124229d) + ((Boolean.hashCode(this.f124228c) + ((Boolean.hashCode(this.f124227b) + (Boolean.hashCode(this.f124226a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Settings(disableTorch=" + this.f124226a + ", disableContinuous=" + this.f124227b + ", disableMacro=" + this.f124228c + ", minExposureTargetBias=" + this.f124229d + ", disableCustomMeteringAndFocusArea=" + this.f124230e + ", hasBrokenFullCropZoom=" + this.f124231f + ", defaultSharpnessStrength=" + this.f124232g + ')';
    }

    public static f a(f fVar, boolean z10, float f10, boolean z11, boolean z12, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = fVar.f124226a;
        }
        boolean z13 = z10;
        boolean z14 = (i11 & 2) != 0 ? fVar.f124227b : false;
        boolean z15 = (i11 & 4) != 0 ? fVar.f124228c : false;
        if ((i11 & 8) != 0) {
            f10 = fVar.f124229d;
        }
        float f11 = f10;
        if ((i11 & 16) != 0) {
            z11 = fVar.f124230e;
        }
        boolean z16 = z11;
        if ((i11 & 32) != 0) {
            z12 = fVar.f124231f;
        }
        boolean z17 = z12;
        if ((i11 & 64) != 0) {
            i10 = fVar.f124232g;
        }
        fVar.getClass();
        return new f(z13, z14, z15, f11, z16, z17, i10);
    }

    public f(boolean z10, boolean z11, boolean z12, float f10, boolean z13, boolean z14, int i10) {
        this.f124226a = z10;
        this.f124227b = z11;
        this.f124228c = z12;
        this.f124229d = f10;
        this.f124230e = z13;
        this.f124231f = z14;
        this.f124232g = i10;
    }
}
