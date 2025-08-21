package C3;

import java.io.IOException;
import java.util.Objects;
import x3.AbstractC18066e;
import x3.InterfaceC18078q;
import x3.v;
import x3.y;

/* loaded from: classes.dex */
final class b extends AbstractC18066e {

    /* renamed from: C3.b$b, reason: collision with other inner class name */
    private static final class C0081b implements AbstractC18066e.f {

        /* renamed from: a, reason: collision with root package name */
        private final y f4058a;

        /* renamed from: b, reason: collision with root package name */
        private final int f4059b;

        /* renamed from: c, reason: collision with root package name */
        private final v.a f4060c;

        private C0081b(y yVar, int i10) {
            this.f4058a = yVar;
            this.f4059b = i10;
            this.f4060c = new v.a();
        }

        private long c(InterfaceC18078q interfaceC18078q) throws IOException {
            while (interfaceC18078q.g() < interfaceC18078q.getLength() - 6 && !v.h(interfaceC18078q, this.f4058a, this.f4059b, this.f4060c)) {
                interfaceC18078q.i(1);
            }
            if (interfaceC18078q.g() >= interfaceC18078q.getLength() - 6) {
                interfaceC18078q.i((int) (interfaceC18078q.getLength() - interfaceC18078q.g()));
                return this.f4058a.f170356j;
            }
            return this.f4060c.f170343a;
        }

        @Override // x3.AbstractC18066e.f
        public AbstractC18066e.C2733e a(InterfaceC18078q interfaceC18078q, long j10) throws IOException {
            long position = interfaceC18078q.getPosition();
            long jC = c(interfaceC18078q);
            long jG = interfaceC18078q.g();
            interfaceC18078q.i(Math.max(6, this.f4058a.f170349c));
            long jC2 = c(interfaceC18078q);
            long jG2 = interfaceC18078q.g();
            if (jC <= j10 && jC2 > j10) {
                return AbstractC18066e.C2733e.e(jG);
            }
            if (jC2 <= j10) {
                return AbstractC18066e.C2733e.f(jC2, jG2);
            }
            return AbstractC18066e.C2733e.d(jC, position);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(final y yVar, int i10, long j10, long j11) {
        super(new AbstractC18066e.d() { // from class: C3.a
            @Override // x3.AbstractC18066e.d
            public final long a(long j12) {
                return yVar.i(j12);
            }
        }, new C0081b(yVar, i10), yVar.f(), 0L, yVar.f170356j, j10, j11, yVar.d(), Math.max(6, yVar.f170349c));
        Objects.requireNonNull(yVar);
    }
}
