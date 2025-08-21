package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11240c5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86228a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86229b;

    RunnableC11240c5(C11387w5 c11387w5, B6 b62) {
        this.f86228a = b62;
        Objects.requireNonNull(c11387w5);
        this.f86229b = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86229b;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Failed to send consent settings to service");
            return;
        }
        try {
            B6 b62 = this.f86228a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4672dL.s9(b62);
            c11387w5.H();
        } catch (RemoteException e10) {
            this.f86229b.f85708a.a().m().b("Failed to send consent settings to the service", e10);
        }
    }
}
