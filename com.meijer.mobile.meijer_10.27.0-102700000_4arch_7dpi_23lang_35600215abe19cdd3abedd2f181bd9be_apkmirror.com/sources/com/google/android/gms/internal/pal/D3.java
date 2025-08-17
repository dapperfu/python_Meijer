package com.google.android.gms.internal.pal;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes6.dex */
public final class D3 {

    /* renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f82567a;

    public final NetworkCapabilities a() {
        return this.f82567a;
    }

    D3(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new C3(this));
            } catch (RuntimeException unused) {
                synchronized (D3.class) {
                    this.f82567a = null;
                }
            }
        }
    }
}
