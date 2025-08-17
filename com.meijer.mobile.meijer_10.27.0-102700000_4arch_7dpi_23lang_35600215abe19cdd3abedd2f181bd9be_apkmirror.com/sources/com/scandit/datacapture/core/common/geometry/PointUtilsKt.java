package com.scandit.datacapture.core.common.geometry;

import com.scandit.datacapture.core.internal.module.serialization.NativeStructSerializer;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Vector;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a\u001c\u0010\b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\nH\u0000\u001a\u0014\u0010\u000b\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\f\u001a\u00020\rH\u0000\u001a\n\u0010\u000e\u001a\u00020\u000f*\u00020\u0001¨\u0006\u0010"}, d2 = {"rotatedByVector", "Lcom/scandit/datacapture/core/common/geometry/Point;", "pivot", "vector", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;", "rotatedDegrees", "degrees", "", "rotatedRadians", "radians", "", "scaled", "scale", "", "toJson", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PointUtilsKt {
    public static final Point rotatedByVector(Point point, Point pivot, Vector vector) {
        Intrinsics.j(point, "<this>");
        Intrinsics.j(pivot, "pivot");
        Intrinsics.j(vector, "vector");
        Vector vectorNormalized = vector.normalized();
        float dy = vectorNormalized.getDy();
        float dx = vectorNormalized.getDx();
        float f10 = point.f124126x;
        float f11 = pivot.f124126x;
        float f12 = f10 - f11;
        float f13 = point.f124127y;
        float f14 = pivot.f124127y;
        float f15 = f13 - f14;
        return new Point(((f12 * dx) - (f15 * dy)) + f11, (f15 * dx) + (f12 * dy) + f14);
    }

    public static final Point rotatedDegrees(Point point, Point pivot, int i10) {
        Intrinsics.j(point, "<this>");
        Intrinsics.j(pivot, "pivot");
        double radians = Math.toRadians(i10);
        double dSin = Math.sin(radians);
        double dCos = Math.cos(radians);
        float f10 = point.f124126x;
        float f11 = pivot.f124126x;
        double d10 = f10 - f11;
        float f12 = point.f124127y;
        float f13 = pivot.f124127y;
        double d11 = f12 - f13;
        return new Point((float) (((dCos * d10) - (dSin * d11)) + f11), (float) ((dCos * d11) + (dSin * d10) + f13));
    }

    public static final Point rotatedRadians(Point point, Point pivot, double d10) {
        Intrinsics.j(point, "<this>");
        Intrinsics.j(pivot, "pivot");
        double dSin = Math.sin(d10);
        double dCos = Math.cos(d10);
        float f10 = point.f124126x;
        float f11 = pivot.f124126x;
        double d11 = f10 - f11;
        float f12 = point.f124127y;
        float f13 = pivot.f124127y;
        double d12 = f12 - f13;
        return new Point((float) (((d11 * dCos) - (d12 * dSin)) + f11), (float) ((d12 * dCos) + (d11 * dSin) + f13));
    }

    public static final Point scaled(Point point, float f10) {
        Intrinsics.j(point, "<this>");
        return new Point(point.f124126x * f10, point.f124127y * f10);
    }

    public static final /* synthetic */ String toJson(Point point) {
        Intrinsics.j(point, "<this>");
        String strPointToJson = NativeStructSerializer.pointToJson(point);
        Intrinsics.i(strPointToJson, "pointToJson(...)");
        return strPointToJson;
    }
}
