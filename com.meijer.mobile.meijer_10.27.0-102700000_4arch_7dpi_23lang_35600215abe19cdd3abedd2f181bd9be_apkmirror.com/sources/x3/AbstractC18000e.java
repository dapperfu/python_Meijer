package x3;

import d3.C13466a;
import java.io.IOException;
import x3.J;

/* renamed from: x3.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18000e {

    /* renamed from: a, reason: collision with root package name */
    protected final a f169168a;

    /* renamed from: b, reason: collision with root package name */
    protected final f f169169b;

    /* renamed from: c, reason: collision with root package name */
    protected c f169170c;

    /* renamed from: d, reason: collision with root package name */
    private final int f169171d;

    /* renamed from: x3.e$a */
    public static class a implements J {

        /* renamed from: a, reason: collision with root package name */
        private final d f169172a;

        /* renamed from: b, reason: collision with root package name */
        private final long f169173b;

        /* renamed from: c, reason: collision with root package name */
        private final long f169174c;

        /* renamed from: d, reason: collision with root package name */
        private final long f169175d;

        /* renamed from: e, reason: collision with root package name */
        private final long f169176e;

        /* renamed from: f, reason: collision with root package name */
        private final long f169177f;

        /* renamed from: g, reason: collision with root package name */
        private final long f169178g;

        @Override // x3.J
        public boolean g() {
            return true;
        }

        @Override // x3.J
        public J.a d(long j10) {
            return new J.a(new K(j10, c.h(this.f169172a.a(j10), this.f169174c, this.f169175d, this.f169176e, this.f169177f, this.f169178g)));
        }

        public long j(long j10) {
            return this.f169172a.a(j10);
        }

        @Override // x3.J
        public long l() {
            return this.f169173b;
        }

        public a(d dVar, long j10, long j11, long j12, long j13, long j14, long j15) {
            this.f169172a = dVar;
            this.f169173b = j10;
            this.f169174c = j11;
            this.f169175d = j12;
            this.f169176e = j13;
            this.f169177f = j14;
            this.f169178g = j15;
        }
    }

    /* renamed from: x3.e$b */
    public static final class b implements d {
        @Override // x3.AbstractC18000e.d
        public long a(long j10) {
            return j10;
        }
    }

    /* renamed from: x3.e$c */
    protected static class c {

        /* renamed from: a, reason: collision with root package name */
        private final long f169179a;

        /* renamed from: b, reason: collision with root package name */
        private final long f169180b;

        /* renamed from: c, reason: collision with root package name */
        private final long f169181c;

        /* renamed from: d, reason: collision with root package name */
        private long f169182d;

        /* renamed from: e, reason: collision with root package name */
        private long f169183e;

        /* renamed from: f, reason: collision with root package name */
        private long f169184f;

        /* renamed from: g, reason: collision with root package name */
        private long f169185g;

        /* renamed from: h, reason: collision with root package name */
        private long f169186h;

        protected static long h(long j10, long j11, long j12, long j13, long j14, long j15) {
            if (j13 + 1 >= j14 || j11 + 1 >= j12) {
                return j13;
            }
            long j16 = (long) ((j10 - j11) * ((j14 - j13) / (j12 - j11)));
            return d3.P.p(((j16 + j13) - j15) - (j16 / 20), j13, j14 - 1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long i() {
            return this.f169185g;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long j() {
            return this.f169184f;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long k() {
            return this.f169186h;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long l() {
            return this.f169179a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public long m() {
            return this.f169180b;
        }

        private void n() {
            this.f169186h = h(this.f169180b, this.f169182d, this.f169183e, this.f169184f, this.f169185g, this.f169181c);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void o(long j10, long j11) {
            this.f169183e = j10;
            this.f169185g = j11;
            n();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void p(long j10, long j11) {
            this.f169182d = j10;
            this.f169184f = j11;
            n();
        }

        protected c(long j10, long j11, long j12, long j13, long j14, long j15, long j16) {
            this.f169179a = j10;
            this.f169180b = j11;
            this.f169182d = j12;
            this.f169183e = j13;
            this.f169184f = j14;
            this.f169185g = j15;
            this.f169181c = j16;
            this.f169186h = h(j11, j12, j13, j14, j15, j16);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x3.e$d */
    public interface d {
        long a(long j10);
    }

    /* renamed from: x3.e$e, reason: collision with other inner class name */
    public static final class C2709e {

        /* renamed from: d, reason: collision with root package name */
        public static final C2709e f169187d = new C2709e(-3, -9223372036854775807L, -1);

        /* renamed from: a, reason: collision with root package name */
        private final int f169188a;

        /* renamed from: b, reason: collision with root package name */
        private final long f169189b;

        /* renamed from: c, reason: collision with root package name */
        private final long f169190c;

        public static C2709e d(long j10, long j11) {
            return new C2709e(-1, j10, j11);
        }

        public static C2709e e(long j10) {
            return new C2709e(0, -9223372036854775807L, j10);
        }

        public static C2709e f(long j10, long j11) {
            return new C2709e(-2, j10, j11);
        }

        private C2709e(int i10, long j10, long j11) {
            this.f169188a = i10;
            this.f169189b = j10;
            this.f169190c = j11;
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: x3.e$f */
    public interface f {
        C2709e a(InterfaceC18012q interfaceC18012q, long j10) throws IOException;

        default void b() {
        }
    }

    protected final void e(boolean z10, long j10) {
        this.f169170c = null;
        this.f169169b.b();
        f(z10, j10);
    }

    protected void f(boolean z10, long j10) {
    }

    protected c a(long j10) {
        return new c(j10, this.f169168a.j(j10), this.f169168a.f169174c, this.f169168a.f169175d, this.f169168a.f169176e, this.f169168a.f169177f, this.f169168a.f169178g);
    }

    public final J b() {
        return this.f169168a;
    }

    public int c(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        while (true) {
            c cVar = (c) C13466a.i(this.f169170c);
            long j10 = cVar.j();
            long jI = cVar.i();
            long jK = cVar.k();
            if (jI - j10 <= this.f169171d) {
                e(false, j10);
                return g(interfaceC18012q, j10, i10);
            }
            if (!i(interfaceC18012q, jK)) {
                return g(interfaceC18012q, jK, i10);
            }
            interfaceC18012q.d();
            C2709e c2709eA = this.f169169b.a(interfaceC18012q, cVar.m());
            int i11 = c2709eA.f169188a;
            if (i11 == -3) {
                e(false, jK);
                return g(interfaceC18012q, jK, i10);
            }
            if (i11 == -2) {
                cVar.p(c2709eA.f169189b, c2709eA.f169190c);
            } else {
                if (i11 != -1) {
                    if (i11 != 0) {
                        throw new IllegalStateException("Invalid case");
                    }
                    i(interfaceC18012q, c2709eA.f169190c);
                    e(true, c2709eA.f169190c);
                    return g(interfaceC18012q, c2709eA.f169190c, i10);
                }
                cVar.o(c2709eA.f169189b, c2709eA.f169190c);
            }
        }
    }

    public final boolean d() {
        return this.f169170c != null;
    }

    public final void h(long j10) {
        c cVar = this.f169170c;
        if (cVar == null || cVar.l() != j10) {
            this.f169170c = a(j10);
        }
    }

    protected AbstractC18000e(d dVar, f fVar, long j10, long j11, long j12, long j13, long j14, long j15, int i10) {
        this.f169169b = fVar;
        this.f169171d = i10;
        this.f169168a = new a(dVar, j10, j11, j12, j13, j14, j15);
    }

    protected final int g(InterfaceC18012q interfaceC18012q, long j10, I i10) {
        if (j10 == interfaceC18012q.getPosition()) {
            return 0;
        }
        i10.f169077a = j10;
        return 1;
    }

    protected final boolean i(InterfaceC18012q interfaceC18012q, long j10) throws IOException {
        long position = j10 - interfaceC18012q.getPosition();
        if (position >= 0 && position <= 262144) {
            interfaceC18012q.k((int) position);
            return true;
        }
        return false;
    }
}
