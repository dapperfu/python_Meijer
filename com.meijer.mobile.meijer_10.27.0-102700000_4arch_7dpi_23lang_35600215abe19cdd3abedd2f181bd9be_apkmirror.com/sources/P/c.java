package P;

import C.C2979w;
import C.O;
import C.P;
import C.d0;
import O.C;
import O.C4439z;
import Q.d;
import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLExt;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Map;

/* loaded from: classes.dex */
public final class c extends C4439z {

    /* renamed from: n, reason: collision with root package name */
    private int f24422n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f24423o = -1;

    /* renamed from: p, reason: collision with root package name */
    private final O f24424p;

    /* renamed from: q, reason: collision with root package name */
    private final O f24425q;

    public int t(boolean z10) {
        Q.d.i(this.f22931a, true);
        Q.d.h(this.f22933c);
        return z10 ? this.f24422n : this.f24423o;
    }

    public void v(long j10, Surface surface, d0 d0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
        Q.d.i(this.f22931a, true);
        Q.d.h(this.f22933c);
        Q.g gVarF = f(surface);
        if (gVarF == Q.d.f29366l) {
            gVarF = c(surface);
            if (gVarF == null) {
                return;
            } else {
                this.f22932b.put(surface, gVarF);
            }
        }
        Q.g gVar = gVarF;
        if (surface != this.f22939i) {
            i(gVar.a());
            this.f22939i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, d0Var, surfaceTexture, this.f24424p, this.f24422n, true);
        w(gVar, d0Var, surfaceTexture2, this.f24425q, this.f24423o, true);
        EGLExt.eglPresentationTimeANDROID(this.f22934d, gVar.a(), j10);
        if (EGL14.eglSwapBuffers(this.f22934d, gVar.a())) {
            return;
        }
        P.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public c(O o10, O o11) {
        this.f24424p = o10;
        this.f24425q = o11;
    }

    private static float[] u(Size size, Size size2, O o10) {
        float[] fArrL = Q.d.l();
        float[] fArrL2 = Q.d.l();
        float[] fArrL3 = Q.d.l();
        Matrix.scaleM(fArrL, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        Matrix.translateM(fArrL2, 0, o10.c() / o10.e(), o10.d() / o10.b(), 0.0f);
        Matrix.multiplyMM(fArrL3, 0, fArrL, 0, fArrL2, 0);
        return fArrL3;
    }

    private void w(Q.g gVar, d0 d0Var, SurfaceTexture surfaceTexture, O o10, int i10, boolean z10) {
        s(i10);
        GLES20.glViewport(0, 0, gVar.c(), gVar.b());
        GLES20.glScissor(0, 0, gVar.c(), gVar.b());
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        d0Var.V(fArr2, fArr, z10);
        d.f fVar = (d.f) o2.i.g(this.f22941k);
        if (fVar instanceof d.g) {
            ((d.g) fVar).h(fArr2);
        }
        fVar.e(u(new Size((int) (gVar.c() * o10.e()), (int) (gVar.b() * o10.b())), new Size(gVar.c(), gVar.b()), o10));
        fVar.d(o10.a());
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        Q.d.g("glDrawArrays");
        GLES20.glDisable(3042);
    }

    @Override // O.C4439z
    public Q.e h(C2979w c2979w, Map<d.e, C> map) throws Throwable {
        Q.e eVarH = super.h(c2979w, map);
        this.f24422n = Q.d.p();
        this.f24423o = Q.d.p();
        return eVarH;
    }

    @Override // O.C4439z
    public void k() {
        super.k();
        this.f24422n = -1;
        this.f24423o = -1;
    }
}
