package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.Bundle;
import android.os.RemoteException;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Y4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86162a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f86163b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ E f86164c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Bundle f86165d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86166e;

    Y4(C11387w5 c11387w5, boolean z10, B6 b62, boolean z11, E e10, Bundle bundle) {
        this.f86162a = b62;
        this.f86163b = z11;
        this.f86164c = e10;
        this.f86165d = bundle;
        Objects.requireNonNull(c11387w5);
        this.f86166e = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86166e;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Failed to send default event parameters to service");
            return;
        }
        if (c11387w5.f85708a.u().F(null, C11245d2.f86298c1)) {
            B6 b62 = this.f86162a;
            com.google.android.gms.common.internal.r.l(b62);
            this.f86166e.Z(interfaceC4672dL, this.f86163b ? null : this.f86164c, b62);
            return;
        }
        try {
            B6 b63 = this.f86162a;
            com.google.android.gms.common.internal.r.l(b63);
            interfaceC4672dL.X7(this.f86165d, b63);
            c11387w5.H();
        } catch (RemoteException e10) {
            this.f86166e.f85708a.a().m().b("Failed to send default event parameters to service", e10);
        }
    }
}
