package v1;

import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ5\u0010\u0013\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e¢\u0006\u0004\b\u0013\u0010\u0014J5\u0010\u0016\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00152\u0006\u0010\u0010\u001a\u00020\u00152\u0006\u0010\u0011\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\u001d\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lv1/s;", "", "<init>", "()V", "Landroid/graphics/Canvas;", "canvas", "Landroid/graphics/RectF;", "rect", "", "e", "(Landroid/graphics/Canvas;Landroid/graphics/RectF;)Z", "Landroid/graphics/Rect;", "d", "(Landroid/graphics/Canvas;Landroid/graphics/Rect;)Z", "", "left", "top", "right", "bottom", "b", "(Landroid/graphics/Canvas;FFFF)Z", "", "c", "(Landroid/graphics/Canvas;IIII)Z", "Landroid/graphics/Path;", "path", "a", "(Landroid/graphics/Canvas;Landroid/graphics/Path;)Z", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: v1.s, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C17616s {

    /* renamed from: a, reason: collision with root package name */
    public static final C17616s f165448a = new C17616s();

    private C17616s() {
    }

    public final boolean a(Canvas canvas, Path path) {
        return canvas.clipOutPath(path);
    }

    public final boolean b(Canvas canvas, float left, float top, float right, float bottom) {
        return canvas.clipOutRect(left, top, right, bottom);
    }

    public final boolean c(Canvas canvas, int left, int top, int right, int bottom) {
        return canvas.clipOutRect(left, top, right, bottom);
    }

    public final boolean d(Canvas canvas, Rect rect) {
        return canvas.clipOutRect(rect);
    }

    public final boolean e(Canvas canvas, RectF rect) {
        return canvas.clipOutRect(rect);
    }
}
