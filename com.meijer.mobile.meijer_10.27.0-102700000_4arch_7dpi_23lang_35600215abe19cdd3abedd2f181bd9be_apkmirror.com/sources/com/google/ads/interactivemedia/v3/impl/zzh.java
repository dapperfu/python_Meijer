package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.AdProgressInfo;
import java.util.List;

/* loaded from: classes4.dex */
public final class zzh implements AdProgressInfo {
    private final double zza;
    private final double zzb;
    private final int zzc;
    private final int zzd;
    private final double zze;
    private final double zzf;

    zzh(double d10, double d11, int i10, int i11, double d12, double d13, List list) {
        this.zza = d10;
        this.zzb = d11;
        this.zzc = i10;
        this.zzd = i11;
        this.zze = d12;
        this.zzf = d13;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdBreakDuration() {
        return this.zze;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getAdPeriodDuration() {
        return this.zzf;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getAdPosition() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getCurrentTime() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final double getDuration() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.AdProgressInfo
    public final int getTotalAds() {
        return this.zzd;
    }
}
