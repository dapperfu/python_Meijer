package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class zzrd implements Iterator {
    final /* synthetic */ zzre zza;
    private int zzb;
    private int zzc = -1;
    private int zzd;
    private int zze;

    zzrd(zzre zzreVar) {
        this.zza = zzreVar;
        this.zzb = zzreVar.zzb.zzi;
        zzrf zzrfVar = zzreVar.zzb;
        this.zzd = zzrfVar.zzd;
        this.zze = zzrfVar.zzc;
    }

    private final void zza() {
        if (this.zza.zzb.zzd != this.zzd) {
            throw new ConcurrentModificationException();
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        zza();
        if (this.zzb != -2 && this.zze > 0) {
            return true;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (hasNext()) {
            Object objZza = this.zza.zza(this.zzb);
            this.zzc = this.zzb;
            this.zzb = this.zza.zzb.zzl[this.zzb];
            this.zze--;
            return objZza;
        }
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        boolean z10;
        zza();
        if (this.zzc != -1) {
            z10 = true;
        } else {
            z10 = false;
        }
        zzqh.zzi(z10, "no calls to next() since the last call to remove()");
        int i10 = this.zzc;
        zzrf zzrfVar = this.zza.zzb;
        zzrfVar.zzl(i10, zzrg.zzc(zzrfVar.zza[i10]));
        zzre zzreVar = this.zza;
        int i11 = this.zzb;
        zzrf zzrfVar2 = zzreVar.zzb;
        if (i11 == zzrfVar2.zzc) {
            this.zzb = this.zzc;
        }
        this.zzc = -1;
        this.zzd = zzrfVar2.zzd;
    }
}
