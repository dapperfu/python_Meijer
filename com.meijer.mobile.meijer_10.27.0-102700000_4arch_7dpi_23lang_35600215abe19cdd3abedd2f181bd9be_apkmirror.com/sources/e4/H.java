package e4;

import d3.P;
import java.io.IOException;
import x3.AbstractC18000e;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class H extends AbstractC18000e {

    private static final class a implements AbstractC18000e.f {

        /* renamed from: a, reason: collision with root package name */
        private final d3.J f128224a;

        /* renamed from: b, reason: collision with root package name */
        private final d3.D f128225b = new d3.D();

        /* renamed from: c, reason: collision with root package name */
        private final int f128226c;

        /* renamed from: d, reason: collision with root package name */
        private final int f128227d;

        private AbstractC18000e.C2709e c(d3.D d10, long j10, long j11) {
            int iA;
            int iA2;
            int iG = d10.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (d10.a() >= 188 && (iA2 = (iA = M.a(d10.e(), d10.f(), iG)) + 188) <= iG) {
                long jC = M.c(d10, iA, this.f128226c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f128224a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? AbstractC18000e.C2709e.d(jB, j11) : AbstractC18000e.C2709e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return AbstractC18000e.C2709e.e(j11 + iA);
                    }
                    j13 = iA;
                    j14 = jB;
                }
                d10.W(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? AbstractC18000e.C2709e.f(j14, j11 + j12) : AbstractC18000e.C2709e.f169187d;
        }

        @Override // x3.AbstractC18000e.f
        public void b() {
            this.f128225b.T(P.f127091f);
        }

        public a(int i10, d3.J j10, int i11) {
            this.f128226c = i10;
            this.f128224a = j10;
            this.f128227d = i11;
        }

        @Override // x3.AbstractC18000e.f
        public AbstractC18000e.C2709e a(InterfaceC18012q interfaceC18012q, long j10) throws IOException {
            long position = interfaceC18012q.getPosition();
            int iMin = (int) Math.min(this.f128227d, interfaceC18012q.getLength() - position);
            this.f128225b.S(iMin);
            interfaceC18012q.m(this.f128225b.e(), 0, iMin);
            return c(this.f128225b, j10, position);
        }
    }

    public H(d3.J j10, long j11, long j12, int i10, int i11) {
        super(new AbstractC18000e.b(), new a(i10, j10, i11), j11, 0L, j11 + 1, 0L, j12, 188L, 940);
    }
}
