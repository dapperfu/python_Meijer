package B;

import I.n;
import androidx.camera.core.CameraControl$OperationCanceledException;
import androidx.camera.core.impl.k;
import androidx.concurrent.futures.c;
import com.google.common.util.concurrent.q;
import java.util.concurrent.Executor;
import u.C17169a;
import v.C17418u;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: c, reason: collision with root package name */
    private final C17418u f1657c;

    /* renamed from: d, reason: collision with root package name */
    final Executor f1658d;

    /* renamed from: g, reason: collision with root package name */
    c.a<Void> f1661g;

    /* renamed from: a, reason: collision with root package name */
    private boolean f1655a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f1656b = false;

    /* renamed from: e, reason: collision with root package name */
    final Object f1659e = new Object();

    /* renamed from: f, reason: collision with root package name */
    private C17169a.C2558a f1660f = new C17169a.C2558a();

    /* JADX INFO: Access modifiers changed from: private */
    public void q(c.a<Void> aVar) {
        this.f1656b = true;
        m(new CameraControl$OperationCanceledException("Camera2CameraControl was updated with new options."));
        this.f1661g = aVar;
        if (this.f1655a) {
            r();
        }
    }

    public static /* synthetic */ Object a(final g gVar, final c.a aVar) {
        gVar.f1658d.execute(new Runnable() { // from class: B.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f1649a.q(aVar);
            }
        });
        return "addCaptureRequestOptions";
    }

    public static /* synthetic */ Object b(final g gVar, final c.a aVar) {
        gVar.f1658d.execute(new Runnable() { // from class: B.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f1646a.q(aVar);
            }
        });
        return "clearCaptureRequestOptions";
    }

    private void h(j jVar) {
        synchronized (this.f1659e) {
            this.f1660f.d(jVar);
        }
    }

    private void k() {
        synchronized (this.f1659e) {
            this.f1660f = new C17169a.C2558a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        c.a<Void> aVar = this.f1661g;
        if (aVar != null) {
            aVar.c(null);
            this.f1661g = null;
        }
    }

    private void m(Exception exc) {
        c.a<Void> aVar = this.f1661g;
        if (aVar != null) {
            if (exc == null) {
                exc = new Exception("Camera2CameraControl failed with unknown error.");
            }
            aVar.f(exc);
            this.f1661g = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p(boolean z10) {
        if (this.f1655a == z10) {
            return;
        }
        this.f1655a = z10;
        if (!z10) {
            m(new CameraControl$OperationCanceledException("The camera control has became inactive."));
        } else if (this.f1656b) {
            r();
        }
    }

    private void r() {
        this.f1657c.Y().addListener(new Runnable() { // from class: B.b
            @Override // java.lang.Runnable
            public final void run() {
                this.f1648a.l();
            }
        }, this.f1658d);
        this.f1656b = false;
    }

    public void i(C17169a.C2558a c2558a) {
        synchronized (this.f1659e) {
            c2558a.e(this.f1660f.a(), k.c.ALWAYS_OVERRIDE);
        }
    }

    public C17169a n() {
        C17169a c17169aC;
        synchronized (this.f1659e) {
            c17169aC = this.f1660f.c();
        }
        return c17169aC;
    }

    public void o(final boolean z10) {
        this.f1658d.execute(new Runnable() { // from class: B.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f1652a.p(z10);
            }
        });
    }

    public g(C17418u c17418u, Executor executor) {
        this.f1657c = c17418u;
        this.f1658d = executor;
    }

    public q<Void> g(j jVar) {
        h(jVar);
        return n.s(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: B.d
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return g.a(this.f1651a, aVar);
            }
        }));
    }

    public q<Void> j() {
        k();
        return n.s(androidx.concurrent.futures.c.a(new c.InterfaceC1088c() { // from class: B.f
            @Override // androidx.concurrent.futures.c.InterfaceC1088c
            public final Object a(c.a aVar) {
                return g.b(this.f1654a, aVar);
            }
        }));
    }
}
