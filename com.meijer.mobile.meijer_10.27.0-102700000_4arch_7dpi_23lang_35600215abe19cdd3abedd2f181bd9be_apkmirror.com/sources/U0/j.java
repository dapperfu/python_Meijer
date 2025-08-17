package U0;

import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000(\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a=\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\b\u0010\t\u001a8\u0010\f\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\f\u0010\r\u001a%\u0010\u0010\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0005\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a \u0010\u0012\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a@\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0014\u001a\u00020\n2\b\b\u0002\u0010\u0015\u001a\u00020\n2\b\b\u0002\u0010\u0016\u001a\u00020\n2\b\b\u0002\u0010\u0017\u001a\u00020\nø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\"\u0015\u0010\u001c\u001a\u00020\u000e*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b\"\u0015\u0010 \u001a\u00020\u001d*\u00020\u00078F¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006!"}, d2 = {"", "left", "top", "right", "bottom", "radiusX", "radiusY", "LU0/i;", "a", "(FFFFFF)LU0/i;", "LU0/a;", "cornerRadius", "e", "(FFFFJ)LU0/i;", "Landroidx/compose/ui/geometry/Rect;", "rect", "b", "(Landroidx/compose/ui/geometry/Rect;FF)LU0/i;", "f", "(Landroidx/compose/ui/geometry/Rect;J)LU0/i;", "topLeft", "topRight", "bottomRight", "bottomLeft", "c", "(Landroidx/compose/ui/geometry/Rect;JJJJ)LU0/i;", "g", "(LU0/i;)Landroidx/compose/ui/geometry/Rect;", "boundingRect", "", "h", "(LU0/i;)Z", "isSimple", "ui-geometry_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class j {
    public static final i c(Rect rect, long j10, long j11, long j12, long j13) {
        return new i(rect.getLeft(), rect.getTop(), rect.l(), rect.i(), j10, j11, j12, j13, null);
    }

    public static final i e(float f10, float f11, float f12, float f13, long j10) {
        return a(f10, f11, f12, f13, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final i f(Rect rect, long j10) {
        return b(rect, Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
    }

    public static final Rect g(i iVar) {
        return new Rect(iVar.getLeft(), iVar.getTop(), iVar.getRight(), iVar.getBottom());
    }

    public static final i a(float f10, float f11, float f12, float f13, float f14, float f15) {
        long jB = a.b((Float.floatToRawIntBits(f14) << 32) | (Float.floatToRawIntBits(f15) & 4294967295L));
        return new i(f10, f11, f12, f13, jB, jB, jB, jB, null);
    }

    public static final i b(Rect rect, float f10, float f11) {
        return a(rect.getLeft(), rect.getTop(), rect.l(), rect.i(), f10, f11);
    }

    public static final boolean h(i iVar) {
        long topLeftCornerRadius = iVar.getTopLeftCornerRadius();
        if ((topLeftCornerRadius >>> 32) == (topLeftCornerRadius & 4294967295L) && iVar.getTopLeftCornerRadius() == iVar.getTopRightCornerRadius() && iVar.getTopLeftCornerRadius() == iVar.getBottomRightCornerRadius() && iVar.getTopLeftCornerRadius() == iVar.getBottomLeftCornerRadius()) {
            return true;
        }
        return false;
    }
}
