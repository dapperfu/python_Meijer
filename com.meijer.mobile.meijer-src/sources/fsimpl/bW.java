package fsimpl;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.fullstory.jni.FSNative;
import java.lang.reflect.Field;

/* loaded from: classes15.dex */
class bW {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133045a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f133046b;

    /* renamed from: c, reason: collision with root package name */
    private static final Field f133047c;

    static {
        Field fieldA;
        if (FSNative.f65201b) {
            Class clsA = fT.a("android.graphics.drawable.BitmapDrawable$BitmapState");
            f133046b = clsA;
            fieldA = fT.a(30, clsA, "mBitmap");
        } else {
            fieldA = null;
            f133046b = null;
        }
        f133047c = fieldA;
        f133045a = (f133046b == null || f133047c == null) ? false : true;
    }

    static void a(bV bVVar, Resources resources, Object obj, long j10) {
        try {
            bX.a(bVVar, resources, (Bitmap) f133047c.get(obj), j10);
        } catch (Throwable th2) {
        }
    }

    static boolean a(Object obj) {
        if (f133045a) {
            return f133046b.isInstance(obj);
        }
        return false;
    }
}
