package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.i5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11288i5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC4672d f86470a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ServiceConnectionC11346q5 f86471b;

    RunnableC11288i5(ServiceConnectionC11346q5 serviceConnectionC11346q5, InterfaceC4672d interfaceC4672d) {
        this.f86470a = interfaceC4672d;
        Objects.requireNonNull(serviceConnectionC11346q5);
        this.f86471b = serviceConnectionC11346q5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ServiceConnectionC11346q5 serviceConnectionC11346q5 = this.f86471b;
        synchronized (serviceConnectionC11346q5) {
            try {
                serviceConnectionC11346q5.d(false);
                C11387w5 c11387w5 = serviceConnectionC11346q5.f86623c;
                if (!c11387w5.U()) {
                    c11387w5.f85708a.a().u().a("Connected to service");
                    c11387w5.x(this.f86470a);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
