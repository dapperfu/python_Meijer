package com.scandit.datacapture.core.internal.sdk.utils;

import com.scandit.datacapture.core.common.geometry.Anchor;
import com.scandit.datacapture.core.common.geometry.MeasureUnit;
import com.scandit.datacapture.core.common.geometry.Point;
import com.scandit.datacapture.core.common.geometry.PointWithUnit;
import com.scandit.datacapture.core.common.geometry.PointWithUnitUtilsKt;
import com.scandit.datacapture.core.common.geometry.Quadrilateral;
import com.scandit.datacapture.core.common.geometry.Size2;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import com.scandit.datacapture.core.internal.sdk.common.geometry.Size2UtilsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointExtensionsKt;
import com.scandit.datacapture.core.internal.sdk.extensions.PointWithUnitExtensionsKt;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J1\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/scandit/datacapture/core/internal/sdk/utils/ObjectOverlayUtils;", "", "<init>", "()V", "Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;", "objectPosition", "Lcom/scandit/datacapture/core/common/geometry/Size2;", "overlayViewSize", "Lcom/scandit/datacapture/core/common/geometry/Anchor;", "anchor", "Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;", "offset", "Lcom/scandit/datacapture/core/common/geometry/Point;", "getObjectOverlayPosition", "(Lcom/scandit/datacapture/core/common/geometry/Quadrilateral;Lcom/scandit/datacapture/core/common/geometry/Size2;Lcom/scandit/datacapture/core/common/geometry/Anchor;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;)Lcom/scandit/datacapture/core/common/geometry/Point;", "anchorPoint", "viewSize", "calculateViewTopLeft", "(Lcom/scandit/datacapture/core/common/geometry/Point;Lcom/scandit/datacapture/core/common/geometry/PointWithUnit;Lcom/scandit/datacapture/core/common/geometry/Size2;)Lcom/scandit/datacapture/core/common/geometry/Point;", "scandit-capture-core"}, k = 1, mv = {1, 9, 0})
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class ObjectOverlayUtils {

    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Anchor.values().length];
            try {
                iArr[Anchor.TOP_LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Anchor.TOP_CENTER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Anchor.TOP_RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Anchor.CENTER_LEFT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Anchor.CENTER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Anchor.CENTER_RIGHT.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Anchor.BOTTOM_LEFT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Anchor.BOTTOM_CENTER.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Anchor.BOTTOM_RIGHT.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private static Point a(Point... pointArr) {
        float y10 = 0.0f;
        float x10 = 0.0f;
        for (Point point : pointArr) {
            x10 += point.getX();
        }
        float length = x10 / pointArr.length;
        for (Point point2 : pointArr) {
            y10 += point2.getY();
        }
        return new Point(length, y10 / pointArr.length);
    }

    public static /* synthetic */ Point getObjectOverlayPosition$default(ObjectOverlayUtils objectOverlayUtils, Quadrilateral quadrilateral, Size2 size2, Anchor anchor, PointWithUnit pointWithUnit, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            anchor = Anchor.CENTER;
        }
        if ((i10 & 8) != 0) {
            pointWithUnit = PointWithUnitUtilsKt.PointWithUnit(0.0f, 0.0f, MeasureUnit.PIXEL);
        }
        return objectOverlayUtils.getObjectOverlayPosition(quadrilateral, size2, anchor, pointWithUnit);
    }

    public final Point calculateViewTopLeft(Point anchorPoint, PointWithUnit offset, Size2 viewSize) {
        Intrinsics.j(anchorPoint, "anchorPoint");
        Intrinsics.j(offset, "offset");
        Intrinsics.j(viewSize, "viewSize");
        return PointExtensionsKt.minus(PointExtensionsKt.plus(anchorPoint, PointWithUnitExtensionsKt.toPixels(offset, viewSize, AppAndroidEnvironment.INSTANCE.getApplicationContext().getResources().getDisplayMetrics().density)), Size2UtilsKt.getCenter(viewSize));
    }

    public final Point getObjectOverlayPosition(Quadrilateral objectPosition, Size2 overlayViewSize, Anchor anchor, PointWithUnit offset) {
        Point pointA;
        Intrinsics.j(objectPosition, "objectPosition");
        Intrinsics.j(overlayViewSize, "overlayViewSize");
        Intrinsics.j(anchor, "anchor");
        Intrinsics.j(offset, "offset");
        switch (WhenMappings.$EnumSwitchMapping$0[anchor.ordinal()]) {
            case 1:
                Point topLeft = objectPosition.getTopLeft();
                Intrinsics.i(topLeft, "getTopLeft(...)");
                pointA = a(topLeft);
                break;
            case 2:
                Point topLeft2 = objectPosition.getTopLeft();
                Intrinsics.i(topLeft2, "getTopLeft(...)");
                Point topRight = objectPosition.getTopRight();
                Intrinsics.i(topRight, "getTopRight(...)");
                pointA = a(topLeft2, topRight);
                break;
            case 3:
                Point topRight2 = objectPosition.getTopRight();
                Intrinsics.i(topRight2, "getTopRight(...)");
                pointA = a(topRight2);
                break;
            case 4:
                Point topLeft3 = objectPosition.getTopLeft();
                Intrinsics.i(topLeft3, "getTopLeft(...)");
                Point bottomLeft = objectPosition.getBottomLeft();
                Intrinsics.i(bottomLeft, "getBottomLeft(...)");
                pointA = a(topLeft3, bottomLeft);
                break;
            case 5:
                Point topRight3 = objectPosition.getTopRight();
                Intrinsics.i(topRight3, "getTopRight(...)");
                Point topLeft4 = objectPosition.getTopLeft();
                Intrinsics.i(topLeft4, "getTopLeft(...)");
                Point bottomLeft2 = objectPosition.getBottomLeft();
                Intrinsics.i(bottomLeft2, "getBottomLeft(...)");
                Point bottomRight = objectPosition.getBottomRight();
                Intrinsics.i(bottomRight, "getBottomRight(...)");
                pointA = a(topRight3, topLeft4, bottomLeft2, bottomRight);
                break;
            case 6:
                Point topRight4 = objectPosition.getTopRight();
                Intrinsics.i(topRight4, "getTopRight(...)");
                Point bottomRight2 = objectPosition.getBottomRight();
                Intrinsics.i(bottomRight2, "getBottomRight(...)");
                pointA = a(topRight4, bottomRight2);
                break;
            case 7:
                Point bottomLeft3 = objectPosition.getBottomLeft();
                Intrinsics.i(bottomLeft3, "getBottomLeft(...)");
                pointA = a(bottomLeft3);
                break;
            case 8:
                Point bottomLeft4 = objectPosition.getBottomLeft();
                Intrinsics.i(bottomLeft4, "getBottomLeft(...)");
                Point bottomRight3 = objectPosition.getBottomRight();
                Intrinsics.i(bottomRight3, "getBottomRight(...)");
                pointA = a(bottomLeft4, bottomRight3);
                break;
            case 9:
                Point bottomRight4 = objectPosition.getBottomRight();
                Intrinsics.i(bottomRight4, "getBottomRight(...)");
                pointA = a(bottomRight4);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        return calculateViewTopLeft(pointA, offset, overlayViewSize);
    }
}
