package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7742d0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f73309a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f73310b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f73311c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f73312d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f73313e;

    /* renamed from: f, reason: collision with root package name */
    private final long f73314f;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f73314f;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public final String toString() {
        long[] jArr = this.f73312d;
        long[] jArr2 = this.f73313e;
        long[] jArr3 = this.f73311c;
        return "ChunkIndex(length=" + this.f73309a + ", sizes=" + Arrays.toString(this.f73310b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long[] jArr = this.f73313e;
        int iV = OV.v(jArr, j10, true, true);
        R0 r02 = new R0(jArr[iV], this.f73311c[iV]);
        if (r02.f69707a >= j10 || iV == this.f73309a - 1) {
            return new O0(r02, r02);
        }
        int i10 = iV + 1;
        return new O0(r02, new R0(this.f73313e[i10], this.f73311c[i10]));
    }

    public C7742d0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f73310b = iArr;
        this.f73311c = jArr;
        this.f73312d = jArr2;
        this.f73313e = jArr3;
        int length = iArr.length;
        this.f73309a = length;
        if (length > 0) {
            int i10 = length - 1;
            this.f73314f = jArr2[i10] + jArr3[i10];
        } else {
            this.f73314f = 0L;
        }
    }
}
