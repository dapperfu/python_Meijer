package com.google.ads.interactivemedia.v3.internal;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
abstract class zzxw implements Iterator {
    zzxx zza;
    zzxx zzb = null;
    int zzc;
    final /* synthetic */ zzxy zzd;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zza != this.zzd.zzd;
    }

    zzxw(zzxy zzxyVar) {
        this.zzd = zzxyVar;
        this.zza = zzxyVar.zzd.zzd;
        this.zzc = zzxyVar.zzc;
    }

    @Override // java.util.Iterator
    public final void remove() {
        zzxx zzxxVar = this.zzb;
        if (zzxxVar == null) {
            throw new IllegalStateException();
        }
        this.zzd.zze(zzxxVar, true);
        this.zzb = null;
        this.zzc = this.zzd.zzc;
    }

    final zzxx zza() {
        zzxy zzxyVar = this.zzd;
        zzxx zzxxVar = this.zza;
        if (zzxxVar == zzxyVar.zzd) {
            throw new NoSuchElementException();
        }
        if (zzxyVar.zzc != this.zzc) {
            throw new ConcurrentModificationException();
        }
        this.zza = zzxxVar.zzd;
        this.zzb = zzxxVar;
        return zzxxVar;
    }
}
