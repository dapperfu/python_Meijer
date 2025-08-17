package fsimpl;

import android.content.res.Resources;
import android.graphics.Bitmap;
import com.fullstory.jni.FSNative;
import java.lang.reflect.Field;

/* loaded from: classes14.dex */
class bW {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f131795a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f131796b;

    /* renamed from: c, reason: collision with root package name */
    private static final Field f131797c;

    static {
        Field fieldA;
        if (FSNative.f64361b) {
            Class clsA = fT.a("android.graphics.drawable.BitmapDrawable$BitmapState");
            f131796b = clsA;
            fieldA = fT.a(30, clsA, "mBitmap");
        } else {
            fieldA = null;
            f131796b = null;
        }
        f131797c = fieldA;
        f131795a = (f131796b == null || f131797c == null) ? false : true;
    }

    static void a(bV bVVar, Resources resources, Object obj, long j10) {
        try {
            bX.a(bVVar, resources, (Bitmap) f131797c.get(obj), j10);
        } catch (Throwable th2) {
        }
    }

    static boolean a(Object obj) {
        if (f131795a) {
            return f131796b.isInstance(obj);
        }
        return false;
    }
}
