package androidx.media3.exoplayer.source;

import a3.InterfaceC5571k;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.F;
import d3.C13466a;
import d3.InterfaceC13477l;
import java.io.IOException;
import java.util.Objects;
import x3.O;

/* loaded from: classes.dex */
public class F implements O {

    /* renamed from: A, reason: collision with root package name */
    private a3.t f56686A;

    /* renamed from: B, reason: collision with root package name */
    private a3.t f56687B;

    /* renamed from: C, reason: collision with root package name */
    private long f56688C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f56690E;

    /* renamed from: F, reason: collision with root package name */
    private long f56691F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f56692G;

    /* renamed from: a, reason: collision with root package name */
    private final D f56693a;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f56696d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a f56697e;

    /* renamed from: f, reason: collision with root package name */
    private d f56698f;

    /* renamed from: g, reason: collision with root package name */
    private a3.t f56699g;

    /* renamed from: h, reason: collision with root package name */
    private DrmSession f56700h;

    /* renamed from: p, reason: collision with root package name */
    private int f56708p;

    /* renamed from: q, reason: collision with root package name */
    private int f56709q;

    /* renamed from: r, reason: collision with root package name */
    private int f56710r;

    /* renamed from: s, reason: collision with root package name */
    private int f56711s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f56715w;

    /* renamed from: z, reason: collision with root package name */
    private boolean f56718z;

    /* renamed from: b, reason: collision with root package name */
    private final b f56694b = new b();

    /* renamed from: i, reason: collision with root package name */
    private int f56701i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private long[] f56702j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f56703k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f56706n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f56705m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f56704l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private O.a[] f56707o = new O.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final J<c> f56695c = new J<>(new InterfaceC13477l() { // from class: androidx.media3.exoplayer.source.E
        @Override // d3.InterfaceC13477l
        public final void accept(Object obj) {
            ((F.c) obj).f56723b.release();
        }
    });

    /* renamed from: t, reason: collision with root package name */
    private long f56712t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f56713u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f56714v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f56717y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f56716x = true;

    /* renamed from: D, reason: collision with root package name */
    private boolean f56689D = true;

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final a3.t f56722a;

        /* renamed from: b, reason: collision with root package name */
        public final i.b f56723b;

        private c(a3.t tVar, i.b bVar) {
            this.f56722a = tVar;
            this.f56723b = bVar;
        }
    }

    public interface d {
        void m(a3.t tVar);
    }

    private synchronized int K(h3.G g10, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        try {
            decoderInputBuffer.f55466e = false;
            if (!E()) {
                if (!z11 && !this.f56715w) {
                    a3.t tVar = this.f56687B;
                    if (tVar == null || (!z10 && tVar == this.f56699g)) {
                        return -3;
                    }
                    J((a3.t) C13466a.e(tVar), g10);
                    return -5;
                }
                decoderInputBuffer.D(4);
                decoderInputBuffer.f55467f = Long.MIN_VALUE;
                return -4;
            }
            a3.t tVar2 = this.f56695c.e(z()).f56722a;
            if (!z10 && tVar2 == this.f56699g) {
                int iA = A(this.f56711s);
                if (!H(iA)) {
                    decoderInputBuffer.f55466e = true;
                    return -3;
                }
                decoderInputBuffer.D(this.f56705m[iA]);
                if (this.f56711s == this.f56708p - 1 && (z11 || this.f56715w)) {
                    decoderInputBuffer.m(536870912);
                }
                decoderInputBuffer.f55467f = this.f56706n[iA];
                bVar.f56719a = this.f56704l[iA];
                bVar.f56720b = this.f56703k[iA];
                bVar.f56721c = this.f56707o[iA];
                return -4;
            }
            J(tVar2, g10);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void R() {
        this.f56711s = 0;
        this.f56693a.n();
    }

    private synchronized boolean V(a3.t tVar) {
        try {
            this.f56717y = false;
            if (Objects.equals(tVar, this.f56687B)) {
                return false;
            }
            if (this.f56695c.g() || !this.f56695c.f().f56722a.equals(tVar)) {
                this.f56687B = tVar;
            } else {
                this.f56687B = this.f56695c.f().f56722a;
            }
            boolean z10 = this.f56689D;
            a3.t tVar2 = this.f56687B;
            this.f56689D = z10 & a3.z.a(tVar2.f43949o, tVar2.f43945k);
            this.f56690E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean i(long j10) {
        if (this.f56708p == 0) {
            return j10 > this.f56713u;
        }
        if (x() >= j10) {
            return false;
        }
        r(this.f56709q + k(j10));
        return true;
    }

    private synchronized void j(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f56708p;
            if (i12 > 0) {
                int iA = A(i12 - 1);
                C13466a.a(this.f56703k[iA] + ((long) this.f56704l[iA]) <= j11);
            }
            this.f56715w = (536870912 & i10) != 0;
            this.f56714v = Math.max(this.f56714v, j10);
            int iA2 = A(this.f56708p);
            this.f56706n[iA2] = j10;
            this.f56703k[iA2] = j11;
            this.f56704l[iA2] = i11;
            this.f56705m[iA2] = i10;
            this.f56707o[iA2] = aVar;
            this.f56702j[iA2] = this.f56688C;
            if (this.f56695c.g() || !this.f56695c.f().f56722a.equals(this.f56687B)) {
                a3.t tVar = (a3.t) C13466a.e(this.f56687B);
                androidx.media3.exoplayer.drm.i iVar = this.f56696d;
                this.f56695c.a(D(), new c(tVar, iVar != null ? iVar.a(this.f56697e, tVar) : i.b.f56119a));
            }
            int i13 = this.f56708p + 1;
            this.f56708p = i13;
            int i14 = this.f56701i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f56710r;
                int i17 = i14 - i16;
                System.arraycopy(this.f56703k, i16, jArr2, 0, i17);
                System.arraycopy(this.f56706n, this.f56710r, jArr3, 0, i17);
                System.arraycopy(this.f56705m, this.f56710r, iArr, 0, i17);
                System.arraycopy(this.f56704l, this.f56710r, iArr2, 0, i17);
                System.arraycopy(this.f56707o, this.f56710r, aVarArr, 0, i17);
                System.arraycopy(this.f56702j, this.f56710r, jArr, 0, i17);
                int i18 = this.f56710r;
                System.arraycopy(this.f56703k, 0, jArr2, i17, i18);
                System.arraycopy(this.f56706n, 0, jArr3, i17, i18);
                System.arraycopy(this.f56705m, 0, iArr, i17, i18);
                System.arraycopy(this.f56704l, 0, iArr2, i17, i18);
                System.arraycopy(this.f56707o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f56702j, 0, jArr, i17, i18);
                this.f56703k = jArr2;
                this.f56706n = jArr3;
                this.f56705m = iArr;
                this.f56704l = iArr2;
                this.f56707o = aVarArr;
                this.f56702j = jArr;
                this.f56710r = 0;
                this.f56701i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized long m(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f56708p;
                if (i10 != 0) {
                    long[] jArr = this.f56706n;
                    int i11 = this.f56710r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f56711s;
                                if (i12 != i10) {
                                    i10 = i12 + 1;
                                }
                            } catch (Throwable th3) {
                                th2 = th3;
                                throw th2;
                            }
                        }
                        int iT = t(i11, i10, j10, z10);
                        if (iT == -1) {
                            return -1L;
                        }
                        return o(iT);
                    }
                }
                return -1L;
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            th2 = th;
            throw th2;
        }
    }

    private synchronized long n() {
        int i10 = this.f56708p;
        if (i10 == 0) {
            return -1L;
        }
        return o(i10);
    }

    private int s(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f56706n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f56701i) {
                i10 = 0;
            }
        }
        if (z10) {
            return i11;
        }
        return -1;
    }

    private int t(int i10, int i11, long j10, boolean z10) {
        int i12 = -1;
        for (int i13 = 0; i13 < i11; i13++) {
            long j11 = this.f56706n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f56705m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f56701i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized int B(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
            try {
                int iA = A(this.f56711s);
                if (!E() || j10 < this.f56706n[iA]) {
                    return 0;
                }
                if (j10 <= this.f56714v || !z10) {
                    int iT = t(iA, this.f56708p - this.f56711s, j10, true);
                    if (iT == -1) {
                        return 0;
                    }
                    return iT;
                }
                try {
                    return this.f56708p - this.f56711s;
                } catch (Throwable th3) {
                    th2 = th3;
                    throw th2;
                }
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
        }
    }

    public final synchronized a3.t C() {
        return this.f56717y ? null : this.f56687B;
    }

    public final synchronized boolean F() {
        return this.f56715w;
    }

    public synchronized boolean G(boolean z10) {
        a3.t tVar;
        boolean z11 = true;
        if (E()) {
            if (this.f56695c.e(z()).f56722a != this.f56699g) {
                return true;
            }
            return H(A(this.f56711s));
        }
        if (!z10 && !this.f56715w && ((tVar = this.f56687B) == null || tVar == this.f56699g)) {
            z11 = false;
        }
        return z11;
    }

    public void N() {
        Q(true);
        O();
    }

    public final void P() {
        Q(false);
    }

    public final synchronized boolean S(int i10) {
        R();
        int i11 = this.f56709q;
        if (i10 >= i11 && i10 <= this.f56708p + i11) {
            this.f56712t = Long.MIN_VALUE;
            this.f56711s = i10 - i11;
            return true;
        }
        return false;
    }

    public final synchronized boolean T(long j10, boolean z10) throws Throwable {
        F f10;
        long j11;
        int iT;
        try {
            try {
                R();
                int iA = A(this.f56711s);
                if (!E() || j10 < this.f56706n[iA] || (j10 > this.f56714v && !z10)) {
                    return false;
                }
                if (this.f56689D) {
                    f10 = this;
                    j11 = j10;
                    iT = f10.s(iA, this.f56708p - this.f56711s, j11, z10);
                } else {
                    f10 = this;
                    j11 = j10;
                    iT = f10.t(iA, f10.f56708p - f10.f56711s, j11, true);
                }
                if (iT == -1) {
                    return false;
                }
                f10.f56712t = j11;
                f10.f56711s += iT;
                return true;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x000e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void X(int r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            if (r3 < 0) goto Le
            int r0 = r2.f56711s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f56708p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            d3.C13466a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f56711s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f56711s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.F.X(int):void");
    }

    public final synchronized long w() {
        return this.f56714v;
    }

    public final synchronized long x() {
        return Math.max(this.f56713u, y(this.f56711s));
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f56719a;

        /* renamed from: b, reason: collision with root package name */
        public long f56720b;

        /* renamed from: c, reason: collision with root package name */
        public O.a f56721c;

        b() {
        }
    }

    private int A(int i10) {
        int i11 = this.f56710r + i10;
        int i12 = this.f56701i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean E() {
        return this.f56711s != this.f56708p;
    }

    private boolean H(int i10) {
        DrmSession drmSession = this.f56700h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f56705m[i10] & 1073741824) == 0 && this.f56700h.b();
    }

    private void J(a3.t tVar, h3.G g10) {
        a3.t tVar2 = this.f56699g;
        boolean z10 = tVar2 == null;
        a3.o oVar = tVar2 == null ? null : tVar2.f43953s;
        this.f56699g = tVar;
        a3.o oVar2 = tVar.f43953s;
        androidx.media3.exoplayer.drm.i iVar = this.f56696d;
        g10.f134191b = iVar != null ? tVar.c(iVar.c(tVar)) : tVar;
        g10.f134190a = this.f56700h;
        if (this.f56696d == null) {
            return;
        }
        if (z10 || !Objects.equals(oVar, oVar2)) {
            DrmSession drmSession = this.f56700h;
            DrmSession drmSessionB = this.f56696d.b(this.f56697e, tVar);
            this.f56700h = drmSessionB;
            g10.f134190a = drmSessionB;
            if (drmSession != null) {
                drmSession.g(this.f56697e);
            }
        }
    }

    private void O() {
        DrmSession drmSession = this.f56700h;
        if (drmSession != null) {
            drmSession.g(this.f56697e);
            this.f56700h = null;
            this.f56699g = null;
        }
    }

    private int k(long j10) {
        int i10 = this.f56708p;
        int iA = A(i10 - 1);
        while (i10 > this.f56711s && this.f56706n[iA] >= j10) {
            i10--;
            iA--;
            if (iA == -1) {
                iA = this.f56701i - 1;
            }
        }
        return i10;
    }

    public static F l(t3.b bVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar) {
        return new F(bVar, (androidx.media3.exoplayer.drm.i) C13466a.e(iVar), (h.a) C13466a.e(aVar));
    }

    private long o(int i10) {
        this.f56713u = Math.max(this.f56713u, y(i10));
        this.f56708p -= i10;
        int i11 = this.f56709q + i10;
        this.f56709q = i11;
        int i12 = this.f56710r + i10;
        this.f56710r = i12;
        int i13 = this.f56701i;
        if (i12 >= i13) {
            this.f56710r = i12 - i13;
        }
        int i14 = this.f56711s - i10;
        this.f56711s = i14;
        if (i14 < 0) {
            this.f56711s = 0;
        }
        this.f56695c.d(i11);
        if (this.f56708p != 0) {
            return this.f56703k[this.f56710r];
        }
        int i15 = this.f56710r;
        if (i15 == 0) {
            i15 = this.f56701i;
        }
        return this.f56703k[i15 - 1] + this.f56704l[r6];
    }

    private long y(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iA = A(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f56706n[iA]);
            if ((this.f56705m[iA] & 1) != 0) {
                return jMax;
            }
            iA--;
            if (iA == -1) {
                iA = this.f56701i - 1;
            }
        }
        return jMax;
    }

    public final int D() {
        return this.f56709q + this.f56708p;
    }

    public void I() throws IOException {
        DrmSession drmSession = this.f56700h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) C13466a.e(this.f56700h.getError()));
        }
    }

    public int M(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int iK = K(g10, decoderInputBuffer, (i10 & 2) != 0, z10, this.f56694b);
        if (iK == -4 && !decoderInputBuffer.u()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f56693a.e(decoderInputBuffer, this.f56694b);
                } else {
                    this.f56693a.l(decoderInputBuffer, this.f56694b);
                }
            }
            if (!z11) {
                this.f56711s++;
            }
        }
        return iK;
    }

    public void Q(boolean z10) {
        this.f56693a.m();
        this.f56708p = 0;
        this.f56709q = 0;
        this.f56710r = 0;
        this.f56711s = 0;
        this.f56716x = true;
        this.f56712t = Long.MIN_VALUE;
        this.f56713u = Long.MIN_VALUE;
        this.f56714v = Long.MIN_VALUE;
        this.f56715w = false;
        this.f56695c.b();
        if (z10) {
            this.f56686A = null;
            this.f56687B = null;
            this.f56717y = true;
            this.f56689D = true;
        }
    }

    public final void U(long j10) {
        this.f56712t = j10;
    }

    public final void W(d dVar) {
        this.f56698f = dVar;
    }

    @Override // x3.O
    public final int a(InterfaceC5571k interfaceC5571k, int i10, boolean z10, int i11) throws IOException {
        return this.f56693a.o(interfaceC5571k, i10, z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    @Override // x3.O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(long r12, int r14, int r15, int r16, x3.O.a r17) {
        /*
            r11 = this;
            boolean r1 = r11.f56718z
            if (r1 == 0) goto Lf
            a3.t r1 = r11.f56686A
            java.lang.Object r1 = d3.C13466a.i(r1)
            a3.t r1 = (a3.t) r1
            r11.b(r1)
        Lf:
            r1 = r14 & 1
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L17
            r4 = r3
            goto L18
        L17:
            r4 = r2
        L18:
            boolean r5 = r11.f56716x
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r11.f56716x = r2
        L21:
            long r5 = r11.f56691F
            long r5 = r5 + r12
            boolean r7 = r11.f56689D
            if (r7 == 0) goto L53
            long r7 = r11.f56712t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r11.f56690E
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            a3.t r7 = r11.f56687B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            d3.r.i(r7, r1)
            r11.f56690E = r3
        L4f:
            r1 = r14 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r14
        L54:
            boolean r1 = r11.f56692G
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r11.i(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r11.f56692G = r2
            goto L65
        L64:
            return
        L65:
            androidx.media3.exoplayer.source.D r1 = r11.f56693a
            long r1 = r1.d()
            long r7 = (long) r15
            long r1 = r1 - r7
            r7 = r16
            long r7 = (long) r7
            long r1 = r1 - r7
            r9 = r5
            r4 = r1
            r1 = r9
            r0 = r11
            r6 = r15
            r7 = r17
            r0.j(r1, r3, r4, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.F.c(long, int, int, int, x3.O$a):void");
    }

    @Override // x3.O
    public final void e(d3.D d10, int i10, int i11) {
        this.f56693a.p(d10, i10);
    }

    public final void p(long j10, boolean z10, boolean z11) {
        this.f56693a.b(m(j10, z10, z11));
    }

    public final void q() {
        this.f56693a.b(n());
    }

    protected a3.t u(a3.t tVar) {
        return (this.f56691F == 0 || tVar.f43954t == Long.MAX_VALUE) ? tVar : tVar.b().y0(tVar.f43954t + this.f56691F).N();
    }

    public final int v() {
        return this.f56709q;
    }

    public final int z() {
        return this.f56709q + this.f56711s;
    }

    protected F(t3.b bVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar) {
        this.f56696d = iVar;
        this.f56697e = aVar;
        this.f56693a = new D(bVar);
    }

    private long r(int i10) {
        boolean z10;
        int iD = D() - i10;
        boolean z11 = false;
        if (iD >= 0 && iD <= this.f56708p - this.f56711s) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13466a.a(z10);
        int i11 = this.f56708p - iD;
        this.f56708p = i11;
        this.f56714v = Math.max(this.f56713u, y(i11));
        if (iD == 0 && this.f56715w) {
            z11 = true;
        }
        this.f56715w = z11;
        this.f56695c.c(i10);
        int i12 = this.f56708p;
        if (i12 != 0) {
            return this.f56703k[A(i12 - 1)] + this.f56704l[r9];
        }
        return 0L;
    }

    public void L() {
        q();
        O();
    }

    @Override // x3.O
    public final void b(a3.t tVar) {
        a3.t tVarU = u(tVar);
        this.f56718z = false;
        this.f56686A = tVar;
        boolean zV = V(tVarU);
        d dVar = this.f56698f;
        if (dVar != null && zV) {
            dVar.m(tVarU);
        }
    }
}
