package com.bugsnag.android;

import Q6.ImmutableConfig;
import android.app.Application;
import android.content.Context;
import java.io.File;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.RejectedExecutionException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* renamed from: com.bugsnag.android.p, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6487p {

    /* renamed from: A, reason: collision with root package name */
    private final C6460b0 f63523A;

    /* renamed from: a, reason: collision with root package name */
    final ImmutableConfig f63524a;

    /* renamed from: b, reason: collision with root package name */
    final MetadataState f63525b;

    /* renamed from: c, reason: collision with root package name */
    final FeatureFlagState f63526c;

    /* renamed from: d, reason: collision with root package name */
    private final Q6.h f63527d;

    /* renamed from: e, reason: collision with root package name */
    private final C6506z f63528e;

    /* renamed from: f, reason: collision with root package name */
    private final CallbackState f63529f;

    /* renamed from: g, reason: collision with root package name */
    private final i1 f63530g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, Object> f63531h;

    /* renamed from: i, reason: collision with root package name */
    final Context f63532i;

    /* renamed from: j, reason: collision with root package name */
    final K f63533j;

    /* renamed from: k, reason: collision with root package name */
    final C6471h f63534k;

    /* renamed from: l, reason: collision with root package name */
    final BreadcrumbState f63535l;

    /* renamed from: m, reason: collision with root package name */
    final C6501w0 f63536m;

    /* renamed from: n, reason: collision with root package name */
    protected final C6458a0 f63537n;

    /* renamed from: o, reason: collision with root package name */
    final O0 f63538o;

    /* renamed from: p, reason: collision with root package name */
    final X0 f63539p;

    /* renamed from: q, reason: collision with root package name */
    final InterfaceC6495t0 f63540q;

    /* renamed from: r, reason: collision with root package name */
    final InterfaceC6498v f63541r;

    /* renamed from: s, reason: collision with root package name */
    final E f63542s;

    /* renamed from: t, reason: collision with root package name */
    final r f63543t;

    /* renamed from: u, reason: collision with root package name */
    J0 f63544u;

    /* renamed from: v, reason: collision with root package name */
    final B0 f63545v;

    /* renamed from: w, reason: collision with root package name */
    final LastRunInfo f63546w;

    /* renamed from: x, reason: collision with root package name */
    final C6490q0 f63547x;

    /* renamed from: y, reason: collision with root package name */
    final C6491r0 f63548y;

    /* renamed from: z, reason: collision with root package name */
    final Q6.a f63549z;

    /* renamed from: com.bugsnag.android.p$a */
    class a implements Function2<Boolean, String, Unit> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(Boolean bool, String str) {
            HashMap map = new HashMap();
            map.put("hasConnection", bool);
            map.put("networkState", str);
            C6487p.this.w("Connectivity changed", BreadcrumbType.STATE, map);
            if (!bool.booleanValue()) {
                return null;
            }
            C6487p.this.f63537n.l();
            C6487p.this.f63538o.c();
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.p$b */
    class b implements Function2<String, Map<String, ? extends Object>, Unit> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(String str, Map<String, ?> map) {
            C6487p.this.x(str, map, BreadcrumbType.STATE);
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.p$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6487p.this.f63541r.a();
            C6487p c6487p = C6487p.this;
            X0.d(c6487p.f63532i, c6487p.f63539p, c6487p.f63540q);
        }
    }

    /* renamed from: com.bugsnag.android.p$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LastRunInfo f63553a;

        d(LastRunInfo lastRunInfo) {
            this.f63553a = lastRunInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6487p.this.f63547x.f(this.f63553a);
        }
    }

    /* renamed from: com.bugsnag.android.p$e */
    class e implements Function2<String, String, Unit> {
        e() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(String str, String str2) {
            HashMap map = new HashMap();
            map.put("from", str);
            map.put("to", str2);
            C6487p.this.w("Orientation changed", BreadcrumbType.STATE, map);
            C6487p.this.f63543t.c(str2);
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.p$f */
    class f implements Function2<Boolean, Integer, Unit> {
        f() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(Boolean bool, Integer num) {
            C6487p.this.f63536m.e(Boolean.TRUE.equals(bool));
            if (C6487p.this.f63536m.f(num)) {
                C6487p c6487p = C6487p.this;
                c6487p.w("Trim Memory", BreadcrumbType.STATE, Collections.singletonMap("trimLevel", c6487p.f63536m.c()));
            }
            C6487p.this.f63536m.b();
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.p$g */
    class g implements Callable<Boolean> {
        g() {
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Boolean call() {
            boolean z10;
            File nativeReportPath = NativeInterface.getNativeReportPath();
            if (!nativeReportPath.exists() && !nativeReportPath.mkdirs()) {
                z10 = false;
            } else {
                z10 = true;
            }
            return Boolean.valueOf(z10);
        }
    }

    public void B(Throwable th2) {
        C(th2, null);
    }

    public C6487p(Context context, C6496u c6496u) {
        C6501w0 c6501w0 = new C6501w0();
        this.f63536m = c6501w0;
        Q6.a aVar = new Q6.a();
        this.f63549z = aVar;
        R6.b bVar = new R6.b(context);
        Context contextD = bVar.getCtx();
        this.f63532i = contextD;
        B0 b0T = c6496u.t();
        this.f63545v = b0T;
        C6502x c6502x = new C6502x(contextD, new a());
        this.f63541r = c6502x;
        R6.a aVar2 = new R6.a(bVar, c6496u, c6502x);
        ImmutableConfig fVarD = aVar2.getConfig();
        this.f63524a = fVarD;
        InterfaceC6495t0 interfaceC6495t0O = fVarD.getLogger();
        this.f63540q = interfaceC6495t0O;
        if (!(context instanceof Application)) {
            interfaceC6495t0O.g("You should initialize Bugsnag from the onCreate() callback of your Application subclass, as this guarantees errors are captured as early as possible. If a custom Application subclass is not possible in your app then you should suppress this warning by passing the Application context instead: Bugsnag.start(context.getApplicationContext()). For further info see: https://docs.bugsnag.com/platforms/android/#basic-configuration");
        }
        U0 u02 = new U0(contextD, fVarD, interfaceC6495t0O);
        C6483n c6483n = new C6483n(fVarD, c6496u);
        this.f63543t = c6483n.getClientObservable();
        CallbackState c6485oF = c6483n.getCallbackState();
        this.f63529f = c6485oF;
        this.f63535l = c6483n.getBreadcrumbState();
        this.f63528e = c6483n.getContextState();
        this.f63525b = c6483n.getMetadataState();
        this.f63526c = c6483n.getFeatureFlagState();
        R6.d dVar = new R6.d(bVar);
        Q6.n nVar = Q6.n.IO;
        u02.c(aVar, nVar);
        f1 f1Var = new f1(aVar2, u02, this, aVar, c6485oF);
        this.f63548y = f1Var.getLaunchCrashTracker();
        this.f63538o = f1Var.getSessionTracker();
        A a10 = new A(bVar, aVar2, dVar, f1Var, aVar, c6502x, u02.e(), u02.g(), c6501w0);
        a10.c(aVar, nVar);
        this.f63534k = a10.j();
        this.f63533j = a10.k();
        this.f63530g = u02.l().a(c6496u.D());
        u02.k().b();
        Z z10 = new Z(bVar, aVar2, a10, aVar, f1Var, dVar, b0T, c6485oF);
        z10.c(aVar, nVar);
        C6458a0 c6458a0G = z10.g();
        this.f63537n = c6458a0G;
        this.f63542s = new E(interfaceC6495t0O, c6458a0G, fVarD, c6485oF, b0T, aVar);
        this.f63523A = new C6460b0(this, interfaceC6495t0O);
        this.f63547x = u02.i();
        this.f63546w = u02.h();
        this.f63544u = new J0(c6496u.w(), fVarD, interfaceC6495t0O);
        if (c6496u.C().contains(Y0.USAGE)) {
            this.f63527d = new Q6.i();
        } else {
            this.f63527d = new Q6.j();
        }
        this.f63531h = c6496u.f63612a.g();
        this.f63539p = new X0(this, interfaceC6495t0O);
        U();
    }

    private void G(LastRunInfo lastRunInfo) {
        try {
            this.f63549z.c(Q6.n.IO, new d(lastRunInfo));
        } catch (RejectedExecutionException e10) {
            this.f63540q.b("Failed to persist last run info", e10);
        }
    }

    private void I() {
        this.f63532i.registerComponentCallbacks(new ComponentCallbacks2C6489q(this.f63533j, new e(), new f()));
    }

    private boolean S() {
        try {
            return ((Boolean) this.f63549z.d(Q6.n.IO, new g()).get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private void U() {
        if (this.f63524a.getEnabledErrorTypes().getUnhandledExceptions()) {
            this.f63523A.b();
        }
        NativeInterface.setClient(this);
        this.f63544u.e(this);
        C6507z0 c6507z0 = C6507z0.f63642j;
        c6507z0.f(this.f63544u.getNdkPlugin());
        if (this.f63524a.C().contains(Y0.USAGE)) {
            c6507z0.e(true);
        }
        this.f63537n.o();
        this.f63537n.l();
        this.f63538o.c();
        this.f63527d.c(this.f63531h);
        this.f63529f.g(this.f63527d);
        J();
        I();
        K();
        w("Bugsnag loaded", BreadcrumbType.STATE, new HashMap());
        this.f63540q.d("Bugsnag loaded");
    }

    private void z(String str) {
        this.f63540q.e("Invalid null value supplied to client." + str + ", ignoring");
    }

    public void A() {
        this.f63548y.b();
    }

    public void C(Throwable th2, F0 f02) {
        if (th2 == null) {
            z("notify");
        } else {
            if (this.f63524a.J(th2)) {
                return;
            }
            H(new V(th2, this.f63524a, P0.h("handledException"), this.f63525b.getMetadata(), this.f63526c.getFeatureFlags(), this.f63540q), f02);
        }
    }

    void D(V v10, F0 f02) {
        v10.q(this.f63525b.getMetadata().j());
        K0 k0H = this.f63538o.h();
        if (k0H != null && (this.f63524a.getAutoTrackSessions() || !k0H.i())) {
            v10.r(k0H);
        }
        if (!this.f63529f.c(v10, this.f63540q) || (f02 != null && !f02.a(v10))) {
            this.f63540q.d("Skipping notification - onError task returned false");
        } else {
            y(v10);
            this.f63542s.c(v10);
        }
    }

    void E(Throwable th2, Metadata c6503x0, String str, String str2) {
        H(new V(th2, this.f63524a, P0.i(str, Severity.ERROR, str2), Metadata.INSTANCE.b(this.f63525b.getMetadata(), c6503x0), this.f63526c.getFeatureFlags(), this.f63540q), null);
        LastRunInfo lastRunInfo = this.f63546w;
        int consecutiveLaunchCrashes = lastRunInfo == null ? 0 : lastRunInfo.getConsecutiveLaunchCrashes();
        boolean zA = this.f63548y.a();
        if (zA) {
            consecutiveLaunchCrashes++;
        }
        G(new LastRunInfo(consecutiveLaunchCrashes, true, zA));
        this.f63549z.b();
    }

    public void F() {
        this.f63538o.o();
    }

    void H(V v10, F0 f02) {
        v10.o(this.f63533j.h(new Date().getTime()));
        v10.b("device", this.f63533j.j());
        v10.l(this.f63534k.e());
        v10.b("app", this.f63534k.f());
        v10.m(this.f63535l.copy());
        h1 h1VarB = this.f63530g.getUser();
        v10.s(h1VarB.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), h1VarB.getEmail(), h1VarB.getName());
        v10.n(this.f63528e.b());
        v10.p(this.f63527d);
        D(v10, f02);
    }

    void J() {
        Context context = this.f63532i;
        if (context instanceof Application) {
            Application application = (Application) context;
            application.registerActivityLifecycleCallbacks(new M0(this.f63538o));
            if (this.f63524a.E(BreadcrumbType.STATE)) {
                return;
            }
            application.registerActivityLifecycleCallbacks(new C6457a(new b()));
        }
    }

    void K() {
        try {
            this.f63549z.c(Q6.n.DEFAULT, new c());
        } catch (RejectedExecutionException e10) {
            this.f63540q.b("Failed to register for system events", e10);
        }
    }

    void L(Q6.l lVar) {
        this.f63525b.removeObserver(lVar);
        this.f63535l.removeObserver(lVar);
        this.f63538o.removeObserver(lVar);
        this.f63543t.removeObserver(lVar);
        this.f63530g.removeObserver(lVar);
        this.f63528e.removeObserver(lVar);
        this.f63542s.removeObserver(lVar);
        this.f63548y.removeObserver(lVar);
        this.f63536m.removeObserver(lVar);
        this.f63526c.removeObserver(lVar);
    }

    public boolean M() {
        return this.f63538o.q();
    }

    void N(boolean z10) {
        this.f63544u.f(this, z10);
    }

    void O(boolean z10) {
        this.f63544u.g(this, z10);
        if (z10) {
            this.f63523A.b();
        } else {
            this.f63523A.c();
        }
    }

    public void Q(String str) {
        this.f63528e.d(str);
    }

    public void R(String str, String str2, String str3) {
        this.f63530g.c(new h1(str, str2, str3));
    }

    public void V() {
        this.f63538o.s(false);
    }

    void W() {
        this.f63525b.f();
        this.f63528e.a();
        this.f63530g.a();
        this.f63536m.b();
        this.f63526c.b();
    }

    public void a(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            z("addMetadata");
        } else {
            this.f63525b.a(str, str2, obj);
        }
    }

    public void b(String str, Map<String, ?> map) {
        if (str == null || map == null) {
            z("addMetadata");
        } else {
            this.f63525b.b(str, map);
        }
    }

    void c(Q6.l lVar) {
        this.f63525b.addObserver(lVar);
        this.f63535l.addObserver(lVar);
        this.f63538o.addObserver(lVar);
        this.f63543t.addObserver(lVar);
        this.f63530g.addObserver(lVar);
        this.f63528e.addObserver(lVar);
        this.f63542s.addObserver(lVar);
        this.f63548y.addObserver(lVar);
        this.f63536m.addObserver(lVar);
        this.f63526c.addObserver(lVar);
    }

    public void d(String str) {
        if (str != null) {
            this.f63525b.c(str);
        } else {
            z("clearMetadata");
        }
    }

    public void e(String str, String str2) {
        if (str == null || str2 == null) {
            z("clearMetadata");
        } else {
            this.f63525b.d(str, str2);
        }
    }

    Context f() {
        return this.f63532i;
    }

    protected void finalize() throws Throwable {
        X0 x02 = this.f63539p;
        if (x02 != null) {
            try {
                C6504y.f(this.f63532i, x02, this.f63540q);
            } catch (IllegalArgumentException unused) {
                this.f63540q.g("Receiver not registered");
            }
        }
        super.finalize();
    }

    C6471h g() {
        return this.f63534k;
    }

    public List<Breadcrumb> h() {
        return this.f63535l.copy();
    }

    ImmutableConfig i() {
        return this.f63524a;
    }

    public String j() {
        return this.f63528e.b();
    }

    C6506z k() {
        return this.f63528e;
    }

    K l() {
        return this.f63533j;
    }

    C6458a0 m() {
        return this.f63537n;
    }

    FeatureFlagState n() {
        return this.f63526c;
    }

    public LastRunInfo o() {
        return this.f63546w;
    }

    InterfaceC6495t0 p() {
        return this.f63540q;
    }

    Map<String, Object> q() {
        return this.f63525b.getMetadata().n();
    }

    MetadataState r() {
        return this.f63525b;
    }

    B0 s() {
        return this.f63545v;
    }

    I0 t(Class cls) {
        return this.f63544u.a(cls);
    }

    O0 u() {
        return this.f63538o;
    }

    public h1 v() {
        return this.f63530g.getUser();
    }

    void w(String str, BreadcrumbType breadcrumbType, Map<String, Object> map) {
        if (this.f63524a.E(breadcrumbType)) {
            return;
        }
        this.f63535l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f63540q));
    }

    public void x(String str, Map<String, Object> map, BreadcrumbType breadcrumbType) {
        if (str == null || breadcrumbType == null || map == null) {
            z("leaveBreadcrumb");
        } else {
            this.f63535l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f63540q));
        }
    }

    private void y(V v10) {
        List<S> listE = v10.e();
        if (listE.size() > 0) {
            String strB = listE.get(0).b();
            String strC = listE.get(0).c();
            HashMap map = new HashMap();
            map.put("errorClass", strB);
            map.put("message", strC);
            map.put("unhandled", String.valueOf(v10.j()));
            map.put("severity", v10.h().toString());
            this.f63535l.add(new Breadcrumb(strB, BreadcrumbType.ERROR, map, new Date(), this.f63540q));
        }
    }

    void P(String str) {
        g().k(str);
    }

    void T() {
        int consecutiveLaunchCrashes;
        if (!S()) {
            this.f63540q.g("Failed to setup NDK directory.");
            return;
        }
        String absolutePath = this.f63547x.getFile().getAbsolutePath();
        LastRunInfo lastRunInfo = this.f63546w;
        if (lastRunInfo != null) {
            consecutiveLaunchCrashes = lastRunInfo.getConsecutiveLaunchCrashes();
        } else {
            consecutiveLaunchCrashes = 0;
        }
        this.f63543t.b(this.f63524a, absolutePath, consecutiveLaunchCrashes);
        W();
        this.f63543t.a();
    }
}
