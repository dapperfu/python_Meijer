package com.google.android.libraries.places.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;

/* loaded from: classes6.dex */
final class zzbvu extends zzbvt {
    private final AtomicIntegerFieldUpdater zza;

    /* synthetic */ zzbvu(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, byte[] bArr) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final boolean zza(zzbvw zzbvwVar, int i10, int i11) {
        return this.zza.compareAndSet(zzbvwVar, 0, -1);
    }

    @Override // com.google.android.libraries.places.internal.zzbvt
    public final void zzb(zzbvw zzbvwVar, int i10) {
        this.zza.set(zzbvwVar, 0);
    }
}
