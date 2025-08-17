package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.d4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11122d4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85516a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85517b;

    RunnableC11122d4(C11268x4 c11268x4, AtomicReference atomicReference) {
        this.f85516a = atomicReference;
        Objects.requireNonNull(c11268x4);
        this.f85517b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f85516a;
        synchronized (atomicReference) {
            try {
                try {
                    C11268x4 c11268x4 = this.f85517b;
                    atomicReference.set(Long.valueOf(c11268x4.f84868a.u().B(c11268x4.f84868a.J().o(), C11120d2.f85460d0)));
                } finally {
                    this.f85516a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
