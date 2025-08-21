package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class R3 implements X3 {

    /* renamed from: a, reason: collision with root package name */
    private final W3 f70603a;

    /* renamed from: b, reason: collision with root package name */
    private final long f70604b;

    /* renamed from: c, reason: collision with root package name */
    private final long f70605c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC7768c4 f70606d;

    /* renamed from: e, reason: collision with root package name */
    private int f70607e;

    /* renamed from: f, reason: collision with root package name */
    private long f70608f;

    /* renamed from: g, reason: collision with root package name */
    private long f70609g;

    /* renamed from: h, reason: collision with root package name */
    private long f70610h;

    /* renamed from: i, reason: collision with root package name */
    private long f70611i;

    /* renamed from: j, reason: collision with root package name */
    private long f70612j;

    /* renamed from: k, reason: collision with root package name */
    private long f70613k;

    /* renamed from: l, reason: collision with root package name */
    private long f70614l;

    @Override // com.google.android.gms.internal.ads.X3
    public final /* bridge */ /* synthetic */ Q0 zze() {
        Q3 q32 = null;
        if (this.f70608f != 0) {
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
    public final long a(com.google.android.gms.internal.ads.InterfaceC9361r0 r25) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.R3.a(com.google.android.gms.internal.ads.r0):long");
    }

    @Override // com.google.android.gms.internal.ads.X3
    public final void zzg(long j10) {
        this.f70610h = Math.max(0L, Math.min(j10, this.f70608f - 1));
        this.f70607e = 2;
        this.f70611i = this.f70604b;
        this.f70612j = this.f70605c;
        this.f70613k = 0L;
        this.f70614l = this.f70608f;
    }

    public R3(AbstractC7768c4 abstractC7768c4, long j10, long j11, long j12, long j13, boolean z10) {
        boolean z11;
        if (j10 >= 0 && j11 > j10) {
            z11 = true;
        } else {
            z11 = false;
        }
        C8211gC.d(z11);
        this.f70606d = abstractC7768c4;
        this.f70604b = j10;
        this.f70605c = j11;
        if (j12 != j11 - j10 && !z10) {
            this.f70607e = 0;
        } else {
            this.f70608f = j13;
            this.f70607e = 4;
        }
        this.f70603a = new W3();
    }
}
