package com.google.ads.interactivemedia.v3.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes4.dex */
final class zztt extends zzts {
    final AtomicIntegerFieldUpdater zza;

    zztt(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.zza = atomicIntegerFieldUpdater;
    }

    @Override // com.google.ads.interactivemedia.v3.internal.zzts
    final int zza(zztw zztwVar) {
        return this.zza.decrementAndGet(zztwVar);
    }
}
