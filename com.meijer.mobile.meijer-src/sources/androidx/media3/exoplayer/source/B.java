package androidx.media3.exoplayer.source;

import a3.InterfaceC5654k;
import a3.t;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6203l0;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.F;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import d3.C13599a;
import d3.C13609k;
import d3.P;
import f3.C13951f;
import f3.InterfaceC13949d;
import f3.g;
import h3.M;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u3.InterfaceExecutorC17347a;
import x3.C18061A;
import x3.C18074m;
import x3.J;
import x3.O;

/* loaded from: classes.dex */
final class B implements q, x3.r, Loader.b<b>, Loader.f, F.d {

    /* renamed from: R, reason: collision with root package name */
    private static final Map<String, String> f56783R = N();

    /* renamed from: S, reason: collision with root package name */
    private static final a3.t f56784S = new t.b().f0("icy").u0("application/x-icy").N();

    /* renamed from: A, reason: collision with root package name */
    private boolean f56785A;

    /* renamed from: B, reason: collision with root package name */
    private f f56786B;

    /* renamed from: C, reason: collision with root package name */
    private x3.J f56787C;

    /* renamed from: D, reason: collision with root package name */
    private long f56788D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f56789E;

    /* renamed from: F, reason: collision with root package name */
    private int f56790F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f56791G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f56792H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f56793I;

    /* renamed from: J, reason: collision with root package name */
    private int f56794J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f56795K;

    /* renamed from: L, reason: collision with root package name */
    private long f56796L;

    /* renamed from: M, reason: collision with root package name */
    private long f56797M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f56798N;

    /* renamed from: O, reason: collision with root package name */
    private int f56799O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f56800P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f56801Q;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f56802a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13949d f56803b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f56804c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56805d;

    /* renamed from: e, reason: collision with root package name */
    private final s.a f56806e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a f56807f;

    /* renamed from: g, reason: collision with root package name */
    private final c f56808g;

    /* renamed from: h, reason: collision with root package name */
    private final t3.b f56809h;

    /* renamed from: i, reason: collision with root package name */
    private final String f56810i;

    /* renamed from: j, reason: collision with root package name */
    private final long f56811j;

    /* renamed from: k, reason: collision with root package name */
    private final int f56812k;

    /* renamed from: l, reason: collision with root package name */
    private final a3.t f56813l;

    /* renamed from: m, reason: collision with root package name */
    private final long f56814m;

    /* renamed from: n, reason: collision with root package name */
    private final Loader f56815n;

    /* renamed from: o, reason: collision with root package name */
    private final w f56816o;

    /* renamed from: p, reason: collision with root package name */
    private final C13609k f56817p;

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f56818q;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f56819r;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f56820s;

    /* renamed from: t, reason: collision with root package name */
    private q.a f56821t;

    /* renamed from: u, reason: collision with root package name */
    private K3.b f56822u;

    /* renamed from: v, reason: collision with root package name */
    private F[] f56823v;

    /* renamed from: w, reason: collision with root package name */
    private e[] f56824w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f56825x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f56826y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f56827z;

    class a extends C18061A {
        a(x3.J j10) {
            super(j10);
        }

        @Override // x3.C18061A, x3.J
        public long l() {
            return B.this.f56788D;
        }
    }

    final class b implements Loader.e, n.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f56830b;

        /* renamed from: c, reason: collision with root package name */
        private final f3.n f56831c;

        /* renamed from: d, reason: collision with root package name */
        private final w f56832d;

        /* renamed from: e, reason: collision with root package name */
        private final x3.r f56833e;

        /* renamed from: f, reason: collision with root package name */
        private final C13609k f56834f;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f56836h;

        /* renamed from: j, reason: collision with root package name */
        private long f56838j;

        /* renamed from: l, reason: collision with root package name */
        private O f56840l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f56841m;

        /* renamed from: g, reason: collision with root package name */
        private final x3.I f56835g = new x3.I();

        /* renamed from: i, reason: collision with root package name */
        private boolean f56837i = true;

        /* renamed from: a, reason: collision with root package name */
        private final long f56829a = p3.i.a();

        /* renamed from: k, reason: collision with root package name */
        private f3.g f56839k = i(0);

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() throws IOException {
            int iD = 0;
            while (iD == 0 && !this.f56836h) {
                try {
                    long j10 = this.f56835g.f170165a;
                    f3.g gVarI = i(j10);
                    this.f56839k = gVarI;
                    long jH = this.f56831c.h(gVarI);
                    if (this.f56836h) {
                        if (iD != 1 && this.f56832d.e() != -1) {
                            this.f56835g.f170165a = this.f56832d.e();
                        }
                        C13951f.a(this.f56831c);
                        return;
                    }
                    if (jH != -1) {
                        jH += j10;
                        B.this.Y();
                    }
                    long j11 = jH;
                    B.this.f56822u = K3.b.d(this.f56831c.c());
                    InterfaceC5654k nVar = this.f56831c;
                    if (B.this.f56822u != null && B.this.f56822u.f16276f != -1) {
                        nVar = new n(this.f56831c, B.this.f56822u.f16276f, this);
                        O oQ = B.this.Q();
                        this.f56840l = oQ;
                        oQ.b(B.f56784S);
                    }
                    this.f56832d.c(nVar, this.f56830b, this.f56831c.c(), j10, j11, this.f56833e);
                    if (B.this.f56822u != null) {
                        this.f56832d.b();
                    }
                    if (this.f56837i) {
                        this.f56832d.a(j10, this.f56838j);
                        this.f56837i = false;
                    }
                    while (iD == 0 && !this.f56836h) {
                        try {
                            this.f56834f.a();
                            iD = this.f56832d.d(this.f56835g);
                            long jE = this.f56832d.e();
                            if (jE > B.this.f56811j + j10) {
                                this.f56834f.c();
                                B.this.f56820s.post(B.this.f56819r);
                                j10 = jE;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iD == 1) {
                        iD = 0;
                    } else if (this.f56832d.e() != -1) {
                        this.f56835g.f170165a = this.f56832d.e();
                    }
                    C13951f.a(this.f56831c);
                } catch (Throwable th2) {
                    if (iD != 1 && this.f56832d.e() != -1) {
                        this.f56835g.f170165a = this.f56832d.e();
                    }
                    C13951f.a(this.f56831c);
                    throw th2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void c() {
            this.f56836h = true;
        }

        public b(Uri uri, InterfaceC13949d interfaceC13949d, w wVar, x3.r rVar, C13609k c13609k) {
            this.f56830b = uri;
            this.f56831c = new f3.n(interfaceC13949d);
            this.f56832d = wVar;
            this.f56833e = rVar;
            this.f56834f = c13609k;
        }

        private f3.g i(long j10) {
            return new g.b().h(this.f56830b).g(j10).f(B.this.f56810i).b(6).e(B.f56783R).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f56835g.f170165a = j10;
            this.f56838j = j11;
            this.f56837i = true;
            this.f56841m = false;
        }

        @Override // androidx.media3.exoplayer.source.n.a
        public void a(d3.D d10) {
            long jMax = !this.f56841m ? this.f56838j : Math.max(B.this.P(true), this.f56838j);
            int iA = d10.a();
            O o10 = (O) C13599a.e(this.f56840l);
            o10.d(d10, iA);
            o10.c(jMax, 1, iA, 0, null);
            this.f56841m = true;
        }
    }

    interface c {
        void p(long j10, x3.J j11, boolean z10);
    }

    private final class d implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        private final int f56843a;

        public d(int i10) {
            this.f56843a = i10;
        }

        @Override // p3.r
        public void a() throws IOException {
            B.this.X(this.f56843a);
        }

        @Override // p3.r
        public boolean b() {
            return B.this.S(this.f56843a);
        }

        @Override // p3.r
        public int c(long j10) {
            return B.this.i0(this.f56843a, j10);
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            return B.this.e0(this.f56843a, g10, decoderInputBuffer, i10);
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f56845a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56846b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f56845a == eVar.f56845a && this.f56846b == eVar.f56846b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f56845a * 31) + (this.f56846b ? 1 : 0);
        }

        public e(int i10, boolean z10) {
            this.f56845a = i10;
            this.f56846b = z10;
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
    }

    @Override // x3.r
    public void p() {
        this.f56825x = true;
        this.f56820s.post(this.f56818q);
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final p3.w f56847a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f56848b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f56849c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f56850d;

        public f(p3.w wVar, boolean[] zArr) {
            this.f56847a = wVar;
            this.f56848b = zArr;
            int i10 = wVar.f156149a;
            this.f56849c = new boolean[i10];
            this.f56850d = new boolean[i10];
        }
    }

    public B(Uri uri, InterfaceC13949d interfaceC13949d, w wVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar, androidx.media3.exoplayer.upstream.b bVar, s.a aVar2, c cVar, t3.b bVar2, String str, int i10, int i11, a3.t tVar, long j10, InterfaceExecutorC17347a interfaceExecutorC17347a) {
        this.f56802a = uri;
        this.f56803b = interfaceC13949d;
        this.f56804c = iVar;
        this.f56807f = aVar;
        this.f56805d = bVar;
        this.f56806e = aVar2;
        this.f56808g = cVar;
        this.f56809h = bVar2;
        this.f56810i = str;
        this.f56811j = i10;
        this.f56812k = i11;
        this.f56813l = tVar;
        this.f56815n = interfaceExecutorC17347a != null ? new Loader(interfaceExecutorC17347a) : new Loader("ProgressiveMediaPeriod");
        this.f56816o = wVar;
        this.f56814m = j10;
        this.f56817p = new C13609k();
        this.f56818q = new Runnable() { // from class: androidx.media3.exoplayer.source.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f57180a.T();
            }
        };
        this.f56819r = new Runnable() { // from class: androidx.media3.exoplayer.source.z
            @Override // java.lang.Runnable
            public final void run() {
                B.y(this.f57181a);
            }
        };
        this.f56820s = P.z();
        this.f56824w = new e[0];
        this.f56823v = new F[0];
        this.f56797M = -9223372036854775807L;
        this.f56790F = 1;
    }

    private void L() {
        C13599a.g(this.f56826y);
        C13599a.e(this.f56786B);
        C13599a.e(this.f56787C);
    }

    private boolean M(b bVar, int i10) {
        x3.J j10;
        if (this.f56795K || !((j10 = this.f56787C) == null || j10.l() == -9223372036854775807L)) {
            this.f56799O = i10;
            return true;
        }
        if (this.f56826y && !k0()) {
            this.f56798N = true;
            return false;
        }
        this.f56792H = this.f56826y;
        this.f56796L = 0L;
        this.f56799O = 0;
        for (F f10 : this.f56823v) {
            f10.P();
        }
        bVar.j(0L, 0L);
        return true;
    }

    private static Map<String, String> N() {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        return Collections.unmodifiableMap(map);
    }

    private int O() {
        int iD = 0;
        for (F f10 : this.f56823v) {
            iD += f10.D();
        }
        return iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f56823v.length; i10++) {
            if (z10 || ((f) C13599a.e(this.f56786B)).f56849c[i10]) {
                jMax = Math.max(jMax, this.f56823v[i10].w());
            }
        }
        return jMax;
    }

    private boolean R() {
        return this.f56797M != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f56801Q || this.f56826y || !this.f56825x || this.f56787C == null) {
            return;
        }
        for (F f10 : this.f56823v) {
            if (f10.C() == null) {
                return;
            }
        }
        this.f56817p.c();
        int length = this.f56823v.length;
        a3.G[] gArr = new a3.G[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            a3.t tVarN = (a3.t) C13599a.e(this.f56823v[i10].C());
            String str = tVarN.f44767o;
            boolean zN = a3.z.n(str);
            boolean z10 = zN || a3.z.q(str);
            zArr[i10] = z10;
            this.f56827z = z10 | this.f56827z;
            this.f56785A = this.f56814m != -9223372036854775807L && length == 1 && a3.z.o(str);
            K3.b bVar = this.f56822u;
            if (bVar != null) {
                if (zN || this.f56824w[i10].f56846b) {
                    a3.y yVar = tVarN.f44764l;
                    tVarN = tVarN.b().n0(yVar == null ? new a3.y(bVar) : yVar.a(bVar)).N();
                }
                if (zN && tVarN.f44760h == -1 && tVarN.f44761i == -1 && bVar.f16271a != -1) {
                    tVarN = tVarN.b().Q(bVar.f16271a).N();
                }
            }
            a3.t tVarC = tVarN.c(this.f56804c.c(tVarN));
            gArr[i10] = new a3.G(Integer.toString(i10), tVarC);
            this.f56793I = tVarC.f44773u | this.f56793I;
        }
        this.f56786B = new f(new p3.w(gArr), zArr);
        if (this.f56785A && this.f56788D == -9223372036854775807L) {
            this.f56788D = this.f56814m;
            this.f56787C = new a(this.f56787C);
        }
        this.f56808g.p(this.f56788D, this.f56787C, this.f56789E);
        this.f56826y = true;
        ((q.a) C13599a.e(this.f56821t)).f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.f56820s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f57179a.f56795K = true;
            }
        });
    }

    private O d0(e eVar) {
        int length = this.f56823v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f56824w[i10])) {
                return this.f56823v[i10];
            }
        }
        if (this.f56825x) {
            d3.r.i("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f56845a + ") after finishing tracks.");
            return new C18074m();
        }
        F fL = F.l(this.f56809h, this.f56804c, this.f56807f);
        fL.W(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f56824w, i11);
        eVarArr[length] = eVar;
        this.f56824w = (e[]) P.i(eVarArr);
        F[] fArr = (F[]) Arrays.copyOf(this.f56823v, i11);
        fArr[length] = fL;
        this.f56823v = (F[]) P.i(fArr);
        return fL;
    }

    private boolean g0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f56823v.length;
        for (int i10 = 0; i10 < length; i10++) {
            F f10 = this.f56823v[i10];
            if (f10.z() != 0 || !z10) {
                if (!(this.f56785A ? f10.S(f10.v()) : f10.T(j10, false)) && (zArr[i10] || !this.f56827z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(x3.J j10) {
        this.f56787C = this.f56822u == null ? j10 : new J.b(-9223372036854775807L);
        this.f56788D = j10.l();
        boolean z10 = !this.f56795K && j10.l() == -9223372036854775807L;
        this.f56789E = z10;
        this.f56790F = z10 ? 7 : 1;
        if (this.f56826y) {
            this.f56808g.p(this.f56788D, j10, z10);
        } else {
            T();
        }
    }

    private void j0() {
        b bVar = new b(this.f56802a, this.f56803b, this.f56816o, this, this.f56817p);
        if (this.f56826y) {
            C13599a.g(R());
            long j10 = this.f56788D;
            if (j10 != -9223372036854775807L && this.f56797M > j10) {
                this.f56800P = true;
                this.f56797M = -9223372036854775807L;
                return;
            }
            bVar.j(((x3.J) C13599a.e(this.f56787C)).d(this.f56797M).f170166a.f170172b, this.f56797M);
            for (F f10 : this.f56823v) {
                f10.U(this.f56797M);
            }
            this.f56797M = -9223372036854775807L;
        }
        this.f56799O = O();
        this.f56815n.n(bVar, this, this.f56805d.b(this.f56790F));
    }

    private boolean k0() {
        return this.f56792H || R();
    }

    public static /* synthetic */ void y(B b10) {
        if (b10.f56801Q) {
            return;
        }
        ((q.a) C13599a.e(b10.f56821t)).g(b10);
    }

    O Q() {
        return d0(new e(0, true));
    }

    void W() throws IOException {
        this.f56815n.k(this.f56805d.b(this.f56790F));
    }

    void X(int i10) throws IOException {
        this.f56823v[i10].I();
        W();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return this.f56815n.i() && this.f56817p.d();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, long j10, long j11) {
        if (this.f56788D == -9223372036854775807L && this.f56787C != null) {
            long jP = P(true);
            long j12 = jP == Long.MIN_VALUE ? 0L : jP + 10000;
            this.f56788D = j12;
            this.f56808g.p(j12, this.f56787C, this.f56789E);
        }
        f3.n nVar = bVar.f56831c;
        p3.i iVar = new p3.i(bVar.f56829a, bVar.f56839k, nVar.o(), nVar.p(), j10, j11, nVar.n());
        this.f56805d.c(bVar.f56829a);
        this.f56806e.m(iVar, 1, -1, null, 0, null, bVar.f56838j, this.f56788D);
        this.f56800P = true;
        ((q.a) C13599a.e(this.f56821t)).g(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6203l0 c6203l0) {
        if (this.f56800P || this.f56815n.h() || this.f56798N) {
            return false;
        }
        if ((this.f56826y || this.f56813l != null) && this.f56794J == 0) {
            return false;
        }
        boolean zE = this.f56817p.e();
        if (this.f56815n.i()) {
            return zE;
        }
        j0();
        return true;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: b0, reason: merged with bridge method [inline-methods] */
    public Loader.c f(b bVar, long j10, long j11, IOException iOException, int i10) {
        b bVar2;
        Loader.c cVarG;
        f3.n nVar = bVar.f56831c;
        p3.i iVar = new p3.i(bVar.f56829a, bVar.f56839k, nVar.o(), nVar.p(), j10, j11, nVar.n());
        long jA = this.f56805d.a(new b.a(iVar, new p3.j(1, -1, null, 0, null, P.j1(bVar.f56838j), P.j1(this.f56788D)), iOException, i10));
        if (jA == -9223372036854775807L) {
            cVarG = Loader.f57192g;
            bVar2 = bVar;
        } else {
            int iO = O();
            bVar2 = bVar;
            cVarG = M(bVar2, iO) ? Loader.g(iO > this.f56799O, jA) : Loader.f57191f;
        }
        boolean zC = cVarG.c();
        this.f56806e.o(iVar, 1, -1, null, 0, null, bVar2.f56838j, this.f56788D, iOException, !zC);
        if (!zC) {
            this.f56805d.c(bVar2.f56829a);
        }
        return cVarG;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void o(b bVar, long j10, long j11, int i10) {
        f3.n nVar = bVar.f56831c;
        this.f56806e.r(i10 == 0 ? new p3.i(bVar.f56829a, bVar.f56839k, j10) : new p3.i(bVar.f56829a, bVar.f56839k, nVar.o(), nVar.p(), j10, j11, nVar.n()), 1, -1, null, 0, null, bVar.f56838j, this.f56788D, i10);
    }

    public void f0() {
        if (this.f56826y) {
            for (F f10 : this.f56823v) {
                f10.L();
            }
        }
        this.f56815n.m(this);
        this.f56820s.removeCallbacksAndMessages(null);
        this.f56821t = null;
        this.f56801Q = true;
    }

    @Override // x3.r
    public void g(final x3.J j10) {
        this.f56820s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f56781a.h0(j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        if (this.f56793I) {
            this.f56793I = false;
            return this.f56796L;
        }
        if (!this.f56792H) {
            return -9223372036854775807L;
        }
        if (!this.f56800P && O() <= this.f56799O) {
            return -9223372036854775807L;
        }
        this.f56792H = false;
        return this.f56796L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void l() {
        for (F f10 : this.f56823v) {
            f10.N();
        }
        this.f56816o.release();
    }

    @Override // androidx.media3.exoplayer.source.F.d
    public void m(a3.t tVar) {
        this.f56820s.post(this.f56818q);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f56821t = aVar;
        if (this.f56813l == null) {
            this.f56817p.e();
            j0();
        } else {
            t(this.f56812k, 3).b(this.f56813l);
            h0(new x3.E(new long[]{0}, new long[]{0}, -9223372036854775807L));
            p();
            this.f56797M = j10;
        }
    }

    @Override // x3.r
    public O t(int i10, int i11) {
        return d0(new e(i10, false));
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        if (this.f56785A) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.f56786B.f56849c;
        int length = this.f56823v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f56823v[i10].p(j10, z10, zArr[i10]);
        }
    }

    private void U(int i10) {
        L();
        f fVar = this.f56786B;
        boolean[] zArr = fVar.f56850d;
        if (!zArr[i10]) {
            a3.t tVarA = fVar.f56847a.b(i10).a(0);
            this.f56806e.i(a3.z.k(tVarA.f44767o), tVarA, 0, null, this.f56796L);
            zArr[i10] = true;
        }
    }

    private void V(int i10) {
        L();
        if (this.f56798N) {
            if (!this.f56827z || this.f56786B.f56848b[i10]) {
                if (!this.f56823v[i10].G(false)) {
                    this.f56797M = 0L;
                    this.f56798N = false;
                    this.f56792H = true;
                    this.f56796L = 0L;
                    this.f56799O = 0;
                    for (F f10 : this.f56823v) {
                        f10.P();
                    }
                    ((q.a) C13599a.e(this.f56821t)).g(this);
                }
            }
        }
    }

    boolean S(int i10) {
        if (!k0() && this.f56823v[i10].G(this.f56800P)) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void v(b bVar, long j10, long j11, boolean z10) {
        f3.n nVar = bVar.f56831c;
        p3.i iVar = new p3.i(bVar.f56829a, bVar.f56839k, nVar.o(), nVar.p(), j10, j11, nVar.n());
        this.f56805d.c(bVar.f56829a);
        this.f56806e.k(iVar, 1, -1, null, 0, null, bVar.f56838j, this.f56788D);
        if (!z10) {
            for (F f10 : this.f56823v) {
                f10.P();
            }
            if (this.f56794J > 0) {
                ((q.a) C13599a.e(this.f56821t)).g(this);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        long jP;
        L();
        if (this.f56800P || this.f56794J == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f56797M;
        }
        if (this.f56827z) {
            int length = this.f56823v.length;
            jP = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f56786B;
                if (fVar.f56848b[i10] && fVar.f56849c[i10] && !this.f56823v[i10].F()) {
                    jP = Math.min(jP, this.f56823v[i10].w());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = P(false);
        }
        if (jP == Long.MIN_VALUE) {
            return this.f56796L;
        }
        return jP;
    }

    int e0(int i10, h3.G g10, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (k0()) {
            return -3;
        }
        U(i10);
        int iM = this.f56823v[i10].M(g10, decoderInputBuffer, i11, this.f56800P);
        if (iM == -3) {
            V(i10);
        }
        return iM;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        boolean z10;
        L();
        boolean[] zArr = this.f56786B.f56848b;
        if (!this.f56787C.g()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f56792H = false;
        if (this.f56796L == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f56796L = j10;
        if (R()) {
            this.f56797M = j10;
            return j10;
        }
        if (this.f56790F == 7 || ((!this.f56800P && !this.f56815n.i()) || !g0(zArr, j10, z10))) {
            this.f56798N = false;
            this.f56797M = j10;
            this.f56800P = false;
            this.f56793I = false;
            if (this.f56815n.i()) {
                F[] fArr = this.f56823v;
                int length = fArr.length;
                while (i10 < length) {
                    fArr[i10].q();
                    i10++;
                }
                this.f56815n.e();
                return j10;
            }
            this.f56815n.f();
            F[] fArr2 = this.f56823v;
            int length2 = fArr2.length;
            while (i10 < length2) {
                fArr2[i10].P();
                i10++;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        boolean z10;
        s3.y yVar;
        boolean z11;
        boolean z12;
        L();
        f fVar = this.f56786B;
        p3.w wVar = fVar.f56847a;
        boolean[] zArr3 = fVar.f56849c;
        int i10 = this.f56794J;
        int i11 = 0;
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            p3.r rVar = rVarArr[i12];
            if (rVar != null && (yVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) rVar).f56843a;
                C13599a.g(zArr3[i13]);
                this.f56794J--;
                zArr3[i13] = false;
                rVarArr[i12] = null;
            }
        }
        if (!this.f56791G ? !(j10 == 0 || this.f56785A) : i10 == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        for (int i14 = 0; i14 < yVarArr.length; i14++) {
            if (rVarArr[i14] == null && (yVar = yVarArr[i14]) != null) {
                if (yVar.length() == 1) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                C13599a.g(z11);
                if (yVar.c(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C13599a.g(z12);
                int iD = wVar.d(yVar.g());
                C13599a.g(!zArr3[iD]);
                this.f56794J++;
                zArr3[iD] = true;
                this.f56793I = yVar.j().f44773u | this.f56793I;
                rVarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    F f10 = this.f56823v[iD];
                    if (f10.z() != 0 && !f10.T(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f56794J == 0) {
            this.f56798N = false;
            this.f56792H = false;
            this.f56793I = false;
            if (this.f56815n.i()) {
                F[] fArr = this.f56823v;
                int length = fArr.length;
                while (i11 < length) {
                    fArr[i11].q();
                    i11++;
                }
                this.f56815n.e();
            } else {
                this.f56800P = false;
                F[] fArr2 = this.f56823v;
                int length2 = fArr2.length;
                while (i11 < length2) {
                    fArr2[i11].P();
                    i11++;
                }
            }
        } else if (z10) {
            j10 = h(j10);
            while (i11 < rVarArr.length) {
                if (rVarArr[i11] != null) {
                    zArr2[i11] = true;
                }
                i11++;
            }
        }
        this.f56791G = true;
        return j10;
    }

    int i0(int i10, long j10) throws Throwable {
        if (k0()) {
            return 0;
        }
        U(i10);
        F f10 = this.f56823v[i10];
        int iB = f10.B(j10, this.f56800P);
        f10.X(iB);
        if (iB == 0) {
            V(i10);
        }
        return iB;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        L();
        if (!this.f56787C.g()) {
            return 0L;
        }
        J.a aVarD = this.f56787C.d(j10);
        return m10.a(j10, aVarD.f170166a.f170171a, aVarD.f170167b.f170171a);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        W();
        if (this.f56800P && !this.f56826y) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        L();
        return this.f56786B.f56847a;
    }
}
