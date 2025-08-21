package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbzm {
    private final zzbzm[] zza;
    private final int zzb;
    private final int zzc;

    zzbzm() {
        this.zza = new zzbzm[256];
        this.zzb = 0;
        this.zzc = 0;
    }

    final /* synthetic */ zzbzm[] zza() {
        return this.zza;
    }

    final /* synthetic */ int zzb() {
        return this.zzb;
    }

    final /* synthetic */ int zzc() {
        return this.zzc;
    }

    zzbzm(int i10, int i11) {
        this.zza = null;
        this.zzb = i10;
        int i12 = i11 & 7;
        this.zzc = i12 == 0 ? 8 : i12;
    }
}
