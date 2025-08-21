package com.scandit.datacapture.core.internal.module.device.profiles.camera;

/* loaded from: classes12.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f125178a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f125179b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f125180c;

    /* renamed from: d, reason: collision with root package name */
    public final float f125181d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f125182e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f125183f;

    /* renamed from: g, reason: collision with root package name */
    public final int f125184g;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return this.f125178a == fVar.f125178a && this.f125179b == fVar.f125179b && this.f125180c == fVar.f125180c && Float.compare(this.f125181d, fVar.f125181d) == 0 && this.f125182e == fVar.f125182e && this.f125183f == fVar.f125183f && this.f125184g == fVar.f125184g;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f125184g) + ((Boolean.hashCode(this.f125183f) + ((Boolean.hashCode(this.f125182e) + ((Float.hashCode(this.f125181d) + ((Boolean.hashCode(this.f125180c) + ((Boolean.hashCode(this.f125179b) + (Boolean.hashCode(this.f125178a) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "Settings(disableTorch=" + this.f125178a + ", disableContinuous=" + this.f125179b + ", disableMacro=" + this.f125180c + ", minExposureTargetBias=" + this.f125181d + ", disableCustomMeteringAndFocusArea=" + this.f125182e + ", hasBrokenFullCropZoom=" + this.f125183f + ", defaultSharpnessStrength=" + this.f125184g + ')';
    }

    public static f a(f fVar, boolean z10, float f10, boolean z11, boolean z12, int i10, int i11) {
        if ((i11 & 1) != 0) {
            z10 = fVar.f125178a;
        }
        boolean z13 = z10;
        boolean z14 = (i11 & 2) != 0 ? fVar.f125179b : false;
        boolean z15 = (i11 & 4) != 0 ? fVar.f125180c : false;
        if ((i11 & 8) != 0) {
            f10 = fVar.f125181d;
        }
        float f11 = f10;
        if ((i11 & 16) != 0) {
            z11 = fVar.f125182e;
        }
        boolean z16 = z11;
        if ((i11 & 32) != 0) {
            z12 = fVar.f125183f;
        }
        boolean z17 = z12;
        if ((i11 & 64) != 0) {
            i10 = fVar.f125184g;
        }
        fVar.getClass();
        return new f(z13, z14, z15, f11, z16, z17, i10);
    }

    public f(boolean z10, boolean z11, boolean z12, float f10, boolean z13, boolean z14, int i10) {
        this.f125178a = z10;
        this.f125179b = z11;
        this.f125180c = z12;
        this.f125181d = f10;
        this.f125182e = z13;
        this.f125183f = z14;
        this.f125184g = i10;
    }
}
