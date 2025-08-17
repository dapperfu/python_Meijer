package com.google.android.libraries.places.internal;

import Be.j;
import Be.l;
import Be.p;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes6.dex */
public final class zzbhw {
    private final List zza;
    private final zzbez zzb;
    private final Object zzc;

    public final List zzc() {
        return this.zza;
    }

    public final zzbez zzd() {
        return this.zzb;
    }

    public final Object zze() {
        return this.zzc;
    }

    public static zzbhv zza() {
        return new zzbhv();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzbhw)) {
            return false;
        }
        zzbhw zzbhwVar = (zzbhw) obj;
        return l.a(this.zza, zzbhwVar.zza) && l.a(this.zzb, zzbhwVar.zzb) && l.a(this.zzc, zzbhwVar.zzc);
    }

    public final int hashCode() {
        return l.b(this.zza, this.zzb, this.zzc);
    }

    public final zzbhv zzb() {
        zzbhv zzbhvVar = new zzbhv();
        zzbhvVar.zza(this.zza);
        zzbhvVar.zzb(this.zzb);
        zzbhvVar.zzc(this.zzc);
        return zzbhvVar;
    }

    /* synthetic */ zzbhw(List list, zzbez zzbezVar, Object obj, byte[] bArr) {
        this.zza = Collections.unmodifiableList(new ArrayList((Collection) p.r(list, "addresses")));
        this.zzb = (zzbez) p.r(zzbezVar, "attributes");
        this.zzc = obj;
    }

    public final String toString() {
        return j.c(this).d("addresses", this.zza).d("attributes", this.zzb).d("loadBalancingPolicyConfig", this.zzc).toString();
    }
}
