package com.google.ads.interactivemedia.v3.impl.data;

/* loaded from: classes4.dex */
public abstract class zzco {
    public abstract zzcp build();

    public abstract zzco volume(float f10);

    public zzco volumePercentage(int i10) {
        return volume(Math.min(Math.max(i10, 0), 100) / 100.0f);
    }
}
