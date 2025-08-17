package androidx.media3.exoplayer.source;

import a3.InterfaceC5571k;
import a3.t;
import android.net.Uri;
import android.os.Handler;
import androidx.media3.common.ParserException;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.source.F;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import d3.C13466a;
import d3.C13476k;
import d3.P;
import f3.C13841f;
import f3.InterfaceC13839d;
import f3.g;
import h3.M;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import u3.InterfaceExecutorC17220a;
import x3.C17995A;
import x3.C18008m;
import x3.J;
import x3.O;

/* loaded from: classes.dex */
final class B implements q, x3.r, Loader.b<b>, Loader.f, F.d {

    /* renamed from: R, reason: collision with root package name */
    private static final Map<String, String> f56559R = N();

    /* renamed from: S, reason: collision with root package name */
    private static final a3.t f56560S = new t.b().f0("icy").u0("application/x-icy").N();

    /* renamed from: A, reason: collision with root package name */
    private boolean f56561A;

    /* renamed from: B, reason: collision with root package name */
    private f f56562B;

    /* renamed from: C, reason: collision with root package name */
    private x3.J f56563C;

    /* renamed from: D, reason: collision with root package name */
    private long f56564D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f56565E;

    /* renamed from: F, reason: collision with root package name */
    private int f56566F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f56567G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f56568H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f56569I;

    /* renamed from: J, reason: collision with root package name */
    private int f56570J;

    /* renamed from: K, reason: collision with root package name */
    private boolean f56571K;

    /* renamed from: L, reason: collision with root package name */
    private long f56572L;

    /* renamed from: M, reason: collision with root package name */
    private long f56573M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f56574N;

    /* renamed from: O, reason: collision with root package name */
    private int f56575O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f56576P;

    /* renamed from: Q, reason: collision with root package name */
    private boolean f56577Q;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f56578a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13839d f56579b;

    /* renamed from: c, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f56580c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56581d;

    /* renamed from: e, reason: collision with root package name */
    private final s.a f56582e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a f56583f;

    /* renamed from: g, reason: collision with root package name */
    private final c f56584g;

    /* renamed from: h, reason: collision with root package name */
    private final t3.b f56585h;

    /* renamed from: i, reason: collision with root package name */
    private final String f56586i;

    /* renamed from: j, reason: collision with root package name */
    private final long f56587j;

    /* renamed from: k, reason: collision with root package name */
    private final int f56588k;

    /* renamed from: l, reason: collision with root package name */
    private final a3.t f56589l;

    /* renamed from: m, reason: collision with root package name */
    private final long f56590m;

    /* renamed from: n, reason: collision with root package name */
    private final Loader f56591n;

    /* renamed from: o, reason: collision with root package name */
    private final w f56592o;

    /* renamed from: p, reason: collision with root package name */
    private final C13476k f56593p;

    /* renamed from: q, reason: collision with root package name */
    private final Runnable f56594q;

    /* renamed from: r, reason: collision with root package name */
    private final Runnable f56595r;

    /* renamed from: s, reason: collision with root package name */
    private final Handler f56596s;

    /* renamed from: t, reason: collision with root package name */
    private q.a f56597t;

    /* renamed from: u, reason: collision with root package name */
    private K3.b f56598u;

    /* renamed from: v, reason: collision with root package name */
    private F[] f56599v;

    /* renamed from: w, reason: collision with root package name */
    private e[] f56600w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f56601x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f56602y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f56603z;

    class a extends C17995A {
        a(x3.J j10) {
            super(j10);
        }

        @Override // x3.C17995A, x3.J
        public long l() {
            return B.this.f56564D;
        }
    }

    final class b implements Loader.e, n.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f56606b;

        /* renamed from: c, reason: collision with root package name */
        private final f3.n f56607c;

        /* renamed from: d, reason: collision with root package name */
        private final w f56608d;

        /* renamed from: e, reason: collision with root package name */
        private final x3.r f56609e;

        /* renamed from: f, reason: collision with root package name */
        private final C13476k f56610f;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f56612h;

        /* renamed from: j, reason: collision with root package name */
        private long f56614j;

        /* renamed from: l, reason: collision with root package name */
        private O f56616l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f56617m;

        /* renamed from: g, reason: collision with root package name */
        private final x3.I f56611g = new x3.I();

        /* renamed from: i, reason: collision with root package name */
        private boolean f56613i = true;

        /* renamed from: a, reason: collision with root package name */
        private final long f56605a = p3.i.a();

        /* renamed from: k, reason: collision with root package name */
        private f3.g f56615k = i(0);

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() throws IOException {
            int iD = 0;
            while (iD == 0 && !this.f56612h) {
                try {
                    long j10 = this.f56611g.f169077a;
                    f3.g gVarI = i(j10);
                    this.f56615k = gVarI;
                    long jH = this.f56607c.h(gVarI);
                    if (this.f56612h) {
                        if (iD != 1 && this.f56608d.e() != -1) {
                            this.f56611g.f169077a = this.f56608d.e();
                        }
                        C13841f.a(this.f56607c);
                        return;
                    }
                    if (jH != -1) {
                        jH += j10;
                        B.this.Y();
                    }
                    long j11 = jH;
                    B.this.f56598u = K3.b.d(this.f56607c.c());
                    InterfaceC5571k nVar = this.f56607c;
                    if (B.this.f56598u != null && B.this.f56598u.f16293f != -1) {
                        nVar = new n(this.f56607c, B.this.f56598u.f16293f, this);
                        O oQ = B.this.Q();
                        this.f56616l = oQ;
                        oQ.b(B.f56560S);
                    }
                    this.f56608d.c(nVar, this.f56606b, this.f56607c.c(), j10, j11, this.f56609e);
                    if (B.this.f56598u != null) {
                        this.f56608d.b();
                    }
                    if (this.f56613i) {
                        this.f56608d.a(j10, this.f56614j);
                        this.f56613i = false;
                    }
                    while (iD == 0 && !this.f56612h) {
                        try {
                            this.f56610f.a();
                            iD = this.f56608d.d(this.f56611g);
                            long jE = this.f56608d.e();
                            if (jE > B.this.f56587j + j10) {
                                this.f56610f.c();
                                B.this.f56596s.post(B.this.f56595r);
                                j10 = jE;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (iD == 1) {
                        iD = 0;
                    } else if (this.f56608d.e() != -1) {
                        this.f56611g.f169077a = this.f56608d.e();
                    }
                    C13841f.a(this.f56607c);
                } catch (Throwable th2) {
                    if (iD != 1 && this.f56608d.e() != -1) {
                        this.f56611g.f169077a = this.f56608d.e();
                    }
                    C13841f.a(this.f56607c);
                    throw th2;
                }
            }
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void c() {
            this.f56612h = true;
        }

        public b(Uri uri, InterfaceC13839d interfaceC13839d, w wVar, x3.r rVar, C13476k c13476k) {
            this.f56606b = uri;
            this.f56607c = new f3.n(interfaceC13839d);
            this.f56608d = wVar;
            this.f56609e = rVar;
            this.f56610f = c13476k;
        }

        private f3.g i(long j10) {
            return new g.b().h(this.f56606b).g(j10).f(B.this.f56586i).b(6).e(B.f56559R).a();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void j(long j10, long j11) {
            this.f56611g.f169077a = j10;
            this.f56614j = j11;
            this.f56613i = true;
            this.f56617m = false;
        }

        @Override // androidx.media3.exoplayer.source.n.a
        public void a(d3.D d10) {
            long jMax = !this.f56617m ? this.f56614j : Math.max(B.this.P(true), this.f56614j);
            int iA = d10.a();
            O o10 = (O) C13466a.e(this.f56616l);
            o10.d(d10, iA);
            o10.c(jMax, 1, iA, 0, null);
            this.f56617m = true;
        }
    }

    interface c {
        void p(long j10, x3.J j11, boolean z10);
    }

    private final class d implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        private final int f56619a;

        public d(int i10) {
            this.f56619a = i10;
        }

        @Override // p3.r
        public void a() throws IOException {
            B.this.X(this.f56619a);
        }

        @Override // p3.r
        public boolean b() {
            return B.this.S(this.f56619a);
        }

        @Override // p3.r
        public int c(long j10) {
            return B.this.i0(this.f56619a, j10);
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            return B.this.e0(this.f56619a, g10, decoderInputBuffer, i10);
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final int f56621a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f56622b;

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && e.class == obj.getClass()) {
                e eVar = (e) obj;
                if (this.f56621a == eVar.f56621a && this.f56622b == eVar.f56622b) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f56621a * 31) + (this.f56622b ? 1 : 0);
        }

        public e(int i10, boolean z10) {
            this.f56621a = i10;
            this.f56622b = z10;
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
    }

    @Override // x3.r
    public void p() {
        this.f56601x = true;
        this.f56596s.post(this.f56594q);
    }

    private static final class f {

        /* renamed from: a, reason: collision with root package name */
        public final p3.w f56623a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f56624b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f56625c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f56626d;

        public f(p3.w wVar, boolean[] zArr) {
            this.f56623a = wVar;
            this.f56624b = zArr;
            int i10 = wVar.f155475a;
            this.f56625c = new boolean[i10];
            this.f56626d = new boolean[i10];
        }
    }

    public B(Uri uri, InterfaceC13839d interfaceC13839d, w wVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar, androidx.media3.exoplayer.upstream.b bVar, s.a aVar2, c cVar, t3.b bVar2, String str, int i10, int i11, a3.t tVar, long j10, InterfaceExecutorC17220a interfaceExecutorC17220a) {
        this.f56578a = uri;
        this.f56579b = interfaceC13839d;
        this.f56580c = iVar;
        this.f56583f = aVar;
        this.f56581d = bVar;
        this.f56582e = aVar2;
        this.f56584g = cVar;
        this.f56585h = bVar2;
        this.f56586i = str;
        this.f56587j = i10;
        this.f56588k = i11;
        this.f56589l = tVar;
        this.f56591n = interfaceExecutorC17220a != null ? new Loader(interfaceExecutorC17220a) : new Loader("ProgressiveMediaPeriod");
        this.f56592o = wVar;
        this.f56590m = j10;
        this.f56593p = new C13476k();
        this.f56594q = new Runnable() { // from class: androidx.media3.exoplayer.source.y
            @Override // java.lang.Runnable
            public final void run() {
                this.f56956a.T();
            }
        };
        this.f56595r = new Runnable() { // from class: androidx.media3.exoplayer.source.z
            @Override // java.lang.Runnable
            public final void run() {
                B.y(this.f56957a);
            }
        };
        this.f56596s = P.z();
        this.f56600w = new e[0];
        this.f56599v = new F[0];
        this.f56573M = -9223372036854775807L;
        this.f56566F = 1;
    }

    private void L() {
        C13466a.g(this.f56602y);
        C13466a.e(this.f56562B);
        C13466a.e(this.f56563C);
    }

    private boolean M(b bVar, int i10) {
        x3.J j10;
        if (this.f56571K || !((j10 = this.f56563C) == null || j10.l() == -9223372036854775807L)) {
            this.f56575O = i10;
            return true;
        }
        if (this.f56602y && !k0()) {
            this.f56574N = true;
            return false;
        }
        this.f56568H = this.f56602y;
        this.f56572L = 0L;
        this.f56575O = 0;
        for (F f10 : this.f56599v) {
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
        for (F f10 : this.f56599v) {
            iD += f10.D();
        }
        return iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long P(boolean z10) {
        long jMax = Long.MIN_VALUE;
        for (int i10 = 0; i10 < this.f56599v.length; i10++) {
            if (z10 || ((f) C13466a.e(this.f56562B)).f56625c[i10]) {
                jMax = Math.max(jMax, this.f56599v[i10].w());
            }
        }
        return jMax;
    }

    private boolean R() {
        return this.f56573M != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void T() {
        if (this.f56577Q || this.f56602y || !this.f56601x || this.f56563C == null) {
            return;
        }
        for (F f10 : this.f56599v) {
            if (f10.C() == null) {
                return;
            }
        }
        this.f56593p.c();
        int length = this.f56599v.length;
        a3.G[] gArr = new a3.G[length];
        boolean[] zArr = new boolean[length];
        for (int i10 = 0; i10 < length; i10++) {
            a3.t tVarN = (a3.t) C13466a.e(this.f56599v[i10].C());
            String str = tVarN.f43949o;
            boolean zN = a3.z.n(str);
            boolean z10 = zN || a3.z.q(str);
            zArr[i10] = z10;
            this.f56603z = z10 | this.f56603z;
            this.f56561A = this.f56590m != -9223372036854775807L && length == 1 && a3.z.o(str);
            K3.b bVar = this.f56598u;
            if (bVar != null) {
                if (zN || this.f56600w[i10].f56622b) {
                    a3.y yVar = tVarN.f43946l;
                    tVarN = tVarN.b().n0(yVar == null ? new a3.y(bVar) : yVar.a(bVar)).N();
                }
                if (zN && tVarN.f43942h == -1 && tVarN.f43943i == -1 && bVar.f16288a != -1) {
                    tVarN = tVarN.b().Q(bVar.f16288a).N();
                }
            }
            a3.t tVarC = tVarN.c(this.f56580c.c(tVarN));
            gArr[i10] = new a3.G(Integer.toString(i10), tVarC);
            this.f56569I = tVarC.f43955u | this.f56569I;
        }
        this.f56562B = new f(new p3.w(gArr), zArr);
        if (this.f56561A && this.f56564D == -9223372036854775807L) {
            this.f56564D = this.f56590m;
            this.f56563C = new a(this.f56563C);
        }
        this.f56584g.p(this.f56564D, this.f56563C, this.f56565E);
        this.f56602y = true;
        ((q.a) C13466a.e(this.f56597t)).f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        this.f56596s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.x
            @Override // java.lang.Runnable
            public final void run() {
                this.f56955a.f56571K = true;
            }
        });
    }

    private O d0(e eVar) {
        int length = this.f56599v.length;
        for (int i10 = 0; i10 < length; i10++) {
            if (eVar.equals(this.f56600w[i10])) {
                return this.f56599v[i10];
            }
        }
        if (this.f56601x) {
            d3.r.i("ProgressiveMediaPeriod", "Extractor added new track (id=" + eVar.f56621a + ") after finishing tracks.");
            return new C18008m();
        }
        F fL = F.l(this.f56585h, this.f56580c, this.f56583f);
        fL.W(this);
        int i11 = length + 1;
        e[] eVarArr = (e[]) Arrays.copyOf(this.f56600w, i11);
        eVarArr[length] = eVar;
        this.f56600w = (e[]) P.i(eVarArr);
        F[] fArr = (F[]) Arrays.copyOf(this.f56599v, i11);
        fArr[length] = fL;
        this.f56599v = (F[]) P.i(fArr);
        return fL;
    }

    private boolean g0(boolean[] zArr, long j10, boolean z10) {
        int length = this.f56599v.length;
        for (int i10 = 0; i10 < length; i10++) {
            F f10 = this.f56599v[i10];
            if (f10.z() != 0 || !z10) {
                if (!(this.f56561A ? f10.S(f10.v()) : f10.T(j10, false)) && (zArr[i10] || !this.f56603z)) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(x3.J j10) {
        this.f56563C = this.f56598u == null ? j10 : new J.b(-9223372036854775807L);
        this.f56564D = j10.l();
        boolean z10 = !this.f56571K && j10.l() == -9223372036854775807L;
        this.f56565E = z10;
        this.f56566F = z10 ? 7 : 1;
        if (this.f56602y) {
            this.f56584g.p(this.f56564D, j10, z10);
        } else {
            T();
        }
    }

    private void j0() {
        b bVar = new b(this.f56578a, this.f56579b, this.f56592o, this, this.f56593p);
        if (this.f56602y) {
            C13466a.g(R());
            long j10 = this.f56564D;
            if (j10 != -9223372036854775807L && this.f56573M > j10) {
                this.f56576P = true;
                this.f56573M = -9223372036854775807L;
                return;
            }
            bVar.j(((x3.J) C13466a.e(this.f56563C)).d(this.f56573M).f169078a.f169084b, this.f56573M);
            for (F f10 : this.f56599v) {
                f10.U(this.f56573M);
            }
            this.f56573M = -9223372036854775807L;
        }
        this.f56575O = O();
        this.f56591n.n(bVar, this, this.f56581d.b(this.f56566F));
    }

    private boolean k0() {
        return this.f56568H || R();
    }

    public static /* synthetic */ void y(B b10) {
        if (b10.f56577Q) {
            return;
        }
        ((q.a) C13466a.e(b10.f56597t)).g(b10);
    }

    O Q() {
        return d0(new e(0, true));
    }

    void W() throws IOException {
        this.f56591n.k(this.f56581d.b(this.f56566F));
    }

    void X(int i10) throws IOException {
        this.f56599v[i10].I();
        W();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return this.f56591n.i() && this.f56593p.d();
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: a0, reason: merged with bridge method [inline-methods] */
    public void s(b bVar, long j10, long j11) {
        if (this.f56564D == -9223372036854775807L && this.f56563C != null) {
            long jP = P(true);
            long j12 = jP == Long.MIN_VALUE ? 0L : jP + 10000;
            this.f56564D = j12;
            this.f56584g.p(j12, this.f56563C, this.f56565E);
        }
        f3.n nVar = bVar.f56607c;
        p3.i iVar = new p3.i(bVar.f56605a, bVar.f56615k, nVar.o(), nVar.p(), j10, j11, nVar.n());
        this.f56581d.c(bVar.f56605a);
        this.f56582e.m(iVar, 1, -1, null, 0, null, bVar.f56614j, this.f56564D);
        this.f56576P = true;
        ((q.a) C13466a.e(this.f56597t)).g(this);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6061l0 c6061l0) {
        if (this.f56576P || this.f56591n.h() || this.f56574N) {
            return false;
        }
        if ((this.f56602y || this.f56589l != null) && this.f56570J == 0) {
            return false;
        }
        boolean zE = this.f56593p.e();
        if (this.f56591n.i()) {
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
        f3.n nVar = bVar.f56607c;
        p3.i iVar = new p3.i(bVar.f56605a, bVar.f56615k, nVar.o(), nVar.p(), j10, j11, nVar.n());
        long jA = this.f56581d.a(new b.a(iVar, new p3.j(1, -1, null, 0, null, P.j1(bVar.f56614j), P.j1(this.f56564D)), iOException, i10));
        if (jA == -9223372036854775807L) {
            cVarG = Loader.f56968g;
            bVar2 = bVar;
        } else {
            int iO = O();
            bVar2 = bVar;
            cVarG = M(bVar2, iO) ? Loader.g(iO > this.f56575O, jA) : Loader.f56967f;
        }
        boolean zC = cVarG.c();
        this.f56582e.o(iVar, 1, -1, null, 0, null, bVar2.f56614j, this.f56564D, iOException, !zC);
        if (!zC) {
            this.f56581d.c(bVar2.f56605a);
        }
        return cVarG;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: c0, reason: merged with bridge method [inline-methods] */
    public void o(b bVar, long j10, long j11, int i10) {
        f3.n nVar = bVar.f56607c;
        this.f56582e.r(i10 == 0 ? new p3.i(bVar.f56605a, bVar.f56615k, j10) : new p3.i(bVar.f56605a, bVar.f56615k, nVar.o(), nVar.p(), j10, j11, nVar.n()), 1, -1, null, 0, null, bVar.f56614j, this.f56564D, i10);
    }

    public void f0() {
        if (this.f56602y) {
            for (F f10 : this.f56599v) {
                f10.L();
            }
        }
        this.f56591n.m(this);
        this.f56596s.removeCallbacksAndMessages(null);
        this.f56597t = null;
        this.f56577Q = true;
    }

    @Override // x3.r
    public void g(final x3.J j10) {
        this.f56596s.post(new Runnable() { // from class: androidx.media3.exoplayer.source.A
            @Override // java.lang.Runnable
            public final void run() {
                this.f56557a.h0(j10);
            }
        });
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        if (this.f56569I) {
            this.f56569I = false;
            return this.f56572L;
        }
        if (!this.f56568H) {
            return -9223372036854775807L;
        }
        if (!this.f56576P && O() <= this.f56575O) {
            return -9223372036854775807L;
        }
        this.f56568H = false;
        return this.f56572L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.f
    public void l() {
        for (F f10 : this.f56599v) {
            f10.N();
        }
        this.f56592o.release();
    }

    @Override // androidx.media3.exoplayer.source.F.d
    public void m(a3.t tVar) {
        this.f56596s.post(this.f56594q);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f56597t = aVar;
        if (this.f56589l == null) {
            this.f56593p.e();
            j0();
        } else {
            t(this.f56588k, 3).b(this.f56589l);
            h0(new x3.E(new long[]{0}, new long[]{0}, -9223372036854775807L));
            p();
            this.f56573M = j10;
        }
    }

    @Override // x3.r
    public O t(int i10, int i11) {
        return d0(new e(i10, false));
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        if (this.f56561A) {
            return;
        }
        L();
        if (R()) {
            return;
        }
        boolean[] zArr = this.f56562B.f56625c;
        int length = this.f56599v.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f56599v[i10].p(j10, z10, zArr[i10]);
        }
    }

    private void U(int i10) {
        L();
        f fVar = this.f56562B;
        boolean[] zArr = fVar.f56626d;
        if (!zArr[i10]) {
            a3.t tVarA = fVar.f56623a.b(i10).a(0);
            this.f56582e.i(a3.z.k(tVarA.f43949o), tVarA, 0, null, this.f56572L);
            zArr[i10] = true;
        }
    }

    private void V(int i10) {
        L();
        if (this.f56574N) {
            if (!this.f56603z || this.f56562B.f56624b[i10]) {
                if (!this.f56599v[i10].G(false)) {
                    this.f56573M = 0L;
                    this.f56574N = false;
                    this.f56568H = true;
                    this.f56572L = 0L;
                    this.f56575O = 0;
                    for (F f10 : this.f56599v) {
                        f10.P();
                    }
                    ((q.a) C13466a.e(this.f56597t)).g(this);
                }
            }
        }
    }

    boolean S(int i10) {
        if (!k0() && this.f56599v[i10].G(this.f56576P)) {
            return true;
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void v(b bVar, long j10, long j11, boolean z10) {
        f3.n nVar = bVar.f56607c;
        p3.i iVar = new p3.i(bVar.f56605a, bVar.f56615k, nVar.o(), nVar.p(), j10, j11, nVar.n());
        this.f56581d.c(bVar.f56605a);
        this.f56582e.k(iVar, 1, -1, null, 0, null, bVar.f56614j, this.f56564D);
        if (!z10) {
            for (F f10 : this.f56599v) {
                f10.P();
            }
            if (this.f56570J > 0) {
                ((q.a) C13466a.e(this.f56597t)).g(this);
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
        if (this.f56576P || this.f56570J == 0) {
            return Long.MIN_VALUE;
        }
        if (R()) {
            return this.f56573M;
        }
        if (this.f56603z) {
            int length = this.f56599v.length;
            jP = Long.MAX_VALUE;
            for (int i10 = 0; i10 < length; i10++) {
                f fVar = this.f56562B;
                if (fVar.f56624b[i10] && fVar.f56625c[i10] && !this.f56599v[i10].F()) {
                    jP = Math.min(jP, this.f56599v[i10].w());
                }
            }
        } else {
            jP = Long.MAX_VALUE;
        }
        if (jP == Long.MAX_VALUE) {
            jP = P(false);
        }
        if (jP == Long.MIN_VALUE) {
            return this.f56572L;
        }
        return jP;
    }

    int e0(int i10, h3.G g10, DecoderInputBuffer decoderInputBuffer, int i11) {
        if (k0()) {
            return -3;
        }
        U(i10);
        int iM = this.f56599v[i10].M(g10, decoderInputBuffer, i11, this.f56576P);
        if (iM == -3) {
            V(i10);
        }
        return iM;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        boolean z10;
        L();
        boolean[] zArr = this.f56562B.f56624b;
        if (!this.f56563C.g()) {
            j10 = 0;
        }
        int i10 = 0;
        this.f56568H = false;
        if (this.f56572L == j10) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.f56572L = j10;
        if (R()) {
            this.f56573M = j10;
            return j10;
        }
        if (this.f56566F == 7 || ((!this.f56576P && !this.f56591n.i()) || !g0(zArr, j10, z10))) {
            this.f56574N = false;
            this.f56573M = j10;
            this.f56576P = false;
            this.f56569I = false;
            if (this.f56591n.i()) {
                F[] fArr = this.f56599v;
                int length = fArr.length;
                while (i10 < length) {
                    fArr[i10].q();
                    i10++;
                }
                this.f56591n.e();
                return j10;
            }
            this.f56591n.f();
            F[] fArr2 = this.f56599v;
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
        f fVar = this.f56562B;
        p3.w wVar = fVar.f56623a;
        boolean[] zArr3 = fVar.f56625c;
        int i10 = this.f56570J;
        int i11 = 0;
        for (int i12 = 0; i12 < yVarArr.length; i12++) {
            p3.r rVar = rVarArr[i12];
            if (rVar != null && (yVarArr[i12] == null || !zArr[i12])) {
                int i13 = ((d) rVar).f56619a;
                C13466a.g(zArr3[i13]);
                this.f56570J--;
                zArr3[i13] = false;
                rVarArr[i12] = null;
            }
        }
        if (!this.f56567G ? !(j10 == 0 || this.f56561A) : i10 == 0) {
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
                C13466a.g(z11);
                if (yVar.c(0) == 0) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                C13466a.g(z12);
                int iD = wVar.d(yVar.g());
                C13466a.g(!zArr3[iD]);
                this.f56570J++;
                zArr3[iD] = true;
                this.f56569I = yVar.j().f43955u | this.f56569I;
                rVarArr[i14] = new d(iD);
                zArr2[i14] = true;
                if (!z10) {
                    F f10 = this.f56599v[iD];
                    if (f10.z() != 0 && !f10.T(j10, true)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                }
            }
        }
        if (this.f56570J == 0) {
            this.f56574N = false;
            this.f56568H = false;
            this.f56569I = false;
            if (this.f56591n.i()) {
                F[] fArr = this.f56599v;
                int length = fArr.length;
                while (i11 < length) {
                    fArr[i11].q();
                    i11++;
                }
                this.f56591n.e();
            } else {
                this.f56576P = false;
                F[] fArr2 = this.f56599v;
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
        this.f56567G = true;
        return j10;
    }

    int i0(int i10, long j10) throws Throwable {
        if (k0()) {
            return 0;
        }
        U(i10);
        F f10 = this.f56599v[i10];
        int iB = f10.B(j10, this.f56576P);
        f10.X(iB);
        if (iB == 0) {
            V(i10);
        }
        return iB;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        L();
        if (!this.f56563C.g()) {
            return 0L;
        }
        J.a aVarD = this.f56563C.d(j10);
        return m10.a(j10, aVarD.f169078a.f169083a, aVarD.f169079b.f169083a);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        W();
        if (this.f56576P && !this.f56602y) {
            throw ParserException.a("Loading finished before preparation is complete.", null);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        L();
        return this.f56562B.f56623a;
    }
}
