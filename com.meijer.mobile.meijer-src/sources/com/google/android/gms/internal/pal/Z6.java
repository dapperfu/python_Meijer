package com.google.android.gms.internal.pal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes6.dex */
final class Z6 extends V6 {

    /* renamed from: a, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<C10805f7, Thread> f83856a;

    /* renamed from: b, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<C10805f7, C10805f7> f83857b;

    /* renamed from: c, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<U6, C10805f7> f83858c;

    /* renamed from: d, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<U6, Y6> f83859d;

    /* renamed from: e, reason: collision with root package name */
    final AtomicReferenceFieldUpdater<U6, Object> f83860e;

    Z6(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater3, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater4, AtomicReferenceFieldUpdater atomicReferenceFieldUpdater5) {
        super(null);
        this.f83856a = atomicReferenceFieldUpdater;
        this.f83857b = atomicReferenceFieldUpdater2;
        this.f83858c = atomicReferenceFieldUpdater3;
        this.f83859d = atomicReferenceFieldUpdater4;
        this.f83860e = atomicReferenceFieldUpdater5;
    }

    @Override // com.google.android.gms.internal.pal.V6
    final Y6 a(U6 u62, Y6 y62) {
        return this.f83859d.getAndSet(u62, y62);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final C10805f7 b(U6 u62, C10805f7 c10805f7) {
        return this.f83858c.getAndSet(u62, c10805f7);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void c(C10805f7 c10805f7, C10805f7 c10805f72) {
        this.f83857b.lazySet(c10805f7, c10805f72);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final void d(C10805f7 c10805f7, Thread thread) {
        this.f83856a.lazySet(c10805f7, thread);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean e(U6 u62, Object obj, Object obj2) {
        return C10821g7.a(this.f83860e, u62, obj, obj2);
    }

    @Override // com.google.android.gms.internal.pal.V6
    final boolean f(U6 u62, C10805f7 c10805f7, C10805f7 c10805f72) {
        return C10821g7.a(this.f83858c, u62, c10805f7, c10805f72);
    }
}
