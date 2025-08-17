package Q3;

import com.fullstory.Reason;
import d3.P;
import java.math.RoundingMode;
import x3.E;
import x3.J;

/* loaded from: classes4.dex */
final class b implements g {

    /* renamed from: a, reason: collision with root package name */
    private final long f29704a;

    /* renamed from: b, reason: collision with root package name */
    private final int f29705b;

    /* renamed from: c, reason: collision with root package name */
    private final E f29706c;

    public b(long j10, long j11, long j12) {
        this.f29706c = new E(new long[]{j11}, new long[]{0}, j10);
        this.f29704a = j12;
        int i10 = Reason.OS_VERSION_TOO_LOW;
        if (j10 == -9223372036854775807L) {
            this.f29705b = Reason.OS_VERSION_TOO_LOW;
            return;
        }
        long jX0 = P.X0(j11 - j12, 8L, j10, RoundingMode.HALF_UP);
        if (jX0 > 0 && jX0 <= 2147483647L) {
            i10 = (int) jX0;
        }
        this.f29705b = i10;
    }

    public boolean a(long j10) {
        return this.f29706c.b(j10, 100000L);
    }

    void c(long j10) {
        this.f29706c.c(j10);
    }

    @Override // x3.J
    public J.a d(long j10) {
        return this.f29706c.d(j10);
    }

    @Override // Q3.g
    public long f() {
        return this.f29704a;
    }

    @Override // x3.J
    public boolean g() {
        return this.f29706c.g();
    }

    @Override // Q3.g
    public long h(long j10) {
        return this.f29706c.h(j10);
    }

    @Override // Q3.g
    public int k() {
        return this.f29705b;
    }

    @Override // x3.J
    public long l() {
        return this.f29706c.l();
    }

    public void b(long j10, long j11) {
        if (a(j10)) {
            return;
        }
        this.f29706c.a(j10, j11);
    }
}
