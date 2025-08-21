package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
public final class zzjw implements zzbep {
    private final zzbes zza;
    private final zzbes zzb;

    private zzjw(zzbes zzbesVar, zzbes zzbesVar2) {
        this.zza = zzbesVar;
        this.zzb = zzbesVar2;
    }

    public static zzjw zza(zzbes zzbesVar, zzbes zzbesVar2) {
        return new zzjw(zzbesVar, zzbesVar2);
    }

    @Override // com.google.android.libraries.places.internal.zzcbd
    public final /* bridge */ /* synthetic */ Object zzb() {
        zzbes zzbesVar = this.zzb;
        return new zzjv((zzhf) this.zza.zzb(), (zzjo) zzbesVar.zzb());
    }
}
