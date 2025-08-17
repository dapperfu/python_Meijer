package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.google.android.gms.internal.ads.ka0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8543ka0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8650la0 f75672a;

    C8543ka0(C8650la0 c8650la0) {
        this.f75672a = c8650la0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f75672a.s(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f75672a.s(false);
    }
}
