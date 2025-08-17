package E;

import C.H;
import E.e0;
import android.graphics.Bitmap;
import androidx.camera.core.ImageCaptureException;
import androidx.concurrent.futures.c;
import java.util.Objects;

/* loaded from: classes.dex */
public class S implements U {

    /* renamed from: a, reason: collision with root package name */
    private final e0 f7453a;

    /* renamed from: b, reason: collision with root package name */
    private final e0.a f7454b;

    /* renamed from: e, reason: collision with root package name */
    private c.a<Void> f7457e;

    /* renamed from: f, reason: collision with root package name */
    private c.a<Void> f7458f;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.q<Void> f7461i;

    /* renamed from: g, reason: collision with root package name */
    private boolean f7459g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7460h = false;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f7455c = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: E.P
        @Override // androidx.concurrent.futures.c.InterfaceC1088c
        public final Object a(c.a aVar) {
            return S.i(this.f7451a, aVar);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f7456d = androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: E.Q
        @Override // androidx.concurrent.futures.c.InterfaceC1088c
        public final Object a(c.a aVar) {
            return S.j(this.f7452a, aVar);
        }
    });

    public static /* synthetic */ Object i(S s10, c.a aVar) {
        s10.f7457e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object j(S s10, c.a aVar) {
        s10.f7458f = aVar;
        return "RequestCompleteFuture";
    }

    private void n() {
        o2.i.j(this.f7455c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    private void q() {
        o2.i.j(!this.f7456d.isDone(), "The callback can only complete once.");
        this.f7458f.c(null);
    }

    @Override // E.U
    public boolean isAborted() {
        return this.f7459g;
    }

    S(e0 e0Var, e0.a aVar) {
        this.f7453a = e0Var;
        this.f7454b = aVar;
    }

    private void k(ImageCaptureException imageCaptureException) {
        G.o.a();
        this.f7459g = true;
        com.google.common.util.concurrent.q<Void> qVar = this.f7461i;
        Objects.requireNonNull(qVar);
        qVar.cancel(true);
        this.f7457e.f(imageCaptureException);
        this.f7458f.c(null);
    }

    private void r(ImageCaptureException imageCaptureException) {
        G.o.a();
        this.f7453a.r(imageCaptureException);
    }

    @Override // E.U
    public void a(int i10) {
        G.o.a();
        if (this.f7459g) {
            return;
        }
        this.f7453a.q(i10);
    }

    @Override // E.U
    public void b(Bitmap bitmap) {
        G.o.a();
        if (this.f7459g) {
            return;
        }
        this.f7453a.s(bitmap);
    }

    @Override // E.U
    public void c() {
        G.o.a();
        if (!this.f7459g && !this.f7460h) {
            this.f7460h = true;
            this.f7453a.j();
            H.f fVarL = this.f7453a.l();
            if (fVarL != null) {
                fVarL.c();
            }
        }
    }

    @Override // E.U
    public void d(ImageCaptureException imageCaptureException) {
        G.o.a();
        if (this.f7459g) {
            return;
        }
        n();
        q();
        r(imageCaptureException);
    }

    @Override // E.U
    public void e(androidx.camera.core.n nVar) {
        G.o.a();
        if (this.f7459g) {
            nVar.close();
            return;
        }
        n();
        q();
        this.f7453a.u(nVar);
    }

    @Override // E.U
    public void f(ImageCaptureException imageCaptureException) {
        G.o.a();
        if (!this.f7459g) {
            boolean zF = this.f7453a.f();
            if (!zF) {
                r(imageCaptureException);
            }
            q();
            this.f7457e.f(imageCaptureException);
            if (zF) {
                this.f7454b.b(this.f7453a);
            }
        }
    }

    @Override // E.U
    public void g() {
        G.o.a();
        if (this.f7459g) {
            return;
        }
        if (!this.f7460h) {
            c();
        }
        this.f7457e.c(null);
    }

    @Override // E.U
    public void h(H.h hVar) {
        G.o.a();
        if (this.f7459g) {
            return;
        }
        n();
        q();
        this.f7453a.t(hVar);
    }

    void l(ImageCaptureException imageCaptureException) {
        G.o.a();
        if (this.f7456d.isDone()) {
            return;
        }
        k(imageCaptureException);
        r(imageCaptureException);
    }

    void m() {
        G.o.a();
        if (this.f7456d.isDone()) {
            return;
        }
        k(new ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.f7454b.b(this.f7453a);
    }

    com.google.common.util.concurrent.q<Void> o() {
        G.o.a();
        return this.f7455c;
    }

    com.google.common.util.concurrent.q<Void> p() {
        G.o.a();
        return this.f7456d;
    }

    public void s(com.google.common.util.concurrent.q<Void> qVar) {
        boolean z10;
        G.o.a();
        if (this.f7461i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "CaptureRequestFuture can only be set once.");
        this.f7461i = qVar;
    }
}
