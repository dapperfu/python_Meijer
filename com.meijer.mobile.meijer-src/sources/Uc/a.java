package Uc;

import android.content.Context;
import android.os.RemoteException;
import java.util.List;

/* loaded from: classes4.dex */
public abstract class a {
    public abstract Gc.q getSDKVersionInfo();

    public abstract Gc.q getVersionInfo();

    public abstract void initialize(Context context, b bVar, List<j> list);

    public void loadNativeAdMapper(m mVar, d<Object, Object> dVar) throws RemoteException {
        throw new RemoteException("Method is not found");
    }

    public void loadAppOpenAd(g gVar, d<Object, Object> dVar) {
        dVar.a(new Gc.a(7, getClass().getSimpleName().concat(" does not support app open ads."), "com.google.android.gms.ads"));
    }

    public void loadBannerAd(h hVar, d<Object, Object> dVar) {
        dVar.a(new Gc.a(7, getClass().getSimpleName().concat(" does not support banner ads."), "com.google.android.gms.ads"));
    }

    @Deprecated
    public void loadInterscrollerAd(h hVar, d<Object, Object> dVar) {
        dVar.a(new Gc.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadInterstitialAd(k kVar, d<Object, Object> dVar) {
        dVar.a(new Gc.a(7, getClass().getSimpleName().concat(" does not support interstitial ads."), "com.google.android.gms.ads"));
    }

    @Deprecated
    public void loadNativeAd(m mVar, d<s, Object> dVar) {
        dVar.a(new Gc.a(7, getClass().getSimpleName().concat(" does not support native ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedAd(o oVar, d<Object, Object> dVar) {
        dVar.a(new Gc.a(7, getClass().getSimpleName().concat(" does not support rewarded ads."), "com.google.android.gms.ads"));
    }

    public void loadRewardedInterstitialAd(o oVar, d<Object, Object> dVar) {
        dVar.a(new Gc.a(7, getClass().getSimpleName().concat(" does not support rewarded interstitial ads."), "com.google.android.gms.ads"));
    }
}
