package androidx.media3.exoplayer;

import a3.v;
import android.os.SystemClock;

/* renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6054i implements h3.H {

    /* renamed from: a, reason: collision with root package name */
    private final float f56169a;

    /* renamed from: b, reason: collision with root package name */
    private final float f56170b;

    /* renamed from: c, reason: collision with root package name */
    private final long f56171c;

    /* renamed from: d, reason: collision with root package name */
    private final float f56172d;

    /* renamed from: e, reason: collision with root package name */
    private final long f56173e;

    /* renamed from: f, reason: collision with root package name */
    private final long f56174f;

    /* renamed from: g, reason: collision with root package name */
    private final float f56175g;

    /* renamed from: h, reason: collision with root package name */
    private long f56176h;

    /* renamed from: i, reason: collision with root package name */
    private long f56177i;

    /* renamed from: j, reason: collision with root package name */
    private long f56178j;

    /* renamed from: k, reason: collision with root package name */
    private long f56179k;

    /* renamed from: l, reason: collision with root package name */
    private long f56180l;

    /* renamed from: m, reason: collision with root package name */
    private long f56181m;

    /* renamed from: n, reason: collision with root package name */
    private float f56182n;

    /* renamed from: o, reason: collision with root package name */
    private float f56183o;

    /* renamed from: p, reason: collision with root package name */
    private float f56184p;

    /* renamed from: q, reason: collision with root package name */
    private long f56185q;

    /* renamed from: r, reason: collision with root package name */
    private long f56186r;

    /* renamed from: s, reason: collision with root package name */
    private long f56187s;

    /* renamed from: androidx.media3.exoplayer.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f56188a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f56189b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f56190c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f56191d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f56192e = d3.P.M0(20);

        /* renamed from: f, reason: collision with root package name */
        private long f56193f = d3.P.M0(500);

        /* renamed from: g, reason: collision with root package name */
        private float f56194g = 0.999f;

        public C6054i a() {
            return new C6054i(this.f56188a, this.f56189b, this.f56190c, this.f56191d, this.f56192e, this.f56193f, this.f56194g);
        }
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f56186r;
        if (j13 == -9223372036854775807L) {
            this.f56186r = j12;
            this.f56187s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f56175g));
            this.f56186r = jMax;
            this.f56187s = h(this.f56187s, Math.abs(j12 - jMax), this.f56175g);
        }
    }

    private C6054i(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f56169a = f10;
        this.f56170b = f11;
        this.f56171c = j10;
        this.f56172d = f12;
        this.f56173e = j11;
        this.f56174f = j12;
        this.f56175g = f13;
        this.f56176h = -9223372036854775807L;
        this.f56177i = -9223372036854775807L;
        this.f56179k = -9223372036854775807L;
        this.f56180l = -9223372036854775807L;
        this.f56183o = f10;
        this.f56182n = f11;
        this.f56184p = 1.0f;
        this.f56185q = -9223372036854775807L;
        this.f56178j = -9223372036854775807L;
        this.f56181m = -9223372036854775807L;
        this.f56186r = -9223372036854775807L;
        this.f56187s = -9223372036854775807L;
    }

    private void f(long j10) {
        long j11 = this.f56186r + (this.f56187s * 3);
        if (this.f56181m > j11) {
            float fM0 = d3.P.M0(this.f56171c);
            this.f56181m = He.h.b(j11, this.f56178j, this.f56181m - (((long) ((this.f56184p - 1.0f) * fM0)) + ((long) ((this.f56182n - 1.0f) * fM0))));
            return;
        }
        long jP = d3.P.p(j10 - ((long) (Math.max(0.0f, this.f56184p - 1.0f) / this.f56172d)), this.f56181m, j11);
        this.f56181m = jP;
        long j12 = this.f56180l;
        if (j12 == -9223372036854775807L || jP <= j12) {
            return;
        }
        this.f56181m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f56176h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f56177i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f56179k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f56180l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f56178j == j10) {
            return;
        }
        this.f56178j = j10;
        this.f56181m = j10;
        this.f56186r = -9223372036854775807L;
        this.f56187s = -9223372036854775807L;
        this.f56185q = -9223372036854775807L;
    }

    @Override // h3.H
    public void a(v.g gVar) {
        this.f56176h = d3.P.M0(gVar.f44092a);
        this.f56179k = d3.P.M0(gVar.f44093b);
        this.f56180l = d3.P.M0(gVar.f44094c);
        float f10 = gVar.f44095d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f56169a;
        }
        this.f56183o = f10;
        float f11 = gVar.f44096e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f56170b;
        }
        this.f56182n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f56176h = -9223372036854775807L;
        }
        g();
    }

    @Override // h3.H
    public float b(long j10, long j11) {
        if (this.f56176h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f56185q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f56185q < this.f56171c) {
            return this.f56184p;
        }
        this.f56185q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f56181m;
        if (Math.abs(j12) < this.f56173e) {
            this.f56184p = 1.0f;
        } else {
            this.f56184p = d3.P.n((this.f56172d * j12) + 1.0f, this.f56183o, this.f56182n);
        }
        return this.f56184p;
    }

    @Override // h3.H
    public long c() {
        return this.f56181m;
    }

    @Override // h3.H
    public void d() {
        long j10 = this.f56181m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f56174f;
        this.f56181m = j11;
        long j12 = this.f56180l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f56181m = j12;
        }
        this.f56185q = -9223372036854775807L;
    }

    @Override // h3.H
    public void e(long j10) {
        this.f56177i = j10;
        g();
    }
}
