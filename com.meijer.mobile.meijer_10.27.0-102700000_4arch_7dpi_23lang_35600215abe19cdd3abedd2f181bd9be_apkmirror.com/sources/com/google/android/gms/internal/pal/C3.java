package com.google.android.gms.internal.pal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes6.dex */
final class C3 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ D3 f82501a;

    C3(D3 d32) {
        this.f82501a = d32;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (D3.class) {
            this.f82501a.f82567a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (D3.class) {
            this.f82501a.f82567a = null;
        }
    }
}
