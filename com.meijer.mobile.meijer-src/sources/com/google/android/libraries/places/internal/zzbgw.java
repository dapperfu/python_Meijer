package com.google.android.libraries.places.internal;

import De.j;
import De.l;
import De.p;

/* loaded from: classes6.dex */
public final class zzbgw {
    public final String zza;
    public final zzbgv zzb;
    public final long zzc;
    public final zzbhk zzd = null;
    public final zzbhk zze;

    public final boolean equals(Object obj) {
        if (obj instanceof zzbgw) {
            zzbgw zzbgwVar = (zzbgw) obj;
            if (l.a(this.zza, zzbgwVar.zza) && l.a(this.zzb, zzbgwVar.zzb) && this.zzc == zzbgwVar.zzc && l.a(null, null) && l.a(this.zze, zzbgwVar.zze)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb, Long.valueOf(this.zzc), null, this.zze);
    }

    /* synthetic */ zzbgw(String str, zzbgv zzbgvVar, long j10, zzbhk zzbhkVar, zzbhk zzbhkVar2, byte[] bArr) {
        this.zza = str;
        this.zzb = (zzbgv) p.r(zzbgvVar, "severity");
        this.zzc = j10;
        this.zze = zzbhkVar2;
    }

    public final String toString() {
        return j.c(this).d("description", this.zza).d("severity", this.zzb).c("timestampNanos", this.zzc).d("channelRef", null).d("subchannelRef", this.zze).toString();
    }
}
