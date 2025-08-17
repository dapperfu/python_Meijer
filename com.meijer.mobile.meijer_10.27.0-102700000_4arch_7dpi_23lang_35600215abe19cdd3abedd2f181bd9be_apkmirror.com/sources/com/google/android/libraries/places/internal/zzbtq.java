package com.google.android.libraries.places.internal;

import Be.l;
import Be.p;

/* loaded from: classes6.dex */
public final class zzbtq extends zzbhu {
    private final zzbfd zza;
    private final zzbip zzb;
    private final zzbiu zzc;
    private final zzbhs zzd;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zzbtq.class == obj.getClass()) {
            zzbtq zzbtqVar = (zzbtq) obj;
            if (l.a(this.zza, zzbtqVar.zza) && l.a(this.zzb, zzbtqVar.zzb) && l.a(this.zzc, zzbtqVar.zzc) && l.a(this.zzd, zzbtqVar.zzd)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.zzbhu
    public final zzbfd zza() {
        return this.zza;
    }

    @Override // com.google.android.libraries.places.internal.zzbhu
    public final zzbip zzb() {
        return this.zzb;
    }

    @Override // com.google.android.libraries.places.internal.zzbhu
    public final zzbiu zzc() {
        return this.zzc;
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb, this.zzc, this.zzd);
    }

    public final String toString() {
        zzbfd zzbfdVar = this.zza;
        zzbip zzbipVar = this.zzb;
        String strValueOf = String.valueOf(this.zzc);
        String strValueOf2 = String.valueOf(zzbipVar);
        String strValueOf3 = String.valueOf(zzbfdVar);
        int length = strValueOf.length();
        StringBuilder sb2 = new StringBuilder(length + 17 + strValueOf2.length() + 13 + strValueOf3.length() + 1);
        sb2.append("[method=");
        sb2.append(strValueOf);
        sb2.append(" headers=");
        sb2.append(strValueOf2);
        sb2.append(" callOptions=");
        sb2.append(strValueOf3);
        sb2.append("]");
        return sb2.toString();
    }

    public zzbtq(zzbiu zzbiuVar, zzbip zzbipVar, zzbfd zzbfdVar, zzbhs zzbhsVar) {
        this.zzc = (zzbiu) p.r(zzbiuVar, "method");
        this.zzb = (zzbip) p.r(zzbipVar, "headers");
        this.zza = (zzbfd) p.r(zzbfdVar, "callOptions");
        this.zzd = (zzbhs) p.r(zzbhsVar, "pickDetailsConsumer");
    }
}
