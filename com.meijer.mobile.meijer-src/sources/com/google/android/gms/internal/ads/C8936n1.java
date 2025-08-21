package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8936n1 {

    /* renamed from: a, reason: collision with root package name */
    protected final X0 f77805a;

    /* renamed from: b, reason: collision with root package name */
    private final int f77806b;

    /* renamed from: c, reason: collision with root package name */
    private final int f77807c;

    /* renamed from: d, reason: collision with root package name */
    private final long f77808d;

    /* renamed from: e, reason: collision with root package name */
    private final int f77809e;

    /* renamed from: f, reason: collision with root package name */
    private int f77810f;

    /* renamed from: g, reason: collision with root package name */
    private int f77811g;

    /* renamed from: h, reason: collision with root package name */
    private int f77812h;

    /* renamed from: i, reason: collision with root package name */
    private int f77813i;

    /* renamed from: j, reason: collision with root package name */
    private int f77814j;

    /* renamed from: k, reason: collision with root package name */
    private long f77815k;

    /* renamed from: l, reason: collision with root package name */
    private long[] f77816l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f77817m;

    public C8936n1(int i10, int i11, long j10, int i12, X0 x02) {
        i11 = i11 != 1 ? 2 : i11;
        this.f77808d = j10;
        this.f77809e = i12;
        this.f77805a = x02;
        this.f77806b = h(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f77807c = i11 == 2 ? h(i10, 1650720768) : -1;
        this.f77815k = -1L;
        this.f77816l = new long[512];
        this.f77817m = new int[512];
    }

    private static int h(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public final void d(int i10) {
        this.f77810f = i10;
        this.f77811g = i10;
    }

    public final boolean f(int i10) {
        return this.f77806b == i10 || this.f77807c == i10;
    }

    private final long i(int i10) {
        return (this.f77808d * i10) / this.f77809e;
    }

    private final R0 j(int i10) {
        return new R0(this.f77817m[i10] * i(1), this.f77816l[i10]);
    }

    public final O0 a(long j10) {
        if (this.f77814j == 0) {
            R0 r02 = new R0(0L, this.f77815k);
            return new O0(r02, r02);
        }
        int i10 = (int) (j10 / i(1));
        int iU = OV.u(this.f77817m, i10, true, true);
        if (this.f77817m[iU] == i10) {
            R0 r0J = j(iU);
            return new O0(r0J, r0J);
        }
        R0 r0J2 = j(iU);
        int i11 = iU + 1;
        return i11 < this.f77816l.length ? new O0(r0J2, j(i11)) : new O0(r0J2, r0J2);
    }

    public final void b(long j10, boolean z10) {
        if (this.f77815k == -1) {
            this.f77815k = j10;
        }
        if (z10) {
            if (this.f77814j == this.f77817m.length) {
                long[] jArr = this.f77816l;
                this.f77816l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f77817m;
                this.f77817m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f77816l;
            int i10 = this.f77814j;
            jArr2[i10] = j10;
            this.f77817m[i10] = this.f77813i;
            this.f77814j = i10 + 1;
        }
        this.f77813i++;
    }

    public final void c() {
        this.f77816l = Arrays.copyOf(this.f77816l, this.f77814j);
        this.f77817m = Arrays.copyOf(this.f77817m, this.f77814j);
    }

    public final void e(long j10) {
        if (this.f77814j == 0) {
            this.f77812h = 0;
        } else {
            this.f77812h = this.f77817m[OV.v(this.f77816l, j10, true, true)];
        }
    }

    public final boolean g(InterfaceC9361r0 interfaceC9361r0) throws IOException {
        int i10 = this.f77811g;
        int iB = i10 - this.f77805a.b(interfaceC9361r0, i10, false);
        this.f77811g = iB;
        boolean z10 = iB == 0;
        if (z10) {
            if (this.f77810f > 0) {
                this.f77805a.a(i(this.f77812h), Arrays.binarySearch(this.f77817m, this.f77812h) >= 0 ? 1 : 0, this.f77810f, 0, null);
            }
            this.f77812h++;
        }
        return z10;
    }
}
