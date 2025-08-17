package c2;

import android.graphics.BlendMode;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.os.Build;
import c2.C6349b;

/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final ThreadLocal<o2.d<Rect, Rect>> f61366a = new ThreadLocal<>();

    static class b {
        static void a(Paint paint, Object obj) {
            paint.setBlendMode((BlendMode) obj);
        }
    }

    static class a {
        static boolean a(Paint paint, String str) {
            return paint.hasGlyph(str);
        }
    }

    public static boolean b(Paint paint, EnumC6348a enumC6348a) {
        if (Build.VERSION.SDK_INT >= 29) {
            b.a(paint, enumC6348a != null ? C6349b.C1203b.a(enumC6348a) : null);
            return true;
        }
        if (enumC6348a == null) {
            paint.setXfermode(null);
            return true;
        }
        PorterDuff.Mode modeA = C6349b.a(enumC6348a);
        paint.setXfermode(modeA != null ? new PorterDuffXfermode(modeA) : null);
        return modeA != null;
    }

    public static boolean a(Paint paint, String str) {
        return a.a(paint, str);
    }
}
