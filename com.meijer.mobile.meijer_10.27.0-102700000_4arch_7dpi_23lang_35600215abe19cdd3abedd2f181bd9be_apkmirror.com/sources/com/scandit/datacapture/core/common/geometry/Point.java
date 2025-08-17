package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.internal.sdk.annotations.DjinniGenerated;

@DjinniGenerated
/* loaded from: classes11.dex */
public final class Point {

    /* renamed from: x, reason: collision with root package name */
    final float f124126x;

    /* renamed from: y, reason: collision with root package name */
    final float f124127y;

    public boolean equals(Object obj) {
        if (!(obj instanceof Point)) {
            return false;
        }
        Point point = (Point) obj;
        return this.f124126x == point.f124126x && this.f124127y == point.f124127y;
    }

    public float getX() {
        return this.f124126x;
    }

    public float getY() {
        return this.f124127y;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.f124127y) + ((Float.floatToIntBits(this.f124126x) + 527) * 31);
    }

    public String toString() {
        return "Point{x=" + this.f124126x + ",y=" + this.f124127y + "}";
    }

    public Point(float f10, float f11) {
        this.f124126x = f10;
        this.f124127y = f11;
    }
}
