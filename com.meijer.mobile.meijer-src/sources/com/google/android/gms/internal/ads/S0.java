package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* loaded from: classes6.dex */
public final class S0 implements InterfaceC9255q0 {

    /* renamed from: a, reason: collision with root package name */
    private final int f70821a;

    /* renamed from: b, reason: collision with root package name */
    private final int f70822b;

    /* renamed from: c, reason: collision with root package name */
    private final String f70823c;

    /* renamed from: d, reason: collision with root package name */
    private int f70824d;

    /* renamed from: e, reason: collision with root package name */
    private int f70825e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC9575t0 f70826f;

    /* renamed from: g, reason: collision with root package name */
    private X0 f70827g;

    public S0(int i10, int i11, String str) {
        this.f70821a = i10;
        this.f70822b = i11;
        this.f70823c = str;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void a(long j10, long j11) {
        if (j10 == 0 || this.f70825e == 1) {
            this.f70825e = 1;
            this.f70824d = 0;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ InterfaceC9255q0 zzc() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final int b(InterfaceC9361r0 interfaceC9361r0, N0 n02) throws IOException {
        int i10 = this.f70825e;
        if (i10 != 1) {
            if (i10 == 2) {
                return -1;
            }
            throw new IllegalStateException();
        }
        X0 x02 = this.f70827g;
        x02.getClass();
        int iB = x02.b(interfaceC9361r0, 1024, true);
        if (iB == -1) {
            this.f70825e = 2;
            this.f70827g.a(0L, 1, this.f70824d, 0, null);
            this.f70824d = 0;
        } else {
            this.f70824d += iB;
        }
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final boolean c(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        C8211gC.f((this.f70821a == -1 || this.f70822b == -1) ? false : true);
        GQ gq2 = new GQ(this.f70822b);
        ((C8080f0) interfaceC9361r0).c(gq2.n(), 0, this.f70822b, false);
        return gq2.G() == this.f70821a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final void d(InterfaceC9575t0 interfaceC9575t0) {
        this.f70826f = interfaceC9575t0;
        X0 x0A = interfaceC9575t0.a(1024, 4);
        this.f70827g = x0A;
        C9717uH0 c9717uH0 = new C9717uH0();
        c9717uH0.B(this.f70823c);
        x0A.d(c9717uH0.H());
        this.f70826f.e();
        this.f70826f.m(new T0(-9223372036854775807L));
        this.f70825e = 1;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9255q0
    public final /* synthetic */ List zzd() {
        return AbstractC8042eh0.t();
    }
}
