package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.c4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11114c4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85386a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85387b;

    RunnableC11114c4(C11268x4 c11268x4, AtomicReference atomicReference) {
        this.f85386a = atomicReference;
        Objects.requireNonNull(c11268x4);
        this.f85387b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f85386a;
        synchronized (atomicReference) {
            try {
                try {
                    C11268x4 c11268x4 = this.f85387b;
                    atomicReference.set(c11268x4.f84868a.u().A(c11268x4.f84868a.J().o(), C11120d2.f85457c0));
                } finally {
                    this.f85386a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
