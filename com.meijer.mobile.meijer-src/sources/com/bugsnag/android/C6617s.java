package com.bugsnag.android;

import R6.ImmutableConfig;
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

/* renamed from: com.bugsnag.android.s, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C6617s {

    /* renamed from: A, reason: collision with root package name */
    private final C6605l0 f64359A;

    /* renamed from: a, reason: collision with root package name */
    final ImmutableConfig f64360a;

    /* renamed from: b, reason: collision with root package name */
    final MetadataState f64361b;

    /* renamed from: c, reason: collision with root package name */
    final FeatureFlagState f64362c;

    /* renamed from: d, reason: collision with root package name */
    private final R6.m f64363d;

    /* renamed from: e, reason: collision with root package name */
    private final C f64364e;

    /* renamed from: f, reason: collision with root package name */
    private final CallbackState f64365f;

    /* renamed from: g, reason: collision with root package name */
    private final S6.d<t1> f64366g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, Object> f64367h;

    /* renamed from: i, reason: collision with root package name */
    final Context f64368i;

    /* renamed from: j, reason: collision with root package name */
    final Q f64369j;

    /* renamed from: k, reason: collision with root package name */
    final C6602k f64370k;

    /* renamed from: l, reason: collision with root package name */
    final BreadcrumbState f64371l;

    /* renamed from: m, reason: collision with root package name */
    final G0 f64372m;

    /* renamed from: n, reason: collision with root package name */
    private final S6.d<C6603k0> f64373n;

    /* renamed from: o, reason: collision with root package name */
    final Z0 f64374o;

    /* renamed from: p, reason: collision with root package name */
    final i1 f64375p;

    /* renamed from: q, reason: collision with root package name */
    final D0 f64376q;

    /* renamed from: r, reason: collision with root package name */
    final InterfaceC6629y f64377r;

    /* renamed from: s, reason: collision with root package name */
    final I f64378s;

    /* renamed from: t, reason: collision with root package name */
    final C6621u f64379t;

    /* renamed from: u, reason: collision with root package name */
    U0 f64380u;

    /* renamed from: v, reason: collision with root package name */
    final M0 f64381v;

    /* renamed from: w, reason: collision with root package name */
    final LastRunInfo f64382w;

    /* renamed from: x, reason: collision with root package name */
    final C6632z0 f64383x;

    /* renamed from: y, reason: collision with root package name */
    final B0 f64384y;

    /* renamed from: z, reason: collision with root package name */
    final R6.b f64385z;

    /* renamed from: com.bugsnag.android.s$a */
    class a implements Function2<Boolean, String, Unit> {
        a() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(Boolean bool, String str) {
            HashMap map = new HashMap();
            map.put("hasConnection", bool);
            map.put("networkState", str);
            C6617s.this.v("Connectivity changed", BreadcrumbType.STATE, map);
            if (!bool.booleanValue()) {
                return null;
            }
            C6617s.this.l().v();
            C6617s.this.f64374o.d();
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.s$b */
    class b implements Function2<String, Map<String, ? extends Object>, Unit> {
        b() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(String str, Map<String, ?> map) {
            C6617s.this.x(str, map, BreadcrumbType.STATE);
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.s$c */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            C6617s.this.f64377r.a();
            C6617s c6617s = C6617s.this;
            i1.d(c6617s.f64368i, c6617s.f64375p, c6617s.f64376q);
        }
    }

    /* renamed from: com.bugsnag.android.s$d */
    class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ LastRunInfo f64389a;

        d(LastRunInfo lastRunInfo) {
            this.f64389a = lastRunInfo;
        }

        @Override // java.lang.Runnable
        public void run() {
            C6617s.this.f64383x.f(this.f64389a);
        }
    }

    /* renamed from: com.bugsnag.android.s$e */
    class e implements Function2<String, String, Unit> {
        e() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(String str, String str2) {
            HashMap map = new HashMap();
            map.put("from", str);
            map.put("to", str2);
            C6617s.this.v("Orientation changed", BreadcrumbType.STATE, map);
            C6617s.this.f64379t.d(str2);
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.s$f */
    class f implements Function2<Boolean, Integer, Unit> {
        f() {
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Unit invoke(Boolean bool, Integer num) {
            C6617s.this.f64372m.g(Boolean.TRUE.equals(bool));
            if (C6617s.this.f64372m.h(num)) {
                C6617s c6617s = C6617s.this;
                c6617s.v("Trim Memory", BreadcrumbType.STATE, Collections.singletonMap("trimLevel", c6617s.f64372m.e()));
            }
            C6617s.this.f64372m.c();
            return null;
        }
    }

    /* renamed from: com.bugsnag.android.s$g */
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

    public C6617s(Context context, C6627x c6627x) {
        G0 g02 = new G0();
        this.f64372m = g02;
        R6.b bVar = new R6.b();
        this.f64385z = bVar;
        S6.c cVar = new S6.c(context, bVar);
        Context contextA = cVar.getCtx();
        this.f64368i = contextA;
        M0 m0U = c6627x.u();
        this.f64381v = m0U;
        A a10 = new A(contextA, new a());
        this.f64377r = a10;
        S6.b bVar2 = new S6.b(cVar, c6627x, a10, bVar);
        ImmutableConfig kVarA = bVar2.getConfig();
        this.f64360a = kVarA;
        D0 d0P = kVarA.getLogger();
        this.f64376q = d0P;
        if (!(context instanceof Application)) {
            d0P.g("You should initialize Bugsnag from the onCreate() callback of your Application subclass, as this guarantees errors are captured as early as possible. If a custom Application subclass is not possible in your app then you should suppress this warning by passing the Application context instead: Bugsnag.start(context.getApplicationContext()). For further info see: https://docs.bugsnag.com/platforms/android/#basic-configuration");
        }
        f1 f1Var = new f1(contextA, kVarA, bVar);
        C6614q c6614q = new C6614q(kVarA, c6627x);
        this.f64379t = c6614q.getClientObservable();
        CallbackState rVarC = c6614q.getCallbackState();
        this.f64365f = rVarC;
        this.f64371l = c6614q.getBreadcrumbState();
        this.f64364e = c6614q.getContextState();
        this.f64361b = c6614q.getMetadataState();
        this.f64362c = c6614q.getFeatureFlagState();
        S6.f fVar = new S6.f(cVar, bVar);
        q1 q1Var = new q1(bVar2, f1Var, this, bVar, rVarC);
        D d10 = new D(cVar, bVar2, fVar, q1Var, bVar, a10, f1Var.c(), g02);
        this.f64366g = f1Var.i(c6627x.F());
        S6.e<C6603k0> eVarC = new C6593f0(cVar, bVar2, d10, bVar, q1Var, fVar, m0U, rVarC).c();
        this.f64373n = eVarC;
        this.f64378s = new I(d0P, eVarC, kVarA, rVarC, m0U, bVar);
        this.f64359A = new C6605l0(this, d0P);
        this.f64383x = f1Var.e().a();
        this.f64382w = f1Var.d().a();
        this.f64384y = q1Var.getLaunchCrashTracker();
        this.f64374o = q1Var.c().get();
        this.f64370k = d10.g().get();
        this.f64369j = d10.h().get();
        this.f64380u = new U0(c6627x.x(), kVarA, d0P);
        if (c6627x.D().contains(j1.USAGE)) {
            this.f64363d = new R6.n();
        } else {
            this.f64363d = new R6.o();
        }
        this.f64367h = c6627x.f64471a.g();
        this.f64375p = new i1(this, d0P);
        U();
    }

    private void G(LastRunInfo lastRunInfo) {
        try {
            this.f64385z.d(R6.t.IO, new d(lastRunInfo));
        } catch (RejectedExecutionException e10) {
            this.f64376q.b("Failed to persist last run info", e10);
        }
    }

    private void I() {
        this.f64368i.registerComponentCallbacks(new ComponentCallbacks2C6619t(this.f64369j, new e(), new f()));
    }

    private boolean S() {
        try {
            return ((Boolean) this.f64385z.e(R6.t.IO, new g()).get()).booleanValue();
        } catch (Throwable unused) {
            return false;
        }
    }

    private void U() {
        if (this.f64360a.getEnabledErrorTypes().getUnhandledExceptions()) {
            this.f64359A.b();
        }
        NativeInterface.setClient(this);
        this.f64380u.e(this);
        K0 k02 = K0.f63931a;
        k02.f(this.f64380u.getNdkPlugin());
        if (this.f64360a.E().contains(j1.USAGE)) {
            k02.e(true);
        }
        this.f64373n.get().z();
        this.f64373n.get().v();
        this.f64374o.d();
        this.f64363d.c(this.f64367h);
        this.f64365f.k(this.f64363d);
        J();
        I();
        K();
        v("Bugsnag loaded", BreadcrumbType.STATE, new HashMap());
        this.f64376q.d("Bugsnag loaded");
    }

    private void z(String str) {
        this.f64376q.e("Invalid null value supplied to client." + str + ", ignoring");
    }

    public void A() {
        this.f64384y.e();
    }

    public void C(Throwable th2, Q0 q02) {
        if (th2 == null) {
            z("notify");
        } else {
            if (this.f64360a.M(th2)) {
                return;
            }
            H(new C6585b0(th2, this.f64360a, a1.h("handledException"), this.f64361b.getMetadata(), this.f64362c.getFeatureFlags(), this.f64376q), q02);
        }
    }

    void D(C6585b0 c6585b0, Q0 q02) {
        c6585b0.q(this.f64361b.getMetadata().j());
        V0 v0I = this.f64374o.i();
        if (v0I != null && (this.f64360a.getAutoTrackSessions() || !v0I.k())) {
            c6585b0.r(v0I);
        }
        if (!this.f64365f.g(c6585b0, this.f64376q) || (q02 != null && !q02.a(c6585b0))) {
            this.f64376q.d("Skipping notification - onError task returned false");
        } else {
            y(c6585b0);
            this.f64378s.d(c6585b0);
        }
    }

    void E(Throwable th2, Metadata h02, String str, String str2) {
        H(new C6585b0(th2, this.f64360a, a1.i(str, Severity.ERROR, str2), Metadata.INSTANCE.b(this.f64361b.getMetadata(), h02), this.f64362c.getFeatureFlags(), this.f64376q), null);
        LastRunInfo lastRunInfo = this.f64382w;
        int consecutiveLaunchCrashes = lastRunInfo == null ? 0 : lastRunInfo.getConsecutiveLaunchCrashes();
        boolean zD = this.f64384y.d();
        if (zD) {
            consecutiveLaunchCrashes++;
        }
        G(new LastRunInfo(consecutiveLaunchCrashes, true, zD));
        this.f64385z.c();
    }

    public void F() {
        this.f64374o.m();
    }

    void H(C6585b0 c6585b0, Q0 q02) {
        c6585b0.o(this.f64369j.i(new Date().getTime()));
        c6585b0.b("device", this.f64369j.k());
        c6585b0.l(this.f64370k.e());
        c6585b0.b("app", this.f64370k.f());
        c6585b0.m(this.f64371l.copy());
        s1 s1VarC = this.f64366g.get().getUser();
        c6585b0.s(s1VarC.getIo.constructor.data.local.PreferencesHelper.PREF_ID java.lang.String(), s1VarC.getEmail(), s1VarC.getName());
        c6585b0.n(this.f64364e.c());
        c6585b0.p(this.f64363d);
        D(c6585b0, q02);
    }

    void J() {
        Context context = this.f64368i;
        if (context instanceof Application) {
            Application application = (Application) context;
            R6.j.i(application);
            R6.j.f(this.f64374o);
            if (this.f64360a.H(BreadcrumbType.STATE)) {
                return;
            }
            application.registerActivityLifecycleCallbacks(new C6584b(new b()));
        }
    }

    void K() {
        try {
            this.f64385z.d(R6.t.DEFAULT, new c());
        } catch (RejectedExecutionException e10) {
            this.f64376q.b("Failed to register for system events", e10);
        }
    }

    void L(R6.r rVar) {
        this.f64361b.removeObserver(rVar);
        this.f64371l.removeObserver(rVar);
        this.f64374o.removeObserver(rVar);
        this.f64379t.removeObserver(rVar);
        this.f64366g.get().removeObserver(rVar);
        this.f64364e.removeObserver(rVar);
        this.f64378s.removeObserver(rVar);
        this.f64384y.removeObserver(rVar);
        this.f64372m.removeObserver(rVar);
        this.f64362c.removeObserver(rVar);
    }

    public boolean M() {
        return this.f64374o.o();
    }

    void N(boolean z10) {
        this.f64380u.f(this, z10);
    }

    void O(boolean z10) {
        this.f64380u.g(this, z10);
        if (z10) {
            this.f64359A.b();
        } else {
            this.f64359A.c();
        }
    }

    public void Q(String str) {
        this.f64364e.e(str);
    }

    public void R(String str, String str2, String str3) {
        this.f64366g.get().d(new s1(str, str2, str3));
    }

    public void V() {
        this.f64374o.r(false);
    }

    void W() {
        this.f64361b.g();
        this.f64364e.b();
        this.f64366g.get().b();
        this.f64372m.c();
        this.f64362c.c();
    }

    public void a(String str, String str2, Object obj) {
        if (str == null || str2 == null) {
            z("addMetadata");
        } else {
            this.f64361b.b(str, str2, obj);
        }
    }

    public void b(String str, Map<String, ?> map) {
        if (str == null || map == null) {
            z("addMetadata");
        } else {
            this.f64361b.c(str, map);
        }
    }

    void c(R6.r rVar) {
        this.f64361b.addObserver(rVar);
        this.f64371l.addObserver(rVar);
        this.f64374o.addObserver(rVar);
        this.f64379t.addObserver(rVar);
        this.f64366g.get().addObserver(rVar);
        this.f64364e.addObserver(rVar);
        this.f64378s.addObserver(rVar);
        this.f64384y.addObserver(rVar);
        this.f64372m.addObserver(rVar);
        this.f64362c.addObserver(rVar);
    }

    public void d(String str) {
        if (str != null) {
            this.f64361b.d(str);
        } else {
            z("clearMetadata");
        }
    }

    public void e(String str, String str2) {
        if (str == null || str2 == null) {
            z("clearMetadata");
        } else {
            this.f64361b.e(str, str2);
        }
    }

    C6602k f() {
        return this.f64370k;
    }

    protected void finalize() throws Throwable {
        i1 i1Var = this.f64375p;
        if (i1Var != null) {
            try {
                B.f(this.f64368i, i1Var, this.f64376q);
            } catch (IllegalArgumentException unused) {
                this.f64376q.g("Receiver not registered");
            }
        }
        super.finalize();
    }

    public List<Breadcrumb> g() {
        return this.f64371l.copy();
    }

    ImmutableConfig h() {
        return this.f64360a;
    }

    public String i() {
        return this.f64364e.c();
    }

    C j() {
        return this.f64364e;
    }

    Q k() {
        return this.f64369j;
    }

    C6603k0 l() {
        return this.f64373n.get();
    }

    FeatureFlagState m() {
        return this.f64362c;
    }

    public LastRunInfo n() {
        return this.f64382w;
    }

    D0 o() {
        return this.f64376q;
    }

    Map<String, Object> p() {
        return this.f64361b.getMetadata().n();
    }

    MetadataState q() {
        return this.f64361b;
    }

    M0 r() {
        return this.f64381v;
    }

    T0 s(Class cls) {
        return this.f64380u.a(cls);
    }

    Z0 t() {
        return this.f64374o;
    }

    public s1 u() {
        return this.f64366g.get().getUser();
    }

    void v(String str, BreadcrumbType breadcrumbType, Map<String, Object> map) {
        if (this.f64360a.H(breadcrumbType)) {
            return;
        }
        this.f64371l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f64376q));
    }

    public void w(String str) {
        if (str != null) {
            this.f64371l.add(new Breadcrumb(str, this.f64376q));
        } else {
            z("leaveBreadcrumb");
        }
    }

    public void x(String str, Map<String, Object> map, BreadcrumbType breadcrumbType) {
        if (str == null || breadcrumbType == null) {
            z("leaveBreadcrumb");
        } else {
            this.f64371l.add(new Breadcrumb(str, breadcrumbType, map, new Date(), this.f64376q));
        }
    }

    private void y(C6585b0 c6585b0) {
        List<Y> listE = c6585b0.e();
        if (listE.size() > 0) {
            String strB = listE.get(0).b();
            String strC = listE.get(0).c();
            HashMap map = new HashMap();
            map.put("errorClass", strB);
            map.put("message", strC);
            map.put("unhandled", String.valueOf(c6585b0.j()));
            map.put("severity", c6585b0.h().toString());
            this.f64371l.add(new Breadcrumb(strB, BreadcrumbType.ERROR, map, new Date(), this.f64376q));
        }
    }

    void P(String str) {
        f().l(str);
    }

    void T() {
        int consecutiveLaunchCrashes;
        if (!S()) {
            this.f64376q.g("Failed to setup NDK directory.");
            return;
        }
        String absolutePath = this.f64383x.getFile().getAbsolutePath();
        LastRunInfo lastRunInfo = this.f64382w;
        if (lastRunInfo != null) {
            consecutiveLaunchCrashes = lastRunInfo.getConsecutiveLaunchCrashes();
        } else {
            consecutiveLaunchCrashes = 0;
        }
        this.f64379t.c(this.f64360a, absolutePath, consecutiveLaunchCrashes);
        W();
        this.f64379t.b();
    }
}
