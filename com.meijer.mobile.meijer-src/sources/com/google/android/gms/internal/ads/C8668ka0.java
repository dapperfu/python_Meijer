package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.google.android.gms.internal.ads.ka0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8668ka0 extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C8775la0 f76512a;

    C8668ka0(C8775la0 c8775la0) {
        this.f76512a = c8775la0;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f76512a.s(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f76512a.s(false);
    }
}
