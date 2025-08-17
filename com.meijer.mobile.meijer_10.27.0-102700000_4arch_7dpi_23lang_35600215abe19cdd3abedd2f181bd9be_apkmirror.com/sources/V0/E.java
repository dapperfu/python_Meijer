package V0;

import android.graphics.ColorFilter;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a&\u0010\t\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001e\u0010\r\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0010\u001a\u00020\u000b2\n\u0010\u000f\u001a\u00060\u0001j\u0002`\bH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u000f\u0010\u0013\u001a\u00020\u0012H\u0000¢\u0006\u0004\b\u0013\u0010\u0014*\f\b\u0000\u0010\u0015\"\u00020\u00012\u00020\u0001\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"LV0/r0;", "Landroid/graphics/ColorFilter;", "d", "(LV0/r0;)Landroid/graphics/ColorFilter;", "LV0/q0;", "color", "LV0/c0;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "c", "(JI)Landroid/graphics/ColorFilter;", "LV0/t0;", "colorMatrix", "a", "([F)Landroid/graphics/ColorFilter;", "filter", "b", "(Landroid/graphics/ColorFilter;)[F", "", "e", "()Z", "NativeColorFilter", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class E {
    public static final ColorFilter a(float[] fArr) {
        return new ColorMatrixColorFilter(fArr);
    }

    public static final float[] b(ColorFilter colorFilter) {
        if ((colorFilter instanceof ColorMatrixColorFilter) && e()) {
            return C5357w0.f36550a.a((ColorMatrixColorFilter) colorFilter);
        }
        throw new IllegalArgumentException("Unable to obtain ColorMatrix from Android ColorMatrixColorFilter. This method was invoked on an unsupported Android version");
    }

    public static final ColorFilter c(long j10, int i10) {
        return Build.VERSION.SDK_INT >= 29 ? C5318g0.f36480a.a(j10, i10) : new PorterDuffColorFilter(C5349s0.j(j10), D.b(i10));
    }

    public static final boolean e() {
        return 26 <= Build.VERSION.SDK_INT;
    }

    public static final ColorFilter d(C5347r0 c5347r0) {
        return c5347r0.getNativeColorFilter();
    }
}
