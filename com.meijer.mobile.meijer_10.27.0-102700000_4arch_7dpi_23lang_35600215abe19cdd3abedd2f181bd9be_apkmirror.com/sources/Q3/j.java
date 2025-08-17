package Q3;

import d3.C13466a;
import d3.P;
import x3.F;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f29744a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29745b;

    /* renamed from: c, reason: collision with root package name */
    private final long f29746c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29747d;

    /* renamed from: e, reason: collision with root package name */
    private final long f29748e;

    /* renamed from: f, reason: collision with root package name */
    private final long f29749f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f29750g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f29744a = j10;
        this.f29745b = i10;
        this.f29746c = j11;
        this.f29747d = i11;
        this.f29748e = j12;
        this.f29750g = jArr;
        this.f29749f = j12 != -1 ? j10 + j12 : -1L;
    }

    private long b(int i10) {
        return (this.f29746c * i10) / 100;
    }

    @Override // Q3.g
    public long f() {
        return this.f29749f;
    }

    @Override // x3.J
    public boolean g() {
        return this.f29750g != null;
    }

    @Override // Q3.g
    public long h(long j10) {
        long j11 = j10 - this.f29744a;
        if (!g() || j11 <= this.f29745b) {
            return 0L;
        }
        long[] jArr = (long[]) C13466a.i(this.f29750g);
        double d10 = (j11 * 256.0d) / this.f29748e;
        int iG = P.g(jArr, (long) d10, true, true);
        long jB = b(iG);
        long j12 = jArr[iG];
        int i10 = iG + 1;
        long jB2 = b(i10);
        return jB + Math.round((j12 == (iG == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jB2 - jB));
    }

    @Override // Q3.g
    public int k() {
        return this.f29747d;
    }

    @Override // x3.J
    public long l() {
        return this.f29746c;
    }

    public static j a(i iVar, long j10) {
        long[] jArr;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f29740c;
        if (j11 != -1 && (jArr = iVar.f29743f) != null) {
            F.a aVar = iVar.f29738a;
            return new j(j10, aVar.f169072c, jA, aVar.f169075f, j11, jArr);
        }
        F.a aVar2 = iVar.f29738a;
        return new j(j10, aVar2.f169072c, jA, aVar2.f169075f);
    }

    @Override // x3.J
    public J.a d(long j10) {
        double d10;
        if (!g()) {
            return new J.a(new K(0L, this.f29744a + this.f29745b));
        }
        long jP = P.p(j10, 0L, this.f29746c);
        double d11 = (jP * 100.0d) / this.f29746c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) C13466a.i(this.f29750g);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - i10) * (d10 - d13));
            }
        }
        return new J.a(new K(jP, this.f29744a + P.p(Math.round((d12 / 256.0d) * this.f29748e), this.f29745b, this.f29748e - 1)));
    }
}
