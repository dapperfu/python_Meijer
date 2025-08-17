package E1;

import U0.j;
import V0.AbstractC5324i0;
import V0.AbstractC5337m1;
import V0.C5349s0;
import V0.Q;
import V0.SolidColor;
import V0.T;
import V0.W;
import V0.q1;
import V0.r1;
import V0.z1;
import X0.Stroke;
import X0.g;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Shader;
import androidx.compose.ui.geometry.Rect;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\u000f\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a>\u0010\u0018\u001a\u00020\u0003*\u00020\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\u0016H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0018\u0010\u0019\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001a"}, d2 = {"Landroid/graphics/Paint;", "LX0/g;", "value", "", "f", "(Landroid/graphics/Paint;LX0/g;)V", "LV0/m1;", "Landroid/graphics/Canvas;", "canvas", "paint", "", "xStart", "yCenter", "", "dir", "d", "(LV0/m1;Landroid/graphics/Canvas;Landroid/graphics/Paint;FFI)V", "LV0/i0;", "brush", "alpha", "LU0/k;", "size", "Lkotlin/Function0;", "draw", "e", "(Landroid/graphics/Paint;LV0/i0;FJLkotlin/jvm/functions/Function0;)V", "ui-text_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension
/* loaded from: classes.dex */
public final class a {
    /* JADX INFO: Access modifiers changed from: private */
    public static final void e(Paint paint, AbstractC5324i0 abstractC5324i0, float f10, long j10, Function0<Unit> function0) {
        Integer numValueOf = null;
        if (abstractC5324i0 == null) {
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            function0.invoke();
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (abstractC5324i0 instanceof SolidColor) {
            int color = paint.getColor();
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            paint.setColor(C5349s0.j(((SolidColor) abstractC5324i0).getValue()));
            function0.invoke();
            paint.setColor(color);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
                return;
            }
            return;
        }
        if (abstractC5324i0 instanceof z1) {
            Shader shader = paint.getShader();
            if (!Float.isNaN(f10)) {
                numValueOf = Integer.valueOf(paint.getAlpha());
                paint.setAlpha((int) Math.rint(f10 * 255.0f));
            }
            paint.setShader(((z1) abstractC5324i0).b(j10));
            function0.invoke();
            paint.setShader(shader);
            if (numValueOf != null) {
                paint.setAlpha(numValueOf.intValue());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(AbstractC5337m1 abstractC5337m1, Canvas canvas, Paint paint, float f10, float f11, int i10) {
        if (abstractC5337m1 instanceof AbstractC5337m1.a) {
            canvas.save();
            Rect rect = abstractC5337m1.getRect();
            canvas.translate(f10, f11 - ((rect.i() - rect.getTop()) / 2.0f));
            q1 path = ((AbstractC5337m1.a) abstractC5337m1).getPath();
            if (!(path instanceof Q)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            canvas.drawPath(((Q) path).getInternalPath(), paint);
            canvas.restore();
            return;
        }
        if (!(abstractC5337m1 instanceof AbstractC5337m1.c)) {
            if (abstractC5337m1 instanceof AbstractC5337m1.b) {
                AbstractC5337m1.b bVar = (AbstractC5337m1.b) abstractC5337m1;
                Rect rectB = bVar.b();
                float fI = f11 - ((rectB.i() - rectB.getTop()) / 2.0f);
                Rect rectB2 = bVar.b();
                float fL = f10 + (i10 * (rectB2.l() - rectB2.getLeft()));
                Rect rectB3 = bVar.b();
                canvas.drawRect(f10, fI, fL, f11 + ((rectB3.i() - rectB3.getTop()) / 2.0f), paint);
                return;
            }
            return;
        }
        AbstractC5337m1.c cVar = (AbstractC5337m1.c) abstractC5337m1;
        if (j.h(cVar.getRoundRect())) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.getRoundRect().getTopLeftCornerRadius() >> 32));
            canvas.drawRoundRect(f10, f11 - (cVar.getRoundRect().d() / 2.0f), (i10 * cVar.getRoundRect().j()) + f10, (cVar.getRoundRect().d() / 2.0f) + f11, fIntBitsToFloat, fIntBitsToFloat, paint);
            return;
        }
        q1 q1VarA = W.a();
        q1.p(q1VarA, cVar.getRoundRect(), null, 2, null);
        canvas.save();
        canvas.translate(f10, f11 - (cVar.getRoundRect().d() / 2.0f));
        if (!(q1VarA instanceof Q)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        canvas.drawPath(((Q) q1VarA).getInternalPath(), paint);
        canvas.restore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(Paint paint, g gVar) {
        if (Intrinsics.e(gVar, X0.j.f39072a)) {
            paint.setStyle(Paint.Style.FILL);
            return;
        }
        if (gVar instanceof Stroke) {
            paint.setStyle(Paint.Style.STROKE);
            Stroke stroke = (Stroke) gVar;
            paint.setStrokeWidth(stroke.getWidth());
            paint.setStrokeMiter(stroke.getMiter());
            paint.setStrokeCap(d.a(stroke.getCap()));
            paint.setStrokeJoin(d.b(stroke.getJoin()));
            r1 pathEffect = stroke.getPathEffect();
            paint.setPathEffect(pathEffect != null ? T.b(pathEffect) : null);
        }
    }
}
