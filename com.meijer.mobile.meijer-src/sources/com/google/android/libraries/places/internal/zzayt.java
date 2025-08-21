package com.google.android.libraries.places.internal;

import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class zzayt extends zzayu {
    final /* synthetic */ zzayz zza;
    private int zzb;
    private final int zzc;

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    @Override // com.google.android.libraries.places.internal.zzayw
    public final byte zza() {
        int i10 = this.zzb;
        if (i10 >= this.zzc) {
            throw new NoSuchElementException();
        }
        this.zzb = i10 + 1;
        return this.zza.zzb(i10);
    }

    zzayt(zzayz zzayzVar) {
        Objects.requireNonNull(zzayzVar);
        this.zza = zzayzVar;
        this.zzb = 0;
        this.zzc = zzayzVar.zzc();
    }
}
