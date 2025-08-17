package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
final class Z6 extends V6 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<C10680f7, Thread> f83016a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<C10680f7, C10680f7> f83017b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<U6, C10680f7> f83018c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<U6, Y6> f83019d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<U6, Object> f83020e;

    Z6(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f83016a = atomicReferenceFieldUpdater;
        this.f83017b = atomicReferenceFieldUpdater2;
        this.f83018c = atomicReferenceFieldUpdater3;
        this.f83019d = atomicReferenceFieldUpdater4;
        this.f83020e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final Y6 a(U6 u62, Y6 y62) {
        return this.f83019d.getAndSet(u62, y62);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final C10680f7 b(U6 u62, C10680f7 c10680f7) {
        return this.f83018c.getAndSet(u62, c10680f7);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void c(C10680f7 c10680f7, C10680f7 c10680f72) {
        this.f83017b.lazySet(c10680f7, c10680f72);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void d(C10680f7 c10680f7, Thread thread) {
        this.f83016a.lazySet(c10680f7, thread);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean e(U6 u62, Object obj, Object obj2) {
        return C10696g7.a(this.f83020e, u62, obj, obj2);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean f(U6 u62, C10680f7 c10680f7, C10680f7 c10680f72) {
        return C10696g7.a(this.f83018c, u62, c10680f7, c10680f72);
    }
}
