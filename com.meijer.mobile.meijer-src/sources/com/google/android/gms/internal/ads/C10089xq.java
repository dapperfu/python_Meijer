package com.google.android.gms.internal.ads;

import android.net.ConnectivityManager;
import android.net.Network;

/* renamed from: com.google.android.gms.internal.ads.xq, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10089xq extends ConnectivityManager.NetworkCallback {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C6693Aq f80713a;

    C10089xq(C6693Aq c6693Aq) {
        this.f80713a = c6693Aq;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        this.f80713a.f66042o.set(true);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        this.f80713a.f66042o.set(false);
    }
}
