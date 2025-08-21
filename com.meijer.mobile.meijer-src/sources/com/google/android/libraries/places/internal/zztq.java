package com.google.android.libraries.places.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zztq implements Iterator {
    final /* synthetic */ zztr zza;
    private int zzb;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        int i10 = this.zzb;
        zztr zztrVar = this.zza;
        return i10 < zztrVar.zzb() - zztrVar.zza();
    }

    @Override // java.util.Iterator
    public final Object next() {
        int i10 = this.zzb;
        zztr zztrVar = this.zza;
        if (i10 >= zztrVar.zzb() - zztrVar.zza()) {
            throw new NoSuchElementException();
        }
        zzts zztsVar = zztrVar.zzb;
        Object obj = zztsVar.zzb()[zztrVar.zza() + i10];
        this.zzb = i10 + 1;
        return obj;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }

    zztq(zztr zztrVar) {
        Objects.requireNonNull(zztrVar);
        this.zza = zztrVar;
        this.zzb = 0;
    }
}
