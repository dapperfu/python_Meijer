package f4;

import d3.P;
import x3.J;
import x3.K;

/* loaded from: classes4.dex */
final class e implements J {

    /* renamed from: a, reason: collision with root package name */
    private final c f131580a;

    /* renamed from: b, reason: collision with root package name */
    private final int f131581b;

    /* renamed from: c, reason: collision with root package name */
    private final long f131582c;

    /* renamed from: d, reason: collision with root package name */
    private final long f131583d;

    /* renamed from: e, reason: collision with root package name */
    private final long f131584e;

    @Override // x3.J
    public boolean g() {
        return true;
    }

    private long a(long j10) {
        return P.V0(j10 * this.f131581b, 1000000L, this.f131580a.f131573c);
    }

    @Override // x3.J
    public J.a d(long j10) {
        long jP = P.p((this.f131580a.f131573c * j10) / (this.f131581b * 1000000), 0L, this.f131583d - 1);
        long j11 = this.f131582c + (this.f131580a.f131575e * jP);
        long jA = a(jP);
        K k10 = new K(jA, j11);
        if (jA >= j10 || jP == this.f131583d - 1) {
            return new J.a(k10);
        }
        long j12 = jP + 1;
        return new J.a(k10, new K(a(j12), this.f131582c + (this.f131580a.f131575e * j12)));
    }

    @Override // x3.J
    public long l() {
        return this.f131584e;
    }

    public e(c cVar, int i10, long j10, long j11) {
        this.f131580a = cVar;
        this.f131581b = i10;
        this.f131582c = j10;
        long j12 = (j11 - j10) / cVar.f131575e;
        this.f131583d = j12;
        this.f131584e = a(j12);
    }
}
