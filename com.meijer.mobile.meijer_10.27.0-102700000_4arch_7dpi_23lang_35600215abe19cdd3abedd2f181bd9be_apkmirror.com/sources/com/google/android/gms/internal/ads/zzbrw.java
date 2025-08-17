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
    private Activity f80579a;

    /* renamed from: b, reason: collision with root package name */
    private Sc.l f80580b;

    /* renamed from: c, reason: collision with root package name */
    private Uri f80581c;

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onDestroy() {
        Qc.p.b("Destroying AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onPause() {
        Qc.p.b("Pausing AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public final void onResume() {
        Qc.p.b("Resuming AdMobCustomTabsAdapter adapter.");
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void requestInterstitialAd(Context context, Sc.l lVar, Bundle bundle, Sc.e eVar, Bundle bundle2) {
        this.f80580b = lVar;
        if (lVar == null) {
            Qc.p.g("Listener not set for mediation. Returning.");
            return;
        }
        if (!(context instanceof Activity)) {
            Qc.p.g("AdMobCustomTabs can only work with Activity context. Bailing out.");
            this.f80580b.b(this, 0);
            return;
        }
        if (!C6961Mf.g(context)) {
            Qc.p.g("Default browser does not support custom tabs. Bailing out.");
            this.f80580b.b(this, 0);
            return;
        }
        String string = bundle.getString("tab_url");
        if (TextUtils.isEmpty(string)) {
            Qc.p.g("The tab_url retrieved from mediation metadata is empty. Bailing out.");
            this.f80580b.b(this, 0);
        } else {
            this.f80579a = (Activity) context;
            this.f80581c = Uri.parse(string);
            this.f80580b.p(this);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public final void showInterstitial() {
        androidx.browser.customtabs.d dVarA = new d.C0965d().a();
        dVarA.f47181a.setData(this.f80581c);
        Pc.D0.f25081l.post(new RunnableC7107Qm(this, new AdOverlayInfoParcel(new Oc.l(dVarA.f47181a, null), null, new C7073Pm(this), null, new Qc.a(0, 0, false), null, null, "")));
        Lc.v.s().r();
    }
}
