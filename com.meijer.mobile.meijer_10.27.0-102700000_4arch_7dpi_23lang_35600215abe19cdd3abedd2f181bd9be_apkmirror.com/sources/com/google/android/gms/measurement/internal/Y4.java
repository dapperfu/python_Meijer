package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85322a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f85323b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E f85324c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f85325d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85326e;

    Y4(C11262w5 c11262w5, boolean z10, B6 b62, boolean z11, E e10, Bundle bundle) {
        this.f85322a = b62;
        this.f85323b = z11;
        this.f85324c = e10;
        this.f85325d = bundle;
        Objects.requireNonNull(c11262w5);
        this.f85326e = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85326e;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Failed to send default event parameters to service");
            return;
        }
        if (c11262w5.f84868a.u().F(null, C11120d2.f85458c1)) {
            B6 b62 = this.f85322a;
            com.google.android.gms.common.internal.r.l(b62);
            this.f85326e.Z(interfaceC4466dL, this.f85323b ? null : this.f85324c, b62);
            return;
        }
        try {
            B6 b63 = this.f85322a;
            com.google.android.gms.common.internal.r.l(b63);
            interfaceC4466dL.b8(this.f85325d, b63);
            c11262w5.H();
        } catch (RemoteException e10) {
            this.f85326e.f84868a.a().m().b("Failed to send default event parameters to service", e10);
        }
    }
}
