package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class D5 implements InterfaceC9692u5 {

    /* renamed from: a, reason: collision with root package name */
    private final Z5 f66980a;

    /* renamed from: b, reason: collision with root package name */
    private String f66981b;

    /* renamed from: c, reason: collision with root package name */
    private X0 f66982c;

    /* renamed from: d, reason: collision with root package name */
    private C5 f66983d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f66984e;

    /* renamed from: l, reason: collision with root package name */
    private long f66991l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f66985f = new boolean[3];

    /* renamed from: g, reason: collision with root package name */
    private final N5 f66986g = new N5(32, 128);

    /* renamed from: h, reason: collision with root package name */
    private final N5 f66987h = new N5(33, 128);

    /* renamed from: i, reason: collision with root package name */
    private final N5 f66988i = new N5(34, 128);

    /* renamed from: j, reason: collision with root package name */
    private final N5 f66989j = new N5(39, 128);

    /* renamed from: k, reason: collision with root package name */
    private final N5 f66990k = new N5(40, 128);

    /* renamed from: m, reason: collision with root package name */
    private long f66992m = -9223372036854775807L;

    /* renamed from: n, reason: collision with root package name */
    private final GQ f66993n = new GQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f66992m = j10;
    }

    private final void d(byte[] bArr, int i10, int i11) {
        this.f66983d.c(bArr, i10, i11);
        if (!this.f66984e) {
            this.f66986g.a(bArr, i10, i11);
            this.f66987h.a(bArr, i10, i11);
            this.f66988i.a(bArr, i10, i11);
        }
        this.f66989j.a(bArr, i10, i11);
        this.f66990k.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
        C8211gC.b(this.f66982c);
        int i10 = OV.f69931a;
        if (z10) {
            this.f66980a.c();
            this.f66983d.a(this.f66991l);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        this.f66991l = 0L;
        this.f66992m = -9223372036854775807L;
        C9310qa0.h(this.f66985f);
        this.f66986g.b();
        this.f66987h.b();
        this.f66988i.b();
        this.f66989j.b();
        this.f66990k.b();
        this.f66980a.c();
        C5 c52 = this.f66983d;
        if (c52 != null) {
            c52.d();
        }
    }

    public D5(Z5 z52) {
        this.f66980a = z52;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f66981b = c8518j6.b();
        X0 x0A = interfaceC9575t0.a(c8518j6.a(), 2);
        this.f66982c = x0A;
        this.f66983d = new C5(x0A);
        this.f66980a.b(interfaceC9575t0, c8518j6);
    }
}
