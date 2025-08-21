package com.google.ads.interactivemedia.v3.internal;

import java.io.IOException;
import java.lang.reflect.Type;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzzc extends zzwj {
    private final zzwj zza;
    private final zzwj zzb;
    private final zzya zzc;

    public zzzc(zzzd zzzdVar, zzvr zzvrVar, Type type, zzwj zzwjVar, Type type2, zzwj zzwjVar2, zzya zzyaVar) {
        this.zza = new zzzw(zzvrVar, zzwjVar, type);
        this.zzb = new zzzw(zzvrVar, zzwjVar2, type2);
        this.zzc = zzyaVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ void write(zzace zzaceVar, Object obj) throws IOException {
        Map map = (Map) obj;
        if (map == null) {
            zzaceVar.zzg();
            return;
        }
        zzaceVar.zzc();
        for (Map.Entry entry : map.entrySet()) {
            zzaceVar.zzf(String.valueOf(entry.getKey()));
            this.zzb.write(zzaceVar, entry.getValue());
        }
        zzaceVar.zze();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzwj
    public final /* bridge */ /* synthetic */ Object read(zzacc zzaccVar) throws IOException {
        int iZzr = zzaccVar.zzr();
        if (iZzr == 9) {
            zzaccVar.zzm();
            return null;
        }
        Map map = (Map) this.zzc.zza();
        if (iZzr == 1) {
            zzaccVar.zzi();
            while (zzaccVar.zzp()) {
                zzaccVar.zzi();
                Object obj = this.zza.read(zzaccVar);
                if (map.put(obj, this.zzb.read(zzaccVar)) == null) {
                    zzaccVar.zzk();
                } else {
                    throw new zzwe("duplicate key: ".concat(String.valueOf(obj)));
                }
            }
            zzaccVar.zzk();
            return map;
        }
        zzaccVar.zzj();
        while (zzaccVar.zzp()) {
            zzxp.zza.zza(zzaccVar);
            Object obj2 = this.zza.read(zzaccVar);
            if (map.put(obj2, this.zzb.read(zzaccVar)) != null) {
                throw new zzwe("duplicate key: ".concat(String.valueOf(obj2)));
            }
        }
        zzaccVar.zzl();
        return map;
    }
}
