package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.constructor.data.local.PreferencesHelper;

/* renamed from: com.google.android.gms.internal.ads.Bq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6602Bq {

    /* renamed from: g, reason: collision with root package name */
    final String f65595g;

    /* renamed from: h, reason: collision with root package name */
    private final Pc.r0 f65596h;

    /* renamed from: a, reason: collision with root package name */
    long f65589a = -1;

    /* renamed from: b, reason: collision with root package name */
    long f65590b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f65591c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f65592d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f65593e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f65594f = new Object();

    /* renamed from: i, reason: collision with root package name */
    int f65597i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f65598j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f65599k = 0;

    private final void i() {
        if (((Boolean) C9516tg.f78609a.e()).booleanValue()) {
            synchronized (this.f65594f) {
                this.f65591c--;
                this.f65592d--;
            }
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f65594f) {
            i10 = this.f65599k;
        }
        return i10;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f65594f) {
            try {
                bundle = new Bundle();
                if (!this.f65596h.zzN()) {
                    bundle.putString(PreferencesHelper.SESSION_ID, this.f65595g);
                }
                bundle.putLong("basets", this.f65590b);
                bundle.putLong("currts", this.f65589a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f65591c);
                bundle.putInt("preqs_in_session", this.f65592d);
                bundle.putLong("time_in_session", this.f65593e);
                bundle.putInt("pclick", this.f65597i);
                bundle.putInt("pimp", this.f65598j);
                Context contextA = C6770Go.a(context);
                int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z10 = false;
                if (identifier == 0) {
                    Qc.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z10 = true;
                        } else {
                            Qc.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Qc.p.g("Fail to fetch AdActivity theme");
                        Qc.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                    }
                }
                bundle.putBoolean("support_transparent_background", z10);
                bundle.putInt("consent_form_action_identifier", a());
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return bundle;
    }

    public final void c() {
        synchronized (this.f65594f) {
            this.f65597i++;
        }
    }

    public final void d() {
        synchronized (this.f65594f) {
            this.f65598j++;
        }
    }

    public final void g(Mc.Y1 y12, long j10) {
        Bundle bundle;
        synchronized (this.f65594f) {
            try {
                long jZzd = this.f65596h.zzd();
                long jA = Lc.v.c().a();
                if (this.f65590b == -1) {
                    if (jA - jZzd > ((Long) Mc.A.c().a(C8659lf.f76293d1)).longValue()) {
                        this.f65592d = -1;
                    } else {
                        this.f65592d = this.f65596h.zzc();
                    }
                    this.f65590b = j10;
                    this.f65589a = j10;
                } else {
                    this.f65589a = j10;
                }
                if (((Boolean) Mc.A.c().a(C8659lf.f76002I3)).booleanValue() || (bundle = y12.f19169c) == null || bundle.getInt("gw", 2) != 1) {
                    this.f65591c++;
                    int i10 = this.f65592d + 1;
                    this.f65592d = i10;
                    if (i10 == 0) {
                        this.f65593e = 0L;
                        this.f65596h.u(jA);
                    } else {
                        this.f65593e = jA - this.f65596h.zze();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f65594f) {
            this.f65599k++;
        }
    }

    public C6602Bq(String str, Pc.r0 r0Var) {
        this.f65595g = str;
        this.f65596h = r0Var;
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }
}
