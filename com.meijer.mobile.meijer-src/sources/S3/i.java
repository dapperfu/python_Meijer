package S3;

import a3.t;
import d3.C13599a;
import d3.D;
import d3.P;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18078q;
import x3.J;
import x3.O;
import x3.r;

/* loaded from: classes4.dex */
abstract class i {

    /* renamed from: b, reason: collision with root package name */
    private O f34374b;

    /* renamed from: c, reason: collision with root package name */
    private r f34375c;

    /* renamed from: d, reason: collision with root package name */
    private g f34376d;

    /* renamed from: e, reason: collision with root package name */
    private long f34377e;

    /* renamed from: f, reason: collision with root package name */
    private long f34378f;

    /* renamed from: g, reason: collision with root package name */
    private long f34379g;

    /* renamed from: h, reason: collision with root package name */
    private int f34380h;

    /* renamed from: i, reason: collision with root package name */
    private int f34381i;

    /* renamed from: k, reason: collision with root package name */
    private long f34383k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f34384l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f34385m;

    /* renamed from: a, reason: collision with root package name */
    private final e f34373a = new e();

    /* renamed from: j, reason: collision with root package name */
    private b f34382j = new b();

    private static final class c implements g {
        private c() {
        }

        @Override // S3.g
        public void c(long j10) {
        }

        @Override // S3.g
        public long a(InterfaceC18078q interfaceC18078q) {
            return -1L;
        }

        @Override // S3.g
        public J b() {
            return new J.b(-9223372036854775807L);
        }
    }

    protected abstract long f(D d10);

    protected abstract boolean h(D d10, long j10, b bVar) throws IOException;

    static class b {

        /* renamed from: a, reason: collision with root package name */
        t f34386a;

        /* renamed from: b, reason: collision with root package name */
        g f34387b;

        b() {
        }
    }

    private void a() {
        C13599a.i(this.f34374b);
        P.h(this.f34375c);
    }

    private boolean i(InterfaceC18078q interfaceC18078q) throws IOException {
        while (this.f34373a.d(interfaceC18078q)) {
            this.f34383k = interfaceC18078q.getPosition() - this.f34378f;
            if (!h(this.f34373a.c(), this.f34378f, this.f34382j)) {
                return true;
            }
            this.f34378f = interfaceC18078q.getPosition();
        }
        this.f34380h = 3;
        return false;
    }

    private int k(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        long jA = this.f34376d.a(interfaceC18078q);
        if (jA >= 0) {
            i10.f170165a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f34384l) {
            J j10 = (J) C13599a.i(this.f34376d.b());
            this.f34375c.g(j10);
            this.f34374b.f(j10.l());
            this.f34384l = true;
        }
        if (this.f34383k <= 0 && !this.f34373a.d(interfaceC18078q)) {
            this.f34380h = 3;
            return -1;
        }
        this.f34383k = 0L;
        D dC = this.f34373a.c();
        long jF = f(dC);
        if (jF >= 0) {
            long j11 = this.f34379g;
            if (j11 + jF >= this.f34377e) {
                long jB = b(j11);
                this.f34374b.d(dC, dC.g());
                this.f34374b.c(jB, 1, dC.g(), 0, null);
                this.f34377e = -1L;
            }
        }
        this.f34379g += jF;
        return 0;
    }

    protected long c(long j10) {
        return (this.f34381i * j10) / 1000000;
    }

    void d(r rVar, O o10) {
        this.f34375c = rVar;
        this.f34374b = o10;
        l(true);
    }

    protected void e(long j10) {
        this.f34379g = j10;
    }

    protected void l(boolean z10) {
        if (z10) {
            this.f34382j = new b();
            this.f34378f = 0L;
            this.f34380h = 0;
        } else {
            this.f34380h = 1;
        }
        this.f34377e = -1L;
        this.f34379g = 0L;
    }

    final void m(long j10, long j11) {
        this.f34373a.e();
        if (j10 == 0) {
            l(!this.f34384l);
        } else if (this.f34380h != 0) {
            this.f34377e = c(j11);
            ((g) P.h(this.f34376d)).c(this.f34377e);
            this.f34380h = 2;
        }
    }

    private int j(InterfaceC18078q interfaceC18078q) throws IOException {
        boolean z10;
        if (!i(interfaceC18078q)) {
            return -1;
        }
        t tVar = this.f34382j.f34386a;
        this.f34381i = tVar.f44743F;
        if (!this.f34385m) {
            this.f34374b.b(tVar);
            this.f34385m = true;
        }
        g gVar = this.f34382j.f34387b;
        if (gVar != null) {
            this.f34376d = gVar;
        } else if (interfaceC18078q.getLength() == -1) {
            this.f34376d = new c();
        } else {
            f fVarB = this.f34373a.b();
            if ((fVarB.f34360b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f34376d = new S3.a(this, this.f34378f, interfaceC18078q.getLength(), fVarB.f34366h + fVarB.f34367i, fVarB.f34361c, z10);
        }
        this.f34380h = 2;
        this.f34373a.f();
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / this.f34381i;
    }

    final int g(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        a();
        int i11 = this.f34380h;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                P.h(this.f34376d);
                return k(interfaceC18078q, i10);
            }
            interfaceC18078q.k((int) this.f34378f);
            this.f34380h = 2;
            return 0;
        }
        return j(interfaceC18078q);
    }
}
