package com.google.android.gms.measurement.internal;

import Qd.AbstractBinderC4674f;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class O4 extends AbstractBinderC4674f {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85989a;

    O4(C11387w5 c11387w5, AtomicReference atomicReference) {
        this.f85989a = atomicReference;
        Objects.requireNonNull(c11387w5);
    }

    @Override // Qd.InterfaceC4675g
    public final void K4(List list) {
        AtomicReference atomicReference = this.f85989a;
        synchronized (atomicReference) {
            atomicReference.set(list);
            atomicReference.notifyAll();
        }
    }
}
