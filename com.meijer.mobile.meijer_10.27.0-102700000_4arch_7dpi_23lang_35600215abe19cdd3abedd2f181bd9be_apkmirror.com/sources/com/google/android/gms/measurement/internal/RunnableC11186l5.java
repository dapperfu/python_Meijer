package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.l5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11186l5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4466d f85673a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11221q5 f85674b;

    RunnableC11186l5(ServiceConnectionC11221q5 serviceConnectionC11221q5, InterfaceC4466d interfaceC4466d) {
        this.f85673a = interfaceC4466d;
        Objects.requireNonNull(serviceConnectionC11221q5);
        this.f85674b = serviceConnectionC11221q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC11221q5 serviceConnectionC11221q5 = this.f85674b;
        synchronized (serviceConnectionC11221q5) {
            try {
                serviceConnectionC11221q5.d(false);
                C11262w5 c11262w5 = serviceConnectionC11221q5.f85783c;
                if (!c11262w5.U()) {
                    c11262w5.f84868a.a().t().a("Connected to remote service");
                    c11262w5.x(this.f85673a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        C11262w5 c11262w52 = this.f85674b.f85783c;
        if (c11262w52.N() != null) {
            c11262w52.N().shutdownNow();
            c11262w52.O(null);
        }
    }
}
