package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class X5 implements InterfaceC8500k6 {

    /* renamed from: a, reason: collision with root package name */
    private final W5 f71254a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f71255b = new GQ(32);

    /* renamed from: c, reason: collision with root package name */
    private int f71256c;

    /* renamed from: d, reason: collision with root package name */
    private int f71257d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f71258e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f71259f;

    @Override // com.google.android.gms.internal.ads.InterfaceC8500k6
    public final void a(GQ gq2, int i10) {
        int i11 = i10 & 1;
        int iT = i11 != 0 ? gq2.t() + gq2.C() : -1;
        if (this.f71259f) {
            if (i11 == 0) {
                return;
            }
            this.f71259f = false;
            gq2.l(iT);
            this.f71257d = 0;
        }
        while (gq2.r() > 0) {
            int i12 = this.f71257d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iC = gq2.C();
                    gq2.l(gq2.t() - 1);
                    if (iC == 255) {
                        this.f71259f = true;
                        return;
                    }
                }
                int iMin = Math.min(gq2.r(), 3 - this.f71257d);
                gq2.h(this.f71255b.n(), this.f71257d, iMin);
                int i13 = this.f71257d + iMin;
                this.f71257d = i13;
                if (i13 == 3) {
                    this.f71255b.l(0);
                    this.f71255b.k(3);
                    this.f71255b.m(1);
                    GQ gq3 = this.f71255b;
                    int iC2 = gq3.C();
                    boolean z10 = (iC2 & 128) != 0;
                    int iC3 = gq3.C();
                    this.f71258e = z10;
                    this.f71256c = (iC3 | ((iC2 & 15) << 8)) + 3;
                    int iS = this.f71255b.s();
                    int i14 = this.f71256c;
                    if (iS < i14) {
                        int iS2 = this.f71255b.s();
                        this.f71255b.f(Math.min(4098, Math.max(i14, iS2 + iS2)));
                    }
                }
            } else {
                int iMin2 = Math.min(gq2.r(), this.f71256c - i12);
                gq2.h(this.f71255b.n(), this.f71257d, iMin2);
                int i15 = this.f71257d + iMin2;
                this.f71257d = i15;
                int i16 = this.f71256c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f71258e) {
                        this.f71255b.k(i16);
                    } else {
                        if (OV.x(this.f71255b.n(), 0, i16, -1) != 0) {
                            this.f71259f = true;
                            return;
                        }
                        this.f71255b.k(this.f71256c - 4);
                    }
                    this.f71255b.l(0);
                    this.f71254a.a(this.f71255b);
                    this.f71257d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8500k6
    public final void zzc() {
        this.f71259f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8500k6
    public final void b(C8857nU c8857nU, InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        this.f71254a.b(c8857nU, interfaceC9450t0, c8393j6);
        this.f71259f = true;
    }

    public X5(W5 w52) {
        this.f71254a = w52;
    }
}
