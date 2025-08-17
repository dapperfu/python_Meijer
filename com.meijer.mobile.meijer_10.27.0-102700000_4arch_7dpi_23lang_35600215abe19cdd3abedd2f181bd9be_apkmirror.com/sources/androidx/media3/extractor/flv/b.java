package androidx.media3.extractor.flv;

import androidx.media3.extractor.flv.b;
import d3.C13466a;
import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18011p;
import x3.InterfaceC18012q;
import x3.J;
import x3.r;
import x3.u;

/* loaded from: classes.dex */
public final class b implements InterfaceC18011p {

    /* renamed from: q, reason: collision with root package name */
    public static final u f57292q = new u() { // from class: D3.a
        @Override // x3.u
        public final InterfaceC18011p[] f() {
            return b.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private r f57298f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f57300h;

    /* renamed from: i, reason: collision with root package name */
    private long f57301i;

    /* renamed from: j, reason: collision with root package name */
    private int f57302j;

    /* renamed from: k, reason: collision with root package name */
    private int f57303k;

    /* renamed from: l, reason: collision with root package name */
    private int f57304l;

    /* renamed from: m, reason: collision with root package name */
    private long f57305m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f57306n;

    /* renamed from: o, reason: collision with root package name */
    private a f57307o;

    /* renamed from: p, reason: collision with root package name */
    private d f57308p;

    /* renamed from: a, reason: collision with root package name */
    private final D f57293a = new D(4);

    /* renamed from: b, reason: collision with root package name */
    private final D f57294b = new D(9);

    /* renamed from: c, reason: collision with root package name */
    private final D f57295c = new D(11);

    /* renamed from: d, reason: collision with root package name */
    private final D f57296d = new D();

    /* renamed from: e, reason: collision with root package name */
    private final c f57297e = new c();

    /* renamed from: g, reason: collision with root package name */
    private int f57299g = 1;

    @Override // x3.InterfaceC18011p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18011p[] d() {
        return new InterfaceC18011p[]{new b()};
    }

    private void f() {
        if (this.f57306n) {
            return;
        }
        this.f57298f.g(new J.b(-9223372036854775807L));
        this.f57306n = true;
    }

    private long g() {
        if (this.f57300h) {
            return this.f57301i + this.f57305m;
        }
        if (this.f57297e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f57305m;
    }

    private D h(InterfaceC18012q interfaceC18012q) throws IOException {
        if (this.f57304l > this.f57296d.b()) {
            D d10 = this.f57296d;
            d10.U(new byte[Math.max(d10.b() * 2, this.f57304l)], 0);
        } else {
            this.f57296d.W(0);
        }
        this.f57296d.V(this.f57304l);
        interfaceC18012q.readFully(this.f57296d.e(), 0, this.f57304l);
        return this.f57296d;
    }

    private boolean k(InterfaceC18012q interfaceC18012q) throws IOException {
        if (!interfaceC18012q.f(this.f57294b.e(), 0, 9, true)) {
            return false;
        }
        this.f57294b.W(0);
        this.f57294b.X(4);
        int iH = this.f57294b.H();
        boolean z10 = (iH & 4) != 0;
        boolean z11 = (iH & 1) != 0;
        if (z10 && this.f57307o == null) {
            this.f57307o = new a(this.f57298f.t(8, 1));
        }
        if (z11 && this.f57308p == null) {
            this.f57308p = new d(this.f57298f.t(9, 2));
        }
        this.f57298f.p();
        this.f57302j = this.f57294b.q() - 5;
        this.f57299g = 2;
        return true;
    }

    private boolean m(InterfaceC18012q interfaceC18012q) throws IOException {
        if (!interfaceC18012q.f(this.f57295c.e(), 0, 11, true)) {
            return false;
        }
        this.f57295c.W(0);
        this.f57303k = this.f57295c.H();
        this.f57304l = this.f57295c.K();
        this.f57305m = this.f57295c.K();
        this.f57305m = ((this.f57295c.H() << 24) | this.f57305m) * 1000;
        this.f57295c.X(3);
        this.f57299g = 4;
        return true;
    }

    private void n(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.k(this.f57302j);
        this.f57302j = 0;
        this.f57299g = 3;
    }

    @Override // x3.InterfaceC18011p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f57299g = 1;
            this.f57300h = false;
        } else {
            this.f57299g = 3;
        }
        this.f57302j = 0;
    }

    @Override // x3.InterfaceC18011p
    public int b(InterfaceC18012q interfaceC18012q, I i10) throws IOException {
        C13466a.i(this.f57298f);
        while (true) {
            int i11 = this.f57299g;
            if (i11 != 1) {
                if (i11 == 2) {
                    n(interfaceC18012q);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(interfaceC18012q)) {
                        return 0;
                    }
                } else if (!m(interfaceC18012q)) {
                    return -1;
                }
            } else if (!k(interfaceC18012q)) {
                return -1;
            }
        }
    }

    @Override // x3.InterfaceC18011p
    public void c(r rVar) {
        this.f57298f = rVar;
    }

    @Override // x3.InterfaceC18011p
    public boolean j(InterfaceC18012q interfaceC18012q) throws IOException {
        interfaceC18012q.m(this.f57293a.e(), 0, 3);
        this.f57293a.W(0);
        if (this.f57293a.K() != 4607062) {
            return false;
        }
        interfaceC18012q.m(this.f57293a.e(), 0, 2);
        this.f57293a.W(0);
        if ((this.f57293a.P() & 250) != 0) {
            return false;
        }
        interfaceC18012q.m(this.f57293a.e(), 0, 4);
        this.f57293a.W(0);
        int iQ = this.f57293a.q();
        interfaceC18012q.d();
        interfaceC18012q.i(iQ);
        interfaceC18012q.m(this.f57293a.e(), 0, 4);
        this.f57293a.W(0);
        return this.f57293a.q() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean l(x3.InterfaceC18012q r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.g()
            int r2 = r9.f57303k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            androidx.media3.extractor.flv.a r3 = r9.f57307o
            if (r3 == 0) goto L23
            r9.f()
            androidx.media3.extractor.flv.a r2 = r9.f57307o
            d3.D r10 = r9.h(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            androidx.media3.extractor.flv.d r3 = r9.f57308p
            if (r3 == 0) goto L39
            r9.f()
            androidx.media3.extractor.flv.d r2 = r9.f57308p
            d3.D r10 = r9.h(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f57306n
            if (r2 != 0) goto L6e
            androidx.media3.extractor.flv.c r2 = r9.f57297e
            d3.D r10 = r9.h(r10)
            boolean r10 = r2.a(r10, r0)
            androidx.media3.extractor.flv.c r0 = r9.f57297e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            x3.r r2 = r9.f57298f
            x3.E r3 = new x3.E
            androidx.media3.extractor.flv.c r7 = r9.f57297e
            long[] r7 = r7.e()
            androidx.media3.extractor.flv.c r8 = r9.f57297e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.g(r3)
            r9.f57306n = r6
            goto L21
        L6e:
            int r0 = r9.f57304l
            r10.k(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f57300h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f57300h = r6
            androidx.media3.extractor.flv.c r10 = r9.f57297e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f57305m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f57301i = r1
        L8f:
            r10 = 4
            r9.f57302j = r10
            r10 = 2
            r9.f57299g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.flv.b.l(x3.q):boolean");
    }
}
