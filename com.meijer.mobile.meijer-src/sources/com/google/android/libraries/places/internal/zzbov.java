package com.google.android.libraries.places.internal;

import De.j;
import De.p;

/* loaded from: classes6.dex */
class zzbov extends zzbjf {
    private final zzbjf zza;

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final String zza() {
        return this.zza.zza();
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public void zzb(zzbjb zzbjbVar) {
        this.zza.zzb(zzbjbVar);
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public void zzc() {
        this.zza.zzc();
    }

    @Override // com.google.android.libraries.places.internal.zzbjf
    public final void zzd() {
        this.zza.zzd();
    }

    zzbov(zzbjf zzbjfVar) {
        p.r(zzbjfVar, "delegate can not be null");
        this.zza = zzbjfVar;
    }

    public final String toString() {
        return j.c(this).d("delegate", this.zza).toString();
    }
}
