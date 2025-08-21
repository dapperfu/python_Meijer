package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import androidx.browser.customtabs.d;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;

/* loaded from: classes6.dex */
public final class zzbrw implements MediationInterstitialAdapter {

    /* renamed from: a, reason: collision with root package name */
    private Activity f81419a;

    /* renamed from: b, reason: collision with root package name */
    private Uc.l f81420b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f81421c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        Sc.p.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        Sc.p.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        Sc.p.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, Uc.l lVar, Bundle bundle, Uc.e eVar, Bundle bundle2) {
        this.f81420b = lVar;
        if (lVar == null) {
            Sc.p.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            Sc.p.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f81420b.b(this, 0);
            return;
        }
        if (!C7086Mf.g(context)) {
            Sc.p.g("Default browser does not support custom tabs. Bailing out.");
            this.f81420b.b(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            Sc.p.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f81420b.b(this, 0);
        } else {
            this.f81419a = (Activity) context;
            this.f81421c = Uri.parse(string);
            this.f81420b.q(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.d dVarA = new d.C0978d().a();
        dVarA.f47405a.setData(this.f81421c);
        Rc.D0.f32295l.post(new RunnableC7232Qm(this, new AdOverlayInfoParcel(new Qc.l(dVarA.f47405a, null), null, new C7198Pm(this), null, new Sc.a(0, 0, false), null, null, "")));
        Nc.v.s().r();
    }
}
