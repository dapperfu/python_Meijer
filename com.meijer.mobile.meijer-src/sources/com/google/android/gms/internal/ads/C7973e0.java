package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e0, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C7973e0 implements Q0 {

    /* renamed from: a, reason: collision with root package name */
    private final long f74572a;

    /* renamed from: b, reason: collision with root package name */
    private final long f74573b;

    /* renamed from: c, reason: collision with root package name */
    private final int f74574c;

    /* renamed from: d, reason: collision with root package name */
    private final long f74575d;

    /* renamed from: e, reason: collision with root package name */
    private final int f74576e;

    /* renamed from: f, reason: collision with root package name */
    private final long f74577f;

    @Override // com.google.android.gms.internal.ads.Q0
    public final long zza() {
        return this.f74577f;
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final boolean zzh() {
        return this.f74575d != -1;
    }

    private static long b(long j10, long j11, int i10) {
        return (Math.max(0L, j10 - j11) * 8000000) / i10;
    }

    public final long a(long j10) {
        return b(j10, this.f74573b, this.f74576e);
    }

    @Override // com.google.android.gms.internal.ads.Q0
    public final O0 zzg(long j10) {
        long j11 = this.f74575d;
        if (j11 == -1) {
            R0 r02 = new R0(0L, this.f74573b);
            return new O0(r02, r02);
        }
        long j12 = this.f74574c;
        long jMin = (((this.f74576e * j10) / 8000000) / j12) * j12;
        if (j11 != -1) {
            jMin = Math.min(jMin, j11 - j12);
        }
        long jMax = this.f74573b + Math.max(jMin, 0L);
        long jA = a(jMax);
        R0 r03 = new R0(jA, jMax);
        if (this.f74575d != -1 && jA < j10) {
            long j13 = jMax + this.f74574c;
            if (j13 < this.f74572a) {
                return new O0(r03, new R0(a(j13), j13));
            }
        }
        return new O0(r03, r03);
    }

    public C7973e0(long j10, long j11, int i10, int i11, boolean z10) {
        long jB;
        this.f74572a = j10;
        this.f74573b = j11;
        this.f74574c = i11 == -1 ? 1 : i11;
        this.f74576e = i10;
        if (j10 == -1) {
            this.f74575d = -1L;
            jB = -9223372036854775807L;
        } else {
            this.f74575d = j10 - j11;
            jB = b(j10, j11, i10);
        }
        this.f74577f = jB;
    }
}
