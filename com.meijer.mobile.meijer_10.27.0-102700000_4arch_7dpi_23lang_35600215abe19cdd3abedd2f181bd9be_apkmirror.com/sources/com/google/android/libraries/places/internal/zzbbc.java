package com.google.android.libraries.places.internal;

/* loaded from: classes6.dex */
final class zzbbc implements zzbbj {
    private final zzbbj[] zza;

    zzbbc(zzbbj... zzbbjVarArr) {
        this.zza = zzbbjVarArr;
    }

    @Override // com.google.android.libraries.places.internal.zzbbj
    public final boolean zzb(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            if (this.zza[i10].zzb(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbbj
    public final zzbbi zzc(Class cls) {
        for (int i10 = 0; i10 < 2; i10++) {
            zzbbj zzbbjVar = this.zza[i10];
            if (zzbbjVar.zzb(cls)) {
                return zzbbjVar.zzc(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
