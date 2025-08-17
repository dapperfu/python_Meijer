package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.f4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11138f4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85548a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85549b;

    RunnableC11138f4(C11268x4 c11268x4, AtomicReference atomicReference) {
        this.f85548a = atomicReference;
        Objects.requireNonNull(c11268x4);
        this.f85549b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f85548a;
        synchronized (atomicReference) {
            try {
                try {
                    C11268x4 c11268x4 = this.f85549b;
                    atomicReference.set(Double.valueOf(c11268x4.f84868a.u().E(c11268x4.f84868a.J().o(), C11120d2.f85466f0)));
                } finally {
                    this.f85548a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
