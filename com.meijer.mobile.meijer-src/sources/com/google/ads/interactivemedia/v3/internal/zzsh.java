package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzsh extends zzrr {
    private final transient zzrp zza;
    private final transient zzrm zzb;

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri
    public final zzrm zzd() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.get(obj) != null;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return this.zzb.listIterator(0);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zza(Object[] objArr, int i10) {
        return this.zzb.zza(objArr, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri
    /* renamed from: zze */
    public final zzss iterator() {
        return this.zzb.listIterator(0);
    }

    zzsh(zzrp zzrpVar, zzrm zzrmVar) {
        this.zza = zzrpVar;
        this.zzb = zzrmVar;
    }
}
