package com.medallia.digital.mobilesdk;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.fullstory.FS;
import com.medallia.digital.mobilesdk.LifeCycle;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.u1;
import com.medallia.digital.mobilesdk.x7;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;
import org.json.JSONException;

/* loaded from: classes7.dex */
class m7 implements LifeCycle.h, m8, x7.b<u1.b>, j7 {

    /* renamed from: q, reason: collision with root package name */
    protected static final String f92555q = "2.0.0";

    /* renamed from: r, reason: collision with root package name */
    private static final String f92556r = "targetRuleEngine/tre-%s.js";

    /* renamed from: s, reason: collision with root package name */
    private static final String f92557s = "targetRuleEngine/index.html";

    /* renamed from: t, reason: collision with root package name */
    private static final String f92558t = "targetRuleEngine";

    /* renamed from: u, reason: collision with root package name */
    private static final String f92559u = "getFormToTrigger";

    /* renamed from: v, reason: collision with root package name */
    private static final String f92560v = "getFormToTriggerWithPath";

    /* renamed from: w, reason: collision with root package name */
    private static final String f92561w = "<html lang=\"en\"><body><script src=\"TRE_NAME_TEMP\"></script></body></html>";

    /* renamed from: x, reason: collision with root package name */
    private static final String f92562x = "TRE_NAME_TEMP";

    /* renamed from: y, reason: collision with root package name */
    private static final int f92563y = 2;

    /* renamed from: a, reason: collision with root package name */
    private long f92564a;

    /* renamed from: d, reason: collision with root package name */
    private String f92567d;

    /* renamed from: e, reason: collision with root package name */
    private Long f92568e;

    /* renamed from: f, reason: collision with root package name */
    protected String f92569f;

    /* renamed from: g, reason: collision with root package name */
    protected File f92570g;

    /* renamed from: j, reason: collision with root package name */
    private u1.b f92573j;

    /* renamed from: k, reason: collision with root package name */
    private WebView f92574k;

    /* renamed from: m, reason: collision with root package name */
    protected boolean f92576m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f92577n;

    /* renamed from: b, reason: collision with root package name */
    protected x7 f92565b = new x7(500, this);

    /* renamed from: c, reason: collision with root package name */
    protected boolean f92566c = false;

    /* renamed from: h, reason: collision with root package name */
    private final ArrayList<t1> f92571h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    protected boolean f92572i = true;

    /* renamed from: o, reason: collision with root package name */
    private final Handler f92578o = new Handler(Looper.getMainLooper());

    /* renamed from: p, reason: collision with root package name */
    private final v4 f92579p = new a();

    /* renamed from: l, reason: collision with root package name */
    protected boolean f92575l = d7.b().a(d7.a.SDK_STOPPED, false);

    class a extends v4 {

        /* renamed from: com.medallia.digital.mobilesdk.m7$a$a, reason: collision with other inner class name */
        class C1309a extends v4 {
            C1309a() {
            }

            @Override // com.medallia.digital.mobilesdk.v4
            public void a() {
                m7.this.a(u1.b.evaluationTimerFG);
            }
        }

        a() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            w7.b().a().execute(new C1309a());
        }
    }

    class b extends v4 {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ File f92582a;

        class a extends WebViewClient {

            /* renamed from: com.medallia.digital.mobilesdk.m7$b$a$a, reason: collision with other inner class name */
            class C1310a implements ValueCallback<String> {

                /* renamed from: com.medallia.digital.mobilesdk.m7$b$a$a$a, reason: collision with other inner class name */
                class C1311a extends v4 {

                    /* renamed from: a, reason: collision with root package name */
                    final /* synthetic */ String f92586a;

                    C1311a(String str) {
                        this.f92586a = str;
                    }

                    @Override // com.medallia.digital.mobilesdk.v4
                    public void a() {
                        m7.this.a(this.f92586a);
                    }
                }

                C1310a() {
                }

                @Override // android.webkit.ValueCallback
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public void onReceiveValue(String str) {
                    w7.b().a().execute(new C1311a(str));
                }
            }

            a() {
            }

            @Override // android.webkit.WebViewClient
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                if (m7.this.f92574k == null && webView != null) {
                    m7.this.f92574k = webView;
                }
                if (m7.this.f92574k == null) {
                    a4.c("targetEngineWebView is null");
                } else {
                    m7.this.f92574k.evaluateJavascript(m7.this.f92567d, new C1310a());
                    m7.this.f92567d = null;
                }
            }
        }

        b(File file) {
            this.f92582a = file;
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            m7 m7Var = m7.this;
            m7Var.f92574k = m7Var.f();
            if (this.f92582a != null) {
                WebView webView = m7.this.f92574k;
                String str = String.format("file://%s", this.f92582a.getPath());
                FS.trackWebView(webView);
                webView.loadUrl(str);
                FS.setWebViewClient(m7.this.f92574k, new a());
            }
        }
    }

    class c extends v4 {
        c() {
        }

        @Override // com.medallia.digital.mobilesdk.v4
        public void a() {
            if (m7.this.f92574k != null) {
                m7.this.f92574k.setWebChromeClient(null);
                FS.setWebViewClient(m7.this.f92574k, null);
                m7.this.f92574k.stopLoading();
                m7.this.f92574k.clearHistory();
                m7.this.f92574k.removeAllViews();
                m7.this.f92574k.destroyDrawingCache();
                m7.this.f92574k.destroy();
                m7.this.f92574k = null;
            }
        }
    }

    class d implements n6<File> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ TargetRuleEngineContract f92589a;

        d(TargetRuleEngineContract targetRuleEngineContract) {
            this.f92589a = targetRuleEngineContract;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            a4.c("Failed to download and store target engine " + h4Var.getMessage());
            if (g2.d(m7.this.f92570g)) {
                a4.f("Using previous TRE " + m7.this.f92570g.getName());
                m7.this.a(u1.b.sdkInit);
            }
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(File file) throws JSONException {
            a4.b("TRE download completed successfully");
            m7.this.a(file);
            m7 m7Var = m7.this;
            m7Var.f92570g = file;
            m7Var.a(u1.b.sdkInit);
            m7 m7Var2 = m7.this;
            m7Var2.a(m7Var2.f92570g, this.f92589a);
            m7.this.e();
        }
    }

    private void d() {
        try {
            ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new c());
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws JSONException {
        AnalyticsBridge.getInstance().setTreResourceReady(true);
        AnalyticsBridge.getInstance().reportResourcesSizeEvent();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public WebView f() {
        WebView webView = new WebView(i4.c().a().getApplicationContext());
        webView.setWillNotDraw(true);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.getSettings().setBlockNetworkLoads(true);
        webView.getSettings().setAllowFileAccess(true);
        webView.getSettings().setCacheMode(2);
        return webView;
    }

    private TargetRuleEngineContract h() {
        String strA = d7.b().a(d7.a.TARGET_ENGINE, (String) null);
        if (strA == null) {
            return null;
        }
        return ModelFactory.getInstance().createTargetRuleEngine(strA);
    }

    private void j() {
        l();
        k();
    }

    private void k() {
        Long l10 = this.f92568e;
        if (l10 != null) {
            this.f92578o.postDelayed(this.f92579p, l10.longValue());
        }
    }

    private void l() {
        a4.b("Evaluation timer stopped");
        this.f92578o.removeCallbacks(this.f92579p);
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a("TargetEvaluator");
        l();
    }

    protected void g() {
        LifeCycle.b().a(this);
    }

    File i() {
        TargetRuleEngineContract targetRuleEngineContractH = h();
        if (targetRuleEngineContractH != null) {
            return g2.d(b(targetRuleEngineContractH));
        }
        return null;
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onBackground() {
        l();
    }

    @Override // com.medallia.digital.mobilesdk.LifeCycle.h
    public void onForeground() {
        if (this.f92568e != null) {
            this.f92568e = Long.valueOf((CollectorsInfrastructure.getInstance() == null || CollectorsInfrastructure.getInstance().getTimeInBackground() == null || this.f92568e.longValue() <= CollectorsInfrastructure.getInstance().getTimeInBackground().longValue()) ? 1000L : this.f92568e.longValue() - CollectorsInfrastructure.getInstance().getTimeInBackground().longValue());
        }
        j();
    }

    String b(TargetRuleEngineContract targetRuleEngineContract) {
        return String.format(f92556r, targetRuleEngineContract.getVersion());
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public boolean c() {
        return this.f92572i;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public i7 a() {
        return i7.V1;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public ArrayList<t1> b() {
        return this.f92571h;
    }

    boolean c(TargetRuleEngineContract targetRuleEngineContract) {
        TargetRuleEngineContract targetRuleEngineContractH;
        if (!g2.d(this.f92570g) || (targetRuleEngineContractH = h()) == null || targetRuleEngineContractH.getVersion() == null) {
            return false;
        }
        return targetRuleEngineContractH.getVersion().equals(targetRuleEngineContract.getVersion());
    }

    private String a(String str, String str2) {
        return String.format("%s.%s(%s,%s,%s)", f92558t, str, t8.g().b(), str2, Long.valueOf(System.currentTimeMillis()));
    }

    @Override // com.medallia.digital.mobilesdk.x7.b
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void a(u1.b bVar) {
        String strC;
        String str;
        if (this.f92575l) {
            a4.e("Evaluate can’t be trigger because of stop sdk");
            return;
        }
        if (this.f92572i) {
            this.f92573j = bVar;
            t8.g().b(CollectorsInfrastructure.getInstance().timeInForegroundCollector.o());
            this.f92564a = System.currentTimeMillis();
            a4.e("Evaluate with TRE " + this.f92570g.getName());
            File fileA = g2.a(f92557s, f92561w.replace(f92562x, this.f92570g.getName()));
            this.f92567d = "";
            if (this.f92577n) {
                File fileC = v0.c();
                if (fileC == null) {
                    a4.c("Can't evaluate with TE configuration file is null");
                    return;
                } else {
                    strC = l3.c(fileC.getPath());
                    str = f92560v;
                }
            } else {
                strC = this.f92569f;
                str = f92559u;
            }
            this.f92567d = a(str, strC);
            try {
                ((Activity) i4.c().d().getBaseContext()).runOnUiThread(new b(fileA));
            } catch (Exception e10) {
                a4.c(e10.getMessage());
            }
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(ConfigurationContract configurationContract) throws JSONException {
        if (configurationContract == null || configurationContract.getTargetRuleEngine() == null) {
            return;
        }
        if (configurationContract.getTargetRuleEngine().getUrl() == null && configurationContract.getTargetRuleEngine().getVersion() == null) {
            return;
        }
        this.f92566c = false;
        if (configurationContract.getSdkConfiguration() != null && configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() != null) {
            this.f92576m = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isCanBlockAfterOneSuccess();
            this.f92577n = configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().isEvaluateWithConfigurationFile();
        }
        if (!this.f92577n) {
            this.f92569f = configurationContract.toJsonString();
        }
        if (c(configurationContract.getTargetRuleEngine())) {
            a(u1.b.updateConfiguration);
            e();
            return;
        }
        this.f92570g = i();
        if (!c(configurationContract.getTargetRuleEngine())) {
            a(configurationContract.getTargetRuleEngine());
        } else {
            e();
            a(u1.b.updateConfiguration);
        }
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void b(boolean z10) {
        b(z10, true);
    }

    void a(TargetRuleEngineContract targetRuleEngineContract) {
        if (targetRuleEngineContract == null) {
            return;
        }
        s4.f().a(true, targetRuleEngineContract.getUrl(), b(targetRuleEngineContract), (n6<File>) new d(targetRuleEngineContract));
    }

    protected void b(boolean z10, boolean z11) {
        boolean z12 = this.f92572i;
        if (z12 == z10) {
            a4.e("Intercept already " + (z12 ? "enabled" : "disabled"));
            return;
        }
        this.f92572i = z10;
        if (z10) {
            a4.e("Intercept enabled");
            CollectorsInfrastructure.getInstance().interceptEnabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportEnableInterceptEvent();
        } else {
            a4.e("Intercept disabled");
            CollectorsInfrastructure.getInstance().interceptDisabledCollector.a(Boolean.TRUE);
            AnalyticsBridge.getInstance().reportDisableInterceptEvent();
        }
        if (z11) {
            if (!z12 || this.f92572i) {
                a(u1.b.enableIntercept);
            } else {
                l();
            }
        }
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.medallia.digital.mobilesdk.j7
    public synchronized void a(u1.b bVar) {
        if (u1.a(bVar).contains(u1.d.FOREGROUND)) {
            if (!this.f92572i) {
                a4.b("Intercept is not enabled, evaluate won't run");
                return;
            }
            if (this.f92576m && this.f92566c) {
                a4.b("Skip evaluation intercept was already shown in session");
                return;
            }
            if (!g2.d(this.f92570g)) {
                a4.c("Target engine is missing");
                return;
            }
            x7 x7Var = this.f92565b;
            if (x7Var == null) {
                a4.c("Throttle is null");
                return;
            }
            x7Var.a((x7) bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(File file) throws JSONException {
        ArrayList<Pair<String, Boolean>> arrayListA = g2.a(f92558t, file);
        if (arrayListA != null) {
            Iterator<Pair<String, Boolean>> it = arrayListA.iterator();
            while (it.hasNext()) {
                Pair<String, Boolean> next = it.next();
                if (next != null) {
                    AnalyticsBridge.getInstance().reportDeleteStorageEvent((String) next.first, ((Boolean) next.second).booleanValue());
                }
            }
        }
        d7.b().b(d7.a.TARGET_ENGINE, (String) null);
    }

    void a(File file, TargetRuleEngineContract targetRuleEngineContract) {
        if (targetRuleEngineContract == null || !g2.d(file)) {
            return;
        }
        d7.b().b(d7.a.TARGET_ENGINE, targetRuleEngineContract.toJsonString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(String str) {
        EvaluationResult evaluationResultCreateEvaluationResult;
        a4.b(str);
        t1 t1Var = new t1(Long.valueOf(System.currentTimeMillis()), new Throwable().getStackTrace()[2].getMethodName());
        try {
            try {
                evaluationResultCreateEvaluationResult = ModelFactory.getInstance().createEvaluationResult(str);
            } catch (Exception e10) {
                t1Var.f93035b = System.currentTimeMillis();
                t1Var.f93037d = e10.getMessage();
                a4.c(String.format(Locale.US, "[%d] - [%d] failure: Evaluate crashed with exception. Message : %s", Long.valueOf(t1Var.f93034a), Long.valueOf(t1Var.f93035b), t1Var.f93037d));
            }
            if (evaluationResultCreateEvaluationResult == null) {
                throw new Exception("Parsing result failed");
            }
            t1Var.f93035b = System.currentTimeMillis();
            t1Var.f93037d = str;
            this.f92568e = evaluationResultCreateEvaluationResult.getNextEvaluationTime();
            if (evaluationResultCreateEvaluationResult.getEngagementId() != null) {
                a4.b(String.format(Locale.US, "[%d] - [%d] success: Calling InterceptProducer - with engagement id: %s", Long.valueOf(t1Var.f93034a), Long.valueOf(t1Var.f93035b), evaluationResultCreateEvaluationResult.getEngagementId()));
                this.f92566c = true;
                c3.d().b(evaluationResultCreateEvaluationResult.getEngagementId(), evaluationResultCreateEvaluationResult.getEngagementType(), System.currentTimeMillis());
            } else if (this.f92568e != null) {
                a4.b(String.format(Locale.US, "[%d] - [%d] success: Calling evaluate with timestamp %d", Long.valueOf(t1Var.f93034a), Long.valueOf(t1Var.f93035b), this.f92568e));
                j();
            }
            a(evaluationResultCreateEvaluationResult.getEngagementId(), str, this.f92573j);
            this.f92571h.add(t1Var);
            d();
        } catch (Throwable th2) {
            this.f92571h.add(t1Var);
            d();
            throw th2;
        }
    }

    private void a(String str, String str2, u1.b bVar) throws JSONException {
        j2 j2VarC = r2.e().c(str);
        AnalyticsBridge analyticsBridge = AnalyticsBridge.getInstance();
        long j10 = this.f92564a;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (j2VarC == null) {
            str = null;
        }
        analyticsBridge.reportTargetEvaluatorEvent(j10, jCurrentTimeMillis, str, j2VarC != null ? j2VarC.c() : null, str2, bVar.name());
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z10) {
        this.f92575l = z10;
    }

    @Override // com.medallia.digital.mobilesdk.j7
    public void a(boolean z10, boolean z11) {
        this.f92572i = z10;
        this.f92575l = z11;
    }
}
