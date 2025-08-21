package com.scandit.datacapture.core.internal.sdk.capture;

import com.scandit.datacapture.core.common.geometry.MarginsWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.SizeWithUnit;
import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class NativeFrameOfReference {
    final MarginsWithUnit margins;
    final float pixelsPerDip;
    final PointWithUnit pointOfInterest;
    final int rotation;
    final SizeWithUnit viewSize;

    public boolean equals(Object obj) {
        if (!(obj instanceof NativeFrameOfReference)) {
            return false;
        }
        NativeFrameOfReference nativeFrameOfReference = (NativeFrameOfReference) obj;
        return this.viewSize.equals(nativeFrameOfReference.viewSize) && this.pixelsPerDip == nativeFrameOfReference.pixelsPerDip && this.rotation == nativeFrameOfReference.rotation && this.pointOfInterest.equals(nativeFrameOfReference.pointOfInterest) && this.margins.equals(nativeFrameOfReference.margins);
    }

    public MarginsWithUnit getMargins() {
        return this.margins;
    }

    public float getPixelsPerDip() {
        return this.pixelsPerDip;
    }

    public PointWithUnit getPointOfInterest() {
        return this.pointOfInterest;
    }

    public int getRotation() {
        return this.rotation;
    }

    public SizeWithUnit getViewSize() {
        return this.viewSize;
    }

    public int hashCode() {
        return this.margins.hashCode() + ((this.pointOfInterest.hashCode() + ((((Float.floatToIntBits(this.pixelsPerDip) + ((this.viewSize.hashCode() + 527) * 31)) * 31) + this.rotation) * 31)) * 31);
    }

    public String toString() {
        return "NativeFrameOfReference{viewSize=" + this.viewSize + ",pixelsPerDip=" + this.pixelsPerDip + ",rotation=" + this.rotation + ",pointOfInterest=" + this.pointOfInterest + ",margins=" + this.margins + "}";
    }

    public NativeFrameOfReference(SizeWithUnit sizeWithUnit, float f10, int i10, PointWithUnit pointWithUnit, MarginsWithUnit marginsWithUnit) {
        this.viewSize = sizeWithUnit;
        this.pixelsPerDip = f10;
        this.rotation = i10;
        this.pointOfInterest = pointWithUnit;
        this.margins = marginsWithUnit;
    }
}
