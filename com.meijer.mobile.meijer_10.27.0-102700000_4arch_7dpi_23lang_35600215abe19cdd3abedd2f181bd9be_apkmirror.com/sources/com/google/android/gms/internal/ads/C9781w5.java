package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.w5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C9781w5 implements InterfaceC9567u5 {

    /* renamed from: q, reason: collision with root package name */
    private static final double[] f79412q = {23.976023976023978d, 24.0d, 25.0d, 29.97002997002997d, 30.0d, 50.0d, 59.94005994005994d, 60.0d};

    /* renamed from: a, reason: collision with root package name */
    private String f79413a;

    /* renamed from: b, reason: collision with root package name */
    private X0 f79414b;

    /* renamed from: c, reason: collision with root package name */
    private final C8821n6 f79415c;

    /* renamed from: d, reason: collision with root package name */
    private final GQ f79416d;

    /* renamed from: e, reason: collision with root package name */
    private final N5 f79417e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean[] f79418f = new boolean[4];

    /* renamed from: g, reason: collision with root package name */
    private final C9674v5 f79419g = new C9674v5(128);

    /* renamed from: h, reason: collision with root package name */
    private long f79420h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f79421i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f79422j;

    /* renamed from: k, reason: collision with root package name */
    private long f79423k;

    /* renamed from: l, reason: collision with root package name */
    private long f79424l;

    /* renamed from: m, reason: collision with root package name */
    private long f79425m;

    /* renamed from: n, reason: collision with root package name */
    private long f79426n;

    /* renamed from: o, reason: collision with root package name */
    private boolean f79427o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f79428p;

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void b(long j10, int i10) {
        this.f79424l = j10;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0129  */
    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(com.google.android.gms.internal.ads.GQ r21) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C9781w5.a(com.google.android.gms.internal.ads.GQ):void");
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zzc(boolean z10) {
        C8086gC.b(this.f79414b);
        if (z10) {
            boolean z11 = this.f79427o;
            long j10 = this.f79420h - this.f79425m;
            this.f79414b.a(this.f79426n, z11 ? 1 : 0, (int) j10, 0, null);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void zze() {
        C9185qa0.h(this.f79418f);
        this.f79419g.b();
        N5 n52 = this.f79417e;
        if (n52 != null) {
            n52.b();
        }
        this.f79420h = 0L;
        this.f79421i = false;
        this.f79424l = -9223372036854775807L;
        this.f79426n = -9223372036854775807L;
    }

    C9781w5(C8821n6 c8821n6) {
        GQ gq2;
        this.f79415c = c8821n6;
        if (c8821n6 != null) {
            this.f79417e = new N5(178, 128);
            gq2 = new GQ();
        } else {
            gq2 = null;
            this.f79417e = null;
        }
        this.f79416d = gq2;
        this.f79424l = -9223372036854775807L;
        this.f79426n = -9223372036854775807L;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC9567u5
    public final void c(InterfaceC9450t0 interfaceC9450t0, C8393j6 c8393j6) {
        c8393j6.c();
        this.f79413a = c8393j6.b();
        this.f79414b = interfaceC9450t0.a(c8393j6.a(), 2);
        C8821n6 c8821n6 = this.f79415c;
        if (c8821n6 != null) {
            c8821n6.b(interfaceC9450t0, c8393j6);
        }
    }
}
