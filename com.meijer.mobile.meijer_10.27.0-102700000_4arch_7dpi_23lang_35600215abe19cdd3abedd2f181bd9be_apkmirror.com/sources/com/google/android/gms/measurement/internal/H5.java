package com.google.android.gms.measurement.internal;

import java.util.Objects;

/* loaded from: classes6.dex */
final class H5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final long f85048a;

    /* renamed from: b, reason: collision with root package name */
    final long f85049b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ I5 f85050c;

    @Override // java.lang.Runnable
    public final void run() throws IllegalStateException {
        this.f85050c.f85060b.f84868a.b().r(new Runnable() { // from class: com.google.android.gms.measurement.internal.G5
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() throws IllegalStateException {
                H5 h52 = this.f85041a;
                N5 n52 = h52.f85050c.f85060b;
                n52.f();
                X2 x22 = n52.f84868a;
                x22.a().t().a("Application going to the background");
                x22.v().f84988t.b(true);
                n52.m(true);
                if (!x22.u().L()) {
                    long j10 = h52.f85049b;
                    L5 l52 = n52.f85137f;
                    l52.d(false, false, j10);
                    l52.b(j10);
                }
                x22.a().s().b("Application backgrounded at: timestamp_millis", Long.valueOf(h52.f85048a));
                X2 x23 = n52.f84868a;
                C11268x4 c11268x4Z = x23.z();
                c11268x4Z.f();
                X2 x24 = c11268x4Z.f84868a;
                c11268x4Z.h();
                C11262w5 c11262w5H = x24.H();
                c11262w5H.f();
                c11262w5H.h();
                if (!c11262w5H.w() || c11262w5H.f84868a.A().U() >= 242600) {
                    x24.H().r();
                }
                if (x22.u().F(null, C11120d2.f85427O0)) {
                    long jB = x22.A().N(x22.zzaY().getPackageName(), x22.u().P()) ? 1000L : x22.u().B(x22.zzaY().getPackageName(), C11120d2.f85406E);
                    x22.a().u().b("[sgtm] Scheduling batch upload with minimum latency in millis", Long.valueOf(jB));
                    x23.L().m(jB);
                }
            }
        });
    }

    H5(I5 i52, long j10, long j11) {
        Objects.requireNonNull(i52);
        this.f85050c = i52;
        this.f85048a = j10;
        this.f85049b = j11;
    }
}
