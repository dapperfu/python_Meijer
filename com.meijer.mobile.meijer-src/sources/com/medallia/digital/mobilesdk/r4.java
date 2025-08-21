package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.AnalyticsBridge;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.MDExternalError;
import com.medallia.digital.mobilesdk.b0;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.e3;
import com.medallia.digital.mobilesdk.f2;
import com.medallia.digital.mobilesdk.j0;
import com.medallia.digital.mobilesdk.j8;
import com.medallia.digital.mobilesdk.r2;
import com.medallia.digital.mobilesdk.u1;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.UUID;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
class r4 implements LifeCycle.g, m8, u8 {

    /* renamed from: s, reason: collision with root package name */
    private static final long f93649s = 2000;

    /* renamed from: d, reason: collision with root package name */
    private long f93653d;

    /* renamed from: h, reason: collision with root package name */
    private final g0 f93657h;

    /* renamed from: i, reason: collision with root package name */
    private final h0 f93658i;

    /* renamed from: m, reason: collision with root package name */
    private final MedalliaExceptionHandler f93662m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f93663n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f93664o;

    /* renamed from: p, reason: collision with root package name */
    private Boolean f93665p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f93666q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f93667r;

    /* renamed from: a, reason: collision with root package name */
    private boolean f93650a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f93651b = false;

    /* renamed from: c, reason: collision with root package name */
    private MDSdkFrameworkType f93652c = MDSdkFrameworkType.Native;

    /* renamed from: e, reason: collision with root package name */
    private boolean f93654e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f93655f = false;

    /* renamed from: g, reason: collision with root package name */
    private final j0 f93656g = new j0();

    /* renamed from: j, reason: collision with root package name */
    private y6 f93659j = new y6();

    /* renamed from: k, reason: collision with root package name */
    private final f2 f93660k = new f2();

    /* renamed from: l, reason: collision with root package name */
    private final m3 f93661l = new m3();

    class a extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDCallback f93668a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f93669b;

        a(MDCallback mDCallback, String str) {
            this.f93668a = mDCallback;
            this.f93669b = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f93668a.onSuccess(this.f93669b);
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f93671a;

        b(MDResultCallback mDResultCallback) {
            this.f93671a = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f93671a.onSuccess();
        }
    }

    class c implements n6<u0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f93673a;

        c(MDResultCallback mDResultCallback) {
            this.f93673a = mDResultCallback;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) throws JSONException {
            r4.this.a(h4Var, this.f93673a);
            r4.this.clearAndDisconnect();
            r4.this.f93654e = false;
            r4.this.f93657h.a(r4.this.f93650a, r4.this.f93654e);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(u0 u0Var) {
            if (u0Var == null || u0Var.a() == null) {
                r4.this.a(new MDExternalError(MDExternalError.ExternalError.UNSPECIFIED_CONFIGURATION_ERROR_16), this.f93673a);
                return;
            }
            ConfigurationContract configurationContractA = u0Var.a();
            PropertyConfigurationContract propertyConfigurationContract = configurationContractA.propertyConfiguration;
            if (propertyConfigurationContract != null && propertyConfigurationContract.getPropertyType() != null && !configurationContractA.propertyConfiguration.getPropertyType().equalsIgnoreCase("mobileAndroid")) {
                a4.e("SDK init failed, property type: " + configurationContractA.propertyConfiguration.getPropertyType());
                r4.this.c(new MDExternalError(MDExternalError.ExternalError.WRONG_PROPERTY_TYPE), this.f93673a);
                return;
            }
            a4.e("SDK init finished successfully");
            r4.this.f93654e = false;
            r4.this.f93650a = true;
            r4.this.f93657h.a(r4.this.f93650a, r4.this.f93654e);
            if (r4.this.b(configurationContractA)) {
                LifeCycle.b().k();
                r4.this.c(new MDExternalError(MDExternalError.ExternalError.SDK_IS_KILLED), this.f93673a);
            } else {
                r4.this.c(this.f93673a);
                r4.this.a(u0Var);
            }
        }
    }

    class d implements MDResultCallback {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f93675a;

        class a extends v4 {

            /* renamed from: com.medallia.digital.mobilesdk.r4$d$a$a, reason: collision with other inner class name */
            class C1322a extends v4 {
                C1322a() {
                }

                @Override // com.medallia.digital.mobilesdk.v4
                public void a() {
                    k7.b().b(d.this.f93675a);
                }
            }

            a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                w7.b().a().execute(new C1322a());
            }
        }

        d(ConfigurationContract configurationContract) {
            this.f93675a = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onError(MDExternalError mDExternalError) {
        }

        @Override // com.medallia.digital.mobilesdk.MDResultCallback
        public void onSuccess() {
            new Handler(Looper.getMainLooper()).postDelayed(new a(), r4.f93649s);
        }
    }

    class e implements n6<com.medallia.digital.mobilesdk.m> {
        e() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(com.medallia.digital.mobilesdk.m mVar) throws JSONException {
            a4.b("Analytics submission was successful - clearing " + mVar.b() + " Analytics records");
            t8.g().a(true, Long.valueOf(mVar.d()), mVar.a());
            if (mVar.e()) {
                r4.this.f93663n = true;
                r4.this.h();
            }
        }
    }

    class f implements f2.b {
        f() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void a() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void onSuccess() throws JSONException {
            r4.this.f93664o = true;
            r4.this.h();
        }
    }

    class g implements r2.g {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f93681a;

        g(ConfigurationContract configurationContract) {
            this.f93681a = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.r2.g
        public void a() {
            r4.this.f93657h.a(this.f93681a);
            r4.this.f93657h.a(r2.e().f());
        }
    }

    class i implements n6<u0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f93686a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f93687b;

        i(long j10, long j11) {
            this.f93686a = j10;
            this.f93687b = j11;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("Refresh session failed " + h4Var.getMessage());
            r4.this.a(AnalyticsBridge.c.failure, this.f93686a, this.f93687b);
            r4.this.j();
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(u0 u0Var) {
            ConfigurationContract configurationContractA = u0Var.a();
            a4.e("Refresh session success");
            if (!r4.this.b(configurationContractA)) {
                r4.this.a(u0Var, this.f93686a, this.f93687b);
                return;
            }
            CollectorsInfrastructure.getInstance().stopCollectors();
            k7.b().a(false, true);
            LifeCycle.b().k();
            a4.c("SDK functionality has been turned off");
        }
    }

    class j implements n6<com.medallia.digital.mobilesdk.m> {
        j() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(com.medallia.digital.mobilesdk.m mVar) throws JSONException {
            a4.b("Analytics submission was successful - clearing " + mVar.b() + " Analytics records");
            t8.g().b(true, Long.valueOf(mVar.d()), mVar.a());
            if (mVar.e()) {
                r4.this.f93663n = true;
                r4.this.h();
            }
        }
    }

    class k extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93690a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f93691b;

        k(String str, MDResultCallback mDResultCallback) {
            this.f93690a = str;
            this.f93691b = mDResultCallback;
        }

        /* JADX WARN: Removed duplicated region for block: B:25:0x00c0  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x00ee  */
        @Override // com.medallia.digital.mobilesdk.v4
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a() throws org.json.JSONException {
            /*
                Method dump skipped, instructions count: 433
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.k.a():void");
        }
    }

    class l implements f2.b {
        l() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void a() {
        }

        @Override // com.medallia.digital.mobilesdk.f2.b
        public void onSuccess() throws JSONException {
            r4.this.f93664o = true;
            r4.this.h();
        }
    }

    class m implements r2.g {
        m() {
        }

        @Override // com.medallia.digital.mobilesdk.r2.g
        public void a() {
            r4.this.f93657h.a(r2.e().f());
        }
    }

    class o implements n6<com.medallia.digital.mobilesdk.m> {
        o() {
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            r4.this.f93667r = false;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(com.medallia.digital.mobilesdk.m mVar) {
            a4.b("Analytics submission was successful - clearing " + mVar.b() + " Analytics records");
            t8.g().a(Long.valueOf(mVar.d()), mVar.a());
            r4.this.f93667r = false;
        }
    }

    class p extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93699a;

        p(String str) {
            this.f93699a = str;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            s8 s8VarB = s8.b();
            String str = this.f93699a;
            boolean z10 = true;
            s8VarB.a(str, str == null || str.isEmpty(), r4.this.f93650a);
            AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
            String str2 = this.f93699a;
            if (str2 != null && !str2.isEmpty()) {
                z10 = false;
            }
            analyticsBridge.reportSetUserIdEvent(Boolean.valueOf(z10));
        }
    }

    class q extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93701a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f93702b;

        q(String str, Object obj) {
            this.f93701a = str;
            this.f93702b = obj;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            e1.b().a(this.f93701a, this.f93702b, r4.this.f93650a);
        }
    }

    class r extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashMap f93704a;

        r(HashMap map) {
            this.f93704a = map;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            e1.b().a(this.f93704a, r4.this.f93650a);
        }
    }

    class s extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f93706a;

        class a implements n6<com.medallia.digital.mobilesdk.m> {
            a() {
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(h4 h4Var) throws JSONException {
                s sVar = s.this;
                r4.this.d(sVar.f93706a);
            }

            @Override // com.medallia.digital.mobilesdk.n6
            public void a(com.medallia.digital.mobilesdk.m mVar) throws JSONException {
                a4.b("Analytics submission was successful - clearing " + mVar.b() + " Analytics records");
                t8.g().a(Long.valueOf(mVar.d()), mVar.a());
                if (mVar.c() >= s4.f().i().b().a().intValue() || mVar.b() < s4.f().c()) {
                    s sVar = s.this;
                    r4.this.d(sVar.f93706a);
                }
            }
        }

        s(boolean z10) {
            this.f93706a = z10;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() throws JSONException {
            if (d7.b().a(d7.a.SDK_STOPPED, false)) {
                a4.e("SDK is already stopped");
                return;
            }
            AnalyticsBridge.getInstance().reportStopSDKEventImmediated(this.f93706a);
            new com.medallia.digital.mobilesdk.l(System.currentTimeMillis(), new a()).c();
            t8.g().a(Lifetime.Session);
            x6 x6Var = x6.f94339a;
            if (x6Var.h()) {
                x6Var.k();
            }
        }
    }

    class t extends v4 {
        t() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            d7 d7VarB = d7.b();
            d7.a aVar = d7.a.SDK_STOPPED;
            if (!d7VarB.a(aVar, false)) {
                a4.e("SDK is not stopped");
                return;
            }
            if (r4.this.f93662m != null) {
                r4.this.f93662m.register();
            }
            a4.e("SDK stop is reverting");
            d7.b().b(aVar, false);
            t8.g().b(false);
            k7.b().a(false);
            AnalyticsBridge.getInstance().reportRevertStopSdkEvent();
            d7.b().b(d7.a.MISSING_EVENTS_V2, AnalyticsBridge.getInstance().exportPendingEventsToJson());
            if (r4.this.f93650a) {
                x6 x6Var = x6.f94339a;
                if (x6Var.h() && x6Var.i()) {
                    x6Var.j();
                }
            }
        }
    }

    class u extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDResultCallback f93710a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDExternalError f93711b;

        u(MDResultCallback mDResultCallback, MDExternalError mDExternalError) {
            this.f93710a = mDResultCallback;
            this.f93711b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f93710a.onError(this.f93711b);
        }
    }

    class v extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDCallback f93713a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDExternalError f93714b;

        v(MDCallback mDCallback, MDExternalError mDExternalError) {
            this.f93713a = mDCallback;
            this.f93714b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f93713a.onError(this.f93714b);
        }
    }

    class w extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ MDFailureCallback f93716a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ MDExternalError f93717b;

        w(MDFailureCallback mDFailureCallback, MDExternalError mDExternalError) {
            this.f93716a = mDFailureCallback;
            this.f93717b = mDExternalError;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            this.f93716a.onError(this.f93717b);
        }
    }

    protected r4() {
        g0 g0Var = new g0();
        this.f93657h = g0Var;
        this.f93658i = new h0(g0Var);
        MedalliaExceptionHandler medalliaExceptionHandler = new MedalliaExceptionHandler(i4.c().a());
        this.f93662m = medalliaExceptionHandler;
        a(medalliaExceptionHandler);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d(com.medallia.digital.mobilesdk.ConfigurationContract r7) {
        /*
            r6 = this;
            com.medallia.digital.mobilesdk.t0 r0 = com.medallia.digital.mobilesdk.t0.c()
            r0.a(r7)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1 = 0
            r2 = 0
            if (r7 == 0) goto L43
            com.medallia.digital.mobilesdk.SDKConfigurationContract r3 = r7.getSdkConfiguration()
            if (r3 == 0) goto L43
            com.medallia.digital.mobilesdk.SDKConfigurationContract r3 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.CollectorsConfigurationContract r3 = r3.getCollectorsConfigurations()
            com.medallia.digital.mobilesdk.SDKConfigurationContract r4 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r4 = r4.getMedalliaDigitalBrain()
            if (r4 == 0) goto L41
            com.medallia.digital.mobilesdk.SDKConfigurationContract r2 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r2 = r2.getMedalliaDigitalBrain()
            boolean r2 = r2.isSessionPercentageSupportDouble()
            com.medallia.digital.mobilesdk.SDKConfigurationContract r4 = r7.getSdkConfiguration()
            com.medallia.digital.mobilesdk.MedalliaDigitalBrainConfigurationContract r4 = r4.getMedalliaDigitalBrain()
            boolean r4 = r4.isSkipSetUnattachedCustomParams()
            goto L45
        L41:
            r4 = r2
            goto L45
        L43:
            r3 = r1
            goto L41
        L45:
            if (r7 == 0) goto L71
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r5 = r7.getPropertyConfiguration()
            if (r5 == 0) goto L71
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r5 = r7.getPropertyConfiguration()
            java.util.ArrayList r5 = r5.getCustomParameters()
            if (r5 == 0) goto L5f
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r0 = r7.getPropertyConfiguration()
            java.util.ArrayList r0 = r0.getCustomParameters()
        L5f:
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r5 = r7.getPropertyConfiguration()
            java.lang.Integer r5 = r5.getAccountId()
            if (r5 == 0) goto L71
            com.medallia.digital.mobilesdk.PropertyConfigurationContract r1 = r7.getPropertyConfiguration()
            java.lang.Integer r1 = r1.getAccountId()
        L71:
            com.medallia.digital.mobilesdk.e1 r5 = com.medallia.digital.mobilesdk.e1.b()
            r5.a(r4, r0)
            com.medallia.digital.mobilesdk.y6 r0 = r6.f93659j
            r0.a(r7)
            com.medallia.digital.mobilesdk.t8 r0 = com.medallia.digital.mobilesdk.t8.g()
            r0.a(r7)
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r0 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()
            r0.updateConfiguration(r3, r2)
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r0 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()
            r0.pollAll()
            if (r1 == 0) goto L9b
            com.medallia.digital.mobilesdk.CollectorsInfrastructure r0 = com.medallia.digital.mobilesdk.CollectorsInfrastructure.getInstance()
            r0.setAccountId(r1)
        L9b:
            com.medallia.digital.mobilesdk.p5 r0 = com.medallia.digital.mobilesdk.p5.a()
            com.medallia.digital.mobilesdk.r4$d r1 = new com.medallia.digital.mobilesdk.r4$d
            r1.<init>(r7)
            r0.b(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.d(com.medallia.digital.mobilesdk.ConfigurationContract):void");
    }

    private void g() throws JSONException {
        try {
            File file = new File(g2.f(".crashes/crash.txt"));
            String strE = g2.e(file);
            if (strE != null) {
                if (strE.indexOf(BuildConfig.LIBRARY_PACKAGE_NAME) != -1) {
                    JSONObject jSONObject = new JSONObject(strE);
                    long j10 = jSONObject.getLong("timestamp");
                    if (!AnalyticsBridge.getInstance().reportMedalliaCrashEventImmediate(jSONObject.getString("stacktrace"), j10, d7.b().a(d7.a.SESSION_ID, UUID.randomUUID().toString()), Long.valueOf(d7.b().a(d7.a.PROPERTY_ID, -1L)))) {
                        return;
                    }
                }
                a(file);
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void j() {
        this.f93651b = true;
        CollectorsInfrastructure.getInstance().stopCollectors();
        r2.e().b();
    }

    private void k() {
        this.f93659j.c();
        l();
        CollectorsInfrastructure.getInstance().setSDKFramework(this.f93652c);
    }

    private void l() {
        long jD = w2.c().a().d();
        CollectorsInfrastructure.getInstance().setPropertyId(Long.valueOf(jD));
        d7.b().b(d7.a.PROPERTY_ID, jD);
    }

    protected f2 c() {
        return this.f93660k;
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        if (this.f93650a || this.f93655f) {
            a4.a("Medallia SDK");
            this.f93650a = false;
            this.f93659j = null;
            this.f93654e = false;
            this.f93657h.a(false, false);
            if (!this.f93655f) {
                LifeCycle.b().clearAndDisconnect();
            }
            CollectorsInfrastructure.getInstance().clearAndDisconnect();
            g2.a();
            r2.e().clearAndDisconnect();
            e1.b().clearAndDisconnect();
            t8.g().clearAndDisconnect();
            s4.f().clearAndDisconnect();
            f1.a().clearAndDisconnect();
            d7.b().clearAndDisconnect();
            t4.e().clearAndDisconnect();
            AnalyticsBridge.getInstance().clearAndDisconnect();
            w2.c().clearAndDisconnect();
            s8.b().clearAndDisconnect();
            a4.e("Disconnected from Medallia SDK");
            a4.a().clearAndDisconnect();
        }
    }

    protected void i() {
        w7.b().a().execute(new t());
    }

    class h implements r2.f<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93683a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f93684b;

        h(String str, ConfigurationContract configurationContract) {
            this.f93683a = str;
            this.f93684b = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a() {
            r2.e().b(this.f93684b.getPropertyConfiguration());
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a(Void r22) {
            r4.this.f93658i.a(this.f93683a);
        }
    }

    class n implements r2.f<Void> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f93695a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ConfigurationContract f93696b;

        n(String str, ConfigurationContract configurationContract) {
            this.f93695a = str;
            this.f93696b = configurationContract;
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a() {
            r2.e().b(this.f93696b.getPropertyConfiguration());
        }

        @Override // com.medallia.digital.mobilesdk.r2.f
        public void a(Void r22) {
            r4.this.f93658i.a(this.f93695a);
        }
    }

    private void a() {
        SharedPreferences sharedPreferencesC = d7.b().c();
        d7.a aVar = d7.a.PREVIOUS_ANALYTICS_V2;
        if (sharedPreferencesC.contains(aVar.toString())) {
            d7.b().a(aVar);
            a4.e("PREVIOUS_ANALYTICS_V2 indication cleared from storage");
        }
        SharedPreferences sharedPreferencesC2 = d7.b().c();
        d7.a aVar2 = d7.a.PREVIOUS_DIGITAL_ANALYTICS;
        if (sharedPreferencesC2.contains(aVar2.toString())) {
            d7.b().a(aVar2);
            a4.e("PREVIOUS_DIGITAL_ANALYTICS indication cleared from storage");
        }
        SharedPreferences sharedPreferencesC3 = d7.b().c();
        d7.a aVar3 = d7.a.PREVIOUS_SEND_USER_JOURNEY;
        if (sharedPreferencesC3.contains(aVar3.toString())) {
            d7.b().a(aVar3);
            a4.e("PREVIOUS_SEND_USER_JOURNEY indication cleared from storage");
        }
        SharedPreferences sharedPreferencesC4 = d7.b().c();
        d7.a aVar4 = d7.a.MISSING_EVENTS;
        if (sharedPreferencesC4.contains(aVar4.toString())) {
            d7.b().a(aVar4);
            a4.e("MISSING_EVENTS indication cleared from storage");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() throws JSONException {
        j8.a(j8.b.CONFIGURATION_UUID);
        List<Pair<String, Boolean>> listA = v0.a();
        if (listA != null) {
            for (Pair<String, Boolean> pair : listA) {
                if (pair != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            a4.f("Missing listener, however, method will run regardless");
        }
    }

    private boolean f() {
        return d7.b().a(d7.a.SDK_STOPPED, false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h() throws JSONException {
        if (this.f93663n && this.f93664o) {
            this.f93664o = false;
            this.f93663n = false;
            a((String) null);
        }
    }

    protected void c(long j10) {
        try {
            if (f()) {
                return;
            }
            if (this.f93659j.a(j10)) {
                b(j10);
            } else if (this.f93658i.a()) {
                this.f93658i.a(Locale.getDefault(), e());
            }
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected boolean e() {
        return this.f93650a;
    }

    private void b(long j10) {
        a4.e("Refresh session started");
        c3.d().a(e3.b.refreshSession);
        s7.e().j();
        s4.f().a("2.0.0", new i(System.currentTimeMillis(), j10));
    }

    private void c(ConfigurationContract configurationContract) {
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null) {
            return;
        }
        d7.b().b(d7.a.IS_BLACKBOX_ENABLED, configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isBlackBoxEnabled());
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.g
    public void a(long j10) {
        c(j10);
        k7.b().a(u1.b.backToForeground);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MDExternalError mDExternalError, MDResultCallback mDResultCallback) throws JSONException {
        a4.e("Failure");
        a4.c("End - " + mDExternalError.getMessage());
        a(mDExternalError, mDResultCallback);
        AnalyticsBridge.getInstance().reportInitCallbackEvent(AnalyticsBridge.c.failure, Integer.valueOf(mDExternalError.getErrorCode()), mDExternalError.getMessage(), System.currentTimeMillis() - this.f93653d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        a4.e("Failure");
        a4.f("End - " + mDExternalError.getMessage());
        a(mDExternalError, mDResultCallback);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d(boolean z10) throws JSONException {
        d7.b().b(d7.a.SDK_STOPPED, true);
        a4.e("SDK is stopped");
        k7.b().a(true);
        MedalliaExceptionHandler medalliaExceptionHandler = this.f93662m;
        if (medalliaExceptionHandler != null) {
            medalliaExceptionHandler.unregister();
        }
        if (z10) {
            t8.g().b(true);
            t8.g().a(Lifetime.Forever);
            e1.b().a();
            f1.a().a(b0.a.Feedback, Long.valueOf(System.currentTimeMillis()));
            a(new File(g2.f(".crashes/crash.txt")));
        }
        c3.d().a(e3.b.stopApi);
        s7.e().j();
    }

    protected void a(Activity activity) throws JSONException {
        if (d() || activity == null) {
            return;
        }
        try {
        } catch (Exception unused) {
            i4.a(activity.getApplication());
            i4.c().a(activity);
            LifeCycle.b().a(activity);
            AnalyticsBridge.getInstance().reportSetActivityEvent(activity);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(AnalyticsBridge.c cVar, long j10, long j11) {
        try {
            AnalyticsBridge.getInstance().reportRefreshSessionEvent(j10, System.currentTimeMillis(), j11, this.f93659j.a(), d7.b().a(d7.a.PREVIOUS_SESSION_ID, (String) null), cVar);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(MDResultCallback mDResultCallback) {
        s4.f().a("2.0.0", new c(mDResultCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c(MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new b(mDResultCallback));
    }

    protected boolean d() {
        return this.f93651b;
    }

    protected void a(MDAppearanceMode mDAppearanceMode) throws JSONException {
        if (d()) {
            return;
        }
        if (e() && !v7.c().a(mDAppearanceMode)) {
            a4.e("updateCustomAppearance = " + mDAppearanceMode.toString() + ", isSuccess = true");
        }
        AnalyticsBridge.getInstance().reportSetCustomAppearanceEvent(mDAppearanceMode);
        v7.c().b(mDAppearanceMode);
    }

    private void a(MDCallback mDCallback, String str) {
        if (mDCallback == null) {
            return;
        }
        w7.b().c().execute(new a(mDCallback, str));
    }

    protected void a(MDCustomInterceptListener mDCustomInterceptListener) {
        try {
            if (d()) {
                return;
            }
            this.f93656g.a(j0.a.CustomIntercept, mDCustomInterceptListener);
            a4.e("CustomInterceptListener was successfully set");
            AnalyticsBridge.getInstance().reportSetCustomInterceptListenerEvent();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void c(String str, MDResultCallback mDResultCallback) {
        if (d()) {
            a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDResultCallback);
        } else {
            this.f93657h.a(FormDisplayType.CODE, str, mDResultCallback);
        }
    }

    private void a(MDExternalError mDExternalError, MDCallback mDCallback) {
        if (mDCallback == null) {
            return;
        }
        w7.b().c().execute(new v(mDCallback, mDExternalError));
    }

    protected void b(String str) {
        if (d()) {
            return;
        }
        w7.b().a().execute(new p(str));
    }

    protected void c(boolean z10) {
        w7.b().a().execute(new s(z10));
    }

    private void a(MDExternalError mDExternalError, MDFailureCallback mDFailureCallback) {
        if (mDFailureCallback == null) {
            return;
        }
        w7.b().c().execute(new w(mDFailureCallback, mDExternalError));
    }

    protected void b(String str, MDResultCallback mDResultCallback) {
        w7.b().a().execute(new k(str, mDResultCallback));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(MDExternalError mDExternalError, MDResultCallback mDResultCallback) {
        if (mDResultCallback == null) {
            return;
        }
        w7.b().c().execute(new u(mDResultCallback, mDExternalError));
    }

    protected void b(boolean z10) {
        if (d()) {
            return;
        }
        if (!e()) {
            this.f93665p = Boolean.valueOf(z10);
            return;
        }
        this.f93666q = true;
        d7 d7VarB = d7.b();
        d7.a aVar = d7.a.IS_DEBUG_FORM;
        if (d7VarB.a(aVar, false) == z10) {
            return;
        }
        d7.b().b(aVar, z10);
    }

    protected void a(MDFeedbackListener mDFeedbackListener) {
        try {
            if (d()) {
                return;
            }
            this.f93656g.a(j0.a.Feedback, mDFeedbackListener);
            a4.e("FeedbackListener was successfully set");
            AnalyticsBridge.getInstance().reportSetFeedbackListenerEvent();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected boolean b(ConfigurationContract configurationContract) throws JSONException {
        if (configurationContract != null && configurationContract.getKillStatus() != null) {
            if (this.f93661l.a(configurationContract.getKillStatus())) {
                this.f93661l.b(configurationContract.getKillStatus());
                List<Pair<String, Boolean>> listA = v0.a();
                if (listA == null) {
                    return true;
                }
                for (Pair<String, Boolean> pair : listA) {
                    if (pair != null) {
                        AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) pair.first, ((Boolean) pair.second).booleanValue());
                    }
                }
                return true;
            }
            if (this.f93661l.c(configurationContract.getKillStatus())) {
                AnalyticsBridge.getInstance().reportRestoreFromKillSDKEvent(System.currentTimeMillis());
            }
        }
        this.f93661l.clear();
        return false;
    }

    protected void a(MDFormListener mDFormListener) {
        try {
            if (d()) {
                return;
            }
            this.f93656g.a(j0.a.Form, mDFormListener);
            a4.e("FormListener was set successfully");
            AnalyticsBridge.getInstance().reportSetFormListenerEvent();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(MDInterceptListener mDInterceptListener) {
        try {
            if (d()) {
                return;
            }
            this.f93656g.a(j0.a.Intercept, mDInterceptListener);
            a4.e("InterceptListener was successfully set");
            AnalyticsBridge.getInstance().reportSetInterceptListenerEvent();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(MDLogLevel mDLogLevel) {
        try {
            if (d()) {
                return;
            }
            if (mDLogLevel != null) {
                if (!mDLogLevel.equals(MDLogLevel.OFF)) {
                    FS.log_w("com.medallia.digital", "setLogLevel method is to be used in integration stages only. Remove in app production rollout!");
                }
                a4.a().a(mDLogLevel);
                a4.e("Log level was set to " + mDLogLevel);
            }
            AnalyticsBridge.getInstance().reportLoggerEvent(mDLogLevel);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    protected void a(MDResultCallback mDResultCallback) {
        if (this.f93654e) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.SDK_INITIALIZATION_IN_PROGRESS));
            return;
        }
        if (LifeCycle.b().f()) {
            mDResultCallback.onError(new MDExternalError(MDExternalError.ExternalError.APP_IS_IN_BG));
            return;
        }
        if (c3.d().c()) {
            mDResultCallback.onSuccess();
            a4.e("Close Engagement Api completed");
        } else {
            if (r2.e().a(true)) {
                mDResultCallback.onSuccess();
                a4.e("Close Engagement Api completed");
                return;
            }
            boolean zD = s7.e().d();
            mDResultCallback.onSuccess();
            if (zD) {
                a4.e("Close Engagement Api completed");
            } else {
                a4.e("Close Engagement Api completed - no engagement was open");
            }
        }
    }

    protected void a(MDSdkFrameworkType mDSdkFrameworkType) {
        if (d() || this.f93652c == null) {
            return;
        }
        this.f93652c = mDSdkFrameworkType;
        a4.e("SDK Framework was successfully set to " + this.f93652c.toString());
    }

    protected void a(MDTouchListener mDTouchListener) {
        try {
            if (d()) {
                return;
            }
            this.f93656g.a(j0.a.TouchEvent, mDTouchListener);
            a4.e("TouchEventListener was successfully set");
            AnalyticsBridge.getInstance().reportSetTouchEventListenerEvent();
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private void a(MedalliaExceptionHandler medalliaExceptionHandler) {
        if (d7.b().a(d7.a.IS_BLACKBOX_ENABLED, false) && medalliaExceptionHandler != null) {
            medalliaExceptionHandler.register();
            a4.e("Register to Blackbox");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(a3 a3Var, MDResultCallback mDResultCallback) throws JSONException {
        MDExternalError mDExternalErrorA = a3Var.a();
        a4.e("Failure");
        if (mDExternalErrorA == null || mDResultCallback == null) {
            return;
        }
        LifeCycle.b().k();
        a4.c(mDExternalErrorA.getMessage());
        a(mDExternalErrorA, mDResultCallback);
        AnalyticsBridge.getInstance().reportInitCallbackEvent(AnalyticsBridge.c.failure, Integer.valueOf(mDExternalErrorA.getErrorCode()), mDExternalErrorA.getMessage(), System.currentTimeMillis() - this.f93653d);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x01d3 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000f, B:7:0x0019, B:9:0x003a, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:16:0x0077, B:18:0x00aa, B:24:0x00c5, B:29:0x00f9, B:31:0x010a, B:32:0x0115, B:33:0x0119, B:38:0x0128, B:47:0x0162, B:49:0x01ad, B:51:0x01b7, B:53:0x01c5, B:55:0x01d8, B:57:0x0201, B:59:0x0207, B:60:0x020e, B:61:0x0211, B:54:0x01d3, B:37:0x0123, B:40:0x012e, B:44:0x0143, B:45:0x014b, B:46:0x0156, B:19:0x00b2, B:21:0x00b6, B:23:0x00c2), top: B:65:0x0000 }] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0201 A[Catch: Exception -> 0x0015, TryCatch #0 {Exception -> 0x0015, blocks: (B:2:0x0000, B:4:0x000f, B:7:0x0019, B:9:0x003a, B:11:0x0044, B:13:0x004a, B:15:0x0054, B:16:0x0077, B:18:0x00aa, B:24:0x00c5, B:29:0x00f9, B:31:0x010a, B:32:0x0115, B:33:0x0119, B:38:0x0128, B:47:0x0162, B:49:0x01ad, B:51:0x01b7, B:53:0x01c5, B:55:0x01d8, B:57:0x0201, B:59:0x0207, B:60:0x020e, B:61:0x0211, B:54:0x01d3, B:37:0x0123, B:40:0x012e, B:44:0x0143, B:45:0x014b, B:46:0x0156, B:19:0x00b2, B:21:0x00b6, B:23:0x00c2), top: B:65:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void a(com.medallia.digital.mobilesdk.u0 r11) {
        /*
            Method dump skipped, instructions count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.a(com.medallia.digital.mobilesdk.u0):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0109 A[Catch: Exception -> 0x003f, TryCatch #0 {Exception -> 0x003f, blocks: (B:2:0x0000, B:4:0x0026, B:6:0x0030, B:8:0x0036, B:12:0x0043, B:13:0x0066, B:16:0x00ac, B:17:0x00bb, B:21:0x00e7, B:22:0x00ea, B:24:0x0109, B:26:0x010f, B:27:0x0117, B:28:0x011d, B:19:0x00c2, B:20:0x00e2), top: B:32:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(com.medallia.digital.mobilesdk.u0 r11, long r12, long r14) {
        /*
            Method dump skipped, instructions count: 299
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.medallia.digital.mobilesdk.r4.a(com.medallia.digital.mobilesdk.u0, long, long):void");
    }

    private void a(File file) throws JSONException {
        Boolean boolA = g2.a(file);
        if (boolA != null) {
            AnalyticsBridge.getInstance().reportDeleteStorageEvent(g2.f(".crashes/crash.txt"), boolA.booleanValue());
        }
    }

    @Override // com.medallia.digital.mobilesdk.u8
    public void a(String str) throws JSONException {
        if (this.f93667r) {
            AnalyticsBridge.getInstance().reportAnalyticsSubmissionBlockedEvent(str);
            return;
        }
        this.f93667r = true;
        new com.medallia.digital.mobilesdk.l(System.currentTimeMillis(), new o()).c();
        t8.g().a();
    }

    protected void a(String str, MDCallback mDCallback) throws JSONException {
        if (d()) {
            return;
        }
        if (e() && !x3.e().a(str)) {
            AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, true);
            a4.e("updateCustomLocale = " + str + ", isSuccess = true");
            a(mDCallback, (String) null);
            return;
        }
        this.f93656g.a(j0.a.Localization, mDCallback);
        MDExternalError mDExternalErrorE = x3.e().e(str);
        if (mDExternalErrorE == null) {
            if (e()) {
                this.f93658i.a(str);
            }
            AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, true);
            return;
        }
        AnalyticsBridge.getInstance().updateCustomLocaleEvent(str, false);
        a4.e("updateCustomLocale = " + str + ", isSuccess = false");
        a(mDExternalErrorE, mDCallback);
    }

    protected void a(String str, MDInterceptActionType mDInterceptActionType, MDFailureCallback mDFailureCallback) {
        if (d()) {
            a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDFailureCallback);
        } else {
            c3.d().a(str, mDInterceptActionType, mDFailureCallback);
        }
    }

    protected void a(String str, MDResultCallback mDResultCallback) {
        if (d()) {
            a(new MDExternalError(MDExternalError.ExternalError.SDK_NOT_INITIALIZED), mDResultCallback);
        } else {
            this.f93657h.a(FormDisplayType.NOTIFICATION, str, mDResultCallback);
        }
    }

    protected void a(String str, Object obj) {
        if (d()) {
            return;
        }
        w7.b().a().execute(new q(str, obj));
    }

    protected void a(HashMap<String, Object> map) {
        if (d()) {
            return;
        }
        w7.b().a().execute(new r(map));
    }

    protected void a(boolean z10) {
        try {
            if (d()) {
                return;
            }
            k7.b().a(z10, this.f93650a);
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    private boolean a(ConfigurationContract configurationContract) {
        return (configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || !configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isBridgeSDKIntegrationEnabled()) ? false : true;
    }
}
