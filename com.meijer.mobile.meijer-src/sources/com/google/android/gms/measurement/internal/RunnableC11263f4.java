package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11263f4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86388a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86389b;

    RunnableC11263f4(C11393x4 c11393x4, AtomicReference atomicReference) {
        this.f86388a = atomicReference;
        Objects.requireNonNull(c11393x4);
        this.f86389b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f86388a;
        synchronized (atomicReference) {
            try {
                try {
                    C11393x4 c11393x4 = this.f86389b;
                    atomicReference.set(Double.valueOf(c11393x4.f85708a.u().E(c11393x4.f85708a.J().o(), C11245d2.f86306f0)));
                } finally {
                    this.f86388a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
