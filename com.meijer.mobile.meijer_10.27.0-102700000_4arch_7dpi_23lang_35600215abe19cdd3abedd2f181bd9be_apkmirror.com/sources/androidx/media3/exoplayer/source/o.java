package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.P;
import h3.M;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o implements q, q.a {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f56911a;

    /* renamed from: b, reason: collision with root package name */
    private final long f56912b;

    /* renamed from: c, reason: collision with root package name */
    private final t3.b f56913c;

    /* renamed from: d, reason: collision with root package name */
    private r f56914d;

    /* renamed from: e, reason: collision with root package name */
    private q f56915e;

    /* renamed from: f, reason: collision with root package name */
    private q.a f56916f;

    /* renamed from: g, reason: collision with root package name */
    private a f56917g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f56918h;

    /* renamed from: i, reason: collision with root package name */
    private long f56919i = -9223372036854775807L;

    public interface a {
        void a(r.b bVar, IOException iOException);

        void b(r.b bVar);
    }

    private long p(long j10) {
        long j11 = this.f56919i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        q qVar = this.f56915e;
        return qVar != null && qVar.a();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6061l0 c6061l0) {
        q qVar = this.f56915e;
        return qVar != null && qVar.b(c6061l0);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return ((q) P.h(this.f56915e)).c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        return ((q) P.h(this.f56915e)).d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
        ((q) P.h(this.f56915e)).e(j10);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        ((q.a) P.h(this.f56916f)).f(this);
        a aVar = this.f56917g;
        if (aVar != null) {
            aVar.b(this.f56911a);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        return ((q) P.h(this.f56915e)).h(j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        long j11 = this.f56919i;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f56912b) ? j10 : j11;
        this.f56919i = -9223372036854775807L;
        return ((q) P.h(this.f56915e)).i(yVarArr, zArr, rVarArr, zArr2, j12);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        return ((q) P.h(this.f56915e)).j();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        return ((q) P.h(this.f56915e)).k(j10, m10);
    }

    public void l(r.b bVar) {
        long jP = p(this.f56912b);
        q qVarJ = ((r) C13466a.e(this.f56914d)).j(bVar, this.f56913c, jP);
        this.f56915e = qVarJ;
        if (this.f56916f != null) {
            qVarJ.q(this, jP);
        }
    }

    public long m() {
        return this.f56919i;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        try {
            q qVar = this.f56915e;
            if (qVar != null) {
                qVar.n();
                return;
            }
            r rVar = this.f56914d;
            if (rVar != null) {
                rVar.m();
            }
        } catch (IOException e10) {
            a aVar = this.f56917g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f56918h) {
                return;
            }
            this.f56918h = true;
            aVar.a(this.f56911a, e10);
        }
    }

    public long o() {
        return this.f56912b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f56916f = aVar;
        q qVar = this.f56915e;
        if (qVar != null) {
            qVar.q(this, p(this.f56912b));
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return ((q) P.h(this.f56915e)).r();
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void g(q qVar) {
        ((q.a) P.h(this.f56916f)).g(this);
    }

    public void t(long j10) {
        this.f56919i = j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        ((q) P.h(this.f56915e)).u(j10, z10);
    }

    public void v() {
        if (this.f56915e != null) {
            ((r) C13466a.e(this.f56914d)).h(this.f56915e);
        }
    }

    public void w(r rVar) {
        C13466a.g(this.f56914d == null);
        this.f56914d = rVar;
    }

    public void x(a aVar) {
        this.f56917g = aVar;
    }

    public o(r.b bVar, t3.b bVar2, long j10) {
        this.f56911a = bVar;
        this.f56913c = bVar2;
        this.f56912b = j10;
    }
}
