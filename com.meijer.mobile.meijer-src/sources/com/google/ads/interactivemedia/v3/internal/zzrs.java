package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractMap;

/* loaded from: classes4.dex */
final class zzrs extends zzrm {
    final /* synthetic */ zzrt zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return true;
    }

    zzrs(zzrt zzrtVar) {
        this.zza = zzrtVar;
    }

    @Override // java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i10) {
        return new AbstractMap.SimpleImmutableEntry(this.zza.zza.zzb.zzd.get(i10), this.zza.zza.zzc.get(i10));
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.zza.size();
    }
}
