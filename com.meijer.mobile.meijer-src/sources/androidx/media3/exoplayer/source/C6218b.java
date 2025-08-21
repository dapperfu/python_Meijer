package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6203l0;
import androidx.media3.exoplayer.source.ClippingMediaSource;
import androidx.media3.exoplayer.source.q;
import d3.C13599a;
import d3.P;
import h3.M;
import java.io.IOException;

/* renamed from: androidx.media3.exoplayer.source.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6218b implements q, q.a {

    /* renamed from: a, reason: collision with root package name */
    public final q f57059a;

    /* renamed from: b, reason: collision with root package name */
    private q.a f57060b;

    /* renamed from: c, reason: collision with root package name */
    private a[] f57061c = new a[0];

    /* renamed from: d, reason: collision with root package name */
    private long f57062d;

    /* renamed from: e, reason: collision with root package name */
    long f57063e;

    /* renamed from: f, reason: collision with root package name */
    long f57064f;

    /* renamed from: g, reason: collision with root package name */
    private ClippingMediaSource.IllegalClippingException f57065g;

    /* renamed from: androidx.media3.exoplayer.source.b$a */
    private final class a implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        public final p3.r f57066a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f57067b;

        public void e() {
            this.f57067b = false;
        }

        public a(p3.r rVar) {
            this.f57066a = rVar;
        }

        @Override // p3.r
        public void a() throws IOException {
            this.f57066a.a();
        }

        @Override // p3.r
        public boolean b() {
            return !C6218b.this.o() && this.f57066a.b();
        }

        @Override // p3.r
        public int c(long j10) {
            if (C6218b.this.o()) {
                return -3;
            }
            return this.f57066a.c(j10);
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            if (C6218b.this.o()) {
                return -3;
            }
            if (this.f57067b) {
                decoderInputBuffer.D(4);
                return -4;
            }
            long jD = C6218b.this.d();
            int iD = this.f57066a.d(g10, decoderInputBuffer, i10);
            if (iD == -5) {
                a3.t tVar = (a3.t) C13599a.e(g10.f134662b);
                int i11 = tVar.f44745H;
                if (i11 != 0 || tVar.f44746I != 0) {
                    C6218b c6218b = C6218b.this;
                    if (c6218b.f57063e != 0) {
                        i11 = 0;
                    }
                    g10.f134662b = tVar.b().Z(i11).a0(c6218b.f57064f == Long.MIN_VALUE ? tVar.f44746I : 0).N();
                }
                return -5;
            }
            long j10 = C6218b.this.f57064f;
            if (j10 == Long.MIN_VALUE || ((iD != -4 || decoderInputBuffer.f55691f < j10) && !(iD == -3 && jD == Long.MIN_VALUE && !decoderInputBuffer.f55690e))) {
                return iD;
            }
            decoderInputBuffer.o();
            decoderInputBuffer.D(4);
            this.f57067b = true;
            return -4;
        }
    }

    private M l(long j10, M m10) {
        long jP = P.p(m10.f134675a, 0L, j10 - this.f57063e);
        long j11 = m10.f134676b;
        long j12 = this.f57064f;
        long jP2 = P.p(j11, 0L, j12 == Long.MIN_VALUE ? Long.MAX_VALUE : j12 - j10);
        return (jP == m10.f134675a && jP2 == m10.f134676b) ? m10 : new M(jP, jP2);
    }

    private static boolean t(long j10, long j11, s3.y[] yVarArr) {
        if (j10 < j11) {
            return true;
        }
        if (j10 != 0) {
            for (s3.y yVar : yVarArr) {
                if (yVar != null) {
                    a3.t tVarJ = yVar.j();
                    if (!a3.z.a(tVarJ.f44767o, tVarJ.f44763k)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return this.f57059a.a();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6203l0 c6203l0) {
        return this.f57059a.b(c6203l0);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        long jC = this.f57059a.c();
        if (jC != Long.MIN_VALUE) {
            long j10 = this.f57064f;
            if (j10 == Long.MIN_VALUE || jC < j10) {
                return jC;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        long jD = this.f57059a.d();
        if (jD != Long.MIN_VALUE) {
            long j10 = this.f57064f;
            if (j10 == Long.MIN_VALUE || jD < j10) {
                return jD;
            }
        }
        return Long.MIN_VALUE;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
        this.f57059a.e(j10);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        if (this.f57065g != null) {
            return;
        }
        ((q.a) C13599a.e(this.f57060b)).f(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        this.f57061c = new a[rVarArr.length];
        p3.r[] rVarArr2 = new p3.r[rVarArr.length];
        int i10 = 0;
        while (true) {
            p3.r rVar = null;
            if (i10 >= rVarArr.length) {
                break;
            }
            a[] aVarArr = this.f57061c;
            a aVar = (a) rVarArr[i10];
            aVarArr[i10] = aVar;
            if (aVar != null) {
                rVar = aVar.f57066a;
            }
            rVarArr2[i10] = rVar;
            i10++;
        }
        long jI = this.f57059a.i(yVarArr, zArr, rVarArr2, zArr2, j10);
        long jM = m(jI, j10, this.f57064f);
        this.f57062d = (o() && t(jI, j10, yVarArr)) ? jM : -9223372036854775807L;
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            p3.r rVar2 = rVarArr2[i11];
            if (rVar2 == null) {
                this.f57061c[i11] = null;
            } else {
                a[] aVarArr2 = this.f57061c;
                a aVar2 = aVarArr2[i11];
                if (aVar2 == null || aVar2.f57066a != rVar2) {
                    aVarArr2[i11] = new a(rVar2);
                }
            }
            rVarArr[i11] = this.f57061c[i11];
        }
        return jM;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        long j11 = this.f57063e;
        if (j10 == j11) {
            return j11;
        }
        return this.f57059a.k(j10, l(j10, m10));
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        ClippingMediaSource.IllegalClippingException illegalClippingException = this.f57065g;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        this.f57059a.n();
    }

    boolean o() {
        return this.f57062d != -9223372036854775807L;
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public void g(q qVar) {
        ((q.a) C13599a.e(this.f57060b)).g(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f57060b = aVar;
        this.f57059a.q(this, j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return this.f57059a.r();
    }

    public void s(ClippingMediaSource.IllegalClippingException illegalClippingException) {
        this.f57065g = illegalClippingException;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        this.f57059a.u(j10, z10);
    }

    public void v(long j10, long j11) {
        this.f57063e = j10;
        this.f57064f = j11;
    }

    public C6218b(q qVar, boolean z10, long j10, long j11) {
        long j12;
        this.f57059a = qVar;
        if (z10) {
            j12 = j10;
        } else {
            j12 = -9223372036854775807L;
        }
        this.f57062d = j12;
        this.f57063e = j10;
        this.f57064f = j11;
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
            long j10 = this.f57062d;
            this.f57062d = -9223372036854775807L;
            long j11 = j();
            if (j11 != -9223372036854775807L) {
                return j11;
            }
            return j10;
        }
        long j12 = this.f57059a.j();
        if (j12 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return m(j12, this.f57063e, this.f57064f);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        this.f57062d = -9223372036854775807L;
        for (a aVar : this.f57061c) {
            if (aVar != null) {
                aVar.e();
            }
        }
        return m(this.f57059a.h(j10), this.f57063e, this.f57064f);
    }
}
