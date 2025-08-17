package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* loaded from: classes4.dex */
final class zzrl extends zzrm {
    final transient int zza;
    final transient int zzb;
    final /* synthetic */ zzrm zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final Object[] zzg() {
        return this.zzc.zzg();
    }

    zzrl(zzrm zzrmVar, int i10, int i11) {
        this.zzc = zzrmVar;
        this.zza = i10;
        this.zzb = i11;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzqh.zza(i10, this.zzb, "index");
        return this.zzc.get(i10 + this.zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zzb() {
        return this.zzc.zzc() + this.zza + this.zzb;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zzc() {
        return this.zzc.zzc() + this.zza;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm
    /* renamed from: zzi */
    public final zzrm subList(int i10, int i11) {
        zzqh.zzh(i10, i11, this.zzb);
        int i12 = this.zza;
        return this.zzc.subList(i10 + i12, i11 + i12);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
