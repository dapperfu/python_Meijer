package androidx.media3.exoplayer.source;

import a3.InterfaceC5654k;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.drm.h;
import androidx.media3.exoplayer.drm.i;
import androidx.media3.exoplayer.source.F;
import d3.C13599a;
import d3.InterfaceC13610l;
import java.io.IOException;
import java.util.Objects;
import x3.O;

/* loaded from: classes.dex */
public class F implements O {

    /* renamed from: A, reason: collision with root package name */
    private a3.t f56910A;

    /* renamed from: B, reason: collision with root package name */
    private a3.t f56911B;

    /* renamed from: C, reason: collision with root package name */
    private long f56912C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f56914E;

    /* renamed from: F, reason: collision with root package name */
    private long f56915F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f56916G;

    /* renamed from: a, reason: collision with root package name */
    private final D f56917a;

    /* renamed from: d, reason: collision with root package name */
    private final androidx.media3.exoplayer.drm.i f56920d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a f56921e;

    /* renamed from: f, reason: collision with root package name */
    private d f56922f;

    /* renamed from: g, reason: collision with root package name */
    private a3.t f56923g;

    /* renamed from: h, reason: collision with root package name */
    private DrmSession f56924h;

    /* renamed from: p, reason: collision with root package name */
    private int f56932p;

    /* renamed from: q, reason: collision with root package name */
    private int f56933q;

    /* renamed from: r, reason: collision with root package name */
    private int f56934r;

    /* renamed from: s, reason: collision with root package name */
    private int f56935s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f56939w;

    /* renamed from: z, reason: collision with root package name */
    private boolean f56942z;

    /* renamed from: b, reason: collision with root package name */
    private final b f56918b = new b();

    /* renamed from: i, reason: collision with root package name */
    private int f56925i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private long[] f56926j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f56927k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f56930n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f56929m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f56928l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private O.a[] f56931o = new O.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final J<c> f56919c = new J<>(new InterfaceC13610l() { // from class: androidx.media3.exoplayer.source.E
        @Override // d3.InterfaceC13610l
        public final void accept(Object obj) {
            ((F.c) obj).f56947b.release();
        }
    });

    /* renamed from: t, reason: collision with root package name */
    private long f56936t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f56937u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f56938v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f56941y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f56940x = true;

    /* renamed from: D, reason: collision with root package name */
    private boolean f56913D = true;

    /* JADX INFO: Access modifiers changed from: private */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final a3.t f56946a;

        /* renamed from: b, reason: collision with root package name */
        public final i.b f56947b;

        private c(a3.t tVar, i.b bVar) {
            this.f56946a = tVar;
            this.f56947b = bVar;
        }
    }

    public interface d {
        void m(a3.t tVar);
    }

    private synchronized int K(h3.G g10, DecoderInputBuffer decoderInputBuffer, boolean z10, boolean z11, b bVar) {
        try {
            decoderInputBuffer.f55690e = false;
            if (!E()) {
                if (!z11 && !this.f56939w) {
                    a3.t tVar = this.f56911B;
                    if (tVar == null || (!z10 && tVar == this.f56923g)) {
                        return -3;
                    }
                    J((a3.t) C13599a.e(tVar), g10);
                    return -5;
                }
                decoderInputBuffer.D(4);
                decoderInputBuffer.f55691f = Long.MIN_VALUE;
                return -4;
            }
            a3.t tVar2 = this.f56919c.e(z()).f56946a;
            if (!z10 && tVar2 == this.f56923g) {
                int iA = A(this.f56935s);
                if (!H(iA)) {
                    decoderInputBuffer.f55690e = true;
                    return -3;
                }
                decoderInputBuffer.D(this.f56929m[iA]);
                if (this.f56935s == this.f56932p - 1 && (z11 || this.f56939w)) {
                    decoderInputBuffer.m(536870912);
                }
                decoderInputBuffer.f55691f = this.f56930n[iA];
                bVar.f56943a = this.f56928l[iA];
                bVar.f56944b = this.f56927k[iA];
                bVar.f56945c = this.f56931o[iA];
                return -4;
            }
            J(tVar2, g10);
            return -5;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized void R() {
        this.f56935s = 0;
        this.f56917a.n();
    }

    private synchronized boolean V(a3.t tVar) {
        try {
            this.f56941y = false;
            if (Objects.equals(tVar, this.f56911B)) {
                return false;
            }
            if (this.f56919c.g() || !this.f56919c.f().f56946a.equals(tVar)) {
                this.f56911B = tVar;
            } else {
                this.f56911B = this.f56919c.f().f56946a;
            }
            boolean z10 = this.f56913D;
            a3.t tVar2 = this.f56911B;
            this.f56913D = z10 & a3.z.a(tVar2.f44767o, tVar2.f44763k);
            this.f56914E = false;
            return true;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized boolean i(long j10) {
        if (this.f56932p == 0) {
            return j10 > this.f56937u;
        }
        if (x() >= j10) {
            return false;
        }
        r(this.f56933q + k(j10));
        return true;
    }

    private synchronized void j(long j10, int i10, long j11, int i11, O.a aVar) {
        try {
            int i12 = this.f56932p;
            if (i12 > 0) {
                int iA = A(i12 - 1);
                C13599a.a(this.f56927k[iA] + ((long) this.f56928l[iA]) <= j11);
            }
            this.f56939w = (536870912 & i10) != 0;
            this.f56938v = Math.max(this.f56938v, j10);
            int iA2 = A(this.f56932p);
            this.f56930n[iA2] = j10;
            this.f56927k[iA2] = j11;
            this.f56928l[iA2] = i11;
            this.f56929m[iA2] = i10;
            this.f56931o[iA2] = aVar;
            this.f56926j[iA2] = this.f56912C;
            if (this.f56919c.g() || !this.f56919c.f().f56946a.equals(this.f56911B)) {
                a3.t tVar = (a3.t) C13599a.e(this.f56911B);
                androidx.media3.exoplayer.drm.i iVar = this.f56920d;
                this.f56919c.a(D(), new c(tVar, iVar != null ? iVar.a(this.f56921e, tVar) : i.b.f56343a));
            }
            int i13 = this.f56932p + 1;
            this.f56932p = i13;
            int i14 = this.f56925i;
            if (i13 == i14) {
                int i15 = i14 + 1000;
                long[] jArr = new long[i15];
                long[] jArr2 = new long[i15];
                long[] jArr3 = new long[i15];
                int[] iArr = new int[i15];
                int[] iArr2 = new int[i15];
                O.a[] aVarArr = new O.a[i15];
                int i16 = this.f56934r;
                int i17 = i14 - i16;
                System.arraycopy(this.f56927k, i16, jArr2, 0, i17);
                System.arraycopy(this.f56930n, this.f56934r, jArr3, 0, i17);
                System.arraycopy(this.f56929m, this.f56934r, iArr, 0, i17);
                System.arraycopy(this.f56928l, this.f56934r, iArr2, 0, i17);
                System.arraycopy(this.f56931o, this.f56934r, aVarArr, 0, i17);
                System.arraycopy(this.f56926j, this.f56934r, jArr, 0, i17);
                int i18 = this.f56934r;
                System.arraycopy(this.f56927k, 0, jArr2, i17, i18);
                System.arraycopy(this.f56930n, 0, jArr3, i17, i18);
                System.arraycopy(this.f56929m, 0, iArr, i17, i18);
                System.arraycopy(this.f56928l, 0, iArr2, i17, i18);
                System.arraycopy(this.f56931o, 0, aVarArr, i17, i18);
                System.arraycopy(this.f56926j, 0, jArr, i17, i18);
                this.f56927k = jArr2;
                this.f56930n = jArr3;
                this.f56929m = iArr;
                this.f56928l = iArr2;
                this.f56931o = aVarArr;
                this.f56926j = jArr;
                this.f56934r = 0;
                this.f56925i = i15;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    private synchronized long m(long j10, boolean z10, boolean z11) throws Throwable {
        Throwable th2;
        try {
            try {
                int i10 = this.f56932p;
                if (i10 != 0) {
                    long[] jArr = this.f56930n;
                    int i11 = this.f56934r;
                    if (j10 >= jArr[i11]) {
                        if (z11) {
                            try {
                                int i12 = this.f56935s;
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
        int i10 = this.f56932p;
        if (i10 == 0) {
            return -1L;
        }
        return o(i10);
    }

    private int s(int i10, int i11, long j10, boolean z10) {
        for (int i12 = 0; i12 < i11; i12++) {
            if (this.f56930n[i10] >= j10) {
                return i12;
            }
            i10++;
            if (i10 == this.f56925i) {
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
            long j11 = this.f56930n[i10];
            if (j11 > j10) {
                break;
            }
            if (!z10 || (this.f56929m[i10] & 1) != 0) {
                if (j11 == j10) {
                    return i13;
                }
                i12 = i13;
            }
            i10++;
            if (i10 == this.f56925i) {
                i10 = 0;
            }
        }
        return i12;
    }

    public final synchronized int B(long j10, boolean z10) throws Throwable {
        Throwable th2;
        try {
            try {
                int iA = A(this.f56935s);
                if (!E() || j10 < this.f56930n[iA]) {
                    return 0;
                }
                if (j10 <= this.f56938v || !z10) {
                    int iT = t(iA, this.f56932p - this.f56935s, j10, true);
                    if (iT == -1) {
                        return 0;
                    }
                    return iT;
                }
                try {
                    return this.f56932p - this.f56935s;
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
        return this.f56941y ? null : this.f56911B;
    }

    public final synchronized boolean F() {
        return this.f56939w;
    }

    public synchronized boolean G(boolean z10) {
        a3.t tVar;
        boolean z11 = true;
        if (E()) {
            if (this.f56919c.e(z()).f56946a != this.f56923g) {
                return true;
            }
            return H(A(this.f56935s));
        }
        if (!z10 && !this.f56939w && ((tVar = this.f56911B) == null || tVar == this.f56923g)) {
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
        int i11 = this.f56933q;
        if (i10 >= i11 && i10 <= this.f56932p + i11) {
            this.f56936t = Long.MIN_VALUE;
            this.f56935s = i10 - i11;
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
                int iA = A(this.f56935s);
                if (!E() || j10 < this.f56930n[iA] || (j10 > this.f56938v && !z10)) {
                    return false;
                }
                if (this.f56913D) {
                    f10 = this;
                    j11 = j10;
                    iT = f10.s(iA, this.f56932p - this.f56935s, j11, z10);
                } else {
                    f10 = this;
                    j11 = j10;
                    iT = f10.t(iA, f10.f56932p - f10.f56935s, j11, true);
                }
                if (iT == -1) {
                    return false;
                }
                f10.f56936t = j11;
                f10.f56935s += iT;
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
            int r0 = r2.f56935s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            int r1 = r2.f56932p     // Catch: java.lang.Throwable -> Lc
            if (r0 > r1) goto Le
            r0 = 1
            goto Lf
        Lc:
            r3 = move-exception
            goto L19
        Le:
            r0 = 0
        Lf:
            d3.C13599a.a(r0)     // Catch: java.lang.Throwable -> Lc
            int r0 = r2.f56935s     // Catch: java.lang.Throwable -> Lc
            int r0 = r0 + r3
            r2.f56935s = r0     // Catch: java.lang.Throwable -> Lc
            monitor-exit(r2)
            return
        L19:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> Lc
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.F.X(int):void");
    }

    public final synchronized long w() {
        return this.f56938v;
    }

    public final synchronized long x() {
        return Math.max(this.f56937u, y(this.f56935s));
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public int f56943a;

        /* renamed from: b, reason: collision with root package name */
        public long f56944b;

        /* renamed from: c, reason: collision with root package name */
        public O.a f56945c;

        b() {
        }
    }

    private int A(int i10) {
        int i11 = this.f56934r + i10;
        int i12 = this.f56925i;
        return i11 < i12 ? i11 : i11 - i12;
    }

    private boolean E() {
        return this.f56935s != this.f56932p;
    }

    private boolean H(int i10) {
        DrmSession drmSession = this.f56924h;
        if (drmSession == null || drmSession.getState() == 4) {
            return true;
        }
        return (this.f56929m[i10] & 1073741824) == 0 && this.f56924h.b();
    }

    private void J(a3.t tVar, h3.G g10) {
        a3.t tVar2 = this.f56923g;
        boolean z10 = tVar2 == null;
        a3.o oVar = tVar2 == null ? null : tVar2.f44771s;
        this.f56923g = tVar;
        a3.o oVar2 = tVar.f44771s;
        androidx.media3.exoplayer.drm.i iVar = this.f56920d;
        g10.f134662b = iVar != null ? tVar.c(iVar.c(tVar)) : tVar;
        g10.f134661a = this.f56924h;
        if (this.f56920d == null) {
            return;
        }
        if (z10 || !Objects.equals(oVar, oVar2)) {
            DrmSession drmSession = this.f56924h;
            DrmSession drmSessionB = this.f56920d.b(this.f56921e, tVar);
            this.f56924h = drmSessionB;
            g10.f134661a = drmSessionB;
            if (drmSession != null) {
                drmSession.g(this.f56921e);
            }
        }
    }

    private void O() {
        DrmSession drmSession = this.f56924h;
        if (drmSession != null) {
            drmSession.g(this.f56921e);
            this.f56924h = null;
            this.f56923g = null;
        }
    }

    private int k(long j10) {
        int i10 = this.f56932p;
        int iA = A(i10 - 1);
        while (i10 > this.f56935s && this.f56930n[iA] >= j10) {
            i10--;
            iA--;
            if (iA == -1) {
                iA = this.f56925i - 1;
            }
        }
        return i10;
    }

    public static F l(t3.b bVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar) {
        return new F(bVar, (androidx.media3.exoplayer.drm.i) C13599a.e(iVar), (h.a) C13599a.e(aVar));
    }

    private long o(int i10) {
        this.f56937u = Math.max(this.f56937u, y(i10));
        this.f56932p -= i10;
        int i11 = this.f56933q + i10;
        this.f56933q = i11;
        int i12 = this.f56934r + i10;
        this.f56934r = i12;
        int i13 = this.f56925i;
        if (i12 >= i13) {
            this.f56934r = i12 - i13;
        }
        int i14 = this.f56935s - i10;
        this.f56935s = i14;
        if (i14 < 0) {
            this.f56935s = 0;
        }
        this.f56919c.d(i11);
        if (this.f56932p != 0) {
            return this.f56927k[this.f56934r];
        }
        int i15 = this.f56934r;
        if (i15 == 0) {
            i15 = this.f56925i;
        }
        return this.f56927k[i15 - 1] + this.f56928l[r6];
    }

    private long y(int i10) {
        long jMax = Long.MIN_VALUE;
        if (i10 == 0) {
            return Long.MIN_VALUE;
        }
        int iA = A(i10 - 1);
        for (int i11 = 0; i11 < i10; i11++) {
            jMax = Math.max(jMax, this.f56930n[iA]);
            if ((this.f56929m[iA] & 1) != 0) {
                return jMax;
            }
            iA--;
            if (iA == -1) {
                iA = this.f56925i - 1;
            }
        }
        return jMax;
    }

    public final int D() {
        return this.f56933q + this.f56932p;
    }

    public void I() throws IOException {
        DrmSession drmSession = this.f56924h;
        if (drmSession != null && drmSession.getState() == 1) {
            throw ((DrmSession.DrmSessionException) C13599a.e(this.f56924h.getError()));
        }
    }

    public int M(h3.G g10, DecoderInputBuffer decoderInputBuffer, int i10, boolean z10) {
        int iK = K(g10, decoderInputBuffer, (i10 & 2) != 0, z10, this.f56918b);
        if (iK == -4 && !decoderInputBuffer.u()) {
            boolean z11 = (i10 & 1) != 0;
            if ((i10 & 4) == 0) {
                if (z11) {
                    this.f56917a.e(decoderInputBuffer, this.f56918b);
                } else {
                    this.f56917a.l(decoderInputBuffer, this.f56918b);
                }
            }
            if (!z11) {
                this.f56935s++;
            }
        }
        return iK;
    }

    public void Q(boolean z10) {
        this.f56917a.m();
        this.f56932p = 0;
        this.f56933q = 0;
        this.f56934r = 0;
        this.f56935s = 0;
        this.f56940x = true;
        this.f56936t = Long.MIN_VALUE;
        this.f56937u = Long.MIN_VALUE;
        this.f56938v = Long.MIN_VALUE;
        this.f56939w = false;
        this.f56919c.b();
        if (z10) {
            this.f56910A = null;
            this.f56911B = null;
            this.f56941y = true;
            this.f56913D = true;
        }
    }

    public final void U(long j10) {
        this.f56936t = j10;
    }

    public final void W(d dVar) {
        this.f56922f = dVar;
    }

    @Override // x3.O
    public final int a(InterfaceC5654k interfaceC5654k, int i10, boolean z10, int i11) throws IOException {
        return this.f56917a.o(interfaceC5654k, i10, z10);
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
            boolean r1 = r11.f56942z
            if (r1 == 0) goto Lf
            a3.t r1 = r11.f56910A
            java.lang.Object r1 = d3.C13599a.i(r1)
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
            boolean r5 = r11.f56940x
            if (r5 == 0) goto L21
            if (r4 != 0) goto L1f
            goto L64
        L1f:
            r11.f56940x = r2
        L21:
            long r5 = r11.f56915F
            long r5 = r5 + r12
            boolean r7 = r11.f56913D
            if (r7 == 0) goto L53
            long r7 = r11.f56936t
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 >= 0) goto L2f
            goto L64
        L2f:
            if (r1 != 0) goto L53
            boolean r1 = r11.f56914E
            if (r1 != 0) goto L4f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r7 = "Overriding unexpected non-sync sample for format: "
            r1.append(r7)
            a3.t r7 = r11.f56911B
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            java.lang.String r7 = "SampleQueue"
            d3.r.i(r7, r1)
            r11.f56914E = r3
        L4f:
            r1 = r14 | 1
            r3 = r1
            goto L54
        L53:
            r3 = r14
        L54:
            boolean r1 = r11.f56916G
            if (r1 == 0) goto L65
            if (r4 == 0) goto L64
            boolean r1 = r11.i(r5)
            if (r1 != 0) goto L61
            goto L64
        L61:
            r11.f56916G = r2
            goto L65
        L64:
            return
        L65:
            androidx.media3.exoplayer.source.D r1 = r11.f56917a
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
        this.f56917a.p(d10, i10);
    }

    public final void p(long j10, boolean z10, boolean z11) {
        this.f56917a.b(m(j10, z10, z11));
    }

    public final void q() {
        this.f56917a.b(n());
    }

    protected a3.t u(a3.t tVar) {
        return (this.f56915F == 0 || tVar.f44772t == Long.MAX_VALUE) ? tVar : tVar.b().y0(tVar.f44772t + this.f56915F).N();
    }

    public final int v() {
        return this.f56933q;
    }

    public final int z() {
        return this.f56933q + this.f56935s;
    }

    protected F(t3.b bVar, androidx.media3.exoplayer.drm.i iVar, h.a aVar) {
        this.f56920d = iVar;
        this.f56921e = aVar;
        this.f56917a = new D(bVar);
    }

    private long r(int i10) {
        boolean z10;
        int iD = D() - i10;
        boolean z11 = false;
        if (iD >= 0 && iD <= this.f56932p - this.f56935s) {
            z10 = true;
        } else {
            z10 = false;
        }
        C13599a.a(z10);
        int i11 = this.f56932p - iD;
        this.f56932p = i11;
        this.f56938v = Math.max(this.f56937u, y(i11));
        if (iD == 0 && this.f56939w) {
            z11 = true;
        }
        this.f56939w = z11;
        this.f56919c.c(i10);
        int i12 = this.f56932p;
        if (i12 != 0) {
            return this.f56927k[A(i12 - 1)] + this.f56928l[r9];
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
        this.f56942z = false;
        this.f56910A = tVar;
        boolean zV = V(tVarU);
        d dVar = this.f56922f;
        if (dVar != null && zV) {
            dVar.m(tVarU);
        }
    }
}
