package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class B5 implements InterfaceC9567u5 {

    /* renamed from: a, reason: collision with root package name */
    private final Z5 f65431a;

    /* renamed from: e, reason: collision with root package name */
    private long f65435e;

    /* renamed from: g, reason: collision with root package name */
    private String f65437g;

    /* renamed from: h, reason: collision with root package name */
    private X0 f65438h;

    /* renamed from: i, reason: collision with root package name */
    private A5 f65439i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f65440j;

    /* renamed from: l, reason: collision with root package name */
    private boolean f65442l;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f65436f = new boolean[3];

    /* renamed from: b, reason: collision with root package name */
    private final N5 f65432b = new N5(7, 128);

    /* renamed from: c, reason: collision with root package name */
    private final N5 f65433c = new N5(8, 128);

    /* renamed from: d, reason: collision with root package name */
    private final N5 f65434d = new N5(6, 128);

    /* renamed from: k, reason: collision with root package name */
    private long f65441k = -9223372036854775807L;

    /* renamed from: m, reason: collision with root package name */
    private final GQ f65443m = new GQ();

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f65441k = j10;
        int i11 = i10 & 2;
        this.f65442l = (i11 != 0) | this.f65442l;
    }

    private final void d(byte[] bArr, int i10, int i11) {
        if (!this.f65440j) {
            this.f65432b.a(bArr, i10, i11);
            this.f65433c.a(bArr, i10, i11);
        }
        this.f65434d.a(bArr, i10, i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
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

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
        C8086gC.b(this.f65438h);
        int i10 = OV.f69091a;
        if (z10) {
            this.f65431a.c();
            this.f65439i.a(this.f65435e);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        this.f65435e = 0L;
        this.f65442l = false;
        this.f65441k = -9223372036854775807L;
        C9185qa0.h(this.f65436f);
        this.f65432b.b();
        this.f65433c.b();
        this.f65434d.b();
        this.f65431a.c();
        A5 a52 = this.f65439i;
        if (a52 != null) {
            a52.d();
        }
    }

    public B5(Z5 z52, boolean z10, boolean z11) {
        this.f65431a = z52;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f65437g = c8393j6.b();
        X0 x0A = interfaceC9450t0.a(c8393j6.a(), 2);
        this.f65438h = x0A;
        this.f65439i = new A5(x0A, false, false);
        this.f65431a.b(interfaceC9450t0, c8393j6);
    }
}
