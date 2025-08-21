package com.scandit.datacapture.core.internal.module.https;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import com.scandit.datacapture.core.internal.sdk.AppAndroidEnvironment;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes12.dex */
public final class d implements b {

    /* renamed from: a, reason: collision with root package name */
    public final ConnectivityManager f125633a;

    public d() {
        Context applicationContext = AppAndroidEnvironment.INSTANCE.getApplicationContext();
        Intrinsics.j(applicationContext, "<this>");
        Object systemService = applicationContext.getSystemService("connectivity");
        Intrinsics.h(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        ConnectivityManager connectivityManager = (ConnectivityManager) systemService;
        Intrinsics.j(connectivityManager, "connectivityManager");
        this.f125633a = connectivityManager;
    }

    public final a a() {
        Network activeNetwork = this.f125633a.getActiveNetwork();
        if (activeNetwork == null) {
            return a.f125629a;
        }
        NetworkCapabilities networkCapabilities = this.f125633a.getNetworkCapabilities(activeNetwork);
        return networkCapabilities == null ? a.f125629a : networkCapabilities.hasTransport(0) ? a.f125630b : a.f125631c;
    }

    public final String toString() {
        return "RealConnectivity@" + hashCode();
    }
}
