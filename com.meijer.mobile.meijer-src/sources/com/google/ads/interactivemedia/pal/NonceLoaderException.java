package com.google.ads.interactivemedia.pal;

/* loaded from: classes4.dex */
public final class NonceLoaderException extends Exception {
    private final int zza;

    final int zza() {
        return this.zza;
    }

    public NonceLoaderException(int i10, Exception exc) {
        super("NonceLoader exception, errorCode : " + i10, exc);
        this.zza = i10;
    }

    public static NonceLoaderException zzb(int i10) {
        return new NonceLoaderException(i10, new Exception());
    }
}
