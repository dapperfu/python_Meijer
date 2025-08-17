package androidx.media3.exoplayer.source;

import a3.F;
import androidx.media3.exoplayer.source.r;
import com.google.ads.interactivemedia.v3.impl.data.zzbz;
import d3.C13466a;
import d3.P;
import java.io.IOException;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class ClippingMediaSource extends L {

    /* renamed from: m, reason: collision with root package name */
    private final long f56650m;

    /* renamed from: n, reason: collision with root package name */
    private final long f56651n;

    /* renamed from: o, reason: collision with root package name */
    private final boolean f56652o;

    /* renamed from: p, reason: collision with root package name */
    private final boolean f56653p;

    /* renamed from: q, reason: collision with root package name */
    private final boolean f56654q;

    /* renamed from: r, reason: collision with root package name */
    private final boolean f56655r;

    /* renamed from: s, reason: collision with root package name */
    private final ArrayList<C6076b> f56656s;

    /* renamed from: t, reason: collision with root package name */
    private final F.c f56657t;

    /* renamed from: u, reason: collision with root package name */
    private c f56658u;

    /* renamed from: v, reason: collision with root package name */
    private IllegalClippingException f56659v;

    /* renamed from: w, reason: collision with root package name */
    private long f56660w;

    /* renamed from: x, reason: collision with root package name */
    private long f56661x;

    public static final class IllegalClippingException extends IOException {

        /* renamed from: a, reason: collision with root package name */
        public final int f56662a;

        public IllegalClippingException(int i10) {
            this(i10, -9223372036854775807L, -9223372036854775807L);
        }

        public IllegalClippingException(int i10, long j10, long j11) {
            super("Illegal clipping: " + a(i10, j10, j11));
            this.f56662a = i10;
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
            C13466a.g((j10 == -9223372036854775807L || j11 == -9223372036854775807L) ? false : true);
            return "start exceeds end. Start time: " + j10 + ", End time: " + j11;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final r f56663a;

        /* renamed from: b, reason: collision with root package name */
        private long f56664b;

        /* renamed from: e, reason: collision with root package name */
        private boolean f56667e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f56668f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f56669g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f56670h;

        /* renamed from: d, reason: collision with root package name */
        private boolean f56666d = true;

        /* renamed from: c, reason: collision with root package name */
        private long f56665c = Long.MIN_VALUE;

        public ClippingMediaSource h() {
            this.f56670h = true;
            return new ClippingMediaSource(this);
        }

        public b i(boolean z10) {
            C13466a.g(!this.f56670h);
            this.f56667e = z10;
            return this;
        }

        public b j(boolean z10) {
            C13466a.g(!this.f56670h);
            this.f56666d = z10;
            return this;
        }

        public b k(long j10) {
            C13466a.g(!this.f56670h);
            this.f56665c = j10;
            return this;
        }

        public b l(boolean z10) {
            C13466a.g(!this.f56670h);
            this.f56668f = z10;
            return this;
        }

        public b m(long j10) {
            C13466a.a(j10 >= 0);
            C13466a.g(!this.f56670h);
            this.f56664b = j10;
            return this;
        }

        public b(r rVar) {
            this.f56663a = (r) C13466a.e(rVar);
        }
    }

    private static final class c extends m {

        /* renamed from: f, reason: collision with root package name */
        private final long f56671f;

        /* renamed from: g, reason: collision with root package name */
        private final long f56672g;

        /* renamed from: h, reason: collision with root package name */
        private final long f56673h;

        /* renamed from: i, reason: collision with root package name */
        private final boolean f56674i;

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            this.f56905e.g(0, bVar, z10);
            long jO = bVar.o() - this.f56671f;
            long j10 = this.f56673h;
            return bVar.t(bVar.f43592a, bVar.f43593b, 0, j10 != -9223372036854775807L ? j10 - jO : -9223372036854775807L, jO);
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.c o(int i10, F.c cVar, long j10) {
            this.f56905e.o(0, cVar, 0L);
            long j11 = cVar.f43630p;
            long j12 = this.f56671f;
            cVar.f43630p = j11 + j12;
            cVar.f43627m = this.f56673h;
            cVar.f43623i = this.f56674i;
            long j13 = cVar.f43626l;
            if (j13 != -9223372036854775807L) {
                long jMax = Math.max(j13, j12);
                cVar.f43626l = jMax;
                long j14 = this.f56672g;
                if (j14 != -9223372036854775807L) {
                    jMax = Math.min(jMax, j14);
                }
                cVar.f43626l = jMax - this.f56671f;
            }
            long jJ1 = P.j1(this.f56671f);
            long j15 = cVar.f43619e;
            if (j15 != -9223372036854775807L) {
                cVar.f43619e = j15 + jJ1;
            }
            long j16 = cVar.f43620f;
            if (j16 != -9223372036854775807L) {
                cVar.f43620f = j16 + jJ1;
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
                if (!z10 && !cVarN.f43625k && jMax2 != 0 && !cVarN.f43622h) {
                    throw new IllegalClippingException(1);
                }
                if (j11 == Long.MIN_VALUE) {
                    jMax = cVarN.f43627m;
                } else {
                    jMax = Math.max(0L, j11);
                }
                long j13 = cVarN.f43627m;
                if (j13 != -9223372036854775807L) {
                    jMax = jMax > j13 ? j13 : jMax;
                    if (jMax2 > jMax) {
                        jMax2 = jMax;
                    }
                }
                this.f56671f = jMax2;
                this.f56672g = jMax;
                if (jMax == -9223372036854775807L) {
                    j12 = -9223372036854775807L;
                } else {
                    j12 = jMax - jMax2;
                }
                this.f56673h = j12;
                if (cVarN.f43623i && (jMax == -9223372036854775807L || (j13 != -9223372036854775807L && jMax == j13))) {
                    z11 = true;
                }
                this.f56674i = z11;
                return;
            }
            throw new IllegalClippingException(0);
        }
    }

    private ClippingMediaSource(b bVar) {
        super(bVar.f56663a);
        this.f56650m = bVar.f56664b;
        this.f56651n = bVar.f56665c;
        this.f56652o = bVar.f56666d;
        this.f56653p = bVar.f56667e;
        this.f56654q = bVar.f56668f;
        this.f56655r = bVar.f56669g;
        this.f56656s = new ArrayList<>();
        this.f56657t = new F.c();
    }

    private void S(a3.F f10) {
        long j10;
        f10.n(0, this.f56657t);
        long jE = this.f56657t.e();
        if (this.f56658u == null || this.f56656s.isEmpty() || this.f56653p) {
            j10 = this.f56650m;
            long j11 = this.f56651n;
            if (this.f56654q) {
                long jC = this.f56657t.c();
                j10 += jC;
                j11 += jC;
            }
            this.f56660w = jE + j10;
            this.f56661x = this.f56651n != Long.MIN_VALUE ? jE + j11 : Long.MIN_VALUE;
            int size = this.f56656s.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.f56656s.get(i10).v(this.f56660w, this.f56661x);
            }
            j = j11;
        } else {
            j10 = this.f56660w - jE;
            if (this.f56651n != Long.MIN_VALUE) {
                j = this.f56661x - jE;
            }
        }
        try {
            c cVar = new c(f10, j10, j, this.f56655r);
            this.f56658u = cVar;
            z(cVar);
        } catch (IllegalClippingException e10) {
            this.f56659v = e10;
            for (int i11 = 0; i11 < this.f56656s.size(); i11++) {
                this.f56656s.get(i11).s(this.f56659v);
            }
        }
    }

    @Override // androidx.media3.exoplayer.source.L
    protected void O(a3.F f10) {
        if (this.f56659v != null) {
            return;
        }
        S(f10);
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        C13466a.g(this.f56656s.remove(qVar));
        this.f56770k.h(((C6076b) qVar).f56835a);
        if (!this.f56656s.isEmpty() || this.f56653p) {
            return;
        }
        S(((c) C13466a.e(this.f56658u)).f56905e);
    }

    @Override // androidx.media3.exoplayer.source.r
    public q j(r.b bVar, t3.b bVar2, long j10) {
        C6076b c6076b = new C6076b(this.f56770k.j(bVar, bVar2, j10), this.f56652o, this.f56660w, this.f56661x);
        this.f56656s.add(c6076b);
        return c6076b;
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6077c, androidx.media3.exoplayer.source.r
    public void m() throws IOException {
        IllegalClippingException illegalClippingException = this.f56659v;
        if (illegalClippingException != null) {
            throw illegalClippingException;
        }
        super.m();
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6077c, androidx.media3.exoplayer.source.AbstractC6075a
    protected void A() {
        super.A();
        this.f56659v = null;
        this.f56658u = null;
    }
}
