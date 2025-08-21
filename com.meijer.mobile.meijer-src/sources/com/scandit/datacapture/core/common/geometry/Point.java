package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes12.dex */
public final class Point {

    /* renamed from: x, reason: collision with root package name */
    final float f125078x;

    /* renamed from: y, reason: collision with root package name */
    final float f125079y;

    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.f125078x == point.f125078x && this.f125079y == point.f125079y;
    }

    public float getX() {
        return this.f125078x;
    }

    public float getY() {
        return this.f125079y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f125079y) + ((Float.floatToIntBits(this.f125078x) + 527) * 31);
    }

    public String toString() {
        return "Point{x=" + this.f125078x + ",y=" + this.f125079y + "}";
    }

    public Point(float f10, float f11) {
        this.f125078x = f10;
        this.f125079y = f11;
    }
}
