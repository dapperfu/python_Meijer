package com.google.android.gms.ads.mediation.customevent;

import Gc.e;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public interface CustomEventBanner extends Vc.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestBannerAd(Context context, Vc.b bVar, String str, e eVar, Uc.e eVar2, Bundle bundle);
}
