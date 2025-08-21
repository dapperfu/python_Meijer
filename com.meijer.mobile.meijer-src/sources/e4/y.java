package e4;

import androidx.media3.common.ParserException;
import d3.C13599a;
import e4.L;

/* loaded from: classes4.dex */
public final class y implements L {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC13770m f129928a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.C f129929b = new d3.C(new byte[10]);

    /* renamed from: c, reason: collision with root package name */
    private int f129930c = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f129931d;

    /* renamed from: e, reason: collision with root package name */
    private d3.J f129932e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f129933f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f129934g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f129935h;

    /* renamed from: i, reason: collision with root package name */
    private int f129936i;

    /* renamed from: j, reason: collision with root package name */
    private int f129937j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f129938k;

    /* renamed from: l, reason: collision with root package name */
    private long f129939l;

    @Override // e4.L
    public void c() {
        this.f129930c = 0;
        this.f129931d = 0;
        this.f129935h = false;
        this.f129928a.c();
    }

    public boolean d(boolean z10) {
        return this.f129930c == 3 && this.f129937j == -1 && !(z10 && (this.f129928a instanceof C13771n)) && (!z10 || f());
    }

    private boolean f() {
        this.f129929b.p(0);
        int iH = this.f129929b.h(24);
        if (iH != 1) {
            d3.r.i("PesReader", "Unexpected start code prefix: " + iH);
            this.f129937j = -1;
            return false;
        }
        this.f129929b.r(8);
        int iH2 = this.f129929b.h(16);
        this.f129929b.r(5);
        this.f129938k = this.f129929b.g();
        this.f129929b.r(2);
        this.f129933f = this.f129929b.g();
        this.f129934g = this.f129929b.g();
        this.f129929b.r(6);
        int iH3 = this.f129929b.h(8);
        this.f129936i = iH3;
        if (iH2 == 0) {
            this.f129937j = -1;
        } else {
            int i10 = (iH2 - 3) - iH3;
            this.f129937j = i10;
            if (i10 < 0) {
                d3.r.i("PesReader", "Found negative packet payload size: " + this.f129937j);
                this.f129937j = -1;
            }
        }
        return true;
    }

    private void g() {
        this.f129929b.p(0);
        this.f129939l = -9223372036854775807L;
        if (this.f129933f) {
            this.f129929b.r(4);
            this.f129929b.r(1);
            this.f129929b.r(1);
            long jH = (this.f129929b.h(3) << 30) | (this.f129929b.h(15) << 15) | this.f129929b.h(15);
            this.f129929b.r(1);
            if (!this.f129935h && this.f129934g) {
                this.f129929b.r(4);
                this.f129929b.r(1);
                this.f129929b.r(1);
                this.f129929b.r(1);
                this.f129932e.b((this.f129929b.h(3) << 30) | (this.f129929b.h(15) << 15) | this.f129929b.h(15));
                this.f129935h = true;
            }
            this.f129939l = this.f129932e.b(jH);
        }
    }

    private void h(int i10) {
        this.f129930c = i10;
        this.f129931d = 0;
    }

    @Override // e4.L
    public void a(d3.D d10, int i10) throws ParserException {
        C13599a.i(this.f129932e);
        if ((i10 & 1) != 0) {
            int i11 = this.f129930c;
            if (i11 != 0 && i11 != 1) {
                if (i11 == 2) {
                    d3.r.i("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i11 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f129937j != -1) {
                        d3.r.i("PesReader", "Unexpected start indicator: expected " + this.f129937j + " more bytes");
                    }
                    this.f129928a.d(d10.g() == 0);
                }
            }
            h(1);
        }
        while (d10.a() > 0) {
            int i12 = this.f129930c;
            if (i12 == 0) {
                d10.X(d10.a());
            } else if (i12 != 1) {
                if (i12 == 2) {
                    if (e(d10, this.f129929b.f127860a, Math.min(10, this.f129936i)) && e(d10, null, this.f129936i)) {
                        g();
                        i10 |= this.f129938k ? 4 : 0;
                        this.f129928a.e(this.f129939l, i10);
                        h(3);
                    }
                } else {
                    if (i12 != 3) {
                        throw new IllegalStateException();
                    }
                    int iA = d10.a();
                    int i13 = this.f129937j;
                    int i14 = i13 == -1 ? 0 : iA - i13;
                    if (i14 > 0) {
                        iA -= i14;
                        d10.V(d10.f() + iA);
                    }
                    this.f129928a.a(d10);
                    int i15 = this.f129937j;
                    if (i15 != -1) {
                        int i16 = i15 - iA;
                        this.f129937j = i16;
                        if (i16 == 0) {
                            this.f129928a.d(false);
                            h(1);
                        }
                    }
                }
            } else if (e(d10, this.f129929b.f127860a, 9)) {
                h(f() ? 2 : 0);
            }
        }
    }

    @Override // e4.L
    public void b(d3.J j10, x3.r rVar, L.d dVar) {
        this.f129932e = j10;
        this.f129928a.f(rVar, dVar);
    }

    public y(InterfaceC13770m interfaceC13770m) {
        this.f129928a = interfaceC13770m;
    }

    private boolean e(d3.D d10, byte[] bArr, int i10) {
        int iMin = Math.min(d10.a(), i10 - this.f129931d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            d10.X(iMin);
        } else {
            d10.l(bArr, this.f129931d, iMin);
        }
        int i11 = this.f129931d + iMin;
        this.f129931d = i11;
        if (i11 == i10) {
            return true;
        }
        return false;
    }
}
