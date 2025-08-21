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
    private final e0 f6860a;

    /* renamed from: b, reason: collision with root package name */
    private final e0.a f6861b;

    /* renamed from: e, reason: collision with root package name */
    private c.a<Void> f6864e;

    /* renamed from: f, reason: collision with root package name */
    private c.a<Void> f6865f;

    /* renamed from: i, reason: collision with root package name */
    private com.google.common.util.concurrent.q<Void> f6868i;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6866g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6867h = false;

    /* renamed from: c, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f6862c = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: E.P
        @Override // androidx.concurrent.futures.c.InterfaceC1101c
        public final Object a(c.a aVar) {
            return S.i(this.f6858a, aVar);
        }
    });

    /* renamed from: d, reason: collision with root package name */
    private final com.google.common.util.concurrent.q<Void> f6863d = androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: E.Q
        @Override // androidx.concurrent.futures.c.InterfaceC1101c
        public final Object a(c.a aVar) {
            return S.j(this.f6859a, aVar);
        }
    });

    public static /* synthetic */ Object i(S s10, c.a aVar) {
        s10.f6864e = aVar;
        return "CaptureCompleteFuture";
    }

    public static /* synthetic */ Object j(S s10, c.a aVar) {
        s10.f6865f = aVar;
        return "RequestCompleteFuture";
    }

    private void n() {
        o2.i.j(this.f6862c.isDone(), "onImageCaptured() must be called before onFinalResult()");
    }

    private void q() {
        o2.i.j(!this.f6863d.isDone(), "The callback can only complete once.");
        this.f6865f.c(null);
    }

    @Override // E.U
    public boolean isAborted() {
        return this.f6866g;
    }

    S(e0 e0Var, e0.a aVar) {
        this.f6860a = e0Var;
        this.f6861b = aVar;
    }

    private void k(ImageCaptureException imageCaptureException) {
        G.o.a();
        this.f6866g = true;
        com.google.common.util.concurrent.q<Void> qVar = this.f6868i;
        Objects.requireNonNull(qVar);
        qVar.cancel(true);
        this.f6864e.f(imageCaptureException);
        this.f6865f.c(null);
    }

    private void r(ImageCaptureException imageCaptureException) {
        G.o.a();
        this.f6860a.r(imageCaptureException);
    }

    @Override // E.U
    public void a(int i10) {
        G.o.a();
        if (this.f6866g) {
            return;
        }
        this.f6860a.q(i10);
    }

    @Override // E.U
    public void b(Bitmap bitmap) {
        G.o.a();
        if (this.f6866g) {
            return;
        }
        this.f6860a.s(bitmap);
    }

    @Override // E.U
    public void c() {
        G.o.a();
        if (!this.f6866g && !this.f6867h) {
            this.f6867h = true;
            this.f6860a.j();
            H.f fVarL = this.f6860a.l();
            if (fVarL != null) {
                fVarL.c();
            }
        }
    }

    @Override // E.U
    public void d(ImageCaptureException imageCaptureException) {
        G.o.a();
        if (this.f6866g) {
            return;
        }
        n();
        q();
        r(imageCaptureException);
    }

    @Override // E.U
    public void e(androidx.camera.core.n nVar) {
        G.o.a();
        if (this.f6866g) {
            nVar.close();
            return;
        }
        n();
        q();
        this.f6860a.u(nVar);
    }

    @Override // E.U
    public void f(ImageCaptureException imageCaptureException) {
        G.o.a();
        if (!this.f6866g) {
            boolean zF = this.f6860a.f();
            if (!zF) {
                r(imageCaptureException);
            }
            q();
            this.f6864e.f(imageCaptureException);
            if (zF) {
                this.f6861b.b(this.f6860a);
            }
        }
    }

    @Override // E.U
    public void g() {
        G.o.a();
        if (this.f6866g) {
            return;
        }
        if (!this.f6867h) {
            c();
        }
        this.f6864e.c(null);
    }

    @Override // E.U
    public void h(H.h hVar) {
        G.o.a();
        if (this.f6866g) {
            return;
        }
        n();
        q();
        this.f6860a.t(hVar);
    }

    void l(ImageCaptureException imageCaptureException) {
        G.o.a();
        if (this.f6863d.isDone()) {
            return;
        }
        k(imageCaptureException);
        r(imageCaptureException);
    }

    void m() {
        G.o.a();
        if (this.f6863d.isDone()) {
            return;
        }
        k(new ImageCaptureException(3, "The request is aborted silently and retried.", null));
        this.f6861b.b(this.f6860a);
    }

    com.google.common.util.concurrent.q<Void> o() {
        G.o.a();
        return this.f6862c;
    }

    com.google.common.util.concurrent.q<Void> p() {
        G.o.a();
        return this.f6863d;
    }

    public void s(com.google.common.util.concurrent.q<Void> qVar) {
        boolean z10;
        G.o.a();
        if (this.f6868i == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        o2.i.j(z10, "CaptureRequestFuture can only be set once.");
        this.f6868i = qVar;
    }
}
