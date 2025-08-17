package com.google.android.gms.ads.mediation;

import Sc.e;
import Sc.f;
import Sc.l;
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
