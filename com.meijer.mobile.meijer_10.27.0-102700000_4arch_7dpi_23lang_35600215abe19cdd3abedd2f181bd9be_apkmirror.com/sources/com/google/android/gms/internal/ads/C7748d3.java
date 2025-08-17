package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.d3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7748d3 {

    /* renamed from: a, reason: collision with root package name */
    public final J0 f73337a;

    /* renamed from: b, reason: collision with root package name */
    public final long f73338b;

    /* renamed from: c, reason: collision with root package name */
    public final long f73339c;

    /* renamed from: d, reason: collision with root package name */
    public final int f73340d;

    /* renamed from: e, reason: collision with root package name */
    public final int f73341e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f73342f;

    private C7748d3(J0 j02, long j10, long j11, long[] jArr, int i10, int i11) {
        this.f73337a = new J0(j02);
        this.f73338b = j10;
        this.f73339c = j11;
        this.f73342f = jArr;
        this.f73340d = i10;
        this.f73341e = i11;
    }

    public final long a() {
        long j10 = this.f73338b;
        if (j10 == -1 || j10 == 0) {
            return -9223372036854775807L;
        }
        return OV.L((j10 * r4.f67746g) - 1, this.f73337a.f67743d);
    }

    public static C7748d3 b(J0 j02, GQ gq2) {
        int iF;
        long jK;
        long[] jArr;
        int i10;
        int i11;
        int iW = gq2.w();
        if ((iW & 1) != 0) {
            iF = gq2.F();
        } else {
            iF = -1;
        }
        if ((iW & 2) != 0) {
            jK = gq2.K();
        } else {
            jK = -1;
        }
        long j10 = jK;
        if ((iW & 4) == 4) {
            jArr = new long[100];
            for (int i12 = 0; i12 < 100; i12++) {
                jArr[i12] = gq2.C();
            }
        } else {
            jArr = null;
        }
        long[] jArr2 = jArr;
        if ((iW & 8) != 0) {
            gq2.m(4);
        }
        if (gq2.r() >= 24) {
            gq2.m(21);
            int iE = gq2.E();
            i11 = iE & com.medallia.digital.mobilesdk.l3.f92483b;
            i10 = iE >> 12;
        } else {
            i10 = -1;
            i11 = -1;
        }
        return new C7748d3(j02, iF, j10, jArr2, i10, i11);
    }
}
