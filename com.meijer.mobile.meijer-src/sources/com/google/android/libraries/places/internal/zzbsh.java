package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
final class zzbsh {
    private final zzbsf zza;
    private final Map zzb;
    private final Map zzc;
    private final zzbvk zzd;
    private final Object zze;
    private final Map zzf;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbsh.class == obj.getClass()) {
            zzbsh zzbshVar = (zzbsh) obj;
            if (l.a(this.zza, zzbshVar.zza) && l.a(this.zzb, zzbshVar.zzb) && l.a(this.zzc, zzbshVar.zzc) && l.a(this.zzd, zzbshVar.zzd) && l.a(this.zze, zzbshVar.zze)) {
                return true;
            }
        }
        return false;
    }

    final Map zza() {
        return this.zzf;
    }

    final Object zzc() {
        return this.zze;
    }

    final zzbvk zzd() {
        return this.zzd;
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb, this.zzc, this.zzd, this.zze);
    }

    final zzbhb zzb() {
        if (this.zzc.isEmpty() && this.zzb.isEmpty() && this.zza == null) {
            return null;
        }
        return new zzbsg(this, null);
    }

    final zzbsf zze(zzbiu zzbiuVar) {
        zzbsf zzbsfVar = (zzbsf) this.zzb.get(zzbiuVar.zzb());
        if (zzbsfVar == null) {
            zzbsfVar = (zzbsf) this.zzc.get(zzbiuVar.zzc());
        }
        return zzbsfVar == null ? this.zza : zzbsfVar;
    }

    zzbsh(zzbsf zzbsfVar, Map map, Map map2, zzbvk zzbvkVar, Object obj, Map map3) {
        Map mapUnmodifiableMap;
        this.zza = zzbsfVar;
        this.zzb = Collections.unmodifiableMap(new HashMap(map));
        this.zzc = Collections.unmodifiableMap(new HashMap(map2));
        this.zzd = zzbvkVar;
        this.zze = obj;
        if (map3 != null) {
            mapUnmodifiableMap = Collections.unmodifiableMap(new HashMap(map3));
        } else {
            mapUnmodifiableMap = null;
        }
        this.zzf = mapUnmodifiableMap;
    }

    public final String toString() {
        return j.c(this).d("defaultMethodConfig", this.zza).d("serviceMethodMap", this.zzb).d("serviceMap", this.zzc).d("retryThrottling", this.zzd).d("loadBalancingConfig", this.zze).toString();
    }
}
