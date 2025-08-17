package androidx.media3.exoplayer.video;

import a3.N;
import androidx.media3.exoplayer.ExoPlaybackException;
import androidx.media3.exoplayer.video.n;
import d3.C13466a;
import d3.I;
import d3.t;

/* loaded from: classes.dex */
final class o {

    /* renamed from: a, reason: collision with root package name */
    private final a f57174a;

    /* renamed from: b, reason: collision with root package name */
    private final n f57175b;

    /* renamed from: k, reason: collision with root package name */
    private long f57184k;

    /* renamed from: c, reason: collision with root package name */
    private final n.a f57176c = new n.a();

    /* renamed from: d, reason: collision with root package name */
    private final I<N> f57177d = new I<>();

    /* renamed from: e, reason: collision with root package name */
    private final I<Long> f57178e = new I<>();

    /* renamed from: f, reason: collision with root package name */
    private final t f57179f = new t();

    /* renamed from: g, reason: collision with root package name */
    private long f57180g = -9223372036854775807L;

    /* renamed from: j, reason: collision with root package name */
    private N f57183j = N.f43763e;

    /* renamed from: h, reason: collision with root package name */
    private long f57181h = -9223372036854775807L;

    /* renamed from: i, reason: collision with root package name */
    private long f57182i = -9223372036854775807L;

    interface a {
        void a();

        void b(long j10, long j11, boolean z10);

        void e(N n10);
    }

    private void a() {
        this.f57179f.f();
        this.f57174a.a();
    }

    private boolean e(long j10) {
        Long lJ = this.f57178e.j(j10);
        if (lJ == null || lJ.longValue() == this.f57184k) {
            return false;
        }
        this.f57184k = lJ.longValue();
        return true;
    }

    private boolean f(long j10) {
        N nJ = this.f57177d.j(j10);
        if (nJ == null || nJ.equals(N.f43763e) || nJ.equals(this.f57183j)) {
            return false;
        }
        this.f57183j = nJ;
        return true;
    }

    private void k(boolean z10) {
        long jF = this.f57179f.f();
        if (f(jF)) {
            this.f57174a.e(this.f57183j);
        }
        this.f57174a.b(z10 ? -1L : this.f57176c.g(), jF, this.f57175b.i());
    }

    public void b() {
        this.f57179f.b();
        this.f57180g = -9223372036854775807L;
        this.f57181h = -9223372036854775807L;
        this.f57182i = -9223372036854775807L;
        if (this.f57178e.l() > 0) {
            Long l10 = (Long) c(this.f57178e);
            l10.longValue();
            this.f57178e.a(0L, l10);
        }
        if (this.f57177d.l() > 0) {
            this.f57177d.a(0L, (N) c(this.f57177d));
        }
    }

    public boolean d() {
        long j10 = this.f57182i;
        return j10 != -9223372036854775807L && this.f57181h == j10;
    }

    public void g(long j10) {
        this.f57179f.a(j10);
        this.f57180g = j10;
        this.f57182i = -9223372036854775807L;
    }

    public void h(long j10) {
        I<Long> i10 = this.f57178e;
        long j11 = this.f57180g;
        i10.a(j11 == -9223372036854775807L ? 0L : j11 + 1, Long.valueOf(j10));
    }

    public void i(int i10, int i11) {
        I<N> i12 = this.f57177d;
        long j10 = this.f57180g;
        i12.a(j10 == -9223372036854775807L ? 0L : j10 + 1, new N(i10, i11));
    }

    public void j(long j10, long j11) throws ExoPlaybackException {
        while (!this.f57179f.e()) {
            long jD = this.f57179f.d();
            if (e(jD)) {
                this.f57175b.j();
            }
            int iC = this.f57175b.c(jD, j10, j11, this.f57184k, false, false, this.f57176c);
            if (iC == 0 || iC == 1) {
                this.f57181h = jD;
                k(iC == 0);
            } else if (iC == 2 || iC == 3) {
                this.f57181h = jD;
                a();
            } else {
                if (iC != 4) {
                    if (iC != 5) {
                        throw new IllegalStateException(String.valueOf(iC));
                    }
                    return;
                }
                this.f57181h = jD;
            }
        }
    }

    public void l() {
        this.f57182i = this.f57180g;
    }

    public o(a aVar, n nVar) {
        this.f57174a = aVar;
        this.f57175b = nVar;
    }

    private static <T> T c(I<T> i10) {
        boolean z10;
        if (i10.l() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        while (i10.l() > 1) {
            i10.i();
        }
        return (T) C13466a.e(i10.i());
    }
}
