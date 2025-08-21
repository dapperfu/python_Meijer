package com.google.ads.interactivemedia.v3.internal;

import java.util.Iterator;
import java.util.Map;

/* loaded from: classes4.dex */
final class zzsg extends zzrr {
    private final transient zzrp zza;
    private final transient Object[] zzb;
    private final transient int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return true;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.zza.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr
    final zzrm zzk() {
        return new zzsf(this);
    }

    zzsg(zzrp zzrpVar, Object[] objArr, int i10, int i11) {
        this.zza = zzrpVar;
        this.zzb = objArr;
        this.zzc = i11;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return zzd().listIterator(0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zza(Object[] objArr, int i10) {
        return zzd().zza(objArr, 0);
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrr, com.google.ads.interactivemedia.v3.internal.zzri
    /* renamed from: zze */
    public final zzss iterator() {
        return zzd().listIterator(0);
    }
}
