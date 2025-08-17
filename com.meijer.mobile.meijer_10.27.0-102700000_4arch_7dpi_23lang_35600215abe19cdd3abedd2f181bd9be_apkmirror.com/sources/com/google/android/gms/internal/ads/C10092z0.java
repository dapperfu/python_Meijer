package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.z0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C10092z0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final B0 f80322a;

    /* renamed from: b, reason: collision with root package name */
    private final long f80323b;

    public C10092z0(B0 b02, long j10) {
        this.f80322a = b02;
        this.f80323b = j10;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return true;
    }

    private final R0 a(long j10, long j11) {
        return new R0((j10 * 1000000) / this.f80322a.f65393e, this.f80323b + j11);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f80322a.a();
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        C8086gC.b(this.f80322a.f65399k);
        B0 b02 = this.f80322a;
        A0 a02 = b02.f65399k;
        long[] jArr = a02.f65039a;
        long[] jArr2 = a02.f65040b;
        int iV = OV.v(jArr, b02.b(j10), true, false);
        R0 r0A = a(iV == -1 ? 0L : jArr[iV], iV != -1 ? jArr2[iV] : 0L);
        if (r0A.f69707a == j10 || iV == jArr.length - 1) {
            return new O0(r0A, r0A);
        }
        int i10 = iV + 1;
        return new O0(r0A, a(jArr[i10], jArr2[i10]));
    }
}
