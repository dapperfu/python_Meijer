package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdsManager;
import com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent;
import com.google.ads.interactivemedia.v3.api.StreamManager;

/* loaded from: classes4.dex */
public final class zzaa implements AdsManagerLoadedEvent {
    private final AdsManager zza;
    private final StreamManager zzb;
    private final Object zzc;

    zzaa(AdsManager adsManager, Object obj) {
        this.zza = adsManager;
        this.zzb = null;
        this.zzc = obj;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final AdsManager getAdsManager() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final StreamManager getStreamManager() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdsManagerLoadedEvent
    public final Object getUserRequestContext() {
        return this.zzc;
    }

    zzaa(StreamManager streamManager, Object obj) {
        this.zza = null;
        this.zzb = streamManager;
        this.zzc = obj;
    }
}
