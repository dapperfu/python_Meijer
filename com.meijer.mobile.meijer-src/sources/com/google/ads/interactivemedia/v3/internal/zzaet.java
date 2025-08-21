package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzaet implements zzafu {
    private static final zzaez zza = new zzaer();
    private final zzaez zzb;

    public zzaet() {
        zzadt zzadtVarZza = zzadt.zza();
        int i10 = zzafi.zza;
        zzaes zzaesVar = new zzaes(zzadtVarZza, zza);
        byte[] bArr = zzaee.zzb;
        this.zzb = zzaesVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzafu
    public final zzaft zza(Class cls) {
        int i10 = zzafv.zza;
        if (!zzady.class.isAssignableFrom(cls)) {
            int i11 = zzafi.zza;
        }
        zzaey zzaeyVarZzb = this.zzb.zzb(cls);
        if (zzaeyVarZzb.zzb()) {
            int i12 = zzafi.zza;
            return zzaff.zzc(zzafv.zzm(), zzadn.zza(), zzaeyVarZzb.zza());
        }
        int i13 = zzafi.zza;
        return zzafe.zzm(cls, zzaeyVarZzb, zzafh.zza(), zzaep.zza(), zzafv.zzm(), zzaeyVarZzb.zzc() + (-1) != 1 ? zzadn.zza() : null, zzaex.zza());
    }
}
