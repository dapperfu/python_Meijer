package B;

import I.n;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.concurrent.Executor;
import u.C17296a;
import v.C17557u;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private final C17557u f2136c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f2137d;

    /* renamed from: g, reason: collision with root package name */
    c.a<Void> f2140g;

    /* renamed from: a, reason: collision with root package name */
    private boolean f2134a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f2135b = false;

    /* renamed from: e, reason: collision with root package name */
    final Object f2138e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private C17296a.C2582a f2139f = new C17296a.C2582a();

    /* JADX INFO: Access modifiers changed from: private */
    public void q(c.a<Void> aVar) {
        this.f2135b = true;
        m(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.f2140g = aVar;
        if (this.f2134a) {
            r();
        }
    }

    public static /* synthetic */ Object a(final g gVar, final c.a aVar) {
        gVar.f2137d.execute(new Runnable() { // from class: B.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f2128a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final c.a aVar) {
        gVar.f2137d.execute(new Runnable() { // from class: B.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f2125a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    private void h(j jVar) {
        synchronized (this.f2138e) {
            this.f2139f.d(jVar);
        }
    }

    private void k() {
        synchronized (this.f2138e) {
            this.f2139f = new C17296a.C2582a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        c.a<Void> aVar = this.f2140g;
        if (aVar != null) {
            aVar.c(null);
            this.f2140g = null;
        }
    }

    private void m(Exception exc) {
        c.a<Void> aVar = this.f2140g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f2140g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z10) {
        if (this.f2134a == z10) {
            return;
        }
        this.f2134a = z10;
        if (!z10) {
            m(new CameraControl$OperationCanceledException("The camera control has became inactive."));
        } else if (this.f2135b) {
            r();
        }
    }

    private void r() {
        this.f2136c.Y().addListener(new Runnable() { // from class: B.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f2127a.l();
            }
        }, this.f2137d);
        this.f2135b = false;
    }

    public void i(C17296a.C2582a c2582a) {
        synchronized (this.f2138e) {
            c2582a.e(this.f2139f.a(), k.c.ALWAYS_OVERRIDE);
        }
    }

    public C17296a n() {
        C17296a c17296aC;
        synchronized (this.f2138e) {
            c17296aC = this.f2139f.c();
        }
        return c17296aC;
    }

    public void o(final boolean z10) {
        this.f2137d.execute(new Runnable() { // from class: B.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f2131a.p(z10);
            }
        });
    }

    public g(C17557u c17557u, Executor executor) {
        this.f2136c = c17557u;
        this.f2137d = executor;
    }

    public q<Void> g(j jVar) {
        h(jVar);
        return n.s(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: B.d
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return g.a(this.f2130a, aVar);
            }
        }));
    }

    public q<Void> j() {
        k();
        return n.s(androidx.concurrent.futures.c.a(new c.InterfaceC1101c() { // from class: B.f
            @Override // androidx.concurrent.futures.c.InterfaceC1101c
            public final Object a(c.a aVar) {
                return g.b(this.f2133a, aVar);
            }
        }));
    }
}
