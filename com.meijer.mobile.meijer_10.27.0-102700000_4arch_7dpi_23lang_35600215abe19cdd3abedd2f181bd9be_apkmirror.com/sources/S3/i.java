package S3;

import a3.t;
import d3.C13466a;
import d3.D;
import d3.P;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18012q;
import x3.J;
import x3.O;
import x3.r;

/* loaded from: classes4.dex */
abstract class i {

    /* renamed from: b, reason: collision with root package name */
    private O f33195b;

    /* renamed from: c, reason: collision with root package name */
    private r f33196c;

    /* renamed from: d, reason: collision with root package name */
    private g f33197d;

    /* renamed from: e, reason: collision with root package name */
    private long f33198e;

    /* renamed from: f, reason: collision with root package name */
    private long f33199f;

    /* renamed from: g, reason: collision with root package name */
    private long f33200g;

    /* renamed from: h, reason: collision with root package name */
    private int f33201h;

    /* renamed from: i, reason: collision with root package name */
    private int f33202i;

    /* renamed from: k, reason: collision with root package name */
    private long f33204k;

    /* renamed from: l, reason: collision with root package name */
    private boolean f33205l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f33206m;

    /* renamed from: a, reason: collision with root package name */
    private final e f33194a = new e();

    /* renamed from: j, reason: collision with root package name */
    private b f33203j = new b();

    private static final class c implements g {
        private c() {
        }

        @Override // S3.g
        public void c(long j10) {
        }

        @Override // S3.g
        public long a(InterfaceC18012q interfaceC18012q) {
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
        t f33207a;

        /* renamed from: b, reason: collision with root package name */
        g f33208b;

        b() {
        }
    }

    private void a() {
        C13466a.i(this.f33195b);
        P.h(this.f33196c);
    }

    private boolean i(InterfaceC18012q interfaceC18012q) throws IOException {
        while (this.f33194a.d(interfaceC18012q)) {
            this.f33204k = interfaceC18012q.getPosition() - this.f33199f;
            if (!h(this.f33194a.c(), this.f33199f, this.f33203j)) {
                return true;
            }
            this.f33199f = interfaceC18012q.getPosition();
        }
        this.f33201h = 3;
        return false;
    }

    private int k(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        long jA = this.f33197d.a(interfaceC18012q);
        if (jA >= 0) {
            i10.f169077a = jA;
            return 1;
        }
        if (jA < -1) {
            e(-(jA + 2));
        }
        if (!this.f33205l) {
            J j10 = (J) C13466a.i(this.f33197d.b());
            this.f33196c.g(j10);
            this.f33195b.f(j10.l());
            this.f33205l = true;
        }
        if (this.f33204k <= 0 && !this.f33194a.d(interfaceC18012q)) {
            this.f33201h = 3;
            return -1;
        }
        this.f33204k = 0L;
        D dC = this.f33194a.c();
        long jF = f(dC);
        if (jF >= 0) {
            long j11 = this.f33200g;
            if (j11 + jF >= this.f33198e) {
                long jB = b(j11);
                this.f33195b.d(dC, dC.g());
                this.f33195b.c(jB, 1, dC.g(), 0, null);
                this.f33198e = -1L;
            }
        }
        this.f33200g += jF;
        return 0;
    }

    protected long c(long j10) {
        return (this.f33202i * j10) / 1000000;
    }

    void d(r rVar, O o10) {
        this.f33196c = rVar;
        this.f33195b = o10;
        l(true);
    }

    protected void e(long j10) {
        this.f33200g = j10;
    }

    protected void l(boolean z10) {
        if (z10) {
            this.f33203j = new b();
            this.f33199f = 0L;
            this.f33201h = 0;
        } else {
            this.f33201h = 1;
        }
        this.f33198e = -1L;
        this.f33200g = 0L;
    }

    final void m(long j10, long j11) {
        this.f33194a.e();
        if (j10 == 0) {
            l(!this.f33205l);
        } else if (this.f33201h != 0) {
            this.f33198e = c(j11);
            ((g) P.h(this.f33197d)).c(this.f33198e);
            this.f33201h = 2;
        }
    }

    private int j(InterfaceC18012q interfaceC18012q) throws IOException {
        boolean z10;
        if (!i(interfaceC18012q)) {
            return -1;
        }
        t tVar = this.f33203j.f33207a;
        this.f33202i = tVar.f43925F;
        if (!this.f33206m) {
            this.f33195b.b(tVar);
            this.f33206m = true;
        }
        g gVar = this.f33203j.f33208b;
        if (gVar != null) {
            this.f33197d = gVar;
        } else if (interfaceC18012q.getLength() == -1) {
            this.f33197d = new c();
        } else {
            f fVarB = this.f33194a.b();
            if ((fVarB.f33181b & 4) != 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            this.f33197d = new S3.a(this, this.f33199f, interfaceC18012q.getLength(), fVarB.f33187h + fVarB.f33188i, fVarB.f33182c, z10);
        }
        this.f33201h = 2;
        this.f33194a.f();
        return 0;
    }

    protected long b(long j10) {
        return (j10 * 1000000) / this.f33202i;
    }

    final int g(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        a();
        int i11 = this.f33201h;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 == 3) {
                        return -1;
                    }
                    throw new IllegalStateException();
                }
                P.h(this.f33197d);
                return k(interfaceC18012q, i10);
            }
            interfaceC18012q.k((int) this.f33199f);
            this.f33201h = 2;
            return 0;
        }
        return j(interfaceC18012q);
    }
}
