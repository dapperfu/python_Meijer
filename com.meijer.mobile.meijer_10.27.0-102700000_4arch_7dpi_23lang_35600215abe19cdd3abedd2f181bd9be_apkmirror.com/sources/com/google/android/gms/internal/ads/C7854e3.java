package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
final class C7854e3 implements InterfaceC7535b3 {

    /* renamed from: a, reason: collision with root package name */
    private final long f73746a;

    /* renamed from: b, reason: collision with root package name */
    private final int f73747b;

    /* renamed from: c, reason: collision with root package name */
    private final long f73748c;

    /* renamed from: d, reason: collision with root package name */
    private final int f73749d;

    /* renamed from: e, reason: collision with root package name */
    private final long f73750e;

    /* renamed from: f, reason: collision with root package name */
    private final long f73751f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f73752g;

    private C7854e3(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f73746a = j10;
        this.f73747b = i10;
        this.f73748c = j11;
        this.f73749d = i11;
        this.f73750e = j12;
        this.f73752g = jArr;
        this.f73751f = j12 != -1 ? j10 + j12 : -1L;
    }

    private final long b(int i10) {
        return (this.f73748c * i10) / 100;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f73748c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final int zzc() {
        return this.f73749d;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long zzd() {
        return this.f73751f;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return this.f73752g != null;
    }

    public static C7854e3 a(C7748d3 c7748d3, long j10) {
        long[] jArr;
        long jA = c7748d3.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = c7748d3.f73339c;
        if (j11 != -1 && (jArr = c7748d3.f73342f) != null) {
            J0 j02 = c7748d3.f73337a;
            return new C7854e3(j10, j02.f67742c, jA, j02.f67745f, j11, jArr);
        }
        J0 j03 = c7748d3.f73337a;
        return new C7854e3(j10, j03.f67742c, jA, j03.f67745f, -1L, null);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC7535b3
    public final long f(long j10) {
        long j11;
        double d10;
        if (zzh()) {
            long j12 = j10 - this.f73746a;
            if (j12 > this.f73747b) {
                long[] jArr = this.f73752g;
                C8086gC.b(jArr);
                double d11 = (j12 * 256.0d) / this.f73750e;
                int iV = OV.v(jArr, (long) d11, true, true);
                long jB = b(iV);
                long j13 = jArr[iV];
                int i10 = iV + 1;
                long jB2 = b(i10);
                if (iV == 99) {
                    j11 = 256;
                } else {
                    j11 = jArr[i10];
                }
                if (j13 == j11) {
                    d10 = 0.0d;
                } else {
                    d10 = (d11 - j13) / (j11 - j13);
                }
                return jB + Math.round(d10 * (jB2 - jB));
            }
            return 0L;
        }
        return 0L;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        double d10;
        if (!zzh()) {
            R0 r02 = new R0(0L, this.f73746a + this.f73747b);
            return new O0(r02, r02);
        }
        long jMax = Math.max(0L, Math.min(j10, this.f73748c));
        double d11 = (jMax * 100.0d) / this.f73748c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = this.f73752g;
                C8086gC.b(jArr);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - i10) * (d10 - d13));
            }
        }
        long j11 = this.f73750e;
        R0 r03 = new R0(jMax, this.f73746a + Math.max(this.f73747b, Math.min(Math.round((d12 / 256.0d) * j11), j11 - 1)));
        return new O0(r03, r03);
    }
}
