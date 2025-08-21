package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import De.p;
import java.util.Map;

/* loaded from: classes6.dex */
public final class zzbvx {
    private final String zza;
    private final Map zzb;

    public final String zza() {
        return this.zza;
    }

    public final Map zzb() {
        return this.zzb;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzbvx) {
            zzbvx zzbvxVar = (zzbvx) obj;
            if (this.zza.equals(zzbvxVar.zza) && this.zzb.equals(zzbvxVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb);
    }

    public zzbvx(String str, Map map) {
        this.zza = (String) p.r(str, "policyName");
        this.zzb = (Map) p.r(map, "rawConfigValue");
    }

    public final String toString() {
        return j.c(this).d("policyName", this.zza).d("rawConfigValue", this.zzb).toString();
    }
}
