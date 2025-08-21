package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class B5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final Z5 f66271a;

    /* renamed from: e, reason: collision with root package name */
    private long f66275e;

    /* renamed from: g, reason: collision with root package name */
    private String f66277g;

    /* renamed from: h, reason: collision with root package name */
    private X0 f66278h;

    /* renamed from: i, reason: collision with root package name */
    private A5 f66279i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f66280j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f66282l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f66276f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    private final N5 f66272b = new N5(7, 128);

    /* renamed from: c, reason: collision with root package name */
    private final N5 f66273c = new N5(8, 128);

    /* renamed from: d, reason: collision with root package name */
    private final N5 f66274d = new N5(6, 128);

    /* renamed from: k, reason: collision with root package name */
    private long f66281k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private final GQ f66283m = new GQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f66281k = j10;
        int i11 = i10 & 2;
        this.f66282l = (i11 != 0) | this.f66282l;
    }

    private final void d(byte[] bArr, int i10, int i11) {
        if (!this.f66280j) {
            this.f66272b.a(bArr, i10, i11);
            this.f66273c.a(bArr, i10, i11);
        }
        this.f66274d.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r19) {
        /*
            Method dump skipped, instructions count: 455
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.B5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
        C8211gC.b(this.f66278h);
        int i10 = OV.f69931a;
        if (z10) {
            this.f66271a.c();
            this.f66279i.a(this.f66275e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f66275e = 0L;
        this.f66282l = false;
        this.f66281k = -9223372036854775807L;
        C9310qa0.h(this.f66276f);
        this.f66272b.b();
        this.f66273c.b();
        this.f66274d.b();
        this.f66271a.c();
        A5 a52 = this.f66279i;
        if (a52 != null) {
            a52.d();
        }
    }

    public B5(Z5 z52, boolean z10, boolean z11) {
        this.f66271a = z52;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f66277g = c8518j6.b();
        X0 x0A = interfaceC9575t0.a(c8518j6.a(), 2);
        this.f66278h = x0A;
        this.f66279i = new A5(x0A, false, false);
        this.f66271a.b(interfaceC9575t0, c8518j6);
    }
}
