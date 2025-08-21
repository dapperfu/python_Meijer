package com.google.android.gms.internal.ads;

import java.math.RoundingMode;

/* renamed from: com.google.android.gms.internal.ads.c3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7766c3 implements InterfaceC7660b3 {

    /* renamed from: a, reason: collision with root package name */
    private final long[] f73911a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f73912b;

    /* renamed from: c, reason: collision with root package name */
    private final long f73913c;

    /* renamed from: d, reason: collision with root package name */
    private final long f73914d;

    /* renamed from: e, reason: collision with root package name */
    private final int f73915e;

    private C7766c3(long[] jArr, long[] jArr2, long j10, long j11, int i10) {
        this.f73911a = jArr;
        this.f73912b = jArr2;
        this.f73913c = j10;
        this.f73914d = j11;
        this.f73915e = i10;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f73913c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660b3
    public final int zzc() {
        return this.f73915e;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660b3
    public final long zzd() {
        return this.f73914d;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public static C7766c3 a(long j10, long j11, J0 j02, GQ gq2) {
        int iC;
        gq2.m(10);
        int iW = gq2.w();
        if (iW <= 0) {
            return null;
        }
        int i10 = j02.f68583d;
        long jM = OV.M(iW, (i10 >= 32000 ? 1152 : 576) * 1000000, i10, RoundingMode.DOWN);
        int iG = gq2.G();
        int iG2 = gq2.G();
        int iG3 = gq2.G();
        gq2.m(2);
        long j12 = j11 + j02.f68582c;
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
            C10042xL.f("VbriSeeker", "VBRI data size mismatch: " + j10 + ", " + j13);
        }
        return new C7766c3(jArr, jArr2, j15, j13, j02.f68585f);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7660b3
    public final long f(long j10) {
        return this.f73911a[OV.v(this.f73912b, j10, true, true)];
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long[] jArr = this.f73911a;
        int iV = OV.v(jArr, j10, true, true);
        R0 r02 = new R0(jArr[iV], this.f73912b[iV]);
        if (r02.f70547a < j10) {
            long[] jArr2 = this.f73911a;
            if (iV != jArr2.length - 1) {
                int i10 = iV + 1;
                return new O0(r02, new R0(jArr2[i10], this.f73912b[i10]));
            }
        }
        return new O0(r02, r02);
    }
}
