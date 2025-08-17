package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes6.dex */
final class A5 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f65066a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f65067b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f65068c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f65069d;

    /* renamed from: e, reason: collision with root package name */
    private int f65070e;

    /* renamed from: f, reason: collision with root package name */
    private long f65071f;

    /* renamed from: g, reason: collision with root package name */
    private long f65072g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f65073h;

    /* renamed from: i, reason: collision with root package name */
    private long f65074i;

    /* renamed from: j, reason: collision with root package name */
    private long f65075j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f65076k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f65077l;

    private final void h() {
        boolean z10 = this.f65077l;
        boolean z11 = this.f65076k;
        int i10 = this.f65070e;
        boolean z12 = true;
        if (i10 != 5 && (!z10 || i10 != 1)) {
            z12 = false;
        }
        this.f65076k = z11 | z12;
    }

    public final void d() {
        this.f65073h = false;
    }

    public final void e(long j10, int i10, long j11, boolean z10) {
        this.f65070e = i10;
        this.f65072g = j11;
        this.f65071f = j10;
        this.f65077l = z10;
    }

    private final void g(int i10) {
        long j10 = this.f65075j;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.f65076k;
        long j11 = this.f65071f - this.f65074i;
        this.f65066a.a(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void b(C9042p90 c9042p90) {
        this.f65068c.append(c9042p90.f77516a, c9042p90);
    }

    public final void c(Q90 q90) {
        this.f65067b.append(q90.f69520d, q90);
    }

    public final boolean f(long j10, int i10, boolean z10) {
        if (this.f65070e == 9) {
            if (z10 && this.f65073h) {
                g(i10 + ((int) (j10 - this.f65071f)));
            }
            this.f65074i = this.f65071f;
            this.f65075j = this.f65072g;
            this.f65076k = false;
            this.f65073h = true;
        }
        h();
        return this.f65076k;
    }

    public A5(X0 x02, boolean z10, boolean z11) {
        this.f65066a = x02;
        byte[] bArr = new byte[128];
        this.f65069d = bArr;
        new C7122Ra0(bArr, 0, 0);
        this.f65073h = false;
    }

    public final void a(long j10) {
        h();
        this.f65071f = j10;
        g(0);
        this.f65073h = false;
    }
}
