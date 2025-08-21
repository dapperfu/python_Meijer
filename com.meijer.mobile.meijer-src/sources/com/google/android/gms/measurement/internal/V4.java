package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class V4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86095a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86096b;

    V4(C11387w5 c11387w5, B6 b62) {
        this.f86095a = b62;
        Objects.requireNonNull(c11387w5);
        this.f86096b = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86096b;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().p().a("Failed to send app backgrounded");
            return;
        }
        try {
            B6 b62 = this.f86095a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4672dL.E8(b62);
            c11387w5.H();
        } catch (RemoteException e10) {
            this.f86096b.f85708a.a().m().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
