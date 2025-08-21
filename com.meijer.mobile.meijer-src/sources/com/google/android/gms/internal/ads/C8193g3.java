package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.g3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8193g3 {

    /* renamed from: a, reason: collision with root package name */
    public final int f75060a;

    /* renamed from: b, reason: collision with root package name */
    public int f75061b;

    /* renamed from: c, reason: collision with root package name */
    public int f75062c;

    /* renamed from: d, reason: collision with root package name */
    public long f75063d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f75064e;

    /* renamed from: f, reason: collision with root package name */
    private final GQ f75065f;

    /* renamed from: g, reason: collision with root package name */
    private final GQ f75066g;

    /* renamed from: h, reason: collision with root package name */
    private int f75067h;

    /* renamed from: i, reason: collision with root package name */
    private int f75068i;

    public final boolean a() {
        int i10 = this.f75061b + 1;
        this.f75061b = i10;
        if (i10 == this.f75060a) {
            return false;
        }
        this.f75063d = this.f75064e ? this.f75065f.M() : this.f75065f.K();
        if (this.f75061b == this.f75067h) {
            this.f75062c = this.f75066g.F();
            this.f75066g.m(4);
            int i11 = this.f75068i - 1;
            this.f75068i = i11;
            this.f75067h = i11 > 0 ? (-1) + this.f75066g.F() : -1;
        }
        return true;
    }

    public C8193g3(GQ gq2, GQ gq3, boolean z10) throws zzbc {
        this.f75066g = gq2;
        this.f75065f = gq3;
        this.f75064e = z10;
        gq3.l(12);
        this.f75060a = gq3.F();
        gq2.l(12);
        this.f75068i = gq2.F();
        C9682u0.b(gq2.w() == 1, "first_chunk must be 1");
        this.f75061b = -1;
    }
}
