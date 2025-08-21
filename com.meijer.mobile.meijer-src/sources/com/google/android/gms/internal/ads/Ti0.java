package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
final class Ti0 extends Pi0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<Zi0, Thread> f71278a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<Zi0, Zi0> f71279b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super AbstractC7620aj0<?>, Zi0> f71280c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super AbstractC7620aj0<?>, Si0> f71281d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super AbstractC7620aj0<?>, Object> f71282e;

    Ti0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f71278a = atomicReferenceFieldUpdater;
        this.f71279b = atomicReferenceFieldUpdater2;
        this.f71280c = atomicReferenceFieldUpdater3;
        this.f71281d = atomicReferenceFieldUpdater4;
        this.f71282e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Si0 a(AbstractC7620aj0 abstractC7620aj0, Si0 si0) {
        return this.f71281d.getAndSet(abstractC7620aj0, si0);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Zi0 b(AbstractC7620aj0 abstractC7620aj0, Zi0 zi0) {
        return this.f71280c.getAndSet(abstractC7620aj0, zi0);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void c(Zi0 zi0, Zi0 zi02) {
        this.f71279b.lazySet(zi0, zi02);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void d(Zi0 zi0, Thread thread) {
        this.f71278a.lazySet(zi0, thread);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean e(AbstractC7620aj0 abstractC7620aj0, Si0 si0, Si0 si02) {
        return C7727bj0.a(this.f71281d, abstractC7620aj0, si0, si02);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean f(AbstractC7620aj0 abstractC7620aj0, Object obj, Object obj2) {
        return C7727bj0.a(this.f71282e, abstractC7620aj0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean g(AbstractC7620aj0 abstractC7620aj0, Zi0 zi0, Zi0 zi02) {
        return C7727bj0.a(this.f71280c, abstractC7620aj0, zi0, zi02);
    }
}
