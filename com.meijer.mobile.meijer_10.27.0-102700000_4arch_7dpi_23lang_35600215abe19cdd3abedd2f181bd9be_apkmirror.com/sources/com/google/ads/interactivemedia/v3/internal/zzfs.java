package com.google.ads.interactivemedia.v3.internal;

import Td.C5233k;
import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback;

/* loaded from: classes4.dex */
final class zzfs implements SecureSignalsCollectSignalsCallback {
    final /* synthetic */ C5233k zza;
    final /* synthetic */ zzft zzb;

    zzfs(zzft zzftVar, C5233k c5233k) {
        this.zza = c5233k;
        this.zzb = zzftVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onFailure(Exception exc) {
        this.zza.d(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsCollectSignalsCallback
    public final void onSuccess(String str) {
        this.zza.e(com.google.ads.interactivemedia.v3.impl.data.zzcf.createBy3rdPartyData(this.zzb.zza.getVersion(), this.zzb.zza.getSDKVersion(), this.zzb.zze(), str));
    }
}
