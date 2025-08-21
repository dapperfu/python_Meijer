package com.google.android.gms.measurement.internal;

import Qd.AbstractBinderC4677i;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class P4 extends AbstractBinderC4677i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86007a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86008b;

    P4(C11387w5 c11387w5, AtomicReference atomicReference) {
        this.f86007a = atomicReference;
        Objects.requireNonNull(c11387w5);
        this.f86008b = c11387w5;
    }

    @Override // Qd.InterfaceC4678j
    public final void s8(Z5 z52) {
        AtomicReference atomicReference = this.f86007a;
        synchronized (atomicReference) {
            this.f86008b.f85708a.a().u().b("[sgtm] Got upload batches from service. count", Integer.valueOf(z52.f86181a.size()));
            atomicReference.set(z52);
            atomicReference.notifyAll();
        }
    }
}
