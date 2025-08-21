package androidx.compose.ui.layout;

import androidx.compose.ui.geometry.Rect;
import androidx.compose.ui.node.NodeCoordinator;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0007\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\t\u0010\b\u001a\u0011\u0010\n\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\n\u0010\u0003\u001a\u0011\u0010\u000b\u001a\u00020\u0006*\u00020\u0000¢\u0006\u0004\b\u000b\u0010\b\u001a\u0011\u0010\f\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/compose/ui/layout/LayoutCoordinates;", "LU0/f;", "e", "(Landroidx/compose/ui/layout/LayoutCoordinates;)J", "f", "g", "Landroidx/compose/ui/geometry/Rect;", "a", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/geometry/Rect;", "b", "d", "boundsInParent", "c", "(Landroidx/compose/ui/layout/LayoutCoordinates;)Landroidx/compose/ui/layout/LayoutCoordinates;", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class LayoutCoordinatesKt {
    public static final long e(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.r0(U0.f.INSTANCE.c());
    }

    public static final long f(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.X(U0.f.INSTANCE.c());
    }

    public static final long g(LayoutCoordinates layoutCoordinates) {
        return layoutCoordinates.s(U0.f.INSTANCE.c());
    }

    public static final Rect a(LayoutCoordinates layoutCoordinates) {
        return LayoutCoordinates.I(c(layoutCoordinates), layoutCoordinates, false, 2, null);
    }

    public static final Rect b(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesC = c(layoutCoordinates);
        float fC = (int) (layoutCoordinatesC.c() >> 32);
        float fC2 = (int) (layoutCoordinatesC.c() & 4294967295L);
        Rect rectI = LayoutCoordinates.I(layoutCoordinatesC, layoutCoordinates, false, 2, null);
        float left = rectI.getLeft();
        float f10 = 0.0f;
        if (left < 0.0f) {
            left = 0.0f;
        }
        if (left > fC) {
            left = fC;
        }
        float top = rectI.getTop();
        if (top < 0.0f) {
            top = 0.0f;
        }
        if (top > fC2) {
            top = fC2;
        }
        float fL = rectI.l();
        if (fL < 0.0f) {
            fL = 0.0f;
        }
        if (fL <= fC) {
            fC = fL;
        }
        float fI = rectI.i();
        if (fI >= 0.0f) {
            f10 = fI;
        }
        if (f10 <= fC2) {
            fC2 = f10;
        }
        if (left == fC || top == fC2) {
            return Rect.INSTANCE.a();
        }
        long jX = layoutCoordinatesC.X(U0.f.e((Float.floatToRawIntBits(left) << 32) | (Float.floatToRawIntBits(top) & 4294967295L)));
        long jX2 = layoutCoordinatesC.X(U0.f.e((Float.floatToRawIntBits(top) & 4294967295L) | (Float.floatToRawIntBits(fC) << 32)));
        long jX3 = layoutCoordinatesC.X(U0.f.e((Float.floatToRawIntBits(fC) << 32) | (Float.floatToRawIntBits(fC2) & 4294967295L)));
        long jX4 = layoutCoordinatesC.X(U0.f.e((Float.floatToRawIntBits(fC2) & 4294967295L) | (Float.floatToRawIntBits(left) << 32)));
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jX >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jX2 >> 32));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jX4 >> 32));
        float fIntBitsToFloat4 = Float.intBitsToFloat((int) (jX3 >> 32));
        float fMin = Math.min(fIntBitsToFloat, Math.min(fIntBitsToFloat2, Math.min(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fMax = Math.max(fIntBitsToFloat, Math.max(fIntBitsToFloat2, Math.max(fIntBitsToFloat3, fIntBitsToFloat4)));
        float fIntBitsToFloat5 = Float.intBitsToFloat((int) (jX & 4294967295L));
        float fIntBitsToFloat6 = Float.intBitsToFloat((int) (jX2 & 4294967295L));
        float fIntBitsToFloat7 = Float.intBitsToFloat((int) (jX4 & 4294967295L));
        float fIntBitsToFloat8 = Float.intBitsToFloat((int) (jX3 & 4294967295L));
        return new Rect(fMin, Math.min(fIntBitsToFloat5, Math.min(fIntBitsToFloat6, Math.min(fIntBitsToFloat7, fIntBitsToFloat8))), fMax, Math.max(fIntBitsToFloat5, Math.max(fIntBitsToFloat6, Math.max(fIntBitsToFloat7, fIntBitsToFloat8))));
    }

    public static final Rect boundsInParent(LayoutCoordinates layoutCoordinates) {
        Rect rectI;
        LayoutCoordinates layoutCoordinatesN0 = layoutCoordinates.n0();
        if (layoutCoordinatesN0 != null && (rectI = LayoutCoordinates.I(layoutCoordinatesN0, layoutCoordinates, false, 2, null)) != null) {
            return rectI;
        }
        return new Rect(0.0f, 0.0f, (int) (layoutCoordinates.c() >> 32), (int) (layoutCoordinates.c() & 4294967295L));
    }

    public static final LayoutCoordinates c(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinates2;
        NodeCoordinator nodeCoordinator;
        LayoutCoordinates layoutCoordinatesN0 = layoutCoordinates.n0();
        while (true) {
            LayoutCoordinates layoutCoordinates3 = layoutCoordinatesN0;
            layoutCoordinates2 = layoutCoordinates;
            layoutCoordinates = layoutCoordinates3;
            if (layoutCoordinates == null) {
                break;
            }
            layoutCoordinatesN0 = layoutCoordinates.n0();
        }
        if (layoutCoordinates2 instanceof NodeCoordinator) {
            nodeCoordinator = (NodeCoordinator) layoutCoordinates2;
        } else {
            nodeCoordinator = null;
        }
        if (nodeCoordinator == null) {
            return layoutCoordinates2;
        }
        NodeCoordinator wrappedBy = nodeCoordinator.getWrappedBy();
        while (true) {
            NodeCoordinator nodeCoordinator2 = wrappedBy;
            NodeCoordinator nodeCoordinator3 = nodeCoordinator;
            nodeCoordinator = nodeCoordinator2;
            if (nodeCoordinator != null) {
                wrappedBy = nodeCoordinator.getWrappedBy();
            } else {
                return nodeCoordinator3;
            }
        }
    }

    public static final long d(LayoutCoordinates layoutCoordinates) {
        LayoutCoordinates layoutCoordinatesN0 = layoutCoordinates.n0();
        if (layoutCoordinatesN0 != null) {
            return layoutCoordinatesN0.J(layoutCoordinates, U0.f.INSTANCE.c());
        }
        return U0.f.INSTANCE.c();
    }
}
