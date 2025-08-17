package com.google.android.gms.ads.mediation.customevent;

import Ec.e;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public interface CustomEventBanner extends Tc.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, Tc.b bVar, String str, e eVar, Sc.e eVar2, Bundle bundle);
}
