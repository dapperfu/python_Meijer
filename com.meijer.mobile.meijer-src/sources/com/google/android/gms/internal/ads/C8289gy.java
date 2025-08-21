package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.gy, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8289gy extends C6702Az {

    /* renamed from: j, reason: collision with root package name */
    private final InterfaceC9133ot f75394j;

    /* renamed from: k, reason: collision with root package name */
    private final int f75395k;

    /* renamed from: l, reason: collision with root package name */
    private final Context f75396l;

    /* renamed from: m, reason: collision with root package name */
    private final C7311Sx f75397m;

    /* renamed from: n, reason: collision with root package name */
    private final InterfaceC9502sH f75398n;

    /* renamed from: o, reason: collision with root package name */
    private final KF f75399o;

    /* renamed from: p, reason: collision with root package name */
    private final C8958nC f75400p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f75401q;

    /* renamed from: r, reason: collision with root package name */
    private final C6829Eq f75402r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f75403s;

    public final int i() {
        return this.f75395k;
    }

    public final void j(InterfaceC8671kc interfaceC8671kc) {
        InterfaceC9133ot interfaceC9133ot = this.f75394j;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.D0(interfaceC8671kc);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v13, types: [android.content.Context] */
    public final void k(Activity activity, InterfaceC10275zc interfaceC10275zc, boolean z10) throws RemoteException {
        InterfaceC9133ot interfaceC9133ot;
        Z50 z50E;
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f75396l;
        }
        if (this.f75401q) {
            this.f75399o.zzb();
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76895M0)).booleanValue()) {
            Nc.v.t();
            if (Rc.D0.h(activity2)) {
                Sc.p.g("Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f75400p.zzb();
                if (((Boolean) Oc.A.c().a(C8784lf.f76909N0)).booleanValue()) {
                    new C8993nc0(activity2.getApplicationContext(), Nc.v.x().b()).a(this.f66217a.f76589b.f76177b.f73943b);
                    return;
                }
                return;
            }
        }
        if (((Boolean) Oc.A.c().a(C8784lf.f76906Mb)).booleanValue() && (interfaceC9133ot = this.f75394j) != null && (z50E = interfaceC9133ot.e()) != null && z50E.f72896r0 && z50E.f72898s0 != this.f75402r.b()) {
            Sc.p.g("The app open consent form has been shown.");
            this.f75400p.i(V60.d(12, "The consent form has already been shown.", null));
            return;
        }
        if (this.f75403s) {
            Sc.p.g("App open interstitial ad is already visible.");
            this.f75400p.i(V60.d(10, null, null));
        }
        if (this.f75403s) {
            return;
        }
        try {
            this.f75398n.a(z10, activity2, this.f75400p);
            if (this.f75401q) {
                this.f75399o.zza();
            }
            this.f75403s = true;
        } catch (zzdgb e10) {
            this.f75400p.k0(e10);
        }
    }

    public final void l(long j10, int i10) {
        this.f75397m.a(j10, i10);
    }

    C8289gy(C10321zz c10321zz, Context context, InterfaceC9133ot interfaceC9133ot, int i10, C7311Sx c7311Sx, InterfaceC9502sH interfaceC9502sH, KF kf2, C8958nC c8958nC, C6829Eq c6829Eq) {
        super(c10321zz);
        this.f75403s = false;
        this.f75394j = interfaceC9133ot;
        this.f75396l = context;
        this.f75395k = i10;
        this.f75397m = c7311Sx;
        this.f75398n = interfaceC9502sH;
        this.f75399o = kf2;
        this.f75400p = c8958nC;
        this.f75401q = ((Boolean) Oc.A.c().a(C8784lf.f77319q5)).booleanValue();
        this.f75402r = c6829Eq;
    }

    @Override // com.google.android.gms.internal.ads.C6702Az
    public final void a() {
        super.a();
        InterfaceC9133ot interfaceC9133ot = this.f75394j;
        if (interfaceC9133ot != null) {
            interfaceC9133ot.destroy();
        }
    }
}
