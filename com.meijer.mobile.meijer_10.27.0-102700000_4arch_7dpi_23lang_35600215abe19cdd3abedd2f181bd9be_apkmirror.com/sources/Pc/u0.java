package Pc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C6908Kq;
import com.google.android.gms.internal.ads.C7291Wb;
import com.google.android.gms.internal.ads.C7808dg;
import com.google.android.gms.internal.ads.C7914eg;
import com.google.android.gms.internal.ads.C8659lf;
import com.google.android.gms.internal.ads.C9643uq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class u0 implements r0 {

    /* renamed from: b, reason: collision with root package name */
    private boolean f25196b;

    /* renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.q f25198d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f25200f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f25201g;

    /* renamed from: i, reason: collision with root package name */
    private String f25203i;

    /* renamed from: j, reason: collision with root package name */
    private String f25204j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f25195a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f25197c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private C7291Wb f25199e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f25202h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f25205k = true;

    /* renamed from: l, reason: collision with root package name */
    private String f25206l = "-1";

    /* renamed from: m, reason: collision with root package name */
    private int f25207m = -1;

    /* renamed from: n, reason: collision with root package name */
    private C9643uq f25208n = new C9643uq("", 0);

    /* renamed from: o, reason: collision with root package name */
    private long f25209o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f25210p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f25211q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f25212r = 0;

    /* renamed from: s, reason: collision with root package name */
    private Set f25213s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f25214t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    private boolean f25215u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f25216v = true;

    /* renamed from: w, reason: collision with root package name */
    private String f25217w = null;

    /* renamed from: x, reason: collision with root package name */
    private String f25218x = "";

    /* renamed from: y, reason: collision with root package name */
    private boolean f25219y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f25220z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f25191A = "{}";

    /* renamed from: B, reason: collision with root package name */
    private int f25192B = -1;

    /* renamed from: C, reason: collision with root package name */
    private int f25193C = -1;

    /* renamed from: D, reason: collision with root package name */
    private long f25194D = 0;

    private final void d() throws ExecutionException, InterruptedException, TimeoutException {
        com.google.common.util.concurrent.q qVar = this.f25198d;
        if (qVar == null || qVar.isDone()) {
            return;
        }
        try {
            this.f25198d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Qc.p.h("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            Qc.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            Qc.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            Qc.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void e() {
        C6908Kq.f68174a.execute(new Runnable() { // from class: Pc.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f25184a.a();
            }
        });
    }

    @Override // Pc.r0
    public final void B(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76483q9)).booleanValue()) {
            d();
            synchronized (this.f25195a) {
                try {
                    if (this.f25191A.equals(str)) {
                        return;
                    }
                    this.f25191A = str;
                    SharedPreferences.Editor editor = this.f25201g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f25201g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // Pc.r0
    public final void C(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
            d();
            synchronized (this.f25195a) {
                try {
                    if (this.f25220z.equals(str)) {
                        return;
                    }
                    this.f25220z = str;
                    SharedPreferences.Editor editor = this.f25201g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f25201g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // Pc.r0
    public final void E(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue()) {
            d();
            synchronized (this.f25195a) {
                try {
                    if (this.f25218x.equals(str)) {
                        return;
                    }
                    this.f25218x = str;
                    SharedPreferences.Editor editor = this.f25201g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f25201g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // Pc.r0
    public final void I(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
            d();
            synchronized (this.f25195a) {
                try {
                    if (this.f25219y == z10) {
                        return;
                    }
                    this.f25219y = z10;
                    SharedPreferences.Editor editor = this.f25201g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z10);
                        this.f25201g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final C7291Wb a() {
        if (!this.f25196b) {
            return null;
        }
        if ((n() && l()) || !((Boolean) C7808dg.f73451b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.f25195a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f25199e == null) {
                    this.f25199e = new C7291Wb();
                }
                this.f25199e.e();
                Qc.p.f("start fetching content...");
                return this.f25199e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.f25195a) {
                try {
                    this.f25200f = sharedPreferences;
                    this.f25201g = editorEdit;
                    if (com.google.android.gms.common.util.n.e()) {
                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    this.f25202h = this.f25200f.getBoolean("use_https", this.f25202h);
                    this.f25215u = this.f25200f.getBoolean("content_url_opted_out", this.f25215u);
                    this.f25203i = this.f25200f.getString("content_url_hashes", this.f25203i);
                    this.f25205k = this.f25200f.getBoolean("gad_idless", this.f25205k);
                    this.f25216v = this.f25200f.getBoolean("content_vertical_opted_out", this.f25216v);
                    this.f25204j = this.f25200f.getString("content_vertical_hashes", this.f25204j);
                    this.f25212r = this.f25200f.getInt("version_code", this.f25212r);
                    if (((Boolean) C7914eg.f73920g.e()).booleanValue() && Mc.A.c().e()) {
                        this.f25208n = new C9643uq("", 0L);
                    } else {
                        this.f25208n = new C9643uq(this.f25200f.getString("app_settings_json", this.f25208n.c()), this.f25200f.getLong("app_settings_last_update_ms", this.f25208n.a()));
                    }
                    this.f25209o = this.f25200f.getLong("app_last_background_time_ms", this.f25209o);
                    this.f25211q = this.f25200f.getInt("request_in_session_count", this.f25211q);
                    this.f25210p = this.f25200f.getLong("first_ad_req_time_ms", this.f25210p);
                    this.f25213s = this.f25200f.getStringSet("never_pool_slots", this.f25213s);
                    this.f25217w = this.f25200f.getString("display_cutout", this.f25217w);
                    this.f25192B = this.f25200f.getInt("app_measurement_npa", this.f25192B);
                    this.f25193C = this.f25200f.getInt("sd_app_measure_npa", this.f25193C);
                    this.f25194D = this.f25200f.getLong("sd_app_measure_npa_ts", this.f25194D);
                    this.f25218x = this.f25200f.getString("inspector_info", this.f25218x);
                    this.f25219y = this.f25200f.getBoolean("linked_device", this.f25219y);
                    this.f25220z = this.f25200f.getString("linked_ad_unit", this.f25220z);
                    this.f25191A = this.f25200f.getString("inspector_ui_storage", this.f25191A);
                    this.f25206l = this.f25200f.getString("IABTCF_TCString", this.f25206l);
                    this.f25207m = this.f25200f.getInt("gad_has_consent_for_cookies", this.f25207m);
                    try {
                        this.f25214t = new JSONObject(this.f25200f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e10) {
                        Qc.p.h("Could not convert native advanced settings to json object", e10);
                    }
                    e();
                } finally {
                }
            }
        } catch (Throwable th2) {
            Lc.v.s().x(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            p0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // Pc.r0
    public final void s(Runnable runnable) {
        this.f25197c.add(runnable);
    }

    @Override // Pc.r0
    public final void z(final Context context) {
        synchronized (this.f25195a) {
            try {
                if (this.f25200f != null) {
                    return;
                }
                final String str = "admob";
                this.f25198d = C6908Kq.f68174a.zza(new Runnable(context, str) { // from class: Pc.t0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Context f25188b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f25189c = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f25187a.b(this.f25188b, this.f25189c);
                    }
                });
                this.f25196b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final boolean zzN() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        if (!((Boolean) Mc.A.c().a(C8659lf.f75985H0)).booleanValue()) {
            return false;
        }
        d();
        synchronized (this.f25195a) {
            z10 = this.f25205k;
        }
        return z10;
    }

    @Override // Pc.r0
    public final C9643uq zzh() {
        C9643uq c9643uq;
        synchronized (this.f25195a) {
            c9643uq = this.f25208n;
        }
        return c9643uq;
    }

    @Override // Pc.r0
    public final void A(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                long jA = Lc.v.c().a();
                if (str != null && !str.equals(this.f25208n.c())) {
                    this.f25208n = new C9643uq(str, jA);
                    SharedPreferences.Editor editor = this.f25201g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f25201g.putLong("app_settings_last_update_ms", jA);
                        this.f25201g.apply();
                    }
                    e();
                    Iterator it = this.f25197c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f25208n.g(jA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void C0(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (TextUtils.equals(this.f25217w, str)) {
                    return;
                }
                this.f25217w = str;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void D(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25194D == j10) {
                    return;
                }
                this.f25194D = j10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final boolean c() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                SharedPreferences sharedPreferences = this.f25200f;
                boolean z10 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f25200f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f25205k) {
                    z10 = true;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final boolean l() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        d();
        synchronized (this.f25195a) {
            z10 = this.f25216v;
        }
        return z10;
    }

    @Override // Pc.r0
    public final boolean m() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        d();
        synchronized (this.f25195a) {
            z10 = this.f25219y;
        }
        return z10;
    }

    @Override // Pc.r0
    public final boolean n() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        d();
        synchronized (this.f25195a) {
            z10 = this.f25215u;
        }
        return z10;
    }

    @Override // Pc.r0
    public final void o(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25216v == z10) {
                    return;
                }
                this.f25216v = z10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void p(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                this.f25207m = i10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    if (i10 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i10);
                    }
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void q(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25215u == z10) {
                    return;
                }
                this.f25215u = z10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void r(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                this.f25206l = str;
                if (this.f25201g != null) {
                    if (str.equals("-1")) {
                        this.f25201g.remove("IABTCF_TCString");
                    } else {
                        this.f25201g.putString("IABTCF_TCString", str);
                    }
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0048, code lost:
    
        r3 = new org.json.JSONObject();
        r3.put("template_id", r9);
        r3.put("uses_media_view", r10);
        r3.put("timestamp_ms", Lc.v.c().a());
        r1.put(r2, r3);
        r7.f25214t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        Qc.p.h("Could not update native advanced settings", r8);
     */
    @Override // Pc.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r8, java.lang.String r9, boolean r10) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r7 = this;
            r7.d()
            java.lang.Object r0 = r7.f25195a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f25214t     // Catch: java.lang.Throwable -> L14
            org.json.JSONArray r1 = r1.optJSONArray(r8)     // Catch: java.lang.Throwable -> L14
            if (r1 != 0) goto L17
            org.json.JSONArray r1 = new org.json.JSONArray     // Catch: java.lang.Throwable -> L14
            r1.<init>()     // Catch: java.lang.Throwable -> L14
            goto L17
        L14:
            r8 = move-exception
            goto L8c
        L17:
            int r2 = r1.length()     // Catch: java.lang.Throwable -> L14
            r3 = 0
            r4 = r3
        L1d:
            int r5 = r1.length()     // Catch: java.lang.Throwable -> L14
            if (r4 >= r5) goto L48
            org.json.JSONObject r5 = r1.optJSONObject(r4)     // Catch: java.lang.Throwable -> L14
            if (r5 != 0) goto L2b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L2b:
            java.lang.String r6 = "template_id"
            java.lang.String r6 = r5.optString(r6)     // Catch: java.lang.Throwable -> L14
            boolean r6 = r9.equals(r6)     // Catch: java.lang.Throwable -> L14
            if (r6 == 0) goto L45
            if (r10 == 0) goto L43
            java.lang.String r2 = "uses_media_view"
            boolean r2 = r5.optBoolean(r2, r3)     // Catch: java.lang.Throwable -> L14
            if (r2 == 0) goto L43
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L43:
            r2 = r4
            goto L48
        L45:
            int r4 = r4 + 1
            goto L1d
        L48:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.<init>()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r4 = "template_id"
            r3.put(r4, r9)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "uses_media_view"
            r3.put(r9, r10)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            java.lang.String r9 = "timestamp_ms"
            com.google.android.gms.common.util.f r10 = Lc.v.c()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            long r4 = r10.a()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            org.json.JSONObject r9 = r7.f25214t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            goto L73
        L6d:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            Qc.p.h(r9, r8)     // Catch: java.lang.Throwable -> L14
        L73:
            android.content.SharedPreferences$Editor r8 = r7.f25201g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L87
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f25214t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f25201g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L87:
            r7.e()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Pc.u0.t(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // Pc.r0
    public final void u(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25210p == j10) {
                    return;
                }
                this.f25210p = j10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void v(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25211q == i10) {
                    return;
                }
                this.f25211q = i10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void w(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25193C == i10) {
                    return;
                }
                this.f25193C = i10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void x(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (z10 == this.f25205k) {
                    return;
                }
                this.f25205k = z10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void y(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) Mc.A.c().a(C8659lf.f76484qa)).longValue();
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                    this.f25201g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final int zza() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        d();
        synchronized (this.f25195a) {
            i10 = this.f25212r;
        }
        return i10;
    }

    @Override // Pc.r0
    public final int zzb() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        return this.f25207m;
    }

    @Override // Pc.r0
    public final int zzc() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        d();
        synchronized (this.f25195a) {
            i10 = this.f25211q;
        }
        return i10;
    }

    @Override // Pc.r0
    public final long zzd() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        d();
        synchronized (this.f25195a) {
            j10 = this.f25209o;
        }
        return j10;
    }

    @Override // Pc.r0
    public final long zze() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        d();
        synchronized (this.f25195a) {
            j10 = this.f25210p;
        }
        return j10;
    }

    @Override // Pc.r0
    public final long zzf() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        d();
        synchronized (this.f25195a) {
            j10 = this.f25194D;
        }
        return j10;
    }

    @Override // Pc.r0
    public final C9643uq zzg() throws ExecutionException, InterruptedException, TimeoutException {
        C9643uq c9643uq;
        d();
        synchronized (this.f25195a) {
            try {
                if (((Boolean) Mc.A.c().a(C8659lf.f75898Ab)).booleanValue() && this.f25208n.j()) {
                    Iterator it = this.f25197c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c9643uq = this.f25208n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9643uq;
    }

    @Override // Pc.r0
    public final String zzi() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f25195a) {
            str = this.f25220z;
        }
        return str;
    }

    @Override // Pc.r0
    public final String zzj() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f25195a) {
            str = this.f25217w;
        }
        return str;
    }

    @Override // Pc.r0
    public final String zzk() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f25195a) {
            str = this.f25218x;
        }
        return str;
    }

    @Override // Pc.r0
    public final String zzl() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f25195a) {
            str = this.f25191A;
        }
        return str;
    }

    @Override // Pc.r0
    public final String zzm() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        return this.f25206l;
    }

    @Override // Pc.r0
    public final JSONObject zzn() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        d();
        synchronized (this.f25195a) {
            jSONObject = this.f25214t;
        }
        return jSONObject;
    }

    @Override // Pc.r0
    public final void zzq() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                this.f25214t = new JSONObject();
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void zzr(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25209o == j10) {
                    return;
                }
                this.f25209o = j10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Pc.r0
    public final void zzt(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f25195a) {
            try {
                if (this.f25212r == i10) {
                    return;
                }
                this.f25212r = i10;
                SharedPreferences.Editor editor = this.f25201g;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.f25201g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
