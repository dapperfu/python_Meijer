package com.google.ads.mediation;

import Oc.C4447y;
import Oc.Y0;
import Sc.g;
import Uc.i;
import Uc.l;
import Uc.n;
import Uc.p;
import Uc.r;
import Uc.t;
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
    protected Tc.a mInterstitialAd;

    protected abstract Bundle buildExtrasBundle(Bundle bundle, Bundle bundle2);

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    com.google.android.gms.ads.c buildAdRequest(Context context, Uc.e eVar, Bundle bundle, Bundle bundle2) {
        c.a aVar = new c.a();
        Set<String> setG = eVar.g();
        if (setG != null) {
            Iterator<String> it = setG.iterator();
            while (it.hasNext()) {
                aVar.a(it.next());
            }
        }
        if (eVar.d()) {
            C4447y.b();
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

    Tc.a getInterstitialAd() {
        return this.mInterstitialAd;
    }

    @Override // Uc.t
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

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Uc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
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

    @Override // Uc.r
    public void onImmersiveModeUpdated(boolean z10) {
        Tc.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.d(z10);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Uc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.d();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Uc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        AdView adView = this.mAdView;
        if (adView != null) {
            adView.e();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, i iVar, Bundle bundle, Gc.e eVar, Uc.e eVar2, Bundle bundle2) {
        AdView adView = new AdView(context);
        this.mAdView = adView;
        adView.setAdSize(new Gc.e(eVar.c(), eVar.a()));
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
        Tc.a aVar = this.mInterstitialAd;
        if (aVar != null) {
            aVar.e(null);
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, l lVar, Bundle bundle, Uc.e eVar, Bundle bundle2) {
        Tc.a.b(context, getAdUnitId(bundle), buildAdRequest(context, eVar, bundle2, bundle), new c(this, lVar));
    }
}
