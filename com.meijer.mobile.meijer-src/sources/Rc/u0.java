package Rc;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Looper;
import android.security.NetworkSecurityPolicy;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.C7033Kq;
import com.google.android.gms.internal.ads.C7416Wb;
import com.google.android.gms.internal.ads.C7933dg;
import com.google.android.gms.internal.ads.C8039eg;
import com.google.android.gms.internal.ads.C8784lf;
import com.google.android.gms.internal.ads.C9768uq;
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
    private boolean f32410b;

    /* renamed from: d, reason: collision with root package name */
    private com.google.common.util.concurrent.q f32412d;

    /* renamed from: f, reason: collision with root package name */
    private SharedPreferences f32414f;

    /* renamed from: g, reason: collision with root package name */
    private SharedPreferences.Editor f32415g;

    /* renamed from: i, reason: collision with root package name */
    private String f32417i;

    /* renamed from: j, reason: collision with root package name */
    private String f32418j;

    /* renamed from: a, reason: collision with root package name */
    private final Object f32409a = new Object();

    /* renamed from: c, reason: collision with root package name */
    private final List f32411c = new ArrayList();

    /* renamed from: e, reason: collision with root package name */
    private C7416Wb f32413e = null;

    /* renamed from: h, reason: collision with root package name */
    private boolean f32416h = true;

    /* renamed from: k, reason: collision with root package name */
    private boolean f32419k = true;

    /* renamed from: l, reason: collision with root package name */
    private String f32420l = "-1";

    /* renamed from: m, reason: collision with root package name */
    private int f32421m = -1;

    /* renamed from: n, reason: collision with root package name */
    private C9768uq f32422n = new C9768uq("", 0);

    /* renamed from: o, reason: collision with root package name */
    private long f32423o = 0;

    /* renamed from: p, reason: collision with root package name */
    private long f32424p = 0;

    /* renamed from: q, reason: collision with root package name */
    private int f32425q = -1;

    /* renamed from: r, reason: collision with root package name */
    private int f32426r = 0;

    /* renamed from: s, reason: collision with root package name */
    private Set f32427s = Collections.EMPTY_SET;

    /* renamed from: t, reason: collision with root package name */
    private JSONObject f32428t = new JSONObject();

    /* renamed from: u, reason: collision with root package name */
    private boolean f32429u = true;

    /* renamed from: v, reason: collision with root package name */
    private boolean f32430v = true;

    /* renamed from: w, reason: collision with root package name */
    private String f32431w = null;

    /* renamed from: x, reason: collision with root package name */
    private String f32432x = "";

    /* renamed from: y, reason: collision with root package name */
    private boolean f32433y = false;

    /* renamed from: z, reason: collision with root package name */
    private String f32434z = "";

    /* renamed from: A, reason: collision with root package name */
    private String f32405A = "{}";

    /* renamed from: B, reason: collision with root package name */
    private int f32406B = -1;

    /* renamed from: C, reason: collision with root package name */
    private int f32407C = -1;

    /* renamed from: D, reason: collision with root package name */
    private long f32408D = 0;

    private final void d() throws ExecutionException, InterruptedException, TimeoutException {
        com.google.common.util.concurrent.q qVar = this.f32412d;
        if (qVar == null || qVar.isDone()) {
            return;
        }
        try {
            this.f32412d.get(1L, TimeUnit.SECONDS);
        } catch (InterruptedException e10) {
            Thread.currentThread().interrupt();
            Sc.p.h("Interrupted while waiting for preferences loaded.", e10);
        } catch (CancellationException e11) {
            e = e11;
            Sc.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (ExecutionException e12) {
            e = e12;
            Sc.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        } catch (TimeoutException e13) {
            e = e13;
            Sc.p.e("Fail to initialize AdSharedPreferenceManager.", e);
        }
    }

    private final void e() {
        C7033Kq.f69014a.execute(new Runnable() { // from class: Rc.s0
            @Override // java.lang.Runnable
            public final void run() {
                this.f32398a.a();
            }
        });
    }

    @Override // Rc.r0
    public final void B(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Oc.A.c().a(C8784lf.f77323q9)).booleanValue()) {
            d();
            synchronized (this.f32409a) {
                try {
                    if (this.f32405A.equals(str)) {
                        return;
                    }
                    this.f32405A = str;
                    SharedPreferences.Editor editor = this.f32415g;
                    if (editor != null) {
                        editor.putString("inspector_ui_storage", str);
                        this.f32415g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // Rc.r0
    public final void C(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Oc.A.c().a(C8784lf.f77141d9)).booleanValue()) {
            d();
            synchronized (this.f32409a) {
                try {
                    if (this.f32434z.equals(str)) {
                        return;
                    }
                    this.f32434z = str;
                    SharedPreferences.Editor editor = this.f32415g;
                    if (editor != null) {
                        editor.putString("linked_ad_unit", str);
                        this.f32415g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // Rc.r0
    public final void E(String str) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue()) {
            d();
            synchronized (this.f32409a) {
                try {
                    if (this.f32432x.equals(str)) {
                        return;
                    }
                    this.f32432x = str;
                    SharedPreferences.Editor editor = this.f32415g;
                    if (editor != null) {
                        editor.putString("inspector_info", str);
                        this.f32415g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    @Override // Rc.r0
    public final void I(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        if (((Boolean) Oc.A.c().a(C8784lf.f77141d9)).booleanValue()) {
            d();
            synchronized (this.f32409a) {
                try {
                    if (this.f32433y == z10) {
                        return;
                    }
                    this.f32433y = z10;
                    SharedPreferences.Editor editor = this.f32415g;
                    if (editor != null) {
                        editor.putBoolean("linked_device", z10);
                        this.f32415g.apply();
                    }
                    e();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public final C7416Wb a() {
        if (!this.f32410b) {
            return null;
        }
        if ((n() && l()) || !((Boolean) C7933dg.f74291b.e()).booleanValue()) {
            return null;
        }
        synchronized (this.f32409a) {
            try {
                if (Looper.getMainLooper() == null) {
                    return null;
                }
                if (this.f32413e == null) {
                    this.f32413e = new C7416Wb();
                }
                this.f32413e.e();
                Sc.p.f("start fetching content...");
                return this.f32413e;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    final /* synthetic */ void b(Context context, String str) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("admob", 0);
        SharedPreferences.Editor editorEdit = sharedPreferences.edit();
        try {
            synchronized (this.f32409a) {
                try {
                    this.f32414f = sharedPreferences;
                    this.f32415g = editorEdit;
                    if (com.google.android.gms.common.util.n.e()) {
                        NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted();
                    }
                    this.f32416h = this.f32414f.getBoolean("use_https", this.f32416h);
                    this.f32429u = this.f32414f.getBoolean("content_url_opted_out", this.f32429u);
                    this.f32417i = this.f32414f.getString("content_url_hashes", this.f32417i);
                    this.f32419k = this.f32414f.getBoolean("gad_idless", this.f32419k);
                    this.f32430v = this.f32414f.getBoolean("content_vertical_opted_out", this.f32430v);
                    this.f32418j = this.f32414f.getString("content_vertical_hashes", this.f32418j);
                    this.f32426r = this.f32414f.getInt("version_code", this.f32426r);
                    if (((Boolean) C8039eg.f74760g.e()).booleanValue() && Oc.A.c().e()) {
                        this.f32422n = new C9768uq("", 0L);
                    } else {
                        this.f32422n = new C9768uq(this.f32414f.getString("app_settings_json", this.f32422n.c()), this.f32414f.getLong("app_settings_last_update_ms", this.f32422n.a()));
                    }
                    this.f32423o = this.f32414f.getLong("app_last_background_time_ms", this.f32423o);
                    this.f32425q = this.f32414f.getInt("request_in_session_count", this.f32425q);
                    this.f32424p = this.f32414f.getLong("first_ad_req_time_ms", this.f32424p);
                    this.f32427s = this.f32414f.getStringSet("never_pool_slots", this.f32427s);
                    this.f32431w = this.f32414f.getString("display_cutout", this.f32431w);
                    this.f32406B = this.f32414f.getInt("app_measurement_npa", this.f32406B);
                    this.f32407C = this.f32414f.getInt("sd_app_measure_npa", this.f32407C);
                    this.f32408D = this.f32414f.getLong("sd_app_measure_npa_ts", this.f32408D);
                    this.f32432x = this.f32414f.getString("inspector_info", this.f32432x);
                    this.f32433y = this.f32414f.getBoolean("linked_device", this.f32433y);
                    this.f32434z = this.f32414f.getString("linked_ad_unit", this.f32434z);
                    this.f32405A = this.f32414f.getString("inspector_ui_storage", this.f32405A);
                    this.f32420l = this.f32414f.getString("IABTCF_TCString", this.f32420l);
                    this.f32421m = this.f32414f.getInt("gad_has_consent_for_cookies", this.f32421m);
                    try {
                        this.f32428t = new JSONObject(this.f32414f.getString("native_advanced_settings", "{}"));
                    } catch (JSONException e10) {
                        Sc.p.h("Could not convert native advanced settings to json object", e10);
                    }
                    e();
                } finally {
                }
            }
        } catch (Throwable th2) {
            Nc.v.s().x(th2, "AdSharedPreferenceManagerImpl.initializeOnBackgroundThread");
            p0.l("AdSharedPreferenceManagerImpl.initializeOnBackgroundThread, errorMessage = ", th2);
        }
    }

    @Override // Rc.r0
    public final void s(Runnable runnable) {
        this.f32411c.add(runnable);
    }

    @Override // Rc.r0
    public final void z(final Context context) {
        synchronized (this.f32409a) {
            try {
                if (this.f32414f != null) {
                    return;
                }
                final String str = "admob";
                this.f32412d = C7033Kq.f69014a.zza(new Runnable(context, str) { // from class: Rc.t0

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ Context f32402b;

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ String f32403c = "admob";

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f32401a.b(this.f32402b, this.f32403c);
                    }
                });
                this.f32410b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final boolean zzN() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        if (!((Boolean) Oc.A.c().a(C8784lf.f76825H0)).booleanValue()) {
            return false;
        }
        d();
        synchronized (this.f32409a) {
            z10 = this.f32419k;
        }
        return z10;
    }

    @Override // Rc.r0
    public final C9768uq zzh() {
        C9768uq c9768uq;
        synchronized (this.f32409a) {
            c9768uq = this.f32422n;
        }
        return c9768uq;
    }

    @Override // Rc.r0
    public final void A(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                long jA = Nc.v.c().a();
                if (str != null && !str.equals(this.f32422n.c())) {
                    this.f32422n = new C9768uq(str, jA);
                    SharedPreferences.Editor editor = this.f32415g;
                    if (editor != null) {
                        editor.putString("app_settings_json", str);
                        this.f32415g.putLong("app_settings_last_update_ms", jA);
                        this.f32415g.apply();
                    }
                    e();
                    Iterator it = this.f32411c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                    return;
                }
                this.f32422n.g(jA);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void D(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32408D == j10) {
                    return;
                }
                this.f32408D = j10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putLong("sd_app_measure_npa_ts", j10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void F0(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (TextUtils.equals(this.f32431w, str)) {
                    return;
                }
                this.f32431w = str;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putString("display_cutout", str);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final boolean c() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                SharedPreferences sharedPreferences = this.f32414f;
                boolean z10 = false;
                if (sharedPreferences == null) {
                    return false;
                }
                if (sharedPreferences.getLong("topics_consent_expiry_time_ms", 0L) < System.currentTimeMillis()) {
                    return false;
                }
                if (this.f32414f.getBoolean("is_topics_ad_personalization_allowed", false) && !this.f32419k) {
                    z10 = true;
                }
                return z10;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final boolean l() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        d();
        synchronized (this.f32409a) {
            z10 = this.f32430v;
        }
        return z10;
    }

    @Override // Rc.r0
    public final boolean m() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        d();
        synchronized (this.f32409a) {
            z10 = this.f32433y;
        }
        return z10;
    }

    @Override // Rc.r0
    public final boolean n() throws ExecutionException, InterruptedException, TimeoutException {
        boolean z10;
        d();
        synchronized (this.f32409a) {
            z10 = this.f32429u;
        }
        return z10;
    }

    @Override // Rc.r0
    public final void o(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32430v == z10) {
                    return;
                }
                this.f32430v = z10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putBoolean("content_vertical_opted_out", z10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void p(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                this.f32421m = i10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    if (i10 == -1) {
                        editor.remove("gad_has_consent_for_cookies");
                    } else {
                        editor.putInt("gad_has_consent_for_cookies", i10);
                    }
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void q(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32429u == z10) {
                    return;
                }
                this.f32429u = z10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putBoolean("content_url_opted_out", z10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void r(String str) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                this.f32420l = str;
                if (this.f32415g != null) {
                    if (str.equals("-1")) {
                        this.f32415g.remove("IABTCF_TCString");
                    } else {
                        this.f32415g.putString("IABTCF_TCString", str);
                    }
                    this.f32415g.apply();
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
        r3.put("timestamp_ms", Nc.v.c().a());
        r1.put(r2, r3);
        r7.f32428t.put(r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006d, code lost:
    
        r8 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006e, code lost:
    
        Sc.p.h("Could not update native advanced settings", r8);
     */
    @Override // Rc.r0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void t(java.lang.String r8, java.lang.String r9, boolean r10) throws java.util.concurrent.ExecutionException, java.lang.InterruptedException, java.util.concurrent.TimeoutException {
        /*
            r7 = this;
            r7.d()
            java.lang.Object r0 = r7.f32409a
            monitor-enter(r0)
            org.json.JSONObject r1 = r7.f32428t     // Catch: java.lang.Throwable -> L14
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
            com.google.android.gms.common.util.f r10 = Nc.v.c()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            long r4 = r10.a()     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r3.put(r9, r4)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r1.put(r2, r3)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            org.json.JSONObject r9 = r7.f32428t     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            r9.put(r8, r1)     // Catch: java.lang.Throwable -> L14 org.json.JSONException -> L6d
            goto L73
        L6d:
            r8 = move-exception
            java.lang.String r9 = "Could not update native advanced settings"
            Sc.p.h(r9, r8)     // Catch: java.lang.Throwable -> L14
        L73:
            android.content.SharedPreferences$Editor r8 = r7.f32415g     // Catch: java.lang.Throwable -> L14
            if (r8 == 0) goto L87
            java.lang.String r9 = "native_advanced_settings"
            org.json.JSONObject r10 = r7.f32428t     // Catch: java.lang.Throwable -> L14
            java.lang.String r10 = r10.toString()     // Catch: java.lang.Throwable -> L14
            r8.putString(r9, r10)     // Catch: java.lang.Throwable -> L14
            android.content.SharedPreferences$Editor r8 = r7.f32415g     // Catch: java.lang.Throwable -> L14
            r8.apply()     // Catch: java.lang.Throwable -> L14
        L87:
            r7.e()     // Catch: java.lang.Throwable -> L14
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            return
        L8c:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: Rc.u0.t(java.lang.String, java.lang.String, boolean):void");
    }

    @Override // Rc.r0
    public final void u(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32424p == j10) {
                    return;
                }
                this.f32424p = j10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putLong("first_ad_req_time_ms", j10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void v(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32425q == i10) {
                    return;
                }
                this.f32425q = i10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putInt("request_in_session_count", i10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void w(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32407C == i10) {
                    return;
                }
                this.f32407C = i10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putInt("sd_app_measure_npa", i10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void x(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (z10 == this.f32419k) {
                    return;
                }
                this.f32419k = z10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putBoolean("gad_idless", z10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void y(boolean z10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                long jCurrentTimeMillis = System.currentTimeMillis() + ((Long) Oc.A.c().a(C8784lf.f77324qa)).longValue();
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putBoolean("is_topics_ad_personalization_allowed", z10);
                    this.f32415g.putLong("topics_consent_expiry_time_ms", jCurrentTimeMillis);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final int zza() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        d();
        synchronized (this.f32409a) {
            i10 = this.f32426r;
        }
        return i10;
    }

    @Override // Rc.r0
    public final int zzb() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        return this.f32421m;
    }

    @Override // Rc.r0
    public final int zzc() throws ExecutionException, InterruptedException, TimeoutException {
        int i10;
        d();
        synchronized (this.f32409a) {
            i10 = this.f32425q;
        }
        return i10;
    }

    @Override // Rc.r0
    public final long zzd() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        d();
        synchronized (this.f32409a) {
            j10 = this.f32423o;
        }
        return j10;
    }

    @Override // Rc.r0
    public final long zze() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        d();
        synchronized (this.f32409a) {
            j10 = this.f32424p;
        }
        return j10;
    }

    @Override // Rc.r0
    public final long zzf() throws ExecutionException, InterruptedException, TimeoutException {
        long j10;
        d();
        synchronized (this.f32409a) {
            j10 = this.f32408D;
        }
        return j10;
    }

    @Override // Rc.r0
    public final C9768uq zzg() throws ExecutionException, InterruptedException, TimeoutException {
        C9768uq c9768uq;
        d();
        synchronized (this.f32409a) {
            try {
                if (((Boolean) Oc.A.c().a(C8784lf.f76738Ab)).booleanValue() && this.f32422n.j()) {
                    Iterator it = this.f32411c.iterator();
                    while (it.hasNext()) {
                        ((Runnable) it.next()).run();
                    }
                }
                c9768uq = this.f32422n;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return c9768uq;
    }

    @Override // Rc.r0
    public final String zzi() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f32409a) {
            str = this.f32434z;
        }
        return str;
    }

    @Override // Rc.r0
    public final String zzj() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f32409a) {
            str = this.f32431w;
        }
        return str;
    }

    @Override // Rc.r0
    public final String zzk() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f32409a) {
            str = this.f32432x;
        }
        return str;
    }

    @Override // Rc.r0
    public final String zzl() throws ExecutionException, InterruptedException, TimeoutException {
        String str;
        d();
        synchronized (this.f32409a) {
            str = this.f32405A;
        }
        return str;
    }

    @Override // Rc.r0
    public final String zzm() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        return this.f32420l;
    }

    @Override // Rc.r0
    public final JSONObject zzn() throws ExecutionException, InterruptedException, TimeoutException {
        JSONObject jSONObject;
        d();
        synchronized (this.f32409a) {
            jSONObject = this.f32428t;
        }
        return jSONObject;
    }

    @Override // Rc.r0
    public final void zzq() throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                this.f32428t = new JSONObject();
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.remove("native_advanced_settings");
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void zzr(long j10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32423o == j10) {
                    return;
                }
                this.f32423o = j10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putLong("app_last_background_time_ms", j10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // Rc.r0
    public final void zzt(int i10) throws ExecutionException, InterruptedException, TimeoutException {
        d();
        synchronized (this.f32409a) {
            try {
                if (this.f32426r == i10) {
                    return;
                }
                this.f32426r = i10;
                SharedPreferences.Editor editor = this.f32415g;
                if (editor != null) {
                    editor.putInt("version_code", i10);
                    this.f32415g.apply();
                }
                e();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
