package com.google.android.gms.internal.ads;

import android.telephony.TelephonyCallback;
import android.telephony.TelephonyDisplayInfo;

/* renamed from: com.google.android.gms.internal.ads.bO, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7571bO extends TelephonyCallback implements TelephonyCallback.DisplayInfoListener {

    /* renamed from: a, reason: collision with root package name */
    private final EP f72800a;

    public C7571bO(EP ep2) {
        this.f72800a = ep2;
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
        EP ep2 = this.f72800a;
        if (true == z10) {
            i10 = 10;
        }
        EP.c(ep2, i10);
    }
}
