package com.google.android.gms.ads.mediation.customevent;

import Uc.e;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public interface CustomEventInterstitial extends Vc.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestInterstitialAd(Context context, Vc.c cVar, String str, e eVar, Bundle bundle);

    void showInterstitial();
}
