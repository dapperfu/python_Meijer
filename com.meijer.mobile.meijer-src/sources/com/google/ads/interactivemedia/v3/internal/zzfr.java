package com.google.ads.interactivemedia.v3.internal;

import com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback;

/* loaded from: classes4.dex */
final class zzfr implements SecureSignalsInitializeCallback {
    final /* synthetic */ zzft zza;

    zzfr(zzft zzftVar) {
        this.zza = zzftVar;
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onFailure(Exception exc) {
        this.zza.zzd.d(exc);
    }

    @Override // com.google.ads.interactivemedia.v3.api.signals.SecureSignalsInitializeCallback
    public final void onSuccess() {
        this.zza.zzd.e(null);
    }
}
