package com.google.android.gms.measurement.internal;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.internal.e4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11130e4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AtomicReference f85533a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11268x4 f85534b;

    RunnableC11130e4(C11268x4 c11268x4, AtomicReference atomicReference) {
        this.f85533a = atomicReference;
        Objects.requireNonNull(c11268x4);
        this.f85534b = c11268x4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AtomicReference atomicReference = this.f85533a;
        synchronized (atomicReference) {
            try {
                try {
                    C11268x4 c11268x4 = this.f85534b;
                    atomicReference.set(Integer.valueOf(c11268x4.f84868a.u().C(c11268x4.f84868a.J().o(), C11120d2.f85463e0)));
                } finally {
                    this.f85533a.notify();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
