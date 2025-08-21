package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class X5 implements InterfaceC8625k6 {

    /* renamed from: a, reason: collision with root package name */
    private final W5 f72094a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f72095b = new GQ(32);

    /* renamed from: c, reason: collision with root package name */
    private int f72096c;

    /* renamed from: d, reason: collision with root package name */
    private int f72097d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f72098e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f72099f;

    @Override // com.google.android.gms.internal.ads.InterfaceC8625k6
    public final void a(GQ gq2, int i10) {
        int i11 = i10 & 1;
        int iT = i11 != 0 ? gq2.t() + gq2.C() : -1;
        if (this.f72099f) {
            if (i11 == 0) {
                return;
            }
            this.f72099f = false;
            gq2.l(iT);
            this.f72097d = 0;
        }
        while (gq2.r() > 0) {
            int i12 = this.f72097d;
            if (i12 < 3) {
                if (i12 == 0) {
                    int iC = gq2.C();
                    gq2.l(gq2.t() - 1);
                    if (iC == 255) {
                        this.f72099f = true;
                        return;
                    }
                }
                int iMin = Math.min(gq2.r(), 3 - this.f72097d);
                gq2.h(this.f72095b.n(), this.f72097d, iMin);
                int i13 = this.f72097d + iMin;
                this.f72097d = i13;
                if (i13 == 3) {
                    this.f72095b.l(0);
                    this.f72095b.k(3);
                    this.f72095b.m(1);
                    GQ gq3 = this.f72095b;
                    int iC2 = gq3.C();
                    boolean z10 = (iC2 & 128) != 0;
                    int iC3 = gq3.C();
                    this.f72098e = z10;
                    this.f72096c = (iC3 | ((iC2 & 15) << 8)) + 3;
                    int iS = this.f72095b.s();
                    int i14 = this.f72096c;
                    if (iS < i14) {
                        int iS2 = this.f72095b.s();
                        this.f72095b.f(Math.min(4098, Math.max(i14, iS2 + iS2)));
                    }
                }
            } else {
                int iMin2 = Math.min(gq2.r(), this.f72096c - i12);
                gq2.h(this.f72095b.n(), this.f72097d, iMin2);
                int i15 = this.f72097d + iMin2;
                this.f72097d = i15;
                int i16 = this.f72096c;
                if (i15 != i16) {
                    continue;
                } else {
                    if (!this.f72098e) {
                        this.f72095b.k(i16);
                    } else {
                        if (OV.x(this.f72095b.n(), 0, i16, -1) != 0) {
                            this.f72099f = true;
                            return;
                        }
                        this.f72095b.k(this.f72096c - 4);
                    }
                    this.f72095b.l(0);
                    this.f72094a.a(this.f72095b);
                    this.f72097d = 0;
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8625k6
    public final void zzc() {
        this.f72099f = true;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC8625k6
    public final void b(C8982nU c8982nU, InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        this.f72094a.b(c8982nU, interfaceC9575t0, c8518j6);
        this.f72099f = true;
    }

    public X5(W5 w52) {
        this.f72094a = w52;
    }
}
