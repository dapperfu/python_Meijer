package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class RectWithUnit {
    final PointWithUnit origin;
    final SizeWithUnit size;

    public boolean equals(Object obj) {
        if (!(obj instanceof RectWithUnit)) {
            return false;
        }
        RectWithUnit rectWithUnit = (RectWithUnit) obj;
        return this.origin.equals(rectWithUnit.origin) && this.size.equals(rectWithUnit.size);
    }

    public PointWithUnit getOrigin() {
        return this.origin;
    }

    public SizeWithUnit getSize() {
        return this.size;
    }

    public int hashCode() {
        return this.size.hashCode() + ((this.origin.hashCode() + 527) * 31);
    }

    public String toString() {
        return "RectWithUnit{origin=" + this.origin + ",size=" + this.size + "}";
    }

    public RectWithUnit(PointWithUnit pointWithUnit, SizeWithUnit sizeWithUnit) {
        this.origin = pointWithUnit;
        this.size = sizeWithUnit;
    }
}
