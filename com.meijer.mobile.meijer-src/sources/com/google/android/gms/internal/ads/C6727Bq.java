package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.constructor.data.local.PreferencesHelper;

/* renamed from: com.google.android.gms.internal.ads.Bq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C6727Bq {

    /* renamed from: g, reason: collision with root package name */
    final String f66435g;

    /* renamed from: h, reason: collision with root package name */
    private final Rc.r0 f66436h;

    /* renamed from: a, reason: collision with root package name */
    long f66429a = -1;

    /* renamed from: b, reason: collision with root package name */
    long f66430b = -1;

    /* renamed from: c, reason: collision with root package name */
    int f66431c = -1;

    /* renamed from: d, reason: collision with root package name */
    int f66432d = -1;

    /* renamed from: e, reason: collision with root package name */
    long f66433e = 0;

    /* renamed from: f, reason: collision with root package name */
    private final Object f66434f = new Object();

    /* renamed from: i, reason: collision with root package name */
    int f66437i = 0;

    /* renamed from: j, reason: collision with root package name */
    int f66438j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f66439k = 0;

    private final void i() {
        if (((Boolean) C9641tg.f79449a.e()).booleanValue()) {
            synchronized (this.f66434f) {
                this.f66431c--;
                this.f66432d--;
            }
        }
    }

    public final int a() {
        int i10;
        synchronized (this.f66434f) {
            i10 = this.f66439k;
        }
        return i10;
    }

    public final Bundle b(Context context, String str) {
        Bundle bundle;
        synchronized (this.f66434f) {
            try {
                bundle = new Bundle();
                if (!this.f66436h.zzN()) {
                    bundle.putString(PreferencesHelper.SESSION_ID, this.f66435g);
                }
                bundle.putLong("basets", this.f66430b);
                bundle.putLong("currts", this.f66429a);
                bundle.putString("seq_num", str);
                bundle.putInt("preqs", this.f66431c);
                bundle.putInt("preqs_in_session", this.f66432d);
                bundle.putLong("time_in_session", this.f66433e);
                bundle.putInt("pclick", this.f66437i);
                bundle.putInt("pimp", this.f66438j);
                Context contextA = C6895Go.a(context);
                int identifier = contextA.getResources().getIdentifier("Theme.Translucent", "style", "android");
                boolean z10 = false;
                if (identifier == 0) {
                    Sc.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                } else {
                    try {
                        if (identifier == contextA.getPackageManager().getActivityInfo(new ComponentName(contextA.getPackageName(), "com.google.android.gms.ads.AdActivity"), 0).theme) {
                            z10 = true;
                        } else {
                            Sc.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        Sc.p.g("Fail to fetch AdActivity theme");
                        Sc.p.f("Please set theme of AdActivity to @android:style/Theme.Translucent to enable transparent background interstitial ad.");
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
        synchronized (this.f66434f) {
            this.f66437i++;
        }
    }

    public final void d() {
        synchronized (this.f66434f) {
            this.f66438j++;
        }
    }

    public final void g(Oc.Y1 y12, long j10) {
        Bundle bundle;
        synchronized (this.f66434f) {
            try {
                long jZzd = this.f66436h.zzd();
                long jA = Nc.v.c().a();
                if (this.f66430b == -1) {
                    if (jA - jZzd > ((Long) Oc.A.c().a(C8784lf.f77133d1)).longValue()) {
                        this.f66432d = -1;
                    } else {
                        this.f66432d = this.f66436h.zzc();
                    }
                    this.f66430b = j10;
                    this.f66429a = j10;
                } else {
                    this.f66429a = j10;
                }
                if (((Boolean) Oc.A.c().a(C8784lf.f76842I3)).booleanValue() || (bundle = y12.f23356c) == null || bundle.getInt("gw", 2) != 1) {
                    this.f66431c++;
                    int i10 = this.f66432d + 1;
                    this.f66432d = i10;
                    if (i10 == 0) {
                        this.f66433e = 0L;
                        this.f66436h.u(jA);
                    } else {
                        this.f66433e = jA - this.f66436h.zze();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void h() {
        synchronized (this.f66434f) {
            this.f66439k++;
        }
    }

    public C6727Bq(String str, Rc.r0 r0Var) {
        this.f66435g = str;
        this.f66436h = r0Var;
    }

    public final void e() {
        i();
    }

    public final void f() {
        i();
    }
}
