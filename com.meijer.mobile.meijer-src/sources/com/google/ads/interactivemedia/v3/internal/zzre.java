package com.google.ads.interactivemedia.v3.internal;

import java.util.AbstractSet;
import java.util.Iterator;

/* loaded from: classes4.dex */
abstract class zzre extends AbstractSet {
    final zzrf zzb;

    abstract Object zza(int i10);

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        this.zzb.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        return new zzrd(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.zzb.zzc;
    }

    zzre(zzrf zzrfVar) {
        this.zzb = zzrfVar;
    }
}
