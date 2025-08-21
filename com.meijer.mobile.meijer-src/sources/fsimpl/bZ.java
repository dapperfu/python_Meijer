package fsimpl;

import android.content.res.Resources;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.fullstory.jni.FSNative;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
class bZ {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133058a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f133059b;

    /* renamed from: c, reason: collision with root package name */
    private static final Class f133060c;

    /* renamed from: d, reason: collision with root package name */
    private static final Field f133061d;

    /* renamed from: e, reason: collision with root package name */
    private static final Field f133062e;

    /* renamed from: f, reason: collision with root package name */
    private static final Field f133063f;

    static {
        Field fieldA;
        if (FSNative.f65201b) {
            Class clsA = fT.a("android.graphics.drawable.LayerDrawable$LayerState");
            f133059b = clsA;
            f133061d = fT.a(30, clsA, "mNumChildren");
            f133062e = fT.a(clsA, "mChildren");
            Class clsA2 = fT.a("android.graphics.drawable.LayerDrawable$ChildDrawable");
            f133060c = clsA2;
            fieldA = fT.a(clsA2, "mDrawable");
        } else {
            fieldA = null;
            f133059b = null;
            f133061d = null;
            f133062e = null;
            f133060c = null;
        }
        f133063f = fieldA;
        f133058a = (f133059b == null || f133061d == null || f133062e == null || f133060c == null || f133063f == null) ? false : true;
    }

    static void a(bV bVVar, Resources resources, Object obj, long j10) {
        try {
            int iIntValue = ((Integer) f133061d.get(obj)).intValue();
            Object[] objArr = (Object[]) f133062e.get(obj);
            for (int i10 = 0; i10 < iIntValue; i10++) {
                Object obj2 = objArr[i10];
                if (b(obj2)) {
                    try {
                        Drawable drawable = (Drawable) f133063f.get(obj2);
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
        if (f133058a) {
            return f133059b.isInstance(obj);
        }
        return false;
    }

    private static boolean b(Object obj) {
        if (f133058a) {
            return f133060c.isInstance(obj);
        }
        return false;
    }
}
