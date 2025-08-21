package hh;

import android.content.Context;
import android.os.Handler;
import com.fullstory.FS;
import gh.s;

/* loaded from: classes8.dex */
public class g {

    /* renamed from: n, reason: collision with root package name */
    private static final String f135464n = "g";

    /* renamed from: a, reason: collision with root package name */
    private k f135465a;

    /* renamed from: b, reason: collision with root package name */
    private j f135466b;

    /* renamed from: c, reason: collision with root package name */
    private h f135467c;

    /* renamed from: d, reason: collision with root package name */
    private Handler f135468d;

    /* renamed from: e, reason: collision with root package name */
    private m f135469e;

    /* renamed from: h, reason: collision with root package name */
    private Handler f135472h;

    /* renamed from: f, reason: collision with root package name */
    private boolean f135470f = false;

    /* renamed from: g, reason: collision with root package name */
    private boolean f135471g = true;

    /* renamed from: i, reason: collision with root package name */
    private i f135473i = new i();

    /* renamed from: j, reason: collision with root package name */
    private Runnable f135474j = new a();

    /* renamed from: k, reason: collision with root package name */
    private Runnable f135475k = new b();

    /* renamed from: l, reason: collision with root package name */
    private Runnable f135476l = new c();

    /* renamed from: m, reason: collision with root package name */
    private Runnable f135477m = new d();

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f135464n, "Opening camera");
                g.this.f135467c.l();
            } catch (Exception e10) {
                g.this.q(e10);
                FS.log_e(g.f135464n, "Failed to open camera", e10);
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f135464n, "Configuring camera");
                g.this.f135467c.e();
                if (g.this.f135468d != null) {
                    g.this.f135468d.obtainMessage(Gg.k.f12573j, g.this.o()).sendToTarget();
                }
            } catch (Exception e10) {
                g.this.q(e10);
                FS.log_e(g.f135464n, "Failed to configure camera", e10);
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f135464n, "Starting preview");
                g.this.f135467c.s(g.this.f135466b);
                g.this.f135467c.u();
            } catch (Exception e10) {
                g.this.q(e10);
                FS.log_e(g.f135464n, "Failed to start preview", e10);
            }
        }
    }

    class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                FS.log_d(g.f135464n, "Closing camera");
                g.this.f135467c.v();
                g.this.f135467c.d();
            } catch (Exception e10) {
                FS.log_e(g.f135464n, "Failed to close camera", e10);
            }
            g.this.f135471g = true;
            g.this.f135468d.sendEmptyMessage(Gg.k.f12566c);
            g.this.f135465a.b();
        }
    }

    public static /* synthetic */ void c(final g gVar, final p pVar) {
        if (gVar.f135470f) {
            gVar.f135465a.c(new Runnable() { // from class: hh.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135462a.f135467c.m(pVar);
                }
            });
        } else {
            FS.log_d(f135464n, "Camera is closed, not requesting preview");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public gh.q o() {
        return this.f135467c.h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void q(Exception exc) {
        Handler handler = this.f135468d;
        if (handler != null) {
            handler.obtainMessage(Gg.k.f12567d, exc).sendToTarget();
        }
    }

    private void z() {
        if (!this.f135470f) {
            throw new IllegalStateException("CameraInstance is not open");
        }
    }

    public m n() {
        return this.f135469e;
    }

    public boolean p() {
        return this.f135471g;
    }

    public void s(final p pVar) {
        this.f135472h.post(new Runnable() { // from class: hh.d
            @Override // java.lang.Runnable
            public final void run() {
                g.c(this.f135458a, pVar);
            }
        });
    }

    public void t(i iVar) {
        if (this.f135470f) {
            return;
        }
        this.f135473i = iVar;
        this.f135467c.o(iVar);
    }

    public void u(m mVar) {
        this.f135469e = mVar;
        this.f135467c.q(mVar);
    }

    public void v(Handler handler) {
        this.f135468d = handler;
    }

    public void w(j jVar) {
        this.f135466b = jVar;
    }

    public g(Context context) {
        s.a();
        this.f135465a = k.d();
        h hVar = new h(context);
        this.f135467c = hVar;
        hVar.o(this.f135473i);
        this.f135472h = new Handler();
    }

    public void l() {
        s.a();
        if (this.f135470f) {
            this.f135465a.c(this.f135477m);
        } else {
            this.f135471g = true;
        }
        this.f135470f = false;
    }

    public void m() {
        s.a();
        z();
        this.f135465a.c(this.f135475k);
    }

    public void r() {
        s.a();
        this.f135470f = true;
        this.f135471g = false;
        this.f135465a.e(this.f135474j);
    }

    public void x(final boolean z10) {
        s.a();
        if (this.f135470f) {
            this.f135465a.c(new Runnable() { // from class: hh.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f135460a.f135467c.t(z10);
                }
            });
        }
    }

    public void y() {
        s.a();
        z();
        this.f135465a.c(this.f135476l);
    }
}
