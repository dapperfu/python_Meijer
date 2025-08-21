package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class C5 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f66540a;

    /* renamed from: b, reason: collision with root package name */
    private long f66541b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f66542c;

    /* renamed from: d, reason: collision with root package name */
    private int f66543d;

    /* renamed from: e, reason: collision with root package name */
    private long f66544e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f66545f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f66546g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f66547h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f66548i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f66549j;

    /* renamed from: k, reason: collision with root package name */
    private long f66550k;

    /* renamed from: l, reason: collision with root package name */
    private long f66551l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f66552m;

    public C5(X0 x02) {
        this.f66540a = x02;
    }

    public final void d() {
        this.f66545f = false;
        this.f66546g = false;
        this.f66547h = false;
        this.f66548i = false;
        this.f66549j = false;
    }

    public final void e(long j10, int i10, int i11, long j11, boolean z10) {
        this.f66546g = false;
        this.f66547h = false;
        this.f66544e = j11;
        this.f66543d = 0;
        this.f66541b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.f66548i && !this.f66549j) {
                if (z10) {
                    f(i10);
                }
                this.f66548i = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.f66547h = !this.f66549j;
                this.f66549j = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        this.f66542c = z11;
        this.f66545f = z11 || i11 <= 9;
    }

    private final void f(int i10) {
        long j10 = this.f66551l;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.f66552m;
        long j11 = this.f66541b - this.f66550k;
        this.f66540a.a(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void a(long j10) {
        this.f66552m = this.f66542c;
        f((int) (j10 - this.f66541b));
        this.f66550k = this.f66541b;
        this.f66541b = j10;
        f(0);
        this.f66548i = false;
    }

    public final void b(long j10, int i10, boolean z10) {
        if (this.f66549j && this.f66546g) {
            this.f66552m = this.f66542c;
            this.f66549j = false;
        } else if (this.f66547h || this.f66546g) {
            if (z10 && this.f66548i) {
                f(i10 + ((int) (j10 - this.f66541b)));
            }
            this.f66550k = this.f66541b;
            this.f66551l = this.f66544e;
            this.f66552m = this.f66542c;
            this.f66548i = true;
        }
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f66545f) {
            int i12 = this.f66543d;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.f66543d = i12 + (i11 - i10);
            } else {
                this.f66546g = (bArr[i13] & 128) != 0;
                this.f66545f = false;
            }
        }
    }
}
