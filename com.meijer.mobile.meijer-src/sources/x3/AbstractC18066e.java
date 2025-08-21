package x3;

import d3.C13599a;
import java.io.IOException;
import x3.J;

/* renamed from: x3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18066e {

    /* renamed from: a, reason: collision with root package name */
    protected final a f170256a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f170257b;

    /* renamed from: c, reason: collision with root package name */
    protected c f170258c;

    /* renamed from: d, reason: collision with root package name */
    private final int f170259d;

    /* renamed from: x3.e$a */
    public static class a implements J {

        /* renamed from: a, reason: collision with root package name */
        private final d f170260a;

        /* renamed from: b, reason: collision with root package name */
        private final long f170261b;

        /* renamed from: c, reason: collision with root package name */
        private final long f170262c;

        /* renamed from: d, reason: collision with root package name */
        private final long f170263d;

        /* renamed from: e, reason: collision with root package name */
        private final long f170264e;

        /* renamed from: f, reason: collision with root package name */
        private final long f170265f;

        /* renamed from: g, reason: collision with root package name */
        private final long f170266g;

        @Override // x3.J
        public boolean g() {
            return true;
        }

        @Override // x3.J
        public J.a d(long j10) {
            return new J.a(new K(j10, c.h(this.f170260a.a(j10), this.f170262c, this.f170263d, this.f170264e, this.f170265f, this.f170266g)));
        }

        public long j(long j10) {
            return this.f170260a.a(j10);
        }

        @Override // x3.J
        public long l() {
            return this.f170261b;
        }

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f170260a = dVar;
            this.f170261b = j10;
            this.f170262c = j11;
            this.f170263d = j12;
            this.f170264e = j13;
            this.f170265f = j14;
            this.f170266g = j15;
        }
    }

    /* renamed from: x3.e$b */
    public static final class b implements d {
        @Override // x3.AbstractC18066e.d
        public long a(long j10) {
            return j10;
        }
    }

    /* renamed from: x3.e$c */
    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f170267a;

        /* renamed from: b, reason: collision with root package name */
        private final long f170268b;

        /* renamed from: c, reason: collision with root package name */
        private final long f170269c;

        /* renamed from: d, reason: collision with root package name */
        private long f170270d;

        /* renamed from: e, reason: collision with root package name */
        private long f170271e;

        /* renamed from: f, reason: collision with root package name */
        private long f170272f;

        /* renamed from: g, reason: collision with root package name */
        private long f170273g;

        /* renamed from: h, reason: collision with root package name */
        private long f170274h;

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return d3.P.p(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f170273g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f170272f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f170274h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f170267a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f170268b;
        }

        private void n() {
            this.f170274h = h(this.f170268b, this.f170270d, this.f170271e, this.f170272f, this.f170273g, this.f170269c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f170271e = j10;
            this.f170273g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f170270d = j10;
            this.f170272f = j11;
            n();
        }

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f170267a = j10;
            this.f170268b = j11;
            this.f170270d = j12;
            this.f170271e = j13;
            this.f170272f = j14;
            this.f170273g = j15;
            this.f170269c = j16;
            this.f170274h = h(j11, j12, j13, j14, j15, j16);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x3.e$d */
    public interface d {
        long a(long j10);
    }

    /* renamed from: x3.e$e, reason: collision with other inner class name */
    public static final class C2733e {

        /* renamed from: d, reason: collision with root package name */
        public static final C2733e f170275d = new C2733e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f170276a;

        /* renamed from: b, reason: collision with root package name */
        private final long f170277b;

        /* renamed from: c, reason: collision with root package name */
        private final long f170278c;

        public static C2733e d(long j10, long j11) {
            return new C2733e(-1, j10, j11);
        }

        public static C2733e e(long j10) {
            return new C2733e(0, -9223372036854775807L, j10);
        }

        public static C2733e f(long j10, long j11) {
            return new C2733e(-2, j10, j11);
        }

        private C2733e(int i10, long j10, long j11) {
            this.f170276a = i10;
            this.f170277b = j10;
            this.f170278c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x3.e$f */
    public interface f {
        C2733e a(InterfaceC18078q interfaceC18078q, long j10) throws IOException;

        default void b() {
        }
    }

    protected final void e(boolean z10, long j10) {
        this.f170258c = null;
        this.f170257b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected c a(long j10) {
        return new c(j10, this.f170256a.j(j10), this.f170256a.f170262c, this.f170256a.f170263d, this.f170256a.f170264e, this.f170256a.f170265f, this.f170256a.f170266g);
    }

    public final J b() {
        return this.f170256a;
    }

    public int c(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        while (true) {
            c cVar = (c) C13599a.i(this.f170258c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f170259d) {
                e(false, j10);
                return g(interfaceC18078q, j10, i10);
            }
            if (!i(interfaceC18078q, jK)) {
                return g(interfaceC18078q, jK, i10);
            }
            interfaceC18078q.d();
            C2733e c2733eA = this.f170257b.a(interfaceC18078q, cVar.m());
            int i11 = c2733eA.f170276a;
            if (i11 == -3) {
                e(false, jK);
                return g(interfaceC18078q, jK, i10);
            }
            if (i11 == -2) {
                cVar.p(c2733eA.f170277b, c2733eA.f170278c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC18078q, c2733eA.f170278c);
                    e(true, c2733eA.f170278c);
                    return g(interfaceC18078q, c2733eA.f170278c, i10);
                }
                cVar.o(c2733eA.f170277b, c2733eA.f170278c);
            }
        }
    }

    public final boolean d() {
        return this.f170258c != null;
    }

    public final void h(long j10) {
        c cVar = this.f170258c;
        if (cVar == null || cVar.l() != j10) {
            this.f170258c = a(j10);
        }
    }

    protected AbstractC18066e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f170257b = fVar;
        this.f170259d = i10;
        this.f170256a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected final int g(InterfaceC18078q interfaceC18078q, long j10, I i10) {
        if (j10 == interfaceC18078q.getPosition()) {
            return 0;
        }
        i10.f170165a = j10;
        return 1;
    }

    protected final boolean i(InterfaceC18078q interfaceC18078q, long j10) throws IOException {
        long position = j10 - interfaceC18078q.getPosition();
        if (position >= 0 && position <= 262144) {
            interfaceC18078q.k((int) position);
            return true;
        }
        return false;
    }
}
