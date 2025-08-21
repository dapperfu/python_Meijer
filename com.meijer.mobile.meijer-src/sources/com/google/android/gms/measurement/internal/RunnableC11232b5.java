package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import android.os.RemoteException;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.b5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11232b5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86205a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86206b;

    RunnableC11232b5(C11387w5 c11387w5, B6 b62) {
        this.f86205a = b62;
        Objects.requireNonNull(c11387w5);
        this.f86206b = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86206b;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            B6 b62 = this.f86205a;
            com.google.android.gms.common.internal.r.l(b62);
            interfaceC4672dL.h3(b62);
            c11387w5.H();
        } catch (RemoteException e10) {
            this.f86206b.f85708a.a().m().b("Failed to send measurementEnabled to the service", e10);
        }
    }
}
