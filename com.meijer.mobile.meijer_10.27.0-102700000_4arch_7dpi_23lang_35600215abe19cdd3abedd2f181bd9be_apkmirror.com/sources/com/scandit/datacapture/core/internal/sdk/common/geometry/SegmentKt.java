package com.scandit.datacapture.core.internal.sdk.common.geometry;

import com.scandit.datacapture.core.common.geometry.Point;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\u001a\u0016\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u001a\u0014\u0010\u0004\u001a\u00020\u0002*\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"intersectionWithLineOf", "Lcom/scandit/datacapture/core/common/geometry/Point;", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Segment;", "other", "moveAlongNormal", "distance", "", "scandit-capture-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SegmentKt {
    public static final Point intersectionWithLineOf(Segment segment, Segment other) {
        Intrinsics.j(segment, "<this>");
        Intrinsics.j(other, "other");
        if (segment.getSlope() == other.getSlope()) {
            return null;
        }
        float x10 = segment.getA().getX();
        float y10 = segment.getA().getY();
        float x11 = segment.getB().getX();
        float y11 = segment.getB().getY();
        float x12 = other.getA().getX();
        float y12 = other.getA().getY();
        float x13 = other.getB().getX();
        float y13 = other.getB().getY() - y12;
        float f10 = x11 - x10;
        float f11 = x13 - x12;
        float f12 = y11 - y10;
        float f13 = (y13 * f10) - (f11 * f12);
        if (f13 == 0.0f) {
            return null;
        }
        float f14 = (((y10 - y12) * f11) - ((x10 - x12) * y13)) / f13;
        return new Point((f10 * f14) + x10, (f14 * f12) + y10);
    }

    public static final Segment moveAlongNormal(Segment segment, float f10) {
        Intrinsics.j(segment, "<this>");
        Vector vectorNormalized = segment.vector().normalized();
        float dy = vectorNormalized.getDy();
        float f11 = dy * f10;
        float f12 = (-vectorNormalized.getDx()) * f10;
        return new Segment(new Point(segment.getA().getX() + f11, segment.getA().getY() + f12), new Point(segment.getB().getX() + f11, segment.getB().getY() + f12));
    }
}
