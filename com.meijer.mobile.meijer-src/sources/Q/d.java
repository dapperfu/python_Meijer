package Q;

import C.C3037w;
import C.P;
import O.C;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import com.fullstory.FS;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import o2.i;

/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f27368a = {12344};

    /* renamed from: b, reason: collision with root package name */
    public static final int[] f27369b = {12445, 13632, 12344};

    /* renamed from: c, reason: collision with root package name */
    public static final String f27370c;

    /* renamed from: d, reason: collision with root package name */
    public static final String f27371d;

    /* renamed from: e, reason: collision with root package name */
    private static final C f27372e;

    /* renamed from: f, reason: collision with root package name */
    private static final C f27373f;

    /* renamed from: g, reason: collision with root package name */
    private static final C f27374g;

    /* renamed from: h, reason: collision with root package name */
    public static final float[] f27375h;

    /* renamed from: i, reason: collision with root package name */
    public static final FloatBuffer f27376i;

    /* renamed from: j, reason: collision with root package name */
    public static final float[] f27377j;

    /* renamed from: k, reason: collision with root package name */
    public static final FloatBuffer f27378k;

    /* renamed from: l, reason: collision with root package name */
    public static final Q.g f27379l;

    class a implements C {
        @Override // O.C
        public String a(String str, String str2) {
            return String.format(Locale.US, "#extension GL_OES_EGL_image_external : require\nprecision mediump float;\nvarying vec2 %s;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nvoid main() {\n    vec4 src = texture2D(%s, %s);\n    gl_FragColor = vec4(src.rgb, src.a * uAlphaScale);\n}\n", str2, str, str, str2);
        }

        a() {
        }
    }

    class b implements C {
        @Override // O.C
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_OES_EGL_image_external_essl3 : require\nprecision mediump float;\nuniform samplerExternalOES %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvoid main() {\n  vec4 src = texture(%s, %s);\n  outColor = vec4(src.rgb, src.a * uAlphaScale);\n}", str, str2, str, str2);
        }

        b() {
        }
    }

    class c implements C {
        @Override // O.C
        public String a(String str, String str2) {
            return String.format(Locale.US, "#version 300 es\n#extension GL_EXT_YUV_target : require\nprecision mediump float;\nuniform __samplerExternal2DY2YEXT %s;\nuniform float uAlphaScale;\nin vec2 %s;\nout vec4 outColor;\n\nvec3 yuvToRgb(vec3 yuv) {\n  const vec3 yuvOffset = vec3(0.0625, 0.5, 0.5);\n  const mat3 yuvToRgbColorMat = mat3(\n    1.1689f, 1.1689f, 1.1689f,\n    0.0000f, -0.1881f, 2.1502f,\n    1.6853f, -0.6530f, 0.0000f\n  );\n  return clamp(yuvToRgbColorMat * (yuv - yuvOffset), 0.0, 1.0);\n}\n\nvoid main() {\n  vec3 srcYuv = texture(%s, %s).xyz;\n  vec3 srcRgb = yuvToRgb(srcYuv);\n  outColor = vec4(srcRgb, uAlphaScale);\n}", str, str2, str, str2);
        }

        c() {
        }
    }

    /* renamed from: Q.d$d, reason: collision with other inner class name */
    public static class C0505d extends f {
        public C0505d() {
            super("uniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n}\n", "precision mediump float;\nuniform float uAlphaScale;\nvoid main() {\n    gl_FragColor = vec4(0.0, 0.0, 0.0, uAlphaScale);\n}\n");
        }
    }

    public enum e {
        UNKNOWN,
        DEFAULT,
        YUV
    }

    public static abstract class f {

        /* renamed from: a, reason: collision with root package name */
        protected int f27384a;

        /* renamed from: b, reason: collision with root package name */
        protected int f27385b = -1;

        /* renamed from: c, reason: collision with root package name */
        protected int f27386c = -1;

        /* renamed from: d, reason: collision with root package name */
        protected int f27387d = -1;

        /* JADX WARN: Removed duplicated region for block: B:32:0x0078  */
        /* JADX WARN: Removed duplicated region for block: B:34:0x007d  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0082  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        protected f(java.lang.String r7, java.lang.String r8) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.String r0 = "glAttachShader"
                r6.<init>()
                r1 = -1
                r6.f27385b = r1
                r6.f27386c = r1
                r6.f27387d = r1
                r2 = 35633(0x8b31, float:4.9932E-41)
                int r7 = Q.d.y(r2, r7)     // Catch: java.lang.IllegalArgumentException -> L70 java.lang.IllegalStateException -> L74
                r2 = 35632(0x8b30, float:4.9931E-41)
                int r8 = Q.d.y(r2, r8)     // Catch: java.lang.IllegalArgumentException -> L6a java.lang.IllegalStateException -> L6e
                int r2 = android.opengl.GLES20.glCreateProgram()     // Catch: java.lang.IllegalArgumentException -> L65 java.lang.IllegalStateException -> L68
                java.lang.String r3 = "glCreateProgram"
                Q.d.g(r3)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                android.opengl.GLES20.glAttachShader(r2, r7)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                Q.d.g(r0)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                android.opengl.GLES20.glAttachShader(r2, r8)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                Q.d.g(r0)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                android.opengl.GLES20.glLinkProgram(r2)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                r0 = 1
                int[] r3 = new int[r0]     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                r4 = 35714(0x8b82, float:5.0046E-41)
                r5 = 0
                android.opengl.GLES20.glGetProgramiv(r2, r4, r3, r5)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                r3 = r3[r5]     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                if (r3 != r0) goto L4a
                r6.f27384a = r2     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                r6.c()
                return
            L46:
                r0 = move-exception
                goto L76
            L48:
                r0 = move-exception
                goto L76
            L4a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                r3.<init>()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                java.lang.String r4 = "Could not link program: "
                r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                java.lang.String r4 = android.opengl.GLES20.glGetProgramInfoLog(r2)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                r3.append(r4)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                java.lang.String r3 = r3.toString()     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                r0.<init>(r3)     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
                throw r0     // Catch: java.lang.IllegalArgumentException -> L46 java.lang.IllegalStateException -> L48
            L65:
                r0 = move-exception
            L66:
                r2 = r1
                goto L76
            L68:
                r0 = move-exception
                goto L66
            L6a:
                r0 = move-exception
            L6b:
                r8 = r1
            L6c:
                r2 = r8
                goto L76
            L6e:
                r0 = move-exception
                goto L6b
            L70:
                r0 = move-exception
            L71:
                r7 = r1
                r8 = r7
                goto L6c
            L74:
                r0 = move-exception
                goto L71
            L76:
                if (r7 == r1) goto L7b
                android.opengl.GLES20.glDeleteShader(r7)
            L7b:
                if (r8 == r1) goto L80
                android.opengl.GLES20.glDeleteShader(r8)
            L80:
                if (r2 == r1) goto L85
                android.opengl.GLES20.glDeleteProgram(r2)
            L85:
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: Q.d.f.<init>(java.lang.String, java.lang.String):void");
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void c() {
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f27384a, "aPosition");
            this.f27387d = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aPosition");
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f27384a, "uTransMatrix");
            this.f27385b = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "uTransMatrix");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f27384a, "uAlphaScale");
            this.f27386c = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uAlphaScale");
        }

        public void b() {
            GLES20.glDeleteProgram(this.f27384a);
        }

        public void d(float f10) {
            GLES20.glUniform1f(this.f27386c, f10);
            d.g("glUniform1f");
        }

        public void e(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f27385b, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        public void f() {
            GLES20.glUseProgram(this.f27384a);
            d.g("glUseProgram");
            GLES20.glEnableVertexAttribArray(this.f27387d);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f27387d, 2, 5126, false, 0, (Buffer) d.f27376i);
            d.g("glVertexAttribPointer");
            e(d.l());
            d(1.0f);
        }
    }

    public static class g extends f {

        /* renamed from: e, reason: collision with root package name */
        private int f27388e;

        /* renamed from: f, reason: collision with root package name */
        private int f27389f;

        /* renamed from: g, reason: collision with root package name */
        private int f27390g;

        public g(C3037w c3037w, e eVar) {
            this(c3037w, g(c3037w, eVar));
        }

        public g(C3037w c3037w, C c10) {
            super(c3037w.d() ? d.f27371d : d.f27370c, d.v(c10));
            this.f27388e = -1;
            this.f27389f = -1;
            this.f27390g = -1;
            c();
        }

        public void h(float[] fArr) {
            GLES20.glUniformMatrix4fv(this.f27389f, 1, false, fArr, 0);
            d.g("glUniformMatrix4fv");
        }

        private void c() {
            c();
            int iGlGetUniformLocation = GLES20.glGetUniformLocation(this.f27384a, "sTexture");
            this.f27388e = iGlGetUniformLocation;
            d.j(iGlGetUniformLocation, "sTexture");
            int iGlGetAttribLocation = GLES20.glGetAttribLocation(this.f27384a, "aTextureCoord");
            this.f27390g = iGlGetAttribLocation;
            d.j(iGlGetAttribLocation, "aTextureCoord");
            int iGlGetUniformLocation2 = GLES20.glGetUniformLocation(this.f27384a, "uTexMatrix");
            this.f27389f = iGlGetUniformLocation2;
            d.j(iGlGetUniformLocation2, "uTexMatrix");
        }

        private static C g(C3037w c3037w, e eVar) {
            boolean z10;
            if (!c3037w.d()) {
                return d.f27372e;
            }
            if (eVar != e.UNKNOWN) {
                z10 = true;
            } else {
                z10 = false;
            }
            i.b(z10, "No default sampler shader available for" + eVar);
            return eVar == e.YUV ? d.f27374g : d.f27373f;
        }

        @Override // Q.d.f
        public void f() {
            super.f();
            GLES20.glUniform1i(this.f27388e, 0);
            GLES20.glEnableVertexAttribArray(this.f27390g);
            d.g("glEnableVertexAttribArray");
            GLES20.glVertexAttribPointer(this.f27390g, 2, 5126, false, 0, (Buffer) d.f27378k);
            d.g("glVertexAttribPointer");
        }
    }

    public static FloatBuffer m(float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(fArr.length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        floatBufferAsFloatBuffer.put(fArr);
        floatBufferAsFloatBuffer.position(0);
        return floatBufferAsFloatBuffer;
    }

    public static int p() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        int i10 = iArr[0];
        GLES20.glBindTexture(36197, i10);
        g("glBindTexture " + i10);
        GLES20.glTexParameteri(36197, 10241, 9728);
        GLES20.glTexParameteri(36197, 10240, 9729);
        GLES20.glTexParameteri(36197, 10242, 33071);
        GLES20.glTexParameteri(36197, 10243, 33071);
        g("glTexParameter");
        return i10;
    }

    public static EGLSurface q(EGLDisplay eGLDisplay, EGLConfig eGLConfig, Surface surface, int[] iArr) {
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, eGLConfig, surface, iArr, 0);
        f("eglCreateWindowSurface");
        if (eGLSurfaceEglCreateWindowSurface != null) {
            return eGLSurfaceEglCreateWindowSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static int t() {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        g("glGenFramebuffers");
        return iArr[0];
    }

    public static int u() {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        g("glGenTextures");
        return iArr[0];
    }

    public static int z(EGLDisplay eGLDisplay, EGLSurface eGLSurface, int i10) {
        int[] iArr = new int[1];
        EGL14.eglQuerySurface(eGLDisplay, eGLSurface, i10, iArr, 0);
        return iArr[0];
    }

    static {
        Locale locale = Locale.US;
        f27370c = String.format(locale, "uniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nattribute vec4 aPosition;\nattribute vec4 aTextureCoord;\nvarying vec2 %s;\nvoid main() {\n    gl_Position = uTransMatrix * aPosition;\n    %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f27371d = String.format(locale, "#version 300 es\nin vec4 aPosition;\nin vec4 aTextureCoord;\nuniform mat4 uTexMatrix;\nuniform mat4 uTransMatrix;\nout vec2 %s;\nvoid main() {\n  gl_Position = uTransMatrix * aPosition;\n  %s = (uTexMatrix * aTextureCoord).xy;\n}\n", "vTextureCoord", "vTextureCoord");
        f27372e = new a();
        f27373f = new b();
        f27374g = new c();
        float[] fArr = {-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f};
        f27375h = fArr;
        f27376i = m(fArr);
        float[] fArr2 = {0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f};
        f27377j = fArr2;
        f27378k = m(fArr2);
        f27379l = Q.g.d(EGL14.EGL_NO_SURFACE, 0, 0);
    }

    public static void j(int i10, String str) {
        if (i10 >= 0) {
            return;
        }
        throw new IllegalStateException("Unable to locate '" + str + "' in program");
    }

    public static int[] k(String str, C3037w c3037w) {
        int[] iArr = f27368a;
        if (c3037w.b() == 3) {
            if (str.contains("EGL_EXT_gl_colorspace_bt2020_hlg")) {
                return f27369b;
            }
            P.l("GLUtils", "Dynamic range uses HLG encoding, but device does not support EGL_EXT_gl_colorspace_bt2020_hlg.Fallback to default colorspace.");
        }
        return iArr;
    }

    public static float[] l() {
        float[] fArr = new float[16];
        Matrix.setIdentityM(fArr, 0);
        return fArr;
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, i10, 12374, i11, 12344}, 0);
        f("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            return eGLSurfaceEglCreatePbufferSurface;
        }
        throw new IllegalStateException("surface was null");
    }

    public static Map<e, f> o(C3037w c3037w, Map<e, C> map) {
        Object gVar;
        e eVar;
        HashMap map2 = new HashMap();
        e[] eVarArrValues = e.values();
        int length = eVarArrValues.length;
        for (int i10 = 0; i10 < length; i10++) {
            e eVar2 = eVarArrValues[i10];
            C c10 = map.get(eVar2);
            if (c10 != null) {
                gVar = new g(c3037w, c10);
            } else if (eVar2 == e.YUV || eVar2 == (eVar = e.DEFAULT)) {
                gVar = new g(c3037w, eVar2);
            } else {
                i.j(eVar2 == e.UNKNOWN, "Unhandled input format: " + eVar2);
                if (c3037w.d()) {
                    gVar = new C0505d();
                } else {
                    C c11 = map.get(eVar);
                    gVar = c11 != null ? new g(c3037w, c11) : new g(c3037w, eVar);
                }
            }
            FS.log_d("GLUtils", "Shader program for input format " + eVar2 + " created: " + gVar);
            map2.put(eVar2, gVar);
        }
        return map2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String v(C c10) {
        try {
            String strA = c10.a("sTexture", "vTextureCoord");
            if (strA != null && strA.contains("vTextureCoord") && strA.contains("sTexture")) {
                return strA;
            }
            throw new IllegalArgumentException("Invalid fragment shader");
        } catch (Throwable th2) {
            if (th2 instanceof IllegalArgumentException) {
                throw th2;
            }
            throw new IllegalArgumentException("Unable retrieve fragment shader source", th2);
        }
    }

    public static String w() {
        Matcher matcher = Pattern.compile("OpenGL ES ([0-9]+)\\.([0-9]+).*").matcher(GLES20.glGetString(7938));
        if (!matcher.find()) {
            return "0.0";
        }
        return ((String) i.g(matcher.group(1))) + "." + ((String) i.g(matcher.group(2)));
    }

    public static Size x(EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
        return new Size(z(eGLDisplay, eGLSurface, 12375), z(eGLDisplay, eGLSurface, 12374));
    }

    public static void e(String str) {
        try {
            f(str);
        } catch (IllegalStateException e10) {
            P.d("GLUtils", e10.toString(), e10);
        }
    }

    public static void f(String str) {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new IllegalStateException(str + ": EGL error: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void g(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError == 0) {
            return;
        }
        throw new IllegalStateException(str + ": GL error 0x" + Integer.toHexString(iGlGetError));
    }

    public static void h(Thread thread) {
        boolean z10;
        if (thread == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        i.j(z10, "Method call must be called on the GL thread.");
    }

    public static void i(AtomicBoolean atomicBoolean, boolean z10) {
        boolean z11;
        String str;
        if (z10 == atomicBoolean.get()) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10) {
            str = "OpenGlRenderer is not initialized";
        } else {
            str = "OpenGlRenderer is already initialized";
        }
        i.j(z11, str);
    }

    public static void r(int i10) {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        g("glDeleteFramebuffers");
    }

    public static void s(int i10) {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        g("glDeleteTextures");
    }

    public static int y(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        g("glCreateShader type=" + i10);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        P.l("GLUtils", "Could not compile shader: " + str);
        GLES20.glDeleteShader(iGlCreateShader);
        throw new IllegalStateException("Could not compile shader type " + i10 + ":" + GLES20.glGetShaderInfoLog(iGlCreateShader));
    }
}
