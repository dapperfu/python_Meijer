package e4;

import a3.C5570j;
import a3.t;
import d3.C13466a;
import d3.C13474i;
import d3.P;
import e3.f;
import e4.L;
import java.util.Collections;
import x3.O;

/* loaded from: classes4.dex */
public final class q implements InterfaceC13621m {

    /* renamed from: a, reason: collision with root package name */
    private final G f128483a;

    /* renamed from: b, reason: collision with root package name */
    private final String f128484b;

    /* renamed from: c, reason: collision with root package name */
    private String f128485c;

    /* renamed from: d, reason: collision with root package name */
    private O f128486d;

    /* renamed from: e, reason: collision with root package name */
    private a f128487e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f128488f;

    /* renamed from: m, reason: collision with root package name */
    private long f128495m;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f128489g = new boolean[3];

    /* renamed from: h, reason: collision with root package name */
    private final w f128490h = new w(32, 128);

    /* renamed from: i, reason: collision with root package name */
    private final w f128491i = new w(33, 128);

    /* renamed from: j, reason: collision with root package name */
    private final w f128492j = new w(34, 128);

    /* renamed from: k, reason: collision with root package name */
    private final w f128493k = new w(39, 128);

    /* renamed from: l, reason: collision with root package name */
    private final w f128494l = new w(40, 128);

    /* renamed from: n, reason: collision with root package name */
    private long f128496n = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final d3.D f128497o = new d3.D();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final O f128498a;

        /* renamed from: b, reason: collision with root package name */
        private long f128499b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f128500c;

        /* renamed from: d, reason: collision with root package name */
        private int f128501d;

        /* renamed from: e, reason: collision with root package name */
        private long f128502e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f128503f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f128504g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f128505h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f128506i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f128507j;

        /* renamed from: k, reason: collision with root package name */
        private long f128508k;

        /* renamed from: l, reason: collision with root package name */
        private long f128509l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f128510m;

        public void f() {
            this.f128503f = false;
            this.f128504g = false;
            this.f128505h = false;
            this.f128506i = false;
            this.f128507j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f128504g = false;
            this.f128505h = false;
            this.f128502e = j11;
            this.f128501d = 0;
            this.f128499b = j10;
            if (!c(i11)) {
                if (this.f128506i && !this.f128507j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f128506i = false;
                }
                if (b(i11)) {
                    this.f128505h = !this.f128507j;
                    this.f128507j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f128500c = z11;
            this.f128503f = z11 || i11 <= 9;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f128509l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f128499b;
                long j12 = this.f128508k;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f128498a.c(j10, this.f128510m ? 1 : 0, i11, i10, null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f128507j && this.f128504g) {
                this.f128510m = this.f128500c;
                this.f128507j = false;
            } else if (this.f128505h || this.f128504g) {
                if (z10 && this.f128506i) {
                    d(i10 + ((int) (j10 - this.f128499b)));
                }
                this.f128508k = this.f128499b;
                this.f128509l = this.f128502e;
                this.f128510m = this.f128500c;
                this.f128506i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f128503f) {
                int i12 = this.f128501d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f128501d = i12 + (i11 - i10);
                } else {
                    this.f128504g = (bArr[i13] & 128) != 0;
                    this.f128503f = false;
                }
            }
        }

        public a(O o10) {
            this.f128498a = o10;
        }
    }

    private void b() {
        C13466a.i(this.f128486d);
        P.h(this.f128487e);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f128487e.a(j10, i10, this.f128488f);
        if (!this.f128488f) {
            this.f128490h.b(i11);
            this.f128491i.b(i11);
            this.f128492j.b(i11);
            if (this.f128490h.c() && this.f128491i.c() && this.f128492j.c()) {
                a3.t tVarI = i(this.f128485c, this.f128490h, this.f128491i, this.f128492j, this.f128484b);
                this.f128486d.b(tVarI);
                Be.p.w(tVarI.f43951q != -1);
                this.f128483a.f(tVarI.f43951q);
                this.f128488f = true;
            }
        }
        if (this.f128493k.b(i11)) {
            w wVar = this.f128493k;
            this.f128497o.U(this.f128493k.f128587d, e3.f.L(wVar.f128587d, wVar.f128588e));
            this.f128497o.X(5);
            this.f128483a.c(j11, this.f128497o);
        }
        if (this.f128494l.b(i11)) {
            w wVar2 = this.f128494l;
            this.f128497o.U(this.f128494l.f128587d, e3.f.L(wVar2.f128587d, wVar2.f128588e));
            this.f128497o.X(5);
            this.f128483a.c(j11, this.f128497o);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f128487e.e(bArr, i10, i11);
        if (!this.f128488f) {
            this.f128490h.a(bArr, i10, i11);
            this.f128491i.a(bArr, i10, i11);
            this.f128492j.a(bArr, i10, i11);
        }
        this.f128493k.a(bArr, i10, i11);
        this.f128494l.a(bArr, i10, i11);
    }

    private static a3.t i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f128588e;
        byte[] bArr = new byte[wVar2.f128588e + i10 + wVar3.f128588e];
        System.arraycopy(wVar.f128587d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f128587d, 0, bArr, wVar.f128588e, wVar2.f128588e);
        System.arraycopy(wVar3.f128587d, 0, bArr, wVar.f128588e + wVar2.f128588e, wVar3.f128588e);
        f.h hVarU = e3.f.u(wVar2.f128587d, 3, wVar2.f128588e, null);
        f.c cVar = hVarU.f128119c;
        return new t.b().f0(str).U(str2).u0("video/hevc").S(cVar != null ? C13474i.f(cVar.f128093a, cVar.f128094b, cVar.f128095c, cVar.f128096d, cVar.f128097e, cVar.f128098f) : null).z0(hVarU.f128124h).d0(hVarU.f128125i).T(new C5570j.b().d(hVarU.f128128l).c(hVarU.f128129m).e(hVarU.f128130n).g(hVarU.f128121e + 8).b(hVarU.f128122f + 8).a()).q0(hVarU.f128126j).l0(hVarU.f128127k).m0(hVarU.f128118b + 1).g0(Collections.singletonList(bArr)).N();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f128487e.g(j10, i10, i11, j11, this.f128488f);
        if (!this.f128488f) {
            this.f128490h.e(i11);
            this.f128491i.e(i11);
            this.f128492j.e(i11);
        }
        this.f128493k.e(i11);
        this.f128494l.e(i11);
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        this.f128495m = 0L;
        this.f128496n = -9223372036854775807L;
        e3.f.c(this.f128489g);
        this.f128490h.d();
        this.f128491i.d();
        this.f128492j.d();
        this.f128493k.d();
        this.f128494l.d();
        this.f128483a.b();
        a aVar = this.f128487e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128496n = j10;
    }

    public q(G g10, String str) {
        this.f128483a = g10;
        this.f128484b = str;
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        int i10;
        int i11;
        b();
        while (d10.a() > 0) {
            int iF = d10.f();
            int iG = d10.g();
            byte[] bArrE = d10.e();
            this.f128495m += d10.a();
            this.f128486d.d(d10, d10.a());
            while (iF < iG) {
                int iE = e3.f.e(bArrE, iF, iG, this.f128489g);
                if (iE == iG) {
                    h(bArrE, iF, iG);
                    return;
                }
                int i12 = e3.f.i(bArrE, iE);
                if (iE > 0 && bArrE[iE - 1] == 0) {
                    iE--;
                    i10 = 4;
                } else {
                    i10 = 3;
                }
                int i13 = iE;
                int i14 = i10;
                int i15 = i13 - iF;
                if (i15 > 0) {
                    h(bArrE, iF, i13);
                }
                int i16 = iG - i13;
                long j10 = this.f128495m - i16;
                if (i15 < 0) {
                    i11 = -i15;
                } else {
                    i11 = 0;
                }
                g(j10, i16, i11, this.f128496n);
                j(j10, i16, i12, this.f128496n);
                iF = i13 + i14;
            }
        }
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
        b();
        if (z10) {
            this.f128483a.e();
            g(this.f128495m, 0, 0, this.f128496n);
            j(this.f128495m, 0, 48, this.f128496n);
        }
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128485c = dVar.b();
        O oT = rVar.t(dVar.c(), 2);
        this.f128486d = oT;
        this.f128487e = new a(oT);
        this.f128483a.d(rVar, dVar);
    }
}
