package com.google.android.gms.internal.ads;

import Oc.C4447y;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.gms.internal.ads.cm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class BinderC7838cm extends AbstractBinderC6824El {

    /* renamed from: a, reason: collision with root package name */
    private final Object f74076a;

    /* renamed from: b, reason: collision with root package name */
    private C7945dm f74077b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7369Uo f74078c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f74079d;

    /* renamed from: e, reason: collision with root package name */
    private View f74080e;

    /* renamed from: f, reason: collision with root package name */
    private Uc.s f74081f;

    /* renamed from: g, reason: collision with root package name */
    private final String f74082g = "";

    public BinderC7838cm(Uc.a aVar) {
        this.f74076a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void E2(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        d3(bVar, y12, str, null, interfaceC6960Il);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void I3(Oc.Y1 y12, String str) throws RemoteException {
        k1(y12, str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void X3(com.google.android.gms.dynamic.b bVar, Oc.d2 d2Var, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        r5(bVar, d2Var, y12, str, null, interfaceC6960Il);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7095Ml c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final boolean m() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7129Nl t() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final InterfaceC7062Ll zzj() {
        return null;
    }

    public BinderC7838cm(Uc.f fVar) {
        this.f74076a = fVar;
    }

    private final Bundle B9(Oc.Y1 y12) {
        Bundle bundle;
        Bundle bundle2 = y12.f23366m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f74076a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle C9(String str, Oc.Y1 y12, String str2) throws RemoteException {
        Sc.p.b("Server parameters: ".concat(String.valueOf(str)));
        try {
            Bundle bundle = new Bundle();
            if (str != null) {
                JSONObject jSONObject = new JSONObject(str);
                Bundle bundle2 = new Bundle();
                Iterator<String> itKeys = jSONObject.keys();
                while (itKeys.hasNext()) {
                    String next = itKeys.next();
                    bundle2.putString(next, jSONObject.getString(next));
                }
                bundle = bundle2;
            }
            if (this.f74076a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (y12 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", y12.f23360g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            Sc.p.e("", th2);
            throw new RemoteException();
        }
    }

    private static final boolean D9(Oc.Y1 y12) {
        if (y12.f23359f) {
            return true;
        }
        C4447y.b();
        return Sc.g.t();
    }

    private static final String E9(String str, Oc.Y1 y12) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return y12.f23374u;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void A() throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.f) {
            try {
                ((Uc.f) obj).onPause();
            } catch (Throwable th2) {
                Sc.p.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void F8(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.a) {
            Sc.p.b("Show rewarded ad from adapter.");
            Sc.p.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void J3(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC7369Uo interfaceC7369Uo, String str2) throws RemoteException {
        Object obj = this.f74076a;
        if ((obj instanceof Uc.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f74079d = bVar;
            this.f74078c = interfaceC7369Uo;
            interfaceC7369Uo.zzl(com.google.android.gms.dynamic.d.I2(this.f74076a));
            return;
        }
        Object obj2 = this.f74076a;
        Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void L7(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.a) {
            Sc.p.b("Show app open ad from adapter.");
            Sc.p.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void M6(com.google.android.gms.dynamic.b r6, com.google.android.gms.internal.ads.InterfaceC7093Mj r7, java.util.List r8) throws android.os.RemoteException {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f74076a
            boolean r0 = r0 instanceof Uc.a
            if (r0 == 0) goto Lb8
            com.google.android.gms.internal.ads.Ul r0 = new com.google.android.gms.internal.ads.Ul
            r0.<init>(r5, r7)
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            java.util.Iterator r8 = r8.iterator()
        L14:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto Laa
            java.lang.Object r1 = r8.next()
            com.google.android.gms.internal.ads.Sj r1 = (com.google.android.gms.internal.ads.C7297Sj) r1
            java.lang.String r2 = r1.f70989a
            int r3 = r2.hashCode()
            switch(r3) {
                case -1396342996: goto L66;
                case -1052618729: goto L5c;
                case -239580146: goto L52;
                case 604727084: goto L48;
                case 1167692200: goto L3e;
                case 1778294298: goto L34;
                case 1911491517: goto L2a;
                default: goto L29;
            }
        L29:
            goto L70
        L2a:
            java.lang.String r3 = "rewarded_interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 3
            goto L71
        L34:
            java.lang.String r3 = "app_open_ad"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 6
            goto L71
        L3e:
            java.lang.String r3 = "app_open"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 5
            goto L71
        L48:
            java.lang.String r3 = "interstitial"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 1
            goto L71
        L52:
            java.lang.String r3 = "rewarded"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 2
            goto L71
        L5c:
            java.lang.String r3 = "native"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 4
            goto L71
        L66:
            java.lang.String r3 = "banner"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L70
            r2 = 0
            goto L71
        L70:
            r2 = -1
        L71:
            r3 = 0
            switch(r2) {
                case 0: goto L9a;
                case 1: goto L97;
                case 2: goto L94;
                case 3: goto L91;
                case 4: goto L8e;
                case 5: goto L8b;
                case 6: goto L76;
                default: goto L75;
            }
        L75:
            goto L9c
        L76:
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8784lf.f76864Jb
            com.google.android.gms.internal.ads.jf r4 = Oc.A.c()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L9c
            Gc.b r3 = Gc.b.APP_OPEN_AD
            goto L9c
        L8b:
            Gc.b r3 = Gc.b.APP_OPEN_AD
            goto L9c
        L8e:
            Gc.b r3 = Gc.b.NATIVE
            goto L9c
        L91:
            Gc.b r3 = Gc.b.REWARDED_INTERSTITIAL
            goto L9c
        L94:
            Gc.b r3 = Gc.b.REWARDED
            goto L9c
        L97:
            Gc.b r3 = Gc.b.INTERSTITIAL
            goto L9c
        L9a:
            Gc.b r3 = Gc.b.BANNER
        L9c:
            if (r3 == 0) goto L14
            Uc.j r2 = new Uc.j
            android.os.Bundle r1 = r1.f70990b
            r2.<init>(r3, r1)
            r7.add(r2)
            goto L14
        Laa:
            java.lang.Object r8 = r5.f74076a
            Uc.a r8 = (Uc.a) r8
            java.lang.Object r6 = com.google.android.gms.dynamic.d.c2(r6)
            android.content.Context r6 = (android.content.Context) r6
            r8.initialize(r6, r0, r7)
            return
        Lb8:
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC7838cm.M6(com.google.android.gms.dynamic.b, com.google.android.gms.internal.ads.Mj, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void U3(com.google.android.gms.dynamic.b bVar, InterfaceC7369Uo interfaceC7369Uo, List list) throws RemoteException {
        Sc.p.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void X4(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Object obj = this.f74076a;
        if (!(obj instanceof Uc.a)) {
            Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Sc.p.b("Requesting app open ad from adapter.");
        try {
            ((Uc.a) this.f74076a).loadAppOpenAd(new Uc.g((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, null), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), ""), new C7732bm(this, interfaceC6960Il));
        } catch (Exception e10) {
            Sc.p.e("", e10);
            C10293zl.a(bVar, e10, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void X5(com.google.android.gms.dynamic.b bVar, Oc.d2 d2Var, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Object obj = this.f74076a;
        if (!(obj instanceof Uc.a)) {
            Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Sc.p.b("Requesting interscroller ad from adapter.");
        try {
            Uc.a aVar = (Uc.a) this.f74076a;
            aVar.loadInterscrollerAd(new Uc.h((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), Gc.t.e(d2Var.f23404e, d2Var.f23401b), ""), new C7333Tl(this, interfaceC6960Il, aVar));
        } catch (Exception e10) {
            Sc.p.e("", e10);
            C10293zl.a(bVar, e10, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void d3(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Object obj = this.f74076a;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Uc.a)) {
            Sc.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Sc.p.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f74076a;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof Uc.a) {
                try {
                    ((Uc.a) obj2).loadInterstitialAd(new Uc.k((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), this.f74082g), new C7465Xl(this, interfaceC6960Il));
                    return;
                } catch (Throwable th2) {
                    Sc.p.e("", th2);
                    C10293zl.a(bVar, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = y12.f23358e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = y12.f23355b;
            C7299Sl c7299Sl = new C7299Sl(j10 == -1 ? null : new Date(j10), y12.f23357d, hashSet, y12.f23364k, D9(y12), y12.f23360g, y12.f23371r, y12.f23373t, E9(str, y12));
            Bundle bundle = y12.f23366m;
            mediationInterstitialAdapter.requestInterstitialAd((Context) com.google.android.gms.dynamic.d.c2(bVar), new C7945dm(interfaceC6960Il), C9(str, y12, str2), c7299Sl, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            Sc.p.e("", th3);
            C10293zl.a(bVar, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void f0(boolean z10) throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.r) {
            try {
                ((Uc.r) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th2) {
                Sc.p.e("", th2);
                return;
            }
        }
        Sc.p.b(Uc.r.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void g1(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Object obj = this.f74076a;
        if (!(obj instanceof Uc.a)) {
            Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Sc.p.b("Requesting rewarded ad from adapter.");
        try {
            ((Uc.a) this.f74076a).loadRewardedAd(new Uc.o((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, null), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), ""), new C7625am(this, interfaceC6960Il));
        } catch (Exception e10) {
            Sc.p.e("", e10);
            C10293zl.a(bVar, e10, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void h() throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof MediationInterstitialAdapter) {
            Sc.p.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f74076a).showInterstitial();
                return;
            } catch (Throwable th2) {
                Sc.p.e("", th2);
                throw new RemoteException();
            }
        }
        Sc.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void k1(Oc.Y1 y12, String str, String str2) throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.a) {
            g1(this.f74079d, y12, str, new BinderC8051em((Uc.a) obj, this.f74078c));
            return;
        }
        Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void l() throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.a) {
            Sc.p.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void r5(com.google.android.gms.dynamic.b bVar, Oc.d2 d2Var, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Object obj = this.f74076a;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Uc.a)) {
            Sc.p.g(MediationBannerAdapter.class.getCanonicalName() + " or " + Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Sc.p.b("Requesting banner ad from adapter.");
        Gc.e eVarD = d2Var.f23413n ? Gc.t.d(d2Var.f23404e, d2Var.f23401b) : Gc.t.c(d2Var.f23404e, d2Var.f23401b, d2Var.f23400a);
        Object obj2 = this.f74076a;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof Uc.a) {
                try {
                    ((Uc.a) obj2).loadBannerAd(new Uc.h((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), eVarD, this.f74082g), new C7399Vl(this, interfaceC6960Il));
                    return;
                } catch (Throwable th2) {
                    Sc.p.e("", th2);
                    C10293zl.a(bVar, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = y12.f23358e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = y12.f23355b;
            C7299Sl c7299Sl = new C7299Sl(j10 == -1 ? null : new Date(j10), y12.f23357d, hashSet, y12.f23364k, D9(y12), y12.f23360g, y12.f23371r, y12.f23373t, E9(str, y12));
            Bundle bundle = y12.f23366m;
            mediationBannerAdapter.requestBannerAd((Context) com.google.android.gms.dynamic.d.c2(bVar), new C7945dm(interfaceC6960Il), C9(str, y12, str2), eVarD, c7299Sl, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            Sc.p.e("", th3);
            C10293zl.a(bVar, th3, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void s2(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, InterfaceC6960Il interfaceC6960Il) throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.a) {
            Sc.p.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Uc.a) this.f74076a).loadRewardedInterstitialAd(new Uc.o((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, null), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), ""), new C7625am(this, interfaceC6960Il));
                return;
            } catch (Exception e10) {
                C10293zl.a(bVar, e10, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void t4(com.google.android.gms.dynamic.b bVar, Oc.Y1 y12, String str, String str2, InterfaceC6960Il interfaceC6960Il, C7088Mg c7088Mg, List list) throws RemoteException {
        Object obj = this.f74076a;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Uc.a)) {
            Sc.p.g(MediationNativeAdapter.class.getCanonicalName() + " or " + Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Sc.p.b("Requesting native ad from adapter.");
        Object obj2 = this.f74076a;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = y12.f23358e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j10 = y12.f23355b;
                C8158fm c8158fm = new C8158fm(j10 == -1 ? null : new Date(j10), y12.f23357d, hashSet, y12.f23364k, D9(y12), y12.f23360g, c7088Mg, list, y12.f23371r, y12.f23373t, E9(str, y12));
                Bundle bundle = y12.f23366m;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f74077b = new C7945dm(interfaceC6960Il);
                mediationNativeAdapter.requestNativeAd((Context) com.google.android.gms.dynamic.d.c2(bVar), this.f74077b, C9(str, y12, str2), c8158fm, bundle2);
                return;
            } catch (Throwable th2) {
                Sc.p.e("", th2);
                C10293zl.a(bVar, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Uc.a) {
            try {
                ((Uc.a) obj2).loadNativeAdMapper(new Uc.m((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), this.f74082g, c7088Mg), new C7531Zl(this, interfaceC6960Il));
            } catch (Throwable th3) {
                Sc.p.e("", th3);
                C10293zl.a(bVar, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Uc.a) this.f74076a).loadNativeAd(new Uc.m((Context) com.google.android.gms.dynamic.d.c2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f23364k, y12.f23360g, y12.f23373t, E9(str, y12), this.f74082g, c7088Mg), new C7498Yl(this, interfaceC6960Il));
                } catch (Throwable th4) {
                    Sc.p.e("", th4);
                    C10293zl.a(bVar, th4, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void u9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Object obj = this.f74076a;
        if ((obj instanceof Uc.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                h();
                return;
            } else {
                Sc.p.b("Show interstitial ad from adapter.");
                Sc.p.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        Sc.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void zzF() throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.f) {
            try {
                ((Uc.f) obj).onResume();
            } catch (Throwable th2) {
                Sc.p.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final boolean zzN() throws RemoteException {
        Object obj = this.f74076a;
        if ((obj instanceof Uc.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f74078c != null;
        }
        Object obj2 = this.f74076a;
        Sc.p.g(Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final Oc.Y0 zzh() {
        Object obj = this.f74076a;
        if (obj instanceof Uc.t) {
            try {
                return ((Uc.t) obj).getVideoController();
            } catch (Throwable th2) {
                Sc.p.e("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final InterfaceC9323qh zzi() {
        C9429rh c9429rhU;
        C7945dm c7945dm = this.f74077b;
        if (c7945dm == null || (c9429rhU = c7945dm.u()) == null) {
            return null;
        }
        return c9429rhU.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final InterfaceC7231Ql zzk() {
        Uc.s sVar;
        Uc.s sVarT;
        Object obj = this.f74076a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Uc.a) || (sVar = this.f74081f) == null) {
                return null;
            }
            return new BinderC8265gm(sVar);
        }
        C7945dm c7945dm = this.f74077b;
        if (c7945dm == null || (sVarT = c7945dm.t()) == null) {
            return null;
        }
        return new BinderC8265gm(sVarT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7130Nm zzl() {
        Object obj = this.f74076a;
        if (!(obj instanceof Uc.a)) {
            return null;
        }
        ((Uc.a) obj).getVersionInfo();
        return C7130Nm.B(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final C7130Nm zzm() {
        Object obj = this.f74076a;
        if (!(obj instanceof Uc.a)) {
            return null;
        }
        ((Uc.a) obj).getSDKVersionInfo();
        return C7130Nm.B(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return com.google.android.gms.dynamic.d.I2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                Sc.p.e("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof Uc.a) {
            return com.google.android.gms.dynamic.d.I2(this.f74080e);
        }
        Sc.p.g(MediationBannerAdapter.class.getCanonicalName() + " or " + Uc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void zzo() throws RemoteException {
        Object obj = this.f74076a;
        if (obj instanceof Uc.f) {
            try {
                ((Uc.f) obj).onDestroy();
            } catch (Throwable th2) {
                Sc.p.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6858Fl
    public final void s5(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Context context = (Context) com.google.android.gms.dynamic.d.c2(bVar);
        Object obj = this.f74076a;
        if (obj instanceof Uc.q) {
            ((Uc.q) obj).a(context);
        }
    }
}
