package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: com.google.android.gms.internal.ads.bO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7696bO extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    private final EP f73640a;

    public C7696bO(EP ep2) {
        this.f73640a = ep2;
    }

    public final void onDisplayInfoChanged(TelephonyDisplayInfo telephonyDisplayInfo) throws Throwable {
        boolean z10;
        int overrideNetworkType = telephonyDisplayInfo.getOverrideNetworkType();
        int i10 = 5;
        if (overrideNetworkType == 3 || overrideNetworkType == 4 || overrideNetworkType == 5) {
            z10 = true;
        } else {
            z10 = false;
        }
        EP ep2 = this.f73640a;
        if (true == z10) {
            i10 = 10;
        }
        EP.c(ep2, i10);
    }
}
