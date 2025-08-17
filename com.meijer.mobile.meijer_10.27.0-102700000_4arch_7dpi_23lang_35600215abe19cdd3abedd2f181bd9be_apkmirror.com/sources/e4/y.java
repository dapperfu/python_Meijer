package e4;

import androidx.media3.common.ParserException;
import d3.C13466a;
import e4.L;

/* loaded from: classes4.dex */
public final class y implements L {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13621m f128592a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.C f128593b = new d3.C(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f128594c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f128595d;

    /* renamed from: e, reason: collision with root package name */
    private d3.J f128596e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f128597f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f128598g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f128599h;

    /* renamed from: i, reason: collision with root package name */
    private int f128600i;

    /* renamed from: j, reason: collision with root package name */
    private int f128601j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f128602k;

    /* renamed from: l, reason: collision with root package name */
    private long f128603l;

    @Override // e4.L
    public void c() {
        this.f128594c = 0;
        this.f128595d = 0;
        this.f128599h = false;
        this.f128592a.c();
    }

    public boolean d(boolean z10) {
        return this.f128594c == 3 && this.f128601j == -1 && !(z10 && (this.f128592a instanceof C13622n)) && (!z10 || f());
    }

    private boolean f() {
        this.f128593b.p(0);
        int iH = this.f128593b.h(24);
        if (iH != 1) {
            d3.r.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f128601j = -1;
            return false;
        }
        this.f128593b.r(8);
        int iH2 = this.f128593b.h(16);
        this.f128593b.r(5);
        this.f128602k = this.f128593b.g();
        this.f128593b.r(2);
        this.f128597f = this.f128593b.g();
        this.f128598g = this.f128593b.g();
        this.f128593b.r(6);
        int iH3 = this.f128593b.h(8);
        this.f128600i = iH3;
        if (iH2 == 0) {
            this.f128601j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f128601j = i10;
            if (i10 < 0) {
                d3.r.i("PesReader", "Found negative packet payload size: " + this.f128601j);
                this.f128601j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f128593b.p(0);
        this.f128603l = -9223372036854775807L;
        if (this.f128597f) {
            this.f128593b.r(4);
            this.f128593b.r(1);
            this.f128593b.r(1);
            long jH = (this.f128593b.h(3) << 30) | (this.f128593b.h(15) << 15) | this.f128593b.h(15);
            this.f128593b.r(1);
            if (!this.f128599h && this.f128598g) {
                this.f128593b.r(4);
                this.f128593b.r(1);
                this.f128593b.r(1);
                this.f128593b.r(1);
                this.f128596e.b((this.f128593b.h(3) << 30) | (this.f128593b.h(15) << 15) | this.f128593b.h(15));
                this.f128599h = true;
            }
            this.f128603l = this.f128596e.b(jH);
        }
    }

    private void h(int i10) {
        this.f128594c = i10;
        this.f128595d = 0;
    }

    @Override // e4.L
    public void a(d3.D d10, int i10) throws ParserException {
        C13466a.i(this.f128596e);
        if ((i10 & 1) != 0) {
            int i11 = this.f128594c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    d3.r.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f128601j != -1) {
                        d3.r.i("PesReader", "Unexpected start indicator: expected " + this.f128601j + " more bytes");
                    }
                    this.f128592a.d(d10.g() == 0);
                }
            }
            h(1);
        }
        while (d10.a() > 0) {
            int i12 = this.f128594c;
            if (i12 == 0) {
                d10.X(d10.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(d10, this.f128593b.f127058a, Math.min(10, this.f128600i)) && e(d10, null, this.f128600i)) {
                        g();
                        i10 |= this.f128602k ? 4 : 0;
                        this.f128592a.e(this.f128603l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = d10.a();
                    int i13 = this.f128601j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        d10.V(d10.f() + iA);
                    }
                    this.f128592a.a(d10);
                    int i15 = this.f128601j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f128601j = i16;
                        if (i16 == 0) {
                            this.f128592a.d(false);
                            h(1);
                        }
                    }
                }
            } else if (e(d10, this.f128593b.f127058a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // e4.L
    public void b(d3.J j10, x3.r rVar, L.d dVar) {
        this.f128596e = j10;
        this.f128592a.f(rVar, dVar);
    }

    public y(InterfaceC13621m interfaceC13621m) {
        this.f128592a = interfaceC13621m;
    }

    private boolean e(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f128595d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            d10.X(iMin);
        } else {
            d10.l(bArr, this.f128595d, iMin);
        }
        int i11 = this.f128595d + iMin;
        this.f128595d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}
