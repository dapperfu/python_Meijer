package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class U4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86085a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86086b;

    U4(C11387w5 c11387w5, B6 b62, boolean z10) {
        this.f86085a = b62;
        Objects.requireNonNull(c11387w5);
        this.f86086b = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86086b;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            B6 b62 = this.f86085a;
            com.google.android.gms.common.internal.r.l(b62);
            X2 x22 = c11387w5.f85708a;
            C11312m c11312mU = x22.u();
            C11237c2 c11237c2 = C11245d2.f86298c1;
            if (c11312mU.F(null, c11237c2)) {
                c11387w5.Z(interfaceC4672dL, null, b62);
            }
            interfaceC4672dL.q8(b62);
            c11387w5.f85708a.C().t();
            x22.u().F(null, c11237c2);
            c11387w5.Z(interfaceC4672dL, null, b62);
            c11387w5.H();
        } catch (RemoteException e10) {
            this.f86086b.f85708a.a().m().b("Failed to send app launch to the service", e10);
        }
    }
}
