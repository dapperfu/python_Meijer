package androidx.media3.exoplayer.source;

import androidx.media3.exoplayer.C6203l0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.P;
import h3.M;
import java.io.IOException;

/* loaded from: classes.dex */
public final class o implements q, q.a {

    /* renamed from: a, reason: collision with root package name */
    public final r.b f57135a;

    /* renamed from: b, reason: collision with root package name */
    private final long f57136b;

    /* renamed from: c, reason: collision with root package name */
    private final t3.b f57137c;

    /* renamed from: d, reason: collision with root package name */
    private r f57138d;

    /* renamed from: e, reason: collision with root package name */
    private q f57139e;

    /* renamed from: f, reason: collision with root package name */
    private q.a f57140f;

    /* renamed from: g, reason: collision with root package name */
    private a f57141g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f57142h;

    /* renamed from: i, reason: collision with root package name */
    private long f57143i = -9223372036854775807L;

    public interface a {
        void a(r.b bVar, IOException iOException);

        void b(r.b bVar);
    }

    private long p(long j10) {
        long j11 = this.f57143i;
        return j11 != -9223372036854775807L ? j11 : j10;
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean a() {
        q qVar = this.f57139e;
        return qVar != null && qVar.a();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public boolean b(C6203l0 c6203l0) {
        q qVar = this.f57139e;
        return qVar != null && qVar.b(c6203l0);
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long c() {
        return ((q) P.h(this.f57139e)).c();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public long d() {
        return ((q) P.h(this.f57139e)).d();
    }

    @Override // androidx.media3.exoplayer.source.q, androidx.media3.exoplayer.source.G
    public void e(long j10) {
        ((q) P.h(this.f57139e)).e(j10);
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(q qVar) {
        ((q.a) P.h(this.f57140f)).f(this);
        a aVar = this.f57141g;
        if (aVar != null) {
            aVar.b(this.f57135a);
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public long h(long j10) {
        return ((q) P.h(this.f57139e)).h(j10);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long i(s3.y[] yVarArr, boolean[] zArr, p3.r[] rVarArr, boolean[] zArr2, long j10) {
        long j11 = this.f57143i;
        long j12 = (j11 == -9223372036854775807L || j10 != this.f57136b) ? j10 : j11;
        this.f57143i = -9223372036854775807L;
        return ((q) P.h(this.f57139e)).i(yVarArr, zArr, rVarArr, zArr2, j12);
    }

    @Override // androidx.media3.exoplayer.source.q
    public long j() {
        return ((q) P.h(this.f57139e)).j();
    }

    @Override // androidx.media3.exoplayer.source.q
    public long k(long j10, M m10) {
        return ((q) P.h(this.f57139e)).k(j10, m10);
    }

    public void l(r.b bVar) {
        long jP = p(this.f57136b);
        q qVarJ = ((r) C13599a.e(this.f57138d)).j(bVar, this.f57137c, jP);
        this.f57139e = qVarJ;
        if (this.f57140f != null) {
            qVarJ.q(this, jP);
        }
    }

    public long m() {
        return this.f57143i;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void n() throws IOException {
        try {
            q qVar = this.f57139e;
            if (qVar != null) {
                qVar.n();
                return;
            }
            r rVar = this.f57138d;
            if (rVar != null) {
                rVar.m();
            }
        } catch (IOException e10) {
            a aVar = this.f57141g;
            if (aVar == null) {
                throw e10;
            }
            if (this.f57142h) {
                return;
            }
            this.f57142h = true;
            aVar.a(this.f57135a, e10);
        }
    }

    public long o() {
        return this.f57136b;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void q(q.a aVar, long j10) {
        this.f57140f = aVar;
        q qVar = this.f57139e;
        if (qVar != null) {
            qVar.q(this, p(this.f57136b));
        }
    }

    @Override // androidx.media3.exoplayer.source.q
    public p3.w r() {
        return ((q) P.h(this.f57139e)).r();
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void g(q qVar) {
        ((q.a) P.h(this.f57140f)).g(this);
    }

    public void t(long j10) {
        this.f57143i = j10;
    }

    @Override // androidx.media3.exoplayer.source.q
    public void u(long j10, boolean z10) {
        ((q) P.h(this.f57139e)).u(j10, z10);
    }

    public void v() {
        if (this.f57139e != null) {
            ((r) C13599a.e(this.f57138d)).h(this.f57139e);
        }
    }

    public void w(r rVar) {
        C13599a.g(this.f57138d == null);
        this.f57138d = rVar;
    }

    public void x(a aVar) {
        this.f57141g = aVar;
    }

    public o(r.b bVar, t3.b bVar2, long j10) {
        this.f57135a = bVar;
        this.f57137c = bVar2;
        this.f57136b = j10;
    }
}
