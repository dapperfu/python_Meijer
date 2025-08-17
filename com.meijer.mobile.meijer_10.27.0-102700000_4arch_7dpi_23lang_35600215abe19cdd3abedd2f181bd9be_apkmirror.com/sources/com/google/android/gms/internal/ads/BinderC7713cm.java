package com.google.android.gms.internal.ads;

import Mc.C4169y;
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
public final class BinderC7713cm extends AbstractBinderC6699El {

    /* renamed from: a, reason: collision with root package name */
    private final Object f73236a;

    /* renamed from: b, reason: collision with root package name */
    private C7820dm f73237b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC7244Uo f73238c;

    /* renamed from: d, reason: collision with root package name */
    private com.google.android.gms.dynamic.b f73239d;

    /* renamed from: e, reason: collision with root package name */
    private View f73240e;

    /* renamed from: f, reason: collision with root package name */
    private Sc.s f73241f;

    /* renamed from: g, reason: collision with root package name */
    private final String f73242g = "";

    public BinderC7713cm(Sc.a aVar) {
        this.f73236a = aVar;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C6970Ml c() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void d4(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        g9(bVar, y12, str, null, interfaceC6835Il);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void i1(com.google.android.gms.dynamic.b bVar, Mc.d2 d2Var, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        G8(bVar, d2Var, y12, str, null, interfaceC6835Il);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final boolean m() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void o4(Mc.Y1 y12, String str) throws RemoteException {
        e4(y12, str, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C7004Nl t() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final InterfaceC6937Ll zzj() {
        return null;
    }

    public BinderC7713cm(Sc.f fVar) {
        this.f73236a = fVar;
    }

    private final Bundle B9(Mc.Y1 y12) {
        Bundle bundle;
        Bundle bundle2 = y12.f19179m;
        return (bundle2 == null || (bundle = bundle2.getBundle(this.f73236a.getClass().getName())) == null) ? new Bundle() : bundle;
    }

    private final Bundle C9(String str, Mc.Y1 y12, String str2) throws RemoteException {
        Qc.p.b("Server parameters: ".concat(String.valueOf(str)));
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
            if (this.f73236a instanceof AdMobAdapter) {
                bundle.putString("adJson", str2);
                if (y12 != null) {
                    bundle.putInt("tagForChildDirectedTreatment", y12.f19173g);
                }
            }
            bundle.remove("max_ad_content_rating");
            return bundle;
        } catch (Throwable th2) {
            Qc.p.e("", th2);
            throw new RemoteException();
        }
    }

    private static final boolean D9(Mc.Y1 y12) {
        if (y12.f19172f) {
            return true;
        }
        C4169y.b();
        return Qc.g.t();
    }

    private static final String E9(String str, Mc.Y1 y12) {
        try {
            return new JSONObject(str).getString("max_ad_content_rating");
        } catch (JSONException unused) {
            return y12.f19187u;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void A() throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.f) {
            try {
                ((Sc.f) obj).onPause();
            } catch (Throwable th2) {
                Qc.p.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void A6(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il, C6963Mg c6963Mg, List list) throws RemoteException {
        Object obj = this.f73236a;
        if (!(obj instanceof MediationNativeAdapter) && !(obj instanceof Sc.a)) {
            Qc.p.g(MediationNativeAdapter.class.getCanonicalName() + " or " + Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Qc.p.b("Requesting native ad from adapter.");
        Object obj2 = this.f73236a;
        if (obj2 instanceof MediationNativeAdapter) {
            try {
                MediationNativeAdapter mediationNativeAdapter = (MediationNativeAdapter) obj2;
                List list2 = y12.f19171e;
                HashSet hashSet = list2 != null ? new HashSet(list2) : null;
                long j10 = y12.f19168b;
                C8033fm c8033fm = new C8033fm(j10 == -1 ? null : new Date(j10), y12.f19170d, hashSet, y12.f19177k, D9(y12), y12.f19173g, c6963Mg, list, y12.f19184r, y12.f19186t, E9(str, y12));
                Bundle bundle = y12.f19179m;
                Bundle bundle2 = bundle != null ? bundle.getBundle(mediationNativeAdapter.getClass().getName()) : null;
                this.f73237b = new C7820dm(interfaceC6835Il);
                mediationNativeAdapter.requestNativeAd((Context) com.google.android.gms.dynamic.d.b2(bVar), this.f73237b, C9(str, y12, str2), c8033fm, bundle2);
                return;
            } catch (Throwable th2) {
                Qc.p.e("", th2);
                C10168zl.a(bVar, th2, "adapter.requestNativeAd");
                throw new RemoteException();
            }
        }
        if (obj2 instanceof Sc.a) {
            try {
                ((Sc.a) obj2).loadNativeAdMapper(new Sc.m((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), this.f73242g, c6963Mg), new C7406Zl(this, interfaceC6835Il));
            } catch (Throwable th3) {
                Qc.p.e("", th3);
                C10168zl.a(bVar, th3, "adapter.loadNativeAdMapper");
                String message = th3.getMessage();
                if (TextUtils.isEmpty(message) || !message.equals("Method is not found")) {
                    throw new RemoteException();
                }
                try {
                    ((Sc.a) this.f73236a).loadNativeAd(new Sc.m((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), this.f73242g, c6963Mg), new C7373Yl(this, interfaceC6835Il));
                } catch (Throwable th4) {
                    Qc.p.e("", th4);
                    C10168zl.a(bVar, th4, "adapter.loadNativeAd");
                    throw new RemoteException();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void G8(com.google.android.gms.dynamic.b bVar, Mc.d2 d2Var, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Object obj = this.f73236a;
        if (!(obj instanceof MediationBannerAdapter) && !(obj instanceof Sc.a)) {
            Qc.p.g(MediationBannerAdapter.class.getCanonicalName() + " or " + Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Qc.p.b("Requesting banner ad from adapter.");
        Ec.e eVarD = d2Var.f19226n ? Ec.t.d(d2Var.f19217e, d2Var.f19214b) : Ec.t.c(d2Var.f19217e, d2Var.f19214b, d2Var.f19213a);
        Object obj2 = this.f73236a;
        if (!(obj2 instanceof MediationBannerAdapter)) {
            if (obj2 instanceof Sc.a) {
                try {
                    ((Sc.a) obj2).loadBannerAd(new Sc.h((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), eVarD, this.f73242g), new C7274Vl(this, interfaceC6835Il));
                    return;
                } catch (Throwable th2) {
                    Qc.p.e("", th2);
                    C10168zl.a(bVar, th2, "adapter.loadBannerAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationBannerAdapter mediationBannerAdapter = (MediationBannerAdapter) obj2;
            List list = y12.f19171e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = y12.f19168b;
            C7174Sl c7174Sl = new C7174Sl(j10 == -1 ? null : new Date(j10), y12.f19170d, hashSet, y12.f19177k, D9(y12), y12.f19173g, y12.f19184r, y12.f19186t, E9(str, y12));
            Bundle bundle = y12.f19179m;
            mediationBannerAdapter.requestBannerAd((Context) com.google.android.gms.dynamic.d.b2(bVar), new C7820dm(interfaceC6835Il), C9(str, y12, str2), eVarD, c7174Sl, bundle != null ? bundle.getBundle(mediationBannerAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            Qc.p.e("", th3);
            C10168zl.a(bVar, th3, "adapter.requestBannerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void I3(com.google.android.gms.dynamic.b bVar, InterfaceC7244Uo interfaceC7244Uo, List list) throws RemoteException {
        Qc.p.g("Could not initialize rewarded video adapter.");
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void K7(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.a) {
            Qc.p.b("Show app open ad from adapter.");
            Qc.p.d("Can not show null mediation app open ad.");
            throw new RemoteException();
        }
        Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void L8(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.a) {
            Qc.p.b("Show rewarded ad from adapter.");
            Qc.p.d("Can not show null mediation rewarded ad.");
            throw new RemoteException();
        }
        Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void Z1(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Object obj = this.f73236a;
        if (!(obj instanceof Sc.a)) {
            Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Qc.p.b("Requesting app open ad from adapter.");
        try {
            ((Sc.a) this.f73236a).loadAppOpenAd(new Sc.g((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, null), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), ""), new C7607bm(this, interfaceC6835Il));
        } catch (Exception e10) {
            Qc.p.e("", e10);
            C10168zl.a(bVar, e10, "adapter.loadAppOpenAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void c5(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.a) {
            Qc.p.b("Requesting rewarded interstitial ad from adapter.");
            try {
                ((Sc.a) this.f73236a).loadRewardedInterstitialAd(new Sc.o((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, null), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), ""), new C7500am(this, interfaceC6835Il));
                return;
            } catch (Exception e10) {
                C10168zl.a(bVar, e10, "adapter.loadRewardedInterstitialAd");
                throw new RemoteException();
            }
        }
        Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void d0(boolean z10) throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.r) {
            try {
                ((Sc.r) obj).onImmersiveModeUpdated(z10);
                return;
            } catch (Throwable th2) {
                Qc.p.e("", th2);
                return;
            }
        }
        Qc.p.b(Sc.r.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void d9(com.google.android.gms.dynamic.b bVar, Mc.d2 d2Var, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Object obj = this.f73236a;
        if (!(obj instanceof Sc.a)) {
            Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Qc.p.b("Requesting interscroller ad from adapter.");
        try {
            Sc.a aVar = (Sc.a) this.f73236a;
            aVar.loadInterscrollerAd(new Sc.h((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), Ec.t.e(d2Var.f19217e, d2Var.f19214b), ""), new C7208Tl(this, interfaceC6835Il, aVar));
        } catch (Exception e10) {
            Qc.p.e("", e10);
            C10168zl.a(bVar, e10, "adapter.loadInterscrollerAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void e4(Mc.Y1 y12, String str, String str2) throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.a) {
            t1(this.f73239d, y12, str, new BinderC7926em((Sc.a) obj, this.f73238c));
            return;
        }
        Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void g() throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof MediationInterstitialAdapter) {
            Qc.p.b("Showing interstitial from adapter.");
            try {
                ((MediationInterstitialAdapter) this.f73236a).showInterstitial();
                return;
            } catch (Throwable th2) {
                Qc.p.e("", th2);
                throw new RemoteException();
            }
        }
        Qc.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void g9(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, String str2, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Object obj = this.f73236a;
        if (!(obj instanceof MediationInterstitialAdapter) && !(obj instanceof Sc.a)) {
            Qc.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Qc.p.b("Requesting interstitial ad from adapter.");
        Object obj2 = this.f73236a;
        if (!(obj2 instanceof MediationInterstitialAdapter)) {
            if (obj2 instanceof Sc.a) {
                try {
                    ((Sc.a) obj2).loadInterstitialAd(new Sc.k((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, str2), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), this.f73242g), new C7340Xl(this, interfaceC6835Il));
                    return;
                } catch (Throwable th2) {
                    Qc.p.e("", th2);
                    C10168zl.a(bVar, th2, "adapter.loadInterstitialAd");
                    throw new RemoteException();
                }
            }
            return;
        }
        try {
            MediationInterstitialAdapter mediationInterstitialAdapter = (MediationInterstitialAdapter) obj2;
            List list = y12.f19171e;
            HashSet hashSet = list != null ? new HashSet(list) : null;
            long j10 = y12.f19168b;
            C7174Sl c7174Sl = new C7174Sl(j10 == -1 ? null : new Date(j10), y12.f19170d, hashSet, y12.f19177k, D9(y12), y12.f19173g, y12.f19184r, y12.f19186t, E9(str, y12));
            Bundle bundle = y12.f19179m;
            mediationInterstitialAdapter.requestInterstitialAd((Context) com.google.android.gms.dynamic.d.b2(bVar), new C7820dm(interfaceC6835Il), C9(str, y12, str2), c7174Sl, bundle != null ? bundle.getBundle(mediationInterstitialAdapter.getClass().getName()) : null);
        } catch (Throwable th3) {
            Qc.p.e("", th3);
            C10168zl.a(bVar, th3, "adapter.requestInterstitialAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void l() throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.a) {
            Qc.p.d("Can not show null mediated rewarded ad.");
            throw new RemoteException();
        }
        Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void t1(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC6835Il interfaceC6835Il) throws RemoteException {
        Object obj = this.f73236a;
        if (!(obj instanceof Sc.a)) {
            Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
            throw new RemoteException();
        }
        Qc.p.b("Requesting rewarded ad from adapter.");
        try {
            ((Sc.a) this.f73236a).loadRewardedAd(new Sc.o((Context) com.google.android.gms.dynamic.d.b2(bVar), "", C9(str, y12, null), B9(y12), D9(y12), y12.f19177k, y12.f19173g, y12.f19186t, E9(str, y12), ""), new C7500am(this, interfaceC6835Il));
        } catch (Exception e10) {
            Qc.p.e("", e10);
            C10168zl.a(bVar, e10, "adapter.loadRewardedAd");
            throw new RemoteException();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void u9(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Object obj = this.f73236a;
        if ((obj instanceof Sc.a) || (obj instanceof MediationInterstitialAdapter)) {
            if (obj instanceof MediationInterstitialAdapter) {
                g();
                return;
            } else {
                Qc.p.b("Show interstitial ad from adapter.");
                Qc.p.d("Can not show null mediation interstitial ad.");
                throw new RemoteException();
            }
        }
        Qc.p.g(MediationInterstitialAdapter.class.getCanonicalName() + " or " + Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void v6(com.google.android.gms.dynamic.b bVar, Mc.Y1 y12, String str, InterfaceC7244Uo interfaceC7244Uo, String str2) throws RemoteException {
        Object obj = this.f73236a;
        if ((obj instanceof Sc.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            this.f73239d = bVar;
            this.f73238c = interfaceC7244Uo;
            interfaceC7244Uo.zzl(com.google.android.gms.dynamic.d.F2(this.f73236a));
            return;
        }
        Object obj2 = this.f73236a;
        Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0070  */
    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void y6(com.google.android.gms.dynamic.b r6, com.google.android.gms.internal.ads.InterfaceC6968Mj r7, java.util.List r8) throws android.os.RemoteException {
        /*
            r5 = this;
            java.lang.Object r0 = r5.f73236a
            boolean r0 = r0 instanceof Sc.a
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
            com.google.android.gms.internal.ads.Sj r1 = (com.google.android.gms.internal.ads.C7172Sj) r1
            java.lang.String r2 = r1.f70149a
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
            com.google.android.gms.internal.ads.bf r2 = com.google.android.gms.internal.ads.C8659lf.f76024Jb
            com.google.android.gms.internal.ads.jf r4 = Mc.A.c()
            java.lang.Object r2 = r4.a(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L9c
            Ec.b r3 = Ec.b.APP_OPEN_AD
            goto L9c
        L8b:
            Ec.b r3 = Ec.b.APP_OPEN_AD
            goto L9c
        L8e:
            Ec.b r3 = Ec.b.NATIVE
            goto L9c
        L91:
            Ec.b r3 = Ec.b.REWARDED_INTERSTITIAL
            goto L9c
        L94:
            Ec.b r3 = Ec.b.REWARDED
            goto L9c
        L97:
            Ec.b r3 = Ec.b.INTERSTITIAL
            goto L9c
        L9a:
            Ec.b r3 = Ec.b.BANNER
        L9c:
            if (r3 == 0) goto L14
            Sc.j r2 = new Sc.j
            android.os.Bundle r1 = r1.f70150b
            r2.<init>(r3, r1)
            r7.add(r2)
            goto L14
        Laa:
            java.lang.Object r8 = r5.f73236a
            Sc.a r8 = (Sc.a) r8
            java.lang.Object r6 = com.google.android.gms.dynamic.d.b2(r6)
            android.content.Context r6 = (android.content.Context) r6
            r8.initialize(r6, r0, r7)
            return
        Lb8:
            android.os.RemoteException r6 = new android.os.RemoteException
            r6.<init>()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.BinderC7713cm.y6(com.google.android.gms.dynamic.b, com.google.android.gms.internal.ads.Mj, java.util.List):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void zzF() throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.f) {
            try {
                ((Sc.f) obj).onResume();
            } catch (Throwable th2) {
                Qc.p.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final boolean zzN() throws RemoteException {
        Object obj = this.f73236a;
        if ((obj instanceof Sc.a) || Objects.equals(obj.getClass().getCanonicalName(), "com.google.ads.mediation.admob.AdMobAdapter")) {
            return this.f73238c != null;
        }
        Object obj2 = this.f73236a;
        Qc.p.g(Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj2.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final Bundle zze() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final Bundle zzf() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final Bundle zzg() {
        return new Bundle();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final Mc.Y0 zzh() {
        Object obj = this.f73236a;
        if (obj instanceof Sc.t) {
            try {
                return ((Sc.t) obj).getVideoController();
            } catch (Throwable th2) {
                Qc.p.e("", th2);
            }
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final InterfaceC9198qh zzi() {
        C9304rh c9304rhU;
        C7820dm c7820dm = this.f73237b;
        if (c7820dm == null || (c9304rhU = c7820dm.u()) == null) {
            return null;
        }
        return c9304rhU.a();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final InterfaceC7106Ql zzk() {
        Sc.s sVar;
        Sc.s sVarT;
        Object obj = this.f73236a;
        if (!(obj instanceof MediationNativeAdapter)) {
            if (!(obj instanceof Sc.a) || (sVar = this.f73241f) == null) {
                return null;
            }
            return new BinderC8140gm(sVar);
        }
        C7820dm c7820dm = this.f73237b;
        if (c7820dm == null || (sVarT = c7820dm.t()) == null) {
            return null;
        }
        return new BinderC8140gm(sVarT);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C7005Nm zzl() {
        Object obj = this.f73236a;
        if (!(obj instanceof Sc.a)) {
            return null;
        }
        ((Sc.a) obj).getVersionInfo();
        return C7005Nm.B(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final C7005Nm zzm() {
        Object obj = this.f73236a;
        if (!(obj instanceof Sc.a)) {
            return null;
        }
        ((Sc.a) obj).getSDKVersionInfo();
        return C7005Nm.B(null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final com.google.android.gms.dynamic.b zzn() throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof MediationBannerAdapter) {
            try {
                return com.google.android.gms.dynamic.d.F2(((MediationBannerAdapter) obj).getBannerView());
            } catch (Throwable th2) {
                Qc.p.e("", th2);
                throw new RemoteException();
            }
        }
        if (obj instanceof Sc.a) {
            return com.google.android.gms.dynamic.d.F2(this.f73240e);
        }
        Qc.p.g(MediationBannerAdapter.class.getCanonicalName() + " or " + Sc.a.class.getCanonicalName() + " #009 Class mismatch: " + obj.getClass().getCanonicalName());
        throw new RemoteException();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void zzo() throws RemoteException {
        Object obj = this.f73236a;
        if (obj instanceof Sc.f) {
            try {
                ((Sc.f) obj).onDestroy();
            } catch (Throwable th2) {
                Qc.p.e("", th2);
                throw new RemoteException();
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC6733Fl
    public final void m5(com.google.android.gms.dynamic.b bVar) throws RemoteException {
        Context context = (Context) com.google.android.gms.dynamic.d.b2(bVar);
        Object obj = this.f73236a;
        if (obj instanceof Sc.q) {
            ((Sc.q) obj).a(context);
        }
    }
}
