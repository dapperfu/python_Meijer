package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class U4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85245a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85246b;

    U4(C11262w5 c11262w5, B6 b62, boolean z10) {
        this.f85245a = b62;
        Objects.requireNonNull(c11262w5);
        this.f85246b = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85246b;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            B6 b62 = this.f85245a;
            com.google.android.gms.common.internal.r.l(b62);
            X2 x22 = c11262w5.f84868a;
            C11187m c11187mU = x22.u();
            C11112c2 c11112c2 = C11120d2.f85458c1;
            if (c11187mU.F(null, c11112c2)) {
                c11262w5.Z(interfaceC4466dL, null, b62);
            }
            interfaceC4466dL.r8(b62);
            c11262w5.f84868a.C().t();
            x22.u().F(null, c11112c2);
            c11262w5.Z(interfaceC4466dL, null, b62);
            c11262w5.H();
        } catch (RemoteException e10) {
            this.f85246b.f84868a.a().m().b("Failed to send app launch to the service", e10);
        }
    }
}
