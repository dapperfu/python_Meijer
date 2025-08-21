package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10227z5 implements InterfaceC9692u5 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f81196l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final C8946n6 f81197a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f81198b;

    /* renamed from: e, reason: collision with root package name */
    private final N5 f81201e;

    /* renamed from: f, reason: collision with root package name */
    private C10120y5 f81202f;

    /* renamed from: g, reason: collision with root package name */
    private long f81203g;

    /* renamed from: h, reason: collision with root package name */
    private String f81204h;

    /* renamed from: i, reason: collision with root package name */
    private X0 f81205i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f81206j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f81199c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final C10013x5 f81200d = new C10013x5(128);

    /* renamed from: k, reason: collision with root package name */
    private long f81207k = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void b(long j10, int i10) {
        this.f81207k = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r19) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10227z5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zzc(boolean z10) {
        C8211gC.b(this.f81202f);
        if (z10) {
            this.f81202f.b(this.f81203g, 0, this.f81206j);
            this.f81202f.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void zze() {
        C9310qa0.h(this.f81199c);
        this.f81200d.b();
        C10120y5 c10120y5 = this.f81202f;
        if (c10120y5 != null) {
            c10120y5.d();
        }
        N5 n52 = this.f81201e;
        if (n52 != null) {
            n52.b();
        }
        this.f81203g = 0L;
        this.f81207k = -9223372036854775807L;
    }

    C10227z5(C8946n6 c8946n6) {
        GQ gq2;
        this.f81197a = c8946n6;
        if (c8946n6 != null) {
            this.f81201e = new N5(178, 128);
            gq2 = new GQ();
        } else {
            gq2 = null;
            this.f81201e = null;
        }
        this.f81198b = gq2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9692u5
    public final void c(InterfaceC9575t0 interfaceC9575t0, C8518j6 c8518j6) {
        c8518j6.c();
        this.f81204h = c8518j6.b();
        X0 x0A = interfaceC9575t0.a(c8518j6.a(), 2);
        this.f81205i = x0A;
        this.f81202f = new C10120y5(x0A);
        C8946n6 c8946n6 = this.f81197a;
        if (c8946n6 != null) {
            c8946n6.b(interfaceC9575t0, c8518j6);
        }
    }
}
