package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9460t5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final List f78482a;

    /* renamed from: b, reason: collision with root package name */
    private final X0[] f78483b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f78484c;

    /* renamed from: d, reason: collision with root package name */
    private int f78485d;

    /* renamed from: e, reason: collision with root package name */
    private int f78486e;

    /* renamed from: f, reason: collision with root package name */
    private long f78487f = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f78484c = true;
        this.f78487f = j10;
        this.f78486e = 0;
        this.f78485d = 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        for (int i10 = 0; i10 < this.f78483b.length; i10++) {
            C8074g6 c8074g6 = (C8074g6) this.f78482a.get(i10);
            c8393j6.c();
            X0 x0A = interfaceC9450t0.a(c8393j6.a(), 3);
            C9592uH0 c9592uH0 = new C9592uH0();
            c9592uH0.m(c8393j6.b());
            c9592uH0.B("application/dvbsubs");
            c9592uH0.n(Collections.singletonList(c8074g6.f74241b));
            c9592uH0.q(c8074g6.f74240a);
            x0A.d(c9592uH0.H());
            this.f78483b[i10] = x0A;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f78484c = false;
        this.f78487f = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void a(GQ gq2) {
        if (this.f78484c) {
            if (this.f78485d != 2 || d(gq2, 32)) {
                if (this.f78485d != 1 || d(gq2, 0)) {
                    int iT = gq2.t();
                    int iR = gq2.r();
                    for (X0 x02 : this.f78483b) {
                        gq2.l(iT);
                        x02.c(gq2, iR);
                    }
                    this.f78486e += iR;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
        if (this.f78484c) {
            C8086gC.f(this.f78487f != -9223372036854775807L);
            for (X0 x02 : this.f78483b) {
                x02.a(this.f78487f, 1, this.f78486e, 0, null);
            }
            this.f78484c = false;
        }
    }

    public C9460t5(List list) {
        this.f78482a = list;
        this.f78483b = new X0[list.size()];
    }

    private final boolean d(GQ gq2, int i10) {
        if (gq2.r() == 0) {
            return false;
        }
        if (gq2.C() != i10) {
            this.f78484c = false;
        }
        this.f78485d--;
        return this.f78484c;
    }
}
