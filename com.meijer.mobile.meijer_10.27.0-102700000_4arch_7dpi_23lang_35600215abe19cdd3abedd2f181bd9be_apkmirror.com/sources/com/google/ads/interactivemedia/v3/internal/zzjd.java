package com.google.ads.interactivemedia.v3.internal;

import android.view.View;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzjd implements zzpg {
    private final zznv zza;
    private final zzok zzb;
    private final zzjq zzc;
    private final zzjc zzd;
    private final zzim zze;
    private final zzjs zzf;
    private final zzjk zzg;
    private final zzjb zzh;

    zzjd(zznv zznvVar, zzok zzokVar, zzjq zzjqVar, zzjc zzjcVar, zzim zzimVar, zzjs zzjsVar, zzjk zzjkVar, zzjb zzjbVar) {
        this.zza = zznvVar;
        this.zzb = zzokVar;
        this.zzc = zzjqVar;
        this.zzd = zzjcVar;
        this.zze = zzimVar;
        this.zzf = zzjsVar;
        this.zzg = zzjkVar;
        this.zzh = zzjbVar;
    }

    private final Map zze() {
        HashMap map = new HashMap();
        zznv zznvVar = this.zza;
        zzbp zzbpVarZzb = this.zzb.zzb();
        map.put("v", zznvVar.zzd());
        map.put("gms", Boolean.valueOf(this.zza.zzg()));
        map.put("int", zzbpVarZzb.zzg());
        map.put("up", Boolean.valueOf(this.zzd.zza()));
        map.put("t", new Throwable());
        zzjk zzjkVar = this.zzg;
        if (zzjkVar != null) {
            map.put("tcq", Long.valueOf(zzjkVar.zzc()));
            map.put("tpq", Long.valueOf(this.zzg.zzg()));
            map.put("tcv", Long.valueOf(this.zzg.zzd()));
            map.put("tpv", Long.valueOf(this.zzg.zzh()));
            map.put("tchv", Long.valueOf(this.zzg.zzb()));
            map.put("tphv", Long.valueOf(this.zzg.zzf()));
            map.put("tcc", Long.valueOf(this.zzg.zza()));
            map.put("tpc", Long.valueOf(this.zzg.zze()));
        }
        return map;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpg
    public final Map zza() {
        zzjq zzjqVar = this.zzc;
        Map mapZze = zze();
        mapZze.put("lts", Long.valueOf(zzjqVar.zza()));
        return mapZze;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpg
    public final Map zzc() {
        zzjb zzjbVar = this.zzh;
        Map mapZze = zze();
        if (zzjbVar != null) {
            mapZze.put("vst", zzjbVar.zza());
        }
        return mapZze;
    }

    final void zzd(View view) {
        this.zzc.zzd(view);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzpg
    public final Map zzb() {
        Map mapZze = zze();
        zzbp zzbpVarZza = this.zzb.zza();
        mapZze.put("gai", Boolean.valueOf(this.zza.zzh()));
        mapZze.put("did", zzbpVarZza.zzf());
        mapZze.put("dst", Integer.valueOf(zzbpVarZza.zzal() - 1));
        mapZze.put("doo", Boolean.valueOf(zzbpVarZza.zzai()));
        zzim zzimVar = this.zze;
        if (zzimVar != null) {
            mapZze.put("nt", Long.valueOf(zzimVar.zza()));
        }
        zzjs zzjsVar = this.zzf;
        if (zzjsVar != null) {
            mapZze.put("vs", Long.valueOf(zzjsVar.zzc()));
            mapZze.put("vf", Long.valueOf(this.zzf.zzb()));
        }
        return mapZze;
    }
}
