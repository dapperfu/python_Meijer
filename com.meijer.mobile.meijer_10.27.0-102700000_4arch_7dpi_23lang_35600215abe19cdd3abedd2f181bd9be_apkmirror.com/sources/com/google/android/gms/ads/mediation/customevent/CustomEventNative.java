package com.google.android.gms.ads.mediation.customevent;

import Sc.p;
import Tc.d;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public interface CustomEventNative extends Tc.a {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, d dVar, String str, p pVar, Bundle bundle);
}
