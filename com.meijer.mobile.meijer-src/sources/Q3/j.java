package Q3;

import d3.C13599a;
import d3.P;
import x3.F;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class j implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f27757a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27758b;

    /* renamed from: c, reason: collision with root package name */
    private final long f27759c;

    /* renamed from: d, reason: collision with root package name */
    private final int f27760d;

    /* renamed from: e, reason: collision with root package name */
    private final long f27761e;

    /* renamed from: f, reason: collision with root package name */
    private final long f27762f;

    /* renamed from: g, reason: collision with root package name */
    private final long[] f27763g;

    private j(long j10, int i10, long j11, int i11) {
        this(j10, i10, j11, i11, -1L, null);
    }

    private j(long j10, int i10, long j11, int i11, long j12, long[] jArr) {
        this.f27757a = j10;
        this.f27758b = i10;
        this.f27759c = j11;
        this.f27760d = i11;
        this.f27761e = j12;
        this.f27763g = jArr;
        this.f27762f = j12 != -1 ? j10 + j12 : -1L;
    }

    private long b(int i10) {
        return (this.f27759c * i10) / 100;
    }

    @Override // Q3.g
    public long f() {
        return this.f27762f;
    }

    @Override // x3.J
    public boolean g() {
        return this.f27763g != null;
    }

    @Override // Q3.g
    public long h(long j10) {
        long j11 = j10 - this.f27757a;
        if (!g() || j11 <= this.f27758b) {
            return 0L;
        }
        long[] jArr = (long[]) C13599a.i(this.f27763g);
        double d10 = (j11 * 256.0d) / this.f27761e;
        int iG = P.g(jArr, (long) d10, true, true);
        long jB = b(iG);
        long j12 = jArr[iG];
        int i10 = iG + 1;
        long jB2 = b(i10);
        return jB + Math.round((j12 == (iG == 99 ? 256L : jArr[i10]) ? 0.0d : (d10 - j12) / (r0 - j12)) * (jB2 - jB));
    }

    @Override // Q3.g
    public int k() {
        return this.f27760d;
    }

    @Override // x3.J
    public long l() {
        return this.f27759c;
    }

    public static j a(i iVar, long j10) {
        long[] jArr;
        long jA = iVar.a();
        if (jA == -9223372036854775807L) {
            return null;
        }
        long j11 = iVar.f27753c;
        if (j11 != -1 && (jArr = iVar.f27756f) != null) {
            F.a aVar = iVar.f27751a;
            return new j(j10, aVar.f170160c, jA, aVar.f170163f, j11, jArr);
        }
        F.a aVar2 = iVar.f27751a;
        return new j(j10, aVar2.f170160c, jA, aVar2.f170163f);
    }

    @Override // x3.J
    public J.a d(long j10) {
        double d10;
        if (!g()) {
            return new J.a(new K(0L, this.f27757a + this.f27758b));
        }
        long jP = P.p(j10, 0L, this.f27759c);
        double d11 = (jP * 100.0d) / this.f27759c;
        double d12 = 0.0d;
        if (d11 > 0.0d) {
            if (d11 >= 100.0d) {
                d12 = 256.0d;
            } else {
                int i10 = (int) d11;
                long[] jArr = (long[]) C13599a.i(this.f27763g);
                double d13 = jArr[i10];
                if (i10 == 99) {
                    d10 = 256.0d;
                } else {
                    d10 = jArr[i10 + 1];
                }
                d12 = d13 + ((d11 - i10) * (d10 - d13));
            }
        }
        return new J.a(new K(jP, this.f27757a + P.p(Math.round((d12 / 256.0d) * this.f27761e), this.f27758b, this.f27761e - 1)));
    }
}
