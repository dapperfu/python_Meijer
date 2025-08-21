package com.scandit.datacapture.core.internal.sdk.extensions;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0012\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0012\u0010\u0004\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002\u001a\u0015\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\u0002\u001a\n\u0010\u0007\u001a\u00020\u0001*\u00020\u0002\u001a\u0015\u0010\b\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\t\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0086\u0002\u001a\u0015\u0010\n\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0001H\u0086\u0002¨\u0006\u000b"}, d2 = {"distance", "", "Lcom/scandit/datacapture/core/common/geometry/Point;", "other", "distanceSquared", "div", "value", "dotProductSquared", "minus", "plus", "times", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PointExtensionsKt {
    public static final float distance(Point point, Point other) {
        Intrinsics.j(point, "<this>");
        Intrinsics.j(other, "other");
        return (float) Math.sqrt(distanceSquared(point, other));
    }

    public static final float distanceSquared(Point point, Point other) {
        Intrinsics.j(point, "<this>");
        Intrinsics.j(other, "other");
        float x10 = point.getX() - other.getX();
        float y10 = point.getY() - other.getY();
        return (y10 * y10) + (x10 * x10);
    }

    public static final Point div(Point point, float f10) {
        Intrinsics.j(point, "<this>");
        return new Point(point.getX() / f10, point.getY() / f10);
    }

    public static final float dotProductSquared(Point point) {
        Intrinsics.j(point, "<this>");
        return (point.getY() * point.getY()) + (point.getX() * point.getX());
    }

    public static final Point minus(Point point, Point other) {
        Intrinsics.j(point, "<this>");
        Intrinsics.j(other, "other");
        return new Point(point.getX() - other.getX(), point.getY() - other.getY());
    }

    public static final Point plus(Point point, Point other) {
        Intrinsics.j(point, "<this>");
        Intrinsics.j(other, "other");
        return new Point(other.getX() + point.getX(), other.getY() + point.getY());
    }

    public static final Point times(Point point, float f10) {
        Intrinsics.j(point, "<this>");
        return new Point(point.getX() * f10, point.getY() * f10);
    }
}
