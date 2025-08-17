package com.google.ads.interactivemedia.v3.internal;

import java.lang.reflect.Type;
import java.util.Collection;

/* loaded from: classes4.dex */
public final class zzyp implements zzwk {
    private final zzxl zza;

    public zzyp(zzxl zzxlVar) {
        this.zza = zzxlVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwk
    public final zzwj zza(zzvr zzvrVar, zzaca zzacaVar) {
        Type typeZzd = zzacaVar.zzd();
        Class clsZzc = zzacaVar.zzc();
        if (!Collection.class.isAssignableFrom(clsZzc)) {
            return null;
        }
        Type typeZzd2 = zzwr.zzd(typeZzd, clsZzc);
        return new zzyo(zzvrVar, typeZzd2, zzvrVar.zza(zzaca.zzb(typeZzd2)), this.zza.zza(zzacaVar));
    }
}
