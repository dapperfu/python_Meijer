package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class MarginsF {
    final float bottom;
    final float left;
    final float right;
    final float top;

    public boolean equals(Object obj) {
        if (!(obj instanceof MarginsF)) {
            return false;
        }
        MarginsF marginsF = (MarginsF) obj;
        return this.left == marginsF.left && this.top == marginsF.top && this.right == marginsF.right && this.bottom == marginsF.bottom;
    }

    public float getBottom() {
        return this.bottom;
    }

    public float getLeft() {
        return this.left;
    }

    public float getRight() {
        return this.right;
    }

    public float getTop() {
        return this.top;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.bottom) + ((Float.floatToIntBits(this.right) + ((Float.floatToIntBits(this.top) + ((Float.floatToIntBits(this.left) + 527) * 31)) * 31)) * 31);
    }

    public String toString() {
        return "MarginsF{left=" + this.left + ",top=" + this.top + ",right=" + this.right + ",bottom=" + this.bottom + "}";
    }

    public MarginsF(float f10, float f11, float f12, float f13) {
        this.left = f10;
        this.top = f11;
        this.right = f12;
        this.bottom = f13;
    }
}
