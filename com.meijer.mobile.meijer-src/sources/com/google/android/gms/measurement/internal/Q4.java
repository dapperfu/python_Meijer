package com.google.android.gms.measurement.internal;

import Qd.InterfaceC4672d;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f86020a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f86021b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v6 f86022c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11387w5 f86023d;

    Q4(C11387w5 c11387w5, B6 b62, boolean z10, v6 v6Var) {
        this.f86020a = b62;
        this.f86021b = z10;
        this.f86022c = v6Var;
        Objects.requireNonNull(c11387w5);
        this.f86023d = c11387w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11387w5 c11387w5 = this.f86023d;
        InterfaceC4672d interfaceC4672dL = c11387w5.L();
        if (interfaceC4672dL == null) {
            c11387w5.f85708a.a().m().a("Discarding data. Failed to set user property");
            return;
        }
        B6 b62 = this.f86020a;
        com.google.android.gms.common.internal.r.l(b62);
        c11387w5.Z(interfaceC4672dL, this.f86021b ? null : this.f86022c, b62);
        c11387w5.H();
    }
}
