package com.google.android.libraries.places.internal;

import Be.p;

/* loaded from: classes6.dex */
public final class zzbfz {
    private final zzbfy zza;
    private final zzbjv zzb;

    public final zzbfy zzc() {
        return this.zza;
    }

    public final zzbjv zzd() {
        return this.zzb;
    }

    public static zzbfz zza(zzbfy zzbfyVar) {
        p.e(zzbfyVar != zzbfy.TRANSIENT_FAILURE, "state is TRANSIENT_ERROR. Use forError() instead");
        return new zzbfz(zzbfyVar, zzbjv.zza);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbfz)) {
            return false;
        }
        zzbfz zzbfzVar = (zzbfz) obj;
        return this.zza.equals(zzbfzVar.zza) && this.zzb.equals(zzbfzVar.zzb);
    }

    public final int hashCode() {
        zzbjv zzbjvVar = this.zzb;
        return zzbjvVar.hashCode() ^ this.zza.hashCode();
    }

    public final String toString() {
        zzbjv zzbjvVar = this.zzb;
        if (zzbjvVar.zzj()) {
            return this.zza.toString();
        }
        String strValueOf = String.valueOf(this.zza);
        String strValueOf2 = String.valueOf(zzbjvVar);
        StringBuilder sb2 = new StringBuilder(strValueOf.length() + 1 + strValueOf2.length() + 1);
        sb2.append(strValueOf);
        sb2.append("(");
        sb2.append(strValueOf2);
        sb2.append(")");
        return sb2.toString();
    }

    private zzbfz(zzbfy zzbfyVar, zzbjv zzbjvVar) {
        this.zza = (zzbfy) p.r(zzbfyVar, "state is null");
        this.zzb = (zzbjv) p.r(zzbjvVar, "status is null");
    }

    public static zzbfz zzb(zzbjv zzbjvVar) {
        p.e(!zzbjvVar.zzj(), "The error status must not be OK");
        return new zzbfz(zzbfy.TRANSIENT_FAILURE, zzbjvVar);
    }
}
