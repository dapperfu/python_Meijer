package P;

import C.C3037w;
import C.O;
import C.P;
import C.d0;
import O.C;
import O.C4352z;
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
public final class c extends C4352z {

    /* renamed from: n, reason: collision with root package name */
    private int f25120n = -1;

    /* renamed from: o, reason: collision with root package name */
    private int f25121o = -1;

    /* renamed from: p, reason: collision with root package name */
    private final O f25122p;

    /* renamed from: q, reason: collision with root package name */
    private final O f25123q;

    public int t(boolean z10) {
        Q.d.i(this.f22924a, true);
        Q.d.h(this.f22926c);
        return z10 ? this.f25120n : this.f25121o;
    }

    public void v(long j10, Surface surface, d0 d0Var, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
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
        Q.g gVar = gVarF;
        if (surface != this.f22932i) {
            i(gVar.a());
            this.f22932i = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(gVar, d0Var, surfaceTexture, this.f25122p, this.f25120n, true);
        w(gVar, d0Var, surfaceTexture2, this.f25123q, this.f25121o, true);
        EGLExt.eglPresentationTimeANDROID(this.f22927d, gVar.a(), j10);
        if (EGL14.eglSwapBuffers(this.f22927d, gVar.a())) {
            return;
        }
        P.l("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        m(surface, false);
    }

    public c(O o10, O o11) {
        this.f25122p = o10;
        this.f25123q = o11;
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
        d.f fVar = (d.f) o2.i.g(this.f22934k);
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

    @Override // O.C4352z
    public Q.e h(C3037w c3037w, Map<d.e, C> map) throws Throwable {
        Q.e eVarH = super.h(c3037w, map);
        this.f25120n = Q.d.p();
        this.f25121o = Q.d.p();
        return eVarH;
    }

    @Override // O.C4352z
    public void k() {
        super.k();
        this.f25120n = -1;
        this.f25121o = -1;
    }
}
