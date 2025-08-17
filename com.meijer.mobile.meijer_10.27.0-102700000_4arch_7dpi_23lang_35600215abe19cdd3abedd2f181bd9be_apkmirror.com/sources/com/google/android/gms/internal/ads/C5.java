package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
final class C5 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f65700a;

    /* renamed from: b, reason: collision with root package name */
    private long f65701b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f65702c;

    /* renamed from: d, reason: collision with root package name */
    private int f65703d;

    /* renamed from: e, reason: collision with root package name */
    private long f65704e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f65705f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f65706g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f65707h;

    /* renamed from: i, reason: collision with root package name */
    private boolean f65708i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f65709j;

    /* renamed from: k, reason: collision with root package name */
    private long f65710k;

    /* renamed from: l, reason: collision with root package name */
    private long f65711l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f65712m;

    public C5(X0 x02) {
        this.f65700a = x02;
    }

    public final void d() {
        this.f65705f = false;
        this.f65706g = false;
        this.f65707h = false;
        this.f65708i = false;
        this.f65709j = false;
    }

    public final void e(long j10, int i10, int i11, long j11, boolean z10) {
        this.f65706g = false;
        this.f65707h = false;
        this.f65704e = j11;
        this.f65703d = 0;
        this.f65701b = j10;
        if (i11 >= 32 && i11 != 40) {
            if (this.f65708i && !this.f65709j) {
                if (z10) {
                    f(i10);
                }
                this.f65708i = false;
            }
            if (i11 <= 35 || i11 == 39) {
                this.f65707h = !this.f65709j;
                this.f65709j = true;
            }
        }
        boolean z11 = i11 >= 16 && i11 <= 21;
        this.f65702c = z11;
        this.f65705f = z11 || i11 <= 9;
    }

    private final void f(int i10) {
        long j10 = this.f65711l;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.f65712m;
        long j11 = this.f65701b - this.f65710k;
        this.f65700a.a(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void a(long j10) {
        this.f65712m = this.f65702c;
        f((int) (j10 - this.f65701b));
        this.f65710k = this.f65701b;
        this.f65701b = j10;
        f(0);
        this.f65708i = false;
    }

    public final void b(long j10, int i10, boolean z10) {
        if (this.f65709j && this.f65706g) {
            this.f65712m = this.f65702c;
            this.f65709j = false;
        } else if (this.f65707h || this.f65706g) {
            if (z10 && this.f65708i) {
                f(i10 + ((int) (j10 - this.f65701b)));
            }
            this.f65710k = this.f65701b;
            this.f65711l = this.f65704e;
            this.f65712m = this.f65702c;
            this.f65708i = true;
        }
    }

    public final void c(byte[] bArr, int i10, int i11) {
        if (this.f65705f) {
            int i12 = this.f65703d;
            int i13 = (i10 + 2) - i12;
            if (i13 >= i11) {
                this.f65703d = i12 + (i11 - i10);
            } else {
                this.f65706g = (bArr[i13] & 128) != 0;
                this.f65705f = false;
            }
        }
    }
}
