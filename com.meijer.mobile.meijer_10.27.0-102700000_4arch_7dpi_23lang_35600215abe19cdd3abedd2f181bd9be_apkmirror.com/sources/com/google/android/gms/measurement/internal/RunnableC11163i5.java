package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11163i5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4466d f85630a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11221q5 f85631b;

    RunnableC11163i5(ServiceConnectionC11221q5 serviceConnectionC11221q5, InterfaceC4466d interfaceC4466d) {
        this.f85630a = interfaceC4466d;
        Objects.requireNonNull(serviceConnectionC11221q5);
        this.f85631b = serviceConnectionC11221q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC11221q5 serviceConnectionC11221q5 = this.f85631b;
        synchronized (serviceConnectionC11221q5) {
            try {
                serviceConnectionC11221q5.d(false);
                C11262w5 c11262w5 = serviceConnectionC11221q5.f85783c;
                if (!c11262w5.U()) {
                    c11262w5.f84868a.a().u().a("Connected to service");
                    c11262w5.x(this.f85630a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
