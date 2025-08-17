package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzav extends zzcj {
    private final long currentTime;
    private final long duration;
    private final String timeUnit;

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcj
    public long currentTime() {
        return this.currentTime;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcj
    public long duration() {
        return this.duration;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcj) {
            zzcj zzcjVar = (zzcj) obj;
            if (this.currentTime == zzcjVar.currentTime() && this.duration == zzcjVar.duration() && this.timeUnit.equals(zzcjVar.timeUnit())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcj
    public String timeUnit() {
        return this.timeUnit;
    }

    public int hashCode() {
        long j10 = this.duration;
        long j11 = this.currentTime;
        return ((((int) (j10 ^ (j10 >>> 32))) ^ ((((int) (j11 ^ (j11 >>> 32))) ^ 1000003) * 1000003)) * 1000003) ^ this.timeUnit.hashCode();
    }

    public String toString() {
        return "TimeUpdateData{currentTime=" + this.currentTime + ", duration=" + this.duration + ", timeUnit=" + this.timeUnit + "}";
    }

    zzav(long j10, long j11, String str) {
        this.currentTime = j10;
        this.duration = j11;
        if (str != null) {
            this.timeUnit = str;
            return;
        }
        throw new NullPointerException("Null timeUnit");
    }
}
