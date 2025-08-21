package com.google.android.gms.internal.ads;

import Oc.C4447y;
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
    private final C8763lP f72980a;

    /* renamed from: b, reason: collision with root package name */
    private final CP f72981b;

    /* renamed from: c, reason: collision with root package name */
    private final LO f72982c;

    /* renamed from: d, reason: collision with root package name */
    private final UO f72983d;

    /* renamed from: e, reason: collision with root package name */
    private final JO f72984e;

    /* renamed from: f, reason: collision with root package name */
    private final BinderC10046xP f72985f;

    /* renamed from: g, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC8337hP f72986g;

    /* renamed from: h, reason: collision with root package name */
    private final SharedPreferencesOnSharedPreferenceChangeListenerC8337hP f72987h;

    /* renamed from: i, reason: collision with root package name */
    private final String f72988i;

    /* renamed from: j, reason: collision with root package name */
    private final Context f72989j;

    /* renamed from: k, reason: collision with root package name */
    private final String f72990k;

    /* renamed from: p, reason: collision with root package name */
    private JSONObject f72995p;

    /* renamed from: s, reason: collision with root package name */
    private boolean f72998s;

    /* renamed from: t, reason: collision with root package name */
    private int f72999t;

    /* renamed from: u, reason: collision with root package name */
    private boolean f73000u;

    /* renamed from: l, reason: collision with root package name */
    private final Map f72991l = new HashMap();

    /* renamed from: m, reason: collision with root package name */
    private final Map f72992m = new HashMap();

    /* renamed from: n, reason: collision with root package name */
    private final Map f72993n = new HashMap();

    /* renamed from: o, reason: collision with root package name */
    private String f72994o = "{}";

    /* renamed from: q, reason: collision with root package name */
    private long f72996q = Long.MAX_VALUE;

    /* renamed from: r, reason: collision with root package name */
    private VO f72997r = VO.NONE;

    /* renamed from: v, reason: collision with root package name */
    private YO f73001v = YO.UNKNOWN;

    /* renamed from: w, reason: collision with root package name */
    private long f73002w = 0;

    /* renamed from: x, reason: collision with root package name */
    private String f73003x = "";

    private final synchronized void A() {
        int iOrdinal = this.f72997r.ordinal();
        if (iOrdinal == 1) {
            this.f72981b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f72982c.c();
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
            this.f72994o = jSONObject.optString("networkExtras", "{}");
            this.f72996q = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    private final synchronized JSONObject u() throws JSONException {
        JSONObject jSONObject;
        try {
            jSONObject = new JSONObject();
            for (Map.Entry entry : this.f72991l.entrySet()) {
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
        this.f73000u = true;
        this.f72983d.c();
        this.f72980a.c(this);
        this.f72981b.d(this);
        this.f72982c.d(this);
        this.f72985f.E9(this);
        AbstractC7718bf abstractC7718bf = C8784lf.f77337r9;
        if (!TextUtils.isEmpty((CharSequence) Oc.A.c().a(abstractC7718bf))) {
            this.f72986g.b(PreferenceManager.getDefaultSharedPreferences(this.f72989j), Arrays.asList(((String) Oc.A.c().a(abstractC7718bf)).split(",")));
        }
        AbstractC7718bf abstractC7718bf2 = C8784lf.f77351s9;
        if (!TextUtils.isEmpty((CharSequence) Oc.A.c().a(abstractC7718bf2))) {
            this.f72987h.b(this.f72989j.getSharedPreferences("admob", 0), Arrays.asList(((String) Oc.A.c().a(abstractC7718bf2)).split(",")));
        }
        a(Nc.v.s().j().zzk());
        this.f73003x = Nc.v.s().j().zzl();
    }

    private final synchronized void x(VO vo2, boolean z10) {
        try {
            if (this.f72997r != vo2) {
                if (r()) {
                    z();
                }
                this.f72997r = vo2;
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
            boolean r0 = r1.f72998s     // Catch: java.lang.Throwable -> L27
            if (r0 != r2) goto L6
            goto L3d
        L6:
            r1.f72998s = r2     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L2d
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8784lf.f77141d9     // Catch: java.lang.Throwable -> L27
            com.google.android.gms.internal.ads.jf r0 = Oc.A.c()     // Catch: java.lang.Throwable -> L27
            java.lang.Object r2 = r0.a(r2)     // Catch: java.lang.Throwable -> L27
            java.lang.Boolean r2 = (java.lang.Boolean) r2     // Catch: java.lang.Throwable -> L27
            boolean r2 = r2.booleanValue()     // Catch: java.lang.Throwable -> L27
            if (r2 == 0) goto L29
            Rc.z r2 = Nc.v.w()     // Catch: java.lang.Throwable -> L27
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
        int iOrdinal = this.f72997r.ordinal();
        if (iOrdinal == 1) {
            this.f72981b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f72982c.b();
        }
    }

    public final VO b() {
        return this.f72997r;
    }

    public final synchronized com.google.common.util.concurrent.q c(String str) {
        C7270Rq c7270Rq;
        try {
            c7270Rq = new C7270Rq();
            if (this.f72992m.containsKey(str)) {
                c7270Rq.b((NO) this.f72992m.get(str));
            } else {
                if (!this.f72993n.containsKey(str)) {
                    this.f72993n.put(str, new ArrayList());
                }
                ((List) this.f72993n.get(str)).add(c7270Rq);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c7270Rq;
    }

    public final synchronized String d() {
        if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue() && r()) {
            if (this.f72996q < Nc.v.c().a() / 1000) {
                this.f72994o = "{}";
                this.f72996q = Long.MAX_VALUE;
                return "";
            }
            if (!this.f72994o.equals("{}")) {
                return this.f72994o;
            }
        }
        return "";
    }

    public final synchronized String e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f72998s);
            jSONObject.put("gesture", this.f72997r);
            if (this.f72996q > Nc.v.c().a() / 1000) {
                jSONObject.put("networkExtras", this.f72994o);
                jSONObject.put("networkExtrasExpirationSecs", this.f72996q);
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
                if (!TextUtils.isEmpty(this.f72990k)) {
                    jSONObject.put("sdkVersion", "afma-sdk-a-v" + this.f72990k);
                }
                jSONObject.put("internalSdkVersion", this.f72988i);
                jSONObject.put("osVersion", Build.VERSION.RELEASE);
                jSONObject.put("adapters", this.f72983d.a());
                if (((Boolean) Oc.A.c().a(C8784lf.f77295o9)).booleanValue()) {
                    String strO = Nc.v.s().o();
                    if (!TextUtils.isEmpty(strO)) {
                        jSONObject.put("plugin", strO);
                    }
                }
                if (this.f72996q < Nc.v.c().a() / 1000) {
                    this.f72994o = "{}";
                }
                jSONObject.put("networkExtras", this.f72994o);
                jSONObject.put("adSlots", u());
                jSONObject.put("appInfo", this.f72984e.a());
                String strC = Nc.v.s().j().zzg().c();
                if (!TextUtils.isEmpty(strC)) {
                    jSONObject.put("cld", new JSONObject(strC));
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f77155e9)).booleanValue() && (jSONObject2 = this.f72995p) != null) {
                    Sc.p.b("Server data: " + jSONObject2.toString());
                    jSONObject.put("serverData", this.f72995p);
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f77141d9)).booleanValue()) {
                    jSONObject.put("openAction", this.f73001v);
                    jSONObject.put("gesture", this.f72997r);
                }
                jSONObject.put("isGamRegisteredTestDevice", Nc.v.w().l());
                Nc.v.t();
                C4447y.b();
                jSONObject.put("isSimulator", Sc.g.t());
                if (((Boolean) Oc.A.c().a(C8784lf.f77323q9)).booleanValue()) {
                    jSONObject.put("uiStorage", new JSONObject(this.f73003x));
                }
                if (!TextUtils.isEmpty((CharSequence) Oc.A.c().a(C8784lf.f77351s9))) {
                    jSONObject.put("gmaDisk", this.f72987h.a());
                }
                if (!TextUtils.isEmpty((CharSequence) Oc.A.c().a(C8784lf.f77337r9))) {
                    jSONObject.put("userDisk", this.f72986g.a());
                }
            } catch (JSONException e10) {
                Nc.v.s().w(e10, "Inspector.toJson");
                Sc.p.h("Ad inspector encountered an error", e10);
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return jSONObject;
    }

    public final synchronized void g(String str, NO no2) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue() && r()) {
            if (this.f72999t >= ((Integer) Oc.A.c().a(C8784lf.f76959Q8)).intValue()) {
                Sc.p.g("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f72991l.containsKey(str)) {
                this.f72991l.put(str, new ArrayList());
            }
            this.f72999t++;
            ((List) this.f72991l.get(str)).add(no2);
            if (((Boolean) Oc.A.c().a(C8784lf.f77267m9)).booleanValue()) {
                String strA = no2.a();
                this.f72992m.put(strA, no2);
                if (this.f72993n.containsKey(strA)) {
                    List list = (List) this.f72993n.get(strA);
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((C7270Rq) it.next()).b(no2);
                    }
                    list.clear();
                }
            }
        }
    }

    public final synchronized void i(Oc.H0 h02, YO yo2) {
        if (!r()) {
            try {
                h02.x1(V60.d(18, null, null));
                return;
            } catch (RemoteException unused) {
                Sc.p.g("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue()) {
            this.f73001v = yo2;
            this.f72980a.e(h02, new C8685kj(this), new C7939dj(this.f72985f), new C7228Qi(this));
            return;
        } else {
            try {
                h02.x1(V60.d(1, null, null));
                return;
            } catch (RemoteException unused2) {
                Sc.p.g("Ad inspector had an internal error.");
                return;
            }
        }
    }

    public final synchronized void j(String str, long j10) {
        this.f72994o = str;
        this.f72996q = j10;
        w();
    }

    public final synchronized void k(String str) {
        this.f73003x = str;
        Nc.v.s().j().B(this.f73003x);
    }

    public final synchronized void l(long j10) {
        this.f73002w += j10;
    }

    public final void n(VO vo2) {
        x(vo2, true);
    }

    public final synchronized void o(JSONObject jSONObject) {
        this.f72995p = jSONObject;
    }

    public final boolean q() {
        return this.f72995p != null;
    }

    public final synchronized boolean r() {
        if (((Boolean) Oc.A.c().a(C8784lf.f77141d9)).booleanValue()) {
            return this.f72998s || Nc.v.w().l();
        }
        return this.f72998s;
    }

    public final synchronized boolean s() {
        return this.f72998s;
    }

    public final void h() throws JSONException {
        if (((Boolean) Oc.A.c().a(C8784lf.f76931O8)).booleanValue()) {
            if (((Boolean) Oc.A.c().a(C8784lf.f77141d9)).booleanValue() && Nc.v.s().j().m()) {
                v();
                return;
            }
            String strZzk = Nc.v.s().j().zzk();
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
            boolean r0 = r1.f73000u
            if (r0 != 0) goto La
            if (r2 == 0) goto L15
            r1.v()
            goto Lc
        La:
            if (r2 == 0) goto L15
        Lc:
            boolean r2 = r1.f72998s
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
        if (!this.f73000u && z10) {
            v();
        }
        y(z10, true);
    }

    public final boolean t() {
        return this.f73002w < ((Long) Oc.A.c().a(C8784lf.f77225j9)).longValue();
    }

    ZO(C8763lP c8763lP, CP cp2, LO lo2, Context context, Sc.a aVar, UO uo2, BinderC10046xP binderC10046xP, SharedPreferencesOnSharedPreferenceChangeListenerC8337hP sharedPreferencesOnSharedPreferenceChangeListenerC8337hP, SharedPreferencesOnSharedPreferenceChangeListenerC8337hP sharedPreferencesOnSharedPreferenceChangeListenerC8337hP2, String str) {
        this.f72980a = c8763lP;
        this.f72981b = cp2;
        this.f72982c = lo2;
        this.f72984e = new JO(context);
        this.f72988i = aVar.f34479a;
        this.f72990k = str;
        this.f72983d = uo2;
        this.f72985f = binderC10046xP;
        this.f72986g = sharedPreferencesOnSharedPreferenceChangeListenerC8337hP;
        this.f72987h = sharedPreferencesOnSharedPreferenceChangeListenerC8337hP2;
        this.f72989j = context;
        Nc.v.w().g(this);
    }

    private final void w() {
        Nc.v.s().j().E(e());
    }
}
