package fsimpl;

import android.content.res.Resources;
import android.graphics.NinePatch;
import com.fullstory.jni.FSNative;
import java.lang.reflect.Field;

/* renamed from: fsimpl.cd, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
class C14131cd {

    /* renamed from: a, reason: collision with root package name */
    static final boolean f133157a;

    /* renamed from: b, reason: collision with root package name */
    private static final Class f133158b;

    /* renamed from: c, reason: collision with root package name */
    private static final Field f133159c;

    static {
        Field fieldA;
        if (FSNative.f65201b) {
            Class clsA = fT.a("android.graphics.drawable.NinePatchDrawable$NinePatchState");
            f133158b = clsA;
            fieldA = fT.a(clsA, "mNinePatch");
        } else {
            fieldA = null;
            f133158b = null;
        }
        f133159c = fieldA;
        f133157a = (f133158b == null || f133159c == null) ? false : true;
    }

    static void a(bV bVVar, Resources resources, Object obj, long j10) {
        try {
            NinePatch ninePatch = (NinePatch) f133159c.get(obj);
            if (ninePatch != null) {
                bX.a(bVVar, resources, ninePatch.getBitmap(), j10);
            }
        } catch (Throwable th2) {
        }
    }

    static boolean a(Object obj) {
        if (f133157a) {
            return f133158b.isInstance(obj);
        }
        return false;
    }
}
