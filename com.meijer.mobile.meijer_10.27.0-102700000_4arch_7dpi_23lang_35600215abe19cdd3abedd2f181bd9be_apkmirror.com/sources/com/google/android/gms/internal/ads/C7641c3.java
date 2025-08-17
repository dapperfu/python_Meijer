package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7641c3 implements InterfaceC7535b3 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f73071a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f73072b;

    /* renamed from: c, reason: collision with root package name */
    private final long f73073c;

    /* renamed from: d, reason: collision with root package name */
    private final long f73074d;

    /* renamed from: e, reason: collision with root package name */
    private final int f73075e;

    private C7641c3(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f73071a = jArr;
        this.f73072b = jArr2;
        this.f73073c = j10;
        this.f73074d = j11;
        this.f73075e = i10;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f73073c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final int zzc() {
        return this.f73075e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long zzd() {
        return this.f73074d;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public static C7641c3 a(long j10, long j11, J0 j02, GQ gq2) {
        int iC;
        gq2.m(10);
        int iW = gq2.w();
        if (iW <= 0) {
            return null;
        }
        int i10 = j02.f67743d;
        long jM = OV.M(iW, (i10 >= 32000 ? 1152 : 576) * 1000000, i10, RoundingMode.DOWN);
        int iG = gq2.G();
        int iG2 = gq2.G();
        int iG3 = gq2.G();
        gq2.m(2);
        long j12 = j11 + j02.f67742c;
        long[] jArr = new long[iG];
        long[] jArr2 = new long[iG];
        int i11 = 0;
        long j13 = j11;
        while (i11 < iG) {
            long j14 = jM;
            jArr[i11] = (i11 * j14) / iG;
            jArr2[i11] = Math.max(j13, j12);
            if (iG3 == 1) {
                iC = gq2.C();
            } else if (iG3 == 2) {
                iC = gq2.G();
            } else if (iG3 == 3) {
                iC = gq2.E();
            } else {
                if (iG3 != 4) {
                    return null;
                }
                iC = gq2.F();
            }
            j13 += iC * iG2;
            i11++;
            iG = iG;
            jM = j14;
        }
        long j15 = jM;
        if (j10 != -1 && j10 != j13) {
            C9917xL.f("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new C7641c3(jArr, jArr2, j15, j13, j02.f67745f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long f(long j10) {
        return this.f73071a[OV.v(this.f73072b, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long[] jArr = this.f73071a;
        int iV = OV.v(jArr, j10, true, true);
        R0 r02 = new R0(jArr[iV], this.f73072b[iV]);
        if (r02.f69707a < j10) {
            long[] jArr2 = this.f73071a;
            if (iV != jArr2.length - 1) {
                int i10 = iV + 1;
                return new O0(r02, new R0(jArr2[i10], this.f73072b[i10]));
            }
        }
        return new O0(r02, r02);
    }
}
