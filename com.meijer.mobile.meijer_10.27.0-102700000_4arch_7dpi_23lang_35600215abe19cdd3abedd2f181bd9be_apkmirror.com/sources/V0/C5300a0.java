package V0;

import W0.AbstractC5391c;
import android.graphics.Bitmap;
import android.util.DisplayMetrics;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J:\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0001ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0010"}, d2 = {"LV0/a0;", "", "<init>", "()V", "", "width", "height", "LV0/g1;", "bitmapConfig", "", "hasAlpha", "LW0/c;", "colorSpace", "Landroid/graphics/Bitmap;", "a", "(IIIZLW0/c;)Landroid/graphics/Bitmap;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: V0.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5300a0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C5300a0 f36437a = new C5300a0();

    private C5300a0() {
    }

    @JvmStatic
    public static final Bitmap a(int width, int height, int bitmapConfig, boolean hasAlpha, AbstractC5391c colorSpace) {
        return Bitmap.createBitmap((DisplayMetrics) null, width, height, M.d(bitmapConfig), hasAlpha, F.a(colorSpace));
    }
}
