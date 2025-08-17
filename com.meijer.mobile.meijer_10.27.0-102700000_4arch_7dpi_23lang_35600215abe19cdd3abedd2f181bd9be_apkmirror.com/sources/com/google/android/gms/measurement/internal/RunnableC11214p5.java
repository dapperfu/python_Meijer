package com.google.android.gms.measurement.internal;

import gd.C14243b;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11214p5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14243b f85753a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11221q5 f85754b;

    RunnableC11214p5(ServiceConnectionC11221q5 serviceConnectionC11221q5, C14243b c14243b) {
        this.f85753a = c14243b;
        Objects.requireNonNull(serviceConnectionC11221q5);
        this.f85754b = serviceConnectionC11221q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85754b.f85783c;
        c11262w5.M(null);
        if (this.f85753a.B() != 7777) {
            c11262w5.J();
            return;
        }
        if (c11262w5.N() == null) {
            c11262w5.O(Executors.newScheduledThreadPool(1));
        }
        c11262w5.N().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.n5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                final C11262w5 c11262w52 = this.f85723a.f85754b.f85783c;
                c11262w52.f84868a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        c11262w52.u();
                    }
                });
            }
        }, ((Long) C11120d2.f85451a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
