package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes4.dex */
public final class zzzd implements zzwk {
    private final zzxl zza;

    public zzzd(zzxl zzxlVar, boolean z10) {
        this.zza = zzxlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) throws NoSuchMethodException, SecurityException {
        zzwj zzwjVarZza;
        Type typeZzd = zzacaVar.zzd();
        Class clsZzc = zzacaVar.zzc();
        if (!Map.class.isAssignableFrom(clsZzc)) {
            return null;
        }
        Type[] typeArrZzh = zzwr.zzh(typeZzd, clsZzc);
        Type type = typeArrZzh[0];
        if (type != Boolean.TYPE && type != Boolean.class) {
            zzwjVarZza = zzvrVar.zza(zzaca.zzb(type));
        } else {
            zzwjVarZza = zzabh.zzf;
        }
        return new zzzc(this, zzvrVar, typeArrZzh[0], zzwjVarZza, typeArrZzh[1], zzvrVar.zza(zzaca.zzb(typeArrZzh[1])), this.zza.zza(zzacaVar));
    }
}
