package com.google.ads.interactivemedia.v3.internal;

import java.util.NoSuchElementException;

/* loaded from: classes4.dex */
final class zzafm extends zzacq {
    final zzafq zza;
    zzacs zzb = zzb();
    final /* synthetic */ zzafs zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb != null;
    }

    zzafm(zzafs zzafsVar) {
        this.zzc = zzafsVar;
        this.zza = new zzafq(zzafsVar, null);
    }

    private final zzacs zzb() {
        zzafq zzafqVar = this.zza;
        if (zzafqVar.hasNext()) {
            return zzafqVar.next().iterator();
        }
        return null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzacs
    public final byte zza() {
        zzacs zzacsVar = this.zzb;
        if (zzacsVar == null) {
            throw new NoSuchElementException();
        }
        byte bZza = zzacsVar.zza();
        if (!this.zzb.hasNext()) {
            this.zzb = zzb();
        }
        return bZza;
    }
}
