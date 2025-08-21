package com.google.android.gms.measurement.internal;

import Kc.a;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Pair;
import android.util.SparseArray;
import io.constructor.data.local.PreferencesHelper;

/* loaded from: classes6.dex */
final class E2 extends B3 {

    /* renamed from: A, reason: collision with root package name */
    static final Pair f85810A = new Pair("", 0L);

    /* renamed from: c, reason: collision with root package name */
    private SharedPreferences f85811c;

    /* renamed from: d, reason: collision with root package name */
    private SharedPreferences f85812d;

    /* renamed from: e, reason: collision with root package name */
    public C2 f85813e;

    /* renamed from: f, reason: collision with root package name */
    public final B2 f85814f;

    /* renamed from: g, reason: collision with root package name */
    public final B2 f85815g;

    /* renamed from: h, reason: collision with root package name */
    public final D2 f85816h;

    /* renamed from: i, reason: collision with root package name */
    private String f85817i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f85818j;

    /* renamed from: k, reason: collision with root package name */
    private long f85819k;

    /* renamed from: l, reason: collision with root package name */
    public final B2 f85820l;

    /* renamed from: m, reason: collision with root package name */
    public final C11405z2 f85821m;

    /* renamed from: n, reason: collision with root package name */
    public final D2 f85822n;

    /* renamed from: o, reason: collision with root package name */
    public final A2 f85823o;

    /* renamed from: p, reason: collision with root package name */
    public final C11405z2 f85824p;

    /* renamed from: q, reason: collision with root package name */
    public final B2 f85825q;

    /* renamed from: r, reason: collision with root package name */
    public final B2 f85826r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f85827s;

    /* renamed from: t, reason: collision with root package name */
    public final C11405z2 f85828t;

    /* renamed from: u, reason: collision with root package name */
    public final C11405z2 f85829u;

    /* renamed from: v, reason: collision with root package name */
    public final B2 f85830v;

    /* renamed from: w, reason: collision with root package name */
    public final D2 f85831w;

    /* renamed from: x, reason: collision with root package name */
    public final D2 f85832x;

    /* renamed from: y, reason: collision with root package name */
    public final B2 f85833y;

    /* renamed from: z, reason: collision with root package name */
    public final A2 f85834z;

    @Override // com.google.android.gms.measurement.internal.B3
    protected final boolean g() {
        return true;
    }

    @Override // com.google.android.gms.measurement.internal.B3
    protected final void h() {
        X2 x22 = this.f85708a;
        SharedPreferences sharedPreferences = x22.zzaY().getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
        this.f85811c = sharedPreferences;
        boolean z10 = sharedPreferences.getBoolean("has_been_opened", false);
        this.f85827s = z10;
        if (!z10) {
            SharedPreferences.Editor editorEdit = this.f85811c.edit();
            editorEdit.putBoolean("has_been_opened", true);
            editorEdit.apply();
        }
        x22.u();
        this.f85813e = new C2(this, "health_monitor", Math.max(0L, ((Long) C11245d2.f86299d.b(null)).longValue()), null);
    }

    final SparseArray p() {
        Bundle bundleA = this.f85823o.a();
        int[] intArray = bundleA.getIntArray("uriSources");
        long[] longArray = bundleA.getLongArray("uriTimestamps");
        if (intArray == null || longArray == null) {
            return new SparseArray();
        }
        if (intArray.length != longArray.length) {
            this.f85708a.a().m().a("Trigger URI source and timestamp array lengths do not match");
            return new SparseArray();
        }
        SparseArray sparseArray = new SparseArray();
        for (int i10 = 0; i10 < intArray.length; i10++) {
            sparseArray.put(intArray[i10], Long.valueOf(longArray[i10]));
        }
        return sparseArray;
    }

    final boolean x() {
        SharedPreferences sharedPreferences = this.f85811c;
        if (sharedPreferences == null) {
            return false;
        }
        return sharedPreferences.contains("deferred_analytics_collection");
    }

    final boolean y(long j10) {
        return j10 - this.f85820l.a() > this.f85825q.a();
    }

    E2(X2 x22) {
        super(x22);
        this.f85820l = new B2(this, "session_timeout", 1800000L);
        this.f85821m = new C11405z2(this, "start_new_session", true);
        this.f85825q = new B2(this, "last_pause_time", 0L);
        this.f85826r = new B2(this, PreferencesHelper.SESSION_ID, 0L);
        this.f85822n = new D2(this, "non_personalized_ads", null);
        this.f85823o = new A2(this, "last_received_uri_timestamps_by_source", null);
        this.f85824p = new C11405z2(this, "allow_remote_dynamite", false);
        this.f85814f = new B2(this, "first_open_time", 0L);
        this.f85815g = new B2(this, "app_install_time", 0L);
        this.f85816h = new D2(this, "app_instance_id", null);
        this.f85828t = new C11405z2(this, "app_backgrounded", false);
        this.f85829u = new C11405z2(this, "deep_link_retrieval_complete", false);
        this.f85830v = new B2(this, "deep_link_retrieval_attempts", 0L);
        this.f85831w = new D2(this, "firebase_feature_rollouts", null);
        this.f85832x = new D2(this, "deferred_attribution_cache", null);
        this.f85833y = new B2(this, "deferred_attribution_cache_timestamp", 0L);
        this.f85834z = new A2(this, "default_event_parameters", null);
    }

    final Pair m(String str) {
        f();
        if (u().o(Qd.v.AD_STORAGE)) {
            X2 x22 = this.f85708a;
            long jC = x22.zzaZ().c();
            String str2 = this.f85817i;
            if (str2 != null && jC < this.f85819k) {
                return new Pair(str2, Boolean.valueOf(this.f85818j));
            }
            this.f85819k = jC + x22.u().B(str, C11245d2.f86293b);
            Kc.a.d(true);
            try {
                a.C0277a c0277aA = Kc.a.a(x22.zzaY());
                this.f85817i = "";
                String strA = c0277aA.a();
                if (strA != null) {
                    this.f85817i = strA;
                }
                this.f85818j = c0277aA.b();
            } catch (Exception e10) {
                this.f85708a.a().t().b("Unable to get advertising id", e10);
                this.f85817i = "";
            }
            Kc.a.d(false);
            return new Pair(this.f85817i, Boolean.valueOf(this.f85818j));
        }
        return new Pair("", Boolean.FALSE);
    }

    protected final SharedPreferences n() {
        f();
        j();
        com.google.android.gms.common.internal.r.l(this.f85811c);
        return this.f85811c;
    }

    protected final SharedPreferences o() {
        f();
        j();
        if (this.f85812d == null) {
            X2 x22 = this.f85708a;
            String strValueOf = String.valueOf(x22.zzaY().getPackageName());
            C11329o2 c11329o2U = x22.a().u();
            String strConcat = strValueOf.concat("_preferences");
            c11329o2U.b("Default prefs file", strConcat);
            this.f85812d = x22.zzaY().getSharedPreferences(strConcat, 0);
        }
        return this.f85812d;
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

    final C11395y s() {
        f();
        return C11395y.g(n().getString("dma_consent_settings", null));
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
        this.f85708a.a().u().b("App measurement setting deferred collection", Boolean.valueOf(z10));
        SharedPreferences.Editor editorEdit = n().edit();
        editorEdit.putBoolean("deferred_analytics_collection", z10);
        editorEdit.apply();
    }
}
