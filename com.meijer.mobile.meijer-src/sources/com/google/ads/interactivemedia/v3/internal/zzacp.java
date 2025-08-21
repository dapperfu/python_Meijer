package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class zzacp extends zzacq {
    final /* synthetic */ zzacw zza;
    private int zzb = 0;
    private final int zzc;

    zzacp(zzacw zzacwVar) {
        this.zza = zzacwVar;
        this.zzc = zzacwVar.zzd();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacs
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }
}
