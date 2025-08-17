package com.google.android.gms.internal.ads;

import Mc.C4169y;
import android.content.Context;
import android.os.Build;
import android.os.RemoteException;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class ZO implements BP, KO {

    /* renamed from: a, reason: collision with root package name */
    private final C8638lP f72140a;

    /* renamed from: b, reason: collision with root package name */
    private final CP f72141b;

    /* renamed from: c, reason: collision with root package name */
    private final LO f72142c;

    /* renamed from: d, reason: collision with root package name */
    private final UO f72143d;

    /* renamed from: e, reason: collision with root package name */
    private final JO f72144e;

    /* renamed from: f, reason: collision with root package name */
    private final BinderC9921xP f72145f;

    /* renamed from: g, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC8212hP f72146g;

    /* renamed from: h, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC8212hP f72147h;

    /* renamed from: i, reason: collision with root package name */
    private final String f72148i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f72149j;

    /* renamed from: k, reason: collision with root package name */
    private final String f72150k;

    /* renamed from: p, reason: collision with root package name */
    private JSONObject f72155p;

    /* renamed from: s, reason: collision with root package name */
    private boolean f72158s;

    /* renamed from: t, reason: collision with root package name */
    private int f72159t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f72160u;

    /* renamed from: l, reason: collision with root package name */
    private final Map f72151l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final Map f72152m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map f72153n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private String f72154o = "{}";

    /* renamed from: q, reason: collision with root package name */
    private long f72156q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    private VO f72157r = VO.NONE;

    /* renamed from: v, reason: collision with root package name */
    private YO f72161v = YO.UNKNOWN;

    /* renamed from: w, reason: collision with root package name */
    private long f72162w = 0;

    /* renamed from: x, reason: collision with root package name */
    private String f72163x = "";

    private final synchronized void A() {
        int iOrdinal = this.f72157r.ordinal();
        if (iOrdinal == 1) {
            this.f72141b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f72142c.c();
        }
    }

    private final synchronized void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            y(jSONObject.optBoolean("isTestMode", false), false);
            x((VO) Enum.valueOf(VO.class, jSONObject.optString("gesture", "NONE")), false);
            this.f72154o = jSONObject.optString("networkExtras", "{}");
            this.f72156q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject u() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f72151l.entrySet()) {
                JSONArray jSONArray = new JSONArray();
                for (NO no2 : (List) entry.getValue()) {
                    if (no2.e()) {
                        jSONArray.put(no2.b());
                    }
                }
                if (jSONArray.length() > 0) {
                    jSONObject.put((String) entry.getKey(), jSONArray);
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    private final void v() throws JSONException {
        this.f72160u = true;
        this.f72143d.c();
        this.f72140a.c(this);
        this.f72141b.d(this);
        this.f72142c.d(this);
        this.f72145f.E9(this);
        AbstractC7593bf abstractC7593bf = C8659lf.f76497r9;
        if (!TextUtils.isEmpty((CharSequence) Mc.A.c().a(abstractC7593bf))) {
            this.f72146g.b(PreferenceManager.getDefaultSharedPreferences(this.f72149j), Arrays.asList(((String) Mc.A.c().a(abstractC7593bf)).split(",")));
        }
        AbstractC7593bf abstractC7593bf2 = C8659lf.f76511s9;
        if (!TextUtils.isEmpty((CharSequence) Mc.A.c().a(abstractC7593bf2))) {
            this.f72147h.b(this.f72149j.getSharedPreferences("admob", 0), Arrays.asList(((String) Mc.A.c().a(abstractC7593bf2)).split(",")));
        }
        a(Lc.v.s().j().zzk());
        this.f72163x = Lc.v.s().j().zzl();
    }

    private final synchronized void x(VO vo2, boolean z10) {
        try {
            if (this.f72157r != vo2) {
                if (r()) {
                    z();
                }
                this.f72157r = vo2;
                if (r()) {
                    A();
                }
                if (z10) {
                    w();
                }
            }
        } finally {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002d A[Catch: all -> 0x0027, TryCatch #0 {all -> 0x0027, blocks: (B:3:0x0001, B:6:0x0006, B:8:0x000a, B:10:0x001c, B:15:0x0029, B:20:0x0038, B:16:0x002d, B:18:0x0033), top: B:27:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final synchronized void y(boolean r2, boolean r3) {
        /*
            r1 = this;
            monitor-enter(r1)
            boolean r0 = r1.f72158s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f72158s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76301d9     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.jf r0 = Mc.A.c()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            Pc.z r2 = Lc.v.w()     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.l()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L2d
            goto L29
        L27:
            r2 = move-exception
            goto L3f
        L29:
            r1.A()     // Catch: java.lang.Throwable -> L27
            goto L36
        L2d:
            boolean r2 = r1.r()     // Catch: java.lang.Throwable -> L27
            if (r2 != 0) goto L36
            r1.z()     // Catch: java.lang.Throwable -> L27
        L36:
            if (r3 == 0) goto L3d
            r1.w()     // Catch: java.lang.Throwable -> L27
            monitor-exit(r1)
            return
        L3d:
            monitor-exit(r1)
            return
        L3f:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L27
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZO.y(boolean, boolean):void");
    }

    private final synchronized void z() {
        int iOrdinal = this.f72157r.ordinal();
        if (iOrdinal == 1) {
            this.f72141b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f72142c.b();
        }
    }

    public final VO b() {
        return this.f72157r;
    }

    public final synchronized com.google.common.util.concurrent.q c(String str) {
        C7145Rq c7145Rq;
        try {
            c7145Rq = new C7145Rq();
            if (this.f72152m.containsKey(str)) {
                c7145Rq.b((NO) this.f72152m.get(str));
            } else {
                if (!this.f72153n.containsKey(str)) {
                    this.f72153n.put(str, new ArrayList());
                }
                ((List) this.f72153n.get(str)).add(c7145Rq);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c7145Rq;
    }

    public final synchronized String d() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue() && r()) {
            if (this.f72156q < Lc.v.c().a() / 1000) {
                this.f72154o = "{}";
                this.f72156q = Long.MAX_VALUE;
                return "";
            }
            if (!this.f72154o.equals("{}")) {
                return this.f72154o;
            }
        }
        return "";
    }

    public final synchronized String e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f72158s);
            jSONObject.put("gesture", this.f72157r);
            if (this.f72156q > Lc.v.c().a() / 1000) {
                jSONObject.put("networkExtras", this.f72154o);
                jSONObject.put("networkExtrasExpirationSecs", this.f72156q);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized JSONObject f() {
        JSONObject jSONObject;
        JSONObject jSONObject2;
        try {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", "ANDROID");
                if (!TextUtils.isEmpty(this.f72150k)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.f72150k);
                }
                jSONObject.put("internalSdkVersion", this.f72148i);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f72143d.a());
                if (((Boolean) Mc.A.c().a(C8659lf.f76455o9)).booleanValue()) {
                    String strO = Lc.v.s().o();
                    if (!TextUtils.isEmpty(strO)) {
                        jSONObject.put("plugin", strO);
                    }
                }
                if (this.f72156q < Lc.v.c().a() / 1000) {
                    this.f72154o = "{}";
                }
                jSONObject.put("networkExtras", this.f72154o);
                jSONObject.put("adSlots", u());
                jSONObject.put("appInfo", this.f72144e.a());
                String strC = Lc.v.s().j().zzg().c();
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject.put("cld", new JSONObject(strC));
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76315e9)).booleanValue() && (jSONObject2 = this.f72155p) != null) {
                    Qc.p.b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.f72155p);
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
                    jSONObject.put("openAction", this.f72161v);
                    jSONObject.put("gesture", this.f72157r);
                }
                jSONObject.put("isGamRegisteredTestDevice", Lc.v.w().l());
                Lc.v.t();
                C4169y.b();
                jSONObject.put("isSimulator", Qc.g.t());
                if (((Boolean) Mc.A.c().a(C8659lf.f76483q9)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.f72163x));
                }
                if (!TextUtils.isEmpty((CharSequence) Mc.A.c().a(C8659lf.f76511s9))) {
                    jSONObject.put("gmaDisk", this.f72147h.a());
                }
                if (!TextUtils.isEmpty((CharSequence) Mc.A.c().a(C8659lf.f76497r9))) {
                    jSONObject.put("userDisk", this.f72146g.a());
                }
            } catch (JSONException e10) {
                Lc.v.s().w(e10, "Inspector.toJson");
                Qc.p.h("Ad inspector encountered an error", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public final synchronized void g(String str, NO no2) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue() && r()) {
            if (this.f72159t >= ((Integer) Mc.A.c().a(C8659lf.f76119Q8)).intValue()) {
                Qc.p.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f72151l.containsKey(str)) {
                this.f72151l.put(str, new ArrayList());
            }
            this.f72159t++;
            ((List) this.f72151l.get(str)).add(no2);
            if (((Boolean) Mc.A.c().a(C8659lf.f76427m9)).booleanValue()) {
                String strA = no2.a();
                this.f72152m.put(strA, no2);
                if (this.f72153n.containsKey(strA)) {
                    List list = (List) this.f72153n.get(strA);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C7145Rq) it.next()).b(no2);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void i(Mc.H0 h02, YO yo2) {
        if (!r()) {
            try {
                h02.P7(V60.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                Qc.p.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue()) {
            this.f72161v = yo2;
            this.f72140a.e(h02, new C8560kj(this), new C7814dj(this.f72145f), new C7103Qi(this));
            return;
        } else {
            try {
                h02.P7(V60.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                Qc.p.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void j(String str, long j10) {
        this.f72154o = str;
        this.f72156q = j10;
        w();
    }

    public final synchronized void k(String str) {
        this.f72163x = str;
        Lc.v.s().j().B(this.f72163x);
    }

    public final synchronized void l(long j10) {
        this.f72162w += j10;
    }

    public final void n(VO vo2) {
        x(vo2, true);
    }

    public final synchronized void o(JSONObject jSONObject) {
        this.f72155p = jSONObject;
    }

    public final boolean q() {
        return this.f72155p != null;
    }

    public final synchronized boolean r() {
        if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue()) {
            return this.f72158s || Lc.v.w().l();
        }
        return this.f72158s;
    }

    public final synchronized boolean s() {
        return this.f72158s;
    }

    public final void h() throws JSONException {
        if (((Boolean) Mc.A.c().a(C8659lf.f76091O8)).booleanValue()) {
            if (((Boolean) Mc.A.c().a(C8659lf.f76301d9)).booleanValue() && Lc.v.s().j().m()) {
                v();
                return;
            }
            String strZzk = Lc.v.s().j().zzk();
            if (TextUtils.isEmpty(strZzk)) {
                return;
            }
            try {
                if (new JSONObject(strZzk).optBoolean("isTestMode", false)) {
                    v();
                }
            } catch (JSONException unused) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0011  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m(boolean r2) throws org.json.JSONException {
        /*
            r1 = this;
            boolean r0 = r1.f72160u
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.v()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f72158s
            if (r2 == 0) goto L11
            goto L15
        L11:
            r1.A()
            return
        L15:
            boolean r2 = r1.r()
            if (r2 != 0) goto L1e
            r1.z()
        L1e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ZO.m(boolean):void");
    }

    public final void p(boolean z10) throws JSONException {
        if (!this.f72160u && z10) {
            v();
        }
        y(z10, true);
    }

    public final boolean t() {
        return this.f72162w < ((Long) Mc.A.c().a(C8659lf.f76385j9)).longValue();
    }

    ZO(C8638lP c8638lP, CP cp2, LO lo2, Context context, Qc.a aVar, UO uo2, BinderC9921xP binderC9921xP, SharedPreferencesOnSharedPreferenceChangeListenerC8212hP sharedPreferencesOnSharedPreferenceChangeListenerC8212hP, SharedPreferencesOnSharedPreferenceChangeListenerC8212hP sharedPreferencesOnSharedPreferenceChangeListenerC8212hP2, String str) {
        this.f72140a = c8638lP;
        this.f72141b = cp2;
        this.f72142c = lo2;
        this.f72144e = new JO(context);
        this.f72148i = aVar.f29929a;
        this.f72150k = str;
        this.f72143d = uo2;
        this.f72145f = binderC9921xP;
        this.f72146g = sharedPreferencesOnSharedPreferenceChangeListenerC8212hP;
        this.f72147h = sharedPreferencesOnSharedPreferenceChangeListenerC8212hP2;
        this.f72149j = context;
        Lc.v.w().g(this);
    }

    private final void w() {
        Lc.v.s().j().E(e());
    }
}
