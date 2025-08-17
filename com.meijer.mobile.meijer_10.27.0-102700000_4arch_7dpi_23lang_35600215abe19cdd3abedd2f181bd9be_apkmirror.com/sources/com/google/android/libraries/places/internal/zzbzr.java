package com.google.android.libraries.places.internal;

import io.constructor.BuildConfig;

/* loaded from: classes6.dex */
public final class zzbzr {
    private final String zza;
    private final int zzb;
    private final String zzc;

    static int zzd(char c10) {
        if (c10 >= '0' && c10 <= '9') {
            return c10 - '0';
        }
        if (c10 >= 'a' && c10 <= 'f') {
            return c10 - 'W';
        }
        if (c10 < 'A' || c10 > 'F') {
            return -1;
        }
        return c10 - '7';
    }

    public final String toString() {
        return this.zzc;
    }

    public final String zza() {
        return this.zza;
    }

    public final int zzb() {
        return this.zzb;
    }

    public static int zzc(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals(BuildConfig.SERVICE_SCHEME) ? 443 : -1;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof zzbzr) && ((zzbzr) obj).zzc.equals(this.zzc);
    }

    public final int hashCode() {
        return this.zzc.hashCode();
    }

    /* synthetic */ zzbzr(zzbzq zzbzqVar, byte[] bArr) {
        this.zza = zzbzqVar.zzb;
        this.zzb = zzbzqVar.zzd();
        this.zzc = zzbzqVar.toString();
    }
}
