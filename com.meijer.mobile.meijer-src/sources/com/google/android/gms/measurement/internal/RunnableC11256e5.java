package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11256e5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86375a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f86376b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11282i f86377c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86378d;

    RunnableC11256e5(C11387w5 c11387w5, boolean z10, B6 b62, boolean z11, C11282i c11282i, C11282i c11282i2) {
        this.f86375a = b62;
        this.f86376b = z11;
        this.f86377c = c11282i;
        Objects.requireNonNull(c11387w5);
        this.f86378d = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86378d;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        B6 b62 = this.f86375a;
        com.google.android.gms.common.internal.r.l(b62);
        c11387w5.Z(interfaceC4672dL, this.f86376b ? null : this.f86377c, b62);
        c11387w5.H();
    }
}
