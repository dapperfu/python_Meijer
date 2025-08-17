package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8164gy extends C6577Az {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9008ot f74554j;

    /* renamed from: k, reason: collision with root package name */
    private final int f74555k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f74556l;

    /* renamed from: m, reason: collision with root package name */
    private final C7186Sx f74557m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC9377sH f74558n;

    /* renamed from: o, reason: collision with root package name */
    private final KF f74559o;

    /* renamed from: p, reason: collision with root package name */
    private final C8833nC f74560p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f74561q;

    /* renamed from: r, reason: collision with root package name */
    private final C6704Eq f74562r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f74563s;

    public final int i() {
        return this.f74555k;
    }

    public final void j(InterfaceC8546kc interfaceC8546kc) {
        InterfaceC9008ot interfaceC9008ot = this.f74554j;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.E0(interfaceC8546kc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    public final void k(Activity activity, InterfaceC10150zc interfaceC10150zc, boolean z10) throws RemoteException {
        InterfaceC9008ot interfaceC9008ot;
        Z50 z50E;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f74556l;
        }
        if (this.f74561q) {
            this.f74559o.zzb();
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76055M0)).booleanValue()) {
            Lc.v.t();
            if (Pc.D0.h(activity2)) {
                Qc.p.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f74560p.zzb();
                if (((Boolean) Mc.A.c().a(C8659lf.f76069N0)).booleanValue()) {
                    new C8868nc0(activity2.getApplicationContext(), Lc.v.x().b()).a(this.f65377a.f75749b.f75337b.f73103b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) Mc.A.c().a(C8659lf.f76066Mb)).booleanValue() && (interfaceC9008ot = this.f74554j) != null && (z50E = interfaceC9008ot.e()) != null && z50E.f72056r0 && z50E.f72058s0 != this.f74562r.b()) {
            Qc.p.g("The app open consent form has been shown.");
            this.f74560p.i(V60.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f74563s) {
            Qc.p.g("App open interstitial ad is already visible.");
            this.f74560p.i(V60.d(10, null, null));
        }
        if (this.f74563s) {
            return;
        }
        try {
            this.f74558n.a(z10, activity2, this.f74560p);
            if (this.f74561q) {
                this.f74559o.zza();
            }
            this.f74563s = true;
        } catch (zzdgb e10) {
            this.f74560p.k0(e10);
        }
    }

    public final void l(long j10, int i10) {
        this.f74557m.a(j10, i10);
    }

    C8164gy(C10196zz c10196zz, Context context, InterfaceC9008ot interfaceC9008ot, int i10, C7186Sx c7186Sx, InterfaceC9377sH interfaceC9377sH, KF kf2, C8833nC c8833nC, C6704Eq c6704Eq) {
        super(c10196zz);
        this.f74563s = false;
        this.f74554j = interfaceC9008ot;
        this.f74556l = context;
        this.f74555k = i10;
        this.f74557m = c7186Sx;
        this.f74558n = interfaceC9377sH;
        this.f74559o = kf2;
        this.f74560p = c8833nC;
        this.f74561q = ((Boolean) Mc.A.c().a(C8659lf.f76479q5)).booleanValue();
        this.f74562r = c6704Eq;
    }

    @Override // com.google.android.gms.internal.ads.C6577Az
    public final void a() {
        super.a();
        InterfaceC9008ot interfaceC9008ot = this.f74554j;
        if (interfaceC9008ot != null) {
            interfaceC9008ot.destroy();
        }
    }
}
