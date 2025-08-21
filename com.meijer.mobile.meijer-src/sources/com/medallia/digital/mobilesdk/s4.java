package com.medallia.digital.mobilesdk;

import android.os.Build;
import com.medallia.digital.mobilesdk.d7;
import com.medallia.digital.mobilesdk.l8;
import com.medallia.digital.mobilesdk.o6;
import com.medallia.digital.mobilesdk.r0;
import j$.net.URLEncoder;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
final class s4 implements m8 {

    /* renamed from: n, reason: collision with root package name */
    private static final String f93811n = "tre-version";

    /* renamed from: o, reason: collision with root package name */
    private static final String f93812o = "deviceModel";

    /* renamed from: p, reason: collision with root package name */
    private static final String f93813p = "osVersion";

    /* renamed from: q, reason: collision with root package name */
    private static final String f93814q = "sdkVersion";

    /* renamed from: r, reason: collision with root package name */
    private static final String f93815r = "osType";

    /* renamed from: s, reason: collision with root package name */
    private static final String f93816s = "deviceVendor";

    /* renamed from: t, reason: collision with root package name */
    private static final String f93817t = "locale";

    /* renamed from: u, reason: collision with root package name */
    private static final String f93818u = "mimeType";

    /* renamed from: v, reason: collision with root package name */
    private static final String f93819v = "customDomain";

    /* renamed from: w, reason: collision with root package name */
    private static final String f93820w = "ttlMinutes";

    /* renamed from: x, reason: collision with root package name */
    private static final String f93821x = "60";

    /* renamed from: y, reason: collision with root package name */
    private static final String f93822y = "staticCollectors";

    /* renamed from: z, reason: collision with root package name */
    private static s4 f93823z;

    /* renamed from: c, reason: collision with root package name */
    private w4 f93826c;

    /* renamed from: d, reason: collision with root package name */
    private String f93827d;

    /* renamed from: e, reason: collision with root package name */
    private String f93828e;

    /* renamed from: f, reason: collision with root package name */
    private String f93829f;

    /* renamed from: g, reason: collision with root package name */
    private long f93830g;

    /* renamed from: h, reason: collision with root package name */
    private long f93831h;

    /* renamed from: i, reason: collision with root package name */
    private r1 f93832i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f93833j;

    /* renamed from: k, reason: collision with root package name */
    private HashMap<String, String> f93834k;

    /* renamed from: l, reason: collision with root package name */
    private b5 f93835l;

    /* renamed from: m, reason: collision with root package name */
    private String f93836m;

    /* renamed from: b, reason: collision with root package name */
    private int f93825b;

    /* renamed from: a, reason: collision with root package name */
    private o6 f93824a = new o6(this.f93825b);

    class a implements r0.b {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ HashMap f93837a;

        a(HashMap map) {
            this.f93837a = map;
        }

        @Override // com.medallia.digital.mobilesdk.r0.b
        public l0 a() {
            return new l0(w2.c().a().c(), null, this.f93837a, null);
        }
    }

    enum c {
        API_TOKEN,
        ACCESS_TOKEN
    }

    private s4() {
    }

    private String a() {
        return a(this.f93835l);
    }

    private HashMap<String, String> d() {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(f93814q, URLEncoder.encode("4.8.1", "UTF-8"));
        } catch (Exception e10) {
            a4.c(e10.getMessage());
        }
        try {
            map.put(f93815r, URLEncoder.encode("android", "UTF-8"));
        } catch (Exception e11) {
            a4.c(e11.getMessage());
        }
        return map;
    }

    protected static s4 f() {
        if (f93823z == null) {
            f93823z = new s4();
        }
        return f93823z;
    }

    protected long b() {
        return this.f93830g;
    }

    int c() {
        if (e() == null || e().a() == null) {
            return 512;
        }
        return e().a().intValue();
    }

    @Override // com.medallia.digital.mobilesdk.m8
    public void clearAndDisconnect() {
        a4.a(s4.class.getSimpleName());
        this.f93824a = null;
        f93823z = null;
    }

    r1 e() {
        return this.f93832i;
    }

    long g() {
        return this.f93831h;
    }

    o6 h() {
        return this.f93824a;
    }

    w4 i() {
        return this.f93826c;
    }

    String j() {
        return this.f93828e;
    }

    String k() {
        return this.f93827d;
    }

    int l() {
        return this.f93825b;
    }

    String m() {
        return this.f93829f;
    }

    boolean n() {
        return this.f93833j;
    }

    class b implements n6<String> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ n6 f93839a;

        b(n6 n6Var) {
            this.f93839a = n6Var;
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(h4 h4Var) {
            this.f93839a.a(h4Var);
        }

        @Override // com.medallia.digital.mobilesdk.n6
        public void a(String str) {
            this.f93839a.a((n6) str);
        }
    }

    protected String a(b5 b5Var) {
        return b5Var.d() + b5Var.c() + b5Var.b() + b5Var.f() + b5Var.a();
    }

    protected HashMap<String, String> a(e5 e5Var) {
        HashMap<String, String> map = new HashMap<>();
        try {
            map.put(f93818u, e5Var.f());
            map.put(f93819v, "true");
            map.put(f93820w, f93821x);
            return map;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return map;
        }
    }

    private JSONObject a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("appId", CollectorsInfrastructure.getInstance().getAppId());
            jSONObject2.put("appName", CollectorsInfrastructure.getInstance().getAppName());
            jSONObject2.put(f93812o, CollectorsInfrastructure.getInstance().getDeviceModel());
            jSONObject2.put("sdkFramework", CollectorsInfrastructure.getInstance().getSDKFramework());
            jSONObject2.put("osName", CollectorsInfrastructure.getInstance().getOSName());
            jSONObject2.put("propertyId", CollectorsInfrastructure.getInstance().getPropertyId());
            jSONObject2.put("accountId", CollectorsInfrastructure.getInstance().getAccountId());
            jSONObject2.put("deviceId", CollectorsInfrastructure.getInstance().getDeviceId());
            jSONObject.put(f93822y, jSONObject2);
            return jSONObject;
        } catch (Exception e10) {
            a4.c(e10.getMessage());
            return jSONObject;
        }
    }

    protected void a(int i10, int i11, long j10, long j11) {
        a4.b(f().getClass().getSimpleName() + " initialized");
        a(i10, i11, (String) null, j10, j11, (String) null);
    }

    protected void a(int i10, int i11, String str, long j10, long j11, String str2) {
        this.f93825b = i10;
        this.f93826c = new w4(new u4(i11));
        this.f93828e = str;
        this.f93829f = d7.b().a(d7.a.UUID_URL, (String) null);
        this.f93831h = j10;
        this.f93830g = j11;
        this.f93827d = str2;
        o6 o6Var = this.f93824a;
        if (o6Var != null) {
            o6Var.a(i10, j10);
        }
        a4.b("MedalliaDigitalClient updated configuration");
    }

    protected void a(int i10, w4 w4Var, String str, long j10, long j11, String str2) {
        this.f93825b = i10;
        this.f93826c = w4Var;
        this.f93828e = str;
        this.f93829f = d7.b().a(d7.a.UUID_URL, (String) null);
        this.f93831h = j10;
        this.f93830g = j11;
        this.f93827d = str2;
        o6 o6Var = this.f93824a;
        if (o6Var != null) {
            o6Var.a(i10, j10);
        }
        a4.b("MedalliaDigitalClient updated configuration");
    }

    protected void a(ConfigurationContract configurationContract) {
        if (configurationContract == null || configurationContract.getSdkConfiguration() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig() == null) {
            return;
        }
        this.f93831h = (configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime() == null || configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue() <= 0) ? l8.b.f93364b : configurationContract.getSdkConfiguration().getMedalliaDigitalBrain().getSessionInactivityTime().longValue();
        if (configurationContract.getPropertyConfiguration() != null) {
            this.f93833j = configurationContract.getPropertyConfiguration().isDigitalAnalyticsEnabled();
        }
        MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfig = configurationContract.getSdkConfiguration().getMedalliaDigitalClientConfig();
        if (medalliaDigitalClientConfig.getHttpRequestTimeout() != null) {
            this.f93825b = medalliaDigitalClientConfig.getHttpRequestTimeout().intValue();
        }
        if (medalliaDigitalClientConfig.getServerHttpRequestsConfiguration() != null) {
            this.f93826c = medalliaDigitalClientConfig.getServerHttpRequestsConfiguration();
        }
        if (medalliaDigitalClientConfig.getSubmitUrlPrefix() != null && medalliaDigitalClientConfig.getSubmitUrlSuffix() != null) {
            this.f93828e = String.format("%s%s", medalliaDigitalClientConfig.getSubmitUrlPrefix(), medalliaDigitalClientConfig.getSubmitUrlSuffix());
        }
        if (configurationContract.getConfigurationUUID() != null) {
            this.f93829f = configurationContract.getConfigurationUUID().getUrl();
        }
        this.f93830g = medalliaDigitalClientConfig.getAccessTokenValidationBufferTime();
        if (medalliaDigitalClientConfig.getMediaCaptureConfiguration() != null) {
            b5 mediaCaptureConfiguration = medalliaDigitalClientConfig.getMediaCaptureConfiguration();
            this.f93835l = mediaCaptureConfiguration;
            if (mediaCaptureConfiguration.a() != null && this.f93835l.b() != null && this.f93835l.d() != null) {
                this.f93827d = a();
            }
        }
        if (medalliaDigitalClientConfig.getDigitalAnalyticsConfigurationContract() != null && medalliaDigitalClientConfig.getDigitalAnalyticsConfigurationContract().f() != null) {
            this.f93834k = medalliaDigitalClientConfig.getDigitalAnalyticsConfigurationContract().f();
        }
        a(this.f93825b, this.f93826c, this.f93828e, this.f93831h, this.f93830g, this.f93827d);
        a(medalliaDigitalClientConfig);
    }

    private void a(MedalliaDigitalClientConfigurationContract medalliaDigitalClientConfigurationContract) {
        if (medalliaDigitalClientConfigurationContract == null) {
            a4.f("MedalliaDigitalClientConfigurationContract is null");
            return;
        }
        if (medalliaDigitalClientConfigurationContract.getHttpRequestTimeout() != null) {
            this.f93825b = medalliaDigitalClientConfigurationContract.getHttpRequestTimeout().intValue();
        }
        if (medalliaDigitalClientConfigurationContract.getServerHttpRequestsConfiguration() != null) {
            this.f93826c = medalliaDigitalClientConfigurationContract.getServerHttpRequestsConfiguration();
        }
        if (medalliaDigitalClientConfigurationContract.getSubmitUrlPrefix() != null && medalliaDigitalClientConfigurationContract.getSubmitUrlSuffix() != null) {
            this.f93828e = String.format("%s%s", medalliaDigitalClientConfigurationContract.getSubmitUrlPrefix(), medalliaDigitalClientConfigurationContract.getSubmitUrlSuffix());
        }
        if (medalliaDigitalClientConfigurationContract.getDigitalAnalyticsConfigurationContract() != null) {
            this.f93832i = medalliaDigitalClientConfigurationContract.getDigitalAnalyticsConfigurationContract();
        }
        if (medalliaDigitalClientConfigurationContract.getMediaCaptureConfiguration() != null) {
            this.f93835l = medalliaDigitalClientConfigurationContract.getMediaCaptureConfiguration();
            this.f93827d = a();
        }
        this.f93836m = medalliaDigitalClientConfigurationContract.getQuarantineValidationEndpoint();
        a4.b("MedalliaDigitalClientConfiguration updated");
    }

    protected void a(c2 c2Var, n6<Void> n6Var) {
        a4.b("Submit Feedback called with feedback: " + c2Var);
        new g7(this.f93824a, new l0(this.f93828e, null, d(), null), c2Var, n6Var).c();
    }

    protected void a(e5 e5Var, b5 b5Var, Boolean bool, n6<String> n6Var) {
        a4.b("LivingLens Submit Media Feedback called with: " + e5Var.d());
        String strA = this.f93827d;
        if (b5Var == null) {
            b5Var = this.f93835l;
        }
        b5 b5Var2 = b5Var;
        if (bool.booleanValue()) {
            strA = a(b5Var2);
        }
        new h7(e5Var, b5Var2, this.f93824a, new l0(strA, null, a(e5Var), null), new b(n6Var)).c();
    }

    protected void a(n6<Void> n6Var, JSONObject jSONObject) throws JSONException {
        a4.b("submitDigitalAnalytics was called");
        if (this.f93833j) {
            new f7(this.f93824a, new l0(this.f93832i.g(), this.f93834k, null, a(jSONObject)), n6Var).c();
        }
    }

    protected void a(o6.a aVar) {
        a4.b("getConfigurationUuid was called");
        String str = this.f93829f;
        if ((str == null || str.isEmpty()) && t0.c() != null && t0.c().a() != null && t0.c().a().configurationUUID != null) {
            this.f93829f = t0.c().a().configurationUUID.getUrl();
        }
        new k8(this.f93824a, this.f93829f).a(aVar);
    }

    protected void a(o6 o6Var) {
        this.f93824a = o6Var;
    }

    protected void a(String str, n6<u0> n6Var) {
        a4.b("getConfiguration called with tre-version: " + str);
        HashMap map = new HashMap();
        try {
            map.put(f93811n, URLEncoder.encode(str, "UTF-8"));
        } catch (UnsupportedEncodingException e10) {
            a4.c(e10.getMessage());
        }
        String str2 = Build.MANUFACTURER;
        if (str2 != null) {
            try {
                map.put(f93816s, URLEncoder.encode(str2, "UTF-8"));
            } catch (UnsupportedEncodingException e11) {
                a4.c(e11.getMessage());
            }
        }
        String str3 = Build.MODEL;
        if (str3 != null) {
            try {
                map.put(f93812o, URLEncoder.encode(str3, "UTF-8"));
            } catch (Exception e12) {
                a4.c(e12.getMessage());
            }
        }
        String str4 = Build.VERSION.RELEASE;
        if (str4 != null) {
            try {
                map.put(f93813p, URLEncoder.encode(str4, "UTF-8"));
            } catch (Exception e13) {
                a4.c(e13.getMessage());
            }
        }
        try {
            map.put(f93814q, URLEncoder.encode("4.8.1", "UTF-8"));
        } catch (Exception e14) {
            a4.c(e14.getMessage());
        }
        try {
            String strC = x3.e().c();
            if (strC == null) {
                strC = x3.e().d();
            }
            map.put(f93817t, URLEncoder.encode(strC, "UTF-8"));
        } catch (UnsupportedEncodingException e15) {
            a4.c(e15.getMessage());
        }
        map.putAll(d());
        new r0(this.f93824a, new l0(this.f93829f, null, d(), null), new a(map), n6Var).c();
    }

    protected void a(String str, String str2, n6<File> n6Var) {
        a(false, str, str2, n6Var);
    }

    protected void a(JSONObject jSONObject, n6<f6> n6Var) {
        a4.b("QuarantineValidationRules was called");
        new e6(this.f93824a, new l0(this.f93836m, d(), jSONObject), n6Var).c();
    }

    protected void a(boolean z10, String str, String str2, n6<File> n6Var) {
        a4.b("getResource called with url: " + str);
        new t2(this.f93824a, new l0(str), str2, n6Var, z10).c();
    }
}
