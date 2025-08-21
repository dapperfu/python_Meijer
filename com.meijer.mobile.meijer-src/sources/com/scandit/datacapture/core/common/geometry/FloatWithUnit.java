package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class FloatWithUnit {
    final MeasureUnit unit;
    final float value;

    public boolean equals(Object obj) {
        if (!(obj instanceof FloatWithUnit)) {
            return false;
        }
        FloatWithUnit floatWithUnit = (FloatWithUnit) obj;
        return this.value == floatWithUnit.value && this.unit == floatWithUnit.unit;
    }

    public MeasureUnit getUnit() {
        return this.unit;
    }

    public float getValue() {
        return this.value;
    }

    public int hashCode() {
        return this.unit.hashCode() + ((Float.floatToIntBits(this.value) + 527) * 31);
    }

    public String toString() {
        return "FloatWithUnit{value=" + this.value + ",unit=" + this.unit + "}";
    }

    public FloatWithUnit(float f10, MeasureUnit measureUnit) {
        this.value = f10;
        this.unit = measureUnit;
    }
}
