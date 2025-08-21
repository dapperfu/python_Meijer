package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzk extends zzb {
    private final String appState;
    private final String eventId;
    private final long nativeTime;
    private final zzbb nativeViewBounds;
    private final boolean nativeViewHidden;
    private final zzbb nativeViewVisibleBounds;
    private final double nativeVolume;
    private final String queryId;

    private zzk(String str, String str2, String str3, long j10, double d10, boolean z10, zzbb zzbbVar, zzbb zzbbVar2) {
        this.queryId = str;
        this.eventId = str2;
        this.appState = str3;
        this.nativeTime = j10;
        this.nativeVolume = d10;
        this.nativeViewHidden = z10;
        this.nativeViewBounds = zzbbVar;
        this.nativeViewVisibleBounds = zzbbVar2;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String appState() {
        return this.appState;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzb) {
            zzb zzbVar = (zzb) obj;
            if (this.queryId.equals(zzbVar.queryId()) && this.eventId.equals(zzbVar.eventId()) && this.appState.equals(zzbVar.appState()) && this.nativeTime == zzbVar.nativeTime() && Double.doubleToLongBits(this.nativeVolume) == Double.doubleToLongBits(zzbVar.nativeVolume()) && this.nativeViewHidden == zzbVar.nativeViewHidden() && this.nativeViewBounds.equals(zzbVar.nativeViewBounds()) && this.nativeViewVisibleBounds.equals(zzbVar.nativeViewVisibleBounds())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String eventId() {
        return this.eventId;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public long nativeTime() {
        return this.nativeTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public zzbb nativeViewBounds() {
        return this.nativeViewBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public boolean nativeViewHidden() {
        return this.nativeViewHidden;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public zzbb nativeViewVisibleBounds() {
        return this.nativeViewVisibleBounds;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public double nativeVolume() {
        return this.nativeVolume;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzb
    public String queryId() {
        return this.queryId;
    }

    public int hashCode() {
        int iHashCode = ((((this.queryId.hashCode() ^ 1000003) * 1000003) ^ this.eventId.hashCode()) * 1000003) ^ this.appState.hashCode();
        long jDoubleToLongBits = (Double.doubleToLongBits(this.nativeVolume) >>> 32) ^ Double.doubleToLongBits(this.nativeVolume);
        int i10 = true != this.nativeViewHidden ? 1237 : 1231;
        long j10 = this.nativeTime;
        return (((((((((iHashCode * 1000003) ^ ((int) ((j10 >>> 32) ^ j10))) * 1000003) ^ ((int) jDoubleToLongBits)) * 1000003) ^ i10) * 1000003) ^ this.nativeViewBounds.hashCode()) * 1000003) ^ this.nativeViewVisibleBounds.hashCode();
    }

    public String toString() {
        zzbb zzbbVar = this.nativeViewVisibleBounds;
        return "ActivityMonitorData{queryId=" + this.queryId + ", eventId=" + this.eventId + ", appState=" + this.appState + ", nativeTime=" + this.nativeTime + ", nativeVolume=" + this.nativeVolume + ", nativeViewHidden=" + this.nativeViewHidden + ", nativeViewBounds=" + String.valueOf(this.nativeViewBounds) + ", nativeViewVisibleBounds=" + String.valueOf(zzbbVar) + "}";
    }
}
