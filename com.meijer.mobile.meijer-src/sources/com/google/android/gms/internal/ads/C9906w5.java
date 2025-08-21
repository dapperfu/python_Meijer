package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9906w5 implements InterfaceC9692u5 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f80252q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f80253a;

    /* renamed from: b, reason: collision with root package name */
    private X0 f80254b;

    /* renamed from: c, reason: collision with root package name */
    private final C8946n6 f80255c;

    /* renamed from: d, reason: collision with root package name */
    private final GQ f80256d;

    /* renamed from: e, reason: collision with root package name */
    private final N5 f80257e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f80258f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final C9799v5 f80259g = new C9799v5(128);

    /* renamed from: h, reason: collision with root package name */
    private long f80260h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f80261i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f80262j;

    /* renamed from: k, reason: collision with root package name */
    private long f80263k;

    /* renamed from: l, reason: collision with root package name */
    private long f80264l;

    /* renamed from: m, reason: collision with root package name */
    private long f80265m;

    /* renamed from: n, reason: collision with root package name */
    private long f80266n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f80267o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f80268p;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f80264l = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r21) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9906w5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
        C8211gC.b(this.f80254b);
        if (z10) {
            boolean z11 = this.f80267o;
            long j10 = this.f80260h - this.f80265m;
            this.f80254b.a(this.f80266n, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        C9310qa0.h(this.f80258f);
        this.f80259g.b();
        N5 n52 = this.f80257e;
        if (n52 != null) {
            n52.b();
        }
        this.f80260h = 0L;
        this.f80261i = false;
        this.f80264l = -9223372036854775807L;
        this.f80266n = -9223372036854775807L;
    }

    C9906w5(C8946n6 c8946n6) {
        GQ gq2;
        this.f80255c = c8946n6;
        if (c8946n6 != null) {
            this.f80257e = new N5(178, 128);
            gq2 = new GQ();
        } else {
            gq2 = null;
            this.f80257e = null;
        }
        this.f80256d = gq2;
        this.f80264l = -9223372036854775807L;
        this.f80266n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f80253a = c8518j6.b();
        this.f80254b = interfaceC9575t0.a(c8518j6.a(), 2);
        C8946n6 c8946n6 = this.f80255c;
        if (c8946n6 != null) {
            c8946n6.b(interfaceC9575t0, c8518j6);
        }
    }
}
