package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.y5, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C9995y5 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f79966a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f79967b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f79968c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f79969d;

    /* renamed from: e, reason: collision with root package name */
    private int f79970e;

    /* renamed from: f, reason: collision with root package name */
    private int f79971f;

    /* renamed from: g, reason: collision with root package name */
    private long f79972g;

    /* renamed from: h, reason: collision with root package name */
    private long f79973h;

    public C9995y5(X0 x02) {
        this.f79966a = x02;
    }

    public final void c(int i10, long j10) {
        boolean z10;
        this.f79970e = i10;
        this.f79969d = false;
        if (i10 == 182) {
            z10 = true;
        } else if (i10 == 179) {
            i10 = 179;
            z10 = true;
        } else {
            z10 = false;
        }
        this.f79967b = z10;
        this.f79968c = i10 == 182;
        this.f79971f = 0;
        this.f79973h = j10;
    }

    public final void d() {
        this.f79967b = false;
        this.f79968c = false;
        this.f79969d = false;
        this.f79970e = -1;
    }

    public final void a(byte[] bArr, int i10, int i11) {
        if (this.f79968c) {
            int i12 = this.f79971f;
            int i13 = (i10 + 1) - i12;
            if (i13 >= i11) {
                this.f79971f = i12 + (i11 - i10);
            } else {
                this.f79969d = ((bArr[i13] & 192) >> 6) == 0;
                this.f79968c = false;
            }
        }
    }

    public final void b(long j10, int i10, boolean z10) {
        C8086gC.f(this.f79973h != -9223372036854775807L);
        if (this.f79970e == 182 && z10 && this.f79967b) {
            this.f79966a.a(this.f79973h, this.f79969d ? 1 : 0, (int) (j10 - this.f79972g), i10, null);
        }
        if (this.f79970e != 179) {
            this.f79972g = j10;
        }
    }
}
