package com.google.android.libraries.places.internal;

import Be.j;
import Be.l;
import Be.p;

/* loaded from: classes6.dex */
public final class zzbht {
    private static final zzbht zza = new zzbht(null, null, zzbjv.zza, false);
    private final zzbhx zzb;
    private final zzbfm zzc = null;
    private final zzbjv zzd;
    private final boolean zze;

    public static zzbht zzd() {
        return zza;
    }

    public final zzbhx zze() {
        return this.zzb;
    }

    public final zzbjv zzf() {
        return this.zzd;
    }

    public final boolean zzg() {
        return this.zze;
    }

    public static zzbht zza(zzbhx zzbhxVar, zzbfm zzbfmVar) {
        return new zzbht((zzbhx) p.r(zzbhxVar, "subchannel"), null, zzbjv.zza, false);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbht)) {
            return false;
        }
        zzbht zzbhtVar = (zzbht) obj;
        return l.a(this.zzb, zzbhtVar.zzb) && l.a(this.zzd, zzbhtVar.zzd) && l.a(null, null) && this.zze == zzbhtVar.zze;
    }

    public final int hashCode() {
        return l.b(this.zzb, this.zzd, null, Boolean.valueOf(this.zze));
    }

    public final boolean zzh() {
        return (this.zzb == null && this.zzd.zzj()) ? false : true;
    }

    private zzbht(zzbhx zzbhxVar, zzbfm zzbfmVar, zzbjv zzbjvVar, boolean z10) {
        this.zzb = zzbhxVar;
        this.zzd = (zzbjv) p.r(zzbjvVar, "status");
        this.zze = z10;
    }

    public static zzbht zzb(zzbjv zzbjvVar) {
        p.e(!zzbjvVar.zzj(), "error status shouldn't be OK");
        return new zzbht(null, null, zzbjvVar, false);
    }

    public static zzbht zzc(zzbjv zzbjvVar) {
        p.e(!zzbjvVar.zzj(), "drop status shouldn't be OK");
        return new zzbht(null, null, zzbjvVar, true);
    }

    public final String toString() {
        return j.c(this).d("subchannel", this.zzb).d("streamTracerFactory", null).d("status", this.zzd).e("drop", this.zze).d("authority-override", null).toString();
    }
}
