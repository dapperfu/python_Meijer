package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10102z5 implements InterfaceC9567u5 {

    /* renamed from: l, reason: collision with root package name */
    private static final float[] f80356l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final C8821n6 f80357a;

    /* renamed from: b, reason: collision with root package name */
    private final GQ f80358b;

    /* renamed from: e, reason: collision with root package name */
    private final N5 f80361e;

    /* renamed from: f, reason: collision with root package name */
    private C9995y5 f80362f;

    /* renamed from: g, reason: collision with root package name */
    private long f80363g;

    /* renamed from: h, reason: collision with root package name */
    private String f80364h;

    /* renamed from: i, reason: collision with root package name */
    private X0 f80365i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f80366j;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f80359c = new boolean[4];

    /* renamed from: d, reason: collision with root package name */
    private final C9888x5 f80360d = new C9888x5(128);

    /* renamed from: k, reason: collision with root package name */
    private long f80367k = -9223372036854775807L;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f80367k = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0184  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r19) {
        /*
            Method dump skipped, instructions count: 491
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C10102z5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
        C8086gC.b(this.f80362f);
        if (z10) {
            this.f80362f.b(this.f80363g, 0, this.f80366j);
            this.f80362f.d();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        C9185qa0.h(this.f80359c);
        this.f80360d.b();
        C9995y5 c9995y5 = this.f80362f;
        if (c9995y5 != null) {
            c9995y5.d();
        }
        N5 n52 = this.f80361e;
        if (n52 != null) {
            n52.b();
        }
        this.f80363g = 0L;
        this.f80367k = -9223372036854775807L;
    }

    C10102z5(C8821n6 c8821n6) {
        GQ gq2;
        this.f80357a = c8821n6;
        if (c8821n6 != null) {
            this.f80361e = new N5(178, 128);
            gq2 = new GQ();
        } else {
            gq2 = null;
            this.f80361e = null;
        }
        this.f80358b = gq2;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f80364h = c8393j6.b();
        X0 x0A = interfaceC9450t0.a(c8393j6.a(), 2);
        this.f80365i = x0A;
        this.f80362f = new C9995y5(x0A);
        C8821n6 c8821n6 = this.f80357a;
        if (c8821n6 != null) {
            c8821n6.b(interfaceC9450t0, c8393j6);
        }
    }
}
