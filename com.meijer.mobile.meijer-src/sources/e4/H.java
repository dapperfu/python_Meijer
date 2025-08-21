package e4;

import d3.P;
import java.io.IOException;
import x3.AbstractC18066e;
import x3.InterfaceC18078q;

/* loaded from: classes4.dex */
final class H extends AbstractC18066e {

    private static final class a implements AbstractC18066e.f {

        /* renamed from: a, reason: collision with root package name */
        private final d3.J f129560a;

        /* renamed from: b, reason: collision with root package name */
        private final d3.D f129561b = new d3.D();

        /* renamed from: c, reason: collision with root package name */
        private final int f129562c;

        /* renamed from: d, reason: collision with root package name */
        private final int f129563d;

        private AbstractC18066e.C2733e c(d3.D d10, long j10, long j11) {
            int iA;
            int iA2;
            int iG = d10.g();
            long j12 = -1;
            long j13 = -1;
            long j14 = -9223372036854775807L;
            while (d10.a() >= 188 && (iA2 = (iA = M.a(d10.e(), d10.f(), iG)) + 188) <= iG) {
                long jC = M.c(d10, iA, this.f129562c);
                if (jC != -9223372036854775807L) {
                    long jB = this.f129560a.b(jC);
                    if (jB > j10) {
                        return j14 == -9223372036854775807L ? AbstractC18066e.C2733e.d(jB, j11) : AbstractC18066e.C2733e.e(j11 + j13);
                    }
                    if (100000 + jB > j10) {
                        return AbstractC18066e.C2733e.e(j11 + iA);
                    }
                    j13 = iA;
                    j14 = jB;
                }
                d10.W(iA2);
                j12 = iA2;
            }
            return j14 != -9223372036854775807L ? AbstractC18066e.C2733e.f(j14, j11 + j12) : AbstractC18066e.C2733e.f170275d;
        }

        @Override // x3.AbstractC18066e.f
        public void b() {
            this.f129561b.T(P.f127893f);
        }

        public a(int i10, d3.J j10, int i11) {
            this.f129562c = i10;
            this.f129560a = j10;
            this.f129563d = i11;
        }

        @Override // x3.AbstractC18066e.f
        public AbstractC18066e.C2733e a(InterfaceC18078q interfaceC18078q, long j10) throws IOException {
            long position = interfaceC18078q.getPosition();
            int iMin = (int) Math.min(this.f129563d, interfaceC18078q.getLength() - position);
            this.f129561b.S(iMin);
            interfaceC18078q.m(this.f129561b.e(), 0, iMin);
            return c(this.f129561b, j10, position);
        }
    }

    public H(d3.J j10, long j11, long j12, int i10, int i11) {
        super(new AbstractC18066e.b(), new a(i10, j10, i11), j11, 0L, j11 + 1, 0L, j12, 188L, 940);
    }
}
