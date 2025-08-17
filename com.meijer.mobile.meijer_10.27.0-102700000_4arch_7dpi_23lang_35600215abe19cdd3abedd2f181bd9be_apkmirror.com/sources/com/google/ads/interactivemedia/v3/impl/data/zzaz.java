package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzaz extends zzcp {
    private final float volume;

    private zzaz(float f10) {
        this.volume = f10;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof zzcp) && Float.floatToIntBits(this.volume) == Float.floatToIntBits(((zzcp) obj).volume());
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzcp
    public float volume() {
        return this.volume;
    }

    public int hashCode() {
        return Float.floatToIntBits(this.volume) ^ 1000003;
    }

    public String toString() {
        return "VolumeUpdateData{volume=" + this.volume + "}";
    }
}
