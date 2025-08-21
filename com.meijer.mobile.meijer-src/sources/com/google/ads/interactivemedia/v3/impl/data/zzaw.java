package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzaw extends zzcn {
    private final Integer downloadBandwidthKbps;
    private final boolean rendersUiNatively;

    zzaw(Integer num, boolean z10) {
        this.downloadBandwidthKbps = num;
        this.rendersUiNatively = z10;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcn
    public Integer downloadBandwidthKbps() {
        return this.downloadBandwidthKbps;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzcn) {
            zzcn zzcnVar = (zzcn) obj;
            Integer num = this.downloadBandwidthKbps;
            if (num != null ? num.equals(zzcnVar.downloadBandwidthKbps()) : zzcnVar.downloadBandwidthKbps() == null) {
                if (this.rendersUiNatively == zzcnVar.rendersUiNatively()) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcn
    public boolean rendersUiNatively() {
        return this.rendersUiNatively;
    }

    public int hashCode() {
        Integer num = this.downloadBandwidthKbps;
        return (((num == null ? 0 : num.hashCode()) ^ 1000003) * 1000003) ^ (true != this.rendersUiNatively ? 1237 : 1231);
    }

    public String toString() {
        return "VideoEnvironmentData{downloadBandwidthKbps=" + this.downloadBandwidthKbps + ", rendersUiNatively=" + this.rendersUiNatively + "}";
    }
}
