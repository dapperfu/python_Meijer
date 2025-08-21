package androidx.media3.exoplayer;

import a3.v;
import android.os.SystemClock;

/* renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6196i implements h3.H {

    /* renamed from: a, reason: collision with root package name */
    private final float f56393a;

    /* renamed from: b, reason: collision with root package name */
    private final float f56394b;

    /* renamed from: c, reason: collision with root package name */
    private final long f56395c;

    /* renamed from: d, reason: collision with root package name */
    private final float f56396d;

    /* renamed from: e, reason: collision with root package name */
    private final long f56397e;

    /* renamed from: f, reason: collision with root package name */
    private final long f56398f;

    /* renamed from: g, reason: collision with root package name */
    private final float f56399g;

    /* renamed from: h, reason: collision with root package name */
    private long f56400h;

    /* renamed from: i, reason: collision with root package name */
    private long f56401i;

    /* renamed from: j, reason: collision with root package name */
    private long f56402j;

    /* renamed from: k, reason: collision with root package name */
    private long f56403k;

    /* renamed from: l, reason: collision with root package name */
    private long f56404l;

    /* renamed from: m, reason: collision with root package name */
    private long f56405m;

    /* renamed from: n, reason: collision with root package name */
    private float f56406n;

    /* renamed from: o, reason: collision with root package name */
    private float f56407o;

    /* renamed from: p, reason: collision with root package name */
    private float f56408p;

    /* renamed from: q, reason: collision with root package name */
    private long f56409q;

    /* renamed from: r, reason: collision with root package name */
    private long f56410r;

    /* renamed from: s, reason: collision with root package name */
    private long f56411s;

    /* renamed from: androidx.media3.exoplayer.i$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private float f56412a = 0.97f;

        /* renamed from: b, reason: collision with root package name */
        private float f56413b = 1.03f;

        /* renamed from: c, reason: collision with root package name */
        private long f56414c = 1000;

        /* renamed from: d, reason: collision with root package name */
        private float f56415d = 1.0E-7f;

        /* renamed from: e, reason: collision with root package name */
        private long f56416e = d3.P.M0(20);

        /* renamed from: f, reason: collision with root package name */
        private long f56417f = d3.P.M0(500);

        /* renamed from: g, reason: collision with root package name */
        private float f56418g = 0.999f;

        public C6196i a() {
            return new C6196i(this.f56412a, this.f56413b, this.f56414c, this.f56415d, this.f56416e, this.f56417f, this.f56418g);
        }
    }

    private static long h(long j10, long j11, float f10) {
        return (long) ((j10 * f10) + ((1.0f - f10) * j11));
    }

    private void i(long j10, long j11) {
        long j12 = j10 - j11;
        long j13 = this.f56410r;
        if (j13 == -9223372036854775807L) {
            this.f56410r = j12;
            this.f56411s = 0L;
        } else {
            long jMax = Math.max(j12, h(j13, j12, this.f56399g));
            this.f56410r = jMax;
            this.f56411s = h(this.f56411s, Math.abs(j12 - jMax), this.f56399g);
        }
    }

    private C6196i(float f10, float f11, long j10, float f12, long j11, long j12, float f13) {
        this.f56393a = f10;
        this.f56394b = f11;
        this.f56395c = j10;
        this.f56396d = f12;
        this.f56397e = j11;
        this.f56398f = j12;
        this.f56399g = f13;
        this.f56400h = -9223372036854775807L;
        this.f56401i = -9223372036854775807L;
        this.f56403k = -9223372036854775807L;
        this.f56404l = -9223372036854775807L;
        this.f56407o = f10;
        this.f56406n = f11;
        this.f56408p = 1.0f;
        this.f56409q = -9223372036854775807L;
        this.f56402j = -9223372036854775807L;
        this.f56405m = -9223372036854775807L;
        this.f56410r = -9223372036854775807L;
        this.f56411s = -9223372036854775807L;
    }

    private void f(long j10) {
        long j11 = this.f56410r + (this.f56411s * 3);
        if (this.f56405m > j11) {
            float fM0 = d3.P.M0(this.f56395c);
            this.f56405m = Je.h.b(j11, this.f56402j, this.f56405m - (((long) ((this.f56408p - 1.0f) * fM0)) + ((long) ((this.f56406n - 1.0f) * fM0))));
            return;
        }
        long jP = d3.P.p(j10 - ((long) (Math.max(0.0f, this.f56408p - 1.0f) / this.f56396d)), this.f56405m, j11);
        this.f56405m = jP;
        long j12 = this.f56404l;
        if (j12 == -9223372036854775807L || jP <= j12) {
            return;
        }
        this.f56405m = j12;
    }

    private void g() {
        long j10;
        long j11 = this.f56400h;
        if (j11 != -9223372036854775807L) {
            j10 = this.f56401i;
            if (j10 == -9223372036854775807L) {
                long j12 = this.f56403k;
                if (j12 != -9223372036854775807L && j11 < j12) {
                    j11 = j12;
                }
                j10 = this.f56404l;
                if (j10 == -9223372036854775807L || j11 <= j10) {
                    j10 = j11;
                }
            }
        } else {
            j10 = -9223372036854775807L;
        }
        if (this.f56402j == j10) {
            return;
        }
        this.f56402j = j10;
        this.f56405m = j10;
        this.f56410r = -9223372036854775807L;
        this.f56411s = -9223372036854775807L;
        this.f56409q = -9223372036854775807L;
    }

    @Override // h3.H
    public void a(v.g gVar) {
        this.f56400h = d3.P.M0(gVar.f44910a);
        this.f56403k = d3.P.M0(gVar.f44911b);
        this.f56404l = d3.P.M0(gVar.f44912c);
        float f10 = gVar.f44913d;
        if (f10 == -3.4028235E38f) {
            f10 = this.f56393a;
        }
        this.f56407o = f10;
        float f11 = gVar.f44914e;
        if (f11 == -3.4028235E38f) {
            f11 = this.f56394b;
        }
        this.f56406n = f11;
        if (f10 == 1.0f && f11 == 1.0f) {
            this.f56400h = -9223372036854775807L;
        }
        g();
    }

    @Override // h3.H
    public float b(long j10, long j11) {
        if (this.f56400h == -9223372036854775807L) {
            return 1.0f;
        }
        i(j10, j11);
        if (this.f56409q != -9223372036854775807L && SystemClock.elapsedRealtime() - this.f56409q < this.f56395c) {
            return this.f56408p;
        }
        this.f56409q = SystemClock.elapsedRealtime();
        f(j10);
        long j12 = j10 - this.f56405m;
        if (Math.abs(j12) < this.f56397e) {
            this.f56408p = 1.0f;
        } else {
            this.f56408p = d3.P.n((this.f56396d * j12) + 1.0f, this.f56407o, this.f56406n);
        }
        return this.f56408p;
    }

    @Override // h3.H
    public long c() {
        return this.f56405m;
    }

    @Override // h3.H
    public void d() {
        long j10 = this.f56405m;
        if (j10 == -9223372036854775807L) {
            return;
        }
        long j11 = j10 + this.f56398f;
        this.f56405m = j11;
        long j12 = this.f56404l;
        if (j12 != -9223372036854775807L && j11 > j12) {
            this.f56405m = j12;
        }
        this.f56409q = -9223372036854775807L;
    }

    @Override // h3.H
    public void e(long j10) {
        this.f56401i = j10;
        g();
    }
}
