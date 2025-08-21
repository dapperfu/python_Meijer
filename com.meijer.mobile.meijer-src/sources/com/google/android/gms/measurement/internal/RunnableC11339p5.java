package com.google.android.gms.measurement.internal;

import id.C14719b;
import java.util.Objects;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.gms.measurement.internal.p5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11339p5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C14719b f86593a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11346q5 f86594b;

    RunnableC11339p5(ServiceConnectionC11346q5 serviceConnectionC11346q5, C14719b c14719b) {
        this.f86593a = c14719b;
        Objects.requireNonNull(serviceConnectionC11346q5);
        this.f86594b = serviceConnectionC11346q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86594b.f86623c;
        c11387w5.M(null);
        if (this.f86593a.B() != 7777) {
            c11387w5.J();
            return;
        }
        if (c11387w5.N() == null) {
            c11387w5.O(Executors.newScheduledThreadPool(1));
        }
        c11387w5.N().schedule(new Runnable() { // from class: com.google.android.gms.measurement.internal.n5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                final C11387w5 c11387w52 = this.f86563a.f86594b.f86623c;
                c11387w52.f85708a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.o5
                    @Override // java.lang.Runnable
                    public final /* synthetic */ void run() {
                        c11387w52.u();
                    }
                });
            }
        }, ((Long) C11245d2.f86291a0.b(null)).longValue(), TimeUnit.MILLISECONDS);
    }
}
