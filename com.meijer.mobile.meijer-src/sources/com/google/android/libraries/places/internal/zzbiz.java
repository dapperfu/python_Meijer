package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import De.p;

/* loaded from: classes6.dex */
public final class zzbiz {
    private final zzbjv zza;
    private final Object zzb;

    private zzbiz(zzbjv zzbjvVar) {
        this.zzb = null;
        this.zza = (zzbjv) p.r(zzbjvVar, "status");
        p.l(!zzbjvVar.zzj(), "cannot use OK status: %s", zzbjvVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbiz.class == obj.getClass()) {
            zzbiz zzbizVar = (zzbiz) obj;
            if (l.a(this.zza, zzbizVar.zza) && l.a(this.zzb, zzbizVar.zzb)) {
                return true;
            }
        }
        return false;
    }

    public final Object zzc() {
        return this.zzb;
    }

    public final zzbjv zzd() {
        return this.zza;
    }

    public static zzbiz zza(Object obj) {
        return new zzbiz(obj);
    }

    public static zzbiz zzb(zzbjv zzbjvVar) {
        return new zzbiz(zzbjvVar);
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb);
    }

    public final String toString() {
        Object obj = this.zzb;
        return obj != null ? j.c(this).d("config", obj).toString() : j.c(this).d("error", this.zza).toString();
    }

    private zzbiz(Object obj) {
        this.zzb = p.r(obj, "config");
        this.zza = null;
    }
}
