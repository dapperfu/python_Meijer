package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.t5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9585t5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final List f79322a;

    /* renamed from: b, reason: collision with root package name */
    private final X0[] f79323b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f79324c;

    /* renamed from: d, reason: collision with root package name */
    private int f79325d;

    /* renamed from: e, reason: collision with root package name */
    private int f79326e;

    /* renamed from: f, reason: collision with root package name */
    private long f79327f = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        if ((i10 & 4) == 0) {
            return;
        }
        this.f79324c = true;
        this.f79327f = j10;
        this.f79326e = 0;
        this.f79325d = 2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        for (int i10 = 0; i10 < this.f79323b.length; i10++) {
            C8199g6 c8199g6 = (C8199g6) this.f79322a.get(i10);
            c8518j6.c();
            X0 x0A = interfaceC9575t0.a(c8518j6.a(), 3);
            C9717uH0 c9717uH0 = new C9717uH0();
            c9717uH0.m(c8518j6.b());
            c9717uH0.B("application/dvbsubs");
            c9717uH0.n(Collections.singletonList(c8199g6.f75081b));
            c9717uH0.q(c8199g6.f75080a);
            x0A.d(c9717uH0.H());
            this.f79323b[i10] = x0A;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f79324c = false;
        this.f79327f = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void a(GQ gq2) {
        if (this.f79324c) {
            if (this.f79325d != 2 || d(gq2, 32)) {
                if (this.f79325d != 1 || d(gq2, 0)) {
                    int iT = gq2.t();
                    int iR = gq2.r();
                    for (X0 x02 : this.f79323b) {
                        gq2.l(iT);
                        x02.c(gq2, iR);
                    }
                    this.f79326e += iR;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
        if (this.f79324c) {
            C8211gC.f(this.f79327f != -9223372036854775807L);
            for (X0 x02 : this.f79323b) {
                x02.a(this.f79327f, 1, this.f79326e, 0, null);
            }
            this.f79324c = false;
        }
    }

    public C9585t5(List list) {
        this.f79322a = list;
        this.f79323b = new X0[list.size()];
    }

    private final boolean d(GQ gq2, int i10) {
        if (gq2.r() == 0) {
            return false;
        }
        if (gq2.C() != i10) {
            this.f79324c = false;
        }
        this.f79325d--;
        return this.f79324c;
    }
}
