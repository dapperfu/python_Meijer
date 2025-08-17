package com.google.android.libraries.places.internal;

import Be.j;
import Be.l;
import Be.p;

/* loaded from: classes6.dex */
public final class zzbjx {
    private final zzbjv zza;
    private final Object zzb;

    private zzbjx(zzbjv zzbjvVar, Object obj) {
        this.zza = zzbjvVar;
        this.zzb = obj;
    }

    public static zzbjx zza(Object obj) {
        return new zzbjx(null, obj);
    }

    public final boolean zzc() {
        return this.zza == null;
    }

    public static zzbjx zzb(zzbjv zzbjvVar) {
        zzbjx zzbjxVar = new zzbjx((zzbjv) p.r(zzbjvVar, "status"), null);
        p.l(!zzbjvVar.zzj(), "cannot use OK status: %s", zzbjvVar);
        return zzbjxVar;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbjx)) {
            return false;
        }
        zzbjx zzbjxVar = (zzbjx) obj;
        if (zzc() == zzbjxVar.zzc()) {
            return zzc() ? l.a(this.zzb, zzbjxVar.zzb) : l.a(this.zza, zzbjxVar.zza);
        }
        return false;
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb);
    }

    public final String toString() {
        zzbjv zzbjvVar = this.zza;
        j.b bVarC = j.c(this);
        if (zzbjvVar == null) {
            bVarC.d("value", this.zzb);
        } else {
            bVarC.d("error", zzbjvVar);
        }
        return bVarC.toString();
    }

    public final Object zzd() {
        if (this.zza == null) {
            return this.zzb;
        }
        throw new IllegalStateException("No value present.");
    }

    public final zzbjv zze() {
        zzbjv zzbjvVar = this.zza;
        return zzbjvVar == null ? zzbjv.zza : zzbjvVar;
    }
}
