package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdError;
import com.google.ads.interactivemedia.v3.api.AdErrorEvent;

/* loaded from: classes4.dex */
public final class zzd implements AdErrorEvent {
    private final AdError zza;
    private final Object zzb;

    zzd(AdError adError) {
        this.zza = adError;
        this.zzb = null;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final AdError getError() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdErrorEvent
    public final Object getUserRequestContext() {
        return this.zzb;
    }

    zzd(AdError adError, Object obj) {
        this.zza = adError;
        this.zzb = obj;
    }

    public final String toString() {
        return String.format("AdErrorEvent: [error=%s]", this.zza);
    }
}
