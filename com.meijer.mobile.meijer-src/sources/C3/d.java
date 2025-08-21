package C3;

import a3.y;
import d3.C13599a;
import d3.D;
import d3.P;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.O;
import x3.r;
import x3.u;
import x3.v;
import x3.w;
import x3.x;

/* loaded from: classes.dex */
public final class d implements InterfaceC18077p {

    /* renamed from: o, reason: collision with root package name */
    public static final u f4061o = new u() { // from class: C3.c
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return d.d();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final byte[] f4062a;

    /* renamed from: b, reason: collision with root package name */
    private final D f4063b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f4064c;

    /* renamed from: d, reason: collision with root package name */
    private final v.a f4065d;

    /* renamed from: e, reason: collision with root package name */
    private r f4066e;

    /* renamed from: f, reason: collision with root package name */
    private O f4067f;

    /* renamed from: g, reason: collision with root package name */
    private int f4068g;

    /* renamed from: h, reason: collision with root package name */
    private y f4069h;

    /* renamed from: i, reason: collision with root package name */
    private x3.y f4070i;

    /* renamed from: j, reason: collision with root package name */
    private int f4071j;

    /* renamed from: k, reason: collision with root package name */
    private int f4072k;

    /* renamed from: l, reason: collision with root package name */
    private b f4073l;

    /* renamed from: m, reason: collision with root package name */
    private int f4074m;

    /* renamed from: n, reason: collision with root package name */
    private long f4075n;

    public d() {
        this(0);
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws Throwable {
        w.c(interfaceC18078q, false);
        return w.a(interfaceC18078q);
    }

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public d(int i10) {
        this.f4062a = new byte[42];
        this.f4063b = new D(new byte[32768], 0);
        this.f4064c = (i10 & 1) != 0;
        this.f4065d = new v.a();
        this.f4068g = 0;
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new d()};
    }

    private long f(D d10, boolean z10) {
        boolean zD;
        C13599a.e(this.f4070i);
        int iF = d10.f();
        while (iF <= d10.g() - 16) {
            d10.W(iF);
            if (v.d(d10, this.f4070i, this.f4072k, this.f4065d)) {
                d10.W(iF);
                return this.f4065d.f170343a;
            }
            iF++;
        }
        if (!z10) {
            d10.W(iF);
            return -1L;
        }
        while (iF <= d10.g() - this.f4071j) {
            d10.W(iF);
            try {
                zD = v.d(d10, this.f4070i, this.f4072k, this.f4065d);
            } catch (IndexOutOfBoundsException unused) {
                zD = false;
            }
            if (d10.f() <= d10.g() ? zD : false) {
                d10.W(iF);
                return this.f4065d.f170343a;
            }
            iF++;
        }
        d10.W(d10.g());
        return -1L;
    }

    private J h(long j10, long j11) {
        C13599a.e(this.f4070i);
        x3.y yVar = this.f4070i;
        if (yVar.f170357k != null) {
            return new x(yVar, j10);
        }
        if (j11 == -1 || yVar.f170356j <= 0) {
            return new J.b(yVar.f());
        }
        b bVar = new b(yVar, this.f4072k, j10, j11);
        this.f4073l = bVar;
        return bVar.b();
    }

    private void k(InterfaceC18078q interfaceC18078q) throws IOException {
        byte[] bArr = this.f4062a;
        interfaceC18078q.m(bArr, 0, bArr.length);
        interfaceC18078q.d();
        this.f4068g = 2;
    }

    private void l() {
        ((O) P.h(this.f4067f)).c((this.f4075n * 1000000) / ((x3.y) P.h(this.f4070i)).f170351e, 1, this.f4074m, 0, null);
    }

    private int m(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        boolean z10;
        C13599a.e(this.f4067f);
        C13599a.e(this.f4070i);
        b bVar = this.f4073l;
        if (bVar != null && bVar.d()) {
            return this.f4073l.c(interfaceC18078q, i10);
        }
        if (this.f4075n == -1) {
            this.f4075n = v.i(interfaceC18078q, this.f4070i);
            return 0;
        }
        int iG = this.f4063b.g();
        if (iG < 32768) {
            int i11 = interfaceC18078q.read(this.f4063b.e(), iG, 32768 - iG);
            z10 = i11 == -1;
            if (!z10) {
                this.f4063b.V(iG + i11);
            } else if (this.f4063b.a() == 0) {
                l();
                return -1;
            }
        } else {
            z10 = false;
        }
        int iF = this.f4063b.f();
        int i12 = this.f4074m;
        int i13 = this.f4071j;
        if (i12 < i13) {
            D d10 = this.f4063b;
            d10.X(Math.min(i13 - i12, d10.a()));
        }
        long jF = f(this.f4063b, z10);
        int iF2 = this.f4063b.f() - iF;
        this.f4063b.W(iF);
        this.f4067f.d(this.f4063b, iF2);
        this.f4074m += iF2;
        if (jF != -1) {
            l();
            this.f4074m = 0;
            this.f4075n = jF;
        }
        if (this.f4063b.a() < 16) {
            int iA = this.f4063b.a();
            System.arraycopy(this.f4063b.e(), this.f4063b.f(), this.f4063b.e(), 0, iA);
            this.f4063b.W(0);
            this.f4063b.V(iA);
        }
        return 0;
    }

    private void n(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f4069h = w.d(interfaceC18078q, !this.f4064c);
        this.f4068g = 1;
    }

    private void o(InterfaceC18078q interfaceC18078q) throws IOException {
        w.a aVar = new w.a(this.f4070i);
        boolean zE = false;
        while (!zE) {
            zE = w.e(interfaceC18078q, aVar);
            this.f4070i = (x3.y) P.h(aVar.f170344a);
        }
        C13599a.e(this.f4070i);
        this.f4071j = Math.max(this.f4070i.f170349c, 6);
        ((O) P.h(this.f4067f)).b(this.f4070i.g(this.f4062a, this.f4069h).b().U("audio/flac").N());
        ((O) P.h(this.f4067f)).f(this.f4070i.f());
        this.f4068g = 4;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f4068g = 0;
        } else {
            b bVar = this.f4073l;
            if (bVar != null) {
                bVar.h(j11);
            }
        }
        this.f4075n = j11 != 0 ? -1L : 0L;
        this.f4074m = 0;
        this.f4063b.S(0);
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        int i11 = this.f4068g;
        if (i11 == 0) {
            n(interfaceC18078q);
            return 0;
        }
        if (i11 == 1) {
            k(interfaceC18078q);
            return 0;
        }
        if (i11 == 2) {
            p(interfaceC18078q);
            return 0;
        }
        if (i11 == 3) {
            o(interfaceC18078q);
            return 0;
        }
        if (i11 == 4) {
            g(interfaceC18078q);
            return 0;
        }
        if (i11 == 5) {
            return m(interfaceC18078q, i10);
        }
        throw new IllegalStateException();
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f4066e = rVar;
        this.f4067f = rVar.t(0, 1);
        rVar.p();
    }

    private void g(InterfaceC18078q interfaceC18078q) throws IOException {
        this.f4072k = w.b(interfaceC18078q);
        ((r) P.h(this.f4066e)).g(h(interfaceC18078q.getPosition(), interfaceC18078q.getLength()));
        this.f4068g = 5;
    }

    private void p(InterfaceC18078q interfaceC18078q) throws IOException {
        w.i(interfaceC18078q);
        this.f4068g = 3;
    }
}
