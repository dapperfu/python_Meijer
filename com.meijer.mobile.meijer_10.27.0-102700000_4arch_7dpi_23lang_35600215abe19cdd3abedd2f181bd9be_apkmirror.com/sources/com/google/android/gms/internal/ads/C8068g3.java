package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8068g3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74220a;

    /* renamed from: b, reason: collision with root package name */
    public int f74221b;

    /* renamed from: c, reason: collision with root package name */
    public int f74222c;

    /* renamed from: d, reason: collision with root package name */
    public long f74223d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f74224e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f74225f;

    /* renamed from: g, reason: collision with root package name */
    private final GQ f74226g;

    /* renamed from: h, reason: collision with root package name */
    private int f74227h;

    /* renamed from: i, reason: collision with root package name */
    private int f74228i;

    public final boolean a() {
        int i10 = this.f74221b + 1;
        this.f74221b = i10;
        if (i10 == this.f74220a) {
            return false;
        }
        this.f74223d = this.f74224e ? this.f74225f.M() : this.f74225f.K();
        if (this.f74221b == this.f74227h) {
            this.f74222c = this.f74226g.F();
            this.f74226g.m(4);
            int i11 = this.f74228i - 1;
            this.f74228i = i11;
            this.f74227h = i11 > 0 ? (-1) + this.f74226g.F() : -1;
        }
        return true;
    }

    public C8068g3(GQ gq2, GQ gq3, boolean z10) throws zzbc {
        this.f74226g = gq2;
        this.f74225f = gq3;
        this.f74224e = z10;
        gq3.l(12);
        this.f74220a = gq3.F();
        gq2.l(12);
        this.f74228i = gq2.F();
        C9557u0.b(gq2.w() == 1, "first_chunk must be 1");
        this.f74221b = -1;
    }
}
