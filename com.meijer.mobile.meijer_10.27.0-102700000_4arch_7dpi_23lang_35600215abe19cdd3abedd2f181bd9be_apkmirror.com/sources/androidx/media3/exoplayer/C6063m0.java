package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.C6076b;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import java.io.IOException;
import s3.AbstractC16852D;
import s3.C16853E;

/* renamed from: androidx.media3.exoplayer.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6063m0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.q f56331a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f56332b;

    /* renamed from: c, reason: collision with root package name */
    public final p3.r[] f56333c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56334d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f56335e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f56336f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f56337g;

    /* renamed from: h, reason: collision with root package name */
    public C6065n0 f56338h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f56339i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean[] f56340j;

    /* renamed from: k, reason: collision with root package name */
    private final I0[] f56341k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC16852D f56342l;

    /* renamed from: m, reason: collision with root package name */
    private final D0 f56343m;

    /* renamed from: n, reason: collision with root package name */
    private C6063m0 f56344n;

    /* renamed from: o, reason: collision with root package name */
    private p3.w f56345o;

    /* renamed from: p, reason: collision with root package name */
    private C16853E f56346p;

    /* renamed from: q, reason: collision with root package name */
    private long f56347q;

    /* renamed from: androidx.media3.exoplayer.m0$a */
    interface a {
        C6063m0 a(C6065n0 c6065n0, long j10);
    }

    private void c(p3.r[] rVarArr) {
        int i10 = 0;
        while (true) {
            I0[] i0Arr = this.f56341k;
            if (i10 >= i0Arr.length) {
                return;
            }
            if (i0Arr[i10].g() == -2 && this.f56346p.c(i10)) {
                rVarArr[i10] = new p3.h();
            }
            i10++;
        }
    }

    private void h(p3.r[] rVarArr) {
        int i10 = 0;
        while (true) {
            I0[] i0Arr = this.f56341k;
            if (i10 >= i0Arr.length) {
                return;
            }
            if (i0Arr[i10].g() == -2) {
                rVarArr[i10] = null;
            }
            i10++;
        }
    }

    public long b(C16853E c16853e, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c16853e.f159890a) {
                break;
            }
            boolean[] zArr2 = this.f56340j;
            if (z10 || !c16853e.b(this.f56346p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f56333c);
        g();
        this.f56346p = c16853e;
        i();
        long jI = this.f56331a.i(c16853e.f159892c, this.f56340j, this.f56333c, zArr, j10);
        c(this.f56333c);
        this.f56337g = false;
        int i11 = 0;
        while (true) {
            p3.r[] rVarArr = this.f56333c;
            if (i11 >= rVarArr.length) {
                return jI;
            }
            if (rVarArr[i11] != null) {
                C13466a.g(c16853e.c(i11));
                if (this.f56341k[i11].g() != -2) {
                    this.f56337g = true;
                }
            } else {
                C13466a.g(c16853e.f159892c[i11] == null);
            }
            i11++;
        }
    }

    public void q(float f10, a3.F f11, boolean z10) throws ExoPlaybackException {
        this.f56336f = true;
        this.f56345o = this.f56331a.r();
        C16853E c16853eZ = z(f10, f11, z10);
        C6065n0 c6065n0 = this.f56338h;
        long jMax = c6065n0.f56514b;
        long j10 = c6065n0.f56517e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(c16853eZ, jMax, false);
        long j11 = this.f56347q;
        C6065n0 c6065n02 = this.f56338h;
        this.f56347q = j11 + (c6065n02.f56514b - jA);
        this.f56338h = c6065n02.b(jA);
    }

    public void v(q.a aVar, long j10) {
        this.f56335e = true;
        this.f56331a.q(aVar, j10);
    }

    private boolean u() {
        return this.f56344n == null;
    }

    private static void y(D0 d02, androidx.media3.exoplayer.source.q qVar) {
        try {
            if (qVar instanceof C6076b) {
                d02.z(((C6076b) qVar).f56835a);
            } else {
                d02.z(qVar);
            }
        } catch (RuntimeException e10) {
            d3.r.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(C6063m0 c6063m0) {
        if (c6063m0 == this.f56344n) {
            return;
        }
        g();
        this.f56344n = c6063m0;
        i();
    }

    public void B(long j10) {
        this.f56347q = j10;
    }

    public void E() {
        androidx.media3.exoplayer.source.q qVar = this.f56331a;
        if (qVar instanceof C6076b) {
            long j10 = this.f56338h.f56516d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C6076b) qVar).v(0L, j10);
        }
    }

    public long a(C16853E c16853e, long j10, boolean z10) {
        return b(c16853e, j10, z10, new boolean[this.f56341k.length]);
    }

    public boolean d(C6065n0 c6065n0) {
        if (!C6069p0.e(this.f56338h.f56517e, c6065n0.f56517e)) {
            return false;
        }
        C6065n0 c6065n02 = this.f56338h;
        return c6065n02.f56514b == c6065n0.f56514b && c6065n02.f56513a.equals(c6065n0.f56513a);
    }

    public long j() {
        if (!this.f56336f) {
            return this.f56338h.f56514b;
        }
        long jD = this.f56337g ? this.f56331a.d() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f56338h.f56517e : jD;
    }

    public C6063m0 k() {
        return this.f56344n;
    }

    public long l() {
        if (this.f56336f) {
            return this.f56331a.c();
        }
        return 0L;
    }

    public long m() {
        return this.f56347q;
    }

    public long n() {
        return this.f56338h.f56514b + this.f56347q;
    }

    public p3.w o() {
        return this.f56345o;
    }

    public C16853E p() {
        return this.f56346p;
    }

    public boolean r() {
        try {
            if (this.f56336f) {
                for (p3.r rVar : this.f56333c) {
                    if (rVar != null) {
                        rVar.a();
                    }
                }
            } else {
                this.f56331a.n();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f56336f) {
            return !this.f56337g || this.f56331a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f56336f) {
            return s() || j() - this.f56338h.f56514b >= this.f56334d;
        }
        return false;
    }

    public C16853E z(float f10, a3.F f11, boolean z10) throws ExoPlaybackException {
        C16853E c16853eK = this.f56342l.k(this.f56341k, o(), this.f56338h.f56513a, f11);
        for (int i10 = 0; i10 < c16853eK.f159890a; i10++) {
            if (c16853eK.c(i10)) {
                if (c16853eK.f159892c[i10] == null && this.f56341k[i10].g() != -2) {
                    z = false;
                }
                C13466a.g(z);
            } else {
                C13466a.g(c16853eK.f159892c[i10] == null);
            }
        }
        for (s3.y yVar : c16853eK.f159892c) {
            if (yVar != null) {
                yVar.d(f10);
                yVar.h(z10);
            }
        }
        return c16853eK;
    }

    public C6063m0(I0[] i0Arr, long j10, AbstractC16852D abstractC16852D, t3.b bVar, D0 d02, C6065n0 c6065n0, C16853E c16853e, long j11) {
        this.f56341k = i0Arr;
        this.f56347q = j10;
        this.f56342l = abstractC16852D;
        this.f56343m = d02;
        r.b bVar2 = c6065n0.f56513a;
        this.f56332b = bVar2.f56933a;
        this.f56338h = c6065n0;
        this.f56334d = j11;
        this.f56345o = p3.w.f155473d;
        this.f56346p = c16853e;
        this.f56333c = new p3.r[i0Arr.length];
        this.f56340j = new boolean[i0Arr.length];
        this.f56331a = f(bVar2, d02, bVar, c6065n0.f56514b, c6065n0.f56516d, c6065n0.f56518f);
    }

    private static androidx.media3.exoplayer.source.q f(r.b bVar, D0 d02, t3.b bVar2, long j10, long j11, boolean z10) {
        androidx.media3.exoplayer.source.q qVarH = d02.h(bVar, bVar2, j10);
        if (j11 != -9223372036854775807L) {
            return new C6076b(qVarH, !z10, 0L, j11);
        }
        return qVarH;
    }

    private void g() {
        if (u()) {
            int i10 = 0;
            while (true) {
                C16853E c16853e = this.f56346p;
                if (i10 < c16853e.f159890a) {
                    boolean zC = c16853e.c(i10);
                    s3.y yVar = this.f56346p.f159892c[i10];
                    if (zC && yVar != null) {
                        yVar.disable();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    private void i() {
        if (u()) {
            int i10 = 0;
            while (true) {
                C16853E c16853e = this.f56346p;
                if (i10 < c16853e.f159890a) {
                    boolean zC = c16853e.c(i10);
                    s3.y yVar = this.f56346p.f159892c[i10];
                    if (zC && yVar != null) {
                        yVar.enable();
                    }
                    i10++;
                } else {
                    return;
                }
            }
        }
    }

    public long C(long j10) {
        return j10 - m();
    }

    public long D(long j10) {
        return j10 + m();
    }

    public void e(C6061l0 c6061l0) {
        C13466a.g(u());
        this.f56331a.b(c6061l0);
    }

    public void w(long j10) {
        C13466a.g(u());
        if (this.f56336f) {
            this.f56331a.e(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f56343m, this.f56331a);
    }
}
