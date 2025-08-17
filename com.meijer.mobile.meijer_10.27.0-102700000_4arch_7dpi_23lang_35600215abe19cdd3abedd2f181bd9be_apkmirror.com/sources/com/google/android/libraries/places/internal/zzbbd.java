package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbbd implements zzbca {
    private static final zzbbj zzb = new zzbbb();
    private final zzbbj zza;

    public zzbbd() {
        zzazx zzazxVarZza = zzazx.zza();
        int i10 = zzbbv.zza;
        zzbbc zzbbcVar = new zzbbc(zzazxVarZza, zzb);
        byte[] bArr = zzbap.zzb;
        this.zza = zzbbcVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbca
    public final zzbbz zza(Class cls) {
        int i10 = zzbcb.zza;
        if (!zzbae.class.isAssignableFrom(cls)) {
            int i11 = zzbbv.zza;
        }
        zzbbi zzbbiVarZzc = this.zza.zzc(cls);
        if (zzbbiVarZzc.zza()) {
            int i12 = zzbbv.zza;
            return zzbbp.zzj(zzbcb.zzA(), zzazs.zza(), zzbbiVarZzc.zzb());
        }
        int i13 = zzbbv.zza;
        return zzbbo.zzj(cls, zzbbiVarZzc, zzbbs.zza(), zzbaz.zza(), zzbcb.zzA(), zzbbiVarZzc.zzc() + (-1) != 1 ? zzazs.zza() : null, zzbbh.zza());
    }
}
