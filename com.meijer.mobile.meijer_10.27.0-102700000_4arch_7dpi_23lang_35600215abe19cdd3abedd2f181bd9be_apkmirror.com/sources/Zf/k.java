package Zf;

import ag.EnumC5600b;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import bg.C6249a;
import bg.c;
import bg.i;
import bg.m;
import com.google.firebase.perf.BuildConfig;
import com.google.firebase.perf.application.a;
import com.google.firebase.perf.session.SessionManager;
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
import pc.InterfaceC16286j;

/* loaded from: classes7.dex */
public class k implements a.b {

    /* renamed from: r, reason: collision with root package name */
    private static final Uf.a f42685r = Uf.a.e();

    /* renamed from: s, reason: collision with root package name */
    private static final k f42686s = new k();

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, Integer> f42687a;

    /* renamed from: d, reason: collision with root package name */
    private com.google.firebase.f f42690d;

    /* renamed from: e, reason: collision with root package name */
    private Rf.d f42691e;

    /* renamed from: f, reason: collision with root package name */
    private Jf.e f42692f;

    /* renamed from: g, reason: collision with root package name */
    private If.b<InterfaceC16286j> f42693g;

    /* renamed from: h, reason: collision with root package name */
    private b f42694h;

    /* renamed from: j, reason: collision with root package name */
    private Context f42696j;

    /* renamed from: k, reason: collision with root package name */
    private com.google.firebase.perf.config.a f42697k;

    /* renamed from: l, reason: collision with root package name */
    private d f42698l;

    /* renamed from: m, reason: collision with root package name */
    private com.google.firebase.perf.application.a f42699m;

    /* renamed from: n, reason: collision with root package name */
    private c.b f42700n;

    /* renamed from: o, reason: collision with root package name */
    private String f42701o;

    /* renamed from: p, reason: collision with root package name */
    private String f42702p;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentLinkedQueue<c> f42688b = new ConcurrentLinkedQueue<>();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f42689c = new AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    private boolean f42703q = false;

    /* renamed from: i, reason: collision with root package name */
    private ExecutorService f42695i = new ThreadPoolExecutor(0, 1, 10, TimeUnit.SECONDS, new LinkedBlockingQueue());

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0069  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void B() {
        /*
            r4 = this;
            com.google.firebase.perf.config.a r0 = r4.f42697k
            boolean r0 = r0.K()
            if (r0 == 0) goto L70
            bg.c$b r0 = r4.f42700n
            boolean r0 = r0.G()
            if (r0 == 0) goto L15
            boolean r0 = r4.f42703q
            if (r0 != 0) goto L15
            goto L70
        L15:
            Jf.e r0 = r4.f42692f     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            Td.j r0 = r0.getId()     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
            r2 = 60000(0xea60, double:2.9644E-319)
            java.lang.Object r0 = Td.C5235m.b(r0, r2, r1)     // Catch: java.util.concurrent.TimeoutException -> L27 java.lang.InterruptedException -> L29 java.util.concurrent.ExecutionException -> L2b
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
            Uf.a r1 = Zf.k.f42685r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is timed out: %s"
            r1.d(r2, r0)
            goto L5c
        L3d:
            Uf.a r1 = Zf.k.f42685r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Task to retrieve Installation Id is interrupted: %s"
            r1.d(r2, r0)
            goto L5c
        L4d:
            Uf.a r1 = Zf.k.f42685r
            java.lang.String r0 = r0.getMessage()
            java.lang.Object[] r0 = new java.lang.Object[]{r0}
            java.lang.String r2 = "Unable to retrieve Installation Id: %s"
            r1.d(r2, r0)
        L5c:
            r0 = 0
        L5d:
            boolean r1 = android.text.TextUtils.isEmpty(r0)
            if (r1 != 0) goto L69
            bg.c$b r1 = r4.f42700n
            r1.J(r0)
            goto L70
        L69:
            Uf.a r0 = Zf.k.f42685r
            java.lang.String r1 = "Firebase Installation Id is empty, contact Firebase Support for debugging."
            r0.j(r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: Zf.k.B():void");
    }

    private void C() {
        if (this.f42691e == null && u()) {
            this.f42691e = Rf.d.c();
        }
    }

    private void h() {
        this.f42699m.k(new WeakReference<>(f42686s));
        c.b bVarN0 = bg.c.n0();
        this.f42700n = bVarN0;
        bVarN0.L(this.f42690d.n().c()).I(C6249a.g0().G(this.f42701o).H(BuildConfig.FIREPERF_VERSION_NAME).I(p(this.f42696j)));
        this.f42689c.set(true);
        while (!this.f42688b.isEmpty()) {
            final c cVarPoll = this.f42688b.poll();
            if (cVarPoll != null) {
                this.f42695i.execute(new Runnable() { // from class: Zf.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        k.b(this.f42683a, cVarPoll);
                    }
                });
            }
        }
    }

    public static k k() {
        return f42686s;
    }

    private static String l(bg.g gVar) {
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

    private boolean s(bg.j jVar) {
        Integer num = this.f42687a.get("KEY_AVAILABLE_TRACES_FOR_CACHING");
        int iIntValue = num.intValue();
        Integer num2 = this.f42687a.get("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING");
        int iIntValue2 = num2.intValue();
        Integer num3 = this.f42687a.get("KEY_AVAILABLE_GAUGES_FOR_CACHING");
        int iIntValue3 = num3.intValue();
        if (jVar.m() && iIntValue > 0) {
            this.f42687a.put("KEY_AVAILABLE_TRACES_FOR_CACHING", Integer.valueOf(iIntValue - 1));
            return true;
        }
        if (jVar.j() && iIntValue2 > 0) {
            this.f42687a.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", Integer.valueOf(iIntValue2 - 1));
            return true;
        }
        if (!jVar.i() || iIntValue3 <= 0) {
            f42685r.b("%s is not allowed to cache. Cache exhausted the limit (availableTracesForCaching: %d, availableNetworkRequestsForCaching: %d, availableGaugesForCaching: %d).", n(jVar), num, num2, num3);
            return false;
        }
        this.f42687a.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", Integer.valueOf(iIntValue3 - 1));
        return true;
    }

    private boolean t(bg.i iVar) {
        if (!this.f42697k.K()) {
            f42685r.g("Performance collection is not enabled, dropping %s", n(iVar));
            return false;
        }
        if (!iVar.e0().j0()) {
            f42685r.k("App Instance ID is null or empty, dropping %s", n(iVar));
            return false;
        }
        if (!Wf.e.b(iVar, this.f42696j)) {
            f42685r.k("Unable to process the PerfMetric (%s) due to missing or invalid values. See earlier log statements for additional information on the specific missing/invalid values.", n(iVar));
            return false;
        }
        if (!this.f42698l.h(iVar)) {
            q(iVar);
            f42685r.g("Event dropped due to device sampling - %s", n(iVar));
            return false;
        }
        if (!this.f42698l.g(iVar)) {
            return true;
        }
        q(iVar);
        f42685r.g("Rate limited (per device) - %s", n(iVar));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void z() {
        Context contextK = this.f42690d.k();
        this.f42696j = contextK;
        this.f42701o = contextK.getPackageName();
        this.f42697k = com.google.firebase.perf.config.a.g();
        this.f42698l = new d(this.f42696j, new ag.i(100L, 1L, TimeUnit.MINUTES), 500L);
        this.f42699m = com.google.firebase.perf.application.a.b();
        this.f42694h = new b(this.f42693g, this.f42697k.a());
        h();
    }

    @Override // com.google.firebase.perf.application.a.b
    public void onUpdateAppState(bg.d dVar) {
        this.f42703q = dVar == bg.d.FOREGROUND;
        if (u()) {
            this.f42695i.execute(new Runnable() { // from class: Zf.e
                @Override // java.lang.Runnable
                public final void run() {
                    k kVar = this.f42672a;
                    kVar.f42698l.a(kVar.f42703q);
                }
            });
        }
    }

    public void r(com.google.firebase.f fVar, Jf.e eVar, If.b<InterfaceC16286j> bVar) {
        this.f42690d = fVar;
        this.f42702p = fVar.n().e();
        this.f42692f = eVar;
        this.f42693g = bVar;
        this.f42695i.execute(new Runnable() { // from class: Zf.i
            @Override // java.lang.Runnable
            public final void run() {
                this.f42682a.z();
            }
        });
    }

    public boolean u() {
        return this.f42689c.get();
    }

    public void v(final bg.g gVar, final bg.d dVar) {
        this.f42695i.execute(new Runnable() { // from class: Zf.f
            @Override // java.lang.Runnable
            public final void run() {
                k.f(this.f42673a, gVar, dVar);
            }
        });
    }

    public void w(final bg.h hVar, final bg.d dVar) {
        this.f42695i.execute(new Runnable() { // from class: Zf.h
            @Override // java.lang.Runnable
            public final void run() {
                k.d(this.f42679a, hVar, dVar);
            }
        });
    }

    public void x(final m mVar, final bg.d dVar) {
        this.f42695i.execute(new Runnable() { // from class: Zf.g
            @Override // java.lang.Runnable
            public final void run() {
                k.c(this.f42676a, mVar, dVar);
            }
        });
    }

    @SuppressLint({"ThreadPoolCreation"})
    private k() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        this.f42687a = concurrentHashMap;
        concurrentHashMap.put("KEY_AVAILABLE_TRACES_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_NETWORK_REQUESTS_FOR_CACHING", 50);
        concurrentHashMap.put("KEY_AVAILABLE_GAUGES_FOR_CACHING", 50);
    }

    private void A(i.b bVar, bg.d dVar) {
        if (!u()) {
            if (s(bVar)) {
                f42685r.b("Transport is not initialized yet, %s will be queued for to be dispatched later", n(bVar));
                this.f42688b.add(new c(bVar, dVar));
                return;
            }
            return;
        }
        bg.i iVarY = y(bVar, dVar);
        if (t(iVarY)) {
            g(iVarY);
            SessionManager.getInstance().stopGaugeCollectionIfSessionRunningTooLong();
        }
    }

    public static /* synthetic */ void b(k kVar, c cVar) {
        kVar.getClass();
        kVar.A(cVar.f42652a, cVar.f42653b);
    }

    public static /* synthetic */ void c(k kVar, m mVar, bg.d dVar) {
        kVar.getClass();
        kVar.A(bg.i.g0().J(mVar), dVar);
    }

    public static /* synthetic */ void d(k kVar, bg.h hVar, bg.d dVar) {
        kVar.getClass();
        kVar.A(bg.i.g0().I(hVar), dVar);
    }

    public static /* synthetic */ void f(k kVar, bg.g gVar, bg.d dVar) {
        kVar.getClass();
        kVar.A(bg.i.g0().H(gVar), dVar);
    }

    private void g(bg.i iVar) {
        if (iVar.m()) {
            f42685r.g("Logging %s. In a minute, visit the Firebase console to view your data: %s", n(iVar), i(iVar.n()));
        } else {
            f42685r.g("Logging %s", n(iVar));
        }
        this.f42694h.b(iVar);
    }

    private String i(m mVar) {
        String strX0 = mVar.x0();
        if (strX0.startsWith("_st_")) {
            return Uf.b.c(this.f42702p, this.f42701o, strX0);
        }
        return Uf.b.a(this.f42702p, this.f42701o, strX0);
    }

    private Map<String, String> j() {
        C();
        Rf.d dVar = this.f42691e;
        if (dVar != null) {
            return dVar.b();
        }
        return Collections.EMPTY_MAP;
    }

    private static String m(bg.h hVar) {
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

    private static String n(bg.j jVar) {
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

    private void q(bg.i iVar) {
        if (iVar.m()) {
            this.f42699m.d(EnumC5600b.TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        } else if (iVar.j()) {
            this.f42699m.d(EnumC5600b.NETWORK_TRACE_EVENT_RATE_LIMITED.toString(), 1L);
        }
    }

    private bg.i y(i.b bVar, bg.d dVar) {
        B();
        c.b bVarK = this.f42700n.K(dVar);
        if (bVar.m() || bVar.j()) {
            bVarK = bVarK.clone().H(j());
        }
        return bVar.G(bVarK).build();
    }
}
