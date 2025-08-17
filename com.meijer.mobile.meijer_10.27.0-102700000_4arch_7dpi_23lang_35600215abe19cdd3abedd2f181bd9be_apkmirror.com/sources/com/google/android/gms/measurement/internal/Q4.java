package com.google.android.gms.measurement.internal;

import Od.InterfaceC4466d;
import java.util.Objects;

/* loaded from: classes6.dex */
final class Q4 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ B6 f85180a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f85181b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ v6 f85182c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ C11262w5 f85183d;

    Q4(C11262w5 c11262w5, B6 b62, boolean z10, v6 v6Var) {
        this.f85180a = b62;
        this.f85181b = z10;
        this.f85182c = v6Var;
        Objects.requireNonNull(c11262w5);
        this.f85183d = c11262w5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C11262w5 c11262w5 = this.f85183d;
        InterfaceC4466d interfaceC4466dL = c11262w5.L();
        if (interfaceC4466dL == null) {
            c11262w5.f84868a.a().m().a("Discarding data. Failed to set user property");
            return;
        }
        B6 b62 = this.f85180a;
        com.google.android.gms.common.internal.r.l(b62);
        c11262w5.Z(interfaceC4466dL, this.f85181b ? null : this.f85182c, b62);
        c11262w5.H();
    }
}
