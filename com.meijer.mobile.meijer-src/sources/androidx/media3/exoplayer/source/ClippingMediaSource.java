package androidx.media3.exoplayer.source;

import a3.F;
import androidx.media3.exoplayer.source.r;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import d3.C13599a;
import d3.P;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ClippingMediaSource extends L {

    /* renamed from: m, reason: collision with root package name */
    private final long f56874m;

    /* renamed from: n, reason: collision with root package name */
    private final long f56875n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f56876o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f56877p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f56878q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f56879r;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList<C6218b> f56880s;

    /* renamed from: t, reason: collision with root package name */
    private final F.c f56881t;

    /* renamed from: u, reason: collision with root package name */
    private c f56882u;

    /* renamed from: v, reason: collision with root package name */
    private IllegalClippingException f56883v;

    /* renamed from: w, reason: collision with root package name */
    private long f56884w;

    /* renamed from: x, reason: collision with root package name */
    private long f56885x;

    public static final class IllegalClippingException extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f56886a;

        public IllegalClippingException(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        public IllegalClippingException(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f56886a = i10;
        }

        private static String a(int i10, long j10, long j11) {
            if (i10 == 0) {
                return "invalid period count";
            }
            if (i10 == 1) {
                return "not seekable to start";
            }
            if (i10 != 2) {
                return zzbz.UNKNOWN_CONTENT_TYPE;
            }
            C13599a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f56887a;

        /* renamed from: b, reason: collision with root package name */
        private long f56888b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f56891e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f56892f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f56893g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f56894h;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56890d = true;

        /* renamed from: c, reason: collision with root package name */
        private long f56889c = Long.MIN_VALUE;

        public ClippingMediaSource h() {
            this.f56894h = true;
            return new ClippingMediaSource(this);
        }

        public b i(boolean z10) {
            C13599a.g(!this.f56894h);
            this.f56891e = z10;
            return this;
        }

        public b j(boolean z10) {
            C13599a.g(!this.f56894h);
            this.f56890d = z10;
            return this;
        }

        public b k(long j10) {
            C13599a.g(!this.f56894h);
            this.f56889c = j10;
            return this;
        }

        public b l(boolean z10) {
            C13599a.g(!this.f56894h);
            this.f56892f = z10;
            return this;
        }

        public b m(long j10) {
            C13599a.a(j10 >= 0);
            C13599a.g(!this.f56894h);
            this.f56888b = j10;
            return this;
        }

        public b(r rVar) {
            this.f56887a = (r) C13599a.e(rVar);
        }
    }

    private static final class c extends m {

        /* renamed from: f, reason: collision with root package name */
        private final long f56895f;

        /* renamed from: g, reason: collision with root package name */
        private final long f56896g;

        /* renamed from: h, reason: collision with root package name */
        private final long f56897h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f56898i;

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            this.f57129e.g(0, bVar, z10);
            long jO = bVar.o() - this.f56895f;
            long j10 = this.f56897h;
            return bVar.t(bVar.f44410a, bVar.f44411b, 0, j10 != -9223372036854775807L ? j10 - jO : -9223372036854775807L, jO);
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.c o(int i10, F.c cVar, long j10) {
            this.f57129e.o(0, cVar, 0L);
            long j11 = cVar.f44448p;
            long j12 = this.f56895f;
            cVar.f44448p = j11 + j12;
            cVar.f44445m = this.f56897h;
            cVar.f44441i = this.f56898i;
            long j13 = cVar.f44444l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                cVar.f44444l = jMax;
                long j14 = this.f56896g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f44444l = jMax - this.f56895f;
            }
            long jJ1 = P.j1(this.f56895f);
            long j15 = cVar.f44437e;
            if (j15 != -9223372036854775807L) {
                cVar.f44437e = j15 + jJ1;
            }
            long j16 = cVar.f44438f;
            if (j16 != -9223372036854775807L) {
                cVar.f44438f = j16 + jJ1;
            }
            return cVar;
        }

        public c(a3.F f10, long j10, long j11, boolean z10) throws IllegalClippingException {
            long jMax;
            long j12;
            super(f10);
            if (j11 != Long.MIN_VALUE && j11 < j10) {
                throw new IllegalClippingException(2, j10, j11);
            }
            boolean z11 = false;
            if (f10.i() == 1) {
                F.c cVarN = f10.n(0, new F.c());
                long jMax2 = Math.max(0L, j10);
                if (!z10 && !cVarN.f44443k && jMax2 != 0 && !cVarN.f44440h) {
                    throw new IllegalClippingException(1);
                }
                if (j11 == Long.MIN_VALUE) {
                    jMax = cVarN.f44445m;
                } else {
                    jMax = Math.max(0L, j11);
                }
                long j13 = cVarN.f44445m;
                if (j13 != -9223372036854775807L) {
                    jMax = jMax > j13 ? j13 : jMax;
                    if (jMax2 > jMax) {
                        jMax2 = jMax;
                    }
                }
                this.f56895f = jMax2;
                this.f56896g = jMax;
                if (jMax == -9223372036854775807L) {
                    j12 = -9223372036854775807L;
                } else {
                    j12 = jMax - jMax2;
                }
                this.f56897h = j12;
                if (cVarN.f44441i && (jMax == -9223372036854775807L || (j13 != -9223372036854775807L && jMax == j13))) {
                    z11 = true;
                }
                this.f56898i = z11;
                return;
            }
            throw new IllegalClippingException(0);
        }
    }

    private ClippingMediaSource(b bVar) {
        super(bVar.f56887a);
        this.f56874m = bVar.f56888b;
        this.f56875n = bVar.f56889c;
        this.f56876o = bVar.f56890d;
        this.f56877p = bVar.f56891e;
        this.f56878q = bVar.f56892f;
        this.f56879r = bVar.f56893g;
        this.f56880s = new ArrayList<>();
        this.f56881t = new F.c();
    }

    private void S(a3.F f10) {
        long j10;
        f10.n(0, this.f56881t);
        long jE = this.f56881t.e();
        if (this.f56882u == null || this.f56880s.isEmpty() || this.f56877p) {
            j10 = this.f56874m;
            long j11 = this.f56875n;
            if (this.f56878q) {
                long jC = this.f56881t.c();
                j10 += jC;
                j11 += jC;
            }
            this.f56884w = jE + j10;
            this.f56885x = this.f56875n != Long.MIN_VALUE ? jE + j11 : Long.MIN_VALUE;
            int size = this.f56880s.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f56880s.get(i10).v(this.f56884w, this.f56885x);
            }
            j = j11;
        } else {
            j10 = this.f56884w - jE;
            if (this.f56875n != Long.MIN_VALUE) {
                j = this.f56885x - jE;
            }
        }
        try {
            c cVar = new c(f10, j10, j, this.f56879r);
            this.f56882u = cVar;
            z(cVar);
        } catch (IllegalClippingException e10) {
            this.f56883v = e10;
            for (int i11 = 0; i11 < this.f56880s.size(); i11++) {
                this.f56880s.get(i11).s(this.f56883v);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.L
    protected void O(a3.F f10) {
        if (this.f56883v != null) {
            return;
        }
        S(f10);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        C13599a.g(this.f56880s.remove(qVar));
        this.f56994k.h(((C6218b) qVar).f57059a);
        if (!this.f56880s.isEmpty() || this.f56877p) {
            return;
        }
        S(((c) C13599a.e(this.f56882u)).f57129e);
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        C6218b c6218b = new C6218b(this.f56994k.j(bVar, bVar2, j10), this.f56876o, this.f56884w, this.f56885x);
        this.f56880s.add(c6218b);
        return c6218b;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.r
    public void m() throws IOException {
        IllegalClippingException illegalClippingException = this.f56883v;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.m();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6219c, androidx.media3.exoplayer.source.AbstractC6217a
    protected void A() {
        super.A();
        this.f56883v = null;
        this.f56882u = null;
    }
}
