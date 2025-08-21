package com.google.android.gms.ads.mediation.customevent;

import Gc.e;
import Sc.p;
import Uc.i;
import Uc.l;
import Uc.n;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationNativeAdapter;
import com.google.android.gms.common.annotation.KeepName;

@KeepName
/* loaded from: classes4.dex */
public final class CustomEventAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, MediationNativeAdapter {

    /* renamed from: e, reason: collision with root package name */
    static final Gc.a f65481e = new Gc.a(0, "Could not instantiate custom event adapter", "com.google.android.gms.ads");

    /* renamed from: a, reason: collision with root package name */
    private View f65482a;

    /* renamed from: b, reason: collision with root package name */
    CustomEventBanner f65483b;

    /* renamed from: c, reason: collision with root package name */
    CustomEventInterstitial f65484c;

    /* renamed from: d, reason: collision with root package name */
    CustomEventNative f65485d;

    private static Object a(Class cls, String str) {
        try {
            if (str != null) {
                return cls.cast(Class.forName(str).getDeclaredConstructor(null).newInstance(null));
            }
            throw null;
        } catch (Throwable th2) {
            p.g("Could not instantiate custom event adapter: " + str + ". " + th2.getMessage());
            return null;
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.f65482a;
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Uc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onDestroy() {
        CustomEventBanner customEventBanner = this.f65483b;
        if (customEventBanner != null) {
            customEventBanner.onDestroy();
        }
        CustomEventInterstitial customEventInterstitial = this.f65484c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onDestroy();
        }
        CustomEventNative customEventNative = this.f65485d;
        if (customEventNative != null) {
            customEventNative.onDestroy();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Uc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onPause() {
        CustomEventBanner customEventBanner = this.f65483b;
        if (customEventBanner != null) {
            customEventBanner.onPause();
        }
        CustomEventInterstitial customEventInterstitial = this.f65484c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onPause();
        }
        CustomEventNative customEventNative = this.f65485d;
        if (customEventNative != null) {
            customEventNative.onPause();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter, Uc.f, com.google.android.gms.ads.mediation.MediationInterstitialAdapter, com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void onResume() {
        CustomEventBanner customEventBanner = this.f65483b;
        if (customEventBanner != null) {
            customEventBanner.onResume();
        }
        CustomEventInterstitial customEventInterstitial = this.f65484c;
        if (customEventInterstitial != null) {
            customEventInterstitial.onResume();
        }
        CustomEventNative customEventNative = this.f65485d;
        if (customEventNative != null) {
            customEventNative.onResume();
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, i iVar, Bundle bundle, e eVar, Uc.e eVar2, Bundle bundle2) {
        CustomEventBanner customEventBanner = (CustomEventBanner) a(CustomEventBanner.class, bundle.getString("class_name"));
        this.f65483b = customEventBanner;
        if (customEventBanner == null) {
            iVar.i(this, f65481e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventBanner customEventBanner2 = this.f65483b;
        customEventBanner2.getClass();
        customEventBanner2.requestBannerAd(context, new a(this, iVar), bundle.getString("parameter"), eVar, eVar2, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, l lVar, Bundle bundle, Uc.e eVar, Bundle bundle2) {
        CustomEventInterstitial customEventInterstitial = (CustomEventInterstitial) a(CustomEventInterstitial.class, bundle.getString("class_name"));
        this.f65484c = customEventInterstitial;
        if (customEventInterstitial == null) {
            lVar.p(this, f65481e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventInterstitial customEventInterstitial2 = this.f65484c;
        customEventInterstitial2.getClass();
        customEventInterstitial2.requestInterstitialAd(context, new b(this, this, lVar), bundle.getString("parameter"), eVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationNativeAdapter
    public void requestNativeAd(Context context, n nVar, Bundle bundle, Uc.p pVar, Bundle bundle2) {
        CustomEventNative customEventNative = (CustomEventNative) a(CustomEventNative.class, bundle.getString("class_name"));
        this.f65485d = customEventNative;
        if (customEventNative == null) {
            nVar.g(this, f65481e);
            return;
        }
        Bundle bundle3 = bundle2 == null ? null : bundle2.getBundle(bundle.getString("class_name"));
        CustomEventNative customEventNative2 = this.f65485d;
        customEventNative2.getClass();
        customEventNative2.requestNativeAd(context, new c(this, nVar), bundle.getString("parameter"), pVar, bundle3);
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        CustomEventInterstitial customEventInterstitial = this.f65484c;
        if (customEventInterstitial != null) {
            customEventInterstitial.showInterstitial();
        }
    }
}
