package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.C6218b;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import java.io.IOException;
import s3.AbstractC16998D;
import s3.C16999E;

/* renamed from: androidx.media3.exoplayer.m0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6205m0 {

    /* renamed from: a, reason: collision with root package name */
    public final androidx.media3.exoplayer.source.q f56555a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f56556b;

    /* renamed from: c, reason: collision with root package name */
    public final p3.r[] f56557c;

    /* renamed from: d, reason: collision with root package name */
    public final long f56558d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f56559e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f56560f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f56561g;

    /* renamed from: h, reason: collision with root package name */
    public C6207n0 f56562h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f56563i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean[] f56564j;

    /* renamed from: k, reason: collision with root package name */
    private final I0[] f56565k;

    /* renamed from: l, reason: collision with root package name */
    private final AbstractC16998D f56566l;

    /* renamed from: m, reason: collision with root package name */
    private final D0 f56567m;

    /* renamed from: n, reason: collision with root package name */
    private C6205m0 f56568n;

    /* renamed from: o, reason: collision with root package name */
    private p3.w f56569o;

    /* renamed from: p, reason: collision with root package name */
    private C16999E f56570p;

    /* renamed from: q, reason: collision with root package name */
    private long f56571q;

    /* renamed from: androidx.media3.exoplayer.m0$a */
    interface a {
        C6205m0 a(C6207n0 c6207n0, long j10);
    }

    private void c(p3.r[] rVarArr) {
        int i10 = 0;
        while (true) {
            I0[] i0Arr = this.f56565k;
            if (i10 >= i0Arr.length) {
                return;
            }
            if (i0Arr[i10].g() == -2 && this.f56570p.c(i10)) {
                rVarArr[i10] = new p3.h();
            }
            i10++;
        }
    }

    private void h(p3.r[] rVarArr) {
        int i10 = 0;
        while (true) {
            I0[] i0Arr = this.f56565k;
            if (i10 >= i0Arr.length) {
                return;
            }
            if (i0Arr[i10].g() == -2) {
                rVarArr[i10] = null;
            }
            i10++;
        }
    }

    public long b(C16999E c16999e, long j10, boolean z10, boolean[] zArr) {
        int i10 = 0;
        while (true) {
            boolean z11 = true;
            if (i10 >= c16999e.f159753a) {
                break;
            }
            boolean[] zArr2 = this.f56564j;
            if (z10 || !c16999e.b(this.f56570p, i10)) {
                z11 = false;
            }
            zArr2[i10] = z11;
            i10++;
        }
        h(this.f56557c);
        g();
        this.f56570p = c16999e;
        i();
        long jI = this.f56555a.i(c16999e.f159755c, this.f56564j, this.f56557c, zArr, j10);
        c(this.f56557c);
        this.f56561g = false;
        int i11 = 0;
        while (true) {
            p3.r[] rVarArr = this.f56557c;
            if (i11 >= rVarArr.length) {
                return jI;
            }
            if (rVarArr[i11] != null) {
                C13599a.g(c16999e.c(i11));
                if (this.f56565k[i11].g() != -2) {
                    this.f56561g = true;
                }
            } else {
                C13599a.g(c16999e.f159755c[i11] == null);
            }
            i11++;
        }
    }

    public void q(float f10, a3.F f11, boolean z10) throws ExoPlaybackException {
        this.f56560f = true;
        this.f56569o = this.f56555a.r();
        C16999E c16999eZ = z(f10, f11, z10);
        C6207n0 c6207n0 = this.f56562h;
        long jMax = c6207n0.f56738b;
        long j10 = c6207n0.f56741e;
        if (j10 != -9223372036854775807L && jMax >= j10) {
            jMax = Math.max(0L, j10 - 1);
        }
        long jA = a(c16999eZ, jMax, false);
        long j11 = this.f56571q;
        C6207n0 c6207n02 = this.f56562h;
        this.f56571q = j11 + (c6207n02.f56738b - jA);
        this.f56562h = c6207n02.b(jA);
    }

    public void v(q.a aVar, long j10) {
        this.f56559e = true;
        this.f56555a.q(aVar, j10);
    }

    private boolean u() {
        return this.f56568n == null;
    }

    private static void y(D0 d02, androidx.media3.exoplayer.source.q qVar) {
        try {
            if (qVar instanceof C6218b) {
                d02.z(((C6218b) qVar).f57059a);
            } else {
                d02.z(qVar);
            }
        } catch (RuntimeException e10) {
            d3.r.e("MediaPeriodHolder", "Period release failed.", e10);
        }
    }

    public void A(C6205m0 c6205m0) {
        if (c6205m0 == this.f56568n) {
            return;
        }
        g();
        this.f56568n = c6205m0;
        i();
    }

    public void B(long j10) {
        this.f56571q = j10;
    }

    public void E() {
        androidx.media3.exoplayer.source.q qVar = this.f56555a;
        if (qVar instanceof C6218b) {
            long j10 = this.f56562h.f56740d;
            if (j10 == -9223372036854775807L) {
                j10 = Long.MIN_VALUE;
            }
            ((C6218b) qVar).v(0L, j10);
        }
    }

    public long a(C16999E c16999e, long j10, boolean z10) {
        return b(c16999e, j10, z10, new boolean[this.f56565k.length]);
    }

    public boolean d(C6207n0 c6207n0) {
        if (!C6211p0.e(this.f56562h.f56741e, c6207n0.f56741e)) {
            return false;
        }
        C6207n0 c6207n02 = this.f56562h;
        return c6207n02.f56738b == c6207n0.f56738b && c6207n02.f56737a.equals(c6207n0.f56737a);
    }

    public long j() {
        if (!this.f56560f) {
            return this.f56562h.f56738b;
        }
        long jD = this.f56561g ? this.f56555a.d() : Long.MIN_VALUE;
        return jD == Long.MIN_VALUE ? this.f56562h.f56741e : jD;
    }

    public C6205m0 k() {
        return this.f56568n;
    }

    public long l() {
        if (this.f56560f) {
            return this.f56555a.c();
        }
        return 0L;
    }

    public long m() {
        return this.f56571q;
    }

    public long n() {
        return this.f56562h.f56738b + this.f56571q;
    }

    public p3.w o() {
        return this.f56569o;
    }

    public C16999E p() {
        return this.f56570p;
    }

    public boolean r() {
        try {
            if (this.f56560f) {
                for (p3.r rVar : this.f56557c) {
                    if (rVar != null) {
                        rVar.a();
                    }
                }
            } else {
                this.f56555a.n();
            }
            return false;
        } catch (IOException unused) {
            return true;
        }
    }

    public boolean s() {
        if (this.f56560f) {
            return !this.f56561g || this.f56555a.d() == Long.MIN_VALUE;
        }
        return false;
    }

    public boolean t() {
        if (this.f56560f) {
            return s() || j() - this.f56562h.f56738b >= this.f56558d;
        }
        return false;
    }

    public C16999E z(float f10, a3.F f11, boolean z10) throws ExoPlaybackException {
        C16999E c16999eK = this.f56566l.k(this.f56565k, o(), this.f56562h.f56737a, f11);
        for (int i10 = 0; i10 < c16999eK.f159753a; i10++) {
            if (c16999eK.c(i10)) {
                if (c16999eK.f159755c[i10] == null && this.f56565k[i10].g() != -2) {
                    z = false;
                }
                C13599a.g(z);
            } else {
                C13599a.g(c16999eK.f159755c[i10] == null);
            }
        }
        for (s3.y yVar : c16999eK.f159755c) {
            if (yVar != null) {
                yVar.d(f10);
                yVar.h(z10);
            }
        }
        return c16999eK;
    }

    public C6205m0(I0[] i0Arr, long j10, AbstractC16998D abstractC16998D, t3.b bVar, D0 d02, C6207n0 c6207n0, C16999E c16999e, long j11) {
        this.f56565k = i0Arr;
        this.f56571q = j10;
        this.f56566l = abstractC16998D;
        this.f56567m = d02;
        r.b bVar2 = c6207n0.f56737a;
        this.f56556b = bVar2.f57157a;
        this.f56562h = c6207n0;
        this.f56558d = j11;
        this.f56569o = p3.w.f156147d;
        this.f56570p = c16999e;
        this.f56557c = new p3.r[i0Arr.length];
        this.f56564j = new boolean[i0Arr.length];
        this.f56555a = f(bVar2, d02, bVar, c6207n0.f56738b, c6207n0.f56740d, c6207n0.f56742f);
    }

    private static androidx.media3.exoplayer.source.q f(r.b bVar, D0 d02, t3.b bVar2, long j10, long j11, boolean z10) {
        androidx.media3.exoplayer.source.q qVarH = d02.h(bVar, bVar2, j10);
        if (j11 != -9223372036854775807L) {
            return new C6218b(qVarH, !z10, 0L, j11);
        }
        return qVarH;
    }

    private void g() {
        if (u()) {
            int i10 = 0;
            while (true) {
                C16999E c16999e = this.f56570p;
                if (i10 < c16999e.f159753a) {
                    boolean zC = c16999e.c(i10);
                    s3.y yVar = this.f56570p.f159755c[i10];
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
                C16999E c16999e = this.f56570p;
                if (i10 < c16999e.f159753a) {
                    boolean zC = c16999e.c(i10);
                    s3.y yVar = this.f56570p.f159755c[i10];
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

    public void e(C6203l0 c6203l0) {
        C13599a.g(u());
        this.f56555a.b(c6203l0);
    }

    public void w(long j10) {
        C13599a.g(u());
        if (this.f56560f) {
            this.f56555a.e(C(j10));
        }
    }

    public void x() {
        g();
        y(this.f56567m, this.f56555a);
    }
}
