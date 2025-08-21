package com.google.android.gms.ads.mediation;

import Uc.f;
import Uc.n;
import Uc.p;
import android.content.Context;
import android.os.Bundle;

@Deprecated
/* loaded from: classes4.dex */
public interface MediationNativeAdapter extends f {
    /* synthetic */ void onDestroy();

    /* synthetic */ void onPause();

    /* synthetic */ void onResume();

    void requestNativeAd(Context context, n nVar, Bundle bundle, p pVar, Bundle bundle2);
}
