package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import Ee.O;
import java.util.Set;

/* loaded from: classes6.dex */
final class zzbpg {
    final int zza;
    final long zzb;
    final Set zzc;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbpg.class == obj.getClass()) {
            zzbpg zzbpgVar = (zzbpg) obj;
            if (this.zza == zzbpgVar.zza && this.zzb == zzbpgVar.zzb && l.a(this.zzc, zzbpgVar.zzc)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return l.b(Integer.valueOf(this.zza), Long.valueOf(this.zzb), this.zzc);
    }

    zzbpg(int i10, long j10, Set set) {
        this.zza = i10;
        this.zzb = j10;
        this.zzc = O.s(set);
    }

    public final String toString() {
        return j.c(this).b("maxAttempts", this.zza).c("hedgingDelayNanos", this.zzb).d("nonFatalStatusCodes", this.zzc).toString();
    }
}
