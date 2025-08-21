package androidx.media3.extractor.flv;

import androidx.media3.extractor.flv.b;
import d3.C13599a;
import d3.D;
import java.io.IOException;
import x3.I;
import x3.InterfaceC18077p;
import x3.InterfaceC18078q;
import x3.J;
import x3.r;
import x3.u;

/* loaded from: classes.dex */
public final class b implements InterfaceC18077p {

    /* renamed from: q, reason: collision with root package name */
    public static final u f57516q = new u() { // from class: D3.a
        @Override // x3.u
        public final InterfaceC18077p[] f() {
            return b.d();
        }
    };

    /* renamed from: f, reason: collision with root package name */
    private r f57522f;

    /* renamed from: h, reason: collision with root package name */
    private boolean f57524h;

    /* renamed from: i, reason: collision with root package name */
    private long f57525i;

    /* renamed from: j, reason: collision with root package name */
    private int f57526j;

    /* renamed from: k, reason: collision with root package name */
    private int f57527k;

    /* renamed from: l, reason: collision with root package name */
    private int f57528l;

    /* renamed from: m, reason: collision with root package name */
    private long f57529m;

    /* renamed from: n, reason: collision with root package name */
    private boolean f57530n;

    /* renamed from: o, reason: collision with root package name */
    private a f57531o;

    /* renamed from: p, reason: collision with root package name */
    private d f57532p;

    /* renamed from: a, reason: collision with root package name */
    private final D f57517a = new D(4);

    /* renamed from: b, reason: collision with root package name */
    private final D f57518b = new D(9);

    /* renamed from: c, reason: collision with root package name */
    private final D f57519c = new D(11);

    /* renamed from: d, reason: collision with root package name */
    private final D f57520d = new D();

    /* renamed from: e, reason: collision with root package name */
    private final c f57521e = new c();

    /* renamed from: g, reason: collision with root package name */
    private int f57523g = 1;

    @Override // x3.InterfaceC18077p
    public void release() {
    }

    public static /* synthetic */ InterfaceC18077p[] d() {
        return new InterfaceC18077p[]{new b()};
    }

    private void f() {
        if (this.f57530n) {
            return;
        }
        this.f57522f.g(new J.b(-9223372036854775807L));
        this.f57530n = true;
    }

    private long g() {
        if (this.f57524h) {
            return this.f57525i + this.f57529m;
        }
        if (this.f57521e.d() == -9223372036854775807L) {
            return 0L;
        }
        return this.f57529m;
    }

    private D h(InterfaceC18078q interfaceC18078q) throws IOException {
        if (this.f57528l > this.f57520d.b()) {
            D d10 = this.f57520d;
            d10.U(new byte[Math.max(d10.b() * 2, this.f57528l)], 0);
        } else {
            this.f57520d.W(0);
        }
        this.f57520d.V(this.f57528l);
        interfaceC18078q.readFully(this.f57520d.e(), 0, this.f57528l);
        return this.f57520d;
    }

    private boolean k(InterfaceC18078q interfaceC18078q) throws IOException {
        if (!interfaceC18078q.f(this.f57518b.e(), 0, 9, true)) {
            return false;
        }
        this.f57518b.W(0);
        this.f57518b.X(4);
        int iH = this.f57518b.H();
        boolean z10 = (iH & 4) != 0;
        boolean z11 = (iH & 1) != 0;
        if (z10 && this.f57531o == null) {
            this.f57531o = new a(this.f57522f.t(8, 1));
        }
        if (z11 && this.f57532p == null) {
            this.f57532p = new d(this.f57522f.t(9, 2));
        }
        this.f57522f.p();
        this.f57526j = this.f57518b.q() - 5;
        this.f57523g = 2;
        return true;
    }

    private boolean m(InterfaceC18078q interfaceC18078q) throws IOException {
        if (!interfaceC18078q.f(this.f57519c.e(), 0, 11, true)) {
            return false;
        }
        this.f57519c.W(0);
        this.f57527k = this.f57519c.H();
        this.f57528l = this.f57519c.K();
        this.f57529m = this.f57519c.K();
        this.f57529m = ((this.f57519c.H() << 24) | this.f57529m) * 1000;
        this.f57519c.X(3);
        this.f57523g = 4;
        return true;
    }

    private void n(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.k(this.f57526j);
        this.f57526j = 0;
        this.f57523g = 3;
    }

    @Override // x3.InterfaceC18077p
    public void a(long j10, long j11) {
        if (j10 == 0) {
            this.f57523g = 1;
            this.f57524h = false;
        } else {
            this.f57523g = 3;
        }
        this.f57526j = 0;
    }

    @Override // x3.InterfaceC18077p
    public int b(InterfaceC18078q interfaceC18078q, I i10) throws IOException {
        C13599a.i(this.f57522f);
        while (true) {
            int i11 = this.f57523g;
            if (i11 != 1) {
                if (i11 == 2) {
                    n(interfaceC18078q);
                } else if (i11 != 3) {
                    if (i11 != 4) {
                        throw new IllegalStateException();
                    }
                    if (l(interfaceC18078q)) {
                        return 0;
                    }
                } else if (!m(interfaceC18078q)) {
                    return -1;
                }
            } else if (!k(interfaceC18078q)) {
                return -1;
            }
        }
    }

    @Override // x3.InterfaceC18077p
    public void c(r rVar) {
        this.f57522f = rVar;
    }

    @Override // x3.InterfaceC18077p
    public boolean j(InterfaceC18078q interfaceC18078q) throws IOException {
        interfaceC18078q.m(this.f57517a.e(), 0, 3);
        this.f57517a.W(0);
        if (this.f57517a.K() != 4607062) {
            return false;
        }
        interfaceC18078q.m(this.f57517a.e(), 0, 2);
        this.f57517a.W(0);
        if ((this.f57517a.P() & 250) != 0) {
            return false;
        }
        interfaceC18078q.m(this.f57517a.e(), 0, 4);
        this.f57517a.W(0);
        int iQ = this.f57517a.q();
        interfaceC18078q.d();
        interfaceC18078q.i(iQ);
        interfaceC18078q.m(this.f57517a.e(), 0, 4);
        this.f57517a.W(0);
        return this.f57517a.q() == 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean l(x3.InterfaceC18078q r10) throws java.io.IOException {
        /*
            r9 = this;
            long r0 = r9.g()
            int r2 = r9.f57527k
            r3 = 8
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r6 = 1
            if (r2 != r3) goto L23
            androidx.media3.extractor.flv.a r3 = r9.f57531o
            if (r3 == 0) goto L23
            r9.f()
            androidx.media3.extractor.flv.a r2 = r9.f57531o
            d3.D r10 = r9.h(r10)
            boolean r10 = r2.a(r10, r0)
        L21:
            r0 = r6
            goto L75
        L23:
            r3 = 9
            if (r2 != r3) goto L39
            androidx.media3.extractor.flv.d r3 = r9.f57532p
            if (r3 == 0) goto L39
            r9.f()
            androidx.media3.extractor.flv.d r2 = r9.f57532p
            d3.D r10 = r9.h(r10)
            boolean r10 = r2.a(r10, r0)
            goto L21
        L39:
            r3 = 18
            if (r2 != r3) goto L6e
            boolean r2 = r9.f57530n
            if (r2 != 0) goto L6e
            androidx.media3.extractor.flv.c r2 = r9.f57521e
            d3.D r10 = r9.h(r10)
            boolean r10 = r2.a(r10, r0)
            androidx.media3.extractor.flv.c r0 = r9.f57521e
            long r0 = r0.d()
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto L21
            x3.r r2 = r9.f57522f
            x3.E r3 = new x3.E
            androidx.media3.extractor.flv.c r7 = r9.f57521e
            long[] r7 = r7.e()
            androidx.media3.extractor.flv.c r8 = r9.f57521e
            long[] r8 = r8.f()
            r3.<init>(r7, r8, r0)
            r2.g(r3)
            r9.f57530n = r6
            goto L21
        L6e:
            int r0 = r9.f57528l
            r10.k(r0)
            r10 = 0
            r0 = r10
        L75:
            boolean r1 = r9.f57524h
            if (r1 != 0) goto L8f
            if (r10 == 0) goto L8f
            r9.f57524h = r6
            androidx.media3.extractor.flv.c r10 = r9.f57521e
            long r1 = r10.d()
            int r10 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r10 != 0) goto L8b
            long r1 = r9.f57529m
            long r1 = -r1
            goto L8d
        L8b:
            r1 = 0
        L8d:
            r9.f57525i = r1
        L8f:
            r10 = 4
            r9.f57526j = r10
            r10 = 2
            r9.f57523g = r10
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.extractor.flv.b.l(x3.q):boolean");
    }
}
