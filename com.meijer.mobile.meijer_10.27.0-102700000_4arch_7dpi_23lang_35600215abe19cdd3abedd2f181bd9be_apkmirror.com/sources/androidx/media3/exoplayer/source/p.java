package androidx.media3.exoplayer.source;

import a3.C5562b;
import a3.F;
import androidx.media3.exoplayer.source.r;
import java.util.Objects;

/* loaded from: classes.dex */
public final class p extends L {

    /* renamed from: m, reason: collision with root package name */
    private final boolean f56920m;

    /* renamed from: n, reason: collision with root package name */
    private final F.c f56921n;

    /* renamed from: o, reason: collision with root package name */
    private final F.b f56922o;

    /* renamed from: p, reason: collision with root package name */
    private a f56923p;

    /* renamed from: q, reason: collision with root package name */
    private o f56924q;

    /* renamed from: r, reason: collision with root package name */
    private boolean f56925r;

    /* renamed from: s, reason: collision with root package name */
    private boolean f56926s;

    /* renamed from: t, reason: collision with root package name */
    private boolean f56927t;

    private static final class a extends m {

        /* renamed from: h, reason: collision with root package name */
        public static final Object f56928h = new Object();

        /* renamed from: f, reason: collision with root package name */
        private final Object f56929f;

        /* renamed from: g, reason: collision with root package name */
        private final Object f56930g;

        public static a u(a3.v vVar) {
            return new a(new b(vVar), F.c.f43605q, f56928h);
        }

        public static a v(a3.F f10, Object obj, Object obj2) {
            return new a(f10, obj, obj2);
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public int b(Object obj) {
            Object obj2;
            a3.F f10 = this.f56905e;
            if (f56928h.equals(obj) && (obj2 = this.f56930g) != null) {
                obj = obj2;
            }
            return f10.b(obj);
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            this.f56905e.g(i10, bVar, z10);
            if (Objects.equals(bVar.f43593b, this.f56930g) && z10) {
                bVar.f43593b = f56928h;
            }
            return bVar;
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public Object m(int i10) {
            Object objM = this.f56905e.m(i10);
            return Objects.equals(objM, this.f56930g) ? f56928h : objM;
        }

        @Override // androidx.media3.exoplayer.source.m, a3.F
        public F.c o(int i10, F.c cVar, long j10) {
            this.f56905e.o(i10, cVar, j10);
            if (Objects.equals(cVar.f43615a, this.f56929f)) {
                cVar.f43615a = F.c.f43605q;
            }
            return cVar;
        }

        public a t(a3.F f10) {
            return new a(f10, this.f56929f, this.f56930g);
        }

        private a(a3.F f10, Object obj, Object obj2) {
            super(f10);
            this.f56929f = obj;
            this.f56930g = obj2;
        }
    }

    public static final class b extends a3.F {

        /* renamed from: e, reason: collision with root package name */
        private final a3.v f56931e;

        @Override // a3.F
        public F.b g(int i10, F.b bVar, boolean z10) {
            bVar.u(z10 ? 0 : null, z10 ? a.f56928h : null, 0, -9223372036854775807L, 0L, C5562b.f43777g, true);
            return bVar;
        }

        @Override // a3.F
        public int i() {
            return 1;
        }

        @Override // a3.F
        public int p() {
            return 1;
        }

        @Override // a3.F
        public int b(Object obj) {
            return obj == a.f56928h ? 0 : -1;
        }

        @Override // a3.F
        public Object m(int i10) {
            return a.f56928h;
        }

        @Override // a3.F
        public F.c o(int i10, F.c cVar, long j10) {
            cVar.g(F.c.f43605q, this.f56931e, null, -9223372036854775807L, -9223372036854775807L, -9223372036854775807L, false, true, null, 0L, -9223372036854775807L, 0, 0, 0L);
            cVar.f43625k = true;
            return cVar;
        }

        public b(a3.v vVar) {
            this.f56931e = vVar;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6077c, androidx.media3.exoplayer.source.AbstractC6075a
    public void A() {
        this.f56926s = false;
        this.f56925r = false;
        super.A();
    }

    @Override // androidx.media3.exoplayer.source.r
    public void h(q qVar) {
        ((o) qVar).v();
        if (qVar == this.f56924q) {
            this.f56924q = null;
        }
    }

    @Override // androidx.media3.exoplayer.source.AbstractC6077c, androidx.media3.exoplayer.source.r
    public void m() {
    }

    private Object T(Object obj) {
        return (this.f56923p.f56930g == null || !this.f56923p.f56930g.equals(obj)) ? obj : a.f56928h;
    }

    private Object U(Object obj) {
        return (this.f56923p.f56930g == null || !obj.equals(a.f56928h)) ? obj : this.f56923p.f56930g;
    }

    private boolean W(long j10) {
        o oVar = this.f56924q;
        int iB = this.f56923p.b(oVar.f56911a.f56933a);
        if (iB == -1) {
            return false;
        }
        long j11 = this.f56923p.f(iB, this.f56922o).f43595d;
        if (j11 != -9223372036854775807L && j10 >= j11) {
            j10 = Math.max(0L, j11 - 1);
        }
        oVar.t(j10);
        return true;
    }

    @Override // androidx.media3.exoplayer.source.L
    protected r.b I(r.b bVar) {
        return bVar.a(T(bVar.f56933a));
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    @Override // androidx.media3.exoplayer.source.L
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected void O(a3.F r15) {
        /*
            r14 = this;
            boolean r0 = r14.f56926s
            if (r0 == 0) goto L19
            androidx.media3.exoplayer.source.p$a r0 = r14.f56923p
            androidx.media3.exoplayer.source.p$a r15 = r0.t(r15)
            r14.f56923p = r15
            androidx.media3.exoplayer.source.o r15 = r14.f56924q
            if (r15 == 0) goto Lb1
            long r0 = r15.m()
            r14.W(r0)
            goto Lb1
        L19:
            boolean r0 = r15.q()
            if (r0 == 0) goto L36
            boolean r0 = r14.f56927t
            if (r0 == 0) goto L2a
            androidx.media3.exoplayer.source.p$a r0 = r14.f56923p
            androidx.media3.exoplayer.source.p$a r15 = r0.t(r15)
            goto L32
        L2a:
            java.lang.Object r0 = a3.F.c.f43605q
            java.lang.Object r1 = androidx.media3.exoplayer.source.p.a.f56928h
            androidx.media3.exoplayer.source.p$a r15 = androidx.media3.exoplayer.source.p.a.v(r15, r0, r1)
        L32:
            r14.f56923p = r15
            goto Lb1
        L36:
            a3.F$c r0 = r14.f56921n
            r1 = 0
            r15.n(r1, r0)
            a3.F$c r0 = r14.f56921n
            long r2 = r0.c()
            a3.F$c r0 = r14.f56921n
            java.lang.Object r0 = r0.f43615a
            androidx.media3.exoplayer.source.o r4 = r14.f56924q
            if (r4 == 0) goto L74
            long r4 = r4.o()
            androidx.media3.exoplayer.source.p$a r6 = r14.f56923p
            androidx.media3.exoplayer.source.o r7 = r14.f56924q
            androidx.media3.exoplayer.source.r$b r7 = r7.f56911a
            java.lang.Object r7 = r7.f56933a
            a3.F$b r8 = r14.f56922o
            r6.h(r7, r8)
            a3.F$b r6 = r14.f56922o
            long r6 = r6.o()
            long r6 = r6 + r4
            androidx.media3.exoplayer.source.p$a r4 = r14.f56923p
            a3.F$c r5 = r14.f56921n
            a3.F$c r1 = r4.n(r1, r5)
            long r4 = r1.c()
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 == 0) goto L74
            r12 = r6
            goto L75
        L74:
            r12 = r2
        L75:
            a3.F$c r9 = r14.f56921n
            a3.F$b r10 = r14.f56922o
            r11 = 0
            r8 = r15
            android.util.Pair r15 = r8.j(r9, r10, r11, r12)
            java.lang.Object r1 = r15.first
            java.lang.Object r15 = r15.second
            java.lang.Long r15 = (java.lang.Long) r15
            long r2 = r15.longValue()
            boolean r15 = r14.f56927t
            if (r15 == 0) goto L94
            androidx.media3.exoplayer.source.p$a r15 = r14.f56923p
            androidx.media3.exoplayer.source.p$a r15 = r15.t(r8)
            goto L98
        L94:
            androidx.media3.exoplayer.source.p$a r15 = androidx.media3.exoplayer.source.p.a.v(r8, r0, r1)
        L98:
            r14.f56923p = r15
            androidx.media3.exoplayer.source.o r15 = r14.f56924q
            if (r15 == 0) goto Lb1
            boolean r0 = r14.W(r2)
            if (r0 == 0) goto Lb1
            androidx.media3.exoplayer.source.r$b r15 = r15.f56911a
            java.lang.Object r0 = r15.f56933a
            java.lang.Object r0 = r14.U(r0)
            androidx.media3.exoplayer.source.r$b r15 = r15.a(r0)
            goto Lb2
        Lb1:
            r15 = 0
        Lb2:
            r0 = 1
            r14.f56927t = r0
            r14.f56926s = r0
            androidx.media3.exoplayer.source.p$a r0 = r14.f56923p
            r14.z(r0)
            if (r15 == 0) goto Lc9
            androidx.media3.exoplayer.source.o r0 = r14.f56924q
            java.lang.Object r0 = d3.C13466a.e(r0)
            androidx.media3.exoplayer.source.o r0 = (androidx.media3.exoplayer.source.o) r0
            r0.l(r15)
        Lc9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.exoplayer.source.p.O(a3.F):void");
    }

    @Override // androidx.media3.exoplayer.source.L
    public void R() {
        if (this.f56920m) {
            return;
        }
        this.f56925r = true;
        Q();
    }

    @Override // androidx.media3.exoplayer.source.r
    /* renamed from: S, reason: merged with bridge method [inline-methods] */
    public o j(r.b bVar, t3.b bVar2, long j10) {
        o oVar = new o(bVar, bVar2, j10);
        oVar.w(this.f56770k);
        if (this.f56926s) {
            oVar.l(bVar.a(U(bVar.f56933a)));
            return oVar;
        }
        this.f56924q = oVar;
        if (!this.f56925r) {
            this.f56925r = true;
            Q();
        }
        return oVar;
    }

    public a3.F V() {
        return this.f56923p;
    }

    @Override // androidx.media3.exoplayer.source.L, androidx.media3.exoplayer.source.r
    public void c(a3.v vVar) {
        if (this.f56927t) {
            this.f56923p = this.f56923p.t(new p3.u(this.f56923p.f56905e, vVar));
        } else {
            this.f56923p = a.u(vVar);
        }
        this.f56770k.c(vVar);
    }

    public p(r rVar, boolean z10) {
        boolean z11;
        super(rVar);
        if (z10 && rVar.n()) {
            z11 = true;
        } else {
            z11 = false;
        }
        this.f56920m = z11;
        this.f56921n = new F.c();
        this.f56922o = new F.b();
        a3.F fO = rVar.o();
        if (fO != null) {
            this.f56923p = a.v(fO, null, null);
            this.f56927t = true;
        } else {
            this.f56923p = a.u(rVar.e());
        }
    }
}
