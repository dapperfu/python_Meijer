package com.scandit.datacapture.core.data;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class Range {
    final int maximum;
    final int minimum;
    final int step;

    public boolean equals(Object obj) {
        if (!(obj instanceof Range)) {
            return false;
        }
        Range range = (Range) obj;
        return this.minimum == range.minimum && this.maximum == range.maximum && this.step == range.step;
    }

    public int getMaximum() {
        return this.maximum;
    }

    public int getMinimum() {
        return this.minimum;
    }

    public int getStep() {
        return this.step;
    }

    public int hashCode() {
        return ((((this.minimum + 527) * 31) + this.maximum) * 31) + this.step;
    }

    public String toString() {
        return "Range{minimum=" + this.minimum + ",maximum=" + this.maximum + ",step=" + this.step + "}";
    }

    public Range(int i10, int i11, int i12) {
        this.minimum = i10;
        this.maximum = i11;
        this.step = i12;
    }
}
