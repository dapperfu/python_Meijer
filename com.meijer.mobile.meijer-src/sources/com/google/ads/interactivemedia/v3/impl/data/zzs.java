package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzs extends zzbf {
    private final double end;
    private final boolean played;
    private final double start;

    zzs(double d10, double d11, boolean z10) {
        this.start = d10;
        this.end = d11;
        this.played = z10;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbf
    public double end() {
        return this.end;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzbf) {
            zzbf zzbfVar = (zzbf) obj;
            if (Double.doubleToLongBits(this.start) == Double.doubleToLongBits(zzbfVar.start()) && Double.doubleToLongBits(this.end) == Double.doubleToLongBits(zzbfVar.end()) && this.played == zzbfVar.played()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbf
    public boolean played() {
        return this.played;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzbf
    public double start() {
        return this.start;
    }

    public int hashCode() {
        return ((((((int) ((Double.doubleToLongBits(this.start) >>> 32) ^ Double.doubleToLongBits(this.start))) ^ 1000003) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.end) >>> 32) ^ Double.doubleToLongBits(this.end)))) * 1000003) ^ (true != this.played ? 1237 : 1231);
    }

    public String toString() {
        return "CuePointData{start=" + this.start + ", end=" + this.end + ", played=" + this.played + "}";
    }
}
