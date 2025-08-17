package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class SizeWithUnit {
    final FloatWithUnit height;
    final FloatWithUnit width;

    public boolean equals(Object obj) {
        if (!(obj instanceof SizeWithUnit)) {
            return false;
        }
        SizeWithUnit sizeWithUnit = (SizeWithUnit) obj;
        return this.width.equals(sizeWithUnit.width) && this.height.equals(sizeWithUnit.height);
    }

    public FloatWithUnit getHeight() {
        return this.height;
    }

    public FloatWithUnit getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.height.hashCode() + ((this.width.hashCode() + 527) * 31);
    }

    public String toString() {
        return "SizeWithUnit{width=" + this.width + ",height=" + this.height + "}";
    }

    public SizeWithUnit(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2) {
        this.width = floatWithUnit;
        this.height = floatWithUnit2;
    }
}
