package com.google.android.gms.internal.ads;

import Mc.C4169y;
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
public final class BinderC6971Mm extends AbstractBinderC10063ym {

    /* renamed from: a, reason: collision with root package name */
    private final RtbAdapter f68708a;

    /* renamed from: b, reason: collision with root package name */
    private String f68709b = "";

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final boolean D(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final boolean E(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final boolean n0(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void p0(String str) {
        this.f68709b = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void r5(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9421sm interfaceC9421sm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        h8(str, str2, y12, bVar, interfaceC9421sm, interfaceC6835Il, null);
    }

    private final Bundle C9(Mc.Y1 y12) {
        Bundle bundle;
        Bundle bundle2 = y12.f19179m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f68708a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private static final Bundle D9(String str) throws RemoteException {
        Qc.p.g("Server parameters: ".concat(String.valueOf(str)));
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
            Qc.p.e("", e10);
            throw new RemoteException();
        }
    }

    private static final boolean E9(Mc.Y1 y12) {
        if (y12.f19172f) {
            return true;
        }
        C4169y.b();
        return Qc.g.t();
    }

    private static final String F9(String str, Mc.Y1 y12) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return y12.f19187u;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void I7(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9849wm interfaceC9849wm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        try {
            this.f68708a.loadRtbRewardedAd(new Sc.o((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), this.f68709b), new C6938Lm(this, interfaceC9849wm, interfaceC6835Il));
        } catch (Throwable th2) {
            Qc.p.e("Adapter failed to render rewarded ad.", th2);
            C10168zl.a(bVar, th2, "adapter.loadRtbRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void O1(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8780mm interfaceC8780mm, InterfaceC6835Il interfaceC6835Il, Mc.d2 d2Var) throws RemoteException {
        try {
            this.f68708a.loadRtbInterscrollerAd(new Sc.h((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), Ec.t.c(d2Var.f19217e, d2Var.f19214b, d2Var.f19213a), this.f68709b), new C6734Fm(this, interfaceC8780mm, interfaceC6835Il));
        } catch (Throwable th2) {
            Qc.p.e("Adapter failed to render interscroller ad.", th2);
            C10168zl.a(bVar, th2, "adapter.loadRtbInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void Z2(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8459jm interfaceC8459jm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        try {
            this.f68708a.loadRtbAppOpenAd(new Sc.g((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), this.f68709b), new C6870Jm(this, interfaceC8459jm, interfaceC6835Il));
        } catch (Throwable th2) {
            Qc.p.e("Adapter failed to render app open ad.", th2);
            C10168zl.a(bVar, th2, "adapter.loadRtbAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void b1(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9101pm interfaceC9101pm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        try {
            this.f68708a.loadRtbInterstitialAd(new Sc.k((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), this.f68709b), new C6768Gm(this, interfaceC9101pm, interfaceC6835Il));
        } catch (Throwable th2) {
            Qc.p.e("Adapter failed to render interstitial ad.", th2);
            C10168zl.a(bVar, th2, "adapter.loadRtbInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void b9(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9849wm interfaceC9849wm, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        try {
            this.f68708a.loadRtbRewardedInterstitialAd(new Sc.o((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), this.f68709b), new C6938Lm(this, interfaceC9849wm, interfaceC6835Il));
        } catch (Throwable th2) {
            Qc.p.e("Adapter failed to render rewarded interstitial ad.", th2);
            C10168zl.a(bVar, th2, "adapter.loadRtbRewardedInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void h8(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC9421sm interfaceC9421sm, InterfaceC6835Il interfaceC6835Il, C6963Mg c6963Mg) throws RemoteException {
        try {
            this.f68708a.loadRtbNativeAdMapper(new Sc.m((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), this.f68709b, c6963Mg), new C6802Hm(this, interfaceC9421sm, interfaceC6835Il));
        } catch (Throwable th2) {
            Qc.p.e("Adapter failed to render native ad.", th2);
            C10168zl.a(bVar, th2, "adapter.loadRtbNativeAdMapper");
            String message = th2.getMessage();
            if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                throw new RemoteException();
            }
            try {
                this.f68708a.loadRtbNativeAd(new Sc.m((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), this.f68709b, c6963Mg), new C6836Im(this, interfaceC9421sm, interfaceC6835Il));
            } catch (Throwable th3) {
                Qc.p.e("Adapter failed to render native ad.", th3);
                C10168zl.a(bVar, th3, "adapter.loadRtbNativeAd");
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final void n2(String str, String str2, Mc.Y1 y12, com.google.android.gms.dynamic.b bVar, InterfaceC8780mm interfaceC8780mm, InterfaceC6835Il interfaceC6835Il, Mc.d2 d2Var) throws RemoteException {
        try {
            this.f68708a.loadRtbBannerAd(new Sc.h((Context) com.google.android.gms.dynamic.d.b2(bVar), str, D9(str2), C9(y12), E9(y12), y12.f19177k, y12.f19173g, y12.f19186t, F9(str2, y12), Ec.t.c(d2Var.f19217e, d2Var.f19214b, d2Var.f19213a), this.f68709b), new C6700Em(this, interfaceC8780mm, interfaceC6835Il));
        } catch (Throwable th2) {
            Qc.p.e("Adapter failed to render banner ad.", th2);
            C10168zl.a(bVar, th2, "adapter.loadRtbBannerAd");
            throw new RemoteException();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void u2(com.google.android.gms.dynamic.b r5, java.lang.String r6, android.os.Bundle r7, android.os.Bundle r8, Mc.d2 r9, com.google.android.gms.internal.ads.InterfaceC6632Cm r10) throws android.os.RemoteException {
        /*
            r4 = this;
            com.google.android.gms.internal.ads.Km r0 = new com.google.android.gms.internal.ads.Km     // Catch: java.lang.Throwable -> L71
            r0.<init>(r4, r10)     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.ads.mediation.rtb.RtbAdapter r10 = r4.f68708a     // Catch: java.lang.Throwable -> L71
            Sc.j r1 = new Sc.j     // Catch: java.lang.Throwable -> L71
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
            com.google.android.gms.internal.ads.bf r6 = com.google.android.gms.internal.ads.C8659lf.f76024Jb     // Catch: java.lang.Throwable -> L71
            com.google.android.gms.internal.ads.jf r2 = Mc.A.c()     // Catch: java.lang.Throwable -> L71
            java.lang.Object r6 = r2.a(r6)     // Catch: java.lang.Throwable -> L71
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L71
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L71
            if (r6 == 0) goto L73
            Ec.b r6 = Ec.b.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
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
            Ec.b r6 = Ec.b.APP_OPEN_AD     // Catch: java.lang.Throwable -> L71
            goto L8c
        L7e:
            Ec.b r6 = Ec.b.NATIVE     // Catch: java.lang.Throwable -> L71
            goto L8c
        L81:
            Ec.b r6 = Ec.b.REWARDED_INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L84:
            Ec.b r6 = Ec.b.REWARDED     // Catch: java.lang.Throwable -> L71
            goto L8c
        L87:
            Ec.b r6 = Ec.b.INTERSTITIAL     // Catch: java.lang.Throwable -> L71
            goto L8c
        L8a:
            Ec.b r6 = Ec.b.BANNER     // Catch: java.lang.Throwable -> L71
        L8c:
            r1.<init>(r6, r8)     // Catch: java.lang.Throwable -> L71
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L71
            r6.<init>()     // Catch: java.lang.Throwable -> L71
            r6.add(r1)     // Catch: java.lang.Throwable -> L71
            Uc.a r8 = new Uc.a     // Catch: java.lang.Throwable -> L71
            java.lang.Object r1 = com.google.android.gms.dynamic.d.b2(r5)     // Catch: java.lang.Throwable -> L71
            android.content.Context r1 = (android.content.Context) r1     // Catch: java.lang.Throwable -> L71
            int r2 = r9.f19217e     // Catch: java.lang.Throwable -> L71
            int r3 = r9.f19214b     // Catch: java.lang.Throwable -> L71
            java.lang.String r9 = r9.f19213a     // Catch: java.lang.Throwable -> L71
            Ec.e r9 = Ec.t.c(r2, r3, r9)     // Catch: java.lang.Throwable -> L71
            r8.<init>(r1, r6, r7, r9)     // Catch: java.lang.Throwable -> L71
            r10.collectSignals(r8, r0)     // Catch: java.lang.Throwable -> L71
            return
        Lb0:
            java.lang.String r7 = "Error generating signals for RTB"
            Qc.p.e(r7, r6)
            java.lang.String r7 = "adapter.collectSignals"
            com.google.android.gms.internal.ads.C10168zl.a(r5, r6, r7)
            android.os.RemoteException r5 = new android.os.RemoteException
            r5.<init>()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC6971Mm.u2(com.google.android.gms.dynamic.b, java.lang.String, android.os.Bundle, android.os.Bundle, Mc.d2, com.google.android.gms.internal.ads.Cm):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final Mc.Y0 zze() {
        Object obj = this.f68708a;
        if (obj instanceof Sc.t) {
            try {
                return ((Sc.t) obj).getVideoController();
            } catch (Throwable th2) {
                Qc.p.e("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final C7005Nm zzf() throws RemoteException {
        this.f68708a.getVersionInfo();
        return C7005Nm.B(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC10170zm
    public final C7005Nm zzg() throws RemoteException {
        this.f68708a.getSDKVersionInfo();
        return C7005Nm.B(null);
    }

    public BinderC6971Mm(RtbAdapter rtbAdapter) {
        this.f68708a = rtbAdapter;
    }
}
