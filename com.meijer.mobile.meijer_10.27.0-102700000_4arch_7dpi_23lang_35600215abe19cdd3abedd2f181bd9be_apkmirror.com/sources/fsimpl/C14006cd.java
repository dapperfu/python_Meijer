package fsimpl;

import android.content.res.Resources;
import android.graphics.NinePatch;
import com.fullstory.jni.FSNative;
import java.lang.reflect.Field;

/* renamed from: fsimpl.cd, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C14006cd {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f131907a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f131908b;

    /* renamed from: c, reason: collision with root package name */
    private static final Field f131909c;

    static {
        Field fieldA;
        if (FSNative.f64361b) {
            Class clsA = fT.a("android.graphics.drawable.NinePatchDrawable$NinePatchState");
            f131908b = clsA;
            fieldA = fT.a(clsA, "mNinePatch");
        } else {
            fieldA = null;
            f131908b = null;
        }
        f131909c = fieldA;
        f131907a = (f131908b == null || f131909c == null) ? false : true;
    }

    static void a(bV bVVar, Resources resources, Object obj, long j10) {
        try {
            NinePatch ninePatch = (NinePatch) f131909c.get(obj);
            if (ninePatch != null) {
                bX.a(bVVar, resources, ninePatch.getBitmap(), j10);
            }
        } catch (Throwable th2) {
        }
    }

    static boolean a(Object obj) {
        if (f131907a) {
            return f131908b.isInstance(obj);
        }
        return false;
    }
}
