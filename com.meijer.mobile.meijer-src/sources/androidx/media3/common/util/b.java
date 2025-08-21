package androidx.media3.common.util;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f55636a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f55637b;

    /* renamed from: c, reason: collision with root package name */
    private final C1135b[] f55638c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f55639d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, C1135b> f55640e;

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f55641a;

        /* renamed from: b, reason: collision with root package name */
        private final int f55642b;

        public static a a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new a(str, b.f(i10, str));
        }

        private a(String str, int i10) {
            this.f55641a = str;
            this.f55642b = i10;
        }
    }

    /* renamed from: androidx.media3.common.util.b$b, reason: collision with other inner class name */
    private static final class C1135b {

        /* renamed from: a, reason: collision with root package name */
        public final String f55643a;

        /* renamed from: b, reason: collision with root package name */
        private final int f55644b;

        /* renamed from: c, reason: collision with root package name */
        private final int f55645c;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f55646d = new float[16];

        /* renamed from: e, reason: collision with root package name */
        private final int[] f55647e = new int[4];

        /* renamed from: f, reason: collision with root package name */
        private int f55648f = 9729;

        public static C1135b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C1135b(str, b.i(i10, str), iArr2[0]);
        }

        private C1135b(String str, int i10, int i11) {
            this.f55643a = str;
            this.f55644b = i10;
            this.f55645c = i11;
        }
    }

    private int g(String str) {
        return f(this.f55636a, str);
    }

    public int j(String str) {
        return i(this.f55636a, str);
    }

    public b(String str, String str2) throws GlUtil.GlException {
        boolean z10;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f55636a = iGlCreateProgram;
        GlUtil.b();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        if (iArr[0] == 1) {
            z10 = true;
        } else {
            z10 = false;
        }
        GlUtil.c(z10, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f55639d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f55637b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f55636a, i10);
            this.f55637b[i10] = aVarA;
            this.f55639d.put(aVarA.f55641a, aVarA);
        }
        this.f55640e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f55636a, 35718, iArr3, 0);
        this.f55638c = new C1135b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            C1135b c1135bA = C1135b.a(this.f55636a, i11);
            this.f55638c[i11] = c1135bA;
            this.f55640e.put(c1135bA.f55643a, c1135bA);
        }
        GlUtil.b();
    }

    private static void d(int i10, int i11, String str) throws GlUtil.GlException {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        boolean z10 = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z10 = true;
        }
        GlUtil.c(z10, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        GlUtil.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int f(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int i(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public int e(String str) throws GlUtil.GlException {
        int iG = g(str);
        GLES20.glEnableVertexAttribArray(iG);
        GlUtil.b();
        return iG;
    }
}
