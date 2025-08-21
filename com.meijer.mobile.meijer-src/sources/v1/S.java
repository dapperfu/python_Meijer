package v1;

import android.graphics.Paint;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0007¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lv1/S;", "", "<init>", "()V", "Landroid/graphics/Paint;", "paint", "", "text", "", "start", "end", "Landroid/graphics/Rect;", "rect", "", "a", "(Landroid/graphics/Paint;Ljava/lang/CharSequence;IILandroid/graphics/Rect;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class S {

    /* renamed from: a, reason: collision with root package name */
    public static final S f165388a = new S();

    private S() {
    }

    @JvmStatic
    public static final void a(Paint paint, CharSequence text, int start, int end, Rect rect) {
        paint.getTextBounds(text, start, end, rect);
    }
}
