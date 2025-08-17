package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;
import java.util.Objects;

/* loaded from: classes4.dex */
final class zzsf extends zzrm {
    final /* synthetic */ zzsg zza;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    public final boolean zzf() {
        return true;
    }

    zzsf(zzsg zzsgVar) {
        this.zza = zzsgVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        zzqh.zza(i10, this.zza.zzc, "index");
        int i11 = i10 + i10;
        Object obj = this.zza.zzb[i11];
        Objects.requireNonNull(obj);
        Object obj2 = this.zza.zzb[i11 + 1];
        Objects.requireNonNull(obj2);
        return new AbstractMap.SimpleImmutableEntry(obj, obj2);
    }
}
