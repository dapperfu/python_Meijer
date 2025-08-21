package com.scandit.datacapture.core.internal.sdk.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeFloatRange {
    final float max;
    final float min;

    public float getMax() {
        return this.max;
    }

    public float getMin() {
        return this.min;
    }

    public String toString() {
        return "NativeFloatRange{min=" + this.min + ",max=" + this.max + "}";
    }

    public NativeFloatRange(float f10, float f11) {
        this.min = f10;
        this.max = f11;
    }
}
