package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class D5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final Z5 f66140a;

    /* renamed from: b, reason: collision with root package name */
    private String f66141b;

    /* renamed from: c, reason: collision with root package name */
    private X0 f66142c;

    /* renamed from: d, reason: collision with root package name */
    private C5 f66143d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f66144e;

    /* renamed from: l, reason: collision with root package name */
    private long f66151l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f66145f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final N5 f66146g = new N5(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final N5 f66147h = new N5(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final N5 f66148i = new N5(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final N5 f66149j = new N5(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final N5 f66150k = new N5(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f66152m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final GQ f66153n = new GQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f66152m = j10;
    }

    private final void d(byte[] bArr, int i10, int i11) {
        this.f66143d.c(bArr, i10, i11);
        if (!this.f66144e) {
            this.f66146g.a(bArr, i10, i11);
            this.f66147h.a(bArr, i10, i11);
            this.f66148i.a(bArr, i10, i11);
        }
        this.f66149j.a(bArr, i10, i11);
        this.f66150k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r29) {
        /*
            Method dump skipped, instructions count: 483
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.D5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
        C8086gC.b(this.f66142c);
        int i10 = OV.f69091a;
        if (z10) {
            this.f66140a.c();
            this.f66143d.a(this.f66151l);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f66151l = 0L;
        this.f66152m = -9223372036854775807L;
        C9185qa0.h(this.f66145f);
        this.f66146g.b();
        this.f66147h.b();
        this.f66148i.b();
        this.f66149j.b();
        this.f66150k.b();
        this.f66140a.c();
        C5 c52 = this.f66143d;
        if (c52 != null) {
            c52.d();
        }
    }

    public D5(Z5 z52) {
        this.f66140a = z52;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f66141b = c8393j6.b();
        X0 x0A = interfaceC9450t0.a(c8393j6.a(), 2);
        this.f66142c = x0A;
        this.f66143d = new C5(x0A);
        this.f66140a.b(interfaceC9450t0, c8393j6);
    }
}
