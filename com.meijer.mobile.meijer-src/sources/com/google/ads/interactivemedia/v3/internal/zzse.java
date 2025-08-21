package com.google.ads.interactivemedia.v3.internal;

import java.util.Objects;

/* loaded from: classes4.dex */
final class zzse extends zzrm {
    static final zzrm zza = new zzse(new Object[0], 0);
    final transient Object[] zzb;
    private final transient int zzc;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zzb() {
        return this.zzc;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final int zzc() {
        return 0;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final boolean zzf() {
        return false;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzri
    final Object[] zzg() {
        return this.zzb;
    }

    @Override // java.util.List
    public final Object get(int i10) {
        zzqh.zza(i10, this.zzc, "index");
        Object obj = this.zzb[i10];
        Objects.requireNonNull(obj);
        return obj;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzrm, com.google.ads.interactivemedia.v3.internal.zzri
    final int zza(Object[] objArr, int i10) {
        System.arraycopy(this.zzb, 0, objArr, 0, this.zzc);
        return this.zzc;
    }

    zzse(Object[] objArr, int i10) {
        this.zzb = objArr;
        this.zzc = i10;
    }
}
