package com.google.android.gms.measurement.internal;

import Od.AbstractBinderC4468f;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class O4 extends AbstractBinderC4468f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85149a;

    O4(C11262w5 c11262w5, AtomicReference atomicReference) {
        this.f85149a = atomicReference;
        Objects.requireNonNull(c11262w5);
    }

    @Override // Od.InterfaceC4469g
    public final void y4(List list) {
        AtomicReference atomicReference = this.f85149a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
