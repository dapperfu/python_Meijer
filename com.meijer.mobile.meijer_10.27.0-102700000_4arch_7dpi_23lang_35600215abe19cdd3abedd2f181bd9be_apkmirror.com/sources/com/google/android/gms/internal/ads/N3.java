package com.google.android.gms.internal.ads;

/* loaded from: classes6.dex */
public final class N3 {

    /* renamed from: a, reason: collision with root package name */
    public final K3 f68794a;

    /* renamed from: b, reason: collision with root package name */
    public final int f68795b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f68796c;

    /* renamed from: d, reason: collision with root package name */
    public final int[] f68797d;

    /* renamed from: e, reason: collision with root package name */
    public final int f68798e;

    /* renamed from: f, reason: collision with root package name */
    public final long[] f68799f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f68800g;

    /* renamed from: h, reason: collision with root package name */
    public final long f68801h;

    public final int a(long j10) {
        for (int iV = OV.v(this.f68799f, j10, true, false); iV >= 0; iV--) {
            if ((this.f68800g[iV] & 1) != 0) {
                return iV;
            }
        }
        return -1;
    }

    public final int b(long j10) {
        for (int iS = OV.s(this.f68799f, j10, true, false); iS < this.f68799f.length; iS++) {
            if ((this.f68800g[iS] & 1) != 0) {
                return iS;
            }
        }
        return -1;
    }

    public N3(K3 k32, long[] jArr, int[] iArr, int i10, long[] jArr2, int[] iArr2, long j10) {
        boolean z10;
        boolean z11;
        int length = iArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z10 = true;
        } else {
            z10 = false;
        }
        C8086gC.d(z10);
        int length3 = jArr.length;
        if (length3 == length2) {
            z11 = true;
        } else {
            z11 = false;
        }
        C8086gC.d(z11);
        int length4 = iArr2.length;
        C8086gC.d(length4 == length2);
        this.f68794a = k32;
        this.f68796c = jArr;
        this.f68797d = iArr;
        this.f68798e = i10;
        this.f68799f = jArr2;
        this.f68800g = iArr2;
        this.f68801h = j10;
        this.f68795b = length3;
        if (length4 > 0) {
            int i11 = length4 - 1;
            iArr2[i11] = iArr2[i11] | 536870912;
        }
    }
}
