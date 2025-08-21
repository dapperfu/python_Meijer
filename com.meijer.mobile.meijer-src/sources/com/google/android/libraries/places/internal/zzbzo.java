package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzbzo {
    private int zza;
    private final int[] zzb = new int[10];

    public final boolean zzb(int i10) {
        return ((1 << i10) & this.zza) != 0;
    }

    final int zze() {
        if ((this.zza & 2) != 0) {
            return this.zzb[1];
        }
        return -1;
    }

    final int zzf(int i10) {
        return (this.zza & 32) != 0 ? this.zzb[5] : i10;
    }

    public final zzbzo zza(int i10, int i11, int i12) {
        if (i10 >= 10) {
            return this;
        }
        this.zza = (1 << i10) | this.zza;
        this.zzb[i10] = i12;
        return this;
    }

    public final int zzc(int i10) {
        return this.zzb[i10];
    }

    final int zzd() {
        return Integer.bitCount(this.zza);
    }
}
