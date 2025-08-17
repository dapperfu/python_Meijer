package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11107b5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85365a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85366b;

    RunnableC11107b5(C11262w5 c11262w5, B6 b62) {
        this.f85365a = b62;
        Objects.requireNonNull(c11262w5);
        this.f85366b = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85366b;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            B6 b62 = this.f85365a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4466dL.b3(b62);
            c11262w5.H();
        } catch (RemoteException e10) {
            this.f85366b.f84868a.a().m().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
