package com.google.android.gms.ads.mediation.customevent;

import Uc.p;
import Vc.d;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public interface CustomEventNative extends Vc.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, p pVar, Bundle bundle);
}
