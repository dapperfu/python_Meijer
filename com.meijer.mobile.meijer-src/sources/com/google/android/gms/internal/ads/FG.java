package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class FG extends C6702Az {

    /* renamed from: j, reason: collision with root package name */
    private final Context f67609j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f67610k;

    /* renamed from: l, reason: collision with root package name */
    private final KF f67611l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC9502sH f67612m;

    /* renamed from: n, reason: collision with root package name */
    private final C7446Wz f67613n;

    /* renamed from: o, reason: collision with root package name */
    private final C8993nc0 f67614o;

    /* renamed from: p, reason: collision with root package name */
    private final C8958nC f67615p;

    /* renamed from: q, reason: collision with root package name */
    private final C6829Eq f67616q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f67617r;

    public final void finalize() throws Throwable {
        try {
            final InterfaceC9133ot interfaceC9133ot = (InterfaceC9133ot) this.f67610k.get();
            if (((Boolean) Oc.A.c().a(C8784lf.f76733A6)).booleanValue()) {
                if (!this.f67617r && interfaceC9133ot != null) {
                    C7033Kq.f69019f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.EG
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

    public final boolean i() {
        return this.f67613n.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    /* JADX WARN: Type inference failed for: r6v3, types: [android.content.Context] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean j(boolean r5, android.app.Activity r6) {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.KF r0 = r4.f67611l
            r0.zzb()
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8784lf.f76895M0
            com.google.android.gms.internal.ads.jf r1 = Oc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            Nc.v.t()
            android.content.Context r0 = r4.f67609j
            boolean r0 = Rc.D0.h(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            Sc.p.g(r5)
            com.google.android.gms.internal.ads.nC r5 = r4.f67615p
            r5.zzb()
            com.google.android.gms.internal.ads.bf r5 = com.google.android.gms.internal.ads.C8784lf.f76909N0
            com.google.android.gms.internal.ads.jf r6 = Oc.A.c()
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.google.android.gms.internal.ads.nc0 r5 = r4.f67614o
            com.google.android.gms.internal.ads.l60 r6 = r4.f66217a
            com.google.android.gms.internal.ads.j60 r6 = r6.f76589b
            com.google.android.gms.internal.ads.c60 r6 = r6.f76177b
            java.lang.String r6 = r6.f73943b
            r5.a(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.f67610k
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.ot r0 = (com.google.android.gms.internal.ads.InterfaceC9133ot) r0
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8784lf.f76906Mb
            com.google.android.gms.internal.ads.jf r3 = Oc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.google.android.gms.internal.ads.Z50 r0 = r0.e()
            if (r0 == 0) goto L92
            boolean r2 = r0.f72896r0
            if (r2 == 0) goto L92
            int r0 = r0.f72898s0
            com.google.android.gms.internal.ads.Eq r2 = r4.f67616q
            int r2 = r2.b()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            Sc.p.g(r5)
            com.google.android.gms.internal.ads.nC r5 = r4.f67615p
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            Oc.W0 r6 = com.google.android.gms.internal.ads.V60.d(r6, r0, r3)
            r5.i(r6)
            goto Lc4
        L92:
            boolean r0 = r4.f67617r
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            Sc.p.g(r0)
            com.google.android.gms.internal.ads.nC r0 = r4.f67615p
            r2 = 10
            Oc.W0 r2 = com.google.android.gms.internal.ads.V60.d(r2, r3, r3)
            r0.i(r2)
        La6:
            boolean r0 = r4.f67617r
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.f67609j
        Lae:
            com.google.android.gms.internal.ads.sH r0 = r4.f67612m     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            com.google.android.gms.internal.ads.nC r2 = r4.f67615p     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r0.a(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            com.google.android.gms.internal.ads.KF r5 = r4.f67611l     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r5.zza()     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r5 = 1
            r4.f67617r = r5
            return r5
        Lbe:
            r5 = move-exception
            com.google.android.gms.internal.ads.nC r6 = r4.f67615p
            r6.k0(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FG.j(boolean, android.app.Activity):boolean");
    }

    FG(C10321zz c10321zz, Context context, InterfaceC9133ot interfaceC9133ot, KF kf2, InterfaceC9502sH interfaceC9502sH, C7446Wz c7446Wz, C8993nc0 c8993nc0, C8958nC c8958nC, C6829Eq c6829Eq) {
        super(c10321zz);
        this.f67617r = false;
        this.f67609j = context;
        this.f67610k = new WeakReference(interfaceC9133ot);
        this.f67611l = kf2;
        this.f67612m = interfaceC9502sH;
        this.f67613n = c7446Wz;
        this.f67614o = c8993nc0;
        this.f67615p = c8958nC;
        this.f67616q = c6829Eq;
    }
}
