package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.gms.internal.ads.yL, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10149yL extends C6702Az {

    /* renamed from: j, reason: collision with root package name */
    private final Context f81038j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f81039k;

    /* renamed from: l, reason: collision with root package name */
    private final InterfaceC9502sH f81040l;

    /* renamed from: m, reason: collision with root package name */
    private final KF f81041m;

    /* renamed from: n, reason: collision with root package name */
    private final C8958nC f81042n;

    /* renamed from: o, reason: collision with root package name */
    private final VC f81043o;

    /* renamed from: p, reason: collision with root package name */
    private final C7446Wz f81044p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC7534Zo f81045q;

    /* renamed from: r, reason: collision with root package name */
    private final C8993nc0 f81046r;

    /* renamed from: s, reason: collision with root package name */
    private final C8947n60 f81047s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f81048t;

    public final InterfaceC7534Zo j() {
        return this.f81045q;
    }

    public final C8947n60 k() {
        return this.f81047s;
    }

    public final boolean m() {
        return this.f81048t;
    }

    public final void finalize() throws Throwable {
        try {
            final InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) this.f81039k.get();
            if (((Boolean) Oc.A.c().a(C8784lf.f76733A6)).booleanValue()) {
                if (!this.f81048t && interfaceC9133ot != null) {
                    C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.wL
                        @Override // java.lang.Runnable
                        public final void run() {
                            interfaceC9133ot.destroy();
                        }
                    });
                }
            } else if (interfaceC9133ot != null) {
                interfaceC9133ot.destroy();
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public final Bundle i() {
        return this.f81043o.R0();
    }

    public final boolean l() {
        return this.f81044p.a();
    }

    public final boolean n() {
        InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) this.f81039k.get();
        return (interfaceC9133ot == null || interfaceC9133ot.l0()) ? false : true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    public final boolean o(boolean z10, Activity activity) {
        if (((Boolean) Oc.A.c().a(C8784lf.f76895M0)).booleanValue()) {
            Nc.v.t();
            if (Rc.D0.h(this.f81038j)) {
                Sc.p.g("Rewarded ads that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit https://googlemobileadssdk.page.link/admob-interstitial-policies");
                this.f81042n.zzb();
                if (((Boolean) Oc.A.c().a(C8784lf.f76909N0)).booleanValue()) {
                    this.f81046r.a(this.f66217a.f76589b.f76177b.f73943b);
                }
                return false;
            }
        }
        if (this.f81048t) {
            Sc.p.g("The rewarded ad have been showed.");
            this.f81042n.i(V60.d(10, null, null));
            return false;
        }
        this.f81048t = true;
        this.f81041m.zzb();
        Activity activity2 = activity;
        if (activity == null) {
            activity2 = this.f81038j;
        }
        try {
            this.f81040l.a(z10, activity2, this.f81042n);
            this.f81041m.zza();
            return true;
        } catch (zzdgb e10) {
            this.f81042n.k0(e10);
            return false;
        }
    }

    C10149yL(C10321zz c10321zz, Context context, InterfaceC9133ot interfaceC9133ot, InterfaceC9502sH interfaceC9502sH, KF kf2, C8958nC c8958nC, VC vc2, C7446Wz c7446Wz, Z50 z50, C8993nc0 c8993nc0, C8947n60 c8947n60) {
        String str;
        int i10;
        super(c10321zz);
        this.f81048t = false;
        this.f81038j = context;
        this.f81040l = interfaceC9502sH;
        this.f81039k = new WeakReference(interfaceC9133ot);
        this.f81041m = kf2;
        this.f81042n = c8958nC;
        this.f81043o = vc2;
        this.f81044p = c7446Wz;
        this.f81046r = c8993nc0;
        C7402Vo c7402Vo = z50.f72883l;
        if (c7402Vo != null) {
            str = c7402Vo.f71768a;
        } else {
            str = "";
        }
        if (c7402Vo != null) {
            i10 = c7402Vo.f71769b;
        } else {
            i10 = 1;
        }
        this.f81045q = new BinderC9659tp(str, i10);
        this.f81047s = c8947n60;
    }
}
