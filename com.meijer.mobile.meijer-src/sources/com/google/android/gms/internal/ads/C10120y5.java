package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C10120y5 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f80806a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f80807b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f80808c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f80809d;

    /* renamed from: e, reason: collision with root package name */
    private int f80810e;

    /* renamed from: f, reason: collision with root package name */
    private int f80811f;

    /* renamed from: g, reason: collision with root package name */
    private long f80812g;

    /* renamed from: h, reason: collision with root package name */
    private long f80813h;

    public C10120y5(X0 x02) {
        this.f80806a = x02;
    }

    public final void c(int i10, long j10) {
        boolean z10;
        this.f80810e = i10;
        this.f80809d = false;
        if (i10 == 182) {
            z10 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z10 = true;
        } else {
            z10 = false;
        }
        this.f80807b = z10;
        this.f80808c = i10 == 182;
        this.f80811f = 0;
        this.f80813h = j10;
    }

    public final void d() {
        this.f80807b = false;
        this.f80808c = false;
        this.f80809d = false;
        this.f80810e = -1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f80808c) {
            int i12 = this.f80811f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f80811f = i12 + (i11 - i10);
            } else {
                this.f80809d = ((bArr[i13] & 192) >> 6) == 0;
                this.f80808c = false;
            }
        }
    }

    public final void b(long j10, int i10, boolean z10) {
        C8211gC.f(this.f80813h != -9223372036854775807L);
        if (this.f80810e == 182 && z10 && this.f80807b) {
            this.f80806a.a(this.f80813h, this.f80809d ? 1 : 0, (int) (j10 - this.f80812g), i10, null);
        }
        if (this.f80810e != 179) {
            this.f80812g = j10;
        }
    }
}
