package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzafz implements Iterator {
    final /* synthetic */ zzagd zza;
    private int zzb = -1;
    private boolean zzc;
    private Iterator zzd;

    /* synthetic */ zzafz(zzagd zzagdVar, zzafy zzafyVar) {
        this.zza = zzagdVar;
    }

    @Override // java.util.Iterator
    public final /* bridge */ /* synthetic */ Object next() {
        this.zzc = true;
        int i10 = this.zzb + 1;
        this.zzb = i10;
        zzagd zzagdVar = this.zza;
        return i10 < zzagdVar.zzb ? (zzafx) zzagdVar.zza[i10] : (Map.Entry) zza().next();
    }

    private final Iterator zza() {
        if (this.zzd == null) {
            this.zzd = this.zza.zzc.entrySet().iterator();
        }
        return this.zzd;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb + 1;
        zzagd zzagdVar = this.zza;
        if (i10 >= zzagdVar.zzb) {
            return !zzagdVar.zzc.isEmpty() && zza().hasNext();
        }
        return true;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.zzc) {
            throw new IllegalStateException("remove() was called before next()");
        }
        this.zzc = false;
        this.zza.zzo();
        int i10 = this.zzb;
        zzagd zzagdVar = this.zza;
        if (i10 >= zzagdVar.zzb) {
            zza().remove();
        } else {
            this.zzb = i10 - 1;
            zzagdVar.zzm(i10);
        }
    }
}
