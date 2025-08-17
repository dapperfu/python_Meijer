package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class R3 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private final W3 f69763a;

    /* renamed from: b, reason: collision with root package name */
    private final long f69764b;

    /* renamed from: c, reason: collision with root package name */
    private final long f69765c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7643c4 f69766d;

    /* renamed from: e, reason: collision with root package name */
    private int f69767e;

    /* renamed from: f, reason: collision with root package name */
    private long f69768f;

    /* renamed from: g, reason: collision with root package name */
    private long f69769g;

    /* renamed from: h, reason: collision with root package name */
    private long f69770h;

    /* renamed from: i, reason: collision with root package name */
    private long f69771i;

    /* renamed from: j, reason: collision with root package name */
    private long f69772j;

    /* renamed from: k, reason: collision with root package name */
    private long f69773k;

    /* renamed from: l, reason: collision with root package name */
    private long f69774l;

    @Override // com.google.android.gms.internal.ads.X3
    public final /* bridge */ /* synthetic */ Q0 zze() {
        Q3 q32 = null;
        if (this.f69768f != 0) {
            return new P3(this, q32);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00bd A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00be  */
    @Override // com.google.android.gms.internal.ads.X3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final long a(com.google.android.gms.internal.ads.InterfaceC9236r0 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.R3.a(com.google.android.gms.internal.ads.r0):long");
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final void zzg(long j10) {
        this.f69770h = Math.max(0L, Math.min(j10, this.f69768f - 1));
        this.f69767e = 2;
        this.f69771i = this.f69764b;
        this.f69772j = this.f69765c;
        this.f69773k = 0L;
        this.f69774l = this.f69768f;
    }

    public R3(AbstractC7643c4 abstractC7643c4, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        C8086gC.d(z11);
        this.f69766d = abstractC7643c4;
        this.f69764b = j10;
        this.f69765c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f69767e = 0;
        } else {
            this.f69768f = j13;
            this.f69767e = 4;
        }
        this.f69763a = new W3();
    }
}
