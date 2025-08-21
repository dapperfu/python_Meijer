package com.google.android.gms.ads.mediation;

import Uc.e;
import Uc.f;
import Uc.l;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public interface MediationInterstitialAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, l lVar, Bundle bundle, e eVar, Bundle bundle2);

    void showInterstitial();
}
