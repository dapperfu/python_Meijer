package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class MarginsWithUnit {
    final FloatWithUnit bottom;
    final FloatWithUnit left;
    final FloatWithUnit right;
    final FloatWithUnit top;

    public boolean equals(Object obj) {
        if (!(obj instanceof MarginsWithUnit)) {
            return false;
        }
        MarginsWithUnit marginsWithUnit = (MarginsWithUnit) obj;
        return this.left.equals(marginsWithUnit.left) && this.top.equals(marginsWithUnit.top) && this.right.equals(marginsWithUnit.right) && this.bottom.equals(marginsWithUnit.bottom);
    }

    public FloatWithUnit getBottom() {
        return this.bottom;
    }

    public FloatWithUnit getLeft() {
        return this.left;
    }

    public FloatWithUnit getRight() {
        return this.right;
    }

    public FloatWithUnit getTop() {
        return this.top;
    }

    public int hashCode() {
        return this.bottom.hashCode() + ((this.right.hashCode() + ((this.top.hashCode() + ((this.left.hashCode() + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MarginsWithUnit{left=" + this.left + ",top=" + this.top + ",right=" + this.right + ",bottom=" + this.bottom + "}";
    }

    public MarginsWithUnit(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2, FloatWithUnit floatWithUnit3, FloatWithUnit floatWithUnit4) {
        this.left = floatWithUnit;
        this.top = floatWithUnit2;
        this.right = floatWithUnit3;
        this.bottom = floatWithUnit4;
    }
}
