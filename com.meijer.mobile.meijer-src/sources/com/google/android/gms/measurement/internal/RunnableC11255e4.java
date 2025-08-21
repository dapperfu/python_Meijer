package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11255e4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f86373a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11393x4 f86374b;

    RunnableC11255e4(C11393x4 c11393x4, AtomicReference atomicReference) {
        this.f86373a = atomicReference;
        Objects.requireNonNull(c11393x4);
        this.f86374b = c11393x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f86373a;
        synchronized (atomicReference) {
            try {
                try {
                    C11393x4 c11393x4 = this.f86374b;
                    atomicReference.set(Integer.valueOf(c11393x4.f85708a.u().C(c11393x4.f85708a.J().o(), C11245d2.f86303e0)));
                } finally {
                    this.f86373a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
