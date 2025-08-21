package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class T3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86074a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86075b;

    T3(C11393x4 c11393x4, AtomicReference atomicReference) {
        this.f86074a = atomicReference;
        Objects.requireNonNull(c11393x4);
        this.f86075b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f86074a;
        synchronized (atomicReference) {
            try {
                try {
                    C11393x4 c11393x4 = this.f86075b;
                    atomicReference.set(Boolean.valueOf(c11393x4.f85708a.u().F(c11393x4.f85708a.J().o(), C11245d2.f86294b0)));
                } finally {
                    this.f86074a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
