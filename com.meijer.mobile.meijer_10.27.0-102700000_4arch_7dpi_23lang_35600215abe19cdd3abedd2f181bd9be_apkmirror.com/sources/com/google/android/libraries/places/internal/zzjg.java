package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzjg implements zzbep {
    private final zzbes zza;
    private final zzbes zzb;

    private zzjg(zzbes zzbesVar, zzbes zzbesVar2) {
        this.zza = zzbesVar;
        this.zzb = zzbesVar2;
    }

    public static zzjg zza(zzbes zzbesVar, zzbes zzbesVar2) {
        return new zzjg(zzbesVar, zzbesVar2);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzjf(((zzmi) this.zza).zzb(), (zzbif) this.zzb.zzb());
    }
}
