package e4;

import d3.P;
import java.io.IOException;
import x3.AbstractC18066e;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class z extends AbstractC18066e {

    private static final class b implements AbstractC18066e.f {

        /* renamed from: a, reason: collision with root package name */
        private final d3.J f129940a;

        /* renamed from: b, reason: collision with root package name */
        private final d3.D f129941b;

        private AbstractC18066e.C2733e c(d3.D d10, long j10, long j11) {
            int iF = -1;
            int iF2 = -1;
            long j12 = -9223372036854775807L;
            while (d10.a() >= 4) {
                if (z.k(d10.e(), d10.f()) != 442) {
                    d10.X(1);
                } else {
                    d10.X(4);
                    long jL = C13756A.l(d10);
                    if (jL != -9223372036854775807L) {
                        long jB = this.f129940a.b(jL);
                        if (jB > j10) {
                            return j12 == -9223372036854775807L ? AbstractC18066e.C2733e.d(jB, j11) : AbstractC18066e.C2733e.e(j11 + iF2);
                        }
                        if (100000 + jB > j10) {
                            return AbstractC18066e.C2733e.e(j11 + d10.f());
                        }
                        iF2 = d10.f();
                        j12 = jB;
                    }
                    d(d10);
                    iF = d10.f();
                }
            }
            return j12 != -9223372036854775807L ? AbstractC18066e.C2733e.f(j12, j11 + iF) : AbstractC18066e.C2733e.f170275d;
        }

        private b(d3.J j10) {
            this.f129940a = j10;
            this.f129941b = new d3.D();
        }

        @Override // x3.AbstractC18066e.f
        public void b() {
            this.f129941b.T(P.f127893f);
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

        @Override // x3.AbstractC18066e.f
        public AbstractC18066e.C2733e a(InterfaceC18078q interfaceC18078q, long j10) throws IOException {
            long position = interfaceC18078q.getPosition();
            int iMin = (int) Math.min(20000L, interfaceC18078q.getLength() - position);
            this.f129941b.S(iMin);
            interfaceC18078q.m(this.f129941b.e(), 0, iMin);
            return c(this.f129941b, j10, position);
        }
    }

    public z(d3.J j10, long j11, long j12) {
        super(new AbstractC18066e.b(), new b(j10), j11, 0L, j11 + 1, 0L, j12, 188L, 1000);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(byte[] bArr, int i10) {
        return (bArr[i10 + 3] & 255) | ((bArr[i10] & 255) << 24) | ((bArr[i10 + 1] & 255) << 16) | ((bArr[i10 + 2] & 255) << 8);
    }
}
