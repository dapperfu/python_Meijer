package androidx.media3.exoplayer;

import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import java.io.IOException;
import java.util.Objects;
import r3.C16718i;
import s3.C16853E;

/* loaded from: classes.dex */
class J0 {

    /* renamed from: a, reason: collision with root package name */
    private final H0 f55606a;

    /* renamed from: b, reason: collision with root package name */
    private final int f55607b;

    /* renamed from: c, reason: collision with root package name */
    private final H0 f55608c;

    /* renamed from: d, reason: collision with root package name */
    private int f55609d = 0;

    /* renamed from: e, reason: collision with root package name */
    private boolean f55610e = false;

    /* renamed from: f, reason: collision with root package name */
    private boolean f55611f = false;

    private void E(boolean z10) {
        if (z10) {
            if (this.f55610e) {
                this.f55606a.reset();
                this.f55610e = false;
                return;
            }
            return;
        }
        if (this.f55611f) {
            ((H0) C13466a.e(this.f55608c)).reset();
            this.f55611f = false;
        }
    }

    private int K(H0 h02, C6063m0 c6063m0, C16853E c16853e, C6058k c6058k) throws ExoPlaybackException {
        if (h02 == null || !y(h02) || ((h02 == this.f55606a && v()) || (h02 == this.f55608c && A()))) {
            return 1;
        }
        p3.r rVarI = h02.i();
        p3.r[] rVarArr = c6063m0.f56333c;
        int i10 = this.f55607b;
        boolean z10 = rVarI != rVarArr[i10];
        boolean zC = c16853e.c(i10);
        if (zC && !z10) {
            return 1;
        }
        if (!h02.B()) {
            h02.L(i(c16853e.f159892c[this.f55607b]), (p3.r) C13466a.e(c6063m0.f56333c[this.f55607b]), c6063m0.n(), c6063m0.m(), c6063m0.f56338h.f56513a);
            return 3;
        }
        if (!h02.c()) {
            return 0;
        }
        d(h02, c6058k);
        if (!zC || u()) {
            E(h02 == this.f55606a);
        }
        return 1;
    }

    private static a3.t[] i(s3.y yVar) {
        int length = yVar != null ? yVar.length() : 0;
        a3.t[] tVarArr = new a3.t[length];
        for (int i10 = 0; i10 < length; i10++) {
            tVarArr[i10] = ((s3.y) C13466a.e(yVar)).a(i10);
        }
        return tVarArr;
    }

    private H0 l(C6063m0 c6063m0) {
        if (c6063m0 != null && c6063m0.f56333c[this.f55607b] != null) {
            if (this.f55606a.i() == c6063m0.f56333c[this.f55607b]) {
                return this.f55606a;
            }
            H0 h02 = this.f55608c;
            if (h02 != null && h02.i() == c6063m0.f56333c[this.f55607b]) {
                return this.f55608c;
            }
        }
        return null;
    }

    private boolean p(C6063m0 c6063m0, H0 h02) {
        if (h02 == null) {
            return true;
        }
        p3.r rVar = c6063m0.f56333c[this.f55607b];
        if (h02.i() == null || (h02.i() == rVar && (rVar == null || h02.m() || q(h02, c6063m0)))) {
            return true;
        }
        C6063m0 c6063m0K = c6063m0.k();
        return c6063m0K != null && c6063m0K.f56333c[this.f55607b] == h02.i();
    }

    private boolean A() {
        return this.f55609d == 3;
    }

    private void X(boolean z10) throws ExoPlaybackException {
        if (z10) {
            ((H0) C13466a.e(this.f55608c)).x(17, this.f55606a);
        } else {
            this.f55606a.x(17, C13466a.e(this.f55608c));
        }
    }

    private void d(H0 h02, C6058k c6058k) {
        C13466a.g(this.f55606a == h02 || this.f55608c == h02);
        if (y(h02)) {
            c6058k.a(h02);
            g(h02);
            h02.disable();
        }
    }

    private boolean v() {
        int i10 = this.f55609d;
        return i10 == 2 || i10 == 4;
    }

    public void B(p3.r rVar, C6058k c6058k, long j10, boolean z10) throws ExoPlaybackException {
        C(this.f55606a, rVar, c6058k, j10, z10);
        H0 h02 = this.f55608c;
        if (h02 != null) {
            C(h02, rVar, c6058k, j10, z10);
        }
    }

    public void D() throws ExoPlaybackException {
        int i10 = this.f55609d;
        if (i10 == 3 || i10 == 4) {
            X(i10 == 4);
            this.f55609d = this.f55609d != 4 ? 1 : 0;
        } else if (i10 == 2) {
            this.f55609d = 0;
        }
    }

    public void F(C16853E c16853e, C16853E c16853e2, long j10) {
        int i10;
        boolean zC = c16853e.c(this.f55607b);
        boolean zC2 = c16853e2.c(this.f55607b);
        H0 h02 = (this.f55608c == null || (i10 = this.f55609d) == 3 || (i10 == 0 && y(this.f55606a))) ? this.f55606a : (H0) C13466a.e(this.f55608c);
        if (!zC || h02.B()) {
            return;
        }
        boolean z10 = m() == -2;
        h3.K[] kArr = c16853e.f159891b;
        int i11 = this.f55607b;
        h3.K k10 = kArr[i11];
        h3.K k11 = c16853e2.f159891b[i11];
        if (!zC2 || !Objects.equals(k11, k10) || z10 || u()) {
            P(h02, j10);
        }
    }

    public void H() {
        this.f55606a.release();
        this.f55610e = false;
        H0 h02 = this.f55608c;
        if (h02 != null) {
            h02.release();
            this.f55611f = false;
        }
    }

    public void I(long j10, long j11) throws ExoPlaybackException {
        if (y(this.f55606a)) {
            this.f55606a.h(j10, j11);
        }
        H0 h02 = this.f55608c;
        if (h02 == null || !y(h02)) {
            return;
        }
        this.f55608c.h(j10, j11);
    }

    public int J(C6063m0 c6063m0, C16853E c16853e, C6058k c6058k) throws ExoPlaybackException {
        int iK = K(this.f55606a, c6063m0, c16853e, c6058k);
        return iK == 1 ? K(this.f55608c, c6063m0, c16853e, c6058k) : iK;
    }

    public void L() {
        if (!y(this.f55606a)) {
            E(true);
        }
        H0 h02 = this.f55608c;
        if (h02 == null || y(h02)) {
            return;
        }
        E(false);
    }

    public void N(long j10) {
        int i10;
        if (y(this.f55606a) && (i10 = this.f55609d) != 4 && i10 != 2) {
            P(this.f55606a, j10);
        }
        H0 h02 = this.f55608c;
        if (h02 == null || !y(h02) || this.f55609d == 3) {
            return;
        }
        P(this.f55608c, j10);
    }

    public void Q(float f10, float f11) throws ExoPlaybackException {
        this.f55606a.J(f10, f11);
        H0 h02 = this.f55608c;
        if (h02 != null) {
            h02.J(f10, f11);
        }
    }

    public void R(a3.F f10) {
        this.f55606a.k(f10);
        H0 h02 = this.f55608c;
        if (h02 != null) {
            h02.k(f10);
        }
    }

    public void U() throws ExoPlaybackException {
        if (this.f55606a.getState() == 1 && this.f55609d != 4) {
            this.f55606a.start();
            return;
        }
        H0 h02 = this.f55608c;
        if (h02 == null || h02.getState() != 1 || this.f55609d == 3) {
            return;
        }
        this.f55608c.start();
    }

    public void W() {
        if (y(this.f55606a)) {
            g(this.f55606a);
        }
        H0 h02 = this.f55608c;
        if (h02 == null || !y(h02)) {
            return;
        }
        g(this.f55608c);
    }

    public void b(C6058k c6058k) throws ExoPlaybackException {
        d(this.f55606a, c6058k);
        H0 h02 = this.f55608c;
        if (h02 != null) {
            boolean z10 = y(h02) && this.f55609d != 3;
            d(this.f55608c, c6058k);
            E(false);
            if (z10) {
                X(true);
            }
        }
        this.f55609d = 0;
    }

    public void e(h3.K k10, s3.y yVar, p3.r rVar, long j10, boolean z10, boolean z11, long j11, long j12, r.b bVar, C6058k c6058k) throws ExoPlaybackException {
        a3.t[] tVarArrI = i(yVar);
        int i10 = this.f55609d;
        if (i10 == 0 || i10 == 2 || i10 == 4) {
            this.f55610e = true;
            this.f55606a.o(k10, tVarArrI, rVar, j10, z10, z11, j11, j12, bVar);
            c6058k.b(this.f55606a);
        } else {
            this.f55611f = true;
            ((H0) C13466a.e(this.f55608c)).o(k10, tVarArrI, rVar, j10, z10, z11, j11, j12, bVar);
            c6058k.b(this.f55608c);
        }
    }

    public void f() {
        if (y(this.f55606a)) {
            this.f55606a.e();
            return;
        }
        H0 h02 = this.f55608c;
        if (h02 == null || !y(h02)) {
            return;
        }
        this.f55608c.e();
    }

    public int h() {
        boolean zY = y(this.f55606a);
        H0 h02 = this.f55608c;
        return (zY ? 1 : 0) + ((h02 == null || !y(h02)) ? 0 : 1);
    }

    public long j(long j10, long j11) {
        long jE = y(this.f55606a) ? this.f55606a.E(j10, j11) : Long.MAX_VALUE;
        H0 h02 = this.f55608c;
        return (h02 == null || !y(h02)) ? jE : Math.min(jE, this.f55608c.E(j10, j11));
    }

    public int m() {
        return this.f55606a.g();
    }

    public boolean o(C6063m0 c6063m0) {
        return p(c6063m0, this.f55606a) && p(c6063m0, this.f55608c);
    }

    public boolean s() {
        return this.f55608c != null;
    }

    public boolean t() {
        boolean zC = y(this.f55606a) ? this.f55606a.c() : true;
        H0 h02 = this.f55608c;
        return (h02 == null || !y(h02)) ? zC : zC & this.f55608c.c();
    }

    public boolean x() {
        int i10 = this.f55609d;
        return (i10 == 0 || i10 == 2 || i10 == 4) ? y(this.f55606a) : y((H0) C13466a.e(this.f55608c));
    }

    public J0(H0 h02, H0 h03, int i10) {
        this.f55606a = h02;
        this.f55607b = i10;
        this.f55608c = h03;
    }

    private void C(H0 h02, p3.r rVar, C6058k c6058k, long j10, boolean z10) throws ExoPlaybackException {
        if (y(h02)) {
            if (rVar != h02.i()) {
                d(h02, c6058k);
            } else if (z10) {
                h02.O(j10);
            }
        }
    }

    private void P(H0 h02, long j10) {
        h02.q();
        if (h02 instanceof C16718i) {
            ((C16718i) h02).H0(j10);
        }
    }

    private void g(H0 h02) {
        if (h02.getState() == 2) {
            h02.stop();
        }
    }

    private boolean q(H0 h02, C6063m0 c6063m0) {
        C6063m0 c6063m0K = c6063m0.k();
        if (c6063m0.f56338h.f56519g && c6063m0K != null && c6063m0K.f56336f) {
            if ((h02 instanceof C16718i) || (h02 instanceof o3.c) || h02.N() >= c6063m0K.n()) {
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

    public void G(C6063m0 c6063m0) throws IOException {
        ((H0) C13466a.e(l(c6063m0))).y();
    }

    public void M(C6063m0 c6063m0, long j10) throws ExoPlaybackException {
        H0 h0L = l(c6063m0);
        if (h0L != null) {
            h0L.O(j10);
        }
    }

    public void O(C6063m0 c6063m0, long j10) {
        P((H0) C13466a.e(l(c6063m0)), j10);
    }

    public void S(Object obj) throws ExoPlaybackException {
        if (m() != 2) {
            return;
        }
        int i10 = this.f55609d;
        if (i10 != 4 && i10 != 1) {
            this.f55606a.x(1, obj);
        } else {
            ((H0) C13466a.e(this.f55608c)).x(1, obj);
        }
    }

    public void T(float f10) throws ExoPlaybackException {
        if (m() == 1) {
            this.f55606a.x(2, Float.valueOf(f10));
            H0 h02 = this.f55608c;
            if (h02 != null) {
                h02.x(2, Float.valueOf(f10));
            }
        }
    }

    public void V() {
        int i10;
        C13466a.g(!u());
        if (y(this.f55606a)) {
            i10 = 3;
        } else {
            H0 h02 = this.f55608c;
            if (h02 != null && y(h02)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
        }
        this.f55609d = i10;
    }

    public boolean a(C6063m0 c6063m0) {
        H0 h0L = l(c6063m0);
        if (h0L != null && !h0L.m() && !h0L.b() && !h0L.c()) {
            return false;
        }
        return true;
    }

    public void c(C6058k c6058k) {
        boolean z10;
        H0 h02;
        if (!u()) {
            return;
        }
        int i10 = this.f55609d;
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
            h02 = this.f55606a;
        } else {
            h02 = (H0) C13466a.e(this.f55608c);
        }
        d(h02, c6058k);
        E(z10);
        this.f55609d = i11;
    }

    public long k(C6063m0 c6063m0) {
        H0 h0L = l(c6063m0);
        Objects.requireNonNull(h0L);
        return h0L.N();
    }

    public void n(int i10, Object obj, C6063m0 c6063m0) throws ExoPlaybackException {
        ((H0) C13466a.e(l(c6063m0))).x(i10, obj);
    }

    public boolean r(C6063m0 c6063m0) {
        return ((H0) C13466a.e(l(c6063m0))).m();
    }

    public boolean u() {
        if (!v() && !A()) {
            return false;
        }
        return true;
    }

    public boolean w(C6063m0 c6063m0) {
        if (l(c6063m0) != null) {
            return true;
        }
        return false;
    }

    public boolean z(int i10) {
        boolean z10;
        boolean z11;
        if (v() && i10 == this.f55607b) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (A() && i10 != this.f55607b) {
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
