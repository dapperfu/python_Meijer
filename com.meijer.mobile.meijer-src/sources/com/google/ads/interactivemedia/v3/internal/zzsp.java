package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;

/* loaded from: classes4.dex */
final class zzsp extends zzrr {
    final transient Object zza;

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new zzrx(this.zza);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zza(Object[] objArr, int i10) {
        objArr[0] = this.zza;
        return 1;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri
    /* renamed from: zze */
    public final zzss iterator() {
        return new zzrx(this.zza);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        return this.zza.equals(obj);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.zza.hashCode();
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        return "[" + this.zza.toString() + "]";
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri
    public final zzrm zzd() {
        int i10 = zzrm.zzd;
        Object[] objArr = {this.zza};
        zzsc.zzb(objArr, 1);
        return zzrm.zzj(objArr, 1);
    }

    zzsp(Object obj) {
        obj.getClass();
        this.zza = obj;
    }
}
