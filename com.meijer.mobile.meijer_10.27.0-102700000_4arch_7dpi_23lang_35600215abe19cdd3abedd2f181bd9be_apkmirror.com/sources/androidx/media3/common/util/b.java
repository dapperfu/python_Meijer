package androidx.media3.common.util;

import android.opengl.GLES20;
import androidx.media3.common.util.GlUtil;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final int f55412a;

    /* renamed from: b, reason: collision with root package name */
    private final a[] f55413b;

    /* renamed from: c, reason: collision with root package name */
    private final C1122b[] f55414c;

    /* renamed from: d, reason: collision with root package name */
    private final Map<String, a> f55415d;

    /* renamed from: e, reason: collision with root package name */
    private final Map<String, C1122b> f55416e;

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
        public final String f55417a;

        /* renamed from: b, reason: collision with root package name */
        private final int f55418b;

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
            this.f55417a = str;
            this.f55418b = i10;
        }
    }

    /* renamed from: androidx.media3.common.util.b$b, reason: collision with other inner class name */
    private static final class C1122b {

        /* renamed from: a, reason: collision with root package name */
        public final String f55419a;

        /* renamed from: b, reason: collision with root package name */
        private final int f55420b;

        /* renamed from: c, reason: collision with root package name */
        private final int f55421c;

        /* renamed from: d, reason: collision with root package name */
        private final float[] f55422d = new float[16];

        /* renamed from: e, reason: collision with root package name */
        private final int[] f55423e = new int[4];

        /* renamed from: f, reason: collision with root package name */
        private int f55424f = 9729;

        public static C1122b a(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, b.h(bArr));
            return new C1122b(str, b.i(i10, str), iArr2[0]);
        }

        private C1122b(String str, int i10, int i11) {
            this.f55419a = str;
            this.f55420b = i10;
            this.f55421c = i11;
        }
    }

    private int g(String str) {
        return f(this.f55412a, str);
    }

    public int j(String str) {
        return i(this.f55412a, str);
    }

    public b(String str, String str2) throws GlUtil.GlException {
        boolean z10;
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f55412a = iGlCreateProgram;
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
        this.f55415d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f55413b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarA = a.a(this.f55412a, i10);
            this.f55413b[i10] = aVarA;
            this.f55415d.put(aVarA.f55417a, aVarA);
        }
        this.f55416e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f55412a, 35718, iArr3, 0);
        this.f55414c = new C1122b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            C1122b c1122bA = C1122b.a(this.f55412a, i11);
            this.f55414c[i11] = c1122bA;
            this.f55416e.put(c1122bA.f55419a, c1122bA);
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
