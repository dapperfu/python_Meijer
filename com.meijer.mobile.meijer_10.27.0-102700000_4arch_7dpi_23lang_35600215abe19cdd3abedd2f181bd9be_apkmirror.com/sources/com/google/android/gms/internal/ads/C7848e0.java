package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7848e0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f73732a;

    /* renamed from: b, reason: collision with root package name */
    private final long f73733b;

    /* renamed from: c, reason: collision with root package name */
    private final int f73734c;

    /* renamed from: d, reason: collision with root package name */
    private final long f73735d;

    /* renamed from: e, reason: collision with root package name */
    private final int f73736e;

    /* renamed from: f, reason: collision with root package name */
    private final long f73737f;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f73737f;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return this.f73735d != -1;
    }

    private static long b(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public final long a(long j10) {
        return b(j10, this.f73733b, this.f73736e);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long j11 = this.f73735d;
        if (j11 == -1) {
            R0 r02 = new R0(0L, this.f73733b);
            return new O0(r02, r02);
        }
        long j12 = this.f73734c;
        long jMin = (((this.f73736e * j10) / 8000000) / j12) * j12;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j12);
        }
        long jMax = this.f73733b + Math.max(jMin, 0L);
        long jA = a(jMax);
        R0 r03 = new R0(jA, jMax);
        if (this.f73735d != -1 && jA < j10) {
            long j13 = jMax + this.f73734c;
            if (j13 < this.f73732a) {
                return new O0(r03, new R0(a(j13), j13));
            }
        }
        return new O0(r03, r03);
    }

    public C7848e0(long j10, long j11, int i10, int i11, boolean z10) {
        long jB;
        this.f73732a = j10;
        this.f73733b = j11;
        this.f73734c = i11 == -1 ? 1 : i11;
        this.f73736e = i10;
        if (j10 == -1) {
            this.f73735d = -1L;
            jB = -9223372036854775807L;
        } else {
            this.f73735d = j10 - j11;
            jB = b(j10, j11, i10);
        }
        this.f73737f = jB;
    }
}
