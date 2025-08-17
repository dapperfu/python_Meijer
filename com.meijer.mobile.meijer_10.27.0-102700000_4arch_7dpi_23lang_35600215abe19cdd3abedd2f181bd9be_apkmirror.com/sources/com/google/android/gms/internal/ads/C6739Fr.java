package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

/* renamed from: com.google.android.gms.internal.ads.Fr, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6739Fr extends Thread implements SurfaceTexture.OnFrameAvailableListener, InterfaceC6671Dr {

    /* renamed from: B, reason: collision with root package name */
    private static final float[] f66869B = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A, reason: collision with root package name */
    private volatile boolean f66870A;

    /* renamed from: a, reason: collision with root package name */
    private final C6705Er f66871a;

    /* renamed from: b, reason: collision with root package name */
    private final float[] f66872b;

    /* renamed from: c, reason: collision with root package name */
    private final float[] f66873c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f66874d;

    /* renamed from: e, reason: collision with root package name */
    private final float[] f66875e;

    /* renamed from: f, reason: collision with root package name */
    private final float[] f66876f;

    /* renamed from: g, reason: collision with root package name */
    private final float[] f66877g;

    /* renamed from: h, reason: collision with root package name */
    private final float[] f66878h;

    /* renamed from: i, reason: collision with root package name */
    private float f66879i;

    /* renamed from: j, reason: collision with root package name */
    private float f66880j;

    /* renamed from: k, reason: collision with root package name */
    private float f66881k;

    /* renamed from: l, reason: collision with root package name */
    private int f66882l;

    /* renamed from: m, reason: collision with root package name */
    private int f66883m;

    /* renamed from: n, reason: collision with root package name */
    private SurfaceTexture f66884n;

    /* renamed from: o, reason: collision with root package name */
    private SurfaceTexture f66885o;

    /* renamed from: p, reason: collision with root package name */
    private int f66886p;

    /* renamed from: q, reason: collision with root package name */
    private int f66887q;

    /* renamed from: r, reason: collision with root package name */
    private int f66888r;

    /* renamed from: s, reason: collision with root package name */
    private final FloatBuffer f66889s;

    /* renamed from: t, reason: collision with root package name */
    private final CountDownLatch f66890t;

    /* renamed from: u, reason: collision with root package name */
    private final Object f66891u;

    /* renamed from: v, reason: collision with root package name */
    private EGL10 f66892v;

    /* renamed from: w, reason: collision with root package name */
    private EGLDisplay f66893w;

    /* renamed from: x, reason: collision with root package name */
    private EGLContext f66894x;

    /* renamed from: y, reason: collision with root package name */
    private EGLSurface f66895y;

    /* renamed from: z, reason: collision with root package name */
    private volatile boolean f66896z;

    private static final void i(float[] fArr, float[] fArr2, float[] fArr3) {
        float f10 = fArr2[0] * fArr3[0];
        float f11 = fArr2[1];
        float f12 = fArr3[3];
        float f13 = fArr2[2];
        float f14 = fArr3[6];
        fArr[0] = f10 + (f11 * f12) + (f13 * f14);
        float f15 = fArr2[0];
        float f16 = fArr3[1] * f15;
        float f17 = fArr3[4];
        float f18 = fArr3[7];
        fArr[1] = f16 + (f11 * f17) + (f13 * f18);
        float f19 = f15 * fArr3[2];
        float f20 = fArr2[1];
        float f21 = fArr3[5];
        float f22 = fArr3[8];
        fArr[2] = f19 + (f20 * f21) + (f13 * f22);
        float f23 = fArr2[3];
        float f24 = fArr3[0];
        float f25 = fArr2[4];
        float f26 = fArr2[5];
        fArr[3] = (f23 * f24) + (f12 * f25) + (f26 * f14);
        float f27 = fArr2[3];
        float f28 = fArr3[1];
        fArr[4] = (f27 * f28) + (f25 * f17) + (f26 * f18);
        float f29 = fArr3[2];
        fArr[5] = (f27 * f29) + (fArr2[4] * f21) + (f26 * f22);
        float f30 = fArr2[6] * f24;
        float f31 = fArr2[7];
        float f32 = fArr3[3] * f31;
        float f33 = fArr2[8];
        fArr[6] = f30 + f32 + (f14 * f33);
        float f34 = fArr2[6];
        fArr[7] = (f28 * f34) + (f31 * fArr3[4]) + (f18 * f33);
        fArr[8] = (f34 * f29) + (fArr2[7] * fArr3[5]) + (f33 * f22);
    }

    private static final void j(float[] fArr, float f10) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d10 = f10;
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = (float) (-Math.sin(d10));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d10);
        fArr[8] = (float) Math.cos(d10);
    }

    private static final void k(float[] fArr, float f10) {
        double d10 = f10;
        fArr[0] = (float) Math.cos(d10);
        fArr[1] = (float) (-Math.sin(d10));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d10);
        fArr[4] = (float) Math.cos(d10);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    public final void c(SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f66883m = i10;
        this.f66882l = i11;
        this.f66885o = surfaceTexture;
    }

    public final void f(float f10, float f11) {
        int i10 = this.f66883m;
        int i11 = this.f66882l;
        if (i10 <= i11) {
            i10 = i11;
        }
        float f12 = i10;
        this.f66880j -= (f10 * 1.7453293f) / f12;
        float f13 = this.f66881k - ((f11 * 1.7453293f) / f12);
        this.f66881k = f13;
        if (f13 < -1.5707964f) {
            this.f66881k = -1.5707964f;
            f13 = -1.5707964f;
        }
        if (f13 > 1.5707964f) {
            this.f66881k = 1.5707964f;
        }
    }

    public C6739Fr(Context context) {
        super("SphericalVideoProcessor");
        float[] fArr = f66869B;
        int length = fArr.length;
        FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(48).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f66889s = floatBufferAsFloatBuffer;
        floatBufferAsFloatBuffer.put(fArr).position(0);
        this.f66872b = new float[9];
        this.f66873c = new float[9];
        this.f66874d = new float[9];
        this.f66875e = new float[9];
        this.f66876f = new float[9];
        this.f66877g = new float[9];
        this.f66878h = new float[9];
        this.f66879i = Float.NaN;
        C6705Er c6705Er = new C6705Er(context);
        this.f66871a = c6705Er;
        c6705Er.b(this);
        this.f66890t = new CountDownLatch(1);
        this.f66891u = new Object();
    }

    public final SurfaceTexture a() throws InterruptedException {
        if (this.f66885o == null) {
            return null;
        }
        try {
            this.f66890t.await();
        } catch (InterruptedException unused) {
        }
        return this.f66884n;
    }

    public final void b(int i10, int i11) {
        synchronized (this.f66891u) {
            this.f66883m = i10;
            this.f66882l = i11;
            this.f66896z = true;
            this.f66891u.notifyAll();
        }
    }

    public final void e() {
        synchronized (this.f66891u) {
            this.f66870A = true;
            this.f66885o = null;
            this.f66891u.notifyAll();
        }
    }

    final boolean g() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f66895y;
        boolean zEglDestroyContext = false;
        if (eGLSurface2 != null && eGLSurface2 != (eGLSurface = EGL10.EGL_NO_SURFACE)) {
            zEglDestroyContext = this.f66892v.eglDestroySurface(this.f66893w, this.f66895y) | this.f66892v.eglMakeCurrent(this.f66893w, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            this.f66895y = null;
        }
        EGLContext eGLContext = this.f66894x;
        if (eGLContext != null) {
            zEglDestroyContext |= this.f66892v.eglDestroyContext(this.f66893w, eGLContext);
            this.f66894x = null;
        }
        EGLDisplay eGLDisplay = this.f66893w;
        if (eGLDisplay == null) {
            return zEglDestroyContext;
        }
        boolean zEglTerminate = this.f66892v.eglTerminate(eGLDisplay) | zEglDestroyContext;
        this.f66893w = null;
        return zEglTerminate;
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f66888r++;
        synchronized (this.f66891u) {
            this.f66891u.notifyAll();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x001c  */
    @Override // java.lang.Thread, java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C6739Fr.run():void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6671Dr
    public final void zza() {
        synchronized (this.f66891u) {
            this.f66891u.notifyAll();
        }
    }

    private static final void h(String str) {
        int iGlGetError = GLES20.glGetError();
        if (iGlGetError != 0) {
            com.fullstory.FS.log_e("SphericalVideoRenderer", str + ": glError " + iGlGetError);
        }
    }

    private static final int l(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        h("createShader");
        if (iGlCreateShader != 0) {
            GLES20.glShaderSource(iGlCreateShader, str);
            h("shaderSource");
            GLES20.glCompileShader(iGlCreateShader);
            h("compileShader");
            int[] iArr = new int[1];
            GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
            h("getShaderiv");
            if (iArr[0] == 0) {
                com.fullstory.FS.log_e("SphericalVideoRenderer", "Could not compile shader " + i10 + ":");
                com.fullstory.FS.log_e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(iGlCreateShader));
                GLES20.glDeleteShader(iGlCreateShader);
                h("deleteShader");
                return 0;
            }
        }
        return iGlCreateShader;
    }
}
