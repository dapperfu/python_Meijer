package com.google.android.libraries.places.internal;

import Be.j;
import Be.l;
import Be.p;

/* loaded from: classes6.dex */
public final class zzbvy {
    final zzbic zza;
    final Object zzb;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbvy.class == obj.getClass()) {
            zzbvy zzbvyVar = (zzbvy) obj;
            if (l.a(this.zza, zzbvyVar.zza) && l.a(this.zzb, zzbvyVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb);
    }

    public zzbvy(zzbic zzbicVar, Object obj) {
        this.zza = (zzbic) p.r(zzbicVar, "provider");
        this.zzb = obj;
    }

    public final String toString() {
        return j.c(this).d("provider", this.zza).d("config", this.zzb).toString();
    }
}
