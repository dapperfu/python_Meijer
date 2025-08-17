package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
final class Ti0 extends Pi0 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<Zi0, Thread> f70438a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<Zi0, Zi0> f70439b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super AbstractC7495aj0<?>, Zi0> f70440c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super AbstractC7495aj0<?>, Si0> f70441d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<? super AbstractC7495aj0<?>, Object> f70442e;

    Ti0(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f70438a = atomicReferenceFieldUpdater;
        this.f70439b = atomicReferenceFieldUpdater2;
        this.f70440c = atomicReferenceFieldUpdater3;
        this.f70441d = atomicReferenceFieldUpdater4;
        this.f70442e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Si0 a(AbstractC7495aj0 abstractC7495aj0, Si0 si0) {
        return this.f70441d.getAndSet(abstractC7495aj0, si0);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final Zi0 b(AbstractC7495aj0 abstractC7495aj0, Zi0 zi0) {
        return this.f70440c.getAndSet(abstractC7495aj0, zi0);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void c(Zi0 zi0, Zi0 zi02) {
        this.f70439b.lazySet(zi0, zi02);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final void d(Zi0 zi0, Thread thread) {
        this.f70438a.lazySet(zi0, thread);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean e(AbstractC7495aj0 abstractC7495aj0, Si0 si0, Si0 si02) {
        return C7602bj0.a(this.f70441d, abstractC7495aj0, si0, si02);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean f(AbstractC7495aj0 abstractC7495aj0, Object obj, Object obj2) {
        return C7602bj0.a(this.f70442e, abstractC7495aj0, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.Pi0
    final boolean g(AbstractC7495aj0 abstractC7495aj0, Zi0 zi0, Zi0 zi02) {
        return C7602bj0.a(this.f70440c, abstractC7495aj0, zi0, zi02);
    }
}
