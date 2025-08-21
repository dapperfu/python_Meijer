package O;

import C.C3037w;
import Q.d;
import Q.e;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import com.fullstory.FS;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: O.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4352z {

    /* renamed from: c, reason: collision with root package name */
    protected Thread f22926c;

    /* renamed from: g, reason: collision with root package name */
    protected EGLConfig f22930g;

    /* renamed from: i, reason: collision with root package name */
    protected Surface f22932i;

    /* renamed from: a, reason: collision with root package name */
    protected final AtomicBoolean f22924a = new AtomicBoolean(false);

    /* renamed from: b, reason: collision with root package name */
    protected final Map<Surface, Q.g> f22925b = new HashMap();

    /* renamed from: d, reason: collision with root package name */
    protected EGLDisplay f22927d = EGL14.EGL_NO_DISPLAY;

    /* renamed from: e, reason: collision with root package name */
    protected EGLContext f22928e = EGL14.EGL_NO_CONTEXT;

    /* renamed from: f, reason: collision with root package name */
    protected int[] f22929f = Q.d.f27368a;

    /* renamed from: h, reason: collision with root package name */
    protected EGLSurface f22931h = EGL14.EGL_NO_SURFACE;

    /* renamed from: j, reason: collision with root package name */
    protected Map<d.e, d.f> f22933j = Collections.EMPTY_MAP;

    /* renamed from: k, reason: collision with root package name */
    protected d.f f22934k = null;

    /* renamed from: l, reason: collision with root package name */
    protected d.e f22935l = d.e.UNKNOWN;

    /* renamed from: m, reason: collision with root package name */
    private int f22936m = -1;

    private void b(C3037w c3037w, e.a aVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f22927d = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            throw new IllegalStateException("Unable to get EGL14 display");
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize(this.f22927d, iArr, 0, iArr, 1)) {
            this.f22927d = EGL14.EGL_NO_DISPLAY;
            throw new IllegalStateException("Unable to initialize EGL14");
        }
        if (aVar != null) {
            aVar.c(iArr[0] + "." + iArr[1]);
        }
        int i10 = c3037w.d() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig(this.f22927d, new int[]{12324, i10, 12323, i10, 12322, i10, 12321, c3037w.d() ? 2 : 8, 12325, 0, 12326, 0, 12352, c3037w.d() ? 64 : 4, 12610, c3037w.d() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            throw new IllegalStateException("Unable to find a suitable EGLConfig");
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(this.f22927d, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, c3037w.d() ? 3 : 2, 12344}, 0);
        Q.d.f("eglCreateContext");
        this.f22930g = eGLConfig;
        this.f22928e = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext(this.f22927d, eGLContextEglCreateContext, 12440, iArr2, 0);
        FS.log_d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    private void d() {
        EGLDisplay eGLDisplay = this.f22927d;
        EGLConfig eGLConfig = this.f22930g;
        Objects.requireNonNull(eGLConfig);
        this.f22931h = Q.d.n(eGLDisplay, eGLConfig, 1, 1);
    }

    private o2.d<String, String> e(C3037w c3037w) {
        Q.d.i(this.f22924a, false);
        try {
            b(c3037w, null);
            d();
            i(this.f22931h);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString(this.f22927d, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new o2.d<>(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e10) {
            C.P.m("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e10.getMessage(), e10);
            return new o2.d<>("", "");
        } finally {
            l();
        }
    }

    private void l() {
        Iterator<d.f> it = this.f22933j.values().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
        this.f22933j = Collections.EMPTY_MAP;
        this.f22934k = null;
        if (!Objects.equals(this.f22927d, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = this.f22927d;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (Q.g gVar : this.f22925b.values()) {
                if (!Objects.equals(gVar.a(), EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface(this.f22927d, gVar.a())) {
                    Q.d.e("eglDestroySurface");
                }
            }
            this.f22925b.clear();
            if (!Objects.equals(this.f22931h, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface(this.f22927d, this.f22931h);
                this.f22931h = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals(this.f22928e, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext(this.f22927d, this.f22928e);
                this.f22928e = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate(this.f22927d);
            this.f22927d = EGL14.EGL_NO_DISPLAY;
        }
        this.f22930g = null;
        this.f22936m = -1;
        this.f22935l = d.e.UNKNOWN;
        this.f22932i = null;
        this.f22926c = null;
    }

    private void q(ByteBuffer byteBuffer, Size size, float[] fArr) {
        o2.i.b(byteBuffer.capacity() == (size.getWidth() * size.getHeight()) * 4, "ByteBuffer capacity is not equal to width * height * 4.");
        o2.i.b(byteBuffer.isDirect(), "ByteBuffer is not direct.");
        int iU = Q.d.u();
        GLES20.glActiveTexture(33985);
        Q.d.g("glActiveTexture");
        GLES20.glBindTexture(3553, iU);
        Q.d.g("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, size.getWidth(), size.getHeight(), 0, 6407, 5121, null);
        Q.d.g("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int iT = Q.d.t();
        GLES20.glBindFramebuffer(36160, iT);
        Q.d.g("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, iU, 0);
        Q.d.g("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        Q.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, this.f22936m);
        Q.d.g("glBindTexture");
        this.f22932i = null;
        GLES20.glViewport(0, 0, size.getWidth(), size.getHeight());
        GLES20.glScissor(0, 0, size.getWidth(), size.getHeight());
        d.f fVar = (d.f) o2.i.g(this.f22934k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        Q.d.g("glDrawArrays");
        GLES20.glReadPixels(0, 0, size.getWidth(), size.getHeight(), 6408, 5121, byteBuffer);
        Q.d.g("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        Q.d.s(iU);
        Q.d.r(iT);
        a(this.f22936m);
    }

    protected Q.g c(Surface surface) {
        try {
            EGLDisplay eGLDisplay = this.f22927d;
            EGLConfig eGLConfig = this.f22930g;
            Objects.requireNonNull(eGLConfig);
            EGLSurface eGLSurfaceQ = Q.d.q(eGLDisplay, eGLConfig, surface, this.f22929f);
            Size sizeX = Q.d.x(this.f22927d, eGLSurfaceQ);
            return Q.g.d(eGLSurfaceQ, sizeX.getWidth(), sizeX.getHeight());
        } catch (IllegalArgumentException | IllegalStateException e10) {
            C.P.m("OpenGlRenderer", "Failed to create EGL surface: " + e10.getMessage(), e10);
            return null;
        }
    }

    protected Q.g f(Surface surface) {
        o2.i.j(this.f22925b.containsKey(surface), "The surface is not registered.");
        Q.g gVar = this.f22925b.get(surface);
        Objects.requireNonNull(gVar);
        return gVar;
    }

    public int g() {
        Q.d.i(this.f22924a, true);
        Q.d.h(this.f22926c);
        return this.f22936m;
    }

    public Q.e h(C3037w c3037w, Map<d.e, C> map) throws Throwable {
        Q.d.i(this.f22924a, false);
        e.a aVarA = Q.e.a();
        try {
            if (c3037w.d()) {
                o2.d<String, String> dVarE = e(c3037w);
                String str = (String) o2.i.g(dVarE.f153583a);
                String str2 = (String) o2.i.g(dVarE.f153584b);
                if (!str.contains("GL_EXT_YUV_target")) {
                    C.P.l("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    c3037w = C3037w.f3991d;
                }
                this.f22929f = Q.d.k(str2, c3037w);
                aVarA.d(str);
                aVarA.b(str2);
            }
            b(c3037w, aVarA);
            d();
            i(this.f22931h);
            aVarA.e(Q.d.w());
            this.f22933j = Q.d.o(c3037w, map);
            int iP = Q.d.p();
            this.f22936m = iP;
            s(iP);
            this.f22926c = Thread.currentThread();
            this.f22924a.set(true);
            return aVarA.a();
        } catch (IllegalArgumentException e10) {
            e = e10;
            l();
            throw e;
        } catch (IllegalStateException e11) {
            e = e11;
            l();
            throw e;
        }
    }

    protected void i(EGLSurface eGLSurface) {
        o2.i.g(this.f22927d);
        o2.i.g(this.f22928e);
        if (!EGL14.eglMakeCurrent(this.f22927d, eGLSurface, eGLSurface, this.f22928e)) {
            throw new IllegalStateException("eglMakeCurrent failed");
        }
    }

    public void j(Surface surface) {
        Q.d.i(this.f22924a, true);
        Q.d.h(this.f22926c);
        if (this.f22925b.containsKey(surface)) {
            return;
        }
        this.f22925b.put(surface, Q.d.f27379l);
    }

    public void k() {
        if (this.f22924a.getAndSet(false)) {
            Q.d.h(this.f22926c);
            l();
        }
    }

    protected void m(Surface surface, boolean z10) {
        if (this.f22932i == surface) {
            this.f22932i = null;
            i(this.f22931h);
        }
        Q.g gVarRemove = z10 ? this.f22925b.remove(surface) : this.f22925b.put(surface, Q.d.f27379l);
        if (gVarRemove == null || gVarRemove == Q.d.f27379l) {
            return;
        }
        try {
            EGL14.eglDestroySurface(this.f22927d, gVarRemove.a());
        } catch (RuntimeException e10) {
            C.P.m("OpenGlRenderer", "Failed to destroy EGL surface: " + e10.getMessage(), e10);
        }
    }

    public void n(long j10, float[] fArr, Surface surface) {
        Q.d.i(this.f22924a, true);
        Q.d.h(this.f22926c);
        Q.g gVarF = f(surface);
        if (gVarF == Q.d.f27379l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f22925b.put(surface, gVarF);
            }
        }
        if (surface != this.f22932i) {
            i(gVarF.a());
            this.f22932i = surface;
            GLES20.glViewport(0, 0, gVarF.c(), gVarF.b());
            GLES20.glScissor(0, 0, gVarF.c(), gVarF.b());
        }
        d.f fVar = (d.f) o2.i.g(this.f22934k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr);
        }
        GLES20.glDrawArrays(5, 0, 4);
        Q.d.g("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID(this.f22927d, gVarF.a(), j10);
        if (EGL14.eglSwapBuffers(this.f22927d, gVarF.a())) {
            return;
        }
        C.P.l("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public void o(d.e eVar) {
        Q.d.i(this.f22924a, true);
        Q.d.h(this.f22926c);
        if (this.f22935l != eVar) {
            this.f22935l = eVar;
            s(this.f22936m);
        }
    }

    public void r(Surface surface) {
        Q.d.i(this.f22924a, true);
        Q.d.h(this.f22926c);
        m(surface, true);
    }

    protected void s(int i10) {
        d.f fVar = this.f22933j.get(this.f22935l);
        if (fVar == null) {
            throw new IllegalStateException("Unable to configure program for input format: " + this.f22935l);
        }
        if (this.f22934k != fVar) {
            this.f22934k = fVar;
            fVar.f();
            FS.log_d("OpenGlRenderer", "Using program for input format " + this.f22935l + ": " + this.f22934k);
        }
        a(i10);
    }

    private void a(int i10) {
        GLES20.glActiveTexture(33984);
        Q.d.g("glActiveTexture");
        GLES20.glBindTexture(36197, i10);
        Q.d.g("glBindTexture");
    }

    public Bitmap p(Size size, float[] fArr) {
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(size.getWidth() * size.getHeight() * 4);
        q(byteBufferAllocateDirect, size, fArr);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(size.getWidth(), size.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.j(bitmapCreateBitmap, byteBufferAllocateDirect, size.getWidth() * 4);
        return bitmapCreateBitmap;
    }
}
