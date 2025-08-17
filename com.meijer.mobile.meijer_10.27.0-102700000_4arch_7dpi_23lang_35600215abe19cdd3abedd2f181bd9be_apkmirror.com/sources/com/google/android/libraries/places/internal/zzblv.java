package com.google.android.libraries.places.internal;

import Be.l;
import Be.p;

/* loaded from: classes6.dex */
public final class zzblv {
    private String zza = "unknown-authority";
    private zzbez zzb = zzbez.zza;
    private String zzc;
    private zzbgt zzd;

    public final String zza() {
        return this.zza;
    }

    public final zzbez zzc() {
        return this.zzb;
    }

    public final String zze() {
        return this.zzc;
    }

    public final zzblv zzf(String str) {
        this.zzc = str;
        return this;
    }

    public final zzbgt zzg() {
        return this.zzd;
    }

    public final zzblv zzh(zzbgt zzbgtVar) {
        this.zzd = zzbgtVar;
        return this;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzblv)) {
            return false;
        }
        zzblv zzblvVar = (zzblv) obj;
        return this.zza.equals(zzblvVar.zza) && this.zzb.equals(zzblvVar.zzb) && l.a(this.zzc, zzblvVar.zzc) && l.a(this.zzd, zzblvVar.zzd);
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final zzblv zzb(String str) {
        this.zza = (String) p.r(str, "authority");
        return this;
    }

    public final zzblv zzd(zzbez zzbezVar) {
        p.r(zzbezVar, "eagAttributes");
        this.zzb = zzbezVar;
        return this;
    }
}
