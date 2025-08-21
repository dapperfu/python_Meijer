package e4;

import a3.C5653j;
import a3.t;
import d3.C13599a;
import d3.C13607i;
import d3.P;
import e3.f;
import e4.L;
import java.util.Collections;
import x3.O;

/* loaded from: classes4.dex */
public final class q implements InterfaceC13770m {

    /* renamed from: a, reason: collision with root package name */
    private final G f129819a;

    /* renamed from: b, reason: collision with root package name */
    private final String f129820b;

    /* renamed from: c, reason: collision with root package name */
    private String f129821c;

    /* renamed from: d, reason: collision with root package name */
    private O f129822d;

    /* renamed from: e, reason: collision with root package name */
    private a f129823e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f129824f;

    /* renamed from: m, reason: collision with root package name */
    private long f129831m;

    /* renamed from: g, reason: collision with root package name */
    private final boolean[] f129825g = new boolean[3];

    /* renamed from: h, reason: collision with root package name */
    private final w f129826h = new w(32, 128);

    /* renamed from: i, reason: collision with root package name */
    private final w f129827i = new w(33, 128);

    /* renamed from: j, reason: collision with root package name */
    private final w f129828j = new w(34, 128);

    /* renamed from: k, reason: collision with root package name */
    private final w f129829k = new w(39, 128);

    /* renamed from: l, reason: collision with root package name */
    private final w f129830l = new w(40, 128);

    /* renamed from: n, reason: collision with root package name */
    private long f129832n = -9223372036854775807L;

    /* renamed from: o, reason: collision with root package name */
    private final d3.D f129833o = new d3.D();

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final O f129834a;

        /* renamed from: b, reason: collision with root package name */
        private long f129835b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f129836c;

        /* renamed from: d, reason: collision with root package name */
        private int f129837d;

        /* renamed from: e, reason: collision with root package name */
        private long f129838e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f129839f;

        /* renamed from: g, reason: collision with root package name */
        private boolean f129840g;

        /* renamed from: h, reason: collision with root package name */
        private boolean f129841h;

        /* renamed from: i, reason: collision with root package name */
        private boolean f129842i;

        /* renamed from: j, reason: collision with root package name */
        private boolean f129843j;

        /* renamed from: k, reason: collision with root package name */
        private long f129844k;

        /* renamed from: l, reason: collision with root package name */
        private long f129845l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f129846m;

        public void f() {
            this.f129839f = false;
            this.f129840g = false;
            this.f129841h = false;
            this.f129842i = false;
            this.f129843j = false;
        }

        public void g(long j10, int i10, int i11, long j11, boolean z10) {
            this.f129840g = false;
            this.f129841h = false;
            this.f129838e = j11;
            this.f129837d = 0;
            this.f129835b = j10;
            if (!c(i11)) {
                if (this.f129842i && !this.f129843j) {
                    if (z10) {
                        d(i10);
                    }
                    this.f129842i = false;
                }
                if (b(i11)) {
                    this.f129841h = !this.f129843j;
                    this.f129843j = true;
                }
            }
            boolean z11 = i11 >= 16 && i11 <= 21;
            this.f129836c = z11;
            this.f129839f = z11 || i11 <= 9;
        }

        private static boolean b(int i10) {
            return (32 <= i10 && i10 <= 35) || i10 == 39;
        }

        private static boolean c(int i10) {
            return i10 < 32 || i10 == 40;
        }

        private void d(int i10) {
            long j10 = this.f129845l;
            if (j10 != -9223372036854775807L) {
                long j11 = this.f129835b;
                long j12 = this.f129844k;
                if (j11 == j12) {
                    return;
                }
                int i11 = (int) (j11 - j12);
                this.f129834a.c(j10, this.f129846m ? 1 : 0, i11, i10, null);
            }
        }

        public void a(long j10, int i10, boolean z10) {
            if (this.f129843j && this.f129840g) {
                this.f129846m = this.f129836c;
                this.f129843j = false;
            } else if (this.f129841h || this.f129840g) {
                if (z10 && this.f129842i) {
                    d(i10 + ((int) (j10 - this.f129835b)));
                }
                this.f129844k = this.f129835b;
                this.f129845l = this.f129838e;
                this.f129846m = this.f129836c;
                this.f129842i = true;
            }
        }

        public void e(byte[] bArr, int i10, int i11) {
            if (this.f129839f) {
                int i12 = this.f129837d;
                int i13 = (i10 + 2) - i12;
                if (i13 >= i11) {
                    this.f129837d = i12 + (i11 - i10);
                } else {
                    this.f129840g = (bArr[i13] & 128) != 0;
                    this.f129839f = false;
                }
            }
        }

        public a(O o10) {
            this.f129834a = o10;
        }
    }

    private void b() {
        C13599a.i(this.f129822d);
        P.h(this.f129823e);
    }

    private void g(long j10, int i10, int i11, long j11) {
        this.f129823e.a(j10, i10, this.f129824f);
        if (!this.f129824f) {
            this.f129826h.b(i11);
            this.f129827i.b(i11);
            this.f129828j.b(i11);
            if (this.f129826h.c() && this.f129827i.c() && this.f129828j.c()) {
                a3.t tVarI = i(this.f129821c, this.f129826h, this.f129827i, this.f129828j, this.f129820b);
                this.f129822d.b(tVarI);
                De.p.w(tVarI.f44769q != -1);
                this.f129819a.f(tVarI.f44769q);
                this.f129824f = true;
            }
        }
        if (this.f129829k.b(i11)) {
            w wVar = this.f129829k;
            this.f129833o.U(this.f129829k.f129923d, e3.f.L(wVar.f129923d, wVar.f129924e));
            this.f129833o.X(5);
            this.f129819a.c(j11, this.f129833o);
        }
        if (this.f129830l.b(i11)) {
            w wVar2 = this.f129830l;
            this.f129833o.U(this.f129830l.f129923d, e3.f.L(wVar2.f129923d, wVar2.f129924e));
            this.f129833o.X(5);
            this.f129819a.c(j11, this.f129833o);
        }
    }

    private void h(byte[] bArr, int i10, int i11) {
        this.f129823e.e(bArr, i10, i11);
        if (!this.f129824f) {
            this.f129826h.a(bArr, i10, i11);
            this.f129827i.a(bArr, i10, i11);
            this.f129828j.a(bArr, i10, i11);
        }
        this.f129829k.a(bArr, i10, i11);
        this.f129830l.a(bArr, i10, i11);
    }

    private static a3.t i(String str, w wVar, w wVar2, w wVar3, String str2) {
        int i10 = wVar.f129924e;
        byte[] bArr = new byte[wVar2.f129924e + i10 + wVar3.f129924e];
        System.arraycopy(wVar.f129923d, 0, bArr, 0, i10);
        System.arraycopy(wVar2.f129923d, 0, bArr, wVar.f129924e, wVar2.f129924e);
        System.arraycopy(wVar3.f129923d, 0, bArr, wVar.f129924e + wVar2.f129924e, wVar3.f129924e);
        f.h hVarU = e3.f.u(wVar2.f129923d, 3, wVar2.f129924e, null);
        f.c cVar = hVarU.f129455c;
        return new t.b().f0(str).U(str2).u0("video/hevc").S(cVar != null ? C13607i.f(cVar.f129429a, cVar.f129430b, cVar.f129431c, cVar.f129432d, cVar.f129433e, cVar.f129434f) : null).z0(hVarU.f129460h).d0(hVarU.f129461i).T(new C5653j.b().d(hVarU.f129464l).c(hVarU.f129465m).e(hVarU.f129466n).g(hVarU.f129457e + 8).b(hVarU.f129458f + 8).a()).q0(hVarU.f129462j).l0(hVarU.f129463k).m0(hVarU.f129454b + 1).g0(Collections.singletonList(bArr)).N();
    }

    private void j(long j10, int i10, int i11, long j11) {
        this.f129823e.g(j10, i10, i11, j11, this.f129824f);
        if (!this.f129824f) {
            this.f129826h.e(i11);
            this.f129827i.e(i11);
            this.f129828j.e(i11);
        }
        this.f129829k.e(i11);
        this.f129830l.e(i11);
    }

    @Override // e4.InterfaceC13770m
    public void c() {
        this.f129831m = 0L;
        this.f129832n = -9223372036854775807L;
        e3.f.c(this.f129825g);
        this.f129826h.d();
        this.f129827i.d();
        this.f129828j.d();
        this.f129829k.d();
        this.f129830l.d();
        this.f129819a.b();
        a aVar = this.f129823e;
        if (aVar != null) {
            aVar.f();
        }
    }

    @Override // e4.InterfaceC13770m
    public void e(long j10, int i10) {
        this.f129832n = j10;
    }

    public q(G g10, String str) {
        this.f129819a = g10;
        this.f129820b = str;
    }

    @Override // e4.InterfaceC13770m
    public void a(d3.D d10) {
        int i10;
        int i11;
        b();
        while (d10.a() > 0) {
            int iF = d10.f();
            int iG = d10.g();
            byte[] bArrE = d10.e();
            this.f129831m += d10.a();
            this.f129822d.d(d10, d10.a());
            while (iF < iG) {
                int iE = e3.f.e(bArrE, iF, iG, this.f129825g);
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
                long j10 = this.f129831m - i16;
                if (i15 < 0) {
                    i11 = -i15;
                } else {
                    i11 = 0;
                }
                g(j10, i16, i11, this.f129832n);
                j(j10, i16, i12, this.f129832n);
                iF = i13 + i14;
            }
        }
    }

    @Override // e4.InterfaceC13770m
    public void d(boolean z10) {
        b();
        if (z10) {
            this.f129819a.e();
            g(this.f129831m, 0, 0, this.f129832n);
            j(this.f129831m, 0, 48, this.f129832n);
        }
    }

    @Override // e4.InterfaceC13770m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f129821c = dVar.b();
        O oT = rVar.t(dVar.c(), 2);
        this.f129822d = oT;
        this.f129823e = new a(oT);
        this.f129819a.d(rVar, dVar);
    }
}
