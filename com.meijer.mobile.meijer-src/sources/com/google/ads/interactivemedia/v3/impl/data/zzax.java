package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
final class zzax extends zzco {
    private byte set$0;
    private float volume;

    zzax() {
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzco
    public zzco volume(float f10) {
        this.volume = f10;
        this.set$0 = (byte) (this.set$0 | 1);
        return this;
    }

    @Override // com.google.ads.interactivemedia.v3.impl.data.zzco
    public zzcp build() {
        if (this.set$0 == 1) {
            return new zzaz(this.volume);
        }
        throw new IllegalStateException("Missing required properties: volume");
    }
}
