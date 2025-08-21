package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class PointWithUnit {

    /* renamed from: x, reason: collision with root package name */
    final FloatWithUnit f125080x;

    /* renamed from: y, reason: collision with root package name */
    final FloatWithUnit f125081y;

    public boolean equals(Object obj) {
        if (!(obj instanceof PointWithUnit)) {
            return false;
        }
        PointWithUnit pointWithUnit = (PointWithUnit) obj;
        return this.f125080x.equals(pointWithUnit.f125080x) && this.f125081y.equals(pointWithUnit.f125081y);
    }

    public FloatWithUnit getX() {
        return this.f125080x;
    }

    public FloatWithUnit getY() {
        return this.f125081y;
    }

    public int hashCode() {
        return this.f125081y.hashCode() + ((this.f125080x.hashCode() + 527) * 31);
    }

    public String toString() {
        return "PointWithUnit{x=" + this.f125080x + ",y=" + this.f125081y + "}";
    }

    public PointWithUnit(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2) {
        this.f125080x = floatWithUnit;
        this.f125081y = floatWithUnit2;
    }
}
