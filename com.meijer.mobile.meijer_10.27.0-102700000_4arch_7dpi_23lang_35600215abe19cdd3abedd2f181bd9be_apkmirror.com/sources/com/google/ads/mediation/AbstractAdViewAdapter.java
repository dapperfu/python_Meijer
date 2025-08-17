package com.google.ads.mediation;

import Mc.C4169y;
import Mc.Y0;
import Qc.g;
import Sc.i;
import Sc.l;
import Sc.n;
import Sc.p;
import Sc.r;
import Sc.t;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.b;
import com.google.android.gms.ads.c;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes4.dex */
public abstract class AbstractAdViewAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter, r, t {
    public static final String AD_UNIT_ID_PARAMETER = "pubid";
    private com.google.android.gms.ads.b adLoader;
    protected AdView mAdView;
    protected Rc.a mInterstitialAd;

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    com.google.android.gms.ads.c buildAdRequest(Context context, Sc.e eVar, Bundle bundle, Bundle bundle2) {
        c.a aVar = new c.a();
        Set<String> setG = eVar.g();
        if (setG != null) {
            Iterator<String> it = setG.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        if (eVar.d()) {
            C4169y.b();
            aVar.d(g.A(context));
        }
        if (eVar.b() != -1) {
            aVar.f(eVar.b() == 1);
        }
        aVar.e(eVar.c());
        aVar.b(AdMobAdapter.class, buildExtrasBundle(bundle, bundle2));
        return aVar.g();
    }

    public String getAdUnitId(Bundle bundle) {
        return bundle.getString(AD_UNIT_ID_PARAMETER);
    }

    Rc.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // Sc.t
    public Y0 getVideoController() {
        AdView adView = this.mAdView;
        if (adView != null) {
            return adView.f().b();
        }
        return null;
    }

    b.a newAdLoader(Context context, String str) {
        return new b.a(context, str);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Sc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.a();
            this.mAdView = null;
        }
        if (this.mInterstitialAd != null) {
            this.mInterstitialAd = null;
        }
        if (this.adLoader != null) {
            this.adLoader = null;
        }
    }

    @Override // Sc.r
    public void onImmersiveModeUpdated(boolean z10) {
        Rc.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Sc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Sc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.e();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, i iVar, Bundle bundle, Ec.e eVar, Sc.e eVar2, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new Ec.e(eVar.c(), eVar.a()));
        this.mAdView.setAdUnitId(getAdUnitId(bundle));
        this.mAdView.setAdListener(new b(this, iVar));
        this.mAdView.c(buildAdRequest(context, eVar2, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, n nVar, Bundle bundle, p pVar, Bundle bundle2) {
        e eVar = new e(this, nVar);
        b.a aVarC = newAdLoader(context, bundle.getString(AD_UNIT_ID_PARAMETER)).c(eVar);
        aVarC.g(pVar.e());
        aVarC.d(pVar.a());
        if (pVar.f()) {
            aVarC.f(eVar);
        }
        if (pVar.zzb()) {
            for (String str : pVar.zza().keySet()) {
                aVarC.e(str, eVar, true != ((Boolean) pVar.zza().get(str)).booleanValue() ? null : eVar);
            }
        }
        com.google.android.gms.ads.b bVarA = aVarC.a();
        this.adLoader = bVarA;
        bVarA.a(buildAdRequest(context, pVar, bundle2, bundle));
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        Rc.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.e(null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, l lVar, Bundle bundle, Sc.e eVar, Bundle bundle2) {
        Rc.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new c(this, lVar));
    }
}
