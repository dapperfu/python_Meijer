package com.google.ads.interactivemedia.v3.internal;

/* loaded from: classes4.dex */
final class zzaes implements zzaez {
    private final zzaez[] zza;

    zzaes(zzaez... zzaezVarArr) {
        this.zza = zzaezVarArr;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final zzaey zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzaez zzaezVar = this.zza[i10];
            if (zzaezVar.zzc(cls)) {
                return zzaezVar.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzaez
    public final boolean zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
