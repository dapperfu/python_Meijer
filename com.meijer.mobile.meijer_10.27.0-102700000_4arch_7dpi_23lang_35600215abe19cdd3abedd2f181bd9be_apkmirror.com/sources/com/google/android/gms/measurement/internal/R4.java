package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class R4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85200a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85201b;

    R4(C11262w5 c11262w5, B6 b62) {
        this.f85200a = b62;
        Objects.requireNonNull(c11262w5);
        this.f85201b = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85201b;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            B6 b62 = this.f85200a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4466dL.U5(b62);
        } catch (RemoteException e10) {
            this.f85201b.f84868a.a().m().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f85201b.H();
    }
}
