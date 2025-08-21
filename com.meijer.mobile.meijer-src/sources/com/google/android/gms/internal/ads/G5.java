package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class G5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f67919a;

    /* renamed from: b, reason: collision with root package name */
    private final J0 f67920b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67921c;

    /* renamed from: d, reason: collision with root package name */
    private final int f67922d;

    /* renamed from: e, reason: collision with root package name */
    private X0 f67923e;

    /* renamed from: f, reason: collision with root package name */
    private String f67924f;

    /* renamed from: g, reason: collision with root package name */
    private int f67925g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f67926h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f67927i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f67928j;

    /* renamed from: k, reason: collision with root package name */
    private long f67929k;

    /* renamed from: l, reason: collision with root package name */
    private int f67930l;

    /* renamed from: m, reason: collision with root package name */
    private long f67931m;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f67931m = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f67925g = 0;
        this.f67926h = 0;
        this.f67928j = false;
        this.f67931m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void a(GQ gq2) {
        C8211gC.b(this.f67923e);
        while (gq2.r() > 0) {
            int i10 = this.f67925g;
            if (i10 == 0) {
                byte[] bArrN = gq2.n();
                int iT = gq2.t();
                int iU = gq2.u();
                while (true) {
                    if (iT >= iU) {
                        gq2.l(iU);
                        break;
                    }
                    int i11 = iT + 1;
                    byte b10 = bArrN[iT];
                    boolean z10 = (b10 & 255) == 255;
                    boolean z11 = this.f67928j && (b10 & 224) == 224;
                    this.f67928j = z10;
                    if (z11) {
                        gq2.l(i11);
                        this.f67928j = false;
                        this.f67919a.n()[1] = bArrN[iT];
                        this.f67926h = 2;
                        this.f67925g = 1;
                        break;
                    }
                    iT = i11;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(gq2.r(), this.f67930l - this.f67926h);
                this.f67923e.c(gq2, iMin);
                int i12 = this.f67926h + iMin;
                this.f67926h = i12;
                if (i12 >= this.f67930l) {
                    C8211gC.f(this.f67931m != -9223372036854775807L);
                    this.f67923e.a(this.f67931m, 1, this.f67930l, 0, null);
                    this.f67931m += this.f67929k;
                    this.f67926h = 0;
                    this.f67925g = 0;
                }
            } else {
                int iMin2 = Math.min(gq2.r(), 4 - this.f67926h);
                gq2.h(this.f67919a.n(), this.f67926h, iMin2);
                int i13 = this.f67926h + iMin2;
                this.f67926h = i13;
                if (i13 >= 4) {
                    this.f67919a.l(0);
                    if (this.f67920b.a(this.f67919a.w())) {
                        this.f67930l = this.f67920b.f68582c;
                        if (!this.f67927i) {
                            this.f67929k = (r0.f68586g * 1000000) / r0.f68583d;
                            C9717uH0 c9717uH0 = new C9717uH0();
                            c9717uH0.m(this.f67924f);
                            c9717uH0.B(this.f67920b.f68581b);
                            c9717uH0.r(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                            c9717uH0.r0(this.f67920b.f68584e);
                            c9717uH0.C(this.f67920b.f68583d);
                            c9717uH0.q(this.f67921c);
                            c9717uH0.y(this.f67922d);
                            this.f67923e.d(c9717uH0.H());
                            this.f67927i = true;
                        }
                        this.f67919a.l(0);
                        this.f67923e.c(this.f67919a, 4);
                        this.f67925g = 2;
                    } else {
                        this.f67926h = 0;
                        this.f67925g = 1;
                    }
                }
            }
        }
    }

    public G5(String str, int i10) {
        GQ gq2 = new GQ(4);
        this.f67919a = gq2;
        gq2.n()[0] = -1;
        this.f67920b = new J0();
        this.f67931m = -9223372036854775807L;
        this.f67921c = str;
        this.f67922d = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f67924f = c8518j6.b();
        this.f67923e = interfaceC9575t0.a(c8518j6.a(), 1);
    }
}
