package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class H5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f85888a;

    /* renamed from: b, reason: collision with root package name */
    final long f85889b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I5 f85890c;

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85890c.f85900b.f85708a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.G5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                H5 h52 = this.f85881a;
                N5 n52 = h52.f85890c.f85900b;
                n52.f();
                X2 x22 = n52.f85708a;
                x22.a().t().a("Application going to the background");
                x22.v().f85828t.b(true);
                n52.m(true);
                if (!x22.u().L()) {
                    long j10 = h52.f85889b;
                    L5 l52 = n52.f85977f;
                    l52.d(false, false, j10);
                    l52.b(j10);
                }
                x22.a().s().b("Application backgrounded at: timestamp_millis", Long.valueOf(h52.f85888a));
                X2 x23 = n52.f85708a;
                C11393x4 c11393x4Z = x23.z();
                c11393x4Z.f();
                X2 x24 = c11393x4Z.f85708a;
                c11393x4Z.h();
                C11387w5 c11387w5H = x24.H();
                c11387w5H.f();
                c11387w5H.h();
                if (!c11387w5H.w() || c11387w5H.f85708a.A().U() >= 242600) {
                    x24.H().r();
                }
                if (x22.u().F(null, C11245d2.f86267O0)) {
                    long jB = x22.A().N(x22.zzaY().getPackageName(), x22.u().P()) ? 1000L : x22.u().B(x22.zzaY().getPackageName(), C11245d2.f86246E);
                    x22.a().u().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jB));
                    x23.L().m(jB);
                }
            }
        });
    }

    H5(I5 i52, long j10, long j11) {
        Objects.requireNonNull(i52);
        this.f85890c = i52;
        this.f85888a = j10;
        this.f85889b = j11;
    }
}
