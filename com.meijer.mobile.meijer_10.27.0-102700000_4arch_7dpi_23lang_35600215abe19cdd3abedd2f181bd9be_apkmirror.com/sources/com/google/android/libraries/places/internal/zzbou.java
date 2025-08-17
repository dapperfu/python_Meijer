package com.google.android.libraries.places.internal;

import Be.j;

/* loaded from: classes6.dex */
class zzbou extends zzbif {
    private final zzbif zza;

    zzbou(zzbif zzbifVar) {
        this.zza = zzbifVar;
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final zzbfi zza(zzbiu zzbiuVar, zzbfd zzbfdVar) {
        return this.zza.zza(zzbiuVar, zzbfdVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbfe
    public final String zzb() {
        return this.zza.zzb();
    }

    @Override // com.google.android.libraries.places.internal.zzbif
    public zzbif zzd() {
        zzbif zzbifVar = this.zza;
        ((zzbrx) zzbifVar).zzg();
        return zzbifVar;
    }

    public final String toString() {
        return j.c(this).d("delegate", this.zza).toString();
    }
}
