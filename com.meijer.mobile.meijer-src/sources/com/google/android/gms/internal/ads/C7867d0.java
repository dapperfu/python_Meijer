package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* renamed from: com.google.android.gms.internal.ads.d0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C7867d0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f74149a;

    /* renamed from: b, reason: collision with root package name */
    public final int[] f74150b;

    /* renamed from: c, reason: collision with root package name */
    public final long[] f74151c;

    /* renamed from: d, reason: collision with root package name */
    public final long[] f74152d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f74153e;

    /* renamed from: f, reason: collision with root package name */
    private final long f74154f;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f74154f;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    public final String toString() {
        long[] jArr = this.f74152d;
        long[] jArr2 = this.f74153e;
        long[] jArr3 = this.f74151c;
        return "ChunkIndex(length=" + this.f74149a + ", sizes=" + Arrays.toString(this.f74150b) + ", offsets=" + Arrays.toString(jArr3) + ", timeUs=" + Arrays.toString(jArr2) + ", durationsUs=" + Arrays.toString(jArr) + ")";
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long[] jArr = this.f74153e;
        int iV = OV.v(jArr, j10, true, true);
        R0 r02 = new R0(jArr[iV], this.f74151c[iV]);
        if (r02.f70547a >= j10 || iV == this.f74149a - 1) {
            return new O0(r02, r02);
        }
        int i10 = iV + 1;
        return new O0(r02, new R0(this.f74153e[i10], this.f74151c[i10]));
    }

    public C7867d0(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f74150b = iArr;
        this.f74151c = jArr;
        this.f74152d = jArr2;
        this.f74153e = jArr3;
        int length = iArr.length;
        this.f74149a = length;
        if (length > 0) {
            int i10 = length - 1;
            this.f74154f = jArr2[i10] + jArr3[i10];
        } else {
            this.f74154f = 0L;
        }
    }
}
