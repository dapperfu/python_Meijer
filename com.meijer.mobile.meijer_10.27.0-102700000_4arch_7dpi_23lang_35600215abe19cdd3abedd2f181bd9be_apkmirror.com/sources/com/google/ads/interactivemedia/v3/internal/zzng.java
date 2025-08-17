package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
public final class zzng extends Exception {
    private final int zza;

    public final int zza() {
        return this.zza;
    }

    public zzng(int i10) {
        super("Signal SDK error code: " + i10);
        this.zza = i10;
    }
}
