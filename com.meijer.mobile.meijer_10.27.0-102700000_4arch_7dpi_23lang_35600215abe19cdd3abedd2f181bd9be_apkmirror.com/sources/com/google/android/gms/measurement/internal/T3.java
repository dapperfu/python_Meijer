package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes6.dex */
final class T3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85234a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85235b;

    T3(C11268x4 c11268x4, AtomicReference atomicReference) {
        this.f85234a = atomicReference;
        Objects.requireNonNull(c11268x4);
        this.f85235b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f85234a;
        synchronized (atomicReference) {
            try {
                try {
                    C11268x4 c11268x4 = this.f85235b;
                    atomicReference.set(Boolean.valueOf(c11268x4.f84868a.u().F(c11268x4.f84868a.J().o(), C11120d2.f85454b0)));
                } finally {
                    this.f85234a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
