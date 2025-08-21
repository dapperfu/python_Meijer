package v1;

import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.fonts.Font;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J/\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ/\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u000f2\b\u0010\u000b\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0010\u0010\u0011JM\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lv1/H;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/NinePatch;", "patch", "Landroid/graphics/Rect;", "dst", "Landroid/graphics/Paint;", "paint", "", "b", "(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/Rect;Landroid/graphics/Paint;)V", "Landroid/graphics/RectF;", "c", "(Landroid/graphics/Canvas;Landroid/graphics/NinePatch;Landroid/graphics/RectF;Landroid/graphics/Paint;)V", "", "glyphIds", "", "glyphIdOffset", "", "positions", "positionOffset", "glyphCount", "Landroid/graphics/fonts/Font;", "font", "a", "(Landroid/graphics/Canvas;[II[FIILandroid/graphics/fonts/Font;Landroid/graphics/Paint;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17593H {

    /* renamed from: a, reason: collision with root package name */
    public static final C17593H f165358a = new C17593H();

    private C17593H() {
    }

    public final void a(Canvas canvas, int[] glyphIds, int glyphIdOffset, float[] positions, int positionOffset, int glyphCount, Font font, Paint paint) {
        canvas.drawGlyphs(glyphIds, glyphIdOffset, positions, positionOffset, glyphCount, font, paint);
    }

    public final void b(Canvas canvas, NinePatch patch, Rect dst, Paint paint) {
        canvas.drawPatch(patch, dst, paint);
    }

    public final void c(Canvas canvas, NinePatch patch, RectF dst, Paint paint) {
        canvas.drawPatch(patch, dst, paint);
    }
}
