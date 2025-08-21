package androidx.media3.exoplayer.audio;

import android.media.AudioTrack;
import d3.C13599a;
import d3.InterfaceC13606h;
import d3.P;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
final class g {

    /* renamed from: A, reason: collision with root package name */
    private long f56152A;

    /* renamed from: B, reason: collision with root package name */
    private long f56153B;

    /* renamed from: C, reason: collision with root package name */
    private long f56154C;

    /* renamed from: D, reason: collision with root package name */
    private long f56155D;

    /* renamed from: E, reason: collision with root package name */
    private boolean f56156E;

    /* renamed from: F, reason: collision with root package name */
    private long f56157F;

    /* renamed from: G, reason: collision with root package name */
    private long f56158G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f56159H;

    /* renamed from: I, reason: collision with root package name */
    private long f56160I;

    /* renamed from: J, reason: collision with root package name */
    private InterfaceC13606h f56161J;

    /* renamed from: a, reason: collision with root package name */
    private final a f56162a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f56163b;

    /* renamed from: c, reason: collision with root package name */
    private AudioTrack f56164c;

    /* renamed from: d, reason: collision with root package name */
    private int f56165d;

    /* renamed from: e, reason: collision with root package name */
    private int f56166e;

    /* renamed from: f, reason: collision with root package name */
    private f f56167f;

    /* renamed from: g, reason: collision with root package name */
    private int f56168g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f56169h;

    /* renamed from: i, reason: collision with root package name */
    private long f56170i;

    /* renamed from: j, reason: collision with root package name */
    private float f56171j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f56172k;

    /* renamed from: l, reason: collision with root package name */
    private long f56173l;

    /* renamed from: m, reason: collision with root package name */
    private long f56174m;

    /* renamed from: n, reason: collision with root package name */
    private Method f56175n;

    /* renamed from: o, reason: collision with root package name */
    private long f56176o;

    /* renamed from: p, reason: collision with root package name */
    private boolean f56177p;

    /* renamed from: q, reason: collision with root package name */
    private boolean f56178q;

    /* renamed from: r, reason: collision with root package name */
    private long f56179r;

    /* renamed from: s, reason: collision with root package name */
    private long f56180s;

    /* renamed from: t, reason: collision with root package name */
    private long f56181t;

    /* renamed from: u, reason: collision with root package name */
    private long f56182u;

    /* renamed from: v, reason: collision with root package name */
    private long f56183v;

    /* renamed from: w, reason: collision with root package name */
    private int f56184w;

    /* renamed from: x, reason: collision with root package name */
    private int f56185x;

    /* renamed from: y, reason: collision with root package name */
    private long f56186y;

    /* renamed from: z, reason: collision with root package name */
    private long f56187z;

    public interface a {
        void a(int i10, long j10);

        void b(long j10);

        void c(long j10, long j11, long j12, long j13);

        void d(long j10, long j11, long j12, long j13);

        void e(long j10);
    }

    public void a() {
        this.f56159H = true;
        f fVar = this.f56167f;
        if (fVar != null) {
            fVar.b();
        }
    }

    private boolean b() {
        return this.f56169h && ((AudioTrack) C13599a.e(this.f56164c)).getPlayState() == 2 && d() == 0;
    }

    private long d() {
        if (this.f56186y != -9223372036854775807L) {
            return Math.min(this.f56153B, f());
        }
        long jC = this.f56161J.c();
        if (jC - this.f56180s >= 5) {
            w(jC);
            this.f56180s = jC;
        }
        return this.f56181t + this.f56160I + (this.f56182u << 32);
    }

    private long f() {
        if (((AudioTrack) C13599a.e(this.f56164c)).getPlayState() == 2) {
            return this.f56152A;
        }
        return this.f56152A + P.E(P.c0(P.M0(this.f56161J.c()) - this.f56186y, this.f56171j), this.f56168g);
    }

    private void l(long j10) {
        f fVar = (f) C13599a.e(this.f56167f);
        if (fVar.f(j10)) {
            long jD = fVar.d();
            long jC = fVar.c();
            long jE = e();
            if (Math.abs(jD - j10) > 5000000) {
                this.f56162a.d(jC, jD, j10, jE);
                fVar.g();
            } else if (Math.abs(P.U0(jC, this.f56168g) - jE) <= 5000000) {
                fVar.a();
            } else {
                this.f56162a.c(jC, jD, j10, jE);
                fVar.g();
            }
        }
    }

    private void m() {
        long jB = this.f56161J.b() / 1000;
        if (jB - this.f56174m >= 30000) {
            long jE = e();
            if (jE != 0) {
                this.f56163b[this.f56184w] = P.h0(jE, this.f56171j) - jB;
                this.f56184w = (this.f56184w + 1) % 10;
                int i10 = this.f56185x;
                if (i10 < 10) {
                    this.f56185x = i10 + 1;
                }
                this.f56174m = jB;
                this.f56173l = 0L;
                int i11 = 0;
                while (true) {
                    int i12 = this.f56185x;
                    if (i11 >= i12) {
                        break;
                    }
                    this.f56173l += this.f56163b[i11] / i12;
                    i11++;
                }
            } else {
                return;
            }
        }
        if (this.f56169h) {
            return;
        }
        l(jB);
        n(jB);
    }

    private void n(long j10) {
        Method method;
        if (!this.f56178q || (method = this.f56175n) == null || j10 - this.f56179r < 500000) {
            return;
        }
        try {
            long jIntValue = (((Integer) P.h((Integer) method.invoke(C13599a.e(this.f56164c), null))).intValue() * 1000) - this.f56170i;
            this.f56176o = jIntValue;
            long jMax = Math.max(jIntValue, 0L);
            this.f56176o = jMax;
            if (jMax > 5000000) {
                this.f56162a.b(jMax);
                this.f56176o = 0L;
            }
        } catch (Exception unused) {
            this.f56175n = null;
        }
        this.f56179r = j10;
    }

    private static boolean o(int i10) {
        if (P.f127888a < 23) {
            return i10 == 5 || i10 == 6;
        }
        return false;
    }

    private void r() {
        this.f56173l = 0L;
        this.f56185x = 0;
        this.f56184w = 0;
        this.f56174m = 0L;
        this.f56155D = 0L;
        this.f56158G = 0L;
        this.f56172k = false;
    }

    private void w(long j10) {
        int playState = ((AudioTrack) C13599a.e(this.f56164c)).getPlayState();
        if (playState == 1) {
            return;
        }
        long playbackHeadPosition = r0.getPlaybackHeadPosition() & 4294967295L;
        if (this.f56169h) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f56183v = this.f56181t;
            }
            playbackHeadPosition += this.f56183v;
        }
        if (P.f127888a <= 29) {
            if (playbackHeadPosition == 0 && this.f56181t > 0 && playState == 3) {
                if (this.f56187z == -9223372036854775807L) {
                    this.f56187z = j10;
                    return;
                }
                return;
            }
            this.f56187z = -9223372036854775807L;
        }
        long j11 = this.f56181t;
        if (j11 > playbackHeadPosition) {
            if (this.f56159H) {
                this.f56160I += j11;
                this.f56159H = false;
            } else {
                this.f56182u++;
            }
        }
        this.f56181t = playbackHeadPosition;
    }

    public long c() {
        long jMin;
        AudioTrack audioTrack = (AudioTrack) C13599a.e(this.f56164c);
        if (audioTrack.getPlayState() == 3) {
            m();
        }
        long jB = this.f56161J.b() / 1000;
        f fVar = (f) C13599a.e(this.f56167f);
        boolean zE = fVar.e();
        if (zE) {
            jMin = P.U0(fVar.c(), this.f56168g) + P.c0(jB - fVar.d(), this.f56171j);
        } else {
            long jMax = Math.max(0L, (this.f56185x == 0 ? this.f56186y != -9223372036854775807L ? P.U0(f(), this.f56168g) : e() : P.c0(this.f56173l + jB, this.f56171j)) - this.f56176o);
            jMin = this.f56186y != -9223372036854775807L ? Math.min(P.U0(this.f56153B, this.f56168g), jMax) : jMax;
        }
        if (this.f56156E != zE) {
            this.f56158G = this.f56155D;
            this.f56157F = this.f56154C;
        }
        long j10 = jB - this.f56158G;
        if (j10 < 1000000) {
            long jC0 = this.f56157F + P.c0(j10, this.f56171j);
            long j11 = (j10 * 1000) / 1000000;
            jMin = ((jMin * j11) + ((1000 - j11) * jC0)) / 1000;
        }
        if (!this.f56172k && jMin > this.f56154C && audioTrack.getPlayState() == 3) {
            this.f56172k = true;
            this.f56162a.e(this.f56161J.a() - P.j1(P.h0(P.j1(jMin - this.f56154C), this.f56171j)));
        }
        this.f56155D = jB;
        this.f56154C = jMin;
        this.f56156E = zE;
        return jMin;
    }

    public boolean i() {
        return ((AudioTrack) C13599a.e(this.f56164c)).getPlayState() == 3;
    }

    public boolean j(long j10) {
        return this.f56187z != -9223372036854775807L && j10 > 0 && this.f56161J.c() - this.f56187z >= 200;
    }

    public boolean k(long j10) {
        int playState = ((AudioTrack) C13599a.e(this.f56164c)).getPlayState();
        if (this.f56169h) {
            if (playState == 2) {
                this.f56177p = false;
                return false;
            }
            if (playState == 1 && d() == 0) {
                return false;
            }
        }
        boolean z10 = this.f56177p;
        boolean zH = h(j10);
        this.f56177p = zH;
        if (z10 && !zH && playState != 1) {
            this.f56162a.a(this.f56166e, P.j1(this.f56170i));
        }
        return true;
    }

    public void s(AudioTrack audioTrack, boolean z10, int i10, int i11, int i12) {
        this.f56164c = audioTrack;
        this.f56165d = i11;
        this.f56166e = i12;
        this.f56167f = new f(audioTrack);
        this.f56168g = audioTrack.getSampleRate();
        this.f56169h = z10 && o(i10);
        boolean zC0 = P.C0(i10);
        this.f56178q = zC0;
        this.f56170i = zC0 ? P.U0(i12 / i11, this.f56168g) : -9223372036854775807L;
        this.f56181t = 0L;
        this.f56182u = 0L;
        this.f56159H = false;
        this.f56160I = 0L;
        this.f56183v = 0L;
        this.f56177p = false;
        this.f56186y = -9223372036854775807L;
        this.f56187z = -9223372036854775807L;
        this.f56179r = 0L;
        this.f56176o = 0L;
        this.f56171j = 1.0f;
    }

    public void t(float f10) {
        this.f56171j = f10;
        f fVar = this.f56167f;
        if (fVar != null) {
            fVar.h();
        }
        r();
    }

    public void u(InterfaceC13606h interfaceC13606h) {
        this.f56161J = interfaceC13606h;
    }

    public void v() {
        if (this.f56186y != -9223372036854775807L) {
            this.f56186y = P.M0(this.f56161J.c());
        }
        ((f) C13599a.e(this.f56167f)).h();
    }

    public g(a aVar) {
        this.f56162a = (a) C13599a.e(aVar);
        try {
            this.f56175n = AudioTrack.class.getMethod("getLatency", null);
        } catch (NoSuchMethodException unused) {
        }
        this.f56163b = new long[10];
        this.f56161J = InterfaceC13606h.f127918a;
    }

    private long e() {
        return P.U0(d(), this.f56168g);
    }

    public void g(long j10) {
        this.f56152A = d();
        this.f56186y = P.M0(this.f56161J.c());
        this.f56153B = j10;
    }

    public boolean h(long j10) {
        if (j10 <= P.E(c(), this.f56168g) && !b()) {
            return false;
        }
        return true;
    }

    public boolean p() {
        r();
        if (this.f56186y == -9223372036854775807L) {
            ((f) C13599a.e(this.f56167f)).h();
            return true;
        }
        this.f56152A = d();
        return false;
    }

    public void q() {
        r();
        this.f56164c = null;
        this.f56167f = null;
    }
}
