package com.google.ads.interactivemedia.v3.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class zzafq implements Iterator {
    private final ArrayDeque zza;
    private zzacu zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    private final zzacu zzb(zzacw zzacwVar) {
        while (zzacwVar instanceof zzafs) {
            zzafs zzafsVar = (zzafs) zzacwVar;
            this.zza.push(zzafsVar);
            zzacwVar = zzafsVar.zzd;
        }
        return (zzacu) zzacwVar;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Iterator
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final zzacu next() {
        zzacu zzacuVarZzb;
        zzacu zzacuVar = this.zzb;
        if (zzacuVar == null) {
            throw new NoSuchElementException();
        }
        do {
            ArrayDeque arrayDeque = this.zza;
            zzacuVarZzb = null;
            if (arrayDeque == null || arrayDeque.isEmpty()) {
                break;
            }
            zzacuVarZzb = zzb(((zzafs) this.zza.pop()).zze);
        } while (zzacuVarZzb.zzd() == 0);
        this.zzb = zzacuVarZzb;
        return zzacuVar;
    }

    /* synthetic */ zzafq(zzacw zzacwVar, zzafp zzafpVar) {
        if (zzacwVar instanceof zzafs) {
            zzafs zzafsVar = (zzafs) zzacwVar;
            ArrayDeque arrayDeque = new ArrayDeque(zzafsVar.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzafsVar);
            this.zzb = zzb(zzafsVar.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzacu) zzacwVar;
    }
}
