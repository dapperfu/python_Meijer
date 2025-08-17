package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11115c5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85388a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85389b;

    RunnableC11115c5(C11262w5 c11262w5, B6 b62) {
        this.f85388a = b62;
        Objects.requireNonNull(c11262w5);
        this.f85389b = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85389b;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Failed to send consent settings to service");
            return;
        }
        try {
            B6 b62 = this.f85388a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4466dL.s9(b62);
            c11262w5.H();
        } catch (RemoteException e10) {
            this.f85389b.f84868a.a().m().b("Failed to send consent settings to the service", e10);
        }
    }
}
