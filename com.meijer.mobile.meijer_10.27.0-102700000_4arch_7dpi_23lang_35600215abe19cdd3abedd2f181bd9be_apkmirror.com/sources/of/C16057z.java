package of;

import Td.AbstractC5232j;
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
import lf.InterfaceC15404a;
import mf.InterfaceC15609a;
import nf.InterfaceC15793a;
import nf.InterfaceC15794b;
import xf.C18041a;
import xf.C18043c;

/* renamed from: of.z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C16057z {

    /* renamed from: a, reason: collision with root package name */
    private final Context f153586a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.firebase.f f153587b;

    /* renamed from: c, reason: collision with root package name */
    private final F f153588c;

    /* renamed from: f, reason: collision with root package name */
    private C16032A f153591f;

    /* renamed from: g, reason: collision with root package name */
    private C16032A f153592g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f153593h;

    /* renamed from: i, reason: collision with root package name */
    private C16048p f153594i;

    /* renamed from: j, reason: collision with root package name */
    private final K f153595j;

    /* renamed from: k, reason: collision with root package name */
    private final uf.g f153596k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC15794b f153597l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC15609a f153598m;

    /* renamed from: n, reason: collision with root package name */
    private final C16045m f153599n;

    /* renamed from: o, reason: collision with root package name */
    private final InterfaceC15404a f153600o;

    /* renamed from: p, reason: collision with root package name */
    private final lf.l f153601p;

    /* renamed from: q, reason: collision with root package name */
    private final pf.i f153602q;

    /* renamed from: e, reason: collision with root package name */
    private final long f153590e = System.currentTimeMillis();

    /* renamed from: d, reason: collision with root package name */
    private final P f153589d = new P();

    static boolean o(String str, boolean z10) {
        if (!z10) {
            lf.g.f().i("Configured not to require a build ID.");
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
            this.f153593h = Boolean.TRUE.equals((Boolean) this.f153602q.common.c().submit(new Callable() { // from class: of.u
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    return Boolean.valueOf(this.f153576a.f153594i.r());
                }
            }).get(3L, TimeUnit.SECONDS));
        } catch (Exception unused) {
            this.f153593h = false;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void k(wf.j jVar) {
        pf.i.c();
        s();
        try {
            try {
                this.f153597l.a(new InterfaceC15793a() { // from class: of.x
                    @Override // nf.InterfaceC15793a
                    public final void a(String str) {
                        this.f153582a.p(str);
                    }
                });
                this.f153594i.Q();
                if (!jVar.b().f166064b.f166071a) {
                    lf.g.f().b("Collection of crash reports disabled in Crashlytics settings.");
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.f153594i.y(jVar)) {
                    lf.g.f().k("Previous sessions could not be finalized.");
                }
                this.f153594i.U(jVar.a());
                r();
            } catch (Exception e10) {
                lf.g.f().e("Crashlytics encountered a problem during asynchronous initialization.", e10);
                r();
            }
        } catch (Throwable th2) {
            r();
            throw th2;
        }
    }

    private void m(final wf.j jVar) throws ExecutionException, InterruptedException, TimeoutException {
        Future<?> futureSubmit = this.f153602q.common.c().submit(new Runnable() { // from class: of.w
            @Override // java.lang.Runnable
            public final void run() {
                this.f153580a.k(jVar);
            }
        });
        lf.g.f().b("Crashlytics detected incomplete initialization on previous app launch. Will initialize synchronously.");
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            lf.g.f().e("Crashlytics was interrupted during initialization.", e10);
            Thread.currentThread().interrupt();
        } catch (ExecutionException e11) {
            lf.g.f().e("Crashlytics encountered a problem during initialization.", e11);
        } catch (TimeoutException e12) {
            lf.g.f().e("Crashlytics timed out during initialization.", e12);
        }
    }

    public static String n() {
        return BuildConfig.VERSION_NAME;
    }

    boolean j() {
        return this.f153591f.c();
    }

    public AbstractC5232j<Void> l(final wf.j jVar) {
        return this.f153602q.common.d(new Runnable() { // from class: of.q
            @Override // java.lang.Runnable
            public final void run() {
                this.f153566a.k(jVar);
            }
        });
    }

    public void q(final Throwable th2, final Map<String, String> map) {
        this.f153602q.common.d(new Runnable() { // from class: of.t
            @Override // java.lang.Runnable
            public final void run() {
                this.f153573a.f153594i.X(Thread.currentThread(), th2, map);
            }
        });
    }

    public boolean t(C16033a c16033a, wf.j jVar) {
        if (!o(c16033a.f153475b, C16041i.i(this.f153586a, "com.crashlytics.RequireBuildId", true))) {
            throw new IllegalStateException("The Crashlytics build ID is missing. This occurs when the Crashlytics Gradle plugin is missing from your app's build configuration. Please review the Firebase Crashlytics onboarding instructions at https://firebase.google.com/docs/crashlytics/get-started?platform=android#add-plugin");
        }
        String strC = new C16040h().c();
        try {
            this.f153592g = new C16032A("crash_marker", this.f153596k);
            this.f153591f = new C16032A("initialization_marker", this.f153596k);
            qf.p pVar = new qf.p(strC, this.f153596k, this.f153602q);
            qf.f fVar = new qf.f(this.f153596k);
            C18041a c18041a = new C18041a(1024, new C18043c(10));
            this.f153601p.b(pVar);
            this.f153594i = new C16048p(this.f153586a, this.f153595j, this.f153588c, this.f153596k, this.f153592g, c16033a, pVar, fVar, a0.j(this.f153586a, this.f153595j, this.f153596k, c16033a, fVar, pVar, c18041a, jVar, this.f153589d, this.f153599n, this.f153602q), this.f153600o, this.f153598m, this.f153599n, this.f153602q);
            boolean zJ = j();
            i();
            this.f153594i.w(strC, FS.getDefaultUncaughtExceptionHandler(), jVar);
            if (!zJ || !C16041i.d(this.f153586a)) {
                lf.g.f().b("Successfully configured exception handler.");
                return true;
            }
            lf.g.f().b("Crashlytics did not finish previous background initialization. Initializing synchronously.");
            m(jVar);
            return false;
        } catch (Exception e10) {
            lf.g.f().e("Crashlytics was not started due to an exception during initialization", e10);
            this.f153594i = null;
            return false;
        }
    }

    public void u(Boolean bool) {
        this.f153588c.h(bool);
    }

    public void v(final String str, final String str2) {
        this.f153602q.common.d(new Runnable() { // from class: of.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f153570a.f153594i.R(str, str2);
            }
        });
    }

    public void w(final String str) {
        this.f153602q.common.d(new Runnable() { // from class: of.r
            @Override // java.lang.Runnable
            public final void run() {
                this.f153568a.f153594i.T(str);
            }
        });
    }

    public C16057z(com.google.firebase.f fVar, K k10, InterfaceC15404a interfaceC15404a, F f10, InterfaceC15794b interfaceC15794b, InterfaceC15609a interfaceC15609a, uf.g gVar, C16045m c16045m, lf.l lVar, pf.i iVar) {
        this.f153587b = fVar;
        this.f153588c = f10;
        this.f153586a = fVar.k();
        this.f153595j = k10;
        this.f153600o = interfaceC15404a;
        this.f153597l = interfaceC15794b;
        this.f153598m = interfaceC15609a;
        this.f153596k = gVar;
        this.f153599n = c16045m;
        this.f153601p = lVar;
        this.f153602q = iVar;
    }

    public void p(final String str) {
        final long jCurrentTimeMillis = System.currentTimeMillis() - this.f153590e;
        this.f153602q.common.d(new Runnable() { // from class: of.v
            @Override // java.lang.Runnable
            public final void run() {
                C16057z c16057z = this.f153577a;
                c16057z.f153602q.diskWrite.d(new Runnable() { // from class: of.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        c16057z.f153594i.Y(j, str);
                    }
                });
            }
        });
    }

    void r() {
        pf.i.c();
        try {
            if (!this.f153591f.d()) {
                lf.g.f().k("Initialization marker file was not properly removed.");
            }
        } catch (Exception e10) {
            lf.g.f().e("Problem encountered deleting Crashlytics initialization marker.", e10);
        }
    }

    void s() {
        pf.i.c();
        this.f153591f.a();
        lf.g.f().i("Initialization marker file was created.");
    }
}
