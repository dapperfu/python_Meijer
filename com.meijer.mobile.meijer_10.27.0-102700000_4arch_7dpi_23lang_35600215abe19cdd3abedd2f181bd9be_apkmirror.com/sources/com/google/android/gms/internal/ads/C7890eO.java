package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.eO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7890eO {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9202qj f73858a;

    C7890eO(InterfaceC9202qj interfaceC9202qj) {
        this.f73858a = interfaceC9202qj;
    }

    public final void a() throws RemoteException {
        s(new C7677cO("initialize", null));
    }

    public final void b(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("interstitial", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onAdClicked";
        this.f73858a.d(C7677cO.a(c7677cO));
    }

    public final void c(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("interstitial", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onAdClosed";
        s(c7677cO);
    }

    public final void d(long j10, int i10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("interstitial", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onAdFailedToLoad";
        c7677cO.f73165d = Integer.valueOf(i10);
        s(c7677cO);
    }

    public final void e(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("interstitial", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onAdLoaded";
        s(c7677cO);
    }

    public final void f(long j10) throws RemoteException {
        C7677cO c7677cO = new C7677cO("interstitial", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onNativeAdObjectNotAvailable";
        s(c7677cO);
    }

    public final void g(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("interstitial", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onAdOpened";
        s(c7677cO);
    }

    public final void h(long j10) throws RemoteException {
        C7677cO c7677cO = new C7677cO("creation", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "nativeObjectCreated";
        s(c7677cO);
    }

    public final void i(long j10) throws RemoteException {
        C7677cO c7677cO = new C7677cO("creation", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "nativeObjectNotCreated";
        s(c7677cO);
    }

    public final void j(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onAdClicked";
        s(c7677cO);
    }

    public final void k(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onRewardedAdClosed";
        s(c7677cO);
    }

    public final void l(long j10, InterfaceC7409Zo interfaceC7409Zo) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onUserEarnedReward";
        c7677cO.f73166e = interfaceC7409Zo.zzf();
        c7677cO.f73167f = Integer.valueOf(interfaceC7409Zo.zze());
        s(c7677cO);
    }

    public final void m(long j10, int i10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onRewardedAdFailedToLoad";
        c7677cO.f73165d = Integer.valueOf(i10);
        s(c7677cO);
    }

    public final void n(long j10, int i10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onRewardedAdFailedToShow";
        c7677cO.f73165d = Integer.valueOf(i10);
        s(c7677cO);
    }

    public final void o(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onAdImpression";
        s(c7677cO);
    }

    public final void p(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onRewardedAdLoaded";
        s(c7677cO);
    }

    public final void q(long j10) throws RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onNativeAdObjectNotAvailable";
        s(c7677cO);
    }

    public final void r(long j10) throws JSONException, RemoteException {
        C7677cO c7677cO = new C7677cO("rewarded", null);
        c7677cO.f73162a = Long.valueOf(j10);
        c7677cO.f73164c = "onRewardedAdOpened";
        s(c7677cO);
    }

    private final void s(C7677cO c7677cO) throws JSONException, RemoteException {
        String strA = C7677cO.a(c7677cO);
        Qc.p.f("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.f73858a.d(strA);
    }
}
