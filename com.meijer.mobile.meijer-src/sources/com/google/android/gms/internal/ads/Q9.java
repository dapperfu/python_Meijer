package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes6.dex */
final class Q9 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ R9 f70356a;

    Q9(R9 r92) {
        this.f70356a = r92;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (R9.class) {
            this.f70356a.f70631a = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (R9.class) {
            this.f70356a.f70631a = null;
        }
    }
}
