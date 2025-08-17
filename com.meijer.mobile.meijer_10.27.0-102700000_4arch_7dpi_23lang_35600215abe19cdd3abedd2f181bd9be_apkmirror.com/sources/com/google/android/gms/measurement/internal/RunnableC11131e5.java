package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11131e5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85535a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f85536b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ C11157i f85537c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85538d;

    RunnableC11131e5(C11262w5 c11262w5, boolean z10, B6 b62, boolean z11, C11157i c11157i, C11157i c11157i2) {
        this.f85535a = b62;
        this.f85536b = z11;
        this.f85537c = c11157i;
        Objects.requireNonNull(c11262w5);
        this.f85538d = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85538d;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        B6 b62 = this.f85535a;
        com.google.android.gms.common.internal.r.l(b62);
        c11262w5.Z(interfaceC4466dL, this.f85536b ? null : this.f85537c, b62);
        c11262w5.H();
    }
}
