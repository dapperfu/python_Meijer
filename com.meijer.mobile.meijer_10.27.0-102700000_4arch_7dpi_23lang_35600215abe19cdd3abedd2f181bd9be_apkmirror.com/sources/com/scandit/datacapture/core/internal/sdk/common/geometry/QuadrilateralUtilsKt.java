package com.scandit.datacapture.core.internal.sdk.common.geometry;

import android.graphics.Rect;
import android.graphics.RectF;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import kotlin.Metadata;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001c\u001a!\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u001a!\u0010\t\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a!\u0010\r\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u0014*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u000f*\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0001¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0011\u0010\u0019\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0019\u0010\u001a\u001a\u0011\u0010\u001b\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u001b\u0010\u001a\u001a\u0015\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u001d\u0010\u001e\u001a\u00020\u00002\u0006\u0010 \u001a\u00020\u00012\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b\u001e\u0010#\u001a\u0011\u0010%\u001a\u00020$*\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010(\u001a\u00020\u0000*\u00020\u00002\u0006\u0010'\u001a\u00020\u000f¢\u0006\u0004\b(\u0010\u0012\u001a\u0011\u0010)\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b)\u0010\u001a\u001a\u0019\u0010*\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000f¢\u0006\u0004\b*\u0010\u0012\"\u0017\u0010/\u001a\u00020\u00008\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.\"\u0015\u00102\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b0\u00101\"\u0015\u00105\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b3\u00104\"\u0015\u00107\u001a\u00020\u000f*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b6\u00104\"\u0015\u00109\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b8\u00101\"\u0015\u0010;\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b:\u00101\"\u0015\u0010=\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b<\u00101\"\u0015\u0010?\u001a\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b>\u00101¨\u0006@"}, d2 = {"Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "Lcom/scandit/datacapture/core/common/geometry/Point;", "pivot", "", "degrees", "rotatedDegrees", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Point;I)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "", "radians", "rotatedRadians", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Point;D)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;", "vector", "rotatedByVector", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Point;Lcom/scandit/datacapture/core/internal/sdk/common/geometry/Vector;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "", "scale", "scaled", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;F)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "point", "", "contains", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Point;)Z", "distance", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Point;)F", "boundingBox", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "orderVerticesByPosition", "Landroid/graphics/RectF;", "rectF", "Quadrilateral", "(Landroid/graphics/RectF;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "origin", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "size", "(Lcom/scandit/datacapture/core/common/geometry/Point;Lcom/scandit/datacapture/core/common/geometry/Size2;)Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "Landroid/graphics/Rect;", "boundingBoxRect", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Landroid/graphics/Rect;", "scaleFactor", "scaleCentered", "squared", "grow", "a", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "getQUADRILATERAL_ZERO", "()Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "QUADRILATERAL_ZERO", "getCenter", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)Lcom/scandit/datacapture/core/common/geometry/Point;", "center", "getWidth", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;)F", "width", "getHeight", "height", "getCenterLeft", "centerLeft", "getCenterRight", "centerRight", "getTopCenter", "topCenter", "getBottomCenter", "bottomCenter", "scandit-capture-core"}, k = 2, mv = {1, 9, 0})
/* loaded from: classes11.dex */
public final class QuadrilateralUtilsKt {

    /* renamed from: a, reason: collision with root package name */
    private static final Quadrilateral f125414a = new Quadrilateral(PointUtilsKt.getPOINT_ZERO(), PointUtilsKt.getPOINT_ZERO(), PointUtilsKt.getPOINT_ZERO(), PointUtilsKt.getPOINT_ZERO());

    public static final Quadrilateral Quadrilateral(RectF rectF) {
        Intrinsics.j(rectF, "rectF");
        return new Quadrilateral(new Point(rectF.left, rectF.top), new Point(rectF.right, rectF.top), new Point(rectF.right, rectF.bottom), new Point(rectF.left, rectF.bottom));
    }

    public static final Quadrilateral boundingBox(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        float fH = ComparisonsKt.h(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX());
        float fG = ComparisonsKt.g(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX());
        float fH2 = ComparisonsKt.h(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY());
        float fG2 = ComparisonsKt.g(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY());
        return new Quadrilateral(new Point(fH, fH2), new Point(fG, fH2), new Point(fG, fG2), new Point(fH, fG2));
    }

    public static final Rect boundingBoxRect(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        return new Rect((int) ComparisonsKt.h(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()), (int) ComparisonsKt.h(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()), (int) ComparisonsKt.g(quadrilateral.getTopLeft().getX(), quadrilateral.getTopRight().getX(), quadrilateral.getBottomRight().getX(), quadrilateral.getBottomLeft().getX()), (int) ComparisonsKt.g(quadrilateral.getTopLeft().getY(), quadrilateral.getTopRight().getY(), quadrilateral.getBottomRight().getY(), quadrilateral.getBottomLeft().getY()));
    }

    public static final boolean contains(Quadrilateral quadrilateral, Point point) {
        Intrinsics.j(quadrilateral, "<this>");
        Intrinsics.j(point, "point");
        return NativeQuadrilateralUtils.quadContains(quadrilateral, point);
    }

    public static final float distance(Quadrilateral quadrilateral, Point point) {
        Intrinsics.j(quadrilateral, "<this>");
        Intrinsics.j(point, "point");
        return NativeQuadrilateralUtils.quadDistance(quadrilateral, point);
    }

    public static final Point getBottomCenter(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        return PointExtensionsKt.div(PointExtensionsKt.plus(bottomLeft, bottomRight), 2.0f);
    }

    public static final Point getCenter(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Point pointQuadGetCenter = NativeQuadrilateralUtils.quadGetCenter(quadrilateral);
        Intrinsics.i(pointQuadGetCenter, "quadGetCenter(...)");
        return pointQuadGetCenter;
    }

    public static final Point getCenterLeft(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        return PointExtensionsKt.div(PointExtensionsKt.plus(topLeft, bottomLeft), 2.0f);
    }

    public static final Point getCenterRight(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        return PointExtensionsKt.div(PointExtensionsKt.plus(topRight, bottomRight), 2.0f);
    }

    public static final float getHeight(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        return NativeQuadrilateralUtils.quadGetHeight(quadrilateral);
    }

    public static final Quadrilateral getQUADRILATERAL_ZERO() {
        return f125414a;
    }

    public static final Point getTopCenter(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        return PointExtensionsKt.div(PointExtensionsKt.plus(topLeft, topRight), 2.0f);
    }

    public static final float getWidth(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        return NativeQuadrilateralUtils.quadGetWidth(quadrilateral);
    }

    public static final Quadrilateral grow(Quadrilateral quadrilateral, float f10) {
        Point pointIntersectionWithLineOf;
        Point pointIntersectionWithLineOf2;
        Point pointIntersectionWithLineOf3;
        Intrinsics.j(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Segment segmentMoveAlongNormal = SegmentKt.moveAlongNormal(new Segment(topLeft, topRight), f10);
        Point topRight2 = quadrilateral.getTopRight();
        Intrinsics.i(topRight2, "getTopRight(...)");
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        Segment segmentMoveAlongNormal2 = SegmentKt.moveAlongNormal(new Segment(topRight2, bottomRight), f10);
        Point bottomRight2 = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight2, "getBottomRight(...)");
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        Segment segmentMoveAlongNormal3 = SegmentKt.moveAlongNormal(new Segment(bottomRight2, bottomLeft), f10);
        Point bottomLeft2 = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft2, "getBottomLeft(...)");
        Point topLeft2 = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft2, "getTopLeft(...)");
        Segment segmentMoveAlongNormal4 = SegmentKt.moveAlongNormal(new Segment(bottomLeft2, topLeft2), f10);
        Point pointIntersectionWithLineOf4 = SegmentKt.intersectionWithLineOf(segmentMoveAlongNormal, segmentMoveAlongNormal4);
        return (pointIntersectionWithLineOf4 == null || (pointIntersectionWithLineOf = SegmentKt.intersectionWithLineOf(segmentMoveAlongNormal, segmentMoveAlongNormal2)) == null || (pointIntersectionWithLineOf2 = SegmentKt.intersectionWithLineOf(segmentMoveAlongNormal3, segmentMoveAlongNormal2)) == null || (pointIntersectionWithLineOf3 = SegmentKt.intersectionWithLineOf(segmentMoveAlongNormal3, segmentMoveAlongNormal4)) == null) ? quadrilateral : new Quadrilateral(pointIntersectionWithLineOf4, pointIntersectionWithLineOf, pointIntersectionWithLineOf2, pointIntersectionWithLineOf3);
    }

    public static final Quadrilateral orderVerticesByPosition(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Quadrilateral quadrilateralQuadOrderVerticesByPosition = NativeQuadrilateralUtils.quadOrderVerticesByPosition(quadrilateral);
        Intrinsics.i(quadrilateralQuadOrderVerticesByPosition, "quadOrderVerticesByPosition(...)");
        return quadrilateralQuadOrderVerticesByPosition;
    }

    public static final Quadrilateral rotatedByVector(Quadrilateral quadrilateral, Point pivot, Vector vector) {
        Intrinsics.j(quadrilateral, "<this>");
        Intrinsics.j(pivot, "pivot");
        Intrinsics.j(vector, "vector");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point pointRotatedByVector = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(topLeft, pivot, vector);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Point pointRotatedByVector2 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(topRight, pivot, vector);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        Point pointRotatedByVector3 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(bottomRight, pivot, vector);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        return new Quadrilateral(pointRotatedByVector, pointRotatedByVector2, pointRotatedByVector3, com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedByVector(bottomLeft, pivot, vector));
    }

    public static final Quadrilateral rotatedDegrees(Quadrilateral quadrilateral, Point pivot, int i10) {
        Intrinsics.j(quadrilateral, "<this>");
        Intrinsics.j(pivot, "pivot");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point pointRotatedDegrees = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(topLeft, pivot, i10);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Point pointRotatedDegrees2 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(topRight, pivot, i10);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        Point pointRotatedDegrees3 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(bottomRight, pivot, i10);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        return new Quadrilateral(pointRotatedDegrees, pointRotatedDegrees2, pointRotatedDegrees3, com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedDegrees(bottomLeft, pivot, i10));
    }

    public static final Quadrilateral rotatedRadians(Quadrilateral quadrilateral, Point pivot, double d10) {
        Intrinsics.j(quadrilateral, "<this>");
        Intrinsics.j(pivot, "pivot");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point pointRotatedRadians = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedRadians(topLeft, pivot, d10);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Point pointRotatedRadians2 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedRadians(topRight, pivot, d10);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        Point pointRotatedRadians3 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedRadians(bottomRight, pivot, d10);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        return new Quadrilateral(pointRotatedRadians, pointRotatedRadians2, pointRotatedRadians3, com.scandit.datacapture.core.common.geometry.PointUtilsKt.rotatedRadians(bottomLeft, pivot, d10));
    }

    public static final Quadrilateral scaleCentered(Quadrilateral quadrilateral, float f10) {
        Intrinsics.j(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point topLeft2 = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft2, "getTopLeft(...)");
        float f11 = f10 - 1.0f;
        Point pointPlus = PointExtensionsKt.plus(topLeft, PointExtensionsKt.times(PointExtensionsKt.minus(topLeft2, getCenter(quadrilateral)), f11));
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Point topRight2 = quadrilateral.getTopRight();
        Intrinsics.i(topRight2, "getTopRight(...)");
        Point pointPlus2 = PointExtensionsKt.plus(topRight, PointExtensionsKt.times(PointExtensionsKt.minus(topRight2, getCenter(quadrilateral)), f11));
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        Point bottomRight2 = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight2, "getBottomRight(...)");
        Point pointPlus3 = PointExtensionsKt.plus(bottomRight, PointExtensionsKt.times(PointExtensionsKt.minus(bottomRight2, getCenter(quadrilateral)), f11));
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        Point bottomLeft2 = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft2, "getBottomLeft(...)");
        return new Quadrilateral(pointPlus, pointPlus2, pointPlus3, PointExtensionsKt.plus(bottomLeft, PointExtensionsKt.times(PointExtensionsKt.minus(bottomLeft2, getCenter(quadrilateral)), f11)));
    }

    public static final Quadrilateral scaled(Quadrilateral quadrilateral, float f10) {
        Intrinsics.j(quadrilateral, "<this>");
        Point topLeft = quadrilateral.getTopLeft();
        Intrinsics.i(topLeft, "getTopLeft(...)");
        Point pointScaled = com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(topLeft, f10);
        Point topRight = quadrilateral.getTopRight();
        Intrinsics.i(topRight, "getTopRight(...)");
        Point pointScaled2 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(topRight, f10);
        Point bottomRight = quadrilateral.getBottomRight();
        Intrinsics.i(bottomRight, "getBottomRight(...)");
        Point pointScaled3 = com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(bottomRight, f10);
        Point bottomLeft = quadrilateral.getBottomLeft();
        Intrinsics.i(bottomLeft, "getBottomLeft(...)");
        return new Quadrilateral(pointScaled, pointScaled2, pointScaled3, com.scandit.datacapture.core.common.geometry.PointUtilsKt.scaled(bottomLeft, f10));
    }

    public static final Quadrilateral squared(Quadrilateral quadrilateral) {
        Intrinsics.j(quadrilateral, "<this>");
        Vector vector = new Vector(getCenterLeft(quadrilateral), getCenterRight(quadrilateral));
        Vector vector2 = new Vector(getTopCenter(quadrilateral), getBottomCenter(quadrilateral));
        float length = vector.getLength();
        float length2 = vector2.getLength();
        Point center = getCenter(quadrilateral);
        Point point = new Point(center.getX() - (length / 2.0f), center.getY() - (length2 / 2.0f));
        return rotatedByVector(new Quadrilateral(point, new Point(point.getX() + length, point.getY()), new Point(point.getX() + length, point.getY() + length2), new Point(point.getX(), point.getY() + length2)), center, vector);
    }

    public static final Quadrilateral Quadrilateral(Point origin, Size2 size) {
        Intrinsics.j(origin, "origin");
        Intrinsics.j(size, "size");
        return new Quadrilateral(new Point(origin.getX(), origin.getY()), new Point(size.getWidth() + origin.getX(), origin.getY()), new Point(size.getWidth() + origin.getX(), size.getHeight() + origin.getY()), new Point(origin.getX(), size.getHeight() + origin.getY()));
    }
}
