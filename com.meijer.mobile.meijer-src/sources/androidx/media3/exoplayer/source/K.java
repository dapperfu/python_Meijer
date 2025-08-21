package androidx.media3.exoplayer.source;

import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.C6203l0;
import androidx.media3.exoplayer.source.q;
import d3.C13599a;
import h3.M;
import java.io.IOException;

/* loaded from: classes.dex */
final class K implements q, q.a {

    /* renamed from: a, reason: collision with root package name */
    private final q f56988a;

    /* renamed from: b, reason: collision with root package name */
    private final long f56989b;

    /* renamed from: c, reason: collision with root package name */
    private q.a f56990c;

    private static final class a implements p3.r {

        /* renamed from: a, reason: collision with root package name */
        private final p3.r f56991a;

        /* renamed from: b, reason: collision with root package name */
        private final long f56992b;

        @Override // p3.r
        public void a() throws IOException {
            this.f56991a.a();
        }

        @Override // p3.r
        public boolean b() {
            return this.f56991a.b();
        }

        @Override // p3.r
        public int c(long j10) {
            return this.f56991a.c(j10 - this.f56992b);
        }

        @Override // p3.r
        public int d(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10) {
            int iD = this.f56991a.d(g10, decoderInputBuffer, i10);
            if (iD == -4) {
                decoderInputBuffer.f55691f += this.f56992b;
            }
            return iD;
        }

        public p3.r e() {
            return this.f56991a;
        }

        public a(p3.r rVar, long j10) {
            this.f56991a = rVar;
            this.f56992b = j10;
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        p3.r[] rVarArr2 = new p3.r[rVarArr.length];
        int i10 = 0;
        while (true) {
            p3.r rVarE = null;
            if (i10 >= rVarArr.length) {
                break;
            }
            a aVar = (a) rVarArr[i10];
            if (aVar != null) {
                rVarE = aVar.e();
            }
            rVarArr2[i10] = rVarE;
            i10++;
        }
        long jI = this.f56988a.i(yVarArr, zArr, rVarArr2, zArr2, j10 - this.f56989b);
        for (int i11 = 0; i11 < rVarArr.length; i11++) {
            p3.r rVar = rVarArr2[i11];
            if (rVar == null) {
                rVarArr[i11] = null;
            } else {
                p3.r rVar2 = rVarArr[i11];
                if (rVar2 == null || ((a) rVar2).e() != rVar) {
                    rVarArr[i11] = new a(rVar, this.f56989b);
                }
            }
        }
        return jI + this.f56989b;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        return this.f56988a.a();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6203l0 c6203l0) {
        return this.f56988a.b(c6203l0.a().f(c6203l0.f56548a - this.f56989b).d());
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        long jC = this.f56988a.c();
        if (jC == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jC + this.f56989b;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        long jD = this.f56988a.d();
        if (jD == Long.MIN_VALUE) {
            return Long.MIN_VALUE;
        }
        return jD + this.f56989b;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
        this.f56988a.e(j10 - this.f56989b);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        ((q.a) C13599a.e(this.f56990c)).f(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        return this.f56988a.h(j10 - this.f56989b) + this.f56989b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        long j10 = this.f56988a.j();
        if (j10 == -9223372036854775807L) {
            return -9223372036854775807L;
        }
        return j10 + this.f56989b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        return this.f56988a.k(j10 - this.f56989b, m10) + this.f56989b;
    }

    public q l() {
        return this.f56988a;
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public void g(q qVar) {
        ((q.a) C13599a.e(this.f56990c)).g(this);
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        this.f56988a.n();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f56990c = aVar;
        this.f56988a.q(this, j10 - this.f56989b);
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return this.f56988a.r();
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        this.f56988a.u(j10 - this.f56989b, z10);
    }

    public K(q qVar, long j10) {
        this.f56988a = qVar;
        this.f56989b = j10;
    }
}
