package com.google.ads.interactivemedia.v3.internal;

import java.util.List;

/* loaded from: classes4.dex */
final class zzrk extends zzrm {
    private final transient zzrm zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm
    public final zzrm zzh() {
        return this.zza;
    }

    private final int zzo(int i10) {
        return (this.zza.size() - 1) - i10;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm, com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.contains(obj);
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzqh.zza(i10, this.zza.size(), "index");
        return this.zza.get(zzo(i10));
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm, java.util.List
    public final int indexOf(Object obj) {
        int iLastIndexOf = this.zza.lastIndexOf(obj);
        if (iLastIndexOf >= 0) {
            return zzo(iLastIndexOf);
        }
        return -1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm, java.util.List
    public final int lastIndexOf(Object obj) {
        int iIndexOf = this.zza.indexOf(obj);
        if (iIndexOf >= 0) {
            return zzo(iIndexOf);
        }
        return -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zza.size();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return this.zza.zzf();
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm
    /* renamed from: zzi */
    public final zzrm subList(int i10, int i11) {
        zzqh.zzh(i10, i11, this.zza.size());
        zzrm zzrmVar = this.zza;
        return zzrmVar.subList(zzrmVar.size() - i11, this.zza.size() - i10).zzh();
    }

    zzrk(zzrm zzrmVar) {
        this.zza = zzrmVar;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm, java.util.List
    public final /* bridge */ /* synthetic */ List subList(int i10, int i11) {
        return subList(i10, i11);
    }
}
