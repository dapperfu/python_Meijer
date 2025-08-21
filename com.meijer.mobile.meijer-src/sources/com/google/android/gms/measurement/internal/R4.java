package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class R4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86040a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86041b;

    R4(C11387w5 c11387w5, B6 b62) {
        this.f86040a = b62;
        Objects.requireNonNull(c11387w5);
        this.f86041b = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86041b;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Failed to reset data on the service: not connected to service");
            return;
        }
        try {
            B6 b62 = this.f86040a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4672dL.g6(b62);
        } catch (RemoteException e10) {
            this.f86041b.f85708a.a().m().b("Failed to reset data on the service: remote exception", e10);
        }
        this.f86041b.H();
    }
}
