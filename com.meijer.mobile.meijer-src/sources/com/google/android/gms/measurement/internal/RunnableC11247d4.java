package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11247d4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86356a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86357b;

    RunnableC11247d4(C11393x4 c11393x4, AtomicReference atomicReference) {
        this.f86356a = atomicReference;
        Objects.requireNonNull(c11393x4);
        this.f86357b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f86356a;
        synchronized (atomicReference) {
            try {
                try {
                    C11393x4 c11393x4 = this.f86357b;
                    atomicReference.set(Long.valueOf(c11393x4.f85708a.u().B(c11393x4.f85708a.J().o(), C11245d2.f86300d0)));
                } finally {
                    this.f86356a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
