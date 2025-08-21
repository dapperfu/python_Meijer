package V0;

import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\u0007\u0010\b\u0082\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006\t"}, d2 = {"LV0/w0;", "", "<init>", "()V", "Landroid/graphics/ColorMatrixColorFilter;", "colorFilter", "LV0/t0;", "a", "(Landroid/graphics/ColorMatrixColorFilter;)[F", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: V0.w0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5500w0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C5500w0 f39410a = new C5500w0();

    public final float[] a(ColorMatrixColorFilter colorFilter) {
        ColorMatrix colorMatrix = new ColorMatrix();
        colorFilter.getColorMatrix(colorMatrix);
        return C5494t0.a(colorMatrix.getArray());
    }

    private C5500w0() {
    }
}
