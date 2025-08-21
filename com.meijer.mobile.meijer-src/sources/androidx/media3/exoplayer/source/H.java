package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6203l0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.s;
import androidx.media3.exoplayer.upstream.Loader;
import androidx.media3.exoplayer.upstream.b;
import d3.C13599a;
import d3.P;
import f3.C13951f;
import f3.InterfaceC13949d;
import h3.M;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import u3.InterfaceExecutorC17347a;

/* loaded from: classes.dex */
final class H implements q, Loader.b<c> {

    /* renamed from: a, reason: collision with root package name */
    private final f3.g f56948a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC13949d.a f56949b;

    /* renamed from: c, reason: collision with root package name */
    private final f3.o f56950c;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.upstream.b f56951d;

    /* renamed from: e, reason: collision with root package name */
    private final s.a f56952e;

    /* renamed from: f, reason: collision with root package name */
    private final p3.w f56953f;

    /* renamed from: g, reason: collision with root package name */
    private final ArrayList<b> f56954g = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private final long f56955h;

    /* renamed from: i, reason: collision with root package name */
    final Loader f56956i;

    /* renamed from: j, reason: collision with root package name */
    final a3.t f56957j;

    /* renamed from: k, reason: collision with root package name */
    final boolean f56958k;

    /* renamed from: l, reason: collision with root package name */
    boolean f56959l;

    /* renamed from: m, reason: collision with root package name */
    byte[] f56960m;

    /* renamed from: n, reason: collision with root package name */
    int f56961n;

    private final class b implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        private int f56962a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f56963b;

        private b() {
        }

        private void e() {
            if (this.f56963b) {
                return;
            }
            H.this.f56952e.i(a3.z.k(H.this.f56957j.f44767o), H.this.f56957j, 0, null, 0L);
            this.f56963b = true;
        }

        @Override // p3.r
        public void a() throws IOException {
            H h10 = H.this;
            if (h10.f56958k) {
                return;
            }
            h10.f56956i.j();
        }

        @Override // p3.r
        public boolean b() {
            return H.this.f56959l;
        }

        public void f() {
            if (this.f56962a == 2) {
                this.f56962a = 1;
            }
        }

        @Override // p3.r
        public int c(long j10) {
            e();
            if (j10 > 0 && this.f56962a != 2) {
                this.f56962a = 2;
                return 1;
            }
            return 0;
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            e();
            H h10 = H.this;
            boolean z10 = h10.f56959l;
            if (z10 && h10.f56960m == null) {
                this.f56962a = 2;
            }
            int i11 = this.f56962a;
            if (i11 == 2) {
                decoderInputBuffer.m(4);
                return -4;
            }
            if ((i10 & 2) == 0 && i11 != 0) {
                if (!z10) {
                    return -3;
                }
                C13599a.e(h10.f56960m);
                decoderInputBuffer.m(1);
                decoderInputBuffer.f55691f = 0L;
                if ((i10 & 4) == 0) {
                    decoderInputBuffer.F(H.this.f56961n);
                    ByteBuffer byteBuffer = decoderInputBuffer.f55689d;
                    H h11 = H.this;
                    byteBuffer.put(h11.f56960m, 0, h11.f56961n);
                }
                if ((i10 & 1) == 0) {
                    this.f56962a = 2;
                }
                return -4;
            }
            g10.f134662b = h10.f56957j;
            this.f56962a = 1;
            return -5;
        }
    }

    static final class c implements Loader.e {

        /* renamed from: a, reason: collision with root package name */
        public final long f56965a = p3.i.a();

        /* renamed from: b, reason: collision with root package name */
        public final f3.g f56966b;

        /* renamed from: c, reason: collision with root package name */
        private final f3.n f56967c;

        /* renamed from: d, reason: collision with root package name */
        private byte[] f56968d;

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void c() {
        }

        @Override // androidx.media3.exoplayer.upstream.Loader.e
        public void b() throws IOException {
            this.f56967c.q();
            try {
                this.f56967c.h(this.f56966b);
                int i10 = 0;
                while (i10 != -1) {
                    int iN = (int) this.f56967c.n();
                    byte[] bArr = this.f56968d;
                    if (bArr == null) {
                        this.f56968d = new byte[1024];
                    } else if (iN == bArr.length) {
                        this.f56968d = Arrays.copyOf(bArr, bArr.length * 2);
                    }
                    f3.n nVar = this.f56967c;
                    byte[] bArr2 = this.f56968d;
                    i10 = nVar.read(bArr2, iN, bArr2.length - iN);
                }
                C13951f.a(this.f56967c);
            } catch (Throwable th2) {
                C13951f.a(this.f56967c);
                throw th2;
            }
        }

        public c(f3.g gVar, InterfaceC13949d interfaceC13949d) {
            this.f56966b = gVar;
            this.f56967c = new f3.n(interfaceC13949d);
        }
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        for (int i10 = 0; i10 < this.f56954g.size(); i10++) {
            this.f56954g.get(i10).f();
        }
        return j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        for (int i10 = 0; i10 < yVarArr.length; i10++) {
            p3.r rVar = rVarArr[i10];
            if (rVar != null && (yVarArr[i10] == null || !zArr[i10])) {
                this.f56954g.remove(rVar);
                rVarArr[i10] = null;
            }
            if (rVarArr[i10] == null && yVarArr[i10] != null) {
                b bVar = new b();
                this.f56954g.add(bVar);
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
        return this.f56956i.i();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6203l0 c6203l0) {
        if (this.f56959l || this.f56956i.i() || this.f56956i.h()) {
            return false;
        }
        InterfaceC13949d interfaceC13949dA = this.f56949b.a();
        f3.o oVar = this.f56950c;
        if (oVar != null) {
            interfaceC13949dA.e(oVar);
        }
        this.f56956i.n(new c(this.f56948a, interfaceC13949dA), this, this.f56951d.b(1));
        return true;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return (this.f56959l || this.f56956i.i()) ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        return this.f56959l ? Long.MIN_VALUE : 0L;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public Loader.c f(c cVar, long j10, long j11, IOException iOException, int i10) {
        Loader.c cVarG;
        f3.n nVar = cVar.f56967c;
        p3.i iVar = new p3.i(cVar.f56965a, cVar.f56966b, nVar.o(), nVar.p(), j10, j11, nVar.n());
        long jA = this.f56951d.a(new b.a(iVar, new p3.j(1, -1, this.f56957j, 0, null, 0L, P.j1(this.f56955h)), iOException, i10));
        boolean z10 = jA == -9223372036854775807L || i10 >= this.f56951d.b(1);
        if (this.f56958k && z10) {
            d3.r.j("SingleSampleMediaPeriod", "Loading failed, treating as end-of-stream.", iOException);
            this.f56959l = true;
            cVarG = Loader.f57191f;
        } else {
            cVarG = jA != -9223372036854775807L ? Loader.g(false, jA) : Loader.f57192g;
        }
        Loader.c cVar2 = cVarG;
        boolean zC = cVar2.c();
        this.f56952e.o(iVar, 1, -1, this.f56957j, 0, null, 0L, this.f56955h, iOException, !zC);
        if (!zC) {
            this.f56951d.c(cVar.f56965a);
        }
        return cVar2;
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return this.f56953f;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: t, reason: merged with bridge method [inline-methods] */
    public void o(c cVar, long j10, long j11, int i10) {
        f3.n nVar = cVar.f56967c;
        this.f56952e.r(i10 == 0 ? new p3.i(cVar.f56965a, cVar.f56966b, j10) : new p3.i(cVar.f56965a, cVar.f56966b, nVar.o(), nVar.p(), j10, j11, nVar.n()), 1, -1, this.f56957j, 0, null, 0L, this.f56955h, i10);
    }

    public void w() {
        this.f56956i.l();
    }

    public H(f3.g gVar, InterfaceC13949d.a aVar, f3.o oVar, a3.t tVar, long j10, androidx.media3.exoplayer.upstream.b bVar, s.a aVar2, boolean z10, InterfaceExecutorC17347a interfaceExecutorC17347a) {
        Loader loader;
        this.f56948a = gVar;
        this.f56949b = aVar;
        this.f56950c = oVar;
        this.f56957j = tVar;
        this.f56955h = j10;
        this.f56951d = bVar;
        this.f56952e = aVar2;
        this.f56958k = z10;
        this.f56953f = new p3.w(new a3.G(tVar));
        if (interfaceExecutorC17347a != null) {
            loader = new Loader(interfaceExecutorC17347a);
        } else {
            loader = new Loader("SingleSampleMediaPeriod");
        }
        this.f56956i = loader;
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: l, reason: merged with bridge method [inline-methods] */
    public void v(c cVar, long j10, long j11, boolean z10) {
        f3.n nVar = cVar.f56967c;
        p3.i iVar = new p3.i(cVar.f56965a, cVar.f56966b, nVar.o(), nVar.p(), j10, j11, nVar.n());
        this.f56951d.c(cVar.f56965a);
        this.f56952e.k(iVar, 1, -1, null, 0, null, 0L, this.f56955h);
    }

    @Override // androidx.media3.exoplayer.upstream.Loader.b
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void s(c cVar, long j10, long j11) {
        this.f56961n = (int) cVar.f56967c.n();
        this.f56960m = (byte[]) C13599a.e(cVar.f56968d);
        this.f56959l = true;
        f3.n nVar = cVar.f56967c;
        p3.i iVar = new p3.i(cVar.f56965a, cVar.f56966b, nVar.o(), nVar.p(), j10, j11, this.f56961n);
        this.f56951d.c(cVar.f56965a);
        this.f56952e.m(iVar, 1, -1, this.f56957j, 0, null, 0L, this.f56955h);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        aVar.f(this);
    }
}
