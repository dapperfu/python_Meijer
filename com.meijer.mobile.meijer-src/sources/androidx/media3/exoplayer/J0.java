package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import java.io.IOException;
import java.util.Objects;
import r3.C16832i;
import s3.C16999E;

/* loaded from: classes.dex */
class J0 {

    /* renamed from: a, reason: collision with root package name */
    private final H0 f55830a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55831b;

    /* renamed from: c, reason: collision with root package name */
    private final H0 f55832c;

    /* renamed from: d, reason: collision with root package name */
    private int f55833d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f55834e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f55835f = false;

    private void E(boolean z10) {
        if (z10) {
            if (this.f55834e) {
                this.f55830a.reset();
                this.f55834e = false;
                return;
            }
            return;
        }
        if (this.f55835f) {
            ((H0) C13599a.e(this.f55832c)).reset();
            this.f55835f = false;
        }
    }

    private int K(H0 h02, C6205m0 c6205m0, C16999E c16999e, C6200k c6200k) throws ExoPlaybackException {
        if (h02 == null || !y(h02) || ((h02 == this.f55830a && v()) || (h02 == this.f55832c && A()))) {
            return 1;
        }
        p3.r rVarI = h02.i();
        p3.r[] rVarArr = c6205m0.f56557c;
        int i10 = this.f55831b;
        boolean z10 = rVarI != rVarArr[i10];
        boolean zC = c16999e.c(i10);
        if (zC && !z10) {
            return 1;
        }
        if (!h02.B()) {
            h02.L(i(c16999e.f159755c[this.f55831b]), (p3.r) C13599a.e(c6205m0.f56557c[this.f55831b]), c6205m0.n(), c6205m0.m(), c6205m0.f56562h.f56737a);
            return 3;
        }
        if (!h02.c()) {
            return 0;
        }
        d(h02, c6200k);
        if (!zC || u()) {
            E(h02 == this.f55830a);
        }
        return 1;
    }

    private static a3.t[] i(s3.y yVar) {
        int length = yVar != null ? yVar.length() : 0;
        a3.t[] tVarArr = new a3.t[length];
        for (int i10 = 0; i10 < length; i10++) {
            tVarArr[i10] = ((s3.y) C13599a.e(yVar)).a(i10);
        }
        return tVarArr;
    }

    private H0 l(C6205m0 c6205m0) {
        if (c6205m0 != null && c6205m0.f56557c[this.f55831b] != null) {
            if (this.f55830a.i() == c6205m0.f56557c[this.f55831b]) {
                return this.f55830a;
            }
            H0 h02 = this.f55832c;
            if (h02 != null && h02.i() == c6205m0.f56557c[this.f55831b]) {
                return this.f55832c;
            }
        }
        return null;
    }

    private boolean p(C6205m0 c6205m0, H0 h02) {
        if (h02 == null) {
            return true;
        }
        p3.r rVar = c6205m0.f56557c[this.f55831b];
        if (h02.i() == null || (h02.i() == rVar && (rVar == null || h02.m() || q(h02, c6205m0)))) {
            return true;
        }
        C6205m0 c6205m0K = c6205m0.k();
        return c6205m0K != null && c6205m0K.f56557c[this.f55831b] == h02.i();
    }

    private boolean A() {
        return this.f55833d == 3;
    }

    private void X(boolean z10) throws ExoPlaybackException {
        if (z10) {
            ((H0) C13599a.e(this.f55832c)).x(17, this.f55830a);
        } else {
            this.f55830a.x(17, C13599a.e(this.f55832c));
        }
    }

    private void d(H0 h02, C6200k c6200k) {
        C13599a.g(this.f55830a == h02 || this.f55832c == h02);
        if (y(h02)) {
            c6200k.a(h02);
            g(h02);
            h02.disable();
        }
    }

    private boolean v() {
        int i10 = this.f55833d;
        return i10 == 2 || i10 == 4;
    }

    public void B(p3.r rVar, C6200k c6200k, long j10, boolean z10) throws ExoPlaybackException {
        C(this.f55830a, rVar, c6200k, j10, z10);
        H0 h02 = this.f55832c;
        if (h02 != null) {
            C(h02, rVar, c6200k, j10, z10);
        }
    }

    public void D() throws ExoPlaybackException {
        int i10 = this.f55833d;
        if (i10 == 3 || i10 == 4) {
            X(i10 == 4);
            this.f55833d = this.f55833d != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.f55833d = 0;
        }
    }

    public void F(C16999E c16999e, C16999E c16999e2, long j10) {
        int i10;
        boolean zC = c16999e.c(this.f55831b);
        boolean zC2 = c16999e2.c(this.f55831b);
        H0 h02 = (this.f55832c == null || (i10 = this.f55833d) == 3 || (i10 == 0 && y(this.f55830a))) ? this.f55830a : (H0) C13599a.e(this.f55832c);
        if (!zC || h02.B()) {
            return;
        }
        boolean z10 = m() == -2;
        h3.K[] kArr = c16999e.f159754b;
        int i11 = this.f55831b;
        h3.K k10 = kArr[i11];
        h3.K k11 = c16999e2.f159754b[i11];
        if (!zC2 || !Objects.equals(k11, k10) || z10 || u()) {
            P(h02, j10);
        }
    }

    public void H() {
        this.f55830a.release();
        this.f55834e = false;
        H0 h02 = this.f55832c;
        if (h02 != null) {
            h02.release();
            this.f55835f = false;
        }
    }

    public void I(long j10, long j11) throws ExoPlaybackException {
        if (y(this.f55830a)) {
            this.f55830a.h(j10, j11);
        }
        H0 h02 = this.f55832c;
        if (h02 == null || !y(h02)) {
            return;
        }
        this.f55832c.h(j10, j11);
    }

    public int J(C6205m0 c6205m0, C16999E c16999e, C6200k c6200k) throws ExoPlaybackException {
        int iK = K(this.f55830a, c6205m0, c16999e, c6200k);
        return iK == 1 ? K(this.f55832c, c6205m0, c16999e, c6200k) : iK;
    }

    public void L() {
        if (!y(this.f55830a)) {
            E(true);
        }
        H0 h02 = this.f55832c;
        if (h02 == null || y(h02)) {
            return;
        }
        E(false);
    }

    public void N(long j10) {
        int i10;
        if (y(this.f55830a) && (i10 = this.f55833d) != 4 && i10 != 2) {
            P(this.f55830a, j10);
        }
        H0 h02 = this.f55832c;
        if (h02 == null || !y(h02) || this.f55833d == 3) {
            return;
        }
        P(this.f55832c, j10);
    }

    public void Q(float f10, float f11) throws ExoPlaybackException {
        this.f55830a.J(f10, f11);
        H0 h02 = this.f55832c;
        if (h02 != null) {
            h02.J(f10, f11);
        }
    }

    public void R(a3.F f10) {
        this.f55830a.k(f10);
        H0 h02 = this.f55832c;
        if (h02 != null) {
            h02.k(f10);
        }
    }

    public void U() throws ExoPlaybackException {
        if (this.f55830a.getState() == 1 && this.f55833d != 4) {
            this.f55830a.start();
            return;
        }
        H0 h02 = this.f55832c;
        if (h02 == null || h02.getState() != 1 || this.f55833d == 3) {
            return;
        }
        this.f55832c.start();
    }

    public void W() {
        if (y(this.f55830a)) {
            g(this.f55830a);
        }
        H0 h02 = this.f55832c;
        if (h02 == null || !y(h02)) {
            return;
        }
        g(this.f55832c);
    }

    public void b(C6200k c6200k) throws ExoPlaybackException {
        d(this.f55830a, c6200k);
        H0 h02 = this.f55832c;
        if (h02 != null) {
            boolean z10 = y(h02) && this.f55833d != 3;
            d(this.f55832c, c6200k);
            E(false);
            if (z10) {
                X(true);
            }
        }
        this.f55833d = 0;
    }

    public void e(h3.K k10, s3.y yVar, p3.r rVar, long j10, boolean z10, boolean z11, long j11, long j12, r.b bVar, C6200k c6200k) throws ExoPlaybackException {
        a3.t[] tVarArrI = i(yVar);
        int i10 = this.f55833d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.f55834e = true;
            this.f55830a.o(k10, tVarArrI, rVar, j10, z10, z11, j11, j12, bVar);
            c6200k.b(this.f55830a);
        } else {
            this.f55835f = true;
            ((H0) C13599a.e(this.f55832c)).o(k10, tVarArrI, rVar, j10, z10, z11, j11, j12, bVar);
            c6200k.b(this.f55832c);
        }
    }

    public void f() {
        if (y(this.f55830a)) {
            this.f55830a.e();
            return;
        }
        H0 h02 = this.f55832c;
        if (h02 == null || !y(h02)) {
            return;
        }
        this.f55832c.e();
    }

    public int h() {
        boolean zY = y(this.f55830a);
        H0 h02 = this.f55832c;
        return (zY ? 1 : 0) + ((h02 == null || !y(h02)) ? 0 : 1);
    }

    public long j(long j10, long j11) {
        long jE = y(this.f55830a) ? this.f55830a.E(j10, j11) : Long.MAX_VALUE;
        H0 h02 = this.f55832c;
        return (h02 == null || !y(h02)) ? jE : Math.min(jE, this.f55832c.E(j10, j11));
    }

    public int m() {
        return this.f55830a.g();
    }

    public boolean o(C6205m0 c6205m0) {
        return p(c6205m0, this.f55830a) && p(c6205m0, this.f55832c);
    }

    public boolean s() {
        return this.f55832c != null;
    }

    public boolean t() {
        boolean zC = y(this.f55830a) ? this.f55830a.c() : true;
        H0 h02 = this.f55832c;
        return (h02 == null || !y(h02)) ? zC : zC & this.f55832c.c();
    }

    public boolean x() {
        int i10 = this.f55833d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? y(this.f55830a) : y((H0) C13599a.e(this.f55832c));
    }

    public J0(H0 h02, H0 h03, int i10) {
        this.f55830a = h02;
        this.f55831b = i10;
        this.f55832c = h03;
    }

    private void C(H0 h02, p3.r rVar, C6200k c6200k, long j10, boolean z10) throws ExoPlaybackException {
        if (y(h02)) {
            if (rVar != h02.i()) {
                d(h02, c6200k);
            } else if (z10) {
                h02.O(j10);
            }
        }
    }

    private void P(H0 h02, long j10) {
        h02.q();
        if (h02 instanceof C16832i) {
            ((C16832i) h02).H0(j10);
        }
    }

    private void g(H0 h02) {
        if (h02.getState() == 2) {
            h02.stop();
        }
    }

    private boolean q(H0 h02, C6205m0 c6205m0) {
        C6205m0 c6205m0K = c6205m0.k();
        if (c6205m0.f56562h.f56743g && c6205m0K != null && c6205m0K.f56560f) {
            if ((h02 instanceof C16832i) || (h02 instanceof o3.c) || h02.N() >= c6205m0K.n()) {
                return true;
            }
            return false;
        }
        return false;
    }

    private static boolean y(H0 h02) {
        if (h02.getState() != 0) {
            return true;
        }
        return false;
    }

    public void G(C6205m0 c6205m0) throws IOException {
        ((H0) C13599a.e(l(c6205m0))).y();
    }

    public void M(C6205m0 c6205m0, long j10) throws ExoPlaybackException {
        H0 h0L = l(c6205m0);
        if (h0L != null) {
            h0L.O(j10);
        }
    }

    public void O(C6205m0 c6205m0, long j10) {
        P((H0) C13599a.e(l(c6205m0)), j10);
    }

    public void S(Object obj) throws ExoPlaybackException {
        if (m() != 2) {
            return;
        }
        int i10 = this.f55833d;
        if (i10 != 4 && i10 != 1) {
            this.f55830a.x(1, obj);
        } else {
            ((H0) C13599a.e(this.f55832c)).x(1, obj);
        }
    }

    public void T(float f10) throws ExoPlaybackException {
        if (m() == 1) {
            this.f55830a.x(2, Float.valueOf(f10));
            H0 h02 = this.f55832c;
            if (h02 != null) {
                h02.x(2, Float.valueOf(f10));
            }
        }
    }

    public void V() {
        int i10;
        C13599a.g(!u());
        if (y(this.f55830a)) {
            i10 = 3;
        } else {
            H0 h02 = this.f55832c;
            if (h02 != null && y(h02)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
        }
        this.f55833d = i10;
    }

    public boolean a(C6205m0 c6205m0) {
        H0 h0L = l(c6205m0);
        if (h0L != null && !h0L.m() && !h0L.b() && !h0L.c()) {
            return false;
        }
        return true;
    }

    public void c(C6200k c6200k) {
        boolean z10;
        H0 h02;
        if (!u()) {
            return;
        }
        int i10 = this.f55833d;
        int i11 = 1;
        if (i10 != 4 && i10 != 2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (i10 != 4) {
            i11 = 0;
        }
        if (z10) {
            h02 = this.f55830a;
        } else {
            h02 = (H0) C13599a.e(this.f55832c);
        }
        d(h02, c6200k);
        E(z10);
        this.f55833d = i11;
    }

    public long k(C6205m0 c6205m0) {
        H0 h0L = l(c6205m0);
        Objects.requireNonNull(h0L);
        return h0L.N();
    }

    public void n(int i10, Object obj, C6205m0 c6205m0) throws ExoPlaybackException {
        ((H0) C13599a.e(l(c6205m0))).x(i10, obj);
    }

    public boolean r(C6205m0 c6205m0) {
        return ((H0) C13599a.e(l(c6205m0))).m();
    }

    public boolean u() {
        if (!v() && !A()) {
            return false;
        }
        return true;
    }

    public boolean w(C6205m0 c6205m0) {
        if (l(c6205m0) != null) {
            return true;
        }
        return false;
    }

    public boolean z(int i10) {
        boolean z10;
        boolean z11;
        if (v() && i10 == this.f55831b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (A() && i10 != this.f55831b) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (!z10 && !z11) {
            return false;
        }
        return true;
    }
}
