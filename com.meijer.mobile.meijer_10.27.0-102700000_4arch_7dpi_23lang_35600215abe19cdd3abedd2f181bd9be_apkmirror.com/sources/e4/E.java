package e4;

import d3.P;
import e4.L;

/* loaded from: classes4.dex */
public final class E implements L {

    /* renamed from: a, reason: collision with root package name */
    private final D f128213a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f128214b = new d3.D(32);

    /* renamed from: c, reason: collision with root package name */
    private int f128215c;

    /* renamed from: d, reason: collision with root package name */
    private int f128216d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f128217e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f128218f;

    @Override // e4.L
    public void a(d3.D d10, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iF = z10 ? d10.f() + d10.H() : -1;
        if (this.f128218f) {
            if (!z10) {
                return;
            }
            this.f128218f = false;
            d10.W(iF);
            this.f128216d = 0;
        }
        while (d10.a() > 0) {
            int i11 = this.f128216d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iH = d10.H();
                    d10.W(d10.f() - 1);
                    if (iH == 255) {
                        this.f128218f = true;
                        return;
                    }
                }
                int iMin = Math.min(d10.a(), 3 - this.f128216d);
                d10.l(this.f128214b.e(), this.f128216d, iMin);
                int i12 = this.f128216d + iMin;
                this.f128216d = i12;
                if (i12 == 3) {
                    this.f128214b.W(0);
                    this.f128214b.V(3);
                    this.f128214b.X(1);
                    int iH2 = this.f128214b.H();
                    int iH3 = this.f128214b.H();
                    this.f128217e = (iH2 & 128) != 0;
                    this.f128215c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f128214b.b();
                    int i13 = this.f128215c;
                    if (iB < i13) {
                        this.f128214b.c(Math.min(4098, Math.max(i13, this.f128214b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(d10.a(), this.f128215c - this.f128216d);
                d10.l(this.f128214b.e(), this.f128216d, iMin2);
                int i14 = this.f128216d + iMin2;
                this.f128216d = i14;
                int i15 = this.f128215c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f128217e) {
                        this.f128214b.V(i15);
                    } else {
                        if (P.w(this.f128214b.e(), 0, this.f128215c, -1) != 0) {
                            this.f128218f = true;
                            return;
                        }
                        this.f128214b.V(this.f128215c - 4);
                    }
                    this.f128214b.W(0);
                    this.f128213a.a(this.f128214b);
                    this.f128216d = 0;
                }
            }
        }
    }

    @Override // e4.L
    public void c() {
        this.f128218f = true;
    }

    @Override // e4.L
    public void b(d3.J j10, x3.r rVar, L.d dVar) {
        this.f128213a.b(j10, rVar, dVar);
        this.f128218f = true;
    }

    public E(D d10) {
        this.f128213a = d10;
    }
}
