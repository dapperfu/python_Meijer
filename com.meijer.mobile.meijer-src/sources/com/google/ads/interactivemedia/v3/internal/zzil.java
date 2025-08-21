package com.google.ads.interactivemedia.v3.internal;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;

/* loaded from: classes4.dex */
final class zzil extends ConnectivityManager.NetworkCallback {
    final /* synthetic */ zzim zza;

    zzil(zzim zzimVar) {
        this.zza = zzimVar;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onCapabilitiesChanged(Network network, NetworkCapabilities networkCapabilities) {
        synchronized (zzim.class) {
            this.zza.zza = networkCapabilities;
        }
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        synchronized (zzim.class) {
            this.zza.zza = null;
        }
    }
}
