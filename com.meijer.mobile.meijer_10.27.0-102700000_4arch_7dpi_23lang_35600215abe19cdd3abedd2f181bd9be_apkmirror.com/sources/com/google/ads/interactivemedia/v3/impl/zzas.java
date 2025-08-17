package com.google.ads.interactivemedia.v3.impl;

import com.google.ads.interactivemedia.v3.api.CuePoint;

/* loaded from: classes4.dex */
public final class zzas implements CuePoint {
    private final double zza;
    private final double zzb;
    private final boolean zzc;

    zzas(double d10, double d11, boolean z10) {
        this.zza = d10;
        this.zzb = d11;
        this.zzc = z10;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getEndTime() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final double getStartTime() {
        return this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final boolean isPlayed() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getEndTimeMs() {
        return (long) Math.floor(this.zzb * 1000.0d);
    }

    @Override // com.google.ads.interactivemedia.v3.api.CuePoint
    public final long getStartTimeMs() {
        return (long) Math.floor(this.zza * 1000.0d);
    }
}
