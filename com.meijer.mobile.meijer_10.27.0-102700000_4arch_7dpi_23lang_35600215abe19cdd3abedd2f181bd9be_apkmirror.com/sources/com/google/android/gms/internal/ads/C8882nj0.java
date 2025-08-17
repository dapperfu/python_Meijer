package com.google.android.gms.internal.ads;

import java.util.Set;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: com.google.android.gms.internal.ads.nj0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8882nj0 extends AbstractC8775mj0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater f77123a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicIntegerFieldUpdater f77124b;

    C8882nj0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicIntegerFieldUpdater atomicIntegerFieldUpdater) {
        super(null);
        this.f77123a = atomicReferenceFieldUpdater;
        this.f77124b = atomicIntegerFieldUpdater;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8775mj0
    final int a(AbstractC9203qj0 abstractC9203qj0) {
        return this.f77124b.decrementAndGet(abstractC9203qj0);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC8775mj0
    final void b(AbstractC9203qj0 abstractC9203qj0, Set set, Set set2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        do {
            atomicReferenceFieldUpdater = this.f77123a;
            if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, abstractC9203qj0, null, set2)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(abstractC9203qj0) == null);
    }
}
