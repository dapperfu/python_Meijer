package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class PointWithUnit {

    /* renamed from: x, reason: collision with root package name */
    final FloatWithUnit f124128x;

    /* renamed from: y, reason: collision with root package name */
    final FloatWithUnit f124129y;

    public boolean equals(Object obj) {
        if (!(obj instanceof PointWithUnit)) {
            return false;
        }
        PointWithUnit pointWithUnit = (PointWithUnit) obj;
        return this.f124128x.equals(pointWithUnit.f124128x) && this.f124129y.equals(pointWithUnit.f124129y);
    }

    public FloatWithUnit getX() {
        return this.f124128x;
    }

    public FloatWithUnit getY() {
        return this.f124129y;
    }

    public int hashCode() {
        return this.f124129y.hashCode() + ((this.f124128x.hashCode() + 527) * 31);
    }

    public String toString() {
        return "PointWithUnit{x=" + this.f124128x + ",y=" + this.f124129y + "}";
    }

    public PointWithUnit(FloatWithUnit floatWithUnit, FloatWithUnit floatWithUnit2) {
        this.f124128x = floatWithUnit;
        this.f124129y = floatWithUnit2;
    }
}
