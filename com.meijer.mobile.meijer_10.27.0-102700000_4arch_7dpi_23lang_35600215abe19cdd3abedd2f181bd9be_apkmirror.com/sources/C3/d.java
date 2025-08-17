package C3;

import a3.y;
import d3.C13466a;
import d3.D;
import d3.P;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.O;
import x3.r;
import x3.u;
import x3.v;
import x3.w;
import x3.x;

/* loaded from: classes.dex */
public final class d implements InterfaceC18011p {

    /* renamed from: o, reason: collision with root package name */
    public static final u f3603o = new u() { // from class: C3.c
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return d.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f3604a;

    /* renamed from: b, reason: collision with root package name */
    private final D f3605b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f3606c;

    /* renamed from: d, reason: collision with root package name */
    private final v.a f3607d;

    /* renamed from: e, reason: collision with root package name */
    private r f3608e;

    /* renamed from: f, reason: collision with root package name */
    private O f3609f;

    /* renamed from: g, reason: collision with root package name */
    private int f3610g;

    /* renamed from: h, reason: collision with root package name */
    private y f3611h;

    /* renamed from: i, reason: collision with root package name */
    private x3.y f3612i;

    /* renamed from: j, reason: collision with root package name */
    private int f3613j;

    /* renamed from: k, reason: collision with root package name */
    private int f3614k;

    /* renamed from: l, reason: collision with root package name */
    private b f3615l;

    /* renamed from: m, reason: collision with root package name */
    private int f3616m;

    /* renamed from: n, reason: collision with root package name */
    private long f3617n;

    public d() {
        this(0);
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws Throwable {
        w.c(interfaceC18012q, false);
        return w.a(interfaceC18012q);
    }

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public d(int i10) {
        this.f3604a = new byte[42];
        this.f3605b = new D(new byte[32768], 0);
        this.f3606c = (i10 & 1) != 0;
        this.f3607d = new v.a();
        this.f3610g = 0;
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new d()};
    }

    private long f(D d10, boolean z10) {
        boolean zD;
        C13466a.e(this.f3612i);
        int iF = d10.f();
        while (iF <= d10.g() - 16) {
            d10.W(iF);
            if (v.d(d10, this.f3612i, this.f3614k, this.f3607d)) {
                d10.W(iF);
                return this.f3607d.f169255a;
            }
            iF++;
        }
        if (!z10) {
            d10.W(iF);
            return -1L;
        }
        while (iF <= d10.g() - this.f3613j) {
            d10.W(iF);
            try {
                zD = v.d(d10, this.f3612i, this.f3614k, this.f3607d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (d10.f() <= d10.g() ? zD : false) {
                d10.W(iF);
                return this.f3607d.f169255a;
            }
            iF++;
        }
        d10.W(d10.g());
        return -1L;
    }

    private J h(long j10, long j11) {
        C13466a.e(this.f3612i);
        x3.y yVar = this.f3612i;
        if (yVar.f169269k != null) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f169268j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f3614k, j10, j11);
        this.f3615l = bVar;
        return bVar.b();
    }

    private void k(InterfaceC18012q interfaceC18012q) throws IOException {
        byte[] bArr = this.f3604a;
        interfaceC18012q.m(bArr, 0, bArr.length);
        interfaceC18012q.d();
        this.f3610g = 2;
    }

    private void l() {
        ((O) P.h(this.f3609f)).c((this.f3617n * 1000000) / ((x3.y) P.h(this.f3612i)).f169263e, 1, this.f3616m, 0, null);
    }

    private int m(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        boolean z10;
        C13466a.e(this.f3609f);
        C13466a.e(this.f3612i);
        b bVar = this.f3615l;
        if (bVar != null && bVar.d()) {
            return this.f3615l.c(interfaceC18012q, i10);
        }
        if (this.f3617n == -1) {
            this.f3617n = v.i(interfaceC18012q, this.f3612i);
            return 0;
        }
        int iG = this.f3605b.g();
        if (iG < 32768) {
            int i11 = interfaceC18012q.read(this.f3605b.e(), iG, 32768 - iG);
            z10 = i11 == -1;
            if (!z10) {
                this.f3605b.V(iG + i11);
            } else if (this.f3605b.a() == 0) {
                l();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f3605b.f();
        int i12 = this.f3616m;
        int i13 = this.f3613j;
        if (i12 < i13) {
            D d10 = this.f3605b;
            d10.X(Math.min(i13 - i12, d10.a()));
        }
        long jF = f(this.f3605b, z10);
        int iF2 = this.f3605b.f() - iF;
        this.f3605b.W(iF);
        this.f3609f.d(this.f3605b, iF2);
        this.f3616m += iF2;
        if (jF != -1) {
            l();
            this.f3616m = 0;
            this.f3617n = jF;
        }
        if (this.f3605b.a() < 16) {
            int iA = this.f3605b.a();
            System.arraycopy(this.f3605b.e(), this.f3605b.f(), this.f3605b.e(), 0, iA);
            this.f3605b.W(0);
            this.f3605b.V(iA);
        }
        return 0;
    }

    private void n(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f3611h = w.d(interfaceC18012q, !this.f3606c);
        this.f3610g = 1;
    }

    private void o(InterfaceC18012q interfaceC18012q) throws IOException {
        w.a aVar = new w.a(this.f3612i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(interfaceC18012q, aVar);
            this.f3612i = (x3.y) P.h(aVar.f169256a);
        }
        C13466a.e(this.f3612i);
        this.f3613j = Math.max(this.f3612i.f169261c, 6);
        ((O) P.h(this.f3609f)).b(this.f3612i.g(this.f3604a, this.f3611h).b().U("audio/flac").N());
        ((O) P.h(this.f3609f)).f(this.f3612i.f());
        this.f3610g = 4;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f3610g = 0;
        } else {
            b bVar = this.f3615l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f3617n = j11 != 0 ? -1L : 0L;
        this.f3616m = 0;
        this.f3605b.S(0);
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        int i11 = this.f3610g;
        if (i11 == 0) {
            n(interfaceC18012q);
            return 0;
        }
        if (i11 == 1) {
            k(interfaceC18012q);
            return 0;
        }
        if (i11 == 2) {
            p(interfaceC18012q);
            return 0;
        }
        if (i11 == 3) {
            o(interfaceC18012q);
            return 0;
        }
        if (i11 == 4) {
            g(interfaceC18012q);
            return 0;
        }
        if (i11 == 5) {
            return m(interfaceC18012q, i10);
        }
        throw new IllegalStateException();
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f3608e = rVar;
        this.f3609f = rVar.t(0, 1);
        rVar.p();
    }

    private void g(InterfaceC18012q interfaceC18012q) throws IOException {
        this.f3614k = w.b(interfaceC18012q);
        ((r) P.h(this.f3608e)).g(h(interfaceC18012q.getPosition(), interfaceC18012q.getLength()));
        this.f3610g = 5;
    }

    private void p(InterfaceC18012q interfaceC18012q) throws IOException {
        w.i(interfaceC18012q);
        this.f3610g = 3;
    }
}
