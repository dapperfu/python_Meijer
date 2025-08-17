package e4;

import d3.P;
import java.io.IOException;
import x3.AbstractC18000e;
import x3.InterfaceC18012q;

/* loaded from: classes4.dex */
final class z extends AbstractC18000e {

    private static final class b implements AbstractC18000e.f {

        /* renamed from: a, reason: collision with root package name */
        private final d3.J f128604a;

        /* renamed from: b, reason: collision with root package name */
        private final d3.D f128605b;

        private AbstractC18000e.C2709e c(d3.D d10, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (d10.a() >= 4) {
                if (z.k(d10.e(), d10.f()) != 442) {
                    d10.X(1);
                } else {
                    d10.X(4);
                    long jL = C13608A.l(d10);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f128604a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? AbstractC18000e.C2709e.d(jB, j11) : AbstractC18000e.C2709e.e(j11 + iF2);
                        }
                        if (100000 + jB > j10) {
                            return AbstractC18000e.C2709e.e(j11 + d10.f());
                        }
                        iF2 = d10.f();
                        j12 = jB;
                    }
                    d(d10);
                    iF = d10.f();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC18000e.C2709e.f(j12, j11 + iF) : AbstractC18000e.C2709e.f169187d;
        }

        private b(d3.J j10) {
            this.f128604a = j10;
            this.f128605b = new d3.D();
        }

        @Override // x3.AbstractC18000e.f
        public void b() {
            this.f128605b.T(P.f127091f);
        }

        private static void d(d3.D d10) {
            int iK;
            int iG = d10.g();
            if (d10.a() < 10) {
                d10.W(iG);
                return;
            }
            d10.X(9);
            int iH = d10.H() & 7;
            if (d10.a() < iH) {
                d10.W(iG);
                return;
            }
            d10.X(iH);
            if (d10.a() < 4) {
                d10.W(iG);
                return;
            }
            if (z.k(d10.e(), d10.f()) == 443) {
                d10.X(4);
                int iP = d10.P();
                if (d10.a() < iP) {
                    d10.W(iG);
                    return;
                }
                d10.X(iP);
            }
            while (d10.a() >= 4 && (iK = z.k(d10.e(), d10.f())) != 442 && iK != 441 && (iK >>> 8) == 1) {
                d10.X(4);
                if (d10.a() < 2) {
                    d10.W(iG);
                    return;
                }
                d10.W(Math.min(d10.g(), d10.f() + d10.P()));
            }
        }

        @Override // x3.AbstractC18000e.f
        public AbstractC18000e.C2709e a(InterfaceC18012q interfaceC18012q, long j10) throws IOException {
            long position = interfaceC18012q.getPosition();
            int iMin = (int) Math.min(20000L, interfaceC18012q.getLength() - position);
            this.f128605b.S(iMin);
            interfaceC18012q.m(this.f128605b.e(), 0, iMin);
            return c(this.f128605b, j10, position);
        }
    }

    public z(d3.J j10, long j11, long j12) {
        super(new AbstractC18000e.b(), new b(j10), j11, 0L, j11 + 1, 0L, j12, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
