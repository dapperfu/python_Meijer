package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import d3.C13466a;
import d3.P;
import f3.C13841f;
import f3.InterfaceC13839d;
import h3.M;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import u3.InterfaceExecutorC17220a;

/* loaded from: classes.dex */
final class H implements q, Loader.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private final f3.g f56724a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13839d.a f56725b;

    /* renamed from: c, reason: collision with root package name */
    private final f3.o f56726c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56727d;

    /* renamed from: e, reason: collision with root package name */
    private final s.a f56728e;

    /* renamed from: f, reason: collision with root package name */
    private final p3.w f56729f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f56730g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final long f56731h;

    /* renamed from: i, reason: collision with root package name */
    final Loader f56732i;

    /* renamed from: j, reason: collision with root package name */
    final a3.t f56733j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f56734k;

    /* renamed from: l, reason: collision with root package name */
    boolean f56735l;

    /* renamed from: m, reason: collision with root package name */
    byte[] f56736m;

    /* renamed from: n, reason: collision with root package name */
    int f56737n;

    private final class b implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        private int f56738a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f56739b;

        private b() {
        }

        private void e() {
            if (this.f56739b) {
                return;
            }
            H.this.f56728e.i(a3.z.k(H.this.f56733j.f43949o), H.this.f56733j, 0, null, 0L);
            this.f56739b = true;
        }

        @Override // p3.r
        public void a() throws IOException {
            H h10 = H.this;
            if (h10.f56734k) {
                return;
            }
            h10.f56732i.j();
        }

        @Override // p3.r
        public boolean b() {
            return H.this.f56735l;
        }

        public void f() {
            if (this.f56738a == 2) {
                this.f56738a = 1;
            }
        }

        @Override // p3.r
        public int c(long j10) {
            e();
            if (j10 > 0 && this.f56738a != 2) {
                this.f56738a = 2;
                return 1;
            }
            return 0;
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            e();
            H h10 = H.this;
            boolean z10 = h10.f56735l;
            if (z10 && h10.f56736m == null) {
                this.f56738a = 2;
            }
            int i11 = this.f56738a;
            if (i11 == 2) {
                decoderInputBuffer.m(4);
                return -4;
            }
            if ((i10 & 2) == 0 && i11 != 0) {
                if (!z10) {
                    return -3;
                }
                C13466a.e(h10.f56736m);
                decoderInputBuffer.m(1);
                decoderInputBuffer.f55467f = 0L;
                if ((i10 & 4) == 0) {
                    decoderInputBuffer.F(H.this.f56737n);
                    ByteBuffer byteBuffer = decoderInputBuffer.f55465d;
                    H h11 = H.this;
                    byteBuffer.put(h11.f56736m, 0, h11.f56737n);
                }
                if ((i10 & 1) == 0) {
                    this.f56738a = 2;
                }
                return -4;
            }
            g10.f134191b = h10.f56733j;
            this.f56738a = 1;
            return -5;
        }
    }

    static final class c implements Loader.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f56741a = p3.i.a();

        /* renamed from: b, reason: collision with root package name */
        public final f3.g f56742b;

        /* renamed from: c, reason: collision with root package name */
        private final f3.n f56743c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f56744d;

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void c() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() throws IOException {
            this.f56743c.q();
            try {
                this.f56743c.h(this.f56742b);
                int i10 = 0;
                while (i10 != -1) {
                    int iN = (int) this.f56743c.n();
                    byte[] bArr = this.f56744d;
                    if (bArr == null) {
                        this.f56744d = new byte[1024];
                    } else if (iN == bArr.length) {
                        this.f56744d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    f3.n nVar = this.f56743c;
                    byte[] bArr2 = this.f56744d;
                    i10 = nVar.read(bArr2, iN, bArr2.length - iN);
                }
                C13841f.a(this.f56743c);
            } catch (Throwable th2) {
                C13841f.a(this.f56743c);
                throw th2;
            }
        }

        public c(f3.g gVar, InterfaceC13839d interfaceC13839d) {
            this.f56742b = gVar;
            this.f56743c = new f3.n(interfaceC13839d);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        for (int i10 = 0; i10 < this.f56730g.size(); i10++) {
            this.f56730g.get(i10).f();
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            p3.r rVar = rVarArr[i10];
            if (rVar != null && (yVarArr[i10] == null || !zArr[i10])) {
                this.f56730g.remove(rVar);
                rVarArr[i10] = null;
            }
            if (rVarArr[i10] == null && yVarArr[i10] != null) {
                b bVar = new b();
                this.f56730g.add(bVar);
                rVarArr[i10] = bVar;
                zArr2[i10] = true;
            }
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        return -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() {
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return this.f56732i.i();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6061l0 c6061l0) {
        if (this.f56735l || this.f56732i.i() || this.f56732i.h()) {
            return false;
        }
        InterfaceC13839d interfaceC13839dA = this.f56725b.a();
        f3.o oVar = this.f56726c;
        if (oVar != null) {
            interfaceC13839dA.e(oVar);
        }
        this.f56732i.n(new c(this.f56724a, interfaceC13839dA), this, this.f56727d.b(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return (this.f56735l || this.f56732i.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        return this.f56735l ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Loader.c f(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        f3.n nVar = cVar.f56743c;
        p3.i iVar = new p3.i(cVar.f56741a, cVar.f56742b, nVar.o(), nVar.p(), j10, j11, nVar.n());
        long jA = this.f56727d.a(new b.a(iVar, new p3.j(1, -1, this.f56733j, 0, null, 0L, P.j1(this.f56731h)), iOException, i10));
        boolean z10 = jA == -9223372036854775807L || i10 >= this.f56727d.b(1);
        if (this.f56734k && z10) {
            d3.r.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f56735l = true;
            cVarG = Loader.f56967f;
        } else {
            cVarG = jA != -9223372036854775807L ? Loader.g(false, jA) : Loader.f56968g;
        }
        Loader.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f56728e.o(iVar, 1, -1, this.f56733j, 0, null, 0L, this.f56731h, iOException, !zC);
        if (!zC) {
            this.f56727d.c(cVar.f56741a);
        }
        return cVar2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return this.f56729f;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void o(c cVar, long j10, long j11, int i10) {
        f3.n nVar = cVar.f56743c;
        this.f56728e.r(i10 == 0 ? new p3.i(cVar.f56741a, cVar.f56742b, j10) : new p3.i(cVar.f56741a, cVar.f56742b, nVar.o(), nVar.p(), j10, j11, nVar.n()), 1, -1, this.f56733j, 0, null, 0L, this.f56731h, i10);
    }

    public void w() {
        this.f56732i.l();
    }

    public H(f3.g gVar, InterfaceC13839d.a aVar, f3.o oVar, a3.t tVar, long j10, androidx.media3.exoplayer.upstream.b bVar, s.a aVar2, boolean z10, InterfaceExecutorC17220a interfaceExecutorC17220a) {
        Loader loader;
        this.f56724a = gVar;
        this.f56725b = aVar;
        this.f56726c = oVar;
        this.f56733j = tVar;
        this.f56731h = j10;
        this.f56727d = bVar;
        this.f56728e = aVar2;
        this.f56734k = z10;
        this.f56729f = new p3.w(new a3.G(tVar));
        if (interfaceExecutorC17220a != null) {
            loader = new Loader(interfaceExecutorC17220a);
        } else {
            loader = new Loader("SingleSampleMediaPeriod");
        }
        this.f56732i = loader;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void v(c cVar, long j10, long j11, boolean z10) {
        f3.n nVar = cVar.f56743c;
        p3.i iVar = new p3.i(cVar.f56741a, cVar.f56742b, nVar.o(), nVar.p(), j10, j11, nVar.n());
        this.f56727d.c(cVar.f56741a);
        this.f56728e.k(iVar, 1, -1, null, 0, null, 0L, this.f56731h);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void s(c cVar, long j10, long j11) {
        this.f56737n = (int) cVar.f56743c.n();
        this.f56736m = (byte[]) C13466a.e(cVar.f56744d);
        this.f56735l = true;
        f3.n nVar = cVar.f56743c;
        p3.i iVar = new p3.i(cVar.f56741a, cVar.f56742b, nVar.o(), nVar.p(), j10, j11, this.f56737n);
        this.f56727d.c(cVar.f56741a);
        this.f56728e.m(iVar, 1, -1, this.f56733j, 0, null, 0L, this.f56731h);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        aVar.f(this);
    }
}
