package fsimpl;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.fullstory.jni.FSNative;
import java.lang.reflect.Field;

/* loaded from: classes14.dex */
class bZ {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f131808a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f131809b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f131810c;

    /* renamed from: d, reason: collision with root package name */
    private static final Field f131811d;

    /* renamed from: e, reason: collision with root package name */
    private static final Field f131812e;

    /* renamed from: f, reason: collision with root package name */
    private static final Field f131813f;

    static {
        Field fieldA;
        if (FSNative.f64361b) {
            Class clsA = fT.a("android.graphics.drawable.LayerDrawable$LayerState");
            f131809b = clsA;
            f131811d = fT.a(30, clsA, "mNumChildren");
            f131812e = fT.a(clsA, "mChildren");
            Class clsA2 = fT.a("android.graphics.drawable.LayerDrawable$ChildDrawable");
            f131810c = clsA2;
            fieldA = fT.a(clsA2, "mDrawable");
        } else {
            fieldA = null;
            f131809b = null;
            f131811d = null;
            f131812e = null;
            f131810c = null;
        }
        f131813f = fieldA;
        f131808a = (f131809b == null || f131811d == null || f131812e == null || f131810c == null || f131813f == null) ? false : true;
    }

    static void a(bV bVVar, Resources resources, Object obj, long j10) {
        try {
            int iIntValue = ((Integer) f131811d.get(obj)).intValue();
            Object[] objArr = (Object[]) f131812e.get(obj);
            for (int i10 = 0; i10 < iIntValue; i10++) {
                Object obj2 = objArr[i10];
                if (b(obj2)) {
                    try {
                        Drawable drawable = (Drawable) f131813f.get(obj2);
                        if (drawable instanceof BitmapDrawable) {
                            bX.a(bVVar, resources, ((BitmapDrawable) drawable).getBitmap(), -1L);
                        }
                    } catch (Throwable th2) {
                        return;
                    }
                }
            }
        } catch (Throwable th3) {
        }
    }

    static boolean a(Object obj) {
        if (f131808a) {
            return f131809b.isInstance(obj);
        }
        return false;
    }

    private static boolean b(Object obj) {
        if (f131808a) {
            return f131810c.isInstance(obj);
        }
        return false;
    }
}
