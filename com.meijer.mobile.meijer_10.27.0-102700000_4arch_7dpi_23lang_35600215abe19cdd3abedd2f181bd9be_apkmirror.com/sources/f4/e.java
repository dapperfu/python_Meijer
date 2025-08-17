package f4;

import d3.P;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class e implements J {

    /* renamed from: a, reason: collision with root package name */
    private final c f130746a;

    /* renamed from: b, reason: collision with root package name */
    private final int f130747b;

    /* renamed from: c, reason: collision with root package name */
    private final long f130748c;

    /* renamed from: d, reason: collision with root package name */
    private final long f130749d;

    /* renamed from: e, reason: collision with root package name */
    private final long f130750e;

    @Override // x3.J
    public boolean g() {
        return true;
    }

    private long a(long j10) {
        return P.V0(j10 * this.f130747b, 1000000L, this.f130746a.f130739c);
    }

    @Override // x3.J
    public J.a d(long j10) {
        long jP = P.p((this.f130746a.f130739c * j10) / (this.f130747b * 1000000), 0L, this.f130749d - 1);
        long j11 = this.f130748c + (this.f130746a.f130741e * jP);
        long jA = a(jP);
        K k10 = new K(jA, j11);
        if (jA >= j10 || jP == this.f130749d - 1) {
            return new J.a(k10);
        }
        long j12 = jP + 1;
        return new J.a(k10, new K(a(j12), this.f130748c + (this.f130746a.f130741e * j12)));
    }

    @Override // x3.J
    public long l() {
        return this.f130750e;
    }

    public e(c cVar, int i10, long j10, long j11) {
        this.f130746a = cVar;
        this.f130747b = i10;
        this.f130748c = j10;
        long j12 = (j11 - j10) / cVar.f130741e;
        this.f130749d = j12;
        this.f130750e = a(j12);
    }
}
