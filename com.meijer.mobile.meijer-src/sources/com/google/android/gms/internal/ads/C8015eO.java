package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.ads.eO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8015eO {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC9327qj f74698a;

    C8015eO(InterfaceC9327qj interfaceC9327qj) {
        this.f74698a = interfaceC9327qj;
    }

    public final void a() throws RemoteException {
        s(new C7802cO("initialize", null));
    }

    public final void b(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("interstitial", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onAdClicked";
        this.f74698a.d(C7802cO.a(c7802cO));
    }

    public final void c(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("interstitial", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onAdClosed";
        s(c7802cO);
    }

    public final void d(long j10, int i10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("interstitial", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onAdFailedToLoad";
        c7802cO.f74005d = Integer.valueOf(i10);
        s(c7802cO);
    }

    public final void e(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("interstitial", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onAdLoaded";
        s(c7802cO);
    }

    public final void f(long j10) throws RemoteException {
        C7802cO c7802cO = new C7802cO("interstitial", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onNativeAdObjectNotAvailable";
        s(c7802cO);
    }

    public final void g(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("interstitial", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onAdOpened";
        s(c7802cO);
    }

    public final void h(long j10) throws RemoteException {
        C7802cO c7802cO = new C7802cO("creation", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "nativeObjectCreated";
        s(c7802cO);
    }

    public final void i(long j10) throws RemoteException {
        C7802cO c7802cO = new C7802cO("creation", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "nativeObjectNotCreated";
        s(c7802cO);
    }

    public final void j(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onAdClicked";
        s(c7802cO);
    }

    public final void k(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onRewardedAdClosed";
        s(c7802cO);
    }

    public final void l(long j10, InterfaceC7534Zo interfaceC7534Zo) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onUserEarnedReward";
        c7802cO.f74006e = interfaceC7534Zo.zzf();
        c7802cO.f74007f = Integer.valueOf(interfaceC7534Zo.zze());
        s(c7802cO);
    }

    public final void m(long j10, int i10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onRewardedAdFailedToLoad";
        c7802cO.f74005d = Integer.valueOf(i10);
        s(c7802cO);
    }

    public final void n(long j10, int i10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onRewardedAdFailedToShow";
        c7802cO.f74005d = Integer.valueOf(i10);
        s(c7802cO);
    }

    public final void o(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onAdImpression";
        s(c7802cO);
    }

    public final void p(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onRewardedAdLoaded";
        s(c7802cO);
    }

    public final void q(long j10) throws RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onNativeAdObjectNotAvailable";
        s(c7802cO);
    }

    public final void r(long j10) throws JSONException, RemoteException {
        C7802cO c7802cO = new C7802cO("rewarded", null);
        c7802cO.f74002a = Long.valueOf(j10);
        c7802cO.f74004c = "onRewardedAdOpened";
        s(c7802cO);
    }

    private final void s(C7802cO c7802cO) throws JSONException, RemoteException {
        String strA = C7802cO.a(c7802cO);
        Sc.p.f("Dispatching AFMA event on publisher webview: ".concat(strA));
        this.f74698a.d(strA);
    }
}
