package com.google.android.gms.internal.ads;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes6.dex */
public final class G5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final GQ f67079a;

    /* renamed from: b, reason: collision with root package name */
    private final J0 f67080b;

    /* renamed from: c, reason: collision with root package name */
    private final String f67081c;

    /* renamed from: d, reason: collision with root package name */
    private final int f67082d;

    /* renamed from: e, reason: collision with root package name */
    private X0 f67083e;

    /* renamed from: f, reason: collision with root package name */
    private String f67084f;

    /* renamed from: g, reason: collision with root package name */
    private int f67085g = 0;

    /* renamed from: h, reason: collision with root package name */
    private int f67086h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f67087i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f67088j;

    /* renamed from: k, reason: collision with root package name */
    private long f67089k;

    /* renamed from: l, reason: collision with root package name */
    private int f67090l;

    /* renamed from: m, reason: collision with root package name */
    private long f67091m;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f67091m = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f67085g = 0;
        this.f67086h = 0;
        this.f67088j = false;
        this.f67091m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void a(GQ gq2) {
        C8086gC.b(this.f67083e);
        while (gq2.r() > 0) {
            int i10 = this.f67085g;
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
                    boolean z11 = this.f67088j && (b10 & 224) == 224;
                    this.f67088j = z10;
                    if (z11) {
                        gq2.l(i11);
                        this.f67088j = false;
                        this.f67079a.n()[1] = bArrN[iT];
                        this.f67086h = 2;
                        this.f67085g = 1;
                        break;
                    }
                    iT = i11;
                }
            } else if (i10 != 1) {
                int iMin = Math.min(gq2.r(), this.f67090l - this.f67086h);
                this.f67083e.c(gq2, iMin);
                int i12 = this.f67086h + iMin;
                this.f67086h = i12;
                if (i12 >= this.f67090l) {
                    C8086gC.f(this.f67091m != -9223372036854775807L);
                    this.f67083e.a(this.f67091m, 1, this.f67090l, 0, null);
                    this.f67091m += this.f67089k;
                    this.f67086h = 0;
                    this.f67085g = 0;
                }
            } else {
                int iMin2 = Math.min(gq2.r(), 4 - this.f67086h);
                gq2.h(this.f67079a.n(), this.f67086h, iMin2);
                int i13 = this.f67086h + iMin2;
                this.f67086h = i13;
                if (i13 >= 4) {
                    this.f67079a.l(0);
                    if (this.f67080b.a(this.f67079a.w())) {
                        this.f67090l = this.f67080b.f67742c;
                        if (!this.f67087i) {
                            this.f67089k = (r0.f67746g * 1000000) / r0.f67743d;
                            C9592uH0 c9592uH0 = new C9592uH0();
                            c9592uH0.m(this.f67084f);
                            c9592uH0.B(this.f67080b.f67741b);
                            c9592uH0.r(RecyclerView.m.FLAG_APPEARED_IN_PRE_LAYOUT);
                            c9592uH0.r0(this.f67080b.f67744e);
                            c9592uH0.C(this.f67080b.f67743d);
                            c9592uH0.q(this.f67081c);
                            c9592uH0.y(this.f67082d);
                            this.f67083e.d(c9592uH0.H());
                            this.f67087i = true;
                        }
                        this.f67079a.l(0);
                        this.f67083e.c(this.f67079a, 4);
                        this.f67085g = 2;
                    } else {
                        this.f67086h = 0;
                        this.f67085g = 1;
                    }
                }
            }
        }
    }

    public G5(String str, int i10) {
        GQ gq2 = new GQ(4);
        this.f67079a = gq2;
        gq2.n()[0] = -1;
        this.f67080b = new J0();
        this.f67091m = -9223372036854775807L;
        this.f67081c = str;
        this.f67082d = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f67084f = c8393j6.b();
        this.f67083e = interfaceC9450t0.a(c8393j6.a(), 1);
    }
}
