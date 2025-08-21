package androidx.media3.exoplayer;

import Ee.L;
import a3.C5643A;
import a3.C5647d;
import a3.F;
import a3.v;
import a3.y;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.media3.exoplayer.C6192g;
import androidx.media3.exoplayer.C6200k;
import androidx.media3.exoplayer.C6203l0;
import androidx.media3.exoplayer.C6205m0;
import androidx.media3.exoplayer.D0;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.F0;
import androidx.media3.exoplayer.H0;
import androidx.media3.exoplayer.I0;
import androidx.media3.exoplayer.InterfaceC6201k0;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.r;
import d3.C13599a;
import d3.InterfaceC13606h;
import d3.InterfaceC13612n;
import i3.E1;
import i3.InterfaceC14599a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;
import s3.AbstractC16998D;
import s3.C16999E;

/* renamed from: androidx.media3.exoplayer.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C6199j0 implements Handler.Callback, q.a, AbstractC16998D.a, D0.d, C6200k.a, F0.a, C6192g.a {

    /* renamed from: e0, reason: collision with root package name */
    private static final long f56435e0 = d3.P.j1(10000);

    /* renamed from: A, reason: collision with root package name */
    private final boolean f56436A;

    /* renamed from: B, reason: collision with root package name */
    private final C6192g f56437B;

    /* renamed from: C, reason: collision with root package name */
    private h3.M f56438C;

    /* renamed from: D, reason: collision with root package name */
    private E0 f56439D;

    /* renamed from: E, reason: collision with root package name */
    private e f56440E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f56441F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f56442G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f56443H;

    /* renamed from: I, reason: collision with root package name */
    private boolean f56444I;

    /* renamed from: K, reason: collision with root package name */
    private boolean f56446K;

    /* renamed from: L, reason: collision with root package name */
    private int f56447L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f56448M;

    /* renamed from: N, reason: collision with root package name */
    private boolean f56449N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f56450O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f56451P;

    /* renamed from: Q, reason: collision with root package name */
    private int f56452Q;

    /* renamed from: R, reason: collision with root package name */
    private h f56453R;

    /* renamed from: S, reason: collision with root package name */
    private long f56454S;

    /* renamed from: T, reason: collision with root package name */
    private long f56455T;

    /* renamed from: U, reason: collision with root package name */
    private int f56456U;

    /* renamed from: V, reason: collision with root package name */
    private boolean f56457V;

    /* renamed from: W, reason: collision with root package name */
    private ExoPlaybackException f56458W;

    /* renamed from: X, reason: collision with root package name */
    private long f56459X;

    /* renamed from: Z, reason: collision with root package name */
    private ExoPlayer.c f56461Z;

    /* renamed from: a, reason: collision with root package name */
    private final J0[] f56462a;

    /* renamed from: b, reason: collision with root package name */
    private final I0[] f56464b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean[] f56466c;

    /* renamed from: c0, reason: collision with root package name */
    private boolean f56467c0;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC16998D f56468d;

    /* renamed from: e, reason: collision with root package name */
    private final C16999E f56470e;

    /* renamed from: f, reason: collision with root package name */
    private final InterfaceC6201k0 f56471f;

    /* renamed from: g, reason: collision with root package name */
    private final t3.d f56472g;

    /* renamed from: h, reason: collision with root package name */
    private final InterfaceC13612n f56473h;

    /* renamed from: i, reason: collision with root package name */
    private final h3.J f56474i;

    /* renamed from: j, reason: collision with root package name */
    private final Looper f56475j;

    /* renamed from: k, reason: collision with root package name */
    private final F.c f56476k;

    /* renamed from: l, reason: collision with root package name */
    private final F.b f56477l;

    /* renamed from: m, reason: collision with root package name */
    private final long f56478m;

    /* renamed from: n, reason: collision with root package name */
    private final boolean f56479n;

    /* renamed from: o, reason: collision with root package name */
    private final C6200k f56480o;

    /* renamed from: p, reason: collision with root package name */
    private final ArrayList<d> f56481p;

    /* renamed from: q, reason: collision with root package name */
    private final InterfaceC13606h f56482q;

    /* renamed from: r, reason: collision with root package name */
    private final f f56483r;

    /* renamed from: s, reason: collision with root package name */
    private final C6211p0 f56484s;

    /* renamed from: t, reason: collision with root package name */
    private final D0 f56485t;

    /* renamed from: u, reason: collision with root package name */
    private final h3.H f56486u;

    /* renamed from: v, reason: collision with root package name */
    private final long f56487v;

    /* renamed from: w, reason: collision with root package name */
    private final E1 f56488w;

    /* renamed from: x, reason: collision with root package name */
    private final boolean f56489x;

    /* renamed from: y, reason: collision with root package name */
    private final InterfaceC14599a f56490y;

    /* renamed from: z, reason: collision with root package name */
    private final InterfaceC13612n f56491z;

    /* renamed from: b0, reason: collision with root package name */
    private long f56465b0 = -9223372036854775807L;

    /* renamed from: d0, reason: collision with root package name */
    private float f56469d0 = 1.0f;

    /* renamed from: Y, reason: collision with root package name */
    private long f56460Y = -9223372036854775807L;

    /* renamed from: J, reason: collision with root package name */
    private long f56445J = -9223372036854775807L;

    /* renamed from: a0, reason: collision with root package name */
    private a3.F f56463a0 = a3.F.f44401a;

    /* renamed from: androidx.media3.exoplayer.j0$a */
    class a implements H0.a {
        a() {
        }

        @Override // androidx.media3.exoplayer.H0.a
        public void a() {
            C6199j0.this.f56450O = true;
        }

        @Override // androidx.media3.exoplayer.H0.a
        public void b() {
            if (C6199j0.this.f56489x || C6199j0.this.f56451P) {
                C6199j0.this.f56473h.h(2);
            }
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$b */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final List<D0.c> f56493a;

        /* renamed from: b, reason: collision with root package name */
        private final p3.s f56494b;

        /* renamed from: c, reason: collision with root package name */
        private final int f56495c;

        /* renamed from: d, reason: collision with root package name */
        private final long f56496d;

        /* synthetic */ b(List list, p3.s sVar, int i10, long j10, a aVar) {
            this(list, sVar, i10, j10);
        }

        private b(List<D0.c> list, p3.s sVar, int i10, long j10) {
            this.f56493a = list;
            this.f56494b = sVar;
            this.f56495c = i10;
            this.f56496d = j10;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$c */
    private static class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f56497a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56498b;

        /* renamed from: c, reason: collision with root package name */
        public final int f56499c;

        /* renamed from: d, reason: collision with root package name */
        public final p3.s f56500d;
    }

    /* renamed from: androidx.media3.exoplayer.j0$d */
    private static final class d implements Comparable<d> {

        /* renamed from: a, reason: collision with root package name */
        public final F0 f56501a;

        /* renamed from: b, reason: collision with root package name */
        public int f56502b;

        /* renamed from: c, reason: collision with root package name */
        public long f56503c;

        /* renamed from: d, reason: collision with root package name */
        public Object f56504d;

        @Override // java.lang.Comparable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            Object obj = this.f56504d;
            if ((obj == null) != (dVar.f56504d == null)) {
                return obj != null ? -1 : 1;
            }
            if (obj == null) {
                return 0;
            }
            int i10 = this.f56502b - dVar.f56502b;
            return i10 != 0 ? i10 : d3.P.m(this.f56503c, dVar.f56503c);
        }

        public void b(int i10, long j10, Object obj) {
            this.f56502b = i10;
            this.f56503c = j10;
            this.f56504d = obj;
        }

        public d(F0 f02) {
            this.f56501a = f02;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$e */
    public static final class e {

        /* renamed from: a, reason: collision with root package name */
        private boolean f56505a;

        /* renamed from: b, reason: collision with root package name */
        public E0 f56506b;

        /* renamed from: c, reason: collision with root package name */
        public int f56507c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f56508d;

        /* renamed from: e, reason: collision with root package name */
        public int f56509e;

        public void b(int i10) {
            this.f56505a |= i10 > 0;
            this.f56507c += i10;
        }

        public void c(E0 e02) {
            this.f56505a |= this.f56506b != e02;
            this.f56506b = e02;
        }

        public void d(int i10) {
            if (this.f56508d && this.f56509e != 5) {
                C13599a.a(i10 == 5);
                return;
            }
            this.f56505a = true;
            this.f56508d = true;
            this.f56509e = i10;
        }

        public e(E0 e02) {
            this.f56506b = e02;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$f */
    public interface f {
        void a(e eVar);
    }

    public C6199j0(Context context, H0[] h0Arr, H0[] h0Arr2, AbstractC16998D abstractC16998D, C16999E c16999e, InterfaceC6201k0 interfaceC6201k0, t3.d dVar, int i10, boolean z10, InterfaceC14599a interfaceC14599a, h3.M m10, h3.H h10, long j10, boolean z11, boolean z12, Looper looper, InterfaceC13606h interfaceC13606h, f fVar, E1 e12, h3.J j11, ExoPlayer.c cVar) {
        this.f56483r = fVar;
        this.f56468d = abstractC16998D;
        this.f56470e = c16999e;
        this.f56471f = interfaceC6201k0;
        this.f56472g = dVar;
        this.f56447L = i10;
        this.f56448M = z10;
        this.f56438C = m10;
        this.f56486u = h10;
        this.f56487v = j10;
        this.f56459X = j10;
        this.f56442G = z11;
        this.f56489x = z12;
        this.f56482q = interfaceC13606h;
        this.f56488w = e12;
        this.f56461Z = cVar;
        this.f56490y = interfaceC14599a;
        this.f56478m = interfaceC6201k0.q(e12);
        this.f56479n = interfaceC6201k0.o(e12);
        E0 e0K = E0.k(c16999e);
        this.f56439D = e0K;
        this.f56440E = new e(e0K);
        this.f56464b = new I0[h0Arr.length];
        this.f56466c = new boolean[h0Arr.length];
        I0.a aVarD = abstractC16998D.d();
        this.f56462a = new J0[h0Arr.length];
        boolean z13 = false;
        for (int i11 = 0; i11 < h0Arr.length; i11++) {
            h0Arr[i11].l(i11, e12, interfaceC13606h);
            this.f56464b[i11] = h0Arr[i11].G();
            if (aVarD != null) {
                this.f56464b[i11].H(aVarD);
            }
            H0 h02 = h0Arr2[i11];
            if (h02 != null) {
                h02.l(h0Arr.length + i11, e12, interfaceC13606h);
                z13 = true;
            }
            this.f56462a[i11] = new J0(h0Arr[i11], h0Arr2[i11], i11);
        }
        this.f56436A = z13;
        this.f56480o = new C6200k(this, interfaceC13606h);
        this.f56481p = new ArrayList<>();
        this.f56476k = new F.c();
        this.f56477l = new F.b();
        abstractC16998D.e(this, dVar);
        this.f56457V = true;
        InterfaceC13612n interfaceC13612nE = interfaceC13606h.e(looper, null);
        this.f56491z = interfaceC13612nE;
        this.f56484s = new C6211p0(interfaceC14599a, interfaceC13612nE, new C6205m0.a() { // from class: androidx.media3.exoplayer.h0
            @Override // androidx.media3.exoplayer.C6205m0.a
            public final C6205m0 a(C6207n0 c6207n0, long j12) {
                return this.f56392a.v(c6207n0, j12);
            }
        }, cVar);
        this.f56485t = new D0(this, interfaceC14599a, interfaceC13612nE, e12);
        h3.J j12 = j11 == null ? new h3.J() : j11;
        this.f56474i = j12;
        Looper looperA = j12.a();
        this.f56475j = looperA;
        this.f56473h = interfaceC13606h.e(looperA, this);
        this.f56437B = new C6192g(context, looperA, this);
    }

    private void B0() {
        try {
            G0(true, false, true, false);
            C0();
            this.f56471f.c(this.f56488w);
            this.f56437B.h();
            this.f56468d.j();
            s1(1);
            this.f56474i.b();
            synchronized (this) {
                this.f56441F = true;
                notifyAll();
            }
        } catch (Throwable th2) {
            this.f56474i.b();
            synchronized (this) {
                this.f56441F = true;
                notifyAll();
                throw th2;
            }
        }
    }

    private void C0() {
        for (int i10 = 0; i10 < this.f56462a.length; i10++) {
            this.f56464b[i10].j();
            this.f56462a[i10].H();
        }
    }

    private void E1(boolean z10, boolean z11) {
        G0(z10 || !this.f56449N, false, true, false);
        this.f56440E.b(z11 ? 1 : 0);
        this.f56471f.d(this.f56488w);
        this.f56437B.n(this.f56439D.f55746l, 1);
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
        E0 e02 = this.f56439D;
        if (e02.f55746l == z11 && e02.f55748n == iQ1 && e02.f55747m == iK1) {
            return;
        }
        this.f56439D = e02.e(z11, iK1, iQ1);
        R1(false, false);
        v0(z11);
        if (!z1()) {
            F1();
            O1();
            this.f56484s.K(this.f56454S);
            return;
        }
        int i13 = this.f56439D.f55739e;
        if (i13 == 3) {
            this.f56480o.g();
            C1();
            this.f56473h.h(2);
        } else if (i13 == 2) {
            this.f56473h.h(2);
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

    private synchronized void U1(De.w<Boolean> wVar, long j10) {
        long jC = this.f56482q.c() + j10;
        boolean z10 = false;
        while (!wVar.get().booleanValue() && j10 > 0) {
            try {
                this.f56482q.f();
                wait(j10);
            } catch (InterruptedException unused) {
                z10 = true;
            }
            j10 = jC - this.f56482q.c();
        }
        if (z10) {
            Thread.currentThread().interrupt();
        }
    }

    private static boolean Z(boolean z10, r.b bVar, long j10, r.b bVar2, F.b bVar3, long j11) {
        if (!z10 && j10 == j11 && bVar.f57157a.equals(bVar2.f57157a)) {
            if (bVar.b() && bVar3.s(bVar.f57158b)) {
                return (bVar3.h(bVar.f57158b, bVar.f57159c) == 4 || bVar3.h(bVar.f57158b, bVar.f57159c) == 2) ? false : true;
            }
            if (bVar2.b() && bVar3.s(bVar2.f57158b)) {
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
            r15.f56467c0 = r0
            androidx.media3.exoplayer.p0 r1 = r15.f56484s
            androidx.media3.exoplayer.m0 r1 = r1.b()
            java.lang.Object r1 = d3.C13599a.e(r1)
            androidx.media3.exoplayer.m0 r1 = (androidx.media3.exoplayer.C6205m0) r1
            androidx.media3.exoplayer.E0 r2 = r15.f56439D
            androidx.media3.exoplayer.source.r$b r2 = r2.f55736b
            java.lang.Object r2 = r2.f57157a
            androidx.media3.exoplayer.n0 r3 = r1.f56562h
            androidx.media3.exoplayer.source.r$b r3 = r3.f56737a
            java.lang.Object r3 = r3.f57157a
            boolean r2 = r2.equals(r3)
            r3 = 1
            if (r2 == 0) goto L47
            androidx.media3.exoplayer.E0 r2 = r15.f56439D
            androidx.media3.exoplayer.source.r$b r2 = r2.f55736b
            int r4 = r2.f57158b
            r5 = -1
            if (r4 != r5) goto L47
            androidx.media3.exoplayer.n0 r4 = r1.f56562h
            androidx.media3.exoplayer.source.r$b r4 = r4.f56737a
            int r6 = r4.f57158b
            if (r6 != r5) goto L47
            int r2 = r2.f57161e
            int r4 = r4.f57161e
            if (r2 == r4) goto L47
            r2 = r3
            goto L48
        L47:
            r2 = r0
        L48:
            androidx.media3.exoplayer.n0 r4 = r1.f56562h
            androidx.media3.exoplayer.source.r$b r6 = r4.f56737a
            long r7 = r4.f56738b
            long r9 = r4.f56739c
            r13 = r2 ^ 1
            r14 = 0
            r11 = r7
            r5 = r15
            androidx.media3.exoplayer.E0 r2 = r5.X(r6, r7, r9, r11, r13, r14)
            r5.f56439D = r2
            r15.H0()
            r15.O1()
            boolean r2 = r15.t()
            if (r2 == 0) goto L72
            androidx.media3.exoplayer.p0 r2 = r5.f56484s
            androidx.media3.exoplayer.m0 r2 = r2.x()
            if (r1 != r2) goto L72
            r15.f0()
        L72:
            androidx.media3.exoplayer.E0 r1 = r5.f56439D
            int r1 = r1.f55739e
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6199j0.n0():void");
    }

    private void z() throws ExoPlaybackException {
        for (int i10 = 0; i10 < this.f56462a.length; i10++) {
            y(i10);
        }
        this.f56465b0 = -9223372036854775807L;
    }

    public synchronized boolean A0() {
        if (!this.f56441F && this.f56475j.getThread().isAlive()) {
            this.f56473h.h(7);
            U1(new De.w() { // from class: androidx.media3.exoplayer.f0
                @Override // De.w
                public final Object get() {
                    return Boolean.valueOf(this.f56362a.f56441F);
                }
            }, this.f56487v);
            return this.f56441F;
        }
        return true;
    }

    @Override // androidx.media3.exoplayer.F0.a
    public synchronized void h(F0 f02) {
        if (!this.f56441F && this.f56475j.getThread().isAlive()) {
            this.f56473h.d(14, f02).a();
            return;
        }
        d3.r.i("ExoPlayerImplInternal", "Ignoring messages sent after release.");
        f02.j(false);
    }

    public synchronized boolean t1(Object obj, long j10) {
        if (!this.f56441F && this.f56475j.getThread().isAlive()) {
            final AtomicBoolean atomicBoolean = new AtomicBoolean();
            this.f56473h.d(30, new Pair(obj, atomicBoolean)).a();
            if (j10 == -9223372036854775807L) {
                return true;
            }
            U1(new De.w() { // from class: h3.F
                @Override // De.w
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
        public final r.b f56510a;

        /* renamed from: b, reason: collision with root package name */
        public final long f56511b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56512c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f56513d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f56514e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f56515f;

        public g(r.b bVar, long j10, long j11, boolean z10, boolean z11, boolean z12) {
            this.f56510a = bVar;
            this.f56511b = j10;
            this.f56512c = j11;
            this.f56513d = z10;
            this.f56514e = z11;
            this.f56515f = z12;
        }
    }

    /* renamed from: androidx.media3.exoplayer.j0$h */
    private static final class h {

        /* renamed from: a, reason: collision with root package name */
        public final a3.F f56516a;

        /* renamed from: b, reason: collision with root package name */
        public final int f56517b;

        /* renamed from: c, reason: collision with root package name */
        public final long f56518c;

        public h(a3.F f10, int i10, long j10) {
            this.f56516a = f10;
            this.f56517b = i10;
            this.f56518c = j10;
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6199j0.A():void");
    }

    private boolean A1(boolean z10) {
        if (this.f56452Q == 0) {
            return b0();
        }
        boolean z11 = false;
        if (!z10) {
            return false;
        }
        if (!this.f56439D.f55741g) {
            return true;
        }
        C6205m0 c6205m0U = this.f56484s.u();
        long jC = B1(this.f56439D.f55735a, c6205m0U.f56562h.f56737a) ? this.f56486u.c() : -9223372036854775807L;
        C6205m0 c6205m0N = this.f56484s.n();
        boolean z12 = c6205m0N.s() && c6205m0N.f56562h.f56746j;
        if (c6205m0N.f56562h.f56737a.b() && !c6205m0N.f56560f) {
            z11 = true;
        }
        if (z12 || z11) {
            return true;
        }
        return this.f56471f.a(new InterfaceC6201k0.a(this.f56488w, this.f56439D.f55735a, c6205m0U.f56562h.f56737a, c6205m0U.C(this.f56454S), M(c6205m0N.j()), this.f56480o.f().f44370a, this.f56439D.f55746l, this.f56444I, jC, this.f56445J));
    }

    private void B(C6205m0 c6205m0, int i10, boolean z10, long j10) throws ExoPlaybackException {
        J0 j02 = this.f56462a[i10];
        if (j02.x()) {
            return;
        }
        boolean z11 = c6205m0 == this.f56484s.u();
        C16999E c16999eP = c6205m0.p();
        h3.K k10 = c16999eP.f159754b[i10];
        s3.y yVar = c16999eP.f159755c[i10];
        boolean z12 = z1() && this.f56439D.f55739e == 3;
        boolean z13 = !z10 && z12;
        this.f56452Q++;
        j02.e(k10, yVar, c6205m0.f56557c[i10], this.f56454S, z13, z11, j10, c6205m0.m(), c6205m0.f56562h.f56737a, this.f56480o);
        j02.n(11, new a(), c6205m0);
        if (z12 && z11) {
            j02.U();
        }
    }

    private void C() throws ExoPlaybackException {
        D(new boolean[this.f56462a.length], this.f56484s.y().n());
    }

    private void C1() throws ExoPlaybackException {
        C6205m0 c6205m0U = this.f56484s.u();
        if (c6205m0U == null) {
            return;
        }
        C16999E c16999eP = c6205m0U.p();
        for (int i10 = 0; i10 < this.f56462a.length; i10++) {
            if (c16999eP.c(i10)) {
                this.f56462a[i10].U();
            }
        }
    }

    private void D(boolean[] zArr, long j10) throws ExoPlaybackException {
        long j11;
        C6205m0 c6205m0Y = this.f56484s.y();
        C16999E c16999eP = c6205m0Y.p();
        for (int i10 = 0; i10 < this.f56462a.length; i10++) {
            if (!c16999eP.c(i10)) {
                this.f56462a[i10].L();
            }
        }
        int i11 = 0;
        while (i11 < this.f56462a.length) {
            if (!c16999eP.c(i11) || this.f56462a[i11].w(c6205m0Y)) {
                j11 = j10;
            } else {
                j11 = j10;
                B(c6205m0Y, i11, zArr[i11], j11);
            }
            i11++;
            j10 = j11;
        }
    }

    private void D0(int i10, int i11, p3.s sVar) throws Throwable {
        this.f56440E.b(1);
        T(this.f56485t.A(i10, i11, sVar), false);
    }

    private void E0() throws ExoPlaybackException {
        float f10 = this.f56480o.f().f44370a;
        C6205m0 c6205m0Y = this.f56484s.y();
        C16999E c16999e = null;
        boolean z10 = true;
        for (C6205m0 c6205m0U = this.f56484s.u(); c6205m0U != null && c6205m0U.f56560f; c6205m0U = c6205m0U.k()) {
            E0 e02 = this.f56439D;
            C16999E c16999eZ = c6205m0U.z(f10, e02.f55735a, e02.f55746l);
            if (c6205m0U == this.f56484s.u()) {
                c16999e = c16999eZ;
            }
            if (!c16999eZ.a(c6205m0U.p())) {
                if (z10) {
                    C6205m0 c6205m0U2 = this.f56484s.u();
                    boolean z11 = (this.f56484s.N(c6205m0U2) & 1) != 0;
                    boolean[] zArr = new boolean[this.f56462a.length];
                    long jB = c6205m0U2.b((C16999E) C13599a.e(c16999e), this.f56439D.f55753s, z11, zArr);
                    E0 e03 = this.f56439D;
                    boolean z12 = (e03.f55739e == 4 || jB == e03.f55753s) ? false : true;
                    E0 e04 = this.f56439D;
                    this.f56439D = X(e04.f55736b, jB, e04.f55737c, e04.f55738d, z12, 5);
                    if (z12) {
                        I0(jB);
                    }
                    x();
                    boolean[] zArr2 = new boolean[this.f56462a.length];
                    int i10 = 0;
                    while (true) {
                        J0[] j0Arr = this.f56462a;
                        if (i10 >= j0Arr.length) {
                            break;
                        }
                        int iH = j0Arr[i10].h();
                        zArr2[i10] = this.f56462a[i10].x();
                        this.f56462a[i10].B(c6205m0U2.f56557c[i10], this.f56480o, this.f56454S, zArr[i10]);
                        if (iH - this.f56462a[i10].h() > 0) {
                            j0(i10, false);
                        }
                        this.f56452Q -= iH - this.f56462a[i10].h();
                        i10++;
                    }
                    D(zArr2, this.f56454S);
                    c6205m0U2.f56563i = true;
                } else {
                    this.f56484s.N(c6205m0U);
                    if (c6205m0U.f56560f) {
                        long jMax = Math.max(c6205m0U.f56562h.f56738b, c6205m0U.C(this.f56454S));
                        if (this.f56436A && t() && this.f56484s.x() == c6205m0U) {
                            x();
                        }
                        c6205m0U.a(c16999eZ, jMax, false);
                    }
                }
                R(true);
                if (this.f56439D.f55739e != 4) {
                    d0();
                    O1();
                    this.f56473h.h(2);
                    return;
                }
                return;
            }
            if (c6205m0U == c6205m0Y) {
                z10 = false;
            }
        }
    }

    private Ee.L<a3.y> F(s3.y[] yVarArr) {
        L.a aVar = new L.a();
        boolean z10 = false;
        for (s3.y yVar : yVarArr) {
            if (yVar != null) {
                a3.y yVar2 = yVar.a(0).f44764l;
                if (yVar2 == null) {
                    aVar.a(new a3.y(new y.a[0]));
                } else {
                    aVar.a(yVar2);
                    z10 = true;
                }
            }
        }
        return z10 ? aVar.k() : Ee.L.x();
    }

    private void F1() throws ExoPlaybackException {
        this.f56480o.h();
        for (J0 j02 : this.f56462a) {
            j02.W();
        }
    }

    private long G() {
        E0 e02 = this.f56439D;
        return H(e02.f55735a, e02.f55736b.f57157a, e02.f55753s);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6199j0.G0(boolean, boolean, boolean, boolean):void");
    }

    private void G1() {
        C6205m0 c6205m0N = this.f56484s.n();
        boolean z10 = this.f56446K || (c6205m0N != null && c6205m0N.f56555a.a());
        E0 e02 = this.f56439D;
        if (z10 != e02.f55741g) {
            this.f56439D = e02.b(z10);
        }
    }

    private long H(a3.F f10, Object obj, long j10) {
        f10.n(f10.h(obj, this.f56477l).f44412c, this.f56476k);
        F.c cVar = this.f56476k;
        if (cVar.f44438f != -9223372036854775807L && cVar.f()) {
            F.c cVar2 = this.f56476k;
            if (cVar2.f44441i) {
                return d3.P.M0(cVar2.a() - this.f56476k.f44438f) - (j10 + this.f56477l.o());
            }
        }
        return -9223372036854775807L;
    }

    private void H0() {
        C6205m0 c6205m0U = this.f56484s.u();
        this.f56443H = c6205m0U != null && c6205m0U.f56562h.f56745i && this.f56442G;
    }

    private void H1(r.b bVar, p3.w wVar, C16999E c16999e) {
        C6205m0 c6205m0 = (C6205m0) C13599a.e(this.f56484s.n());
        this.f56471f.f(new InterfaceC6201k0.a(this.f56488w, this.f56439D.f55735a, bVar, c6205m0 == this.f56484s.u() ? c6205m0.C(this.f56454S) : c6205m0.C(this.f56454S) - c6205m0.f56562h.f56738b, M(c6205m0.j()), this.f56480o.f().f44370a, this.f56439D.f55746l, this.f56444I, B1(this.f56439D.f55735a, c6205m0.f56562h.f56737a) ? this.f56486u.c() : -9223372036854775807L, this.f56445J), wVar, c16999e.f159755c);
    }

    private long I(C6205m0 c6205m0) {
        if (c6205m0 == null) {
            return 0L;
        }
        long jM = c6205m0.m();
        if (!c6205m0.f56560f) {
            return jM;
        }
        int i10 = 0;
        while (true) {
            J0[] j0Arr = this.f56462a;
            if (i10 >= j0Arr.length) {
                return jM;
            }
            if (j0Arr[i10].w(c6205m0)) {
                long jK = this.f56462a[i10].k(c6205m0);
                if (jK == Long.MIN_VALUE) {
                    return Long.MIN_VALUE;
                }
                jM = Math.max(jK, jM);
            }
            i10++;
        }
    }

    private void I0(long j10) throws ExoPlaybackException {
        C6205m0 c6205m0U = this.f56484s.u();
        long jD = c6205m0U == null ? j10 + 1000000000000L : c6205m0U.D(j10);
        this.f56454S = jD;
        this.f56480o.c(jD);
        for (J0 j02 : this.f56462a) {
            j02.M(c6205m0U, this.f56454S);
        }
        u0();
    }

    private void I1(int i10, int i11, List<a3.v> list) throws Throwable {
        this.f56440E.b(1);
        T(this.f56485t.E(i10, i11, list), false);
    }

    private static void J0(a3.F f10, d dVar, F.c cVar, F.b bVar) {
        int i10 = f10.n(f10.h(dVar.f56504d, bVar).f44412c, cVar).f44447o;
        Object obj = f10.g(i10, bVar, true).f44411b;
        long j10 = bVar.f44413d;
        dVar.b(i10, j10 != -9223372036854775807L ? j10 - 1 : Long.MAX_VALUE, obj);
    }

    private void J1() throws ExoPlaybackException {
        if (this.f56439D.f55735a.q() || !this.f56485t.t()) {
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
        Object obj = dVar.f56504d;
        if (obj == null) {
            Pair<Object, Long> pairN0 = N0(f10, new h(dVar.f56501a.g(), dVar.f56501a.c(), dVar.f56501a.e() == Long.MIN_VALUE ? -9223372036854775807L : d3.P.M0(dVar.f56501a.e())), false, i10, z10, cVar, bVar);
            if (pairN0 == null) {
                return false;
            }
            dVar.b(f10.b(pairN0.first), ((Long) pairN0.second).longValue(), pairN0.first);
            if (dVar.f56501a.e() == Long.MIN_VALUE) {
                J0(f10, dVar, cVar, bVar);
            }
            return true;
        }
        int iB = f10.b(obj);
        if (iB == -1) {
            return false;
        }
        if (dVar.f56501a.e() == Long.MIN_VALUE) {
            J0(f10, dVar, cVar, bVar);
            return true;
        }
        dVar.f56502b = iB;
        f11.h(dVar.f56504d, bVar);
        if (bVar.f44415f && f11.n(bVar.f44412c, cVar).f44446n == f11.b(dVar.f56504d)) {
            Pair<Object, Long> pairJ = f10.j(cVar, bVar, f10.h(dVar.f56504d, bVar).f44412c, dVar.f56503c + bVar.o());
            dVar.b(f10.b(pairJ.first), ((Long) pairJ.second).longValue(), pairJ.first);
        }
        return true;
    }

    private long L() {
        return M(this.f56439D.f55751q);
    }

    private void L1() throws ExoPlaybackException {
        E0 e02 = this.f56439D;
        M1(e02.f55746l, e02.f55748n, e02.f55747m);
    }

    private long M(long j10) {
        C6205m0 c6205m0N = this.f56484s.n();
        if (c6205m0N == null) {
            return 0L;
        }
        return Math.max(0L, j10 - c6205m0N.C(this.f56454S));
    }

    private static g M0(a3.F f10, E0 e02, h hVar, C6211p0 c6211p0, int i10, boolean z10, F.c cVar, F.b bVar) {
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
        r.b bVar3 = e02.f55736b;
        Object obj = bVar3.f57157a;
        boolean zC0 = c0(e02, bVar);
        long j12 = (e02.f55736b.b() || zC0) ? e02.f55737c : e02.f55753s;
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
                if (hVar.f56518c == -9223372036854775807L) {
                    iA3 = f10.h(pairN0.first, bVar).f44412c;
                    jLongValue2 = j12;
                    z15 = false;
                } else {
                    obj = pairN0.first;
                    jLongValue2 = ((Long) pairN0.second).longValue();
                    iA3 = -1;
                    z15 = true;
                }
                z16 = e02.f55739e == 4;
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
            if (e02.f55735a.q()) {
                iA = f10.a(z10);
            } else if (f10.b(obj) == -1) {
                int iO0 = O0(cVar, bVar, i10, z10, obj, e02.f55735a, f10);
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
                iA = f10.h(obj, bVar).f44412c;
                obj = obj;
            } else if (zC0) {
                e02.f55735a.h(bVar3.f57157a, bVar);
                if (e02.f55735a.n(bVar.f44412c, cVar).f44446n == e02.f55735a.b(bVar3.f57157a)) {
                    Pair<Object, Long> pairJ = f10.j(cVar, bVar, f10.h(obj, bVar).f44412c, bVar.o() + j12);
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
        r.b bVarQ = c6211p0.Q(f11, obj, jG);
        int i13 = bVarQ.f57161e;
        boolean z18 = bVar3.f57157a.equals(obj) && !bVar3.b() && !bVarQ.b() && (i13 == i11 || ((i12 = bVar3.f57161e) != i11 && i13 >= i12));
        long j13 = j11;
        r.b bVar4 = bVarQ;
        boolean Z10 = Z(zC0, bVar3, j12, bVar4, f11.h(obj, bVar2), j13);
        if (z18 || Z10) {
            bVar4 = bVar3;
        }
        if (bVar4.b()) {
            if (bVar4.equals(bVar3)) {
                jG = e02.f55753s;
            } else {
                f11.h(bVar4.f57157a, bVar2);
                jG = bVar4.f57159c == bVar2.l(bVar4.f57158b) ? bVar2.g() : 0L;
            }
        }
        return new g(bVar4, jG, j13, z11, z12, z13);
    }

    private void M1(boolean z10, int i10, int i11) throws ExoPlaybackException {
        N1(z10, this.f56437B.n(z10, this.f56439D.f55739e), i10, i11);
    }

    private void N(int i10) throws ExoPlaybackException {
        E0 e02 = this.f56439D;
        N1(e02.f55746l, i10, e02.f55748n, e02.f55747m);
    }

    private static Pair<Object, Long> N0(a3.F f10, h hVar, boolean z10, int i10, boolean z11, F.c cVar, F.b bVar) {
        Pair<Object, Long> pairJ;
        a3.F f11;
        int iO0;
        a3.F f12 = hVar.f56516a;
        if (f10.q()) {
            return null;
        }
        if (f12.q()) {
            f12 = f10;
        }
        try {
            pairJ = f12.j(cVar, bVar, hVar.f56517b, hVar.f56518c);
            f11 = f12;
        } catch (IndexOutOfBoundsException unused) {
        }
        if (f10.equals(f11)) {
            return pairJ;
        }
        if (f10.b(pairJ.first) != -1) {
            return (f11.h(pairJ.first, bVar).f44415f && f11.n(bVar.f44412c, cVar).f44446n == f11.b(pairJ.first)) ? f10.j(cVar, bVar, f10.h(pairJ.first, bVar).f44412c, hVar.f56518c) : pairJ;
        }
        if (z10 && (iO0 = O0(cVar, bVar, i10, z11, pairJ.first, f11, f10)) != -1) {
            return f10.j(cVar, bVar, iO0, -9223372036854775807L);
        }
        return null;
    }

    private void O() throws ExoPlaybackException {
        w1(this.f56469d0);
    }

    private void O1() throws ExoPlaybackException {
        C6205m0 c6205m0U = this.f56484s.u();
        if (c6205m0U == null) {
            return;
        }
        long j10 = c6205m0U.f56560f ? c6205m0U.f56555a.j() : -9223372036854775807L;
        if (j10 != -9223372036854775807L) {
            if (!c6205m0U.s()) {
                this.f56484s.N(c6205m0U);
                R(false);
                d0();
            }
            I0(j10);
            if (j10 != this.f56439D.f55753s) {
                E0 e02 = this.f56439D;
                long j11 = j10;
                this.f56439D = X(e02.f55736b, j11, e02.f55737c, j11, true, 5);
            }
        } else {
            long jI = this.f56480o.i(c6205m0U != this.f56484s.y());
            this.f56454S = jI;
            long jC = c6205m0U.C(jI);
            k0(this.f56439D.f55753s, jC);
            if (this.f56480o.w()) {
                boolean z10 = !this.f56440E.f56508d;
                E0 e03 = this.f56439D;
                this.f56439D = X(e03.f55736b, jC, e03.f55737c, jC, z10, 6);
            } else {
                this.f56439D.o(jC);
            }
        }
        this.f56439D.f55751q = this.f56484s.n().j();
        this.f56439D.f55752r = L();
        E0 e04 = this.f56439D;
        if (e04.f55746l && e04.f55739e == 3 && B1(e04.f55735a, e04.f55736b) && this.f56439D.f55749o.f44370a == 1.0f) {
            float fB = this.f56486u.b(G(), this.f56439D.f55752r);
            if (this.f56480o.f().f44370a != fB) {
                c1(this.f56439D.f55749o.b(fB));
                V(this.f56439D.f55749o, this.f56480o.f().f44370a, false, false);
            }
        }
    }

    private void P(androidx.media3.exoplayer.source.q qVar) {
        if (this.f56484s.F(qVar)) {
            this.f56484s.K(this.f56454S);
            d0();
        } else if (this.f56484s.G(qVar)) {
            e0();
        }
    }

    private void P0(long j10) {
        long jMin = (this.f56439D.f55739e != 3 || (!this.f56489x && z1())) ? f56435e0 : 1000L;
        if (this.f56489x && z1()) {
            for (J0 j02 : this.f56462a) {
                jMin = Math.min(jMin, d3.P.j1(j02.j(this.f56454S, this.f56455T)));
            }
            if ((this.f56484s.u() != null ? this.f56484s.u().k() : null) != null && this.f56454S + (d3.P.M0(jMin) * this.f56439D.f55749o.f44370a) >= r2.n()) {
                jMin = Math.min(jMin, f56435e0);
            }
        }
        this.f56473h.j(2, j10 + jMin);
    }

    private void R(boolean z10) {
        C6205m0 c6205m0N = this.f56484s.n();
        r.b bVar = c6205m0N == null ? this.f56439D.f55736b : c6205m0N.f56562h.f56737a;
        boolean zEquals = this.f56439D.f55745k.equals(bVar);
        if (!zEquals) {
            this.f56439D = this.f56439D.c(bVar);
        }
        E0 e02 = this.f56439D;
        e02.f55751q = c6205m0N == null ? e02.f55753s : c6205m0N.j();
        this.f56439D.f55752r = L();
        if ((!zEquals || z10) && c6205m0N != null && c6205m0N.f56560f) {
            H1(c6205m0N.f56562h.f56737a, c6205m0N.o(), c6205m0N.p());
        }
    }

    private void R0(boolean z10) throws ExoPlaybackException {
        r.b bVar = this.f56484s.u().f56562h.f56737a;
        long jU0 = U0(bVar, this.f56439D.f55753s, true, false);
        if (jU0 != this.f56439D.f55753s) {
            E0 e02 = this.f56439D;
            this.f56439D = X(bVar, jU0, e02.f55737c, e02.f55738d, z10, 5);
        }
    }

    private void R1(boolean z10, boolean z11) {
        this.f56444I = z10;
        this.f56445J = (!z10 || z11) ? -9223372036854775807L : this.f56482q.c();
    }

    private void S(C6205m0 c6205m0) throws ExoPlaybackException {
        if (!c6205m0.f56560f) {
            float f10 = this.f56480o.f().f44370a;
            E0 e02 = this.f56439D;
            c6205m0.q(f10, e02.f55735a, e02.f55746l);
        }
        H1(c6205m0.f56562h.f56737a, c6205m0.o(), c6205m0.p());
        if (c6205m0 == this.f56484s.u()) {
            I0(c6205m0.f56562h.f56738b);
            C();
            c6205m0.f56563i = true;
            E0 e03 = this.f56439D;
            r.b bVar = e03.f55736b;
            long j10 = c6205m0.f56562h.f56738b;
            this.f56439D = X(bVar, j10, e03.f55737c, j10, false, 5);
        }
        d0();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1 A[Catch: all -> 0x00a4, TryCatch #1 {all -> 0x00a4, blocks: (B:22:0x0097, B:24:0x00a1, B:30:0x00ad, B:32:0x00b3, B:33:0x00b6, B:35:0x00be, B:39:0x00d0, B:43:0x00d8), top: B:91:0x0097 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00aa  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void S0(androidx.media3.exoplayer.C6199j0.h r20) throws java.lang.Throwable {
        /*
            Method dump skipped, instructions count: 344
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6199j0.S0(androidx.media3.exoplayer.j0$h):void");
    }

    private boolean S1() throws ExoPlaybackException {
        C6205m0 c6205m0Y = this.f56484s.y();
        C16999E c16999eP = c6205m0Y.p();
        boolean z10 = true;
        int i10 = 0;
        while (true) {
            J0[] j0Arr = this.f56462a;
            if (i10 >= j0Arr.length) {
                break;
            }
            int iH = j0Arr[i10].h();
            int iJ = this.f56462a[i10].J(c6205m0Y, c16999eP, this.f56480o);
            if ((iJ & 2) != 0 && this.f56451P) {
                f1(false);
            }
            this.f56452Q -= iH - this.f56462a[i10].h();
            z10 &= (iJ & 1) != 0;
            i10++;
        }
        if (z10) {
            for (int i11 = 0; i11 < this.f56462a.length; i11++) {
                if (c16999eP.c(i11) && !this.f56462a[i11].w(c6205m0Y)) {
                    B(c6205m0Y, i11, false, c6205m0Y.n());
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6199j0.T(a3.F, boolean):void");
    }

    private long T0(r.b bVar, long j10, boolean z10) throws ExoPlaybackException {
        return U0(bVar, j10, this.f56484s.u() != this.f56484s.y(), z10);
    }

    private void T1(float f10) {
        for (C6205m0 c6205m0U = this.f56484s.u(); c6205m0U != null; c6205m0U = c6205m0U.k()) {
            for (s3.y yVar : c6205m0U.p().f159755c) {
                if (yVar != null) {
                    yVar.d(f10);
                }
            }
        }
    }

    private void U(androidx.media3.exoplayer.source.q qVar) throws ExoPlaybackException {
        if (this.f56484s.F(qVar)) {
            S((C6205m0) C13599a.e(this.f56484s.n()));
            return;
        }
        C6205m0 c6205m0V = this.f56484s.v(qVar);
        if (c6205m0V != null) {
            C13599a.g(!c6205m0V.f56560f);
            float f10 = this.f56480o.f().f44370a;
            E0 e02 = this.f56439D;
            c6205m0V.q(f10, e02.f55735a, e02.f55746l);
            if (this.f56484s.G(qVar)) {
                e0();
            }
        }
    }

    private void V(C5643A c5643a, float f10, boolean z10, boolean z11) throws ExoPlaybackException {
        if (z10) {
            if (z11) {
                this.f56440E.b(1);
            }
            this.f56439D = this.f56439D.g(c5643a);
        }
        T1(c5643a.f44370a);
        for (J0 j02 : this.f56462a) {
            j02.Q(f10, c5643a.f44370a);
        }
    }

    private void W(C5643A c5643a, boolean z10) throws ExoPlaybackException {
        V(c5643a, c5643a.f44370a, true, z10);
    }

    private E0 X(r.b bVar, long j10, long j11, long j12, boolean z10, int i10) {
        List list;
        p3.w wVar;
        C16999E c16999e;
        this.f56457V = (!this.f56457V && j10 == this.f56439D.f55753s && bVar.equals(this.f56439D.f55736b)) ? false : true;
        H0();
        E0 e02 = this.f56439D;
        p3.w wVar2 = e02.f55742h;
        C16999E c16999e2 = e02.f55743i;
        List listX = e02.f55744j;
        if (this.f56485t.t()) {
            C6205m0 c6205m0U = this.f56484s.u();
            p3.w wVarO = c6205m0U == null ? p3.w.f156147d : c6205m0U.o();
            C16999E c16999eP = c6205m0U == null ? this.f56470e : c6205m0U.p();
            List listF = F(c16999eP.f159755c);
            if (c6205m0U != null) {
                C6207n0 c6207n0 = c6205m0U.f56562h;
                if (c6207n0.f56739c != j11) {
                    c6205m0U.f56562h = c6207n0.a(j11);
                }
            }
            m0();
            wVar = wVarO;
            c16999e = c16999eP;
            list = listF;
        } else {
            if (!bVar.equals(this.f56439D.f55736b)) {
                wVar2 = p3.w.f156147d;
                c16999e2 = this.f56470e;
                listX = Ee.L.x();
            }
            list = listX;
            wVar = wVar2;
            c16999e = c16999e2;
        }
        if (z10) {
            this.f56440E.d(i10);
        }
        return this.f56439D.d(bVar, j10, j11, j12, L(), wVar, c16999e, list);
    }

    private boolean Y() {
        C6205m0 c6205m0Y = this.f56484s.y();
        if (!c6205m0Y.f56560f) {
            return false;
        }
        int i10 = 0;
        while (true) {
            J0[] j0Arr = this.f56462a;
            if (i10 >= j0Arr.length) {
                return true;
            }
            if (!j0Arr[i10].o(c6205m0Y)) {
                return false;
            }
            i10++;
        }
    }

    private void Y0(long j10) {
        for (J0 j02 : this.f56462a) {
            j02.N(j10);
        }
    }

    private boolean a0(C6205m0 c6205m0) {
        return (c6205m0 == null || c6205m0.r() || c6205m0.l() == Long.MIN_VALUE) ? false : true;
    }

    private void a1(C5647d c5647d, boolean z10) throws ExoPlaybackException {
        this.f56468d.l(c5647d);
        C6192g c6192g = this.f56437B;
        if (!z10) {
            c5647d = null;
        }
        c6192g.k(c5647d);
        L1();
    }

    private boolean b0() {
        C6205m0 c6205m0U = this.f56484s.u();
        long j10 = c6205m0U.f56562h.f56741e;
        if (c6205m0U.f56560f) {
            return j10 == -9223372036854775807L || this.f56439D.f55753s < j10 || !z1();
        }
        return false;
    }

    private void b1(boolean z10, AtomicBoolean atomicBoolean) {
        if (this.f56449N != z10) {
            this.f56449N = z10;
            if (!z10) {
                for (J0 j02 : this.f56462a) {
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
        r.b bVar2 = e02.f55736b;
        a3.F f10 = e02.f55735a;
        return f10.q() || f10.h(bVar2.f57157a, bVar).f44415f;
    }

    private void c1(C5643A c5643a) {
        this.f56473h.k(16);
        this.f56480o.d(c5643a);
    }

    private void d1(b bVar) throws Throwable {
        this.f56440E.b(1);
        if (bVar.f56495c != -1) {
            this.f56453R = new h(new G0(bVar.f56493a, bVar.f56494b), bVar.f56495c, bVar.f56496d);
        }
        T(this.f56485t.C(bVar.f56493a, bVar.f56494b), false);
    }

    private void e0() {
        this.f56484s.I();
        C6205m0 c6205m0W = this.f56484s.w();
        if (c6205m0W != null) {
            if ((!c6205m0W.f56559e || c6205m0W.f56560f) && !c6205m0W.f56555a.a()) {
                if (this.f56471f.e(this.f56439D.f55735a, c6205m0W.f56562h.f56737a, c6205m0W.f56560f ? c6205m0W.f56555a.d() : 0L)) {
                    if (c6205m0W.f56559e) {
                        c6205m0W.e(new C6203l0.b().f(c6205m0W.C(this.f56454S)).g(this.f56480o.f().f44370a).e(this.f56445J).d());
                    } else {
                        c6205m0W.v(this, c6205m0W.f56562h.f56738b);
                    }
                }
            }
        }
    }

    private void f0() throws ExoPlaybackException {
        for (J0 j02 : this.f56462a) {
            j02.D();
        }
    }

    private void f1(boolean z10) {
        if (z10 == this.f56451P) {
            return;
        }
        this.f56451P = z10;
        if (z10 || !this.f56439D.f55750p) {
            return;
        }
        this.f56473h.h(2);
    }

    private void g0() {
        this.f56440E.c(this.f56439D);
        if (this.f56440E.f56505a) {
            this.f56483r.a(this.f56440E);
            this.f56440E = new e(this.f56439D);
        }
    }

    private void g1(boolean z10) throws ExoPlaybackException {
        this.f56442G = z10;
        H0();
        if (!this.f56443H || this.f56484s.y() == this.f56484s.u()) {
            return;
        }
        R0(true);
        R(false);
    }

    private void h0() throws ExoPlaybackException {
        C6205m0 c6205m0X = this.f56484s.x();
        if (c6205m0X == null) {
            return;
        }
        C16999E c16999eP = c6205m0X.p();
        for (int i10 = 0; i10 < this.f56462a.length; i10++) {
            if (c16999eP.c(i10) && this.f56462a[i10].s() && !this.f56462a[i10].u()) {
                this.f56462a[i10].V();
                B(c6205m0X, i10, false, c6205m0X.n());
            }
        }
        if (t()) {
            this.f56465b0 = c6205m0X.f56555a.j();
            if (c6205m0X.s()) {
                return;
            }
            this.f56484s.N(c6205m0X);
            R(false);
            d0();
        }
    }

    private void i0(int i10) throws ExoPlaybackException, IOException {
        J0 j02 = this.f56462a[i10];
        try {
            j02.G((C6205m0) C13599a.e(this.f56484s.u()));
        } catch (IOException | RuntimeException e10) {
            int iM = j02.m();
            if (iM != 3 && iM != 5) {
                throw e10;
            }
            C16999E c16999eP = this.f56484s.u().p();
            d3.r.e("ExoPlayerImplInternal", "Disabling track due to error: " + a3.t.h(c16999eP.f159755c[i10].j()), e10);
            C16999E c16999e = new C16999E((h3.K[]) c16999eP.f159754b.clone(), (s3.y[]) c16999eP.f159755c.clone(), c16999eP.f159756d, c16999eP.f159757e);
            c16999e.f159754b[i10] = null;
            c16999e.f159755c[i10] = null;
            y(i10);
            this.f56484s.u().a(c16999e, this.f56439D.f55753s, false);
        }
    }

    private void i1(boolean z10, int i10, boolean z11, int i11) throws ExoPlaybackException {
        this.f56440E.b(z11 ? 1 : 0);
        M1(z10, i10, i11);
    }

    private void j0(final int i10, final boolean z10) {
        boolean[] zArr = this.f56466c;
        if (zArr[i10] != z10) {
            zArr[i10] = z10;
            this.f56491z.post(new Runnable() { // from class: androidx.media3.exoplayer.g0
                @Override // java.lang.Runnable
                public final void run() {
                    C6199j0 c6199j0 = this.f56372a;
                    int i11 = i10;
                    c6199j0.f56490y.N(i11, c6199j0.f56462a[i11].m(), z10);
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6199j0.k0(long, long):void");
    }

    private boolean l0() throws ExoPlaybackException {
        C6207n0 c6207n0T;
        this.f56484s.K(this.f56454S);
        boolean z10 = false;
        if (this.f56484s.T() && (c6207n0T = this.f56484s.t(this.f56454S, this.f56439D)) != null) {
            C6205m0 c6205m0H = this.f56484s.h(c6207n0T);
            if (!c6205m0H.f56559e) {
                c6205m0H.v(this, c6207n0T.f56738b);
            } else if (c6205m0H.f56560f) {
                this.f56473h.d(8, c6205m0H.f56555a).a();
            }
            if (this.f56484s.u() == c6205m0H) {
                I0(c6207n0T.f56738b);
            }
            R(false);
            z10 = true;
        }
        if (!this.f56446K) {
            d0();
            return z10;
        }
        this.f56446K = a0(this.f56484s.n());
        G1();
        return z10;
    }

    private void l1(ExoPlayer.c cVar) {
        this.f56461Z = cVar;
        this.f56484s.V(this.f56439D.f55735a, cVar);
    }

    private void m0() {
        boolean z10;
        C6205m0 c6205m0U = this.f56484s.u();
        if (c6205m0U != null) {
            C16999E c16999eP = c6205m0U.p();
            boolean z11 = false;
            int i10 = 0;
            boolean z12 = false;
            while (true) {
                if (i10 >= this.f56462a.length) {
                    z10 = true;
                    break;
                }
                if (c16999eP.c(i10)) {
                    if (this.f56462a[i10].m() != 1) {
                        z10 = false;
                        break;
                    } else if (c16999eP.f159754b[i10].f134668a != 0) {
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
        this.f56447L = i10;
        int iX = this.f56484s.X(this.f56439D.f55735a, i10);
        if ((iX & 1) != 0) {
            R0(true);
        } else if ((iX & 2) != 0) {
            x();
        }
        R(false);
    }

    private void o0(boolean z10) {
        if (this.f56461Z.f55799a == -9223372036854775807L) {
            return;
        }
        if (z10 || !this.f56439D.f55735a.equals(this.f56463a0)) {
            a3.F f10 = this.f56439D.f55735a;
            this.f56463a0 = f10;
            this.f56484s.B(f10);
        }
        e0();
    }

    private void o1(h3.M m10) {
        this.f56438C = m10;
    }

    private void p0() throws ExoPlaybackException {
        C6205m0 c6205m0X;
        if (this.f56443H || !this.f56436A || this.f56467c0 || t() || (c6205m0X = this.f56484s.x()) == null || c6205m0X != this.f56484s.y() || c6205m0X.k() == null || !c6205m0X.k().f56560f) {
            return;
        }
        this.f56484s.c();
        h0();
    }

    private void q0() throws ExoPlaybackException {
        C6205m0 c6205m0Y = this.f56484s.y();
        if (c6205m0Y == null) {
            return;
        }
        int i10 = 0;
        if (c6205m0Y.k() == null || this.f56443H) {
            if (c6205m0Y.f56562h.f56746j || this.f56443H) {
                J0[] j0Arr = this.f56462a;
                int length = j0Arr.length;
                while (i10 < length) {
                    J0 j02 = j0Arr[i10];
                    if (j02.w(c6205m0Y) && j02.r(c6205m0Y)) {
                        long j10 = c6205m0Y.f56562h.f56741e;
                        j02.O(c6205m0Y, (j10 == -9223372036854775807L || j10 == Long.MIN_VALUE) ? -9223372036854775807L : c6205m0Y.m() + c6205m0Y.f56562h.f56741e);
                    }
                    i10++;
                }
                return;
            }
            return;
        }
        if (Y()) {
            if (t() && this.f56484s.x() == this.f56484s.y()) {
                return;
            }
            if (c6205m0Y.k().f56560f || this.f56454S >= c6205m0Y.k().n()) {
                C16999E c16999eP = c6205m0Y.p();
                C6205m0 c6205m0D = this.f56484s.d();
                C16999E c16999eP2 = c6205m0D.p();
                a3.F f10 = this.f56439D.f55735a;
                P1(f10, c6205m0D.f56562h.f56737a, f10, c6205m0Y.f56562h.f56737a, -9223372036854775807L, false);
                if (c6205m0D.f56560f && ((this.f56436A && this.f56465b0 != -9223372036854775807L) || c6205m0D.f56555a.j() != -9223372036854775807L)) {
                    this.f56465b0 = -9223372036854775807L;
                    boolean z10 = this.f56436A && !this.f56467c0;
                    if (z10) {
                        int i11 = 0;
                        while (true) {
                            if (i11 >= this.f56462a.length) {
                                break;
                            }
                            if (c16999eP2.c(i11) && !a3.z.a(c16999eP2.f159755c[i11].j().f44767o, c16999eP2.f159755c[i11].j().f44763k) && !this.f56462a[i11].u()) {
                                z10 = false;
                                break;
                            }
                            i11++;
                        }
                    }
                    if (!z10) {
                        Y0(c6205m0D.n());
                        if (c6205m0D.s()) {
                            return;
                        }
                        this.f56484s.N(c6205m0D);
                        R(false);
                        d0();
                        return;
                    }
                }
                J0[] j0Arr2 = this.f56462a;
                int length2 = j0Arr2.length;
                while (i10 < length2) {
                    j0Arr2[i10].F(c16999eP, c16999eP2, c6205m0D.n());
                    i10++;
                }
            }
        }
    }

    private void q1(boolean z10) throws ExoPlaybackException {
        this.f56448M = z10;
        int iY = this.f56484s.Y(this.f56439D.f55735a, z10);
        if ((iY & 1) != 0) {
            R0(true);
        } else if ((iY & 2) != 0) {
            x();
        }
        R(false);
    }

    private void r(b bVar, int i10) throws Throwable {
        this.f56440E.b(1);
        D0 d02 = this.f56485t;
        if (i10 == -1) {
            i10 = d02.r();
        }
        T(d02.f(i10, bVar.f56493a, bVar.f56494b), false);
    }

    private void r0() throws ExoPlaybackException {
        C6205m0 c6205m0Y = this.f56484s.y();
        if (c6205m0Y == null || this.f56484s.u() == c6205m0Y || c6205m0Y.f56563i || !S1()) {
            return;
        }
        this.f56484s.y().f56563i = true;
    }

    private void r1(p3.s sVar) throws Throwable {
        this.f56440E.b(1);
        T(this.f56485t.D(sVar), false);
    }

    private void s() {
        C16999E c16999eP = this.f56484s.u().p();
        for (int i10 = 0; i10 < this.f56462a.length; i10++) {
            if (c16999eP.c(i10)) {
                this.f56462a[i10].f();
            }
        }
    }

    private void s0() throws Throwable {
        T(this.f56485t.i(), true);
    }

    private void s1(int i10) {
        E0 e02 = this.f56439D;
        if (e02.f55739e != i10) {
            if (i10 != 2) {
                this.f56460Y = -9223372036854775807L;
            }
            this.f56439D = e02.h(i10);
        }
    }

    private boolean t() {
        if (!this.f56436A) {
            return false;
        }
        for (J0 j02 : this.f56462a) {
            if (j02.u()) {
                return true;
            }
        }
        return false;
    }

    private void t0(c cVar) throws Throwable {
        this.f56440E.b(1);
        T(this.f56485t.v(cVar.f56497a, cVar.f56498b, cVar.f56499c, cVar.f56500d), false);
    }

    private void u0() {
        for (C6205m0 c6205m0U = this.f56484s.u(); c6205m0U != null; c6205m0U = c6205m0U.k()) {
            for (s3.y yVar : c6205m0U.p().f159755c) {
                if (yVar != null) {
                    yVar.e();
                }
            }
        }
    }

    private void u1(Object obj, AtomicBoolean atomicBoolean) throws ExoPlaybackException {
        for (J0 j02 : this.f56462a) {
            j02.S(obj);
        }
        int i10 = this.f56439D.f55739e;
        if (i10 == 3 || i10 == 2) {
            this.f56473h.h(2);
        }
        if (atomicBoolean != null) {
            synchronized (this) {
                atomicBoolean.set(true);
                notifyAll();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C6205m0 v(C6207n0 c6207n0, long j10) {
        return new C6205m0(this.f56464b, j10, this.f56468d, this.f56471f.k(), this.f56485t, c6207n0, this.f56470e, this.f56461Z.f55799a);
    }

    private void v0(boolean z10) {
        for (C6205m0 c6205m0U = this.f56484s.u(); c6205m0U != null; c6205m0U = c6205m0U.k()) {
            for (s3.y yVar : c6205m0U.p().f159755c) {
                if (yVar != null) {
                    yVar.h(z10);
                }
            }
        }
    }

    private void w0() {
        for (C6205m0 c6205m0U = this.f56484s.u(); c6205m0U != null; c6205m0U = c6205m0U.k()) {
            for (s3.y yVar : c6205m0U.p().f159755c) {
                if (yVar != null) {
                    yVar.k();
                }
            }
        }
    }

    private void w1(float f10) throws ExoPlaybackException {
        this.f56469d0 = f10;
        float f11 = f10 * this.f56437B.f();
        for (J0 j02 : this.f56462a) {
            j02.T(f11);
        }
    }

    private void x() {
        if (this.f56436A && t()) {
            for (J0 j02 : this.f56462a) {
                int iH = j02.h();
                j02.c(this.f56480o);
                this.f56452Q -= iH - j02.h();
            }
            this.f56465b0 = -9223372036854775807L;
        }
    }

    private void y(int i10) throws ExoPlaybackException {
        int iH = this.f56462a[i10].h();
        this.f56462a[i10].b(this.f56480o);
        j0(i10, false);
        this.f56452Q -= iH;
    }

    private boolean y1() {
        if (!a0(this.f56484s.n())) {
            return false;
        }
        C6205m0 c6205m0N = this.f56484s.n();
        long jM = M(c6205m0N.l());
        InterfaceC6201k0.a aVar = new InterfaceC6201k0.a(this.f56488w, this.f56439D.f55735a, c6205m0N.f56562h.f56737a, c6205m0N == this.f56484s.u() ? c6205m0N.C(this.f56454S) : c6205m0N.C(this.f56454S) - c6205m0N.f56562h.f56738b, jM, this.f56480o.f().f44370a, this.f56439D.f55746l, this.f56444I, B1(this.f56439D.f55735a, c6205m0N.f56562h.f56737a) ? this.f56486u.c() : -9223372036854775807L, this.f56445J);
        boolean zM = this.f56471f.m(aVar);
        C6205m0 c6205m0U = this.f56484s.u();
        if (zM || !c6205m0U.f56560f || jM >= 500000) {
            return zM;
        }
        if (this.f56478m <= 0 && !this.f56479n) {
            return zM;
        }
        c6205m0U.f56555a.u(this.f56439D.f55753s, false);
        return this.f56471f.m(aVar);
    }

    private void z0() throws ExoPlaybackException {
        this.f56440E.b(1);
        G0(false, false, false, true);
        this.f56471f.i(this.f56488w);
        s1(this.f56439D.f55735a.q() ? 4 : 2);
        L1();
        this.f56485t.w(this.f56472g.c());
        this.f56473h.h(2);
    }

    private boolean z1() {
        E0 e02 = this.f56439D;
        return e02.f55746l && e02.f55748n == 0;
    }

    public void D1() {
        this.f56473h.a(6).a();
    }

    public void E(long j10) {
        this.f56459X = j10;
    }

    public Looper K() {
        return this.f56475j;
    }

    public void Q0(a3.F f10, int i10, long j10) {
        this.f56473h.d(3, new h(f10, i10, j10)).a();
    }

    public void Z0(C5647d c5647d, boolean z10) {
        this.f56473h.c(31, z10 ? 1 : 0, 0, c5647d).a();
    }

    @Override // s3.AbstractC16998D.a
    public void a(H0 h02) {
        this.f56473h.h(26);
    }

    @Override // s3.AbstractC16998D.a
    public void b() {
        this.f56473h.h(10);
    }

    @Override // androidx.media3.exoplayer.D0.d
    public void c() {
        this.f56473h.k(2);
        this.f56473h.h(22);
    }

    @Override // androidx.media3.exoplayer.C6192g.a
    public void d(float f10) {
        this.f56473h.h(34);
    }

    @Override // androidx.media3.exoplayer.C6192g.a
    public void e(int i10) {
        this.f56473h.g(33, i10, 0).a();
    }

    public void e1(List<D0.c> list, int i10, long j10, p3.s sVar) {
        this.f56473h.d(17, new b(list, sVar, i10, j10, null)).a();
    }

    @Override // androidx.media3.exoplayer.source.q.a
    public void f(androidx.media3.exoplayer.source.q qVar) {
        this.f56473h.d(8, qVar).a();
    }

    public void h1(boolean z10, int i10, int i11) {
        this.f56473h.g(1, z10 ? 1 : 0, i10 | (i11 << 4)).a();
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
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.C6199j0.handleMessage(android.os.Message):boolean");
    }

    public void j1(C5643A c5643a) {
        this.f56473h.d(4, c5643a).a();
    }

    @Override // androidx.media3.exoplayer.C6200k.a
    public void m(C5643A c5643a) {
        this.f56473h.d(16, c5643a).a();
    }

    public void m1(int i10) {
        this.f56473h.g(11, i10, 0).a();
    }

    public void p1(boolean z10) {
        this.f56473h.g(12, z10 ? 1 : 0, 0).a();
    }

    public void v1(float f10) {
        this.f56473h.d(32, Float.valueOf(f10)).a();
    }

    @Override // androidx.media3.exoplayer.source.G.a
    /* renamed from: x0, reason: merged with bridge method [inline-methods] */
    public void g(androidx.media3.exoplayer.source.q qVar) {
        this.f56473h.d(9, qVar).a();
    }

    public void y0() {
        this.f56473h.a(29).a();
    }

    private boolean B1(a3.F f10, r.b bVar) {
        if (!bVar.b() && !f10.q()) {
            f10.n(f10.h(bVar.f57157a, this.f56477l).f44412c, this.f56476k);
            if (this.f56476k.f()) {
                F.c cVar = this.f56476k;
                if (cVar.f44441i && cVar.f44438f != -9223372036854775807L) {
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
        Pair<Object, Long> pairJ = f10.j(this.f56476k, this.f56477l, f10.a(this.f56448M), -9223372036854775807L);
        r.b bVarQ = this.f56484s.Q(f10, pairJ.first, 0L);
        long jLongValue = ((Long) pairJ.second).longValue();
        if (bVarQ.b()) {
            f10.h(bVarQ.f57157a, this.f56477l);
            if (bVarQ.f57159c == this.f56477l.l(bVarQ.f57158b)) {
                jG = this.f56477l.g();
            }
            jLongValue = jG;
        }
        return Pair.create(bVarQ, Long.valueOf(jLongValue));
    }

    private void L0(a3.F f10, a3.F f11) {
        if (f10.q() && f11.q()) {
            return;
        }
        int size = this.f56481p.size() - 1;
        while (size >= 0) {
            a3.F f12 = f10;
            a3.F f13 = f11;
            if (!K0(this.f56481p.get(size), f12, f13, this.f56447L, this.f56448M, this.f56476k, this.f56477l)) {
                this.f56481p.get(size).f56501a.j(false);
                this.f56481p.remove(size);
            }
            size--;
            f10 = f12;
            f11 = f13;
        }
        Collections.sort(this.f56481p);
    }

    static int O0(F.c cVar, F.b bVar, int i10, boolean z10, Object obj, a3.F f10, a3.F f11) {
        F.b bVar2;
        Object obj2 = f10.n(f10.h(obj, bVar).f44412c, cVar).f44433a;
        int i11 = 0;
        for (int i12 = 0; i12 < f11.p(); i12++) {
            if (f11.n(i12, cVar).f44433a.equals(obj2)) {
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
        return f11.f(iB2, bVar2).f44412c;
    }

    private void P1(a3.F f10, r.b bVar, a3.F f11, r.b bVar2, long j10, boolean z10) throws ExoPlaybackException {
        Object obj;
        C5643A c5643a;
        if (!B1(f10, bVar)) {
            if (bVar.b()) {
                c5643a = C5643A.f44367d;
            } else {
                c5643a = this.f56439D.f55749o;
            }
            if (!this.f56480o.f().equals(c5643a)) {
                c1(c5643a);
                V(this.f56439D.f55749o, c5643a.f44370a, false, false);
                return;
            }
            return;
        }
        f10.n(f10.h(bVar.f57157a, this.f56477l).f44412c, this.f56476k);
        this.f56486u.a((v.g) d3.P.h(this.f56476k.f44442j));
        if (j10 != -9223372036854775807L) {
            this.f56486u.e(H(f10, bVar.f57157a, j10));
            return;
        }
        Object obj2 = this.f56476k.f44433a;
        if (!f11.q()) {
            obj = f11.n(f11.h(bVar2.f57157a, this.f56477l).f44412c, this.f56476k).f44433a;
        } else {
            obj = null;
        }
        if (Objects.equals(obj, obj2) && !z10) {
            return;
        }
        this.f56486u.e(-9223372036854775807L);
    }

    private void Q(IOException iOException, int i10) {
        ExoPlaybackException exoPlaybackExceptionC = ExoPlaybackException.c(iOException, i10);
        C6205m0 c6205m0U = this.f56484s.u();
        if (c6205m0U != null) {
            exoPlaybackExceptionC = exoPlaybackExceptionC.a(c6205m0U.f56562h.f56737a);
        }
        d3.r.e("ExoPlayerImplInternal", "Playback error", exoPlaybackExceptionC);
        E1(false, false);
        this.f56439D = this.f56439D.f(exoPlaybackExceptionC);
    }

    private long U0(r.b bVar, long j10, boolean z10, boolean z11) throws ExoPlaybackException {
        F1();
        R1(false, true);
        if (z11 || this.f56439D.f55739e == 3) {
            s1(2);
        }
        C6205m0 c6205m0U = this.f56484s.u();
        C6205m0 c6205m0K = c6205m0U;
        while (c6205m0K != null && !bVar.equals(c6205m0K.f56562h.f56737a)) {
            c6205m0K = c6205m0K.k();
        }
        if (z10 || c6205m0U != c6205m0K || (c6205m0K != null && c6205m0K.D(j10) < 0)) {
            z();
            if (c6205m0K != null) {
                while (this.f56484s.u() != c6205m0K) {
                    this.f56484s.b();
                }
                this.f56484s.N(c6205m0K);
                c6205m0K.B(1000000000000L);
                C();
                c6205m0K.f56563i = true;
            }
        }
        x();
        if (c6205m0K != null) {
            this.f56484s.N(c6205m0K);
            if (!c6205m0K.f56560f) {
                c6205m0K.f56562h = c6205m0K.f56562h.b(j10);
            } else if (c6205m0K.f56561g) {
                j10 = c6205m0K.f56555a.h(j10);
                c6205m0K.f56555a.u(j10 - this.f56478m, this.f56479n);
            }
            I0(j10);
            d0();
        } else {
            this.f56484s.g();
            I0(j10);
        }
        R(false);
        this.f56473h.h(2);
        return j10;
    }

    private void V0(F0 f02) throws ExoPlaybackException {
        if (f02.e() == -9223372036854775807L) {
            W0(f02);
            return;
        }
        if (this.f56439D.f55735a.q()) {
            this.f56481p.add(new d(f02));
            return;
        }
        d dVar = new d(f02);
        a3.F f10 = this.f56439D.f55735a;
        if (K0(dVar, f10, f10, this.f56447L, this.f56448M, this.f56476k, this.f56477l)) {
            this.f56481p.add(dVar);
            Collections.sort(this.f56481p);
        } else {
            f02.j(false);
        }
    }

    private void W0(F0 f02) throws ExoPlaybackException {
        if (f02.b() == this.f56475j) {
            w(f02);
            int i10 = this.f56439D.f55739e;
            if (i10 != 3 && i10 != 2) {
                return;
            }
            this.f56473h.h(2);
            return;
        }
        this.f56473h.d(15, f02).a();
    }

    private void X0(final F0 f02) {
        Looper looperB = f02.b();
        if (!looperB.getThread().isAlive()) {
            d3.r.i("TAG", "Trying to send message on a dead thread.");
            f02.j(false);
        } else {
            this.f56482q.e(looperB, null).post(new Runnable() { // from class: androidx.media3.exoplayer.i0
                @Override // java.lang.Runnable
                public final void run() {
                    C6199j0.k(this.f56419a, f02);
                }
            });
        }
    }

    private void d0() {
        boolean zY1 = y1();
        this.f56446K = zY1;
        if (zY1) {
            C6205m0 c6205m0 = (C6205m0) C13599a.e(this.f56484s.n());
            c6205m0.e(new C6203l0.b().f(c6205m0.C(this.f56454S)).g(this.f56480o.f().f44370a).e(this.f56445J).d());
        }
        G1();
    }

    public static /* synthetic */ void k(C6199j0 c6199j0, F0 f02) {
        c6199j0.getClass();
        try {
            c6199j0.w(f02);
        } catch (ExoPlaybackException e10) {
            d3.r.e("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e10);
            throw new RuntimeException(e10);
        }
    }

    private void k1(C5643A c5643a) throws ExoPlaybackException {
        c1(c5643a);
        W(this.f56480o.f(), true);
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
        C6205m0 c6205m0U;
        C6205m0 c6205m0K;
        if (!z1() || this.f56443H || (c6205m0U = this.f56484s.u()) == null || (c6205m0K = c6205m0U.k()) == null || this.f56454S < c6205m0K.n() || !c6205m0K.f56563i) {
            return false;
        }
        return true;
    }
}
