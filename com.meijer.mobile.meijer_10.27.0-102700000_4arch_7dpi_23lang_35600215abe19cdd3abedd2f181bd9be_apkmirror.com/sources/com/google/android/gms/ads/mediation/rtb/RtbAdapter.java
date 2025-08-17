package com.google.android.gms.ads.mediation.rtb;

import Sc.a;
import Sc.d;
import Sc.g;
import Sc.h;
import Sc.k;
import Sc.m;
import Sc.o;
import Sc.s;
import Uc.b;
import android.os.RemoteException;

/* loaded from: classes4.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(Uc.a aVar, b bVar);

    public void loadRtbAppOpenAd(g gVar, d<Object, Object> dVar) {
        loadAppOpenAd(gVar, dVar);
    }

    public void loadRtbBannerAd(h hVar, d<Object, Object> dVar) {
        loadBannerAd(hVar, dVar);
    }

    @Deprecated
    public void loadRtbInterscrollerAd(h hVar, d<Object, Object> dVar) {
        dVar.a(new Ec.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(k kVar, d<Object, Object> dVar) {
        loadInterstitialAd(kVar, dVar);
    }

    @Deprecated
    public void loadRtbNativeAd(m mVar, d<s, Object> dVar) {
        loadNativeAd(mVar, dVar);
    }

    public void loadRtbNativeAdMapper(m mVar, d<Object, Object> dVar) throws RemoteException {
        loadNativeAdMapper(mVar, dVar);
    }

    public void loadRtbRewardedAd(o oVar, d<Object, Object> dVar) {
        loadRewardedAd(oVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(o oVar, d<Object, Object> dVar) {
        loadRewardedInterstitialAd(oVar, dVar);
    }
}
