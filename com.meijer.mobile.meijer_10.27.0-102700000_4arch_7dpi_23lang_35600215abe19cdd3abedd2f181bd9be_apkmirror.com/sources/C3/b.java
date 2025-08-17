package C3;

import java.io.IOException;
import java.util.Objects;
import x3.AbstractC18000e;
import x3.InterfaceC18012q;
import x3.v;
import x3.y;

/* loaded from: classes.dex */
final class b extends AbstractC18000e {

    /* renamed from: C3.b$b, reason: collision with other inner class name */
    private static final class C0060b implements AbstractC18000e.f {

        /* renamed from: a, reason: collision with root package name */
        private final y f3600a;

        /* renamed from: b, reason: collision with root package name */
        private final int f3601b;

        /* renamed from: c, reason: collision with root package name */
        private final v.a f3602c;

        private C0060b(y yVar, int i10) {
            this.f3600a = yVar;
            this.f3601b = i10;
            this.f3602c = new v.a();
        }

        private long c(InterfaceC18012q interfaceC18012q) throws IOException {
            while (interfaceC18012q.g() < interfaceC18012q.getLength() - 6 && !v.h(interfaceC18012q, this.f3600a, this.f3601b, this.f3602c)) {
                interfaceC18012q.i(1);
            }
            if (interfaceC18012q.g() >= interfaceC18012q.getLength() - 6) {
                interfaceC18012q.i((int) (interfaceC18012q.getLength() - interfaceC18012q.g()));
                return this.f3600a.f169268j;
            }
            return this.f3602c.f169255a;
        }

        @Override // x3.AbstractC18000e.f
        public AbstractC18000e.C2709e a(InterfaceC18012q interfaceC18012q, long j10) throws IOException {
            long position = interfaceC18012q.getPosition();
            long jC = c(interfaceC18012q);
            long jG = interfaceC18012q.g();
            interfaceC18012q.i(Math.max(6, this.f3600a.f169261c));
            long jC2 = c(interfaceC18012q);
            long jG2 = interfaceC18012q.g();
            if (jC <= j10 && jC2 > j10) {
                return AbstractC18000e.C2709e.e(jG);
            }
            if (jC2 <= j10) {
                return AbstractC18000e.C2709e.f(jC2, jG2);
            }
            return AbstractC18000e.C2709e.d(jC, position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new AbstractC18000e.d() { // from class: C3.a
            @Override // x3.AbstractC18000e.d
            public final long a(long j12) {
                return yVar.i(j12);
            }
        }, new C0060b(yVar, i10), yVar.f(), 0L, yVar.f169268j, j10, j11, yVar.d(), Math.max(6, yVar.f169261c));
        Objects.requireNonNull(yVar);
    }
}
