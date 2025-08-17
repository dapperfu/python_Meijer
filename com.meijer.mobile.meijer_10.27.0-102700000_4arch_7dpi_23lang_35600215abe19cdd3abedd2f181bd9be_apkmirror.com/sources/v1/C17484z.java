package v1;

import android.graphics.BlendMode;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.graphics.text.MeasuredText;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\bJ\u001d\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0014JM\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J=\u0010$\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020!2\u0006\u0010\u001a\u001a\u00020\u00152\u0006\u0010#\u001a\u00020!2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b$\u0010%J]\u00100\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020\u000e2\u0006\u0010)\u001a\u00020\u000e2\u0006\u0010*\u001a\u00020\u000e2\u0006\u0010+\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020\u00172\u0006\u0010-\u001a\u00020\u00172\u0006\u0010/\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b0\u00101J\u001d\u00104\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u00103\u001a\u000202¢\u0006\u0004\b4\u00105¨\u00066"}, d2 = {"Lv1/z;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "", "i", "(Landroid/graphics/Canvas;)V", "a", "", "color", "c", "(Landroid/graphics/Canvas;J)V", "", "Landroid/graphics/BlendMode;", "mode", "b", "(Landroid/graphics/Canvas;ILandroid/graphics/BlendMode;)V", "d", "(Landroid/graphics/Canvas;JLandroid/graphics/BlendMode;)V", "Landroid/graphics/RectF;", "outer", "", "outerRx", "outerRy", "inner", "innerRx", "innerRy", "Landroid/graphics/Paint;", "paint", "e", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;FFLandroid/graphics/RectF;FFLandroid/graphics/Paint;)V", "", "outerRadii", "innerRadii", "f", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;[FLandroid/graphics/RectF;[FLandroid/graphics/Paint;)V", "Landroid/graphics/text/MeasuredText;", "text", "start", "end", "contextStart", "contextEnd", "x", "y", "", "isRtl", "h", "(Landroid/graphics/Canvas;Landroid/graphics/text/MeasuredText;IIIIFFZLandroid/graphics/Paint;)V", "Landroid/graphics/RenderNode;", "renderNode", "g", "(Landroid/graphics/Canvas;Landroid/graphics/RenderNode;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v1.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17484z {

    /* renamed from: a, reason: collision with root package name */
    public static final C17484z f164415a = new C17484z();

    private C17484z() {
    }

    public final void a(Canvas canvas) {
        canvas.disableZ();
    }

    public final void b(Canvas canvas, int color, BlendMode mode) {
        canvas.drawColor(color, mode);
    }

    public final void c(Canvas canvas, long color) {
        canvas.drawColor(color);
    }

    public final void d(Canvas canvas, long color, BlendMode mode) {
        canvas.drawColor(color, mode);
    }

    public final void e(Canvas canvas, RectF outer, float outerRx, float outerRy, RectF inner, float innerRx, float innerRy, Paint paint) {
        canvas.drawDoubleRoundRect(outer, outerRx, outerRy, inner, innerRx, innerRy, paint);
    }

    public final void f(Canvas canvas, RectF outer, float[] outerRadii, RectF inner, float[] innerRadii, Paint paint) {
        canvas.drawDoubleRoundRect(outer, outerRadii, inner, innerRadii, paint);
    }

    public final void g(Canvas canvas, RenderNode renderNode) {
        canvas.drawRenderNode(renderNode);
    }

    public final void h(Canvas canvas, MeasuredText text, int start, int end, int contextStart, int contextEnd, float x10, float y10, boolean isRtl, Paint paint) {
        canvas.drawTextRun(text, start, end, contextStart, contextEnd, x10, y10, isRtl, paint);
    }

    public final void i(Canvas canvas) {
        canvas.enableZ();
    }
}
