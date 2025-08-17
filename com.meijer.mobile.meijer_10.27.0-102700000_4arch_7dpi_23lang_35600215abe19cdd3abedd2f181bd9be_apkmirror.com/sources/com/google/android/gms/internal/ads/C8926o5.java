package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.o5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C8926o5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final C7999fQ f77300a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f77301b;

    /* renamed from: c, reason: collision with root package name */
    private final String f77302c;

    /* renamed from: d, reason: collision with root package name */
    private final int f77303d;

    /* renamed from: e, reason: collision with root package name */
    private String f77304e;

    /* renamed from: f, reason: collision with root package name */
    private X0 f77305f;

    /* renamed from: g, reason: collision with root package name */
    private int f77306g;

    /* renamed from: h, reason: collision with root package name */
    private int f77307h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f77308i;

    /* renamed from: j, reason: collision with root package name */
    private long f77309j;

    /* renamed from: k, reason: collision with root package name */
    private C f77310k;

    /* renamed from: l, reason: collision with root package name */
    private int f77311l;

    /* renamed from: m, reason: collision with root package name */
    private long f77312m;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f77312m = j10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f77306g = 0;
        this.f77307h = 0;
        this.f77308i = false;
        this.f77312m = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void a(GQ gq2) {
        C8086gC.b(this.f77305f);
        while (gq2.r() > 0) {
            int i10 = this.f77306g;
            if (i10 == 0) {
                while (gq2.r() > 0) {
                    if (this.f77308i) {
                        int iC = gq2.C();
                        this.f77308i = iC == 172;
                        if (iC != 64) {
                            if (iC == 65) {
                                iC = 65;
                            }
                        }
                        this.f77306g = 1;
                        GQ gq3 = this.f77301b;
                        gq3.n()[0] = -84;
                        gq3.n()[1] = iC == 65 ? (byte) 65 : (byte) 64;
                        this.f77307h = 2;
                    } else {
                        this.f77308i = gq2.C() == 172;
                    }
                }
            } else if (i10 != 1) {
                int iMin = Math.min(gq2.r(), this.f77311l - this.f77307h);
                this.f77305f.c(gq2, iMin);
                int i11 = this.f77307h + iMin;
                this.f77307h = i11;
                if (i11 == this.f77311l) {
                    C8086gC.f(this.f77312m != -9223372036854775807L);
                    this.f77305f.a(this.f77312m, 1, this.f77311l, 0, null);
                    this.f77312m += this.f77309j;
                    this.f77306g = 0;
                }
            } else {
                byte[] bArrN = this.f77301b.n();
                int iMin2 = Math.min(gq2.r(), 16 - this.f77307h);
                gq2.h(bArrN, this.f77307h, iMin2);
                int i12 = this.f77307h + iMin2;
                this.f77307h = i12;
                if (i12 == 16) {
                    this.f77300a.l(0);
                    Q qA = T.a(this.f77300a);
                    C c10 = this.f77310k;
                    if (c10 == null || c10.f65641D != 2 || qA.f69475a != c10.f65642E || !"audio/ac4".equals(c10.f65664o)) {
                        C9592uH0 c9592uH0 = new C9592uH0();
                        c9592uH0.m(this.f77304e);
                        c9592uH0.B("audio/ac4");
                        c9592uH0.r0(2);
                        c9592uH0.C(qA.f69475a);
                        c9592uH0.q(this.f77302c);
                        c9592uH0.y(this.f77303d);
                        C cH = c9592uH0.H();
                        this.f77310k = cH;
                        this.f77305f.d(cH);
                    }
                    this.f77311l = qA.f69476b;
                    this.f77309j = (qA.f69477c * 1000000) / this.f77310k.f65642E;
                    this.f77301b.l(0);
                    this.f77305f.c(this.f77301b, 16);
                    this.f77306g = 2;
                }
            }
        }
    }

    public C8926o5(String str, int i10) {
        C7999fQ c7999fQ = new C7999fQ(new byte[16], 16);
        this.f77300a = c7999fQ;
        this.f77301b = new GQ(c7999fQ.f74100a);
        this.f77306g = 0;
        this.f77307h = 0;
        this.f77308i = false;
        this.f77312m = -9223372036854775807L;
        this.f77302c = str;
        this.f77303d = i10;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f77304e = c8393j6.b();
        this.f77305f = interfaceC9450t0.a(c8393j6.a(), 1);
    }
}
