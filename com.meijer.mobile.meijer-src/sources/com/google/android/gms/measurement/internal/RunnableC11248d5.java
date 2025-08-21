package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import java.util.Objects;

/* renamed from: com.google.android.gms.measurement.internal.d5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class RunnableC11248d5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86358a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f86359b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ G f86360c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86361d;

    RunnableC11248d5(C11387w5 c11387w5, boolean z10, B6 b62, boolean z11, G g10, String str) {
        this.f86358a = b62;
        this.f86359b = z11;
        this.f86360c = g10;
        Objects.requireNonNull(c11387w5);
        this.f86361d = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86361d;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Discarding data. Failed to send event to service");
            return;
        }
        B6 b62 = this.f86358a;
        com.google.android.gms.common.internal.r.l(b62);
        c11387w5.Z(interfaceC4672dL, this.f86359b ? null : this.f86360c, b62);
        c11387w5.H();
    }
}
