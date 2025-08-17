package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class SizeWithAspect {
    final float aspect;
    final FloatWithUnit size;

    public boolean equals(Object obj) {
        if (!(obj instanceof SizeWithAspect)) {
            return false;
        }
        SizeWithAspect sizeWithAspect = (SizeWithAspect) obj;
        return this.size.equals(sizeWithAspect.size) && this.aspect == sizeWithAspect.aspect;
    }

    public float getAspect() {
        return this.aspect;
    }

    public FloatWithUnit getSize() {
        return this.size;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.aspect) + ((this.size.hashCode() + 527) * 31);
    }

    public String toString() {
        return "SizeWithAspect{size=" + this.size + ",aspect=" + this.aspect + "}";
    }

    public SizeWithAspect(FloatWithUnit floatWithUnit, float f10) {
        this.size = floatWithUnit;
        this.aspect = f10;
    }
}
