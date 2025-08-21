package x3;

import d3.C13599a;
import x3.J;
import x3.y;

/* loaded from: classes.dex */
public final class x implements J {

    /* renamed from: a, reason: collision with root package name */
    private final y f170345a;

    /* renamed from: b, reason: collision with root package name */
    private final long f170346b;

    @Override // x3.J
    public boolean g() {
        return true;
    }

    @Override // x3.J
    public J.a d(long j10) {
        C13599a.i(this.f170345a.f170357k);
        y yVar = this.f170345a;
        y.a aVar = yVar.f170357k;
        long[] jArr = aVar.f170359a;
        long[] jArr2 = aVar.f170360b;
        int iG = d3.P.g(jArr, yVar.i(j10), true, false);
        K kA = a(iG == -1 ? 0L : jArr[iG], iG != -1 ? jArr2[iG] : 0L);
        if (kA.f170171a == j10 || iG == jArr.length - 1) {
            return new J.a(kA);
        }
        int i10 = iG + 1;
        return new J.a(kA, a(jArr[i10], jArr2[i10]));
    }

    @Override // x3.J
    public long l() {
        return this.f170345a.f();
    }

    public x(y yVar, long j10) {
        this.f170345a = yVar;
        this.f170346b = j10;
    }

    private K a(long j10, long j11) {
        return new K((j10 * 1000000) / this.f170345a.f170351e, this.f170346b + j11);
    }
}
