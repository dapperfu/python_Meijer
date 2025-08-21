package Q3;

import com.fullstory.Reason;
import d3.P;
import java.math.RoundingMode;
import x3.E;
import x3.J;

/* loaded from: classes4.dex */
final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f27717a;

    /* renamed from: b, reason: collision with root package name */
    private final int f27718b;

    /* renamed from: c, reason: collision with root package name */
    private final E f27719c;

    public b(long j10, long j11, long j12) {
        this.f27719c = new E(new long[]{j11}, new long[]{0}, j10);
        this.f27717a = j12;
        int i10 = Reason.OS_VERSION_TOO_LOW;
        if (j10 == -9223372036854775807L) {
            this.f27718b = Reason.OS_VERSION_TOO_LOW;
            return;
        }
        long jX0 = P.X0(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jX0 > 0 && jX0 <= 2147483647L) {
            i10 = (int) jX0;
        }
        this.f27718b = i10;
    }

    public boolean a(long j10) {
        return this.f27719c.b(j10, 100000L);
    }

    void c(long j10) {
        this.f27719c.c(j10);
    }

    @Override // x3.J
    public J.a d(long j10) {
        return this.f27719c.d(j10);
    }

    @Override // Q3.g
    public long f() {
        return this.f27717a;
    }

    @Override // x3.J
    public boolean g() {
        return this.f27719c.g();
    }

    @Override // Q3.g
    public long h(long j10) {
        return this.f27719c.h(j10);
    }

    @Override // Q3.g
    public int k() {
        return this.f27718b;
    }

    @Override // x3.J
    public long l() {
        return this.f27719c.l();
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f27719c.a(j10, j11);
    }
}
