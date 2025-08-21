package androidx.compose.ui.platform;

import V0.AbstractC5480m1;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\u001a?\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\t\u0010\n\u001a'\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a;\u0010\u0012\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0015\u001a\u00020\b*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016\u001a:\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u001a\u001a\u00020\u0002H\u0002ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001c\u001a;\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0004\b\u001e\u0010\u001f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"LV0/m1;", "outline", "", "x", "y", "LV0/q1;", "tmpTouchPointPath", "tmpOpPath", "", "b", "(LV0/m1;FFLV0/q1;LV0/q1;)Z", "Landroidx/compose/ui/geometry/Rect;", "rect", "e", "(Landroidx/compose/ui/geometry/Rect;FF)Z", "LV0/m1$c;", "touchPointPath", "opPath", "f", "(LV0/m1$c;FFLV0/q1;LV0/q1;)Z", "LU0/i;", "a", "(LU0/i;)Z", "LU0/a;", "cornerRadius", "centerX", "centerY", "g", "(FFJFF)Z", "path", "d", "(LV0/q1;FFLV0/q1;LV0/q1;)Z", "ui_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class C1 {
    private static final boolean g(float f10, float f11, long j10, float f12, float f13) {
        float f14 = f10 - f12;
        float f15 = f11 - f13;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & 4294967295L));
        return ((f14 * f14) / (fIntBitsToFloat * fIntBitsToFloat)) + ((f15 * f15) / (fIntBitsToFloat2 * fIntBitsToFloat2)) <= 1.0f;
    }

    public static final boolean b(AbstractC5480m1 abstractC5480m1, float f10, float f11, V0.q1 q1Var, V0.q1 q1Var2) {
        if (abstractC5480m1 instanceof AbstractC5480m1.b) {
            return e(((AbstractC5480m1.b) abstractC5480m1).b(), f10, f11);
        }
        if (abstractC5480m1 instanceof AbstractC5480m1.c) {
            return f((AbstractC5480m1.c) abstractC5480m1, f10, f11, q1Var, q1Var2);
        }
        if (abstractC5480m1 instanceof AbstractC5480m1.a) {
            return d(((AbstractC5480m1.a) abstractC5480m1).getPath(), f10, f11, q1Var, q1Var2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public static /* synthetic */ boolean c(AbstractC5480m1 abstractC5480m1, float f10, float f11, V0.q1 q1Var, V0.q1 q1Var2, int i10, Object obj) {
        if ((i10 & 8) != 0) {
            q1Var = null;
        }
        if ((i10 & 16) != 0) {
            q1Var2 = null;
        }
        return b(abstractC5480m1, f10, f11, q1Var, q1Var2);
    }

    private static final boolean d(V0.q1 q1Var, float f10, float f11, V0.q1 q1Var2, V0.q1 q1Var3) {
        Rect rect = new Rect(f10 - 0.005f, f11 - 0.005f, f10 + 0.005f, f11 + 0.005f);
        if (q1Var2 == null) {
            q1Var2 = V0.W.a();
        }
        V0.q1.n(q1Var2, rect, null, 2, null);
        if (q1Var3 == null) {
            q1Var3 = V0.W.a();
        }
        q1Var3.q(q1Var, q1Var2, V0.u1.INSTANCE.b());
        boolean zIsEmpty = q1Var3.isEmpty();
        q1Var3.reset();
        q1Var2.reset();
        return !zIsEmpty;
    }

    private static final boolean f(AbstractC5480m1.c cVar, float f10, float f11, V0.q1 q1Var, V0.q1 q1Var2) {
        U0.i roundRect = cVar.getRoundRect();
        if (f10 < roundRect.getLeft() || f10 >= roundRect.getRight() || f11 < roundRect.getTop() || f11 >= roundRect.getBottom()) {
            return false;
        }
        if (!a(roundRect)) {
            V0.q1 q1VarA = q1Var2 == null ? V0.W.a() : q1Var2;
            V0.q1.p(q1VarA, roundRect, null, 2, null);
            return d(q1VarA, f10, f11, q1Var, q1Var2);
        }
        float left = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() >> 32));
        float top = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopLeftCornerRadius() & 4294967295L));
        float right = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() >> 32));
        float top2 = roundRect.getTop() + Float.intBitsToFloat((int) (roundRect.getTopRightCornerRadius() & 4294967295L));
        float right2 = roundRect.getRight() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() >> 32));
        float bottom = roundRect.getBottom() - Float.intBitsToFloat((int) (roundRect.getBottomRightCornerRadius() & 4294967295L));
        float bottom2 = roundRect.getBottom() - Float.intBitsToFloat((int) (4294967295L & roundRect.getBottomLeftCornerRadius()));
        float left2 = roundRect.getLeft() + Float.intBitsToFloat((int) (roundRect.getBottomLeftCornerRadius() >> 32));
        if (f10 < left && f11 < top) {
            return g(f10, f11, roundRect.getTopLeftCornerRadius(), left, top);
        }
        if (f10 < left2 && f11 > bottom2) {
            return g(f10, f11, roundRect.getBottomLeftCornerRadius(), left2, bottom2);
        }
        if (f10 > right && f11 < top2) {
            return g(f10, f11, roundRect.getTopRightCornerRadius(), right, top2);
        }
        if (f10 <= right2 || f11 <= bottom) {
            return true;
        }
        return g(f10, f11, roundRect.getBottomRightCornerRadius(), right2, bottom);
    }

    private static final boolean a(U0.i iVar) {
        if (Float.intBitsToFloat((int) (iVar.getTopLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (iVar.getTopRightCornerRadius() >> 32)) <= iVar.j() && Float.intBitsToFloat((int) (iVar.getBottomLeftCornerRadius() >> 32)) + Float.intBitsToFloat((int) (iVar.getBottomRightCornerRadius() >> 32)) <= iVar.j() && Float.intBitsToFloat((int) (iVar.getTopLeftCornerRadius() & 4294967295L)) + Float.intBitsToFloat((int) (iVar.getBottomLeftCornerRadius() & 4294967295L)) <= iVar.d() && Float.intBitsToFloat((int) (iVar.getTopRightCornerRadius() & 4294967295L)) + Float.intBitsToFloat((int) (iVar.getBottomRightCornerRadius() & 4294967295L)) <= iVar.d()) {
            return true;
        }
        return false;
    }

    private static final boolean e(Rect rect, float f10, float f11) {
        if (rect.getLeft() <= f10 && f10 < rect.l() && rect.getTop() <= f11 && f11 < rect.i()) {
            return true;
        }
        return false;
    }
}
