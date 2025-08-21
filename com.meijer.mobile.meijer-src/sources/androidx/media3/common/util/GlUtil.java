package androidx.media3.common.util;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLES20;
import android.opengl.GLU;
import android.opengl.Matrix;
import android.os.Build;
import d3.P;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;

/* loaded from: classes.dex */
public final class GlUtil {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f55624a = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f55625b = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* renamed from: c, reason: collision with root package name */
    private static final int[] f55626c = {12445, 13120, 12344, 12344};

    /* renamed from: d, reason: collision with root package name */
    private static final int[] f55627d = {12445, 13632, 12344, 12344};

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f55628e = {12344};

    public static FloatBuffer e(float[] fArr) {
        return (FloatBuffer) d(fArr.length).put(fArr).flip();
    }

    public static int g() throws GlException {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        b();
        return iArr[0];
    }

    private static boolean h(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static void k(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static final class GlException extends Exception {
        public GlException(String str) {
            super(str);
        }
    }

    public static void b() throws GlException {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new GlException(sb2.toString());
        }
    }

    public static void c(boolean z10, String str) throws GlException {
        if (!z10) {
            throw new GlException(str);
        }
    }

    private static FloatBuffer d(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static boolean i(Context context) {
        int i10 = P.f127888a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return h("EGL_EXT_protected_content");
        }
        return false;
    }

    public static boolean j() {
        return h("EGL_KHR_surfaceless_context");
    }

    public static void a(int i10, int i11, int i12) throws GlException {
        GLES20.glBindTexture(i10, i11);
        b();
        GLES20.glTexParameteri(i10, 10240, i12);
        b();
        GLES20.glTexParameteri(i10, 10241, i12);
        b();
        GLES20.glTexParameteri(i10, 10242, 33071);
        b();
        GLES20.glTexParameteri(i10, 10243, 33071);
        b();
    }

    public static int f() throws GlException {
        int iG = g();
        a(36197, iG, 9729);
        return iG;
    }
}
