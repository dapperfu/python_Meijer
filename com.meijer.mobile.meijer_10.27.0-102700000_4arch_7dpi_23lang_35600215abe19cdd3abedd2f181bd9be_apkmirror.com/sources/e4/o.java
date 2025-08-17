package e4;

import a3.t;
import d3.C13466a;
import d3.P;
import e4.L;
import java.util.Arrays;
import java.util.Collections;
import x3.O;

/* loaded from: classes4.dex */
public final class o implements InterfaceC13621m {

    /* renamed from: m, reason: collision with root package name */
    private static final float[] f128405m = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};

    /* renamed from: a, reason: collision with root package name */
    private final N f128406a;

    /* renamed from: b, reason: collision with root package name */
    private final String f128407b;

    /* renamed from: c, reason: collision with root package name */
    private final d3.D f128408c;

    /* renamed from: f, reason: collision with root package name */
    private final w f128411f;

    /* renamed from: g, reason: collision with root package name */
    private b f128412g;

    /* renamed from: h, reason: collision with root package name */
    private long f128413h;

    /* renamed from: i, reason: collision with root package name */
    private String f128414i;

    /* renamed from: j, reason: collision with root package name */
    private O f128415j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128416k;

    /* renamed from: d, reason: collision with root package name */
    private final boolean[] f128409d = new boolean[4];

    /* renamed from: e, reason: collision with root package name */
    private final a f128410e = new a(128);

    /* renamed from: l, reason: collision with root package name */
    private long f128417l = -9223372036854775807L;

    private static final class a {

        /* renamed from: f, reason: collision with root package name */
        private static final byte[] f128418f = {0, 0, 1};

        /* renamed from: a, reason: collision with root package name */
        private boolean f128419a;

        /* renamed from: b, reason: collision with root package name */
        private int f128420b;

        /* renamed from: c, reason: collision with root package name */
        public int f128421c;

        /* renamed from: d, reason: collision with root package name */
        public int f128422d;

        /* renamed from: e, reason: collision with root package name */
        public byte[] f128423e;

        public void c() {
            this.f128419a = false;
            this.f128421c = 0;
            this.f128420b = 0;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f128419a) {
                int i12 = i11 - i10;
                byte[] bArr2 = this.f128423e;
                int length = bArr2.length;
                int i13 = this.f128421c;
                if (length < i13 + i12) {
                    this.f128423e = Arrays.copyOf(bArr2, (i13 + i12) * 2);
                }
                System.arraycopy(bArr, i10, this.f128423e, this.f128421c, i12);
                this.f128421c += i12;
            }
        }

        public boolean b(int i10, int i11) {
            int i12 = this.f128420b;
            if (i12 != 0) {
                if (i12 != 1) {
                    if (i12 != 2) {
                        if (i12 != 3) {
                            if (i12 != 4) {
                                throw new IllegalStateException();
                            }
                            if (i10 == 179 || i10 == 181) {
                                this.f128421c -= i11;
                                this.f128419a = false;
                                return true;
                            }
                        } else if ((i10 & 240) != 32) {
                            d3.r.i("H263Reader", "Unexpected start code value");
                            c();
                        } else {
                            this.f128422d = this.f128421c;
                            this.f128420b = 4;
                        }
                    } else if (i10 > 31) {
                        d3.r.i("H263Reader", "Unexpected start code value");
                        c();
                    } else {
                        this.f128420b = 3;
                    }
                } else if (i10 != 181) {
                    d3.r.i("H263Reader", "Unexpected start code value");
                    c();
                } else {
                    this.f128420b = 2;
                }
            } else if (i10 == 176) {
                this.f128420b = 1;
                this.f128419a = true;
            }
            byte[] bArr = f128418f;
            a(bArr, 0, bArr.length);
            return false;
        }

        public a(int i10) {
            this.f128423e = new byte[i10];
        }
    }

    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        private final O f128424a;

        /* renamed from: b, reason: collision with root package name */
        private boolean f128425b;

        /* renamed from: c, reason: collision with root package name */
        private boolean f128426c;

        /* renamed from: d, reason: collision with root package name */
        private boolean f128427d;

        /* renamed from: e, reason: collision with root package name */
        private int f128428e;

        /* renamed from: f, reason: collision with root package name */
        private int f128429f;

        /* renamed from: g, reason: collision with root package name */
        private long f128430g;

        /* renamed from: h, reason: collision with root package name */
        private long f128431h;

        public void d() {
            this.f128425b = false;
            this.f128426c = false;
            this.f128427d = false;
            this.f128428e = -1;
        }

        public void a(byte[] bArr, int i10, int i11) {
            if (this.f128426c) {
                int i12 = this.f128429f;
                int i13 = (i10 + 1) - i12;
                if (i13 >= i11) {
                    this.f128429f = i12 + (i11 - i10);
                } else {
                    this.f128427d = ((bArr[i13] & 192) >> 6) == 0;
                    this.f128426c = false;
                }
            }
        }

        public void b(long j10, int i10, boolean z10) {
            C13466a.g(this.f128431h != -9223372036854775807L);
            if (this.f128428e == 182 && z10 && this.f128425b) {
                this.f128424a.c(this.f128431h, this.f128427d ? 1 : 0, (int) (j10 - this.f128430g), i10, null);
            }
            if (this.f128428e != 179) {
                this.f128430g = j10;
            }
        }

        public void c(int i10, long j10) {
            this.f128428e = i10;
            this.f128427d = false;
            this.f128425b = i10 == 182 || i10 == 179;
            this.f128426c = i10 == 182;
            this.f128429f = 0;
            this.f128431h = j10;
        }

        public b(O o10) {
            this.f128424a = o10;
        }
    }

    private static a3.t b(a aVar, int i10, String str, String str2) {
        byte[] bArrCopyOf = Arrays.copyOf(aVar.f128423e, aVar.f128421c);
        d3.C c10 = new d3.C(bArrCopyOf);
        c10.s(i10);
        c10.s(4);
        c10.q();
        c10.r(8);
        if (c10.g()) {
            c10.r(4);
            c10.r(3);
        }
        int iH = c10.h(4);
        float f10 = 1.0f;
        if (iH == 15) {
            int iH2 = c10.h(8);
            int iH3 = c10.h(8);
            if (iH3 == 0) {
                d3.r.i("H263Reader", "Invalid aspect ratio");
            } else {
                f10 = iH2 / iH3;
            }
        } else {
            float[] fArr = f128405m;
            if (iH < fArr.length) {
                f10 = fArr[iH];
            } else {
                d3.r.i("H263Reader", "Invalid aspect ratio");
            }
        }
        if (c10.g()) {
            c10.r(2);
            c10.r(1);
            if (c10.g()) {
                c10.r(15);
                c10.q();
                c10.r(15);
                c10.q();
                c10.r(15);
                c10.q();
                c10.r(3);
                c10.r(11);
                c10.q();
                c10.r(15);
                c10.q();
            }
        }
        if (c10.h(2) != 0) {
            d3.r.i("H263Reader", "Unhandled video object layer shape");
        }
        c10.q();
        int iH4 = c10.h(16);
        c10.q();
        if (c10.g()) {
            if (iH4 == 0) {
                d3.r.i("H263Reader", "Invalid vop_increment_time_resolution");
            } else {
                int i11 = 0;
                for (int i12 = iH4 - 1; i12 > 0; i12 >>= 1) {
                    i11++;
                }
                c10.r(i11);
            }
        }
        c10.q();
        int iH5 = c10.h(13);
        c10.q();
        int iH6 = c10.h(13);
        c10.q();
        c10.q();
        return new t.b().f0(str).U(str2).u0("video/mp4v-es").z0(iH5).d0(iH6).q0(f10).g0(Collections.singletonList(bArrCopyOf)).N();
    }

    @Override // e4.InterfaceC13621m
    public void a(d3.D d10) {
        C13466a.i(this.f128412g);
        C13466a.i(this.f128415j);
        int iF = d10.f();
        int iG = d10.g();
        byte[] bArrE = d10.e();
        this.f128413h += d10.a();
        this.f128415j.d(d10, d10.a());
        while (true) {
            int iE = e3.f.e(bArrE, iF, iG, this.f128409d);
            if (iE == iG) {
                break;
            }
            int i10 = iE + 3;
            int i11 = d10.e()[i10] & 255;
            int i12 = iE - iF;
            int i13 = 0;
            if (!this.f128416k) {
                if (i12 > 0) {
                    this.f128410e.a(bArrE, iF, iE);
                }
                if (this.f128410e.b(i11, i12 < 0 ? -i12 : 0)) {
                    O o10 = this.f128415j;
                    a aVar = this.f128410e;
                    o10.b(b(aVar, aVar.f128422d, (String) C13466a.e(this.f128414i), this.f128407b));
                    this.f128416k = true;
                }
            }
            this.f128412g.a(bArrE, iF, iE);
            w wVar = this.f128411f;
            if (wVar != null) {
                if (i12 > 0) {
                    wVar.a(bArrE, iF, iE);
                } else {
                    i13 = -i12;
                }
                if (this.f128411f.b(i13)) {
                    w wVar2 = this.f128411f;
                    ((d3.D) P.h(this.f128408c)).U(this.f128411f.f128587d, e3.f.L(wVar2.f128587d, wVar2.f128588e));
                    ((N) P.h(this.f128406a)).a(this.f128417l, this.f128408c);
                }
                if (i11 == 178 && d10.e()[iE + 2] == 1) {
                    this.f128411f.e(i11);
                }
            }
            int i14 = iG - iE;
            this.f128412g.b(this.f128413h - i14, i14, this.f128416k);
            this.f128412g.c(i11, this.f128417l);
            iF = i10;
        }
        if (!this.f128416k) {
            this.f128410e.a(bArrE, iF, iG);
        }
        this.f128412g.a(bArrE, iF, iG);
        w wVar3 = this.f128411f;
        if (wVar3 != null) {
            wVar3.a(bArrE, iF, iG);
        }
    }

    @Override // e4.InterfaceC13621m
    public void c() {
        e3.f.c(this.f128409d);
        this.f128410e.c();
        b bVar = this.f128412g;
        if (bVar != null) {
            bVar.d();
        }
        w wVar = this.f128411f;
        if (wVar != null) {
            wVar.d();
        }
        this.f128413h = 0L;
        this.f128417l = -9223372036854775807L;
    }

    @Override // e4.InterfaceC13621m
    public void d(boolean z10) {
        C13466a.i(this.f128412g);
        if (z10) {
            this.f128412g.b(this.f128413h, 0, this.f128416k);
            this.f128412g.d();
        }
    }

    @Override // e4.InterfaceC13621m
    public void e(long j10, int i10) {
        this.f128417l = j10;
    }

    o(N n10, String str) {
        this.f128406a = n10;
        this.f128407b = str;
        if (n10 != null) {
            this.f128411f = new w(178, 128);
            this.f128408c = new d3.D();
        } else {
            this.f128411f = null;
            this.f128408c = null;
        }
    }

    @Override // e4.InterfaceC13621m
    public void f(x3.r rVar, L.d dVar) {
        dVar.a();
        this.f128414i = dVar.b();
        O oT = rVar.t(dVar.c(), 2);
        this.f128415j = oT;
        this.f128412g = new b(oT);
        N n10 = this.f128406a;
        if (n10 != null) {
            n10.b(rVar, dVar);
        }
    }
}
