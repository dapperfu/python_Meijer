package V0;

import V0.C5462g1;
import W0.AbstractC5526c;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.DisplayMetrics;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a:\u0010\r\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0000ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a\u0011\u0010\u000f\u001a\u00020\u0000*\u00020\u0001¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0016\u0010\u0012\u001a\u00020\u0011*\u00020\u0007H\u0000ø\u0001\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0013\u0010\u0014\u001a\u00020\u0007*\u00020\u0011H\u0000¢\u0006\u0004\b\u0014\u0010\u0015\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0016"}, d2 = {"Landroid/graphics/Bitmap;", "LV0/f1;", "c", "(Landroid/graphics/Bitmap;)LV0/f1;", "", "width", "height", "LV0/g1;", "config", "", "hasAlpha", "LW0/c;", "colorSpace", "a", "(IIIZLW0/c;)LV0/f1;", "b", "(LV0/f1;)Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap$Config;", "d", "(I)Landroid/graphics/Bitmap$Config;", "e", "(Landroid/graphics/Bitmap$Config;)I", "ui-graphics_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class M {
    public static final Bitmap b(InterfaceC5459f1 interfaceC5459f1) {
        if (interfaceC5459f1 instanceof J) {
            return ((J) interfaceC5459f1).getBitmap();
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Bitmap");
    }

    public static final InterfaceC5459f1 c(Bitmap bitmap) {
        return new J(bitmap);
    }

    public static final Bitmap.Config d(int i10) {
        C5462g1.Companion companion = C5462g1.INSTANCE;
        if (C5462g1.i(i10, companion.b())) {
            return Bitmap.Config.ARGB_8888;
        }
        if (C5462g1.i(i10, companion.a())) {
            return Bitmap.Config.ALPHA_8;
        }
        if (C5462g1.i(i10, companion.e())) {
            return Bitmap.Config.RGB_565;
        }
        int i11 = Build.VERSION.SDK_INT;
        return (i11 < 26 || !C5462g1.i(i10, companion.c())) ? (i11 < 26 || !C5462g1.i(i10, companion.d())) ? Bitmap.Config.ARGB_8888 : Bitmap.Config.HARDWARE : Bitmap.Config.RGBA_F16;
    }

    public static final int e(Bitmap.Config config) {
        if (config == Bitmap.Config.ALPHA_8) {
            return C5462g1.INSTANCE.a();
        }
        if (config == Bitmap.Config.RGB_565) {
            return C5462g1.INSTANCE.e();
        }
        if (config == Bitmap.Config.ARGB_4444) {
            return C5462g1.INSTANCE.b();
        }
        int i10 = Build.VERSION.SDK_INT;
        return (i10 < 26 || config != Bitmap.Config.RGBA_F16) ? (i10 < 26 || config != Bitmap.Config.HARDWARE) ? C5462g1.INSTANCE.b() : C5462g1.INSTANCE.d() : C5462g1.INSTANCE.c();
    }

    public static final InterfaceC5459f1 a(int i10, int i11, int i12, boolean z10, AbstractC5526c abstractC5526c) {
        Bitmap bitmapCreateBitmap;
        Bitmap.Config configD = d(i12);
        if (Build.VERSION.SDK_INT >= 26) {
            bitmapCreateBitmap = C5443a0.a(i10, i11, i12, z10, abstractC5526c);
        } else {
            bitmapCreateBitmap = Bitmap.createBitmap((DisplayMetrics) null, i10, i11, configD);
            bitmapCreateBitmap.setHasAlpha(z10);
        }
        return new J(bitmapCreateBitmap);
    }
}
