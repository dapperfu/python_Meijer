package androidx.media3.common.util;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import androidx.media3.common.util.GlUtil;
import d3.C13599a;
import d3.P;

/* loaded from: classes.dex */
public final class a implements SurfaceTexture.OnFrameAvailableListener, Runnable {

    /* renamed from: g, reason: collision with root package name */
    private static final int[] f55629g = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12327, 12344, 12339, 4, 12344};

    /* renamed from: a, reason: collision with root package name */
    private final Handler f55630a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f55631b;

    /* renamed from: c, reason: collision with root package name */
    private EGLDisplay f55632c;

    /* renamed from: d, reason: collision with root package name */
    private EGLContext f55633d;

    /* renamed from: e, reason: collision with root package name */
    private EGLSurface f55634e;

    /* renamed from: f, reason: collision with root package name */
    private SurfaceTexture f55635f;

    /* renamed from: androidx.media3.common.util.a$a, reason: collision with other inner class name */
    public interface InterfaceC1134a {
    }

    public a(Handler handler) {
        this(handler, null);
    }

    private static EGLConfig a(EGLDisplay eGLDisplay) throws GlUtil.GlException {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr = new int[1];
        boolean zEglChooseConfig = EGL14.eglChooseConfig(eGLDisplay, f55629g, 0, eGLConfigArr, 0, 1, iArr, 0);
        GlUtil.c(zEglChooseConfig && iArr[0] > 0 && eGLConfigArr[0] != null, P.F("eglChooseConfig failed: success=%b, numConfigs[0]=%d, configs[0]=%s", Boolean.valueOf(zEglChooseConfig), Integer.valueOf(iArr[0]), eGLConfigArr[0]));
        return eGLConfigArr[0];
    }

    private static EGLSurface c(EGLDisplay eGLDisplay, EGLConfig eGLConfig, EGLContext eGLContext, int i10) throws GlUtil.GlException {
        EGLSurface eGLSurfaceEglCreatePbufferSurface;
        if (i10 == 1) {
            eGLSurfaceEglCreatePbufferSurface = EGL14.EGL_NO_SURFACE;
        } else {
            eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, i10 == 2 ? new int[]{12375, 1, 12374, 1, 12992, 1, 12344} : new int[]{12375, 1, 12374, 1, 12344}, 0);
            GlUtil.c(eGLSurfaceEglCreatePbufferSurface != null, "eglCreatePbufferSurface failed");
        }
        GlUtil.c(EGL14.eglMakeCurrent(eGLDisplay, eGLSurfaceEglCreatePbufferSurface, eGLSurfaceEglCreatePbufferSurface, eGLContext), "eglMakeCurrent failed");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    private void e() {
    }

    private static void f(int[] iArr) throws GlUtil.GlException {
        GLES20.glGenTextures(1, iArr, 0);
        GlUtil.b();
    }

    private static EGLDisplay g() throws GlUtil.GlException {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        GlUtil.c(eGLDisplayEglGetDisplay != null, "eglGetDisplay failed");
        int[] iArr = new int[2];
        GlUtil.c(EGL14.eglInitialize(eGLDisplayEglGetDisplay, iArr, 0, iArr, 1), "eglInitialize failed");
        return eGLDisplayEglGetDisplay;
    }

    public a(Handler handler, InterfaceC1134a interfaceC1134a) {
        this.f55630a = handler;
        this.f55631b = new int[1];
    }

    private static EGLContext b(EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10) throws GlUtil.GlException {
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, eGLConfig, EGL14.EGL_NO_CONTEXT, i10 == 0 ? new int[]{12440, 2, 12344} : new int[]{12440, 2, 12992, 1, 12344}, 0);
        GlUtil.c(eGLContextEglCreateContext != null, "eglCreateContext failed");
        return eGLContextEglCreateContext;
    }

    public SurfaceTexture h() {
        return (SurfaceTexture) C13599a.e(this.f55635f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public void j() {
        this.f55630a.removeCallbacks(this);
        try {
            SurfaceTexture surfaceTexture = this.f55635f;
            if (surfaceTexture != null) {
                surfaceTexture.release();
                GLES20.glDeleteTextures(1, this.f55631b, 0);
            }
        } finally {
            EGLDisplay eGLDisplay = this.f55632c;
            if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay2 = this.f55632c;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay2, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            }
            EGLSurface eGLSurface2 = this.f55634e;
            if (eGLSurface2 != null && !eGLSurface2.equals(EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f55632c, this.f55634e);
            }
            EGLContext eGLContext = this.f55633d;
            if (eGLContext != null) {
                EGL14.eglDestroyContext(this.f55632c, eGLContext);
            }
            EGL14.eglReleaseThread();
            EGLDisplay eGLDisplay3 = this.f55632c;
            if (eGLDisplay3 != null && !eGLDisplay3.equals(EGL14.EGL_NO_DISPLAY)) {
                EGL14.eglTerminate(this.f55632c);
            }
            this.f55632c = null;
            this.f55633d = null;
            this.f55634e = null;
            this.f55635f = null;
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f55630a.post(this);
    }

    public void i(int i10) throws GlUtil.GlException {
        EGLDisplay eGLDisplayG = g();
        this.f55632c = eGLDisplayG;
        EGLConfig eGLConfigA = a(eGLDisplayG);
        EGLContext eGLContextB = b(this.f55632c, eGLConfigA, i10);
        this.f55633d = eGLContextB;
        this.f55634e = c(this.f55632c, eGLConfigA, eGLContextB, i10);
        f(this.f55631b);
        SurfaceTexture surfaceTexture = new SurfaceTexture(this.f55631b[0]);
        this.f55635f = surfaceTexture;
        surfaceTexture.setOnFrameAvailableListener(this);
    }

    @Override // java.lang.Runnable
    public void run() {
        e();
        SurfaceTexture surfaceTexture = this.f55635f;
        if (surfaceTexture != null) {
            try {
                surfaceTexture.updateTexImage();
            } catch (RuntimeException unused) {
            }
        }
    }
}
