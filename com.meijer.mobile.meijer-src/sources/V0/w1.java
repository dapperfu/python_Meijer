package V0;

import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Deprecated;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0004*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0011\u0010\u0007\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u0007\u0010\b\u001a\u0011\u0010\t\u001a\u00020\u0000*\u00020\u0004¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\f\u001a\u00020\u0001*\u00020\u000b¢\u0006\u0004\b\f\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u000b*\u00020\u0001¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/geometry/Rect;", "Landroid/graphics/Rect;", "b", "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/Rect;", "Landroid/graphics/RectF;", "c", "(Landroidx/compose/ui/geometry/Rect;)Landroid/graphics/RectF;", "e", "(Landroid/graphics/Rect;)Landroidx/compose/ui/geometry/Rect;", "f", "(Landroid/graphics/RectF;)Landroidx/compose/ui/geometry/Rect;", "LH1/p;", "a", "(LH1/p;)Landroid/graphics/Rect;", "d", "(Landroid/graphics/Rect;)LH1/p;", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w1 {
    public static final Rect a(H1.p pVar) {
        return new Rect(pVar.getLeft(), pVar.getTop(), pVar.getRight(), pVar.getBottom());
    }

    @Deprecated
    public static final Rect b(androidx.compose.ui.geometry.Rect rect) {
        return new Rect((int) rect.getLeft(), (int) rect.getTop(), (int) rect.l(), (int) rect.i());
    }

    public static final RectF c(androidx.compose.ui.geometry.Rect rect) {
        return new RectF(rect.getLeft(), rect.getTop(), rect.l(), rect.i());
    }

    public static final H1.p d(Rect rect) {
        return new H1.p(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect e(Rect rect) {
        return new androidx.compose.ui.geometry.Rect(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static final androidx.compose.ui.geometry.Rect f(RectF rectF) {
        return new androidx.compose.ui.geometry.Rect(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}
