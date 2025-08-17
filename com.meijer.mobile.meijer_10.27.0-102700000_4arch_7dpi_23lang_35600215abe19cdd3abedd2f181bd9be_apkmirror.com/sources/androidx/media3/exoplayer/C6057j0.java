package androidx.media3.exoplayer;

import Ce.L;
import a3.C5560A;
import a3.C5564d;
import a3.F;
import a3.v;
import a3.y;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.C6050g;
import androidx.media3.exoplayer.C6058k;
import androidx.media3.exoplayer.C6061l0;
import androidx.media3.exoplayer.C6063m0;
import androidx.media3.exoplayer.D0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.F0;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.InterfaceC6059k0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13466a;
import d3.InterfaceC13473h;
import d3.InterfaceC13479n;
import i3.E1;
import i3.InterfaceC14596a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.AbstractC16852D;
import s3.C16853E;

/* renamed from: androidx.media3.exoplayer.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6057j0 implements Handler.Callback, q.a, AbstractC16852D.a, D0.d, C6058k.a, F0.a, C6050g.a {

    /* renamed from: e0, reason: collision with root package name */
    private static final long f56211e0 = d3.P.j1(10000);

    /* renamed from: A, reason: collision with root package name */
    private final boolean f56212A;

    /* renamed from: B, reason: collision with root package name */
    private final C6050g f56213B;

    /* renamed from: C, reason: collision with root package name */
    private h3.M f56214C;

    /* renamed from: D, reason: collision with root package name */
    private E0 f56215D;

    /* renamed from: E, reason: collision with root package name */
    private e f56216E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f56217F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f56218G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f56219H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f56220I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f56222K;

    /* renamed from: L, reason: collision with root package name */
    private int f56223L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f56224M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f56225N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f56226O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f56227P;

    /* renamed from: Q, reason: collision with root package name */
    private int f56228Q;

    /* renamed from: R, reason: collision with root package name */
    private h f56229R;

    /* renamed from: S, reason: collision with root package name */
    private long f56230S;

    /* renamed from: T, reason: collision with root package name */
    private long f56231T;

    /* renamed from: U, reason: collision with root package name */
    private int f56232U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f56233V;

    /* renamed from: W, reason: collision with root package name */
    private ExoPlaybackException f56234W;

    /* renamed from: X, reason: collision with root package name */
    private long f56235X;

    /* renamed from: Z, reason: collision with root package name */
    private ExoPlayer.c f56237Z;

    /* renamed from: a, reason: collision with root package name */
    private final J0[] f56238a;

    /* renamed from: b, reason: collision with root package name */
    private final I0[] f56240b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f56242c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f56243c0;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16852D f56244d;

    /* renamed from: e, reason: collision with root package name */
    private final C16853E f56246e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6059k0 f56247f;

    /* renamed from: g, reason: collision with root package name */
    private final t3.d f56248g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC13479n f56249h;

    /* renamed from: i, reason: collision with root package name */
    private final h3.J f56250i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f56251j;

    /* renamed from: k, reason: collision with root package name */
    private final F.c f56252k;

    /* renamed from: l, reason: collision with root package name */
    private final F.b f56253l;

    /* renamed from: m, reason: collision with root package name */
    private final long f56254m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f56255n;

    /* renamed from: o, reason: collision with root package name */
    private final C6058k f56256o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<d> f56257p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC13473h f56258q;

    /* renamed from: r, reason: collision with root package name */
    private final f f56259r;

    /* renamed from: s, reason: collision with root package name */
    private final C6069p0 f56260s;

    /* renamed from: t, reason: collision with root package name */
    private final D0 f56261t;

    /* renamed from: u, reason: collision with root package name */
    private final h3.H f56262u;

    /* renamed from: v, reason: collision with root package name */
    private final long f56263v;

    /* renamed from: w, reason: collision with root package name */
    private final E1 f56264w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f56265x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC14596a f56266y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC13479n f56267z;

    /* renamed from: b0, reason: collision with root package name */
    private long f56241b0 = -9223372036854775807L;

    /* renamed from: d0, reason: collision with root package name */
    private float f56245d0 = 1.0f;

    /* renamed from: Y, reason: collision with root package name */
    private long f56236Y = -9223372036854775807L;

    /* renamed from: J, reason: collision with root package name */
    private long f56221J = -9223372036854775807L;

    /* renamed from: a0, reason: collision with root package name */
    private a3.F f56239a0 = a3.F.f43583a;

    /* renamed from: androidx.media3.exoplayer.j0$a */
    class a implements H0.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.H0.a
        public void a() {
            C6057j0.this.f56226O = true;
        }

        @Override // androidx.media3.exoplayer.H0.a
        public void b() {
            if (C6057j0.this.f56265x || C6057j0.this.f56227P) {
                C6057j0.this.f56249h.h(2);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<D0.c> f56269a;

        /* renamed from: b, reason: collision with root package name */
        private final p3.s f56270b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56271c;

        /* renamed from: d, reason: collision with root package name */
        private final long f56272d;

        /* synthetic */ b(List list, p3.s sVar, int i10, long j10, a aVar) {
            this(list, sVar, i10, j10);
        }

        private b(List<D0.c> list, p3.s sVar, int i10, long j10) {
            this.f56269a = list;
            this.f56270b = sVar;
            this.f56271c = i10;
            this.f56272d = j10;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f56273a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56274b;

        /* renamed from: c, reason: collision with root package name */
        public final int f56275c;

        /* renamed from: d, reason: collision with root package name */
        public final p3.s f56276d;
    }

    /* renamed from: androidx.media3.exoplayer.j0$d */
    private static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final F0 f56277a;

        /* renamed from: b, reason: collision with root package name */
        public int f56278b;

        /* renamed from: c, reason: collision with root package name */
        public long f56279c;

        /* renamed from: d, reason: collision with root package name */
        public Object f56280d;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f56280d;
            if ((obj == null) != (dVar.f56280d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f56278b - dVar.f56278b;
            return i10 != 0 ? i10 : d3.P.m(this.f56279c, dVar.f56279c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f56278b = i10;
            this.f56279c = j10;
            this.f56280d = obj;
        }

        public d(F0 f02) {
            this.f56277a = f02;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f56281a;

        /* renamed from: b, reason: collision with root package name */
        public E0 f56282b;

        /* renamed from: c, reason: collision with root package name */
        public int f56283c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f56284d;

        /* renamed from: e, reason: collision with root package name */
        public int f56285e;

        public void b(int i10) {
            this.f56281a |= i10 > 0;
            this.f56283c += i10;
        }

        public void c(E0 e02) {
            this.f56281a |= this.f56282b != e02;
            this.f56282b = e02;
        }

        public void d(int i10) {
            if (this.f56284d && this.f56285e != 5) {
                C13466a.a(i10 == 5);
                return;
            }
            this.f56281a = true;
            this.f56284d = true;
            this.f56285e = i10;
        }

        public e(E0 e02) {
            this.f56282b = e02;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$f */
    public interface f {
        void a(e eVar);
    }

    public C6057j0(Context context, H0[] h0Arr, H0[] h0Arr2, AbstractC16852D abstractC16852D, C16853E c16853e, InterfaceC6059k0 interfaceC6059k0, t3.d dVar, int i10, boolean z10, InterfaceC14596a interfaceC14596a, h3.M m10, h3.H h10, long j10, boolean z11, boolean z12, Looper looper, InterfaceC13473h interfaceC13473h, f fVar, E1 e12, h3.J j11, ExoPlayer.c cVar) {
        this.f56259r = fVar;
        this.f56244d = abstractC16852D;
        this.f56246e = c16853e;
        this.f56247f = interfaceC6059k0;
        this.f56248g = dVar;
        this.f56223L = i10;
        this.f56224M = z10;
        this.f56214C = m10;
        this.f56262u = h10;
        this.f56263v = j10;
        this.f56235X = j10;
        this.f56218G = z11;
        this.f56265x = z12;
        this.f56258q = interfaceC13473h;
        this.f56264w = e12;
        this.f56237Z = cVar;
        this.f56266y = interfaceC14596a;
        this.f56254m = interfaceC6059k0.q(e12);
        this.f56255n = interfaceC6059k0.o(e12);
        E0 e0K = E0.k(c16853e);
        this.f56215D = e0K;
        this.f56216E = new e(e0K);
        this.f56240b = new I0[h0Arr.length];
        this.f56242c = new boolean[h0Arr.length];
        I0.a aVarD = abstractC16852D.d();
        this.f56238a = new J0[h0Arr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < h0Arr.length; i11++) {
            h0Arr[i11].l(i11, e12, interfaceC13473h);
            this.f56240b[i11] = h0Arr[i11].G();
            if (aVarD != null) {
                this.f56240b[i11].H(aVarD);
            }
            H0 h02 = h0Arr2[i11];
            if (h02 != null) {
                h02.l(h0Arr.length + i11, e12, interfaceC13473h);
                z13 = true;
            }
            this.f56238a[i11] = new J0(h0Arr[i11], h0Arr2[i11], i11);
        }
        this.f56212A = z13;
        this.f56256o = new C6058k(this, interfaceC13473h);
        this.f56257p = new ArrayList<>();
        this.f56252k = new F.c();
        this.f56253l = new F.b();
        abstractC16852D.e(this, dVar);
        this.f56233V = true;
        InterfaceC13479n interfaceC13479nE = interfaceC13473h.e(looper, null);
        this.f56267z = interfaceC13479nE;
        this.f56260s = new C6069p0(interfaceC14596a, interfaceC13479nE, new C6063m0.a() { // from class: androidx.media3.exoplayer.h0
            @Override // androidx.media3.exoplayer.C6063m0.a
            public final C6063m0 a(C6065n0 c6065n0, long j12) {
                return this.f56168a.v(c6065n0, j12);
            }
        }, cVar);
        this.f56261t = new D0(this, interfaceC14596a, interfaceC13479nE, e12);
        h3.J j12 = j11 == null ? new h3.J() : j11;
        this.f56250i = j12;
        Looper looperA = j12.a();
        this.f56251j = looperA;
        this.f56249h = interfaceC13473h.e(looperA, this);
        this.f56213B = new C6050g(context, looperA, this);
    }

    private void B0() {
        try {
            G0(true, false, true, false);
            C0();
            this.f56247f.c(this.f56264w);
            this.f56213B.h();
            this.f56244d.j();
            s1(1);
            this.f56250i.b();
            synchronized (this) {
                this.f56217F = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.f56250i.b();
            synchronized (this) {
                this.f56217F = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private void C0() {
        for (int i10 = 0; i10 < this.f56238a.length; i10++) {
            this.f56240b[i10].j();
            this.f56238a[i10].H();
        }
    }

    private void E1(boolean z10, boolean z11) {
        G0(z10 || !this.f56225N, false, true, false);
        this.f56216E.b(z11 ? 1 : 0);
        this.f56247f.d(this.f56264w);
        this.f56213B.n(this.f56215D.f55522l, 1);
        s1(1);
    }

    private static int K1(int i10, int i11) {
        if (i10 == -1) {
            return 2;
        }
        if (i11 == 2) {
            return 1;
        }
        return i11;
    }

    private void N1(boolean z10, int i10, int i11, int i12) throws ExoPlaybackException {
        boolean z11 = z10 && i10 != -1;
        int iK1 = K1(i10, i12);
        int iQ1 = Q1(i10, i11);
        E0 e02 = this.f56215D;
        if (e02.f55522l == z11 && e02.f55524n == iQ1 && e02.f55523m == iK1) {
            return;
        }
        this.f56215D = e02.e(z11, iK1, iQ1);
        R1(false, false);
        v0(z11);
        if (!z1()) {
            F1();
            O1();
            this.f56260s.K(this.f56230S);
            return;
        }
        int i13 = this.f56215D.f55515e;
        if (i13 == 3) {
            this.f56256o.g();
            C1();
            this.f56249h.h(2);
        } else if (i13 == 2) {
            this.f56249h.h(2);
        }
    }

    private static int Q1(int i10, int i11) {
        if (i10 == 0) {
            return 1;
        }
        if (i11 == 1) {
            return 0;
        }
        return i11;
    }

    private synchronized void U1(Be.w<Boolean> wVar, long j10) {
        long jC = this.f56258q.c() + j10;
        boolean z10 = false;
        while (!wVar.get().booleanValue() && j10 > 0) {
            try {
                this.f56258q.f();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jC - this.f56258q.c();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean Z(boolean z10, r.b bVar, long j10, r.b bVar2, F.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f56933a.equals(bVar2.f56933a)) {
            if (bVar.b() && bVar3.s(bVar.f56934b)) {
                return (bVar3.h(bVar.f56934b, bVar.f56935c) == 4 || bVar3.h(bVar.f56934b, bVar.f56935c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.s(bVar2.f56934b)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void n0() throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            r15 = this;
            r0 = 0
            r1 = r0
        L2:
            boolean r2 = r15.x1()
            if (r2 == 0) goto L81
            if (r1 == 0) goto Ld
            r15.g0()
        Ld:
            r15.f56243c0 = r0
            androidx.media3.exoplayer.p0 r1 = r15.f56260s
            androidx.media3.exoplayer.m0 r1 = r1.b()
            java.lang.Object r1 = d3.C13466a.e(r1)
            androidx.media3.exoplayer.m0 r1 = (androidx.media3.exoplayer.C6063m0) r1
            androidx.media3.exoplayer.E0 r2 = r15.f56215D
            androidx.media3.exoplayer.source.r$b r2 = r2.f55512b
            java.lang.Object r2 = r2.f56933a
            androidx.media3.exoplayer.n0 r3 = r1.f56338h
            androidx.media3.exoplayer.source.r$b r3 = r3.f56513a
            java.lang.Object r3 = r3.f56933a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L47
            androidx.media3.exoplayer.E0 r2 = r15.f56215D
            androidx.media3.exoplayer.source.r$b r2 = r2.f55512b
            int r4 = r2.f56934b
            r5 = -1
            if (r4 != r5) goto L47
            androidx.media3.exoplayer.n0 r4 = r1.f56338h
            androidx.media3.exoplayer.source.r$b r4 = r4.f56513a
            int r6 = r4.f56934b
            if (r6 != r5) goto L47
            int r2 = r2.f56937e
            int r4 = r4.f56937e
            if (r2 == r4) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r0
        L48:
            androidx.media3.exoplayer.n0 r4 = r1.f56338h
            androidx.media3.exoplayer.source.r$b r6 = r4.f56513a
            long r7 = r4.f56514b
            long r9 = r4.f56515c
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            androidx.media3.exoplayer.E0 r2 = r5.X(r6, r7, r9, r11, r13, r14)
            r5.f56215D = r2
            r15.H0()
            r15.O1()
            boolean r2 = r15.t()
            if (r2 == 0) goto L72
            androidx.media3.exoplayer.p0 r2 = r5.f56260s
            androidx.media3.exoplayer.m0 r2 = r2.x()
            if (r1 != r2) goto L72
            r15.f0()
        L72:
            androidx.media3.exoplayer.E0 r1 = r5.f56215D
            int r1 = r1.f55515e
            r2 = 3
            if (r1 != r2) goto L7c
            r15.C1()
        L7c:
            r15.s()
            r1 = r3
            goto L2
        L81:
            r5 = r15
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6057j0.n0():void");
    }

    private void z() throws ExoPlaybackException {
        for (int i10 = 0; i10 < this.f56238a.length; i10++) {
            y(i10);
        }
        this.f56241b0 = -9223372036854775807L;
    }

    public synchronized boolean A0() {
        if (!this.f56217F && this.f56251j.getThread().isAlive()) {
            this.f56249h.h(7);
            U1(new Be.w() { // from class: androidx.media3.exoplayer.f0
                @Override // Be.w
                public final Object get() {
                    return Boolean.valueOf(this.f56138a.f56217F);
                }
            }, this.f56263v);
            return this.f56217F;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.F0.a
    public synchronized void h(F0 f02) {
        if (!this.f56217F && this.f56251j.getThread().isAlive()) {
            this.f56249h.d(14, f02).a();
            return;
        }
        d3.r.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        f02.j(false);
    }

    public synchronized boolean t1(Object obj, long j10) {
        if (!this.f56217F && this.f56251j.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f56249h.d(30, new Pair(obj, atomicBoolean)).a();
            if (j10 == -9223372036854775807L) {
                return true;
            }
            U1(new Be.w() { // from class: h3.F
                @Override // Be.w
                public final Object get() {
                    return Boolean.valueOf(atomicBoolean.get());
                }
            }, j10);
            return atomicBoolean.get();
        }
        return true;
    }

    /* renamed from: androidx.media3.exoplayer.j0$g */
    private static final class g {

        /* renamed from: a, reason: collision with root package name */
        public final r.b f56286a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56287b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56288c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f56289d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f56290e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f56291f;

        public g(r.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f56286a = bVar;
            this.f56287b = j10;
            this.f56288c = j11;
            this.f56289d = z10;
            this.f56290e = z11;
            this.f56291f = z12;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$h */
    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final a3.F f56292a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56293b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56294c;

        public h(a3.F f10, int i10, long j10) {
            this.f56292a = f10;
            this.f56293b = i10;
            this.f56294c = j10;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x012b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void A() throws androidx.media3.exoplayer.ExoPlaybackException, java.io.IOException {
        /*
            Method dump skipped, instructions count: 461
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6057j0.A():void");
    }

    private boolean A1(boolean z10) {
        if (this.f56228Q == 0) {
            return b0();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f56215D.f55517g) {
            return true;
        }
        C6063m0 c6063m0U = this.f56260s.u();
        long jC = B1(this.f56215D.f55511a, c6063m0U.f56338h.f56513a) ? this.f56262u.c() : -9223372036854775807L;
        C6063m0 c6063m0N = this.f56260s.n();
        boolean z12 = c6063m0N.s() && c6063m0N.f56338h.f56522j;
        if (c6063m0N.f56338h.f56513a.b() && !c6063m0N.f56336f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f56247f.a(new InterfaceC6059k0.a(this.f56264w, this.f56215D.f55511a, c6063m0U.f56338h.f56513a, c6063m0U.C(this.f56230S), M(c6063m0N.j()), this.f56256o.f().f43552a, this.f56215D.f55522l, this.f56220I, jC, this.f56221J));
    }

    private void B(C6063m0 c6063m0, int i10, boolean z10, long j10) throws ExoPlaybackException {
        J0 j02 = this.f56238a[i10];
        if (j02.x()) {
            return;
        }
        boolean z11 = c6063m0 == this.f56260s.u();
        C16853E c16853eP = c6063m0.p();
        h3.K k10 = c16853eP.f159891b[i10];
        s3.y yVar = c16853eP.f159892c[i10];
        boolean z12 = z1() && this.f56215D.f55515e == 3;
        boolean z13 = !z10 && z12;
        this.f56228Q++;
        j02.e(k10, yVar, c6063m0.f56333c[i10], this.f56230S, z13, z11, j10, c6063m0.m(), c6063m0.f56338h.f56513a, this.f56256o);
        j02.n(11, new a(), c6063m0);
        if (z12 && z11) {
            j02.U();
        }
    }

    private void C() throws ExoPlaybackException {
        D(new boolean[this.f56238a.length], this.f56260s.y().n());
    }

    private void C1() throws ExoPlaybackException {
        C6063m0 c6063m0U = this.f56260s.u();
        if (c6063m0U == null) {
            return;
        }
        C16853E c16853eP = c6063m0U.p();
        for (int i10 = 0; i10 < this.f56238a.length; i10++) {
            if (c16853eP.c(i10)) {
                this.f56238a[i10].U();
            }
        }
    }

    private void D(boolean[] zArr, long j10) throws ExoPlaybackException {
        long j11;
        C6063m0 c6063m0Y = this.f56260s.y();
        C16853E c16853eP = c6063m0Y.p();
        for (int i10 = 0; i10 < this.f56238a.length; i10++) {
            if (!c16853eP.c(i10)) {
                this.f56238a[i10].L();
            }
        }
        int i11 = 0;
        while (i11 < this.f56238a.length) {
            if (!c16853eP.c(i11) || this.f56238a[i11].w(c6063m0Y)) {
                j11 = j10;
            } else {
                j11 = j10;
                B(c6063m0Y, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    private void D0(int i10, int i11, p3.s sVar) throws Throwable {
        this.f56216E.b(1);
        T(this.f56261t.A(i10, i11, sVar), false);
    }

    private void E0() throws ExoPlaybackException {
        float f10 = this.f56256o.f().f43552a;
        C6063m0 c6063m0Y = this.f56260s.y();
        C16853E c16853e = null;
        boolean z10 = true;
        for (C6063m0 c6063m0U = this.f56260s.u(); c6063m0U != null && c6063m0U.f56336f; c6063m0U = c6063m0U.k()) {
            E0 e02 = this.f56215D;
            C16853E c16853eZ = c6063m0U.z(f10, e02.f55511a, e02.f55522l);
            if (c6063m0U == this.f56260s.u()) {
                c16853e = c16853eZ;
            }
            if (!c16853eZ.a(c6063m0U.p())) {
                if (z10) {
                    C6063m0 c6063m0U2 = this.f56260s.u();
                    boolean z11 = (this.f56260s.N(c6063m0U2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f56238a.length];
                    long jB = c6063m0U2.b((C16853E) C13466a.e(c16853e), this.f56215D.f55529s, z11, zArr);
                    E0 e03 = this.f56215D;
                    boolean z12 = (e03.f55515e == 4 || jB == e03.f55529s) ? false : true;
                    E0 e04 = this.f56215D;
                    this.f56215D = X(e04.f55512b, jB, e04.f55513c, e04.f55514d, z12, 5);
                    if (z12) {
                        I0(jB);
                    }
                    x();
                    boolean[] zArr2 = new boolean[this.f56238a.length];
                    int i10 = 0;
                    while (true) {
                        J0[] j0Arr = this.f56238a;
                        if (i10 >= j0Arr.length) {
                            break;
                        }
                        int iH = j0Arr[i10].h();
                        zArr2[i10] = this.f56238a[i10].x();
                        this.f56238a[i10].B(c6063m0U2.f56333c[i10], this.f56256o, this.f56230S, zArr[i10]);
                        if (iH - this.f56238a[i10].h() > 0) {
                            j0(i10, false);
                        }
                        this.f56228Q -= iH - this.f56238a[i10].h();
                        i10++;
                    }
                    D(zArr2, this.f56230S);
                    c6063m0U2.f56339i = true;
                } else {
                    this.f56260s.N(c6063m0U);
                    if (c6063m0U.f56336f) {
                        long jMax = Math.max(c6063m0U.f56338h.f56514b, c6063m0U.C(this.f56230S));
                        if (this.f56212A && t() && this.f56260s.x() == c6063m0U) {
                            x();
                        }
                        c6063m0U.a(c16853eZ, jMax, false);
                    }
                }
                R(true);
                if (this.f56215D.f55515e != 4) {
                    d0();
                    O1();
                    this.f56249h.h(2);
                    return;
                }
                return;
            }
            if (c6063m0U == c6063m0Y) {
                z10 = false;
            }
        }
    }

    private Ce.L<a3.y> F(s3.y[] yVarArr) {
        L.a aVar = new L.a();
        boolean z10 = false;
        for (s3.y yVar : yVarArr) {
            if (yVar != null) {
                a3.y yVar2 = yVar.a(0).f43946l;
                if (yVar2 == null) {
                    aVar.a(new a3.y(new y.a[0]));
                } else {
                    aVar.a(yVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : Ce.L.x();
    }

    private void F1() throws ExoPlaybackException {
        this.f56256o.h();
        for (J0 j02 : this.f56238a) {
            j02.W();
        }
    }

    private long G() {
        E0 e02 = this.f56215D;
        return H(e02.f55511a, e02.f55512b.f56933a, e02.f55529s);
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0091 A[PHI: r2 r6 r8
      0x0091: PHI (r2v2 androidx.media3.exoplayer.source.r$b) = (r2v1 androidx.media3.exoplayer.source.r$b), (r2v12 androidx.media3.exoplayer.source.r$b) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r6v3 long) = (r6v2 long), (r6v10 long) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]
      0x0091: PHI (r8v2 long) = (r8v1 long), (r8v7 long) binds: [B:25:0x0067, B:27:0x008c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d8 A[PHI: r0
      0x00d8: PHI (r0v11 a3.F) = (r0v10 a3.F), (r0v10 a3.F), (r0v21 a3.F), (r0v21 a3.F) binds: [B:31:0x009e, B:33:0x00a2, B:35:0x00b3, B:37:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void G0(boolean r34, boolean r35, boolean r36, boolean r37) {
        /*
            Method dump skipped, instructions count: 312
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6057j0.G0(boolean, boolean, boolean, boolean):void");
    }

    private void G1() {
        C6063m0 c6063m0N = this.f56260s.n();
        boolean z10 = this.f56222K || (c6063m0N != null && c6063m0N.f56331a.a());
        E0 e02 = this.f56215D;
        if (z10 != e02.f55517g) {
            this.f56215D = e02.b(z10);
        }
    }

    private long H(a3.F f10, Object obj, long j10) {
        f10.n(f10.h(obj, this.f56253l).f43594c, this.f56252k);
        F.c cVar = this.f56252k;
        if (cVar.f43620f != -9223372036854775807L && cVar.f()) {
            F.c cVar2 = this.f56252k;
            if (cVar2.f43623i) {
                return d3.P.M0(cVar2.a() - this.f56252k.f43620f) - (j10 + this.f56253l.o());
            }
        }
        return -9223372036854775807L;
    }

    private void H0() {
        C6063m0 c6063m0U = this.f56260s.u();
        this.f56219H = c6063m0U != null && c6063m0U.f56338h.f56521i && this.f56218G;
    }

    private void H1(r.b bVar, p3.w wVar, C16853E c16853e) {
        C6063m0 c6063m0 = (C6063m0) C13466a.e(this.f56260s.n());
        this.f56247f.f(new InterfaceC6059k0.a(this.f56264w, this.f56215D.f55511a, bVar, c6063m0 == this.f56260s.u() ? c6063m0.C(this.f56230S) : c6063m0.C(this.f56230S) - c6063m0.f56338h.f56514b, M(c6063m0.j()), this.f56256o.f().f43552a, this.f56215D.f55522l, this.f56220I, B1(this.f56215D.f55511a, c6063m0.f56338h.f56513a) ? this.f56262u.c() : -9223372036854775807L, this.f56221J), wVar, c16853e.f159892c);
    }

    private long I(C6063m0 c6063m0) {
        if (c6063m0 == null) {
            return 0L;
        }
        long jM = c6063m0.m();
        if (!c6063m0.f56336f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            J0[] j0Arr = this.f56238a;
            if (i10 >= j0Arr.length) {
                return jM;
            }
            if (j0Arr[i10].w(c6063m0)) {
                long jK = this.f56238a[i10].k(c6063m0);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i10++;
        }
    }

    private void I0(long j10) throws ExoPlaybackException {
        C6063m0 c6063m0U = this.f56260s.u();
        long jD = c6063m0U == null ? j10 + 1000000000000L : c6063m0U.D(j10);
        this.f56230S = jD;
        this.f56256o.c(jD);
        for (J0 j02 : this.f56238a) {
            j02.M(c6063m0U, this.f56230S);
        }
        u0();
    }

    private void I1(int i10, int i11, List<a3.v> list) throws Throwable {
        this.f56216E.b(1);
        T(this.f56261t.E(i10, i11, list), false);
    }

    private static void J0(a3.F f10, d dVar, F.c cVar, F.b bVar) {
        int i10 = f10.n(f10.h(dVar.f56280d, bVar).f43594c, cVar).f43629o;
        Object obj = f10.g(i10, bVar, true).f43593b;
        long j10 = bVar.f43595d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void J1() throws ExoPlaybackException {
        if (this.f56215D.f55511a.q() || !this.f56261t.t()) {
            return;
        }
        boolean zL0 = l0();
        p0();
        q0();
        r0();
        n0();
        o0(zL0);
    }

    private static boolean K0(d dVar, a3.F f10, a3.F f11, int i10, boolean z10, F.c cVar, F.b bVar) {
        Object obj = dVar.f56280d;
        if (obj == null) {
            Pair<Object, Long> pairN0 = N0(f10, new h(dVar.f56277a.g(), dVar.f56277a.c(), dVar.f56277a.e() == Long.MIN_VALUE ? -9223372036854775807L : d3.P.M0(dVar.f56277a.e())), false, i10, z10, cVar, bVar);
            if (pairN0 == null) {
                return false;
            }
            dVar.b(f10.b(pairN0.first), ((Long) pairN0.second).longValue(), pairN0.first);
            if (dVar.f56277a.e() == Long.MIN_VALUE) {
                J0(f10, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = f10.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f56277a.e() == Long.MIN_VALUE) {
            J0(f10, dVar, cVar, bVar);
            return true;
        }
        dVar.f56278b = iB;
        f11.h(dVar.f56280d, bVar);
        if (bVar.f43597f && f11.n(bVar.f43594c, cVar).f43628n == f11.b(dVar.f56280d)) {
            Pair<Object, Long> pairJ = f10.j(cVar, bVar, f10.h(dVar.f56280d, bVar).f43594c, dVar.f56279c + bVar.o());
            dVar.b(f10.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    private long L() {
        return M(this.f56215D.f55527q);
    }

    private void L1() throws ExoPlaybackException {
        E0 e02 = this.f56215D;
        M1(e02.f55522l, e02.f55524n, e02.f55523m);
    }

    private long M(long j10) {
        C6063m0 c6063m0N = this.f56260s.n();
        if (c6063m0N == null) {
            return 0L;
        }
        return Math.max(0L, j10 - c6063m0N.C(this.f56230S));
    }

    private static g M0(a3.F f10, E0 e02, h hVar, C6069p0 c6069p0, int i10, boolean z10, F.c cVar, F.b bVar) {
        int i11;
        long j10;
        long jG;
        int iA;
        long jLongValue;
        boolean z11;
        boolean z12;
        boolean z13;
        int iA2;
        boolean z14;
        a3.F f11;
        F.b bVar2;
        long j11;
        int i12;
        long jLongValue2;
        int iA3;
        boolean z15;
        boolean z16;
        boolean z17;
        if (f10.q()) {
            return new g(E0.l(), 0L, -9223372036854775807L, false, true, false);
        }
        r.b bVar3 = e02.f55512b;
        Object obj = bVar3.f56933a;
        boolean zC0 = c0(e02, bVar);
        long j12 = (e02.f55512b.b() || zC0) ? e02.f55513c : e02.f55529s;
        if (hVar != null) {
            i11 = -1;
            j10 = -9223372036854775807L;
            Pair<Object, Long> pairN0 = N0(f10, hVar, true, i10, z10, cVar, bVar);
            if (pairN0 == null) {
                iA3 = f10.a(z10);
                jLongValue2 = j12;
                z15 = false;
                z16 = false;
                z17 = true;
            } else {
                if (hVar.f56294c == -9223372036854775807L) {
                    iA3 = f10.h(pairN0.first, bVar).f43594c;
                    jLongValue2 = j12;
                    z15 = false;
                } else {
                    obj = pairN0.first;
                    jLongValue2 = ((Long) pairN0.second).longValue();
                    iA3 = -1;
                    z15 = true;
                }
                z16 = e02.f55515e == 4;
                z17 = false;
            }
            iA = iA3;
            jG = jLongValue2;
            z13 = z15;
            z11 = z16;
            z12 = z17;
        } else {
            i11 = -1;
            j10 = -9223372036854775807L;
            if (e02.f55511a.q()) {
                iA = f10.a(z10);
            } else if (f10.b(obj) == -1) {
                int iO0 = O0(cVar, bVar, i10, z10, obj, e02.f55511a, f10);
                if (iO0 == -1) {
                    iA2 = f10.a(z10);
                    z14 = true;
                } else {
                    iA2 = iO0;
                    z14 = false;
                }
                iA = iA2;
                obj = obj;
                jG = j12;
                z12 = z14;
                z11 = false;
                z13 = false;
            } else if (j12 == -9223372036854775807L) {
                iA = f10.h(obj, bVar).f43594c;
                obj = obj;
            } else if (zC0) {
                e02.f55511a.h(bVar3.f56933a, bVar);
                if (e02.f55511a.n(bVar.f43594c, cVar).f43628n == e02.f55511a.b(bVar3.f56933a)) {
                    Pair<Object, Long> pairJ = f10.j(cVar, bVar, f10.h(obj, bVar).f43594c, bVar.o() + j12);
                    obj = pairJ.first;
                    jLongValue = ((Long) pairJ.second).longValue();
                } else {
                    obj = obj;
                    jLongValue = j12;
                }
                jG = jLongValue;
                iA = -1;
                z11 = false;
                z12 = false;
                z13 = true;
            } else {
                obj = obj;
                jG = j12;
                iA = -1;
                z11 = false;
                z12 = false;
                z13 = false;
            }
            jG = j12;
            z11 = false;
            z12 = false;
            z13 = false;
        }
        if (iA != i11) {
            bVar2 = bVar;
            Pair<Object, Long> pairJ2 = f10.j(cVar, bVar2, iA, -9223372036854775807L);
            f11 = f10;
            obj = pairJ2.first;
            jG = ((Long) pairJ2.second).longValue();
            j11 = j10;
        } else {
            f11 = f10;
            bVar2 = bVar;
            j11 = jG;
        }
        r.b bVarQ = c6069p0.Q(f11, obj, jG);
        int i13 = bVarQ.f56937e;
        boolean z18 = bVar3.f56933a.equals(obj) && !bVar3.b() && !bVarQ.b() && (i13 == i11 || ((i12 = bVar3.f56937e) != i11 && i13 >= i12));
        long j13 = j11;
        r.b bVar4 = bVarQ;
        boolean Z10 = Z(zC0, bVar3, j12, bVar4, f11.h(obj, bVar2), j13);
        if (z18 || Z10) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jG = e02.f55529s;
            } else {
                f11.h(bVar4.f56933a, bVar2);
                jG = bVar4.f56935c == bVar2.l(bVar4.f56934b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, jG, j13, z11, z12, z13);
    }

    private void M1(boolean z10, int i10, int i11) throws ExoPlaybackException {
        N1(z10, this.f56213B.n(z10, this.f56215D.f55515e), i10, i11);
    }

    private void N(int i10) throws ExoPlaybackException {
        E0 e02 = this.f56215D;
        N1(e02.f55522l, i10, e02.f55524n, e02.f55523m);
    }

    private static Pair<Object, Long> N0(a3.F f10, h hVar, boolean z10, int i10, boolean z11, F.c cVar, F.b bVar) {
        Pair<Object, Long> pairJ;
        a3.F f11;
        int iO0;
        a3.F f12 = hVar.f56292a;
        if (f10.q()) {
            return null;
        }
        if (f12.q()) {
            f12 = f10;
        }
        try {
            pairJ = f12.j(cVar, bVar, hVar.f56293b, hVar.f56294c);
            f11 = f12;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (f10.equals(f11)) {
            return pairJ;
        }
        if (f10.b(pairJ.first) != -1) {
            return (f11.h(pairJ.first, bVar).f43597f && f11.n(bVar.f43594c, cVar).f43628n == f11.b(pairJ.first)) ? f10.j(cVar, bVar, f10.h(pairJ.first, bVar).f43594c, hVar.f56294c) : pairJ;
        }
        if (z10 && (iO0 = O0(cVar, bVar, i10, z11, pairJ.first, f11, f10)) != -1) {
            return f10.j(cVar, bVar, iO0, -9223372036854775807L);
        }
        return null;
    }

    private void O() throws ExoPlaybackException {
        w1(this.f56245d0);
    }

    private void O1() throws ExoPlaybackException {
        C6063m0 c6063m0U = this.f56260s.u();
        if (c6063m0U == null) {
            return;
        }
        long j10 = c6063m0U.f56336f ? c6063m0U.f56331a.j() : -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (!c6063m0U.s()) {
                this.f56260s.N(c6063m0U);
                R(false);
                d0();
            }
            I0(j10);
            if (j10 != this.f56215D.f55529s) {
                E0 e02 = this.f56215D;
                long j11 = j10;
                this.f56215D = X(e02.f55512b, j11, e02.f55513c, j11, true, 5);
            }
        } else {
            long jI = this.f56256o.i(c6063m0U != this.f56260s.y());
            this.f56230S = jI;
            long jC = c6063m0U.C(jI);
            k0(this.f56215D.f55529s, jC);
            if (this.f56256o.w()) {
                boolean z10 = !this.f56216E.f56284d;
                E0 e03 = this.f56215D;
                this.f56215D = X(e03.f55512b, jC, e03.f55513c, jC, z10, 6);
            } else {
                this.f56215D.o(jC);
            }
        }
        this.f56215D.f55527q = this.f56260s.n().j();
        this.f56215D.f55528r = L();
        E0 e04 = this.f56215D;
        if (e04.f55522l && e04.f55515e == 3 && B1(e04.f55511a, e04.f55512b) && this.f56215D.f55525o.f43552a == 1.0f) {
            float fB = this.f56262u.b(G(), this.f56215D.f55528r);
            if (this.f56256o.f().f43552a != fB) {
                c1(this.f56215D.f55525o.b(fB));
                V(this.f56215D.f55525o, this.f56256o.f().f43552a, false, false);
            }
        }
    }

    private void P(androidx.media3.exoplayer.source.q qVar) {
        if (this.f56260s.F(qVar)) {
            this.f56260s.K(this.f56230S);
            d0();
        } else if (this.f56260s.G(qVar)) {
            e0();
        }
    }

    private void P0(long j10) {
        long jMin = (this.f56215D.f55515e != 3 || (!this.f56265x && z1())) ? f56211e0 : 1000L;
        if (this.f56265x && z1()) {
            for (J0 j02 : this.f56238a) {
                jMin = Math.min(jMin, d3.P.j1(j02.j(this.f56230S, this.f56231T)));
            }
            if ((this.f56260s.u() != null ? this.f56260s.u().k() : null) != null && this.f56230S + (d3.P.M0(jMin) * this.f56215D.f55525o.f43552a) >= r2.n()) {
                jMin = Math.min(jMin, f56211e0);
            }
        }
        this.f56249h.j(2, j10 + jMin);
    }

    private void R(boolean z10) {
        C6063m0 c6063m0N = this.f56260s.n();
        r.b bVar = c6063m0N == null ? this.f56215D.f55512b : c6063m0N.f56338h.f56513a;
        boolean zEquals = this.f56215D.f55521k.equals(bVar);
        if (!zEquals) {
            this.f56215D = this.f56215D.c(bVar);
        }
        E0 e02 = this.f56215D;
        e02.f55527q = c6063m0N == null ? e02.f55529s : c6063m0N.j();
        this.f56215D.f55528r = L();
        if ((!zEquals || z10) && c6063m0N != null && c6063m0N.f56336f) {
            H1(c6063m0N.f56338h.f56513a, c6063m0N.o(), c6063m0N.p());
        }
    }

    private void R0(boolean z10) throws ExoPlaybackException {
        r.b bVar = this.f56260s.u().f56338h.f56513a;
        long jU0 = U0(bVar, this.f56215D.f55529s, true, false);
        if (jU0 != this.f56215D.f55529s) {
            E0 e02 = this.f56215D;
            this.f56215D = X(bVar, jU0, e02.f55513c, e02.f55514d, z10, 5);
        }
    }

    private void R1(boolean z10, boolean z11) {
        this.f56220I = z10;
        this.f56221J = (!z10 || z11) ? -9223372036854775807L : this.f56258q.c();
    }

    private void S(C6063m0 c6063m0) throws ExoPlaybackException {
        if (!c6063m0.f56336f) {
            float f10 = this.f56256o.f().f43552a;
            E0 e02 = this.f56215D;
            c6063m0.q(f10, e02.f55511a, e02.f55522l);
        }
        H1(c6063m0.f56338h.f56513a, c6063m0.o(), c6063m0.p());
        if (c6063m0 == this.f56260s.u()) {
            I0(c6063m0.f56338h.f56514b);
            C();
            c6063m0.f56339i = true;
            E0 e03 = this.f56215D;
            r.b bVar = e03.f55512b;
            long j10 = c6063m0.f56338h.f56514b;
            this.f56215D = X(bVar, j10, e03.f55513c, j10, false, 5);
        }
        d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void S0(androidx.media3.exoplayer.C6057j0.h r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6057j0.S0(androidx.media3.exoplayer.j0$h):void");
    }

    private boolean S1() throws ExoPlaybackException {
        C6063m0 c6063m0Y = this.f56260s.y();
        C16853E c16853eP = c6063m0Y.p();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            J0[] j0Arr = this.f56238a;
            if (i10 >= j0Arr.length) {
                break;
            }
            int iH = j0Arr[i10].h();
            int iJ = this.f56238a[i10].J(c6063m0Y, c16853eP, this.f56256o);
            if ((iJ & 2) != 0 && this.f56227P) {
                f1(false);
            }
            this.f56228Q -= iH - this.f56238a[i10].h();
            z10 &= (iJ & 1) != 0;
            i10++;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.f56238a.length; i11++) {
                if (c16853eP.c(i11) && !this.f56238a[i11].w(c6063m0Y)) {
                    B(c6063m0Y, i11, false, c6063m0Y.n());
                }
            }
        }
        return z10;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c6  */
    /* JADX WARN: Type inference failed for: r12v0, types: [long] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void T(a3.F r29, boolean r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 569
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6057j0.T(a3.F, boolean):void");
    }

    private long T0(r.b bVar, long j10, boolean z10) throws ExoPlaybackException {
        return U0(bVar, j10, this.f56260s.u() != this.f56260s.y(), z10);
    }

    private void T1(float f10) {
        for (C6063m0 c6063m0U = this.f56260s.u(); c6063m0U != null; c6063m0U = c6063m0U.k()) {
            for (s3.y yVar : c6063m0U.p().f159892c) {
                if (yVar != null) {
                    yVar.d(f10);
                }
            }
        }
    }

    private void U(androidx.media3.exoplayer.source.q qVar) throws ExoPlaybackException {
        if (this.f56260s.F(qVar)) {
            S((C6063m0) C13466a.e(this.f56260s.n()));
            return;
        }
        C6063m0 c6063m0V = this.f56260s.v(qVar);
        if (c6063m0V != null) {
            C13466a.g(!c6063m0V.f56336f);
            float f10 = this.f56256o.f().f43552a;
            E0 e02 = this.f56215D;
            c6063m0V.q(f10, e02.f55511a, e02.f55522l);
            if (this.f56260s.G(qVar)) {
                e0();
            }
        }
    }

    private void V(C5560A c5560a, float f10, boolean z10, boolean z11) throws ExoPlaybackException {
        if (z10) {
            if (z11) {
                this.f56216E.b(1);
            }
            this.f56215D = this.f56215D.g(c5560a);
        }
        T1(c5560a.f43552a);
        for (J0 j02 : this.f56238a) {
            j02.Q(f10, c5560a.f43552a);
        }
    }

    private void W(C5560A c5560a, boolean z10) throws ExoPlaybackException {
        V(c5560a, c5560a.f43552a, true, z10);
    }

    private E0 X(r.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        p3.w wVar;
        C16853E c16853e;
        this.f56233V = (!this.f56233V && j10 == this.f56215D.f55529s && bVar.equals(this.f56215D.f55512b)) ? false : true;
        H0();
        E0 e02 = this.f56215D;
        p3.w wVar2 = e02.f55518h;
        C16853E c16853e2 = e02.f55519i;
        List listX = e02.f55520j;
        if (this.f56261t.t()) {
            C6063m0 c6063m0U = this.f56260s.u();
            p3.w wVarO = c6063m0U == null ? p3.w.f155473d : c6063m0U.o();
            C16853E c16853eP = c6063m0U == null ? this.f56246e : c6063m0U.p();
            List listF = F(c16853eP.f159892c);
            if (c6063m0U != null) {
                C6065n0 c6065n0 = c6063m0U.f56338h;
                if (c6065n0.f56515c != j11) {
                    c6063m0U.f56338h = c6065n0.a(j11);
                }
            }
            m0();
            wVar = wVarO;
            c16853e = c16853eP;
            list = listF;
        } else {
            if (!bVar.equals(this.f56215D.f55512b)) {
                wVar2 = p3.w.f155473d;
                c16853e2 = this.f56246e;
                listX = Ce.L.x();
            }
            list = listX;
            wVar = wVar2;
            c16853e = c16853e2;
        }
        if (z10) {
            this.f56216E.d(i10);
        }
        return this.f56215D.d(bVar, j10, j11, j12, L(), wVar, c16853e, list);
    }

    private boolean Y() {
        C6063m0 c6063m0Y = this.f56260s.y();
        if (!c6063m0Y.f56336f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            J0[] j0Arr = this.f56238a;
            if (i10 >= j0Arr.length) {
                return true;
            }
            if (!j0Arr[i10].o(c6063m0Y)) {
                return false;
            }
            i10++;
        }
    }

    private void Y0(long j10) {
        for (J0 j02 : this.f56238a) {
            j02.N(j10);
        }
    }

    private boolean a0(C6063m0 c6063m0) {
        return (c6063m0 == null || c6063m0.r() || c6063m0.l() == Long.MIN_VALUE) ? false : true;
    }

    private void a1(C5564d c5564d, boolean z10) throws ExoPlaybackException {
        this.f56244d.l(c5564d);
        C6050g c6050g = this.f56213B;
        if (!z10) {
            c5564d = null;
        }
        c6050g.k(c5564d);
        L1();
    }

    private boolean b0() {
        C6063m0 c6063m0U = this.f56260s.u();
        long j10 = c6063m0U.f56338h.f56517e;
        if (c6063m0U.f56336f) {
            return j10 == -9223372036854775807L || this.f56215D.f55529s < j10 || !z1();
        }
        return false;
    }

    private void b1(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f56225N != z10) {
            this.f56225N = z10;
            if (!z10) {
                for (J0 j02 : this.f56238a) {
                    j02.L();
                }
            }
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    private static boolean c0(E0 e02, F.b bVar) {
        r.b bVar2 = e02.f55512b;
        a3.F f10 = e02.f55511a;
        return f10.q() || f10.h(bVar2.f56933a, bVar).f43597f;
    }

    private void c1(C5560A c5560a) {
        this.f56249h.k(16);
        this.f56256o.d(c5560a);
    }

    private void d1(b bVar) throws Throwable {
        this.f56216E.b(1);
        if (bVar.f56271c != -1) {
            this.f56229R = new h(new G0(bVar.f56269a, bVar.f56270b), bVar.f56271c, bVar.f56272d);
        }
        T(this.f56261t.C(bVar.f56269a, bVar.f56270b), false);
    }

    private void e0() {
        this.f56260s.I();
        C6063m0 c6063m0W = this.f56260s.w();
        if (c6063m0W != null) {
            if ((!c6063m0W.f56335e || c6063m0W.f56336f) && !c6063m0W.f56331a.a()) {
                if (this.f56247f.e(this.f56215D.f55511a, c6063m0W.f56338h.f56513a, c6063m0W.f56336f ? c6063m0W.f56331a.d() : 0L)) {
                    if (c6063m0W.f56335e) {
                        c6063m0W.e(new C6061l0.b().f(c6063m0W.C(this.f56230S)).g(this.f56256o.f().f43552a).e(this.f56221J).d());
                    } else {
                        c6063m0W.v(this, c6063m0W.f56338h.f56514b);
                    }
                }
            }
        }
    }

    private void f0() throws ExoPlaybackException {
        for (J0 j02 : this.f56238a) {
            j02.D();
        }
    }

    private void f1(boolean z10) {
        if (z10 == this.f56227P) {
            return;
        }
        this.f56227P = z10;
        if (z10 || !this.f56215D.f55526p) {
            return;
        }
        this.f56249h.h(2);
    }

    private void g0() {
        this.f56216E.c(this.f56215D);
        if (this.f56216E.f56281a) {
            this.f56259r.a(this.f56216E);
            this.f56216E = new e(this.f56215D);
        }
    }

    private void g1(boolean z10) throws ExoPlaybackException {
        this.f56218G = z10;
        H0();
        if (!this.f56219H || this.f56260s.y() == this.f56260s.u()) {
            return;
        }
        R0(true);
        R(false);
    }

    private void h0() throws ExoPlaybackException {
        C6063m0 c6063m0X = this.f56260s.x();
        if (c6063m0X == null) {
            return;
        }
        C16853E c16853eP = c6063m0X.p();
        for (int i10 = 0; i10 < this.f56238a.length; i10++) {
            if (c16853eP.c(i10) && this.f56238a[i10].s() && !this.f56238a[i10].u()) {
                this.f56238a[i10].V();
                B(c6063m0X, i10, false, c6063m0X.n());
            }
        }
        if (t()) {
            this.f56241b0 = c6063m0X.f56331a.j();
            if (c6063m0X.s()) {
                return;
            }
            this.f56260s.N(c6063m0X);
            R(false);
            d0();
        }
    }

    private void i0(int i10) throws ExoPlaybackException, IOException {
        J0 j02 = this.f56238a[i10];
        try {
            j02.G((C6063m0) C13466a.e(this.f56260s.u()));
        } catch (IOException | RuntimeException e10) {
            int iM = j02.m();
            if (iM != 3 && iM != 5) {
                throw e10;
            }
            C16853E c16853eP = this.f56260s.u().p();
            d3.r.e("ExoPlayerImplInternal", "Disabling track due to error: " + a3.t.h(c16853eP.f159892c[i10].j()), e10);
            C16853E c16853e = new C16853E((h3.K[]) c16853eP.f159891b.clone(), (s3.y[]) c16853eP.f159892c.clone(), c16853eP.f159893d, c16853eP.f159894e);
            c16853e.f159891b[i10] = null;
            c16853e.f159892c[i10] = null;
            y(i10);
            this.f56260s.u().a(c16853e, this.f56215D.f55529s, false);
        }
    }

    private void i1(boolean z10, int i10, boolean z11, int i11) throws ExoPlaybackException {
        this.f56216E.b(z11 ? 1 : 0);
        M1(z10, i10, i11);
    }

    private void j0(final int i10, final boolean z10) {
        boolean[] zArr = this.f56242c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f56267z.post(new Runnable() { // from class: androidx.media3.exoplayer.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C6057j0 c6057j0 = this.f56148a;
                    int i11 = i10;
                    c6057j0.f56266y.N(i11, c6057j0.f56238a[i11].m(), z10);
                }
            });
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0079, code lost:
    
        r3 = null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void k0(long r9, long r11) throws androidx.media3.exoplayer.ExoPlaybackException {
        /*
            Method dump skipped, instructions count: 253
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6057j0.k0(long, long):void");
    }

    private boolean l0() throws ExoPlaybackException {
        C6065n0 c6065n0T;
        this.f56260s.K(this.f56230S);
        boolean z10 = false;
        if (this.f56260s.T() && (c6065n0T = this.f56260s.t(this.f56230S, this.f56215D)) != null) {
            C6063m0 c6063m0H = this.f56260s.h(c6065n0T);
            if (!c6063m0H.f56335e) {
                c6063m0H.v(this, c6065n0T.f56514b);
            } else if (c6063m0H.f56336f) {
                this.f56249h.d(8, c6063m0H.f56331a).a();
            }
            if (this.f56260s.u() == c6063m0H) {
                I0(c6065n0T.f56514b);
            }
            R(false);
            z10 = true;
        }
        if (!this.f56222K) {
            d0();
            return z10;
        }
        this.f56222K = a0(this.f56260s.n());
        G1();
        return z10;
    }

    private void l1(ExoPlayer.c cVar) {
        this.f56237Z = cVar;
        this.f56260s.V(this.f56215D.f55511a, cVar);
    }

    private void m0() {
        boolean z10;
        C6063m0 c6063m0U = this.f56260s.u();
        if (c6063m0U != null) {
            C16853E c16853eP = c6063m0U.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f56238a.length) {
                    z10 = true;
                    break;
                }
                if (c16853eP.c(i10)) {
                    if (this.f56238a[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (c16853eP.f159891b[i10].f134197a != 0) {
                        z12 = true;
                    }
                }
                i10++;
            }
            if (z12 && z10) {
                z11 = true;
            }
            f1(z11);
        }
    }

    private void n1(int i10) throws ExoPlaybackException {
        this.f56223L = i10;
        int iX = this.f56260s.X(this.f56215D.f55511a, i10);
        if ((iX & 1) != 0) {
            R0(true);
        } else if ((iX & 2) != 0) {
            x();
        }
        R(false);
    }

    private void o0(boolean z10) {
        if (this.f56237Z.f55575a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f56215D.f55511a.equals(this.f56239a0)) {
            a3.F f10 = this.f56215D.f55511a;
            this.f56239a0 = f10;
            this.f56260s.B(f10);
        }
        e0();
    }

    private void o1(h3.M m10) {
        this.f56214C = m10;
    }

    private void p0() throws ExoPlaybackException {
        C6063m0 c6063m0X;
        if (this.f56219H || !this.f56212A || this.f56243c0 || t() || (c6063m0X = this.f56260s.x()) == null || c6063m0X != this.f56260s.y() || c6063m0X.k() == null || !c6063m0X.k().f56336f) {
            return;
        }
        this.f56260s.c();
        h0();
    }

    private void q0() throws ExoPlaybackException {
        C6063m0 c6063m0Y = this.f56260s.y();
        if (c6063m0Y == null) {
            return;
        }
        int i10 = 0;
        if (c6063m0Y.k() == null || this.f56219H) {
            if (c6063m0Y.f56338h.f56522j || this.f56219H) {
                J0[] j0Arr = this.f56238a;
                int length = j0Arr.length;
                while (i10 < length) {
                    J0 j02 = j0Arr[i10];
                    if (j02.w(c6063m0Y) && j02.r(c6063m0Y)) {
                        long j10 = c6063m0Y.f56338h.f56517e;
                        j02.O(c6063m0Y, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : c6063m0Y.m() + c6063m0Y.f56338h.f56517e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (Y()) {
            if (t() && this.f56260s.x() == this.f56260s.y()) {
                return;
            }
            if (c6063m0Y.k().f56336f || this.f56230S >= c6063m0Y.k().n()) {
                C16853E c16853eP = c6063m0Y.p();
                C6063m0 c6063m0D = this.f56260s.d();
                C16853E c16853eP2 = c6063m0D.p();
                a3.F f10 = this.f56215D.f55511a;
                P1(f10, c6063m0D.f56338h.f56513a, f10, c6063m0Y.f56338h.f56513a, -9223372036854775807L, false);
                if (c6063m0D.f56336f && ((this.f56212A && this.f56241b0 != -9223372036854775807L) || c6063m0D.f56331a.j() != -9223372036854775807L)) {
                    this.f56241b0 = -9223372036854775807L;
                    boolean z10 = this.f56212A && !this.f56243c0;
                    if (z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= this.f56238a.length) {
                                break;
                            }
                            if (c16853eP2.c(i11) && !a3.z.a(c16853eP2.f159892c[i11].j().f43949o, c16853eP2.f159892c[i11].j().f43945k) && !this.f56238a[i11].u()) {
                                z10 = false;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (!z10) {
                        Y0(c6063m0D.n());
                        if (c6063m0D.s()) {
                            return;
                        }
                        this.f56260s.N(c6063m0D);
                        R(false);
                        d0();
                        return;
                    }
                }
                J0[] j0Arr2 = this.f56238a;
                int length2 = j0Arr2.length;
                while (i10 < length2) {
                    j0Arr2[i10].F(c16853eP, c16853eP2, c6063m0D.n());
                    i10++;
                }
            }
        }
    }

    private void q1(boolean z10) throws ExoPlaybackException {
        this.f56224M = z10;
        int iY = this.f56260s.Y(this.f56215D.f55511a, z10);
        if ((iY & 1) != 0) {
            R0(true);
        } else if ((iY & 2) != 0) {
            x();
        }
        R(false);
    }

    private void r(b bVar, int i10) throws Throwable {
        this.f56216E.b(1);
        D0 d02 = this.f56261t;
        if (i10 == -1) {
            i10 = d02.r();
        }
        T(d02.f(i10, bVar.f56269a, bVar.f56270b), false);
    }

    private void r0() throws ExoPlaybackException {
        C6063m0 c6063m0Y = this.f56260s.y();
        if (c6063m0Y == null || this.f56260s.u() == c6063m0Y || c6063m0Y.f56339i || !S1()) {
            return;
        }
        this.f56260s.y().f56339i = true;
    }

    private void r1(p3.s sVar) throws Throwable {
        this.f56216E.b(1);
        T(this.f56261t.D(sVar), false);
    }

    private void s() {
        C16853E c16853eP = this.f56260s.u().p();
        for (int i10 = 0; i10 < this.f56238a.length; i10++) {
            if (c16853eP.c(i10)) {
                this.f56238a[i10].f();
            }
        }
    }

    private void s0() throws Throwable {
        T(this.f56261t.i(), true);
    }

    private void s1(int i10) {
        E0 e02 = this.f56215D;
        if (e02.f55515e != i10) {
            if (i10 != 2) {
                this.f56236Y = -9223372036854775807L;
            }
            this.f56215D = e02.h(i10);
        }
    }

    private boolean t() {
        if (!this.f56212A) {
            return false;
        }
        for (J0 j02 : this.f56238a) {
            if (j02.u()) {
                return true;
            }
        }
        return false;
    }

    private void t0(c cVar) throws Throwable {
        this.f56216E.b(1);
        T(this.f56261t.v(cVar.f56273a, cVar.f56274b, cVar.f56275c, cVar.f56276d), false);
    }

    private void u0() {
        for (C6063m0 c6063m0U = this.f56260s.u(); c6063m0U != null; c6063m0U = c6063m0U.k()) {
            for (s3.y yVar : c6063m0U.p().f159892c) {
                if (yVar != null) {
                    yVar.e();
                }
            }
        }
    }

    private void u1(Object obj, AtomicBoolean atomicBoolean) throws ExoPlaybackException {
        for (J0 j02 : this.f56238a) {
            j02.S(obj);
        }
        int i10 = this.f56215D.f55515e;
        if (i10 == 3 || i10 == 2) {
            this.f56249h.h(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6063m0 v(C6065n0 c6065n0, long j10) {
        return new C6063m0(this.f56240b, j10, this.f56244d, this.f56247f.k(), this.f56261t, c6065n0, this.f56246e, this.f56237Z.f55575a);
    }

    private void v0(boolean z10) {
        for (C6063m0 c6063m0U = this.f56260s.u(); c6063m0U != null; c6063m0U = c6063m0U.k()) {
            for (s3.y yVar : c6063m0U.p().f159892c) {
                if (yVar != null) {
                    yVar.h(z10);
                }
            }
        }
    }

    private void w0() {
        for (C6063m0 c6063m0U = this.f56260s.u(); c6063m0U != null; c6063m0U = c6063m0U.k()) {
            for (s3.y yVar : c6063m0U.p().f159892c) {
                if (yVar != null) {
                    yVar.k();
                }
            }
        }
    }

    private void w1(float f10) throws ExoPlaybackException {
        this.f56245d0 = f10;
        float f11 = f10 * this.f56213B.f();
        for (J0 j02 : this.f56238a) {
            j02.T(f11);
        }
    }

    private void x() {
        if (this.f56212A && t()) {
            for (J0 j02 : this.f56238a) {
                int iH = j02.h();
                j02.c(this.f56256o);
                this.f56228Q -= iH - j02.h();
            }
            this.f56241b0 = -9223372036854775807L;
        }
    }

    private void y(int i10) throws ExoPlaybackException {
        int iH = this.f56238a[i10].h();
        this.f56238a[i10].b(this.f56256o);
        j0(i10, false);
        this.f56228Q -= iH;
    }

    private boolean y1() {
        if (!a0(this.f56260s.n())) {
            return false;
        }
        C6063m0 c6063m0N = this.f56260s.n();
        long jM = M(c6063m0N.l());
        InterfaceC6059k0.a aVar = new InterfaceC6059k0.a(this.f56264w, this.f56215D.f55511a, c6063m0N.f56338h.f56513a, c6063m0N == this.f56260s.u() ? c6063m0N.C(this.f56230S) : c6063m0N.C(this.f56230S) - c6063m0N.f56338h.f56514b, jM, this.f56256o.f().f43552a, this.f56215D.f55522l, this.f56220I, B1(this.f56215D.f55511a, c6063m0N.f56338h.f56513a) ? this.f56262u.c() : -9223372036854775807L, this.f56221J);
        boolean zM = this.f56247f.m(aVar);
        C6063m0 c6063m0U = this.f56260s.u();
        if (zM || !c6063m0U.f56336f || jM >= 500000) {
            return zM;
        }
        if (this.f56254m <= 0 && !this.f56255n) {
            return zM;
        }
        c6063m0U.f56331a.u(this.f56215D.f55529s, false);
        return this.f56247f.m(aVar);
    }

    private void z0() throws ExoPlaybackException {
        this.f56216E.b(1);
        G0(false, false, false, true);
        this.f56247f.i(this.f56264w);
        s1(this.f56215D.f55511a.q() ? 4 : 2);
        L1();
        this.f56261t.w(this.f56248g.c());
        this.f56249h.h(2);
    }

    private boolean z1() {
        E0 e02 = this.f56215D;
        return e02.f55522l && e02.f55524n == 0;
    }

    public void D1() {
        this.f56249h.a(6).a();
    }

    public void E(long j10) {
        this.f56235X = j10;
    }

    public Looper K() {
        return this.f56251j;
    }

    public void Q0(a3.F f10, int i10, long j10) {
        this.f56249h.d(3, new h(f10, i10, j10)).a();
    }

    public void Z0(C5564d c5564d, boolean z10) {
        this.f56249h.c(31, z10 ? 1 : 0, 0, c5564d).a();
    }

    @Override // s3.AbstractC16852D.a
    public void a(H0 h02) {
        this.f56249h.h(26);
    }

    @Override // s3.AbstractC16852D.a
    public void b() {
        this.f56249h.h(10);
    }

    @Override // androidx.media3.exoplayer.D0.d
    public void c() {
        this.f56249h.k(2);
        this.f56249h.h(22);
    }

    @Override // androidx.media3.exoplayer.C6050g.a
    public void d(float f10) {
        this.f56249h.h(34);
    }

    @Override // androidx.media3.exoplayer.C6050g.a
    public void e(int i10) {
        this.f56249h.g(33, i10, 0).a();
    }

    public void e1(List<D0.c> list, int i10, long j10, p3.s sVar) {
        this.f56249h.d(17, new b(list, sVar, i10, j10, null)).a();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(androidx.media3.exoplayer.source.q qVar) {
        this.f56249h.d(8, qVar).a();
    }

    public void h1(boolean z10, int i10, int i11) {
        this.f56249h.g(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x025f  */
    @Override // android.os.Handler.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean handleMessage(android.os.Message r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 780
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6057j0.handleMessage(android.os.Message):boolean");
    }

    public void j1(C5560A c5560a) {
        this.f56249h.d(4, c5560a).a();
    }

    @Override // androidx.media3.exoplayer.C6058k.a
    public void m(C5560A c5560a) {
        this.f56249h.d(16, c5560a).a();
    }

    public void m1(int i10) {
        this.f56249h.g(11, i10, 0).a();
    }

    public void p1(boolean z10) {
        this.f56249h.g(12, z10 ? 1 : 0, 0).a();
    }

    public void v1(float f10) {
        this.f56249h.d(32, Float.valueOf(f10)).a();
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void g(androidx.media3.exoplayer.source.q qVar) {
        this.f56249h.d(9, qVar).a();
    }

    public void y0() {
        this.f56249h.a(29).a();
    }

    private boolean B1(a3.F f10, r.b bVar) {
        if (!bVar.b() && !f10.q()) {
            f10.n(f10.h(bVar.f56933a, this.f56253l).f43594c, this.f56252k);
            if (this.f56252k.f()) {
                F.c cVar = this.f56252k;
                if (cVar.f43623i && cVar.f43620f != -9223372036854775807L) {
                    return true;
                }
            }
        }
        return false;
    }

    private void F0() throws ExoPlaybackException {
        E0();
        R0(true);
    }

    private Pair<r.b, Long> J(a3.F f10) {
        long jG = 0;
        if (f10.q()) {
            return Pair.create(E0.l(), 0L);
        }
        Pair<Object, Long> pairJ = f10.j(this.f56252k, this.f56253l, f10.a(this.f56224M), -9223372036854775807L);
        r.b bVarQ = this.f56260s.Q(f10, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarQ.b()) {
            f10.h(bVarQ.f56933a, this.f56253l);
            if (bVarQ.f56935c == this.f56253l.l(bVarQ.f56934b)) {
                jG = this.f56253l.g();
            }
            jLongValue = jG;
        }
        return Pair.create(bVarQ, Long.valueOf(jLongValue));
    }

    private void L0(a3.F f10, a3.F f11) {
        if (f10.q() && f11.q()) {
            return;
        }
        int size = this.f56257p.size() - 1;
        while (size >= 0) {
            a3.F f12 = f10;
            a3.F f13 = f11;
            if (!K0(this.f56257p.get(size), f12, f13, this.f56223L, this.f56224M, this.f56252k, this.f56253l)) {
                this.f56257p.get(size).f56277a.j(false);
                this.f56257p.remove(size);
            }
            size--;
            f10 = f12;
            f11 = f13;
        }
        Collections.sort(this.f56257p);
    }

    static int O0(F.c cVar, F.b bVar, int i10, boolean z10, Object obj, a3.F f10, a3.F f11) {
        F.b bVar2;
        Object obj2 = f10.n(f10.h(obj, bVar).f43594c, cVar).f43615a;
        int i11 = 0;
        for (int i12 = 0; i12 < f11.p(); i12++) {
            if (f11.n(i12, cVar).f43615a.equals(obj2)) {
                return i12;
            }
        }
        int iB = f10.b(obj);
        int i13 = f10.i();
        int iD = iB;
        int iB2 = -1;
        while (i11 < i13 && iB2 == -1) {
            F.c cVar2 = cVar;
            bVar2 = bVar;
            int i14 = i10;
            boolean z11 = z10;
            a3.F f12 = f10;
            iD = f12.d(iD, bVar2, cVar2, i14, z11);
            if (iD == -1) {
                break;
            }
            iB2 = f11.b(f12.m(iD));
            i11++;
            f10 = f12;
            bVar = bVar2;
            cVar = cVar2;
            i10 = i14;
            z10 = z11;
        }
        bVar2 = bVar;
        if (iB2 == -1) {
            return -1;
        }
        return f11.f(iB2, bVar2).f43594c;
    }

    private void P1(a3.F f10, r.b bVar, a3.F f11, r.b bVar2, long j10, boolean z10) throws ExoPlaybackException {
        Object obj;
        C5560A c5560a;
        if (!B1(f10, bVar)) {
            if (bVar.b()) {
                c5560a = C5560A.f43549d;
            } else {
                c5560a = this.f56215D.f55525o;
            }
            if (!this.f56256o.f().equals(c5560a)) {
                c1(c5560a);
                V(this.f56215D.f55525o, c5560a.f43552a, false, false);
                return;
            }
            return;
        }
        f10.n(f10.h(bVar.f56933a, this.f56253l).f43594c, this.f56252k);
        this.f56262u.a((v.g) d3.P.h(this.f56252k.f43624j));
        if (j10 != -9223372036854775807L) {
            this.f56262u.e(H(f10, bVar.f56933a, j10));
            return;
        }
        Object obj2 = this.f56252k.f43615a;
        if (!f11.q()) {
            obj = f11.n(f11.h(bVar2.f56933a, this.f56253l).f43594c, this.f56252k).f43615a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj2) && !z10) {
            return;
        }
        this.f56262u.e(-9223372036854775807L);
    }

    private void Q(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionC = ExoPlaybackException.c(iOException, i10);
        C6063m0 c6063m0U = this.f56260s.u();
        if (c6063m0U != null) {
            exoPlaybackExceptionC = exoPlaybackExceptionC.a(c6063m0U.f56338h.f56513a);
        }
        d3.r.e("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionC);
        E1(false, false);
        this.f56215D = this.f56215D.f(exoPlaybackExceptionC);
    }

    private long U0(r.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        F1();
        R1(false, true);
        if (z11 || this.f56215D.f55515e == 3) {
            s1(2);
        }
        C6063m0 c6063m0U = this.f56260s.u();
        C6063m0 c6063m0K = c6063m0U;
        while (c6063m0K != null && !bVar.equals(c6063m0K.f56338h.f56513a)) {
            c6063m0K = c6063m0K.k();
        }
        if (z10 || c6063m0U != c6063m0K || (c6063m0K != null && c6063m0K.D(j10) < 0)) {
            z();
            if (c6063m0K != null) {
                while (this.f56260s.u() != c6063m0K) {
                    this.f56260s.b();
                }
                this.f56260s.N(c6063m0K);
                c6063m0K.B(1000000000000L);
                C();
                c6063m0K.f56339i = true;
            }
        }
        x();
        if (c6063m0K != null) {
            this.f56260s.N(c6063m0K);
            if (!c6063m0K.f56336f) {
                c6063m0K.f56338h = c6063m0K.f56338h.b(j10);
            } else if (c6063m0K.f56337g) {
                j10 = c6063m0K.f56331a.h(j10);
                c6063m0K.f56331a.u(j10 - this.f56254m, this.f56255n);
            }
            I0(j10);
            d0();
        } else {
            this.f56260s.g();
            I0(j10);
        }
        R(false);
        this.f56249h.h(2);
        return j10;
    }

    private void V0(F0 f02) throws ExoPlaybackException {
        if (f02.e() == -9223372036854775807L) {
            W0(f02);
            return;
        }
        if (this.f56215D.f55511a.q()) {
            this.f56257p.add(new d(f02));
            return;
        }
        d dVar = new d(f02);
        a3.F f10 = this.f56215D.f55511a;
        if (K0(dVar, f10, f10, this.f56223L, this.f56224M, this.f56252k, this.f56253l)) {
            this.f56257p.add(dVar);
            Collections.sort(this.f56257p);
        } else {
            f02.j(false);
        }
    }

    private void W0(F0 f02) throws ExoPlaybackException {
        if (f02.b() == this.f56251j) {
            w(f02);
            int i10 = this.f56215D.f55515e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            this.f56249h.h(2);
            return;
        }
        this.f56249h.d(15, f02).a();
    }

    private void X0(final F0 f02) {
        Looper looperB = f02.b();
        if (!looperB.getThread().isAlive()) {
            d3.r.i("TAG", "Trying to send message on a dead thread.");
            f02.j(false);
        } else {
            this.f56258q.e(looperB, null).post(new Runnable() { // from class: androidx.media3.exoplayer.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C6057j0.k(this.f56195a, f02);
                }
            });
        }
    }

    private void d0() {
        boolean zY1 = y1();
        this.f56222K = zY1;
        if (zY1) {
            C6063m0 c6063m0 = (C6063m0) C13466a.e(this.f56260s.n());
            c6063m0.e(new C6061l0.b().f(c6063m0.C(this.f56230S)).g(this.f56256o.f().f43552a).e(this.f56221J).d());
        }
        G1();
    }

    public static /* synthetic */ void k(C6057j0 c6057j0, F0 f02) {
        c6057j0.getClass();
        try {
            c6057j0.w(f02);
        } catch (ExoPlaybackException e10) {
            d3.r.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void k1(C5560A c5560a) throws ExoPlaybackException {
        c1(c5560a);
        W(this.f56256o.f(), true);
    }

    private void u() throws ExoPlaybackException {
        F0();
    }

    private void w(F0 f02) throws ExoPlaybackException {
        if (f02.i()) {
            return;
        }
        try {
            f02.f().x(f02.h(), f02.d());
        } finally {
            f02.j(true);
        }
    }

    private boolean x1() {
        C6063m0 c6063m0U;
        C6063m0 c6063m0K;
        if (!z1() || this.f56219H || (c6063m0U = this.f56260s.u()) == null || (c6063m0K = c6063m0U.k()) == null || this.f56230S < c6063m0K.n() || !c6063m0K.f56339i) {
            return false;
        }
        return true;
    }
}
