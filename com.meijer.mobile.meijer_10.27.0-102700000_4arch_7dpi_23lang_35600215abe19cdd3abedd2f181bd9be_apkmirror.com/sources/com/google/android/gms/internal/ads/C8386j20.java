package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.telephony.TelephonyManager;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.gms.internal.ads.j20, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8386j20 implements T10 {

    /* renamed from: a, reason: collision with root package name */
    private final Xj0 f75323a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f75324b;

    public C8386j20(Xj0 xj0, Context context) {
        this.f75323a = xj0;
        this.f75324b = context;
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final int zza() {
        return 39;
    }

    final /* synthetic */ C8174h20 a() throws Exception {
        boolean zIsActiveNetworkMetered;
        int i10;
        TelephonyManager telephonyManager = (TelephonyManager) this.f75324b.getSystemService("phone");
        String networkOperator = telephonyManager.getNetworkOperator();
        int phoneType = telephonyManager.getPhoneType();
        Lc.v.t();
        int i11 = -1;
        if (Pc.D0.b(this.f75324b, "android.permission.ACCESS_NETWORK_STATE")) {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.f75324b.getSystemService("connectivity");
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            if (activeNetworkInfo != null) {
                int type = activeNetworkInfo.getType();
                int iOrdinal = activeNetworkInfo.getDetailedState().ordinal();
                i10 = type;
                i11 = iOrdinal;
            } else {
                i10 = -1;
            }
            zIsActiveNetworkMetered = connectivityManager.isActiveNetworkMetered();
        } else {
            zIsActiveNetworkMetered = false;
            i10 = -2;
        }
        return new C8174h20(networkOperator, i10, Lc.v.u().k(this.f75324b), phoneType, zIsActiveNetworkMetered, i11);
    }

    @Override // com.google.android.gms.internal.ads.T10
    public final com.google.common.util.concurrent.q zzb() {
        return this.f75323a.i0(new Callable() { // from class: com.google.android.gms.internal.ads.i20
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return this.f74867a.a();
            }
        });
    }
}
