package e4;

import a3.C5653j;
import a3.t;
import android.util.SparseArray;
import d3.C13599a;
import d3.C13607i;
import d3.P;
import e3.f;
import e4.L;
import java.util.ArrayList;
import java.util.Arrays;
import x3.O;

/* loaded from: classes4.dex */
public final class p implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final G f129768a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f129769b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f129770c;

    /* renamed from: d, reason: collision with root package name */
    private final String f129771d;

    /* renamed from: h, reason: collision with root package name */
    private long f129775h;

    /* renamed from: j, reason: collision with root package name */
    private String f129777j;

    /* renamed from: k, reason: collision with root package name */
    private O f129778k;

    /* renamed from: l, reason: collision with root package name */
    private b f129779l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f129780m;

    /* renamed from: o, reason: collision with root package name */
    private boolean f129782o;

    /* renamed from: i, reason: collision with root package name */
    private final boolean[] f129776i = new boolean[3];

    /* renamed from: e, reason: collision with root package name */
    private final w f129772e = new w(7, 128);

    /* renamed from: f, reason: collision with root package name */
    private final w f129773f = new w(8, 128);

    /* renamed from: g, reason: collision with root package name */
    private final w f129774g = new w(6, 128);

    /* renamed from: n, reason: collision with root package name */
    private long f129781n = -9223372036854775807L;

    /* renamed from: p, reason: collision with root package name */
    private final d3.D f129783p = new d3.D();

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final O f129784a;

        /* renamed from: b, reason: collision with root package name */
        private final boolean f129785b;

        /* renamed from: c, reason: collision with root package name */
        private final boolean f129786c;

        /* renamed from: d, reason: collision with root package name */
        private final SparseArray<f.m> f129787d = new SparseArray<>();

        /* renamed from: e, reason: collision with root package name */
        private final SparseArray<f.l> f129788e = new SparseArray<>();

        /* renamed from: f, reason: collision with root package name */
        private final e3.h f129789f;

        /* renamed from: g, reason: collision with root package name */
        private byte[] f129790g;

        /* renamed from: h, reason: collision with root package name */
        private int f129791h;

        /* renamed from: i, reason: collision with root package name */
        private int f129792i;

        /* renamed from: j, reason: collision with root package name */
        private long f129793j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f129794k;

        /* renamed from: l, reason: collision with root package name */
        private long f129795l;

        /* renamed from: m, reason: collision with root package name */
        private a f129796m;

        /* renamed from: n, reason: collision with root package name */
        private a f129797n;

        /* renamed from: o, reason: collision with root package name */
        private boolean f129798o;

        /* renamed from: p, reason: collision with root package name */
        private long f129799p;

        /* renamed from: q, reason: collision with root package name */
        private long f129800q;

        /* renamed from: r, reason: collision with root package name */
        private boolean f129801r;

        /* renamed from: s, reason: collision with root package name */
        private boolean f129802s;

        private static final class a {

            /* renamed from: a, reason: collision with root package name */
            private boolean f129803a;

            /* renamed from: b, reason: collision with root package name */
            private boolean f129804b;

            /* renamed from: c, reason: collision with root package name */
            private f.m f129805c;

            /* renamed from: d, reason: collision with root package name */
            private int f129806d;

            /* renamed from: e, reason: collision with root package name */
            private int f129807e;

            /* renamed from: f, reason: collision with root package name */
            private int f129808f;

            /* renamed from: g, reason: collision with root package name */
            private int f129809g;

            /* renamed from: h, reason: collision with root package name */
            private boolean f129810h;

            /* renamed from: i, reason: collision with root package name */
            private boolean f129811i;

            /* renamed from: j, reason: collision with root package name */
            private boolean f129812j;

            /* renamed from: k, reason: collision with root package name */
            private boolean f129813k;

            /* renamed from: l, reason: collision with root package name */
            private int f129814l;

            /* renamed from: m, reason: collision with root package name */
            private int f129815m;

            /* renamed from: n, reason: collision with root package name */
            private int f129816n;

            /* renamed from: o, reason: collision with root package name */
            private int f129817o;

            /* renamed from: p, reason: collision with root package name */
            private int f129818p;

            private a() {
            }

            public void b() {
                this.f129804b = false;
                this.f129803a = false;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public boolean c(a aVar) {
                int i10;
                int i11;
                int i12;
                boolean z10;
                if (!this.f129803a) {
                    return false;
                }
                if (!aVar.f129803a) {
                    return true;
                }
                f.m mVar = (f.m) C13599a.i(this.f129805c);
                f.m mVar2 = (f.m) C13599a.i(aVar.f129805c);
                return (this.f129808f == aVar.f129808f && this.f129809g == aVar.f129809g && this.f129810h == aVar.f129810h && (!this.f129811i || !aVar.f129811i || this.f129812j == aVar.f129812j) && (((i10 = this.f129806d) == (i11 = aVar.f129806d) || (i10 != 0 && i11 != 0)) && (((i12 = mVar.f129493n) != 0 || mVar2.f129493n != 0 || (this.f129815m == aVar.f129815m && this.f129816n == aVar.f129816n)) && ((i12 != 1 || mVar2.f129493n != 1 || (this.f129817o == aVar.f129817o && this.f129818p == aVar.f129818p)) && (z10 = this.f129813k) == aVar.f129813k && (!z10 || this.f129814l == aVar.f129814l))))) ? false : true;
            }

            public boolean d() {
                if (!this.f129804b) {
                    return false;
                }
                int i10 = this.f129807e;
                return i10 == 7 || i10 == 2;
            }

            public void e(f.m mVar, int i10, int i11, int i12, int i13, boolean z10, boolean z11, boolean z12, boolean z13, int i14, int i15, int i16, int i17, int i18) {
                this.f129805c = mVar;
                this.f129806d = i10;
                this.f129807e = i11;
                this.f129808f = i12;
                this.f129809g = i13;
                this.f129810h = z10;
                this.f129811i = z11;
                this.f129812j = z12;
                this.f129813k = z13;
                this.f129814l = i14;
                this.f129815m = i15;
                this.f129816n = i16;
                this.f129817o = i17;
                this.f129818p = i18;
                this.f129803a = true;
                this.f129804b = true;
            }

            public void f(int i10) {
                this.f129807e = i10;
                this.f129804b = true;
            }
        }

        public void g() {
            this.f129794k = false;
            this.f129798o = false;
            this.f129797n.b();
        }

        private void d(int i10) {
            long j10 = this.f129800q;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f129793j;
                long j12 = this.f129799p;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f129784a.c(j10, this.f129801r ? 1 : 0, i11, i10, null);
            }
        }

        private void h() {
            boolean zD = this.f129785b ? this.f129797n.d() : this.f129802s;
            boolean z10 = this.f129801r;
            int i10 = this.f129792i;
            boolean z11 = true;
            if (i10 != 5 && (!zD || i10 != 1)) {
                z11 = false;
            }
            this.f129801r = z10 | z11;
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
            if (this.f129792i == 9 || (this.f129786c && this.f129797n.c(this.f129796m))) {
                if (z10 && this.f129798o) {
                    d(i10 + ((int) (j10 - this.f129793j)));
                }
                this.f129799p = this.f129793j;
                this.f129800q = this.f129795l;
                this.f129801r = false;
                this.f129798o = true;
            }
            h();
            this.f129792i = 24;
            return this.f129801r;
        }

        public boolean c() {
            return this.f129786c;
        }

        public void e(f.l lVar) {
            this.f129788e.append(lVar.f129477a, lVar);
        }

        public void f(f.m mVar) {
            this.f129787d.append(mVar.f129483d, mVar);
        }

        public void i(long j10, int i10, long j11, boolean z10) {
            this.f129792i = i10;
            this.f129795l = j11;
            this.f129793j = j10;
            this.f129802s = z10;
            if (!this.f129785b || i10 != 1) {
                if (!this.f129786c) {
                    return;
                }
                if (i10 != 5 && i10 != 1 && i10 != 2) {
                    return;
                }
            }
            a aVar = this.f129796m;
            this.f129796m = this.f129797n;
            this.f129797n = aVar;
            aVar.b();
            this.f129791h = 0;
            this.f129794k = true;
        }

        public b(O o10, boolean z10, boolean z11) {
            this.f129784a = o10;
            this.f129785b = z10;
            this.f129786c = z11;
            this.f129796m = new a();
            this.f129797n = new a();
            byte[] bArr = new byte[128];
            this.f129790g = bArr;
            this.f129789f = new e3.h(bArr, 0, 0);
            g();
        }
    }

    private void b() {
        C13599a.i(this.f129778k);
        P.h(this.f129779l);
    }

    private void g(long j10, int i10, int i11, long j11) {
        if (!this.f129780m || this.f129779l.c()) {
            this.f129772e.b(i11);
            this.f129773f.b(i11);
            if (this.f129780m) {
                if (this.f129772e.c()) {
                    w wVar = this.f129772e;
                    f.m mVarC = e3.f.C(wVar.f129923d, 3, wVar.f129924e);
                    this.f129768a.f(mVarC.f129499t);
                    this.f129779l.f(mVarC);
                    this.f129772e.d();
                } else if (this.f129773f.c()) {
                    w wVar2 = this.f129773f;
                    this.f129779l.e(e3.f.A(wVar2.f129923d, 3, wVar2.f129924e));
                    this.f129773f.d();
                }
            } else if (this.f129772e.c() && this.f129773f.c()) {
                ArrayList arrayList = new ArrayList();
                w wVar3 = this.f129772e;
                arrayList.add(Arrays.copyOf(wVar3.f129923d, wVar3.f129924e));
                w wVar4 = this.f129773f;
                arrayList.add(Arrays.copyOf(wVar4.f129923d, wVar4.f129924e));
                w wVar5 = this.f129772e;
                f.m mVarC2 = e3.f.C(wVar5.f129923d, 3, wVar5.f129924e);
                w wVar6 = this.f129773f;
                f.l lVarA = e3.f.A(wVar6.f129923d, 3, wVar6.f129924e);
                this.f129778k.b(new t.b().f0(this.f129777j).U(this.f129771d).u0("video/avc").S(C13607i.d(mVarC2.f129480a, mVarC2.f129481b, mVarC2.f129482c)).z0(mVarC2.f129485f).d0(mVarC2.f129486g).T(new C5653j.b().d(mVarC2.f129496q).c(mVarC2.f129497r).e(mVarC2.f129498s).g(mVarC2.f129488i + 8).b(mVarC2.f129489j + 8).a()).q0(mVarC2.f129487h).g0(arrayList).l0(mVarC2.f129499t).N());
                this.f129780m = true;
                this.f129768a.f(mVarC2.f129499t);
                this.f129779l.f(mVarC2);
                this.f129779l.e(lVarA);
                this.f129772e.d();
                this.f129773f.d();
            }
        }
        if (this.f129774g.b(i11)) {
            w wVar7 = this.f129774g;
            this.f129783p.U(this.f129774g.f129923d, e3.f.L(wVar7.f129923d, wVar7.f129924e));
            this.f129783p.W(4);
            this.f129768a.c(j11, this.f129783p);
        }
        if (this.f129779l.b(j10, i10, this.f129780m)) {
            this.f129782o = false;
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        if (!this.f129780m || this.f129779l.c()) {
            this.f129772e.a(bArr, i10, i11);
            this.f129773f.a(bArr, i10, i11);
        }
        this.f129774g.a(bArr, i10, i11);
        this.f129779l.a(bArr, i10, i11);
    }

    private void i(long j10, int i10, long j11) {
        if (!this.f129780m || this.f129779l.c()) {
            this.f129772e.e(i10);
            this.f129773f.e(i10);
        }
        this.f129774g.e(i10);
        this.f129779l.i(j10, i10, j11, this.f129782o);
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129775h = 0L;
        this.f129782o = false;
        this.f129781n = -9223372036854775807L;
        e3.f.c(this.f129776i);
        this.f129772e.d();
        this.f129773f.d();
        this.f129774g.d();
        this.f129768a.b();
        b bVar = this.f129779l;
        if (bVar != null) {
            bVar.g();
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129781n = j10;
        this.f129782o |= (i10 & 2) != 0;
    }

    public p(G g10, boolean z10, boolean z11, String str) {
        this.f129768a = g10;
        this.f129769b = z10;
        this.f129770c = z11;
        this.f129771d = str;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) {
        int i10;
        int i11;
        b();
        int iF = d10.f();
        int iG = d10.g();
        byte[] bArrE = d10.e();
        this.f129775h += d10.a();
        this.f129778k.d(d10, d10.a());
        while (true) {
            int iE = e3.f.e(bArrE, iF, iG, this.f129776i);
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
            long j10 = this.f129775h - i15;
            if (i14 < 0) {
                i11 = -i14;
            } else {
                i11 = 0;
            }
            g(j10, i15, i11, this.f129781n);
            i(j10, iJ, this.f129781n);
            iF = i12 + i13;
        }
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
        b();
        if (z10) {
            this.f129768a.e();
            g(this.f129775h, 0, 0, this.f129781n);
            i(this.f129775h, 9, this.f129781n);
            g(this.f129775h, 0, 0, this.f129781n);
        }
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129777j = dVar.b();
        O oT = rVar.t(dVar.c(), 2);
        this.f129778k = oT;
        this.f129779l = new b(oT, this.f129769b, this.f129770c);
        this.f129768a.d(rVar, dVar);
    }
}
