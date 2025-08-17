package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;

/* loaded from: classes6.dex */
public final class R9 {

    /* renamed from: a, reason: collision with root package name */
    private NetworkCapabilities f69791a;

    public final NetworkCapabilities b() {
        return this.f69791a;
    }

    public static R9 c(Context context) {
        if (context != null) {
            return new R9((ConnectivityManager) context.getSystemService("connectivity"));
        }
        return null;
    }

    public final long a() {
        synchronized (R9.class) {
            try {
                NetworkCapabilities networkCapabilities = this.f69791a;
                if (networkCapabilities != null) {
                    if (networkCapabilities.hasTransport(4)) {
                        return 2L;
                    }
                    if (this.f69791a.hasTransport(1)) {
                        return 1L;
                    }
                    if (this.f69791a.hasTransport(0)) {
                        return 0L;
                    }
                }
                return -1L;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    R9(ConnectivityManager connectivityManager) {
        if (connectivityManager != null) {
            try {
                connectivityManager.registerDefaultNetworkCallback(new Q9(this));
            } catch (RuntimeException unused) {
                synchronized (R9.class) {
                    this.f69791a = null;
                }
            }
        }
    }
}
