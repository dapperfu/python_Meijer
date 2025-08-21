package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.nj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9007nj0 extends AbstractC8900mj0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f77963a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater f77964b;

    C9007nj0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f77963a = atomicReferenceFieldUpdater;
        this.f77964b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8900mj0
    final int a(AbstractC9328qj0 abstractC9328qj0) {
        return this.f77964b.decrementAndGet(abstractC9328qj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8900mj0
    final void b(AbstractC9328qj0 abstractC9328qj0, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f77963a;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC9328qj0, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC9328qj0) == null);
    }
}
