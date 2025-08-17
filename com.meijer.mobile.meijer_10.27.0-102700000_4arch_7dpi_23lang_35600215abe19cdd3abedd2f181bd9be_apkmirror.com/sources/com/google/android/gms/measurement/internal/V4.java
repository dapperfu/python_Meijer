package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class V4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85255a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85256b;

    V4(C11262w5 c11262w5, B6 b62) {
        this.f85255a = b62;
        Objects.requireNonNull(c11262w5);
        this.f85256b = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85256b;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().p().a("Failed to send app backgrounded");
            return;
        }
        try {
            B6 b62 = this.f85255a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4466dL.K8(b62);
            c11262w5.H();
        } catch (RemoteException e10) {
            this.f85256b.f84868a.a().m().b("Failed to send app backgrounded to the service", e10);
        }
    }
}
