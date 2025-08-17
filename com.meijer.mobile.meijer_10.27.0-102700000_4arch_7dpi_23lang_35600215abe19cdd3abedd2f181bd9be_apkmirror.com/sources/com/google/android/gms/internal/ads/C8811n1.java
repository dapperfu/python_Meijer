package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.n1, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C8811n1 {

    /* renamed from: a, reason: collision with root package name */
    protected final X0 f76965a;

    /* renamed from: b, reason: collision with root package name */
    private final int f76966b;

    /* renamed from: c, reason: collision with root package name */
    private final int f76967c;

    /* renamed from: d, reason: collision with root package name */
    private final long f76968d;

    /* renamed from: e, reason: collision with root package name */
    private final int f76969e;

    /* renamed from: f, reason: collision with root package name */
    private int f76970f;

    /* renamed from: g, reason: collision with root package name */
    private int f76971g;

    /* renamed from: h, reason: collision with root package name */
    private int f76972h;

    /* renamed from: i, reason: collision with root package name */
    private int f76973i;

    /* renamed from: j, reason: collision with root package name */
    private int f76974j;

    /* renamed from: k, reason: collision with root package name */
    private long f76975k;

    /* renamed from: l, reason: collision with root package name */
    private long[] f76976l;

    /* renamed from: m, reason: collision with root package name */
    private int[] f76977m;

    public C8811n1(int i10, int i11, long j10, int i12, X0 x02) {
        i11 = i11 != 1 ? 2 : i11;
        this.f76968d = j10;
        this.f76969e = i12;
        this.f76965a = x02;
        this.f76966b = h(i10, i11 == 2 ? 1667497984 : 1651965952);
        this.f76967c = i11 == 2 ? h(i10, 1650720768) : -1;
        this.f76975k = -1L;
        this.f76976l = new long[512];
        this.f76977m = new int[512];
    }

    private static int h(int i10, int i11) {
        return (((i10 % 10) + 48) << 8) | ((i10 / 10) + 48) | i11;
    }

    public final void d(int i10) {
        this.f76970f = i10;
        this.f76971g = i10;
    }

    public final boolean f(int i10) {
        return this.f76966b == i10 || this.f76967c == i10;
    }

    private final long i(int i10) {
        return (this.f76968d * i10) / this.f76969e;
    }

    private final R0 j(int i10) {
        return new R0(this.f76977m[i10] * i(1), this.f76976l[i10]);
    }

    public final O0 a(long j10) {
        if (this.f76974j == 0) {
            R0 r02 = new R0(0L, this.f76975k);
            return new O0(r02, r02);
        }
        int i10 = (int) (j10 / i(1));
        int iU = OV.u(this.f76977m, i10, true, true);
        if (this.f76977m[iU] == i10) {
            R0 r0J = j(iU);
            return new O0(r0J, r0J);
        }
        R0 r0J2 = j(iU);
        int i11 = iU + 1;
        return i11 < this.f76976l.length ? new O0(r0J2, j(i11)) : new O0(r0J2, r0J2);
    }

    public final void b(long j10, boolean z10) {
        if (this.f76975k == -1) {
            this.f76975k = j10;
        }
        if (z10) {
            if (this.f76974j == this.f76977m.length) {
                long[] jArr = this.f76976l;
                this.f76976l = Arrays.copyOf(jArr, (jArr.length * 3) / 2);
                int[] iArr = this.f76977m;
                this.f76977m = Arrays.copyOf(iArr, (iArr.length * 3) / 2);
            }
            long[] jArr2 = this.f76976l;
            int i10 = this.f76974j;
            jArr2[i10] = j10;
            this.f76977m[i10] = this.f76973i;
            this.f76974j = i10 + 1;
        }
        this.f76973i++;
    }

    public final void c() {
        this.f76976l = Arrays.copyOf(this.f76976l, this.f76974j);
        this.f76977m = Arrays.copyOf(this.f76977m, this.f76974j);
    }

    public final void e(long j10) {
        if (this.f76974j == 0) {
            this.f76972h = 0;
        } else {
            this.f76972h = this.f76977m[OV.v(this.f76976l, j10, true, true)];
        }
    }

    public final boolean g(InterfaceC9236r0 interfaceC9236r0) throws IOException {
        int i10 = this.f76971g;
        int iB = i10 - this.f76965a.b(interfaceC9236r0, i10, false);
        this.f76971g = iB;
        boolean z10 = iB == 0;
        if (z10) {
            if (this.f76970f > 0) {
                this.f76965a.a(i(this.f76972h), Arrays.binarySearch(this.f76977m, this.f76972h) >= 0 ? 1 : 0, this.f76970f, 0, null);
            }
            this.f76972h++;
        }
        return z10;
    }
}
