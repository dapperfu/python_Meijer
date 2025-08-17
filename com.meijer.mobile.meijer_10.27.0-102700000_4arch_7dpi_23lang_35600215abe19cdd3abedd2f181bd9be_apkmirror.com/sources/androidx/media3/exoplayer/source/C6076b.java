package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.q;
import d3.C13466a;
import d3.P;
import h3.M;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.source.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6076b implements q, q.a {

    /* renamed from: a, reason: collision with root package name */
    public final q f56835a;

    /* renamed from: b, reason: collision with root package name */
    private q.a f56836b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f56837c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    private long f56838d;

    /* renamed from: e, reason: collision with root package name */
    long f56839e;

    /* renamed from: f, reason: collision with root package name */
    long f56840f;

    /* renamed from: g, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f56841g;

    /* renamed from: androidx.media3.exoplayer.source.b$a */
    private final class a implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        public final p3.r f56842a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f56843b;

        public void e() {
            this.f56843b = false;
        }

        public a(p3.r rVar) {
            this.f56842a = rVar;
        }

        @Override // p3.r
        public void a() throws IOException {
            this.f56842a.a();
        }

        @Override // p3.r
        public boolean b() {
            return !C6076b.this.o() && this.f56842a.b();
        }

        @Override // p3.r
        public int c(long j10) {
            if (C6076b.this.o()) {
                return -3;
            }
            return this.f56842a.c(j10);
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (C6076b.this.o()) {
                return -3;
            }
            if (this.f56843b) {
                decoderInputBuffer.D(4);
                return -4;
            }
            long jD = C6076b.this.d();
            int iD = this.f56842a.d(g10, decoderInputBuffer, i10);
            if (iD == -5) {
                a3.t tVar = (a3.t) C13466a.e(g10.f134191b);
                int i11 = tVar.f43927H;
                if (i11 != 0 || tVar.f43928I != 0) {
                    C6076b c6076b = C6076b.this;
                    if (c6076b.f56839e != 0) {
                        i11 = 0;
                    }
                    g10.f134191b = tVar.b().Z(i11).a0(c6076b.f56840f == Long.MIN_VALUE ? tVar.f43928I : 0).N();
                }
                return -5;
            }
            long j10 = C6076b.this.f56840f;
            if (j10 == Long.MIN_VALUE || ((iD != -4 || decoderInputBuffer.f55467f < j10) && !(iD == -3 && jD == Long.MIN_VALUE && !decoderInputBuffer.f55466e))) {
                return iD;
            }
            decoderInputBuffer.o();
            decoderInputBuffer.D(4);
            this.f56843b = true;
            return -4;
        }
    }

    private M l(long j10, M m10) {
        long jP = P.p(m10.f134204a, 0L, j10 - this.f56839e);
        long j11 = m10.f134205b;
        long j12 = this.f56840f;
        long jP2 = P.p(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jP == m10.f134204a && jP2 == m10.f134205b) ? m10 : new M(jP, jP2);
    }

    private static boolean t(long j10, long j11, s3.y[] yVarArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (s3.y yVar : yVarArr) {
                if (yVar != null) {
                    a3.t tVarJ = yVar.j();
                    if (!a3.z.a(tVarJ.f43949o, tVarJ.f43945k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return this.f56835a.a();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6061l0 c6061l0) {
        return this.f56835a.b(c6061l0);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        long jC = this.f56835a.c();
        if (jC != Long.MIN_VALUE) {
            long j10 = this.f56840f;
            if (j10 == Long.MIN_VALUE || jC < j10) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        long jD = this.f56835a.d();
        if (jD != Long.MIN_VALUE) {
            long j10 = this.f56840f;
            if (j10 == Long.MIN_VALUE || jD < j10) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
        this.f56835a.e(j10);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        if (this.f56841g != null) {
            return;
        }
        ((q.a) C13466a.e(this.f56836b)).f(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        this.f56837c = new a[rVarArr.length];
        p3.r[] rVarArr2 = new p3.r[rVarArr.length];
        int i10 = 0;
        while (true) {
            p3.r rVar = null;
            if (i10 >= rVarArr.length) {
                break;
            }
            a[] aVarArr = this.f56837c;
            a aVar = (a) rVarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                rVar = aVar.f56842a;
            }
            rVarArr2[i10] = rVar;
            i10++;
        }
        long jI = this.f56835a.i(yVarArr, zArr, rVarArr2, zArr2, j10);
        long jM = m(jI, j10, this.f56840f);
        this.f56838d = (o() && t(jI, j10, yVarArr)) ? jM : -9223372036854775807L;
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            p3.r rVar2 = rVarArr2[i11];
            if (rVar2 == null) {
                this.f56837c[i11] = null;
            } else {
                a[] aVarArr2 = this.f56837c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f56842a != rVar2) {
                    aVarArr2[i11] = new a(rVar2);
                }
            }
            rVarArr[i11] = this.f56837c[i11];
        }
        return jM;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        long j11 = this.f56839e;
        if (j10 == j11) {
            return j11;
        }
        return this.f56835a.k(j10, l(j10, m10));
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f56841g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f56835a.n();
    }

    boolean o() {
        return this.f56838d != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void g(q qVar) {
        ((q.a) C13466a.e(this.f56836b)).g(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f56836b = aVar;
        this.f56835a.q(this, j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return this.f56835a.r();
    }

    public void s(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f56841g = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        this.f56835a.u(j10, z10);
    }

    public void v(long j10, long j11) {
        this.f56839e = j10;
        this.f56840f = j11;
    }

    public C6076b(q qVar, boolean z10, long j10, long j11) {
        long j12;
        this.f56835a = qVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f56838d = j12;
        this.f56839e = j10;
        this.f56840f = j11;
    }

    private static long m(long j10, long j11, long j12) {
        long jMax = Math.max(j10, j11);
        if (j12 != Long.MIN_VALUE) {
            return Math.min(jMax, j12);
        }
        return jMax;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        if (o()) {
            long j10 = this.f56838d;
            this.f56838d = -9223372036854775807L;
            long j11 = j();
            if (j11 != -9223372036854775807L) {
                return j11;
            }
            return j10;
        }
        long j12 = this.f56835a.j();
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m(j12, this.f56839e, this.f56840f);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        this.f56838d = -9223372036854775807L;
        for (a aVar : this.f56837c) {
            if (aVar != null) {
                aVar.e();
            }
        }
        return m(this.f56835a.h(j10), this.f56839e, this.f56840f);
    }
}
