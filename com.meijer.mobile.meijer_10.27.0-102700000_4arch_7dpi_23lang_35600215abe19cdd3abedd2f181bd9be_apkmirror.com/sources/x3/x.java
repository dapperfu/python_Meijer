package x3;

import d3.C13466a;
import x3.J;
import x3.y;

/* loaded from: classes.dex */
public final class x implements J {

    /* renamed from: a, reason: collision with root package name */
    private final y f169257a;

    /* renamed from: b, reason: collision with root package name */
    private final long f169258b;

    @Override // x3.J
    public boolean g() {
        return true;
    }

    @Override // x3.J
    public J.a d(long j10) {
        C13466a.i(this.f169257a.f169269k);
        y yVar = this.f169257a;
        y.a aVar = yVar.f169269k;
        long[] jArr = aVar.f169271a;
        long[] jArr2 = aVar.f169272b;
        int iG = d3.P.g(jArr, yVar.i(j10), true, false);
        K kA = a(iG == -1 ? 0L : jArr[iG], iG != -1 ? jArr2[iG] : 0L);
        if (kA.f169083a == j10 || iG == jArr.length - 1) {
            return new J.a(kA);
        }
        int i10 = iG + 1;
        return new J.a(kA, a(jArr[i10], jArr2[i10]));
    }

    @Override // x3.J
    public long l() {
        return this.f169257a.f();
    }

    public x(y yVar, long j10) {
        this.f169257a = yVar;
        this.f169258b = j10;
    }

    private K a(long j10, long j11) {
        return new K((j10 * 1000000) / this.f169257a.f169263e, this.f169258b + j11);
    }
}
