package com.google.android.gms.internal.ads;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public final class FG extends C6577Az {

    /* renamed from: j, reason: collision with root package name */
    private final Context f66769j;

    /* renamed from: k, reason: collision with root package name */
    private final WeakReference f66770k;

    /* renamed from: l, reason: collision with root package name */
    private final KF f66771l;

    /* renamed from: m, reason: collision with root package name */
    private final InterfaceC9377sH f66772m;

    /* renamed from: n, reason: collision with root package name */
    private final C7321Wz f66773n;

    /* renamed from: o, reason: collision with root package name */
    private final C8868nc0 f66774o;

    /* renamed from: p, reason: collision with root package name */
    private final C8833nC f66775p;

    /* renamed from: q, reason: collision with root package name */
    private final C6704Eq f66776q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f66777r;

    public final void finalize() throws Throwable {
        try {
            final InterfaceC9008ot interfaceC9008ot = (InterfaceC9008ot) this.f66770k.get();
            if (((Boolean) Mc.A.c().a(C8659lf.f75893A6)).booleanValue()) {
                if (!this.f66777r && interfaceC9008ot != null) {
                    C6908Kq.f68179f.execute(new Runnable() { // from class: com.google.android.gms.internal.ads.EG
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

    public final boolean i() {
        return this.f66773n.a();
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
            com.google.android.gms.internal.ads.KF r0 = r4.f66771l
            r0.zzb()
            com.google.android.gms.internal.ads.bf r0 = com.google.android.gms.internal.ads.C8659lf.f76055M0
            com.google.android.gms.internal.ads.jf r1 = Mc.A.c()
            java.lang.Object r0 = r1.a(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            r1 = 0
            if (r0 == 0) goto L4e
            Lc.v.t()
            android.content.Context r0 = r4.f66769j
            boolean r0 = Pc.D0.h(r0)
            if (r0 == 0) goto L4e
            java.lang.String r5 = "Interstitials that show when your app is in the background are a violation of AdMob policies and may lead to blocked ad serving. To learn more, visit  https://googlemobileadssdk.page.link/admob-interstitial-policies"
            Qc.p.g(r5)
            com.google.android.gms.internal.ads.nC r5 = r4.f66775p
            r5.zzb()
            com.google.android.gms.internal.ads.bf r5 = com.google.android.gms.internal.ads.C8659lf.f76069N0
            com.google.android.gms.internal.ads.jf r6 = Mc.A.c()
            java.lang.Object r5 = r6.a(r5)
            java.lang.Boolean r5 = (java.lang.Boolean) r5
            boolean r5 = r5.booleanValue()
            if (r5 == 0) goto Lc4
            com.google.android.gms.internal.ads.nc0 r5 = r4.f66774o
            com.google.android.gms.internal.ads.l60 r6 = r4.f65377a
            com.google.android.gms.internal.ads.j60 r6 = r6.f75749b
            com.google.android.gms.internal.ads.c60 r6 = r6.f75337b
            java.lang.String r6 = r6.f73103b
            r5.a(r6)
            goto Lc4
        L4e:
            java.lang.ref.WeakReference r0 = r4.f66770k
            java.lang.Object r0 = r0.get()
            com.google.android.gms.internal.ads.ot r0 = (com.google.android.gms.internal.ads.InterfaceC9008ot) r0
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76066Mb
            com.google.android.gms.internal.ads.jf r3 = Mc.A.c()
            java.lang.Object r2 = r3.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            r3 = 0
            if (r2 == 0) goto L92
            if (r0 == 0) goto L92
            com.google.android.gms.internal.ads.Z50 r0 = r0.e()
            if (r0 == 0) goto L92
            boolean r2 = r0.f72056r0
            if (r2 == 0) goto L92
            int r0 = r0.f72058s0
            com.google.android.gms.internal.ads.Eq r2 = r4.f66776q
            int r2 = r2.b()
            if (r0 == r2) goto L92
            java.lang.String r5 = "The interstitial consent form has been shown."
            Qc.p.g(r5)
            com.google.android.gms.internal.ads.nC r5 = r4.f66775p
            r6 = 12
            java.lang.String r0 = "The consent form has already been shown."
            Mc.W0 r6 = com.google.android.gms.internal.ads.V60.d(r6, r0, r3)
            r5.i(r6)
            goto Lc4
        L92:
            boolean r0 = r4.f66777r
            if (r0 == 0) goto La6
            java.lang.String r0 = "The interstitial ad has been shown."
            Qc.p.g(r0)
            com.google.android.gms.internal.ads.nC r0 = r4.f66775p
            r2 = 10
            Mc.W0 r2 = com.google.android.gms.internal.ads.V60.d(r2, r3, r3)
            r0.i(r2)
        La6:
            boolean r0 = r4.f66777r
            if (r0 != 0) goto Lc4
            if (r6 != 0) goto Lae
            android.content.Context r6 = r4.f66769j
        Lae:
            com.google.android.gms.internal.ads.sH r0 = r4.f66772m     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            com.google.android.gms.internal.ads.nC r2 = r4.f66775p     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r0.a(r5, r6, r2)     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            com.google.android.gms.internal.ads.KF r5 = r4.f66771l     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r5.zza()     // Catch: com.google.android.gms.internal.ads.zzdgb -> Lbe
            r5 = 1
            r4.f66777r = r5
            return r5
        Lbe:
            r5 = move-exception
            com.google.android.gms.internal.ads.nC r6 = r4.f66775p
            r6.k0(r5)
        Lc4:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.FG.j(boolean, android.app.Activity):boolean");
    }

    FG(C10196zz c10196zz, Context context, InterfaceC9008ot interfaceC9008ot, KF kf2, InterfaceC9377sH interfaceC9377sH, C7321Wz c7321Wz, C8868nc0 c8868nc0, C8833nC c8833nC, C6704Eq c6704Eq) {
        super(c10196zz);
        this.f66777r = false;
        this.f66769j = context;
        this.f66770k = new WeakReference(interfaceC9008ot);
        this.f66771l = kf2;
        this.f66772m = interfaceC9377sH;
        this.f66773n = c7321Wz;
        this.f66774o = c8868nc0;
        this.f66775p = c8833nC;
        this.f66776q = c6704Eq;
    }
}
