package com.google.android.gms.ads.mediation;

import Ec.e;
import Sc.f;
import Sc.i;
import android.content.Context;
import android.os.Bundle;
import android.view.View;

@Deprecated
/* loaded from: classes4.dex */
public interface MediationBannerAdapter extends f {
    View getBannerView();

    @Override // Sc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onDestroy();

    @Override // Sc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onPause();

    @Override // Sc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    /* synthetic */ void onResume();

    void requestBannerAd(Context context, i iVar, Bundle bundle, e eVar, Sc.e eVar2, Bundle bundle2);
}
