package androidx.camera.core.impl.utils;

import android.view.Surface;

/* loaded from: classes.dex */
public class SurfaceUtil {

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public int f47466a = 0;

        /* renamed from: b, reason: collision with root package name */
        public int f47467b = 0;

        /* renamed from: c, reason: collision with root package name */
        public int f47468c = 0;
    }

    private static native int[] nativeGetSurfaceInfo(Surface surface);

    static {
        System.loadLibrary("surface_util_jni");
    }

    public static a a(Surface surface) {
        int[] iArrNativeGetSurfaceInfo = nativeGetSurfaceInfo(surface);
        a aVar = new a();
        aVar.f47466a = iArrNativeGetSurfaceInfo[0];
        aVar.f47467b = iArrNativeGetSurfaceInfo[1];
        aVar.f47468c = iArrNativeGetSurfaceInfo[2];
        return aVar;
    }
}
