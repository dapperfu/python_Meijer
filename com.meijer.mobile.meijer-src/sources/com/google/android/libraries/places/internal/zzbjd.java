package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import De.p;

/* loaded from: classes6.dex */
public final class zzbjd {
    private final zzbjx zza;
    private final zzbez zzb;
    private final zzbiz zzc;

    public final zzbjx zzb() {
        return this.zza;
    }

    public final zzbez zzc() {
        return this.zzb;
    }

    public final zzbiz zzd() {
        return this.zzc;
    }

    public static zzbjc zza() {
        return new zzbjc();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbjd)) {
            return false;
        }
        zzbjd zzbjdVar = (zzbjd) obj;
        return l.a(this.zza, zzbjdVar.zza) && l.a(this.zzb, zzbjdVar.zzb) && l.a(this.zzc, zzbjdVar.zzc);
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb, this.zzc);
    }

    zzbjd(zzbjx zzbjxVar, zzbez zzbezVar, zzbiz zzbizVar) {
        this.zza = zzbjxVar;
        this.zzb = (zzbez) p.r(zzbezVar, "attributes");
        this.zzc = zzbizVar;
    }

    public final String toString() {
        j.b bVarC = j.c(this);
        bVarC.d("addressesOrError", this.zza.toString());
        bVarC.d("attributes", this.zzb);
        bVarC.d("serviceConfigOrError", this.zzc);
        return bVarC.toString();
    }
}
