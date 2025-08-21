package bg;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import cg.EnumC6506b;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
import dg.C13680a;
import dg.c;
import dg.i;
import dg.m;
import java.lang.ref.WeakReference;
import java.text.DecimalFormat;
import java.util.Collections;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import rc.InterfaceC16890j;

/* loaded from: classes8.dex */
public class k implements a.b {

    /* renamed from: r, reason: collision with root package name */
    private static final Wf.a f60352r = Wf.a.e();

    /* renamed from: s, reason: collision with root package name */
    private static final k f60353s = new k();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f60354a;

    /* renamed from: d, reason: collision with root package name */
    private com.google.firebase.f f60357d;

    /* renamed from: e, reason: collision with root package name */
    private Tf.d f60358e;

    /* renamed from: f, reason: collision with root package name */
    private Lf.e f60359f;

    /* renamed from: g, reason: collision with root package name */
    private Kf.b<InterfaceC16890j> f60360g;

    /* renamed from: h, reason: collision with root package name */
    private C6380b f60361h;

    /* renamed from: j, reason: collision with root package name */
    private Context f60363j;

    /* renamed from: k, reason: collision with root package name */
    private com.google.firebase.perf.config.a f60364k;

    /* renamed from: l, reason: collision with root package name */
    private C6382d f60365l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.firebase.perf.application.a f60366m;

    /* renamed from: n, reason: collision with root package name */
    private c.b f60367n;

    /* renamed from: o, reason: collision with root package name */
    private String f60368o;

    /* renamed from: p, reason: collision with root package name */
    private String f60369p;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue<C6381c> f60355b = new ConcurrentLinkedQueue<>();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f60356c = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    private boolean f60370q = false;

    /* renamed from: i, reason: collision with root package name */
    private ExecutorService f60362i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B() {
        /*
            r4 = this;
            com.google.firebase.perf.config.a r0 = r4.f60364k
            boolean r0 = r0.K()
            if (r0 == 0) goto L70
            dg.c$b r0 = r4.f60367n
            boolean r0 = r0.G()
            if (r0 == 0) goto L15
            boolean r0 = r4.f60370q
            if (r0 != 0) goto L15
            goto L70
        L15:
            Lf.e r0 = r4.f60359f     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            Vd.j r0 = r0.getId()     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = Vd.C5519m.b(r0, r2, r1)     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            java.lang.String r0 = (java.lang.String) r0     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            goto L5d
        L27:
            r0 = move-exception
            goto L2d
        L29:
            r0 = move-exception
            goto L3d
        L2b:
            r0 = move-exception
            goto L4d
        L2d:
            Wf.a r1 = bg.k.f60352r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is timed out: %s"
            r1.d(r2, r0)
            goto L5c
        L3d:
            Wf.a r1 = bg.k.f60352r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is interrupted: %s"
            r1.d(r2, r0)
            goto L5c
        L4d:
            Wf.a r1 = bg.k.f60352r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Unable to retrieve Installation Id: %s"
            r1.d(r2, r0)
        L5c:
            r0 = 0
        L5d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L69
            dg.c$b r1 = r4.f60367n
            r1.J(r0)
            goto L70
        L69:
            Wf.a r0 = bg.k.f60352r
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: bg.k.B():void");
    }

    private void C() {
        if (this.f60358e == null && u()) {
            this.f60358e = Tf.d.c();
        }
    }

    private void h() {
        this.f60366m.k(new WeakReference<>(f60353s));
        c.b bVarN0 = dg.c.n0();
        this.f60367n = bVarN0;
        bVarN0.L(this.f60357d.n().c()).I(C13680a.g0().G(this.f60368o).H(BuildConfig.FIREPERF_VERSION_NAME).I(p(this.f60363j)));
        this.f60356c.set(true);
        while (!this.f60355b.isEmpty()) {
            final C6381c c6381cPoll = this.f60355b.poll();
            if (c6381cPoll != null) {
                this.f60362i.execute(new Runnable() { // from class: bg.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b(this.f60350a, c6381cPoll);
                    }
                });
            }
        }
    }

    public static k k() {
        return f60353s;
    }

    private static String l(dg.g gVar) {
        return String.format(Locale.ENGLISH, "gauges (hasMetadata: %b, cpuGaugeCount: %d, memoryGaugeCount: %d)", Boolean.valueOf(gVar.m0()), Integer.valueOf(gVar.j0()), Integer.valueOf(gVar.i0()));
    }

    private static String p(Context context) {
        try {
            String str = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
            return str == null ? "" : str;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    private boolean s(dg.j jVar) {
        Integer num = this.f60354a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = this.f60354a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f60354a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (jVar.m() && iIntValue > 0) {
            this.f60354a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (jVar.j() && iIntValue2 > 0) {
            this.f60354a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!jVar.i() || iIntValue3 <= 0) {
            f60352r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), num, num2, num3);
            return false;
        }
        this.f60354a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    private boolean t(dg.i iVar) {
        if (!this.f60364k.K()) {
            f60352r.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        }
        if (!iVar.e0().j0()) {
            f60352r.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        }
        if (!Yf.e.b(iVar, this.f60363j)) {
            f60352r.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        }
        if (!this.f60365l.h(iVar)) {
            q(iVar);
            f60352r.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        }
        if (!this.f60365l.g(iVar)) {
            return true;
        }
        q(iVar);
        f60352r.g("Rate limited (per device) - %s", n(iVar));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        Context contextK = this.f60357d.k();
        this.f60363j = contextK;
        this.f60368o = contextK.getPackageName();
        this.f60364k = com.google.firebase.perf.config.a.g();
        this.f60365l = new C6382d(this.f60363j, new cg.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f60366m = com.google.firebase.perf.application.a.b();
        this.f60361h = new C6380b(this.f60360g, this.f60364k.a());
        h();
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(dg.d dVar) {
        this.f60370q = dVar == dg.d.FOREGROUND;
        if (u()) {
            this.f60362i.execute(new Runnable() { // from class: bg.e
                @Override // java.lang.Runnable
                public final void run() {
                    k kVar = this.f60339a;
                    kVar.f60365l.a(kVar.f60370q);
                }
            });
        }
    }

    public void r(com.google.firebase.f fVar, Lf.e eVar, Kf.b<InterfaceC16890j> bVar) {
        this.f60357d = fVar;
        this.f60369p = fVar.n().e();
        this.f60359f = eVar;
        this.f60360g = bVar;
        this.f60362i.execute(new Runnable() { // from class: bg.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f60349a.z();
            }
        });
    }

    public boolean u() {
        return this.f60356c.get();
    }

    public void v(final dg.g gVar, final dg.d dVar) {
        this.f60362i.execute(new Runnable() { // from class: bg.f
            @Override // java.lang.Runnable
            public final void run() {
                k.f(this.f60340a, gVar, dVar);
            }
        });
    }

    public void w(final dg.h hVar, final dg.d dVar) {
        this.f60362i.execute(new Runnable() { // from class: bg.h
            @Override // java.lang.Runnable
            public final void run() {
                k.d(this.f60346a, hVar, dVar);
            }
        });
    }

    public void x(final m mVar, final dg.d dVar) {
        this.f60362i.execute(new Runnable() { // from class: bg.g
            @Override // java.lang.Runnable
            public final void run() {
                k.c(this.f60343a, mVar, dVar);
            }
        });
    }

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f60354a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private void A(i.b bVar, dg.d dVar) {
        if (!u()) {
            if (s(bVar)) {
                f60352r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f60355b.add(new C6381c(bVar, dVar));
                return;
            }
            return;
        }
        dg.i iVarY = y(bVar, dVar);
        if (t(iVarY)) {
            g(iVarY);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    public static /* synthetic */ void b(k kVar, C6381c c6381c) {
        kVar.getClass();
        kVar.A(c6381c.f60319a, c6381c.f60320b);
    }

    public static /* synthetic */ void c(k kVar, m mVar, dg.d dVar) {
        kVar.getClass();
        kVar.A(dg.i.g0().J(mVar), dVar);
    }

    public static /* synthetic */ void d(k kVar, dg.h hVar, dg.d dVar) {
        kVar.getClass();
        kVar.A(dg.i.g0().I(hVar), dVar);
    }

    public static /* synthetic */ void f(k kVar, dg.g gVar, dg.d dVar) {
        kVar.getClass();
        kVar.A(dg.i.g0().H(gVar), dVar);
    }

    private void g(dg.i iVar) {
        if (iVar.m()) {
            f60352r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.n()));
        } else {
            f60352r.g("Logging %s", n(iVar));
        }
        this.f60361h.b(iVar);
    }

    private String i(m mVar) {
        String strX0 = mVar.x0();
        if (strX0.startsWith("_st_")) {
            return Wf.b.c(this.f60369p, this.f60368o, strX0);
        }
        return Wf.b.a(this.f60369p, this.f60368o, strX0);
    }

    private Map<String, String> j() {
        C();
        Tf.d dVar = this.f60358e;
        if (dVar != null) {
            return dVar.b();
        }
        return Collections.EMPTY_MAP;
    }

    private static String m(dg.h hVar) {
        long jZ0;
        String strValueOf;
        if (hVar.I0()) {
            jZ0 = hVar.z0();
        } else {
            jZ0 = 0;
        }
        if (hVar.E0()) {
            strValueOf = String.valueOf(hVar.t0());
        } else {
            strValueOf = "UNKNOWN";
        }
        return String.format(Locale.ENGLISH, "network request trace: %s (responseCode: %s, responseTime: %sms)", hVar.B0(), strValueOf, new DecimalFormat("#.####").format(jZ0 / 1000.0d));
    }

    private static String n(dg.j jVar) {
        if (jVar.m()) {
            return o(jVar.n());
        }
        if (jVar.j()) {
            return m(jVar.k());
        }
        if (jVar.i()) {
            return l(jVar.o());
        }
        return "log";
    }

    private static String o(m mVar) {
        return String.format(Locale.ENGLISH, "trace metric: %s (duration: %sms)", mVar.x0(), new DecimalFormat("#.####").format(mVar.u0() / 1000.0d));
    }

    private void q(dg.i iVar) {
        if (iVar.m()) {
            this.f60366m.d(EnumC6506b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (iVar.j()) {
            this.f60366m.d(EnumC6506b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private dg.i y(i.b bVar, dg.d dVar) {
        B();
        c.b bVarK = this.f60367n.K(dVar);
        if (bVar.m() || bVar.j()) {
            bVarK = bVarK.clone().H(j());
        }
        return bVar.G(bVarK).build();
    }
}
