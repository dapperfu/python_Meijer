package gh;

import android.content.Context;
import android.os.Handler;
import com.fullstory.FS;
import fh.s;

/* loaded from: classes7.dex */
public class g {

    /* renamed from: n, reason: collision with root package name */
    private static final String f133398n = "g";

    /* renamed from: a, reason: collision with root package name */
    private k f133399a;

    /* renamed from: b, reason: collision with root package name */
    private j f133400b;

    /* renamed from: c, reason: collision with root package name */
    private h f133401c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f133402d;

    /* renamed from: e, reason: collision with root package name */
    private m f133403e;

    /* renamed from: h, reason: collision with root package name */
    private Handler f133406h;

    /* renamed from: f, reason: collision with root package name */
    private boolean f133404f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f133405g = true;

    /* renamed from: i, reason: collision with root package name */
    private i f133407i = new i();

    /* renamed from: j, reason: collision with root package name */
    private Runnable f133408j = new a();

    /* renamed from: k, reason: collision with root package name */
    private Runnable f133409k = new b();

    /* renamed from: l, reason: collision with root package name */
    private Runnable f133410l = new c();

    /* renamed from: m, reason: collision with root package name */
    private Runnable f133411m = new d();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f133398n, "Opening camera");
                g.this.f133401c.l();
            } catch (Exception e10) {
                g.this.q(e10);
                FS.log_e(g.f133398n, "Failed to open camera", e10);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f133398n, "Configuring camera");
                g.this.f133401c.e();
                if (g.this.f133402d != null) {
                    g.this.f133402d.obtainMessage(Eg.k.f9021j, g.this.o()).sendToTarget();
                }
            } catch (Exception e10) {
                g.this.q(e10);
                FS.log_e(g.f133398n, "Failed to configure camera", e10);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f133398n, "Starting preview");
                g.this.f133401c.s(g.this.f133400b);
                g.this.f133401c.u();
            } catch (Exception e10) {
                g.this.q(e10);
                FS.log_e(g.f133398n, "Failed to start preview", e10);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f133398n, "Closing camera");
                g.this.f133401c.v();
                g.this.f133401c.d();
            } catch (Exception e10) {
                FS.log_e(g.f133398n, "Failed to close camera", e10);
            }
            g.this.f133405g = true;
            g.this.f133402d.sendEmptyMessage(Eg.k.f9014c);
            g.this.f133399a.b();
        }
    }

    public static /* synthetic */ void c(final g gVar, final p pVar) {
        if (gVar.f133404f) {
            gVar.f133399a.c(new Runnable() { // from class: gh.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133396a.f133401c.m(pVar);
                }
            });
        } else {
            FS.log_d(f133398n, "Camera is closed, not requesting preview");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public fh.q o() {
        return this.f133401c.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Exception exc) {
        Handler handler = this.f133402d;
        if (handler != null) {
            handler.obtainMessage(Eg.k.f9015d, exc).sendToTarget();
        }
    }

    private void z() {
        if (!this.f133404f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public m n() {
        return this.f133403e;
    }

    public boolean p() {
        return this.f133405g;
    }

    public void s(final p pVar) {
        this.f133406h.post(new Runnable() { // from class: gh.d
            @Override // java.lang.Runnable
            public final void run() {
                g.c(this.f133392a, pVar);
            }
        });
    }

    public void t(i iVar) {
        if (this.f133404f) {
            return;
        }
        this.f133407i = iVar;
        this.f133401c.o(iVar);
    }

    public void u(m mVar) {
        this.f133403e = mVar;
        this.f133401c.q(mVar);
    }

    public void v(Handler handler) {
        this.f133402d = handler;
    }

    public void w(j jVar) {
        this.f133400b = jVar;
    }

    public g(Context context) {
        s.a();
        this.f133399a = k.d();
        h hVar = new h(context);
        this.f133401c = hVar;
        hVar.o(this.f133407i);
        this.f133406h = new Handler();
    }

    public void l() {
        s.a();
        if (this.f133404f) {
            this.f133399a.c(this.f133411m);
        } else {
            this.f133405g = true;
        }
        this.f133404f = false;
    }

    public void m() {
        s.a();
        z();
        this.f133399a.c(this.f133409k);
    }

    public void r() {
        s.a();
        this.f133404f = true;
        this.f133405g = false;
        this.f133399a.e(this.f133408j);
    }

    public void x(final boolean z10) {
        s.a();
        if (this.f133404f) {
            this.f133399a.c(new Runnable() { // from class: gh.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f133394a.f133401c.t(z10);
                }
            });
        }
    }

    public void y() {
        s.a();
        z();
        this.f133399a.c(this.f133410l);
    }
}
