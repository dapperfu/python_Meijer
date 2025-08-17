package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11123d5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85518a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f85519b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G f85520c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85521d;

    RunnableC11123d5(C11262w5 c11262w5, boolean z10, B6 b62, boolean z11, G g10, String str) {
        this.f85518a = b62;
        this.f85519b = z11;
        this.f85520c = g10;
        Objects.requireNonNull(c11262w5);
        this.f85521d = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85521d;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Discarding data. Failed to send event to service");
            return;
        }
        B6 b62 = this.f85518a;
        com.google.android.gms.common.internal.r.l(b62);
        c11262w5.Z(interfaceC4466dL, this.f85519b ? null : this.f85520c, b62);
        c11262w5.H();
    }
}
