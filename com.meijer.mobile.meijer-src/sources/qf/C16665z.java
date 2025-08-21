package qf;

import Vd.AbstractC5516j;
import android.content.Context;
import android.text.TextUtils;
import com.fullstory.FS;
import com.google.firebase.crashlytics.BuildConfig;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import nf.InterfaceC15938a;
import of.InterfaceC16119a;
import pf.InterfaceC16421a;
import pf.InterfaceC16422b;
import zf.C18478a;
import zf.C18480c;

/* renamed from: qf.z, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public class C16665z {

    /* renamed from: a, reason: collision with root package name */
    private final Context f158438a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f158439b;

    /* renamed from: c, reason: collision with root package name */
    private final F f158440c;

    /* renamed from: f, reason: collision with root package name */
    private C16640A f158443f;

    /* renamed from: g, reason: collision with root package name */
    private C16640A f158444g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f158445h;

    /* renamed from: i, reason: collision with root package name */
    private C16656p f158446i;

    /* renamed from: j, reason: collision with root package name */
    private final K f158447j;

    /* renamed from: k, reason: collision with root package name */
    private final wf.g f158448k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC16422b f158449l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC16119a f158450m;

    /* renamed from: n, reason: collision with root package name */
    private final C16653m f158451n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC15938a f158452o;

    /* renamed from: p, reason: collision with root package name */
    private final nf.l f158453p;

    /* renamed from: q, reason: collision with root package name */
    private final rf.i f158454q;

    /* renamed from: e, reason: collision with root package name */
    private final long f158442e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final P f158441d = new P();

    static boolean o(String str, boolean z10) {
        if (!z10) {
            nf.g.f().i("Configured not to require a build ID.");
            return true;
        }
        if (!TextUtils.isEmpty(str)) {
            return true;
        }
        FS.log_e("FirebaseCrashlytics", ".");
        FS.log_e("FirebaseCrashlytics", ".     |  | ");
        FS.log_e("FirebaseCrashlytics", ".     |  |");
        FS.log_e("FirebaseCrashlytics", ".     |  |");
        FS.log_e("FirebaseCrashlytics", ".   \\ |  | /");
        FS.log_e("FirebaseCrashlytics", ".    \\    /");
        FS.log_e("FirebaseCrashlytics", ".     \\  /");
        FS.log_e("FirebaseCrashlytics", ".      \\/");
        FS.log_e("FirebaseCrashlytics", ".");
        FS.log_e("FirebaseCrashlytics", "The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        FS.log_e("FirebaseCrashlytics", ".");
        FS.log_e("FirebaseCrashlytics", ".      /\\");
        FS.log_e("FirebaseCrashlytics", ".     /  \\");
        FS.log_e("FirebaseCrashlytics", ".    /    \\");
        FS.log_e("FirebaseCrashlytics", ".   / |  | \\");
        FS.log_e("FirebaseCrashlytics", ".     |  |");
        FS.log_e("FirebaseCrashlytics", ".     |  |");
        FS.log_e("FirebaseCrashlytics", ".     |  |");
        FS.log_e("FirebaseCrashlytics", ".");
        return false;
    }

    private void i() {
        try {
            this.f158445h = Boolean.TRUE.equals((Boolean) this.f158454q.common.c().submit(new Callable() { // from class: qf.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f158428a.f158446i.r());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f158445h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(yf.j jVar) {
        rf.i.c();
        s();
        try {
            try {
                this.f158449l.a(new InterfaceC16421a() { // from class: qf.x
                    @Override // pf.InterfaceC16421a
                    public final void a(String str) {
                        this.f158434a.p(str);
                    }
                });
                this.f158446i.Q();
                if (!jVar.b().f171386b.f171393a) {
                    nf.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f158446i.y(jVar)) {
                    nf.g.f().k("Previous sessions could not be finalized.");
                }
                this.f158446i.U(jVar.a());
                r();
            } catch (Exception e10) {
                nf.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                r();
            }
        } catch (Throwable th2) {
            r();
            throw th2;
        }
    }

    private void m(final yf.j jVar) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f158454q.common.c().submit(new Runnable() { // from class: qf.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f158432a.k(jVar);
            }
        });
        nf.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            nf.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            nf.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            nf.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String n() {
        return BuildConfig.VERSION_NAME;
    }

    boolean j() {
        return this.f158443f.c();
    }

    public AbstractC5516j<Void> l(final yf.j jVar) {
        return this.f158454q.common.d(new Runnable() { // from class: qf.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f158418a.k(jVar);
            }
        });
    }

    public void q(final Throwable th2, final Map<String, String> map) {
        this.f158454q.common.d(new Runnable() { // from class: qf.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f158425a.f158446i.X(Thread.currentThread(), th2, map);
            }
        });
    }

    public boolean t(C16641a c16641a, yf.j jVar) {
        if (!o(c16641a.f158327b, C16649i.i(this.f158438a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C16648h().c();
        try {
            this.f158444g = new C16640A("crash_marker", this.f158448k);
            this.f158443f = new C16640A("initialization_marker", this.f158448k);
            sf.p pVar = new sf.p(strC, this.f158448k, this.f158454q);
            sf.f fVar = new sf.f(this.f158448k);
            C18478a c18478a = new C18478a(1024, new C18480c(10));
            this.f158453p.b(pVar);
            this.f158446i = new C16656p(this.f158438a, this.f158447j, this.f158440c, this.f158448k, this.f158444g, c16641a, pVar, fVar, a0.j(this.f158438a, this.f158447j, this.f158448k, c16641a, fVar, pVar, c18478a, jVar, this.f158441d, this.f158451n, this.f158454q), this.f158452o, this.f158450m, this.f158451n, this.f158454q);
            boolean zJ = j();
            i();
            this.f158446i.w(strC, FS.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zJ || !C16649i.d(this.f158438a)) {
                nf.g.f().b("Successfully configured exception handler.");
                return true;
            }
            nf.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m(jVar);
            return false;
        } catch (Exception e10) {
            nf.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f158446i = null;
            return false;
        }
    }

    public void u(Boolean bool) {
        this.f158440c.h(bool);
    }

    public void v(final String str, final String str2) {
        this.f158454q.common.d(new Runnable() { // from class: qf.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f158422a.f158446i.R(str, str2);
            }
        });
    }

    public void w(final String str) {
        this.f158454q.common.d(new Runnable() { // from class: qf.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f158420a.f158446i.T(str);
            }
        });
    }

    public C16665z(com.google.firebase.f fVar, K k10, InterfaceC15938a interfaceC15938a, F f10, InterfaceC16422b interfaceC16422b, InterfaceC16119a interfaceC16119a, wf.g gVar, C16653m c16653m, nf.l lVar, rf.i iVar) {
        this.f158439b = fVar;
        this.f158440c = f10;
        this.f158438a = fVar.k();
        this.f158447j = k10;
        this.f158452o = interfaceC15938a;
        this.f158449l = interfaceC16422b;
        this.f158450m = interfaceC16119a;
        this.f158448k = gVar;
        this.f158451n = c16653m;
        this.f158453p = lVar;
        this.f158454q = iVar;
    }

    public void p(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f158442e;
        this.f158454q.common.d(new Runnable() { // from class: qf.v
            @Override // java.lang.Runnable
            public final void run() {
                C16665z c16665z = this.f158429a;
                c16665z.f158454q.diskWrite.d(new Runnable() { // from class: qf.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        c16665z.f158446i.Y(j, str);
                    }
                });
            }
        });
    }

    void r() {
        rf.i.c();
        try {
            if (!this.f158443f.d()) {
                nf.g.f().k("Initialization marker file was not properly removed.");
            }
        } catch (Exception e10) {
            nf.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    void s() {
        rf.i.c();
        this.f158443f.a();
        nf.g.f().i("Initialization marker file was created.");
    }
}
