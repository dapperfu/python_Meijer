package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import d3.C13466a;
import d3.InterfaceC13473h;
import d3.P;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class g {

    /* renamed from: A, reason: collision with root package name */
    private long f55928A;

    /* renamed from: B, reason: collision with root package name */
    private long f55929B;

    /* renamed from: C, reason: collision with root package name */
    private long f55930C;

    /* renamed from: D, reason: collision with root package name */
    private long f55931D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f55932E;

    /* renamed from: F, reason: collision with root package name */
    private long f55933F;

    /* renamed from: G, reason: collision with root package name */
    private long f55934G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f55935H;

    /* renamed from: I, reason: collision with root package name */
    private long f55936I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC13473h f55937J;

    /* renamed from: a, reason: collision with root package name */
    private final a f55938a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f55939b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f55940c;

    /* renamed from: d, reason: collision with root package name */
    private int f55941d;

    /* renamed from: e, reason: collision with root package name */
    private int f55942e;

    /* renamed from: f, reason: collision with root package name */
    private f f55943f;

    /* renamed from: g, reason: collision with root package name */
    private int f55944g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f55945h;

    /* renamed from: i, reason: collision with root package name */
    private long f55946i;

    /* renamed from: j, reason: collision with root package name */
    private float f55947j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f55948k;

    /* renamed from: l, reason: collision with root package name */
    private long f55949l;

    /* renamed from: m, reason: collision with root package name */
    private long f55950m;

    /* renamed from: n, reason: collision with root package name */
    private Method f55951n;

    /* renamed from: o, reason: collision with root package name */
    private long f55952o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f55953p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f55954q;

    /* renamed from: r, reason: collision with root package name */
    private long f55955r;

    /* renamed from: s, reason: collision with root package name */
    private long f55956s;

    /* renamed from: t, reason: collision with root package name */
    private long f55957t;

    /* renamed from: u, reason: collision with root package name */
    private long f55958u;

    /* renamed from: v, reason: collision with root package name */
    private long f55959v;

    /* renamed from: w, reason: collision with root package name */
    private int f55960w;

    /* renamed from: x, reason: collision with root package name */
    private int f55961x;

    /* renamed from: y, reason: collision with root package name */
    private long f55962y;

    /* renamed from: z, reason: collision with root package name */
    private long f55963z;

    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10);
    }

    public void a() {
        this.f55935H = true;
        f fVar = this.f55943f;
        if (fVar != null) {
            fVar.b();
        }
    }

    private boolean b() {
        return this.f55945h && ((AudioTrack) C13466a.e(this.f55940c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.f55962y != -9223372036854775807L) {
            return Math.min(this.f55929B, f());
        }
        long jC = this.f55937J.c();
        if (jC - this.f55956s >= 5) {
            w(jC);
            this.f55956s = jC;
        }
        return this.f55957t + this.f55936I + (this.f55958u << 32);
    }

    private long f() {
        if (((AudioTrack) C13466a.e(this.f55940c)).getPlayState() == 2) {
            return this.f55928A;
        }
        return this.f55928A + P.E(P.c0(P.M0(this.f55937J.c()) - this.f55962y, this.f55947j), this.f55944g);
    }

    private void l(long j10) {
        f fVar = (f) C13466a.e(this.f55943f);
        if (fVar.f(j10)) {
            long jD = fVar.d();
            long jC = fVar.c();
            long jE = e();
            if (Math.abs(jD - j10) > 5000000) {
                this.f55938a.d(jC, jD, j10, jE);
                fVar.g();
            } else if (Math.abs(P.U0(jC, this.f55944g) - jE) <= 5000000) {
                fVar.a();
            } else {
                this.f55938a.c(jC, jD, j10, jE);
                fVar.g();
            }
        }
    }

    private void m() {
        long jB = this.f55937J.b() / 1000;
        if (jB - this.f55950m >= 30000) {
            long jE = e();
            if (jE != 0) {
                this.f55939b[this.f55960w] = P.h0(jE, this.f55947j) - jB;
                this.f55960w = (this.f55960w + 1) % 10;
                int i10 = this.f55961x;
                if (i10 < 10) {
                    this.f55961x = i10 + 1;
                }
                this.f55950m = jB;
                this.f55949l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f55961x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f55949l += this.f55939b[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f55945h) {
            return;
        }
        l(jB);
        n(jB);
    }

    private void n(long j10) {
        Method method;
        if (!this.f55954q || (method = this.f55951n) == null || j10 - this.f55955r < 500000) {
            return;
        }
        try {
            long jIntValue = (((Integer) P.h((Integer) method.invoke(C13466a.e(this.f55940c), null))).intValue() * 1000) - this.f55946i;
            this.f55952o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f55952o = jMax;
            if (jMax > 5000000) {
                this.f55938a.b(jMax);
                this.f55952o = 0L;
            }
        } catch (Exception unused) {
            this.f55951n = null;
        }
        this.f55955r = j10;
    }

    private static boolean o(int i10) {
        if (P.f127086a < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }

    private void r() {
        this.f55949l = 0L;
        this.f55961x = 0;
        this.f55960w = 0;
        this.f55950m = 0L;
        this.f55931D = 0L;
        this.f55934G = 0L;
        this.f55948k = false;
    }

    private void w(long j10) {
        int playState = ((AudioTrack) C13466a.e(this.f55940c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.f55945h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f55959v = this.f55957t;
            }
            playbackHeadPosition += this.f55959v;
        }
        if (P.f127086a <= 29) {
            if (playbackHeadPosition == 0 && this.f55957t > 0 && playState == 3) {
                if (this.f55963z == -9223372036854775807L) {
                    this.f55963z = j10;
                    return;
                }
                return;
            }
            this.f55963z = -9223372036854775807L;
        }
        long j11 = this.f55957t;
        if (j11 > playbackHeadPosition) {
            if (this.f55935H) {
                this.f55936I += j11;
                this.f55935H = false;
            } else {
                this.f55958u++;
            }
        }
        this.f55957t = playbackHeadPosition;
    }

    public long c() {
        long jMin;
        AudioTrack audioTrack = (AudioTrack) C13466a.e(this.f55940c);
        if (audioTrack.getPlayState() == 3) {
            m();
        }
        long jB = this.f55937J.b() / 1000;
        f fVar = (f) C13466a.e(this.f55943f);
        boolean zE = fVar.e();
        if (zE) {
            jMin = P.U0(fVar.c(), this.f55944g) + P.c0(jB - fVar.d(), this.f55947j);
        } else {
            long jMax = Math.max(0L, (this.f55961x == 0 ? this.f55962y != -9223372036854775807L ? P.U0(f(), this.f55944g) : e() : P.c0(this.f55949l + jB, this.f55947j)) - this.f55952o);
            jMin = this.f55962y != -9223372036854775807L ? Math.min(P.U0(this.f55929B, this.f55944g), jMax) : jMax;
        }
        if (this.f55932E != zE) {
            this.f55934G = this.f55931D;
            this.f55933F = this.f55930C;
        }
        long j10 = jB - this.f55934G;
        if (j10 < 1000000) {
            long jC0 = this.f55933F + P.c0(j10, this.f55947j);
            long j11 = (j10 * 1000) / 1000000;
            jMin = ((jMin * j11) + ((1000 - j11) * jC0)) / 1000;
        }
        if (!this.f55948k && jMin > this.f55930C && audioTrack.getPlayState() == 3) {
            this.f55948k = true;
            this.f55938a.e(this.f55937J.a() - P.j1(P.h0(P.j1(jMin - this.f55930C), this.f55947j)));
        }
        this.f55931D = jB;
        this.f55930C = jMin;
        this.f55932E = zE;
        return jMin;
    }

    public boolean i() {
        return ((AudioTrack) C13466a.e(this.f55940c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f55963z != -9223372036854775807L && j10 > 0 && this.f55937J.c() - this.f55963z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) C13466a.e(this.f55940c)).getPlayState();
        if (this.f55945h) {
            if (playState == 2) {
                this.f55953p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z10 = this.f55953p;
        boolean zH = h(j10);
        this.f55953p = zH;
        if (z10 && !zH && playState != 1) {
            this.f55938a.a(this.f55942e, P.j1(this.f55946i));
        }
        return true;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f55940c = audioTrack;
        this.f55941d = i11;
        this.f55942e = i12;
        this.f55943f = new f(audioTrack);
        this.f55944g = audioTrack.getSampleRate();
        this.f55945h = z10 && o(i10);
        boolean zC0 = P.C0(i10);
        this.f55954q = zC0;
        this.f55946i = zC0 ? P.U0(i12 / i11, this.f55944g) : -9223372036854775807L;
        this.f55957t = 0L;
        this.f55958u = 0L;
        this.f55935H = false;
        this.f55936I = 0L;
        this.f55959v = 0L;
        this.f55953p = false;
        this.f55962y = -9223372036854775807L;
        this.f55963z = -9223372036854775807L;
        this.f55955r = 0L;
        this.f55952o = 0L;
        this.f55947j = 1.0f;
    }

    public void t(float f10) {
        this.f55947j = f10;
        f fVar = this.f55943f;
        if (fVar != null) {
            fVar.h();
        }
        r();
    }

    public void u(InterfaceC13473h interfaceC13473h) {
        this.f55937J = interfaceC13473h;
    }

    public void v() {
        if (this.f55962y != -9223372036854775807L) {
            this.f55962y = P.M0(this.f55937J.c());
        }
        ((f) C13466a.e(this.f55943f)).h();
    }

    public g(a aVar) {
        this.f55938a = (a) C13466a.e(aVar);
        try {
            this.f55951n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f55939b = new long[10];
        this.f55937J = InterfaceC13473h.f127116a;
    }

    private long e() {
        return P.U0(d(), this.f55944g);
    }

    public void g(long j10) {
        this.f55928A = d();
        this.f55962y = P.M0(this.f55937J.c());
        this.f55929B = j10;
    }

    public boolean h(long j10) {
        if (j10 <= P.E(c(), this.f55944g) && !b()) {
            return false;
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f55962y == -9223372036854775807L) {
            ((f) C13466a.e(this.f55943f)).h();
            return true;
        }
        this.f55928A = d();
        return false;
    }

    public void q() {
        r();
        this.f55940c = null;
        this.f55943f = null;
    }
}
