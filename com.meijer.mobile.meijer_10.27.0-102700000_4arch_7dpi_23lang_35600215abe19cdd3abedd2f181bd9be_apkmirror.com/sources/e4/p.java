package e4;

import a3.C5570j;
import a3.t;
import android.util.SparseArray;
import d3.C13466a;
import d3.C13474i;
import d3.P;
import e3.f;
import e4.L;
import java.util.ArrayList;
import java.util.Arrays;
import x3.O;

/* loaded from: classes4.dex */
public final class p implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final G f128432a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f128433b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f128434c;

    /* renamed from: d, reason: collision with root package name */
    private final String f128435d;

    /* renamed from: h, reason: collision with root package name */
    private long f128439h;

    /* renamed from: j, reason: collision with root package name */
    private String f128441j;

    /* renamed from: k, reason: collision with root package name */
    private O f128442k;

    /* renamed from: l, reason: collision with root package name */
    private b f128443l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f128444m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f128446o;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f128440i = new boolean[3];

    /* renamed from: e, reason: collision with root package name */
    private final w f128436e = new w(7, 128);

    /* renamed from: f, reason: collision with root package name */
    private final w f128437f = new w(8, 128);

    /* renamed from: g, reason: collision with root package name */
    private final w f128438g = new w(6, 128);

    /* renamed from: n, reason: collision with root package name */
    private long f128445n = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    private final d3.D f128447p = new d3.D();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final O f128448a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f128449b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f128450c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<f.m> f128451d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<f.l> f128452e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final e3.h f128453f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f128454g;

        /* renamed from: h, reason: collision with root package name */
        private int f128455h;

        /* renamed from: i, reason: collision with root package name */
        private int f128456i;

        /* renamed from: j, reason: collision with root package name */
        private long f128457j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f128458k;

        /* renamed from: l, reason: collision with root package name */
        private long f128459l;

        /* renamed from: m, reason: collision with root package name */
        private a f128460m;

        /* renamed from: n, reason: collision with root package name */
        private a f128461n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f128462o;

        /* renamed from: p, reason: collision with root package name */
        private long f128463p;

        /* renamed from: q, reason: collision with root package name */
        private long f128464q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f128465r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f128466s;

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f128467a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f128468b;

            /* renamed from: c, reason: collision with root package name */
            private f.m f128469c;

            /* renamed from: d, reason: collision with root package name */
            private int f128470d;

            /* renamed from: e, reason: collision with root package name */
            private int f128471e;

            /* renamed from: f, reason: collision with root package name */
            private int f128472f;

            /* renamed from: g, reason: collision with root package name */
            private int f128473g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f128474h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f128475i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f128476j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f128477k;

            /* renamed from: l, reason: collision with root package name */
            private int f128478l;

            /* renamed from: m, reason: collision with root package name */
            private int f128479m;

            /* renamed from: n, reason: collision with root package name */
            private int f128480n;

            /* renamed from: o, reason: collision with root package name */
            private int f128481o;

            /* renamed from: p, reason: collision with root package name */
            private int f128482p;

            private a() {
            }

            public void b() {
                this.f128468b = false;
                this.f128467a = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f128467a) {
                    return false;
                }
                if (!aVar.f128467a) {
                    return true;
                }
                f.m mVar = (f.m) C13466a.i(this.f128469c);
                f.m mVar2 = (f.m) C13466a.i(aVar.f128469c);
                return (this.f128472f == aVar.f128472f && this.f128473g == aVar.f128473g && this.f128474h == aVar.f128474h && (!this.f128475i || !aVar.f128475i || this.f128476j == aVar.f128476j) && (((i10 = this.f128470d) == (i11 = aVar.f128470d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f128157n) != 0 || mVar2.f128157n != 0 || (this.f128479m == aVar.f128479m && this.f128480n == aVar.f128480n)) && ((i12 != 1 || mVar2.f128157n != 1 || (this.f128481o == aVar.f128481o && this.f128482p == aVar.f128482p)) && (z10 = this.f128477k) == aVar.f128477k && (!z10 || this.f128478l == aVar.f128478l))))) ? false : true;
            }

            public boolean d() {
                if (!this.f128468b) {
                    return false;
                }
                int i10 = this.f128471e;
                return i10 == 7 || i10 == 2;
            }

            public void e(f.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f128469c = mVar;
                this.f128470d = i10;
                this.f128471e = i11;
                this.f128472f = i12;
                this.f128473g = i13;
                this.f128474h = z10;
                this.f128475i = z11;
                this.f128476j = z12;
                this.f128477k = z13;
                this.f128478l = i14;
                this.f128479m = i15;
                this.f128480n = i16;
                this.f128481o = i17;
                this.f128482p = i18;
                this.f128467a = true;
                this.f128468b = true;
            }

            public void f(int i10) {
                this.f128471e = i10;
                this.f128468b = true;
            }
        }

        public void g() {
            this.f128458k = false;
            this.f128462o = false;
            this.f128461n.b();
        }

        private void d(int i10) {
            long j10 = this.f128464q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f128457j;
                long j12 = this.f128463p;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f128448a.c(j10, this.f128465r ? 1 : 0, i11, i10, null);
            }
        }

        private void h() {
            boolean zD = this.f128449b ? this.f128461n.d() : this.f128466s;
            boolean z10 = this.f128465r;
            int i10 = this.f128456i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f128465r = z10 | z11;
        }

        /* JADX WARN: Removed duplicated region for block: B:53:0x0109  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0110  */
        /* JADX WARN: Removed duplicated region for block: B:60:0x0123  */
        /* JADX WARN: Removed duplicated region for block: B:63:0x0129  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x0161  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void a(byte[] r24, int r25, int r26) {
            /*
                Method dump skipped, instructions count: 426
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: e4.p.b.a(byte[], int, int):void");
        }

        public boolean b(long j10, int i10, boolean z10) {
            if (this.f128456i == 9 || (this.f128450c && this.f128461n.c(this.f128460m))) {
                if (z10 && this.f128462o) {
                    d(i10 + ((int) (j10 - this.f128457j)));
                }
                this.f128463p = this.f128457j;
                this.f128464q = this.f128459l;
                this.f128465r = false;
                this.f128462o = true;
            }
            h();
            this.f128456i = 24;
            return this.f128465r;
        }

        public boolean c() {
            return this.f128450c;
        }

        public void e(f.l lVar) {
            this.f128452e.append(lVar.f128141a, lVar);
        }

        public void f(f.m mVar) {
            this.f128451d.append(mVar.f128147d, mVar);
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f128456i = i10;
            this.f128459l = j11;
            this.f128457j = j10;
            this.f128466s = z10;
            if (!this.f128449b || i10 != 1) {
                if (!this.f128450c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f128460m;
            this.f128460m = this.f128461n;
            this.f128461n = aVar;
            aVar.b();
            this.f128455h = 0;
            this.f128458k = true;
        }

        public b(O o10, boolean z10, boolean z11) {
            this.f128448a = o10;
            this.f128449b = z10;
            this.f128450c = z11;
            this.f128460m = new a();
            this.f128461n = new a();
            byte[] bArr = new byte[128];
            this.f128454g = bArr;
            this.f128453f = new e3.h(bArr, 0, 0);
            g();
        }
    }

    private void b() {
        C13466a.i(this.f128442k);
        P.h(this.f128443l);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f128444m || this.f128443l.c()) {
            this.f128436e.b(i11);
            this.f128437f.b(i11);
            if (this.f128444m) {
                if (this.f128436e.c()) {
                    w wVar = this.f128436e;
                    f.m mVarC = e3.f.C(wVar.f128587d, 3, wVar.f128588e);
                    this.f128432a.f(mVarC.f128163t);
                    this.f128443l.f(mVarC);
                    this.f128436e.d();
                } else if (this.f128437f.c()) {
                    w wVar2 = this.f128437f;
                    this.f128443l.e(e3.f.A(wVar2.f128587d, 3, wVar2.f128588e));
                    this.f128437f.d();
                }
            } else if (this.f128436e.c() && this.f128437f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f128436e;
                arrayList.add(Arrays.copyOf(wVar3.f128587d, wVar3.f128588e));
                w wVar4 = this.f128437f;
                arrayList.add(Arrays.copyOf(wVar4.f128587d, wVar4.f128588e));
                w wVar5 = this.f128436e;
                f.m mVarC2 = e3.f.C(wVar5.f128587d, 3, wVar5.f128588e);
                w wVar6 = this.f128437f;
                f.l lVarA = e3.f.A(wVar6.f128587d, 3, wVar6.f128588e);
                this.f128442k.b(new t.b().f0(this.f128441j).U(this.f128435d).u0("video/avc").S(C13474i.d(mVarC2.f128144a, mVarC2.f128145b, mVarC2.f128146c)).z0(mVarC2.f128149f).d0(mVarC2.f128150g).T(new C5570j.b().d(mVarC2.f128160q).c(mVarC2.f128161r).e(mVarC2.f128162s).g(mVarC2.f128152i + 8).b(mVarC2.f128153j + 8).a()).q0(mVarC2.f128151h).g0(arrayList).l0(mVarC2.f128163t).N());
                this.f128444m = true;
                this.f128432a.f(mVarC2.f128163t);
                this.f128443l.f(mVarC2);
                this.f128443l.e(lVarA);
                this.f128436e.d();
                this.f128437f.d();
            }
        }
        if (this.f128438g.b(i11)) {
            w wVar7 = this.f128438g;
            this.f128447p.U(this.f128438g.f128587d, e3.f.L(wVar7.f128587d, wVar7.f128588e));
            this.f128447p.W(4);
            this.f128432a.c(j11, this.f128447p);
        }
        if (this.f128443l.b(j10, i10, this.f128444m)) {
            this.f128446o = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f128444m || this.f128443l.c()) {
            this.f128436e.a(bArr, i10, i11);
            this.f128437f.a(bArr, i10, i11);
        }
        this.f128438g.a(bArr, i10, i11);
        this.f128443l.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f128444m || this.f128443l.c()) {
            this.f128436e.e(i10);
            this.f128437f.e(i10);
        }
        this.f128438g.e(i10);
        this.f128443l.i(j10, i10, j11, this.f128446o);
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128439h = 0L;
        this.f128446o = false;
        this.f128445n = -9223372036854775807L;
        e3.f.c(this.f128440i);
        this.f128436e.d();
        this.f128437f.d();
        this.f128438g.d();
        this.f128432a.b();
        b bVar = this.f128443l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128445n = j10;
        this.f128446o |= (i10 & 2) != 0;
    }

    public p(G g10, boolean z10, boolean z11, String str) {
        this.f128432a = g10;
        this.f128433b = z10;
        this.f128434c = z11;
        this.f128435d = str;
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        int i10;
        int i11;
        b();
        int iF = d10.f();
        int iG = d10.g();
        byte[] bArrE = d10.e();
        this.f128439h += d10.a();
        this.f128442k.d(d10, d10.a());
        while (true) {
            int iE = e3.f.e(bArrE, iF, iG, this.f128440i);
            if (iE == iG) {
                h(bArrE, iF, iG);
                return;
            }
            int iJ = e3.f.j(bArrE, iE);
            if (iE > 0 && bArrE[iE - 1] == 0) {
                iE--;
                i10 = 4;
            } else {
                i10 = 3;
            }
            int i12 = iE;
            int i13 = i10;
            int i14 = i12 - iF;
            if (i14 > 0) {
                h(bArrE, iF, i12);
            }
            int i15 = iG - i12;
            long j10 = this.f128439h - i15;
            if (i14 < 0) {
                i11 = -i14;
            } else {
                i11 = 0;
            }
            g(j10, i15, i11, this.f128445n);
            i(j10, iJ, this.f128445n);
            iF = i12 + i13;
        }
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
        b();
        if (z10) {
            this.f128432a.e();
            g(this.f128439h, 0, 0, this.f128445n);
            i(this.f128439h, 9, this.f128445n);
            g(this.f128439h, 0, 0, this.f128445n);
        }
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128441j = dVar.b();
        O oT = rVar.t(dVar.c(), 2);
        this.f128442k = oT;
        this.f128443l = new b(oT, this.f128433b, this.f128434c);
        this.f128432a.d(rVar, dVar);
    }
}
