package com.scandit.datacapture.core.internal.sdk.common.graphics;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class NativeColor {

    /* renamed from: a, reason: collision with root package name */
    final float f125429a;

    /* renamed from: b, reason: collision with root package name */
    final float f125430b;

    /* renamed from: g, reason: collision with root package name */
    final float f125431g;

    /* renamed from: r, reason: collision with root package name */
    final float f125432r;

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeColor)) {
            return false;
        }
        NativeColor nativeColor = (NativeColor) obj;
        return this.f125432r == nativeColor.f125432r && this.f125431g == nativeColor.f125431g && this.f125430b == nativeColor.f125430b && this.f125429a == nativeColor.f125429a;
    }

    public float getA() {
        return this.f125429a;
    }

    public float getB() {
        return this.f125430b;
    }

    public float getG() {
        return this.f125431g;
    }

    public float getR() {
        return this.f125432r;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f125429a) + ((Float.floatToIntBits(this.f125430b) + ((Float.floatToIntBits(this.f125431g) + ((Float.floatToIntBits(this.f125432r) + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "NativeColor{r=" + this.f125432r + ",g=" + this.f125431g + ",b=" + this.f125430b + ",a=" + this.f125429a + "}";
    }

    public NativeColor(float f10, float f11, float f12, float f13) {
        this.f125432r = f10;
        this.f125431g = f11;
        this.f125430b = f12;
        this.f125429a = f13;
    }
}
