package com.google.android.gms.internal.ads;

import android.util.SparseArray;

/* loaded from: classes6.dex */
final class A5 {

    /* renamed from: a, reason: collision with root package name */
    private final X0 f65906a;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray f65907b = new SparseArray();

    /* renamed from: c, reason: collision with root package name */
    private final SparseArray f65908c = new SparseArray();

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f65909d;

    /* renamed from: e, reason: collision with root package name */
    private int f65910e;

    /* renamed from: f, reason: collision with root package name */
    private long f65911f;

    /* renamed from: g, reason: collision with root package name */
    private long f65912g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f65913h;

    /* renamed from: i, reason: collision with root package name */
    private long f65914i;

    /* renamed from: j, reason: collision with root package name */
    private long f65915j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f65916k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f65917l;

    private final void h() {
        boolean z10 = this.f65917l;
        boolean z11 = this.f65916k;
        int i10 = this.f65910e;
        boolean z12 = true;
        if (i10 != 5 && (!z10 || i10 != 1)) {
            z12 = false;
        }
        this.f65916k = z11 | z12;
    }

    public final void d() {
        this.f65913h = false;
    }

    public final void e(long j10, int i10, long j11, boolean z10) {
        this.f65910e = i10;
        this.f65912g = j11;
        this.f65911f = j10;
        this.f65917l = z10;
    }

    private final void g(int i10) {
        long j10 = this.f65915j;
        if (j10 == -9223372036854775807L) {
            return;
        }
        boolean z10 = this.f65916k;
        long j11 = this.f65911f - this.f65914i;
        this.f65906a.a(j10, z10 ? 1 : 0, (int) j11, i10, null);
    }

    public final void b(C9167p90 c9167p90) {
        this.f65908c.append(c9167p90.f78356a, c9167p90);
    }

    public final void c(Q90 q90) {
        this.f65907b.append(q90.f70360d, q90);
    }

    public final boolean f(long j10, int i10, boolean z10) {
        if (this.f65910e == 9) {
            if (z10 && this.f65913h) {
                g(i10 + ((int) (j10 - this.f65911f)));
            }
            this.f65914i = this.f65911f;
            this.f65915j = this.f65912g;
            this.f65916k = false;
            this.f65913h = true;
        }
        h();
        return this.f65916k;
    }

    public A5(X0 x02, boolean z10, boolean z11) {
        this.f65906a = x02;
        byte[] bArr = new byte[128];
        this.f65909d = bArr;
        new C7247Ra0(bArr, 0, 0);
        this.f65913h = false;
    }

    public final void a(long j10) {
        h();
        this.f65911f = j10;
        g(0);
        this.f65913h = false;
    }
}
