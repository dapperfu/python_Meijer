package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.yL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10024yL extends C6577Az {

    /* renamed from: j, reason: collision with root package name */
    private final Context f80198j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f80199k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC9377sH f80200l;

    /* renamed from: m, reason: collision with root package name */
    private final KF f80201m;

    /* renamed from: n, reason: collision with root package name */
    private final C8833nC f80202n;

    /* renamed from: o, reason: collision with root package name */
    private final VC f80203o;

    /* renamed from: p, reason: collision with root package name */
    private final C7321Wz f80204p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7409Zo f80205q;

    /* renamed from: r, reason: collision with root package name */
    private final C8868nc0 f80206r;

    /* renamed from: s, reason: collision with root package name */
    private final C8822n60 f80207s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f80208t;

    public final InterfaceC7409Zo j() {
        return this.f80205q;
    }

    public final C8822n60 k() {
        return this.f80207s;
    }

    public final boolean m() {
        return this.f80208t;
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) this.f80199k.get();
            if (((Boolean) Mc.A.c().a(C8659lf.f75893A6)).booleanValue()) {
                if (!this.f80208t && interfaceC9008ot != null) {
                    C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wL
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC9008ot.destroy();
                        }
                    });
                }
            } else if (interfaceC9008ot != null) {
                interfaceC9008ot.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public final Bundle i() {
        return this.f80203o.R0();
    }

    public final boolean l() {
        return this.f80204p.a();
    }

    public final boolean n() {
        InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) this.f80199k.get();
        return (interfaceC9008ot == null || interfaceC9008ot.l0()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean o(boolean z10, Activity activity) {
        if (((Boolean) Mc.A.c().a(C8659lf.f76055M0)).booleanValue()) {
            Lc.v.t();
            if (Pc.D0.h(this.f80198j)) {
                Qc.p.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f80202n.zzb();
                if (((Boolean) Mc.A.c().a(C8659lf.f76069N0)).booleanValue()) {
                    this.f80206r.a(this.f65377a.f75749b.f75337b.f73103b);
                }
                return false;
            }
        }
        if (this.f80208t) {
            Qc.p.g("The rewarded ad have been showed.");
            this.f80202n.i(V60.d(10, null, null));
            return false;
        }
        this.f80208t = true;
        this.f80201m.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f80198j;
        }
        try {
            this.f80200l.a(z10, activity2, this.f80202n);
            this.f80201m.zza();
            return true;
        } catch (zzdgb e10) {
            this.f80202n.k0(e10);
            return false;
        }
    }

    C10024yL(C10196zz c10196zz, Context context, InterfaceC9008ot interfaceC9008ot, InterfaceC9377sH interfaceC9377sH, KF kf2, C8833nC c8833nC, VC vc2, C7321Wz c7321Wz, Z50 z50, C8868nc0 c8868nc0, C8822n60 c8822n60) {
        String str;
        int i10;
        super(c10196zz);
        this.f80208t = false;
        this.f80198j = context;
        this.f80200l = interfaceC9377sH;
        this.f80199k = new WeakReference(interfaceC9008ot);
        this.f80201m = kf2;
        this.f80202n = c8833nC;
        this.f80203o = vc2;
        this.f80204p = c7321Wz;
        this.f80206r = c8868nc0;
        C7277Vo c7277Vo = z50.f72043l;
        if (c7277Vo != null) {
            str = c7277Vo.f70928a;
        } else {
            str = "";
        }
        if (c7277Vo != null) {
            i10 = c7277Vo.f70929b;
        } else {
            i10 = 1;
        }
        this.f80205q = new BinderC9534tp(str, i10);
        this.f80207s = c8822n60;
    }
}
