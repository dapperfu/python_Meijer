package com.google.android.gms.measurement.internal;

import Ic.a;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import io.constructor.data.local.PreferencesHelper;

/* loaded from: classes6.dex */
final class E2 extends B3 {

    /* renamed from: A, reason: collision with root package name */
    static final Pair f84970A = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f84971c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f84972d;

    /* renamed from: e, reason: collision with root package name */
    public C2 f84973e;

    /* renamed from: f, reason: collision with root package name */
    public final B2 f84974f;

    /* renamed from: g, reason: collision with root package name */
    public final B2 f84975g;

    /* renamed from: h, reason: collision with root package name */
    public final D2 f84976h;

    /* renamed from: i, reason: collision with root package name */
    private String f84977i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f84978j;

    /* renamed from: k, reason: collision with root package name */
    private long f84979k;

    /* renamed from: l, reason: collision with root package name */
    public final B2 f84980l;

    /* renamed from: m, reason: collision with root package name */
    public final C11280z2 f84981m;

    /* renamed from: n, reason: collision with root package name */
    public final D2 f84982n;

    /* renamed from: o, reason: collision with root package name */
    public final A2 f84983o;

    /* renamed from: p, reason: collision with root package name */
    public final C11280z2 f84984p;

    /* renamed from: q, reason: collision with root package name */
    public final B2 f84985q;

    /* renamed from: r, reason: collision with root package name */
    public final B2 f84986r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f84987s;

    /* renamed from: t, reason: collision with root package name */
    public final C11280z2 f84988t;

    /* renamed from: u, reason: collision with root package name */
    public final C11280z2 f84989u;

    /* renamed from: v, reason: collision with root package name */
    public final B2 f84990v;

    /* renamed from: w, reason: collision with root package name */
    public final D2 f84991w;

    /* renamed from: x, reason: collision with root package name */
    public final D2 f84992x;

    /* renamed from: y, reason: collision with root package name */
    public final B2 f84993y;

    /* renamed from: z, reason: collision with root package name */
    public final A2 f84994z;

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final void h() {
        X2 x22 = this.f84868a;
        SharedPreferences sharedPreferences = x22.zzaY().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f84971c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f84987s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f84971c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        x22.u();
        this.f84973e = new C2(this, "health_monitor", Math.max(0L, ((Long) C11120d2.f85459d.b(null)).longValue()), null);
    }

    final SparseArray p() {
        Bundle bundleA = this.f84983o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f84868a.a().m().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final boolean x() {
        SharedPreferences sharedPreferences = this.f84971c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean y(long j10) {
        return j10 - this.f84980l.a() > this.f84985q.a();
    }

    E2(X2 x22) {
        super(x22);
        this.f84980l = new B2(this, "session_timeout", 1800000L);
        this.f84981m = new C11280z2(this, "start_new_session", true);
        this.f84985q = new B2(this, "last_pause_time", 0L);
        this.f84986r = new B2(this, PreferencesHelper.SESSION_ID, 0L);
        this.f84982n = new D2(this, "non_personalized_ads", null);
        this.f84983o = new A2(this, "last_received_uri_timestamps_by_source", null);
        this.f84984p = new C11280z2(this, "allow_remote_dynamite", false);
        this.f84974f = new B2(this, "first_open_time", 0L);
        this.f84975g = new B2(this, "app_install_time", 0L);
        this.f84976h = new D2(this, "app_instance_id", null);
        this.f84988t = new C11280z2(this, "app_backgrounded", false);
        this.f84989u = new C11280z2(this, "deep_link_retrieval_complete", false);
        this.f84990v = new B2(this, "deep_link_retrieval_attempts", 0L);
        this.f84991w = new D2(this, "firebase_feature_rollouts", null);
        this.f84992x = new D2(this, "deferred_attribution_cache", null);
        this.f84993y = new B2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f84994z = new A2(this, "default_event_parameters", null);
    }

    final Pair m(String str) {
        f();
        if (u().o(Od.v.AD_STORAGE)) {
            X2 x22 = this.f84868a;
            long jC = x22.zzaZ().c();
            String str2 = this.f84977i;
            if (str2 != null && jC < this.f84979k) {
                return new Pair(str2, Boolean.valueOf(this.f84978j));
            }
            this.f84979k = jC + x22.u().B(str, C11120d2.f85453b);
            Ic.a.d(true);
            try {
                a.C0217a c0217aA = Ic.a.a(x22.zzaY());
                this.f84977i = "";
                String strA = c0217aA.a();
                if (strA != null) {
                    this.f84977i = strA;
                }
                this.f84978j = c0217aA.b();
            } catch (Exception e10) {
                this.f84868a.a().t().b("Unable to get advertising id", e10);
                this.f84977i = "";
            }
            Ic.a.d(false);
            return new Pair(this.f84977i, Boolean.valueOf(this.f84978j));
        }
        return new Pair("", Boolean.FALSE);
    }

    protected final SharedPreferences n() {
        f();
        j();
        com.google.android.gms.common.internal.r.l(this.f84971c);
        return this.f84971c;
    }

    protected final SharedPreferences o() {
        f();
        j();
        if (this.f84972d == null) {
            X2 x22 = this.f84868a;
            String strValueOf = String.valueOf(x22.zzaY().getPackageName());
            C11204o2 c11204o2U = x22.a().u();
            String strConcat = strValueOf.concat("_preferences");
            c11204o2U.b("Default prefs file", strConcat);
            this.f84972d = x22.zzaY().getSharedPreferences(strConcat, 0);
        }
        return this.f84972d;
    }

    final void q(Boolean bool) {
        f();
        SharedPreferences.Editor editorEdit = n().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
    }

    final Boolean r() {
        f();
        if (n().contains("measurement_enabled")) {
            return Boolean.valueOf(n().getBoolean("measurement_enabled", true));
        }
        return null;
    }

    final C11270y s() {
        f();
        return C11270y.g(n().getString("dma_consent_settings", null));
    }

    final boolean t(int i10) {
        return E3.u(i10, n().getInt("consent_source", 100));
    }

    final E3 u() {
        f();
        return E3.f(n().getString("consent_settings", "G1"), n().getInt("consent_source", 100));
    }

    protected final boolean v(O5 o52) {
        f();
        String string = n().getString("stored_tcf_param", "");
        String strA = o52.a();
        if (!strA.equals(string)) {
            SharedPreferences.Editor editorEdit = n().edit();
            editorEdit.putString("stored_tcf_param", strA);
            editorEdit.apply();
            return true;
        }
        return false;
    }

    final void w(boolean z10) {
        f();
        this.f84868a.a().u().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = n().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }
}
