package E;

import C.H;
import F.AbstractC3611h;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import androidx.camera.core.ImageCaptureException;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public abstract class e0 {

    /* renamed from: a, reason: collision with root package name */
    private int f7515a = new M.a().a();

    interface a {
        void b(e0 e0Var);
    }

    abstract Executor g();

    abstract int h();

    abstract Rect i();

    public abstract H.e j();

    abstract int k();

    public abstract H.f l();

    abstract H.g m();

    abstract int n();

    abstract Matrix o();

    abstract List<AbstractC3611h> p();

    public static /* synthetic */ void a(e0 e0Var, ImageCaptureException imageCaptureException) {
        e0Var.j();
        boolean z10 = false;
        if (e0Var.l() != null) {
            z10 = true;
        }
        if (z10) {
            H.f fVarL = e0Var.l();
            Objects.requireNonNull(fVarL);
            fVarL.e(imageCaptureException);
            return;
        }
        throw new IllegalStateException("One and only one callback is allowed.");
    }

    public static /* synthetic */ void b(e0 e0Var, H.h hVar) {
        H.f fVarL = e0Var.l();
        Objects.requireNonNull(fVarL);
        Objects.requireNonNull(hVar);
        fVarL.d(hVar);
    }

    public static /* synthetic */ void c(e0 e0Var, androidx.camera.core.n nVar) {
        H.e eVarJ = e0Var.j();
        Objects.requireNonNull(eVarJ);
        Objects.requireNonNull(nVar);
        eVarJ.c(nVar);
    }

    public static /* synthetic */ void d(e0 e0Var, Bitmap bitmap) {
        if (e0Var.l() != null) {
            e0Var.l().b(bitmap);
        } else {
            e0Var.j();
        }
    }

    public static /* synthetic */ void e(e0 e0Var, int i10) {
        if (e0Var.l() != null) {
            e0Var.l().a(i10);
        } else {
            e0Var.j();
        }
    }

    boolean f() {
        G.o.a();
        int i10 = this.f7515a;
        if (i10 > 0) {
            this.f7515a = i10 - 1;
            return true;
        }
        return false;
    }

    void q(final int i10) {
        g().execute(new Runnable() { // from class: E.d0
            @Override // java.lang.Runnable
            public final void run() {
                e0.e(this.f7509a, i10);
            }
        });
    }

    void r(final ImageCaptureException imageCaptureException) {
        g().execute(new Runnable() { // from class: E.Z
            @Override // java.lang.Runnable
            public final void run() {
                e0.a(this.f7486a, imageCaptureException);
            }
        });
    }

    void s(final Bitmap bitmap) {
        g().execute(new Runnable() { // from class: E.b0
            @Override // java.lang.Runnable
            public final void run() {
                e0.d(this.f7501a, bitmap);
            }
        });
    }

    void t(final H.h hVar) {
        g().execute(new Runnable() { // from class: E.c0
            @Override // java.lang.Runnable
            public final void run() {
                e0.b(this.f7505a, hVar);
            }
        });
    }

    void u(final androidx.camera.core.n nVar) {
        g().execute(new Runnable() { // from class: E.a0
            @Override // java.lang.Runnable
            public final void run() {
                e0.c(this.f7490a, nVar);
            }
        });
    }
}
