package com.scandit.datacapture.core.internal.sdk.common.graphics;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeColor {

    /* renamed from: a, reason: collision with root package name */
    final float f126381a;

    /* renamed from: b, reason: collision with root package name */
    final float f126382b;

    /* renamed from: g, reason: collision with root package name */
    final float f126383g;

    /* renamed from: r, reason: collision with root package name */
    final float f126384r;

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeColor)) {
            return false;
        }
        NativeColor nativeColor = (NativeColor) obj;
        return this.f126384r == nativeColor.f126384r && this.f126383g == nativeColor.f126383g && this.f126382b == nativeColor.f126382b && this.f126381a == nativeColor.f126381a;
    }

    public float getA() {
        return this.f126381a;
    }

    public float getB() {
        return this.f126382b;
    }

    public float getG() {
        return this.f126383g;
    }

    public float getR() {
        return this.f126384r;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f126381a) + ((Float.floatToIntBits(this.f126382b) + ((Float.floatToIntBits(this.f126383g) + ((Float.floatToIntBits(this.f126384r) + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "NativeColor{r=" + this.f126384r + ",g=" + this.f126383g + ",b=" + this.f126382b + ",a=" + this.f126381a + "}";
    }

    public NativeColor(float f10, float f11, float f12, float f13) {
        this.f126384r = f10;
        this.f126383g = f11;
        this.f126382b = f12;
        this.f126381a = f13;
    }
}
