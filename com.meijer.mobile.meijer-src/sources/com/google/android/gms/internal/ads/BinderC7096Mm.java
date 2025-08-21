package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.mediation.rtb.RtbAdapter;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.Mm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7096Mm extends AbstractBinderC10188ym {

    /* renamed from: a, reason: collision with root package name */
    private final RtbAdapter f69548a;

    /* renamed from: b, reason: collision with root package name */
    private String f69549b = "";

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final boolean D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final boolean E(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void c6(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9546sm interfaceC9546sm, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        g3(str, str2, y12, bVar, interfaceC9546sm, interfaceC6960Il, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final boolean o0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void q0(String str) {
        this.f69549b = str;
    }

    private final Bundle C9(Oc.Y1 y12) {
        Bundle bundle;
        Bundle bundle2 = y12.f23366m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f69548a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle D9(String str) throws RemoteException {
        Sc.p.g("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str == null) {
                return bundle;
            }
            JSONObject jSONObject = new JSONObject(str);
            Bundle bundle2 = new Bundle();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                bundle2.putString(next, jSONObject.getString(next));
            }
            return bundle2;
        } catch (JSONException e10) {
            Sc.p.e("", e10);
            throw new RemoteException();
        }
    }

    private static final boolean E9(Oc.Y1 y12) {
        if (y12.f23359f) {
            return true;
        }
        C4447y.b();
        return Sc.g.t();
    }

    private static final String F9(String str, Oc.Y1 y12) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return y12.f23374u;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void A1(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9226pm interfaceC9226pm, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        try {
            this.f69548a.loadRtbInterstitialAd(new Uc.k((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), this.f69549b), new C6893Gm(this, interfaceC9226pm, interfaceC6960Il));
        } catch (Throwable th2) {
            Sc.p.e("Adapter failed to render interstitial ad.", th2);
            C10293zl.a(bVar, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void G1(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8905mm interfaceC8905mm, InterfaceC6960Il interfaceC6960Il, Oc.d2 d2Var) throws RemoteException {
        try {
            this.f69548a.loadRtbBannerAd(new Uc.h((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), Gc.t.c(d2Var.f23404e, d2Var.f23401b, d2Var.f23400a), this.f69549b), new C6825Em(this, interfaceC8905mm, interfaceC6960Il));
        } catch (Throwable th2) {
            Sc.p.e("Adapter failed to render banner ad.", th2);
            C10293zl.a(bVar, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d1(com.google.android.gms.dynamic.b r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, Oc.d2 r9, com.google.android.gms.internal.ads.InterfaceC6757Cm r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.Km r0 = new com.google.android.gms.internal.ads.Km     // Catch: java.lang.Throwable -> L71
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.f69548a     // Catch: java.lang.Throwable -> L71
            Uc.j r1 = new Uc.j     // Catch: java.lang.Throwable -> L71
            int r2 = r6.hashCode()     // Catch: java.lang.Throwable -> L71
            switch(r2) {
                case -1396342996: goto L4d;
                case -1052618729: goto L43;
                case -239580146: goto L39;
                case 604727084: goto L2f;
                case 1167692200: goto L25;
                case 1778294298: goto L1b;
                case 1911491517: goto L11;
                default: goto L10;
            }
        L10:
            goto L57
        L11:
            java.lang.String r2 = "rewarded_interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 3
            goto L58
        L1b:
            java.lang.String r2 = "app_open_ad"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 6
            goto L58
        L25:
            java.lang.String r2 = "app_open"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 5
            goto L58
        L2f:
            java.lang.String r2 = "interstitial"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 1
            goto L58
        L39:
            java.lang.String r2 = "rewarded"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 2
            goto L58
        L43:
            java.lang.String r2 = "native"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 4
            goto L58
        L4d:
            java.lang.String r2 = "banner"
            boolean r6 = r6.equals(r2)
            if (r6 == 0) goto L57
            r6 = 0
            goto L58
        L57:
            r6 = -1
        L58:
            switch(r6) {
                case 0: goto L8a;
                case 1: goto L87;
                case 2: goto L84;
                case 3: goto L81;
                case 4: goto L7e;
                case 5: goto L7b;
                case 6: goto L5c;
                default: goto L5b;
            }
        L5b:
            goto L73
        L5c:
            com.google.android.gms.internal.ads.bf r6 = com.google.android.gms.internal.ads.C8784lf.f76864Jb     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.jf r2 = Oc.A.c()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r2.a(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L71
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L73
            Gc.b r6 = Gc.b.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L71:
            r6 = move-exception
            goto Lb0
        L73:
            java.lang.IllegalArgumentException r6 = new java.lang.IllegalArgumentException     // Catch: java.lang.Throwable -> L71
            java.lang.String r7 = "Internal Error"
            r6.<init>(r7)     // Catch: java.lang.Throwable -> L71
            throw r6     // Catch: java.lang.Throwable -> L71
        L7b:
            Gc.b r6 = Gc.b.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L7e:
            Gc.b r6 = Gc.b.NATIVE     // Catch: java.lang.Throwable -> L71
            goto L8c
        L81:
            Gc.b r6 = Gc.b.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L84:
            Gc.b r6 = Gc.b.REWARDED     // Catch: java.lang.Throwable -> L71
            goto L8c
        L87:
            Gc.b r6 = Gc.b.INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L8a:
            Gc.b r6 = Gc.b.BANNER     // Catch: java.lang.Throwable -> L71
        L8c:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            r6.add(r1)     // Catch: java.lang.Throwable -> L71
            Wc.a r8 = new Wc.a     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = com.google.android.gms.dynamic.d.c2(r5)     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L71
            int r2 = r9.f23404e     // Catch: java.lang.Throwable -> L71
            int r3 = r9.f23401b     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.f23400a     // Catch: java.lang.Throwable -> L71
            Gc.e r9 = Gc.t.c(r2, r3, r9)     // Catch: java.lang.Throwable -> L71
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L71
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> L71
            return
        Lb0:
            java.lang.String r7 = "Error generating signals for RTB"
            Sc.p.e(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.C10293zl.a(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC7096Mm.d1(com.google.android.gms.dynamic.b, java.lang.String, android.os.Bundle, android.os.Bundle, Oc.d2, com.google.android.gms.internal.ads.Cm):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void e3(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9974wm interfaceC9974wm, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        try {
            this.f69548a.loadRtbRewardedInterstitialAd(new Uc.o((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), this.f69549b), new C7063Lm(this, interfaceC9974wm, interfaceC6960Il));
        } catch (Throwable th2) {
            Sc.p.e("Adapter failed to render rewarded interstitial ad.", th2);
            C10293zl.a(bVar, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void g3(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9546sm interfaceC9546sm, InterfaceC6960Il interfaceC6960Il, C7088Mg c7088Mg) throws RemoteException {
        try {
            this.f69548a.loadRtbNativeAdMapper(new Uc.m((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), this.f69549b, c7088Mg), new C6927Hm(this, interfaceC9546sm, interfaceC6960Il));
        } catch (Throwable th2) {
            Sc.p.e("Adapter failed to render native ad.", th2);
            C10293zl.a(bVar, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.f69548a.loadRtbNativeAd(new Uc.m((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), this.f69549b, c7088Mg), new C6961Im(this, interfaceC9546sm, interfaceC6960Il));
            } catch (Throwable th3) {
                Sc.p.e("Adapter failed to render native ad.", th3);
                C10293zl.a(bVar, th3, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void m1(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8905mm interfaceC8905mm, InterfaceC6960Il interfaceC6960Il, Oc.d2 d2Var) throws RemoteException {
        try {
            this.f69548a.loadRtbInterscrollerAd(new Uc.h((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), Gc.t.c(d2Var.f23404e, d2Var.f23401b, d2Var.f23400a), this.f69549b), new C6859Fm(this, interfaceC8905mm, interfaceC6960Il));
        } catch (Throwable th2) {
            Sc.p.e("Adapter failed to render interscroller ad.", th2);
            C10293zl.a(bVar, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void u2(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9974wm interfaceC9974wm, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        try {
            this.f69548a.loadRtbRewardedAd(new Uc.o((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), this.f69549b), new C7063Lm(this, interfaceC9974wm, interfaceC6960Il));
        } catch (Throwable th2) {
            Sc.p.e("Adapter failed to render rewarded ad.", th2);
            C10293zl.a(bVar, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final void x9(String str, String str2, Oc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8584jm interfaceC8584jm, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        try {
            this.f69548a.loadRtbAppOpenAd(new Uc.g((Context) com.google.android.gms.dynamic.d.c2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f23364k, y12.f23360g, y12.f23373t, F9(str2, y12), this.f69549b), new C6995Jm(this, interfaceC8584jm, interfaceC6960Il));
        } catch (Throwable th2) {
            Sc.p.e("Adapter failed to render app open ad.", th2);
            C10293zl.a(bVar, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final Oc.Y0 zze() {
        Object obj = this.f69548a;
        if (obj instanceof Uc.t) {
            try {
                return ((Uc.t) obj).getVideoController();
            } catch (Throwable th2) {
                Sc.p.e("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final C7130Nm zzf() throws RemoteException {
        this.f69548a.getVersionInfo();
        return C7130Nm.B(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10295zm
    public final C7130Nm zzg() throws RemoteException {
        this.f69548a.getSDKVersionInfo();
        return C7130Nm.B(null);
    }

    public BinderC7096Mm(RtbAdapter rtbAdapter) {
        this.f69548a = rtbAdapter;
    }
}
