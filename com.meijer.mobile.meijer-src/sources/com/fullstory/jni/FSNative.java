package com.fullstory.jni;

import android.os.Build;
import com.fullstory.util.Log;
import fsimpl.eT;
import fsimpl.eU;
import fsimpl.eV;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/* loaded from: classes15.dex */
public class FSNative {

    /* renamed from: a, reason: collision with root package name */
    public static final boolean f65200a;

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f65201b;

    /* renamed from: c, reason: collision with root package name */
    private static final eT f65202c;

    /* renamed from: d, reason: collision with root package name */
    private static eV f65203d;

    static {
        eU eUVar;
        boolean z10 = Build.VERSION.SDK_INT < 30;
        f65200a = z10;
        f65201b = !z10;
        if (z10) {
            try {
                eUVar = new eU();
            } catch (Throwable th2) {
                Log.e("Unable to initialize Java hooks", th2);
            }
        } else {
            eUVar = null;
        }
        f65202c = eUVar;
        f65203d = null;
    }

    public static int a(FSNativeHooks fSNativeHooks) {
        if (!f65200a) {
            return jni_fs_standard_init(!Log.DISABLE_LOGGING);
        }
        if (f65203d == null) {
            eT eTVar = f65202c;
            if (eTVar == null) {
                return -5;
            }
            if (eTVar.a()) {
                return -6;
            }
            Method[] methodArr = eTVar.f133359a;
            Method[] methodArr2 = eTVar.f133360b;
            Class[] clsArr = eTVar.f133361c;
            eV eVVar = new eV();
            f65203d = eVVar;
            eVVar.f133363a = jni_fs_native_hook_init(eVVar, methodArr, methodArr2, clsArr, !Log.DISABLE_LOGGING);
        }
        f65203d.a(fSNativeHooks);
        if (fSNativeHooks == null) {
            return -1;
        }
        return f65203d.f133363a;
    }

    public static Field a(Class cls, String str) {
        if (cls == null || str == null) {
            return null;
        }
        return jni_fs_get_declared_field(cls, str);
    }

    public static Method a(Class cls, String str, Class... clsArr) {
        if (cls == null || str == null) {
            return null;
        }
        return jni_fs_get_declared_method(cls, str, clsArr);
    }

    public static boolean a() {
        try {
            System.loadLibrary("fs-native");
            return true;
        } catch (Throwable th2) {
            Log.e("Exception trying to load fs-native", th2);
            return false;
        }
    }

    private static native Field jni_fs_get_declared_field(Class cls, String str);

    private static native Method jni_fs_get_declared_method(Class cls, String str, Class[] clsArr);

    private static native int jni_fs_native_hook_init(Object obj, Object obj2, Object obj3, Object obj4, boolean z10);

    private static native int jni_fs_standard_init(boolean z10);

    private native int stub0();

    private native int stub1();

    private native int stub2();
}
