package com.google.android.gms.measurement.internal;

import Od.AbstractBinderC4471i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class P4 extends AbstractBinderC4471i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85167a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85168b;

    P4(C11262w5 c11262w5, AtomicReference atomicReference) {
        this.f85167a = atomicReference;
        Objects.requireNonNull(c11262w5);
        this.f85168b = c11262w5;
    }

    @Override // Od.InterfaceC4472j
    public final void v8(Z5 z52) {
        AtomicReference atomicReference = this.f85167a;
        synchronized (atomicReference) {
            this.f85168b.f84868a.a().u().b("[sgtm] Got upload batches from service. count", Integer.valueOf(z52.f85341a.size()));
            atomicReference.set(z52);
            atomicReference.notifyAll();
        }
    }
}
