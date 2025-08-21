package com.google.android.libraries.places.internal;

import De.p;
import De.v;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzbvr extends zzbje {
    private final boolean zza;
    private final zzblb zzb;

    @Override // com.google.android.libraries.places.internal.zzbje
    public final zzbiz zza(Map map) {
        Object objZzc;
        zzbvk zzbvkVar;
        zzbsh zzbshVar;
        Map mapZzd;
        try {
            zzbiz zzbizVarZza = this.zzb.zza(map);
            zzbsf zzbsfVar = null;
            if (zzbizVarZza == null) {
                objZzc = null;
            } else {
                if (zzbizVarZza.zzd() != null) {
                    return zzbiz.zzb(zzbizVarZza.zzd());
                }
                objZzc = zzbizVarZza.zzc();
            }
            boolean z10 = this.zza;
            if (!z10 || map == null || (mapZzd = zzbqj.zzd(map, "retryThrottling")) == null) {
                zzbvkVar = null;
            } else {
                float fFloatValue = zzbqj.zze(mapZzd, "maxTokens").floatValue();
                float fFloatValue2 = zzbqj.zze(mapZzd, "tokenRatio").floatValue();
                p.x(fFloatValue > 0.0f, "maxToken should be greater than zero");
                p.x(fFloatValue2 > 0.0f, "tokenRatio should be greater than zero");
                zzbvkVar = new zzbvk(fFloatValue, fFloatValue2);
            }
            HashMap map2 = new HashMap();
            HashMap map3 = new HashMap();
            Map mapZzd2 = map == null ? null : zzbqj.zzd(map, "healthCheckConfig");
            List<Map> listZzb = zzbqj.zzb(map, "methodConfig");
            if (listZzb == null) {
                zzbshVar = new zzbsh(null, map2, map3, zzbvkVar, objZzc, mapZzd2);
            } else {
                for (Map map4 : listZzb) {
                    zzbsf zzbsfVar2 = new zzbsf(map4, z10, 5, 5);
                    List<Map> listZzb2 = zzbqj.zzb(map4, "name");
                    if (listZzb2 != null && !listZzb2.isEmpty()) {
                        for (Map map5 : listZzb2) {
                            String strZzg = zzbqj.zzg(map5, "service");
                            String strZzg2 = zzbqj.zzg(map5, "method");
                            if (v.b(strZzg)) {
                                p.l(v.b(strZzg2), "missing service name for method %s", strZzg2);
                                p.l(zzbsfVar == null, "Duplicate default method config in service config %s", map);
                                zzbsfVar = zzbsfVar2;
                            } else if (v.b(strZzg2)) {
                                p.l(!map3.containsKey(strZzg), "Duplicate service %s", strZzg);
                                map3.put(strZzg, zzbsfVar2);
                            } else {
                                String strZzh = zzbiu.zzh(strZzg, strZzg2);
                                p.l(!map2.containsKey(strZzh), "Duplicate method name %s", strZzh);
                                map2.put(strZzh, zzbsfVar2);
                            }
                        }
                    }
                }
                zzbshVar = new zzbsh(zzbsfVar, map2, map3, zzbvkVar, objZzc, mapZzd2);
            }
            return zzbiz.zza(zzbshVar);
        } catch (RuntimeException e10) {
            return zzbiz.zzb(zzbjv.zzc.zze("failed to parse service config").zzd(e10));
        }
    }

    public zzbvr(boolean z10, int i10, int i11, zzblb zzblbVar) {
        this.zza = z10;
        this.zzb = (zzblb) p.r(zzblbVar, "autoLoadBalancerFactory");
    }
}
