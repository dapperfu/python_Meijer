package com.google.android.libraries.places.internal;

import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zztr extends AbstractSet {
    final int zza;
    final /* synthetic */ zzts zzb;

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        return Arrays.binarySearch(this.zzb.zzb(), zza(), zzb(), obj, this.zza == -1 ? zzts.zza : zztu.zza) >= 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zztq(this);
    }

    final int zza() {
        if (this.zza == -1) {
            return 0;
        }
        return this.zzb.zzc()[0];
    }

    final int zzb() {
        return this.zzb.zzc()[this.zza + 1];
    }

    zztr(zzts zztsVar, int i10) {
        Objects.requireNonNull(zztsVar);
        this.zzb = zztsVar;
        this.zza = -1;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return zzb() - zza();
    }
}
