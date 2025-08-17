package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class Size2 {
    final float height;
    final float width;

    public boolean equals(Object obj) {
        if (!(obj instanceof Size2)) {
            return false;
        }
        Size2 size2 = (Size2) obj;
        return this.width == size2.width && this.height == size2.height;
    }

    public float getHeight() {
        return this.height;
    }

    public float getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.height) + ((Float.floatToIntBits(this.width) + 527) * 31);
    }

    public String toString() {
        return "Size2{width=" + this.width + ",height=" + this.height + "}";
    }

    public Size2(float f10, float f11) {
        this.width = f10;
        this.height = f11;
    }
}
