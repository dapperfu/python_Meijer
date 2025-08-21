package e4;

import d3.P;
import e4.L;

/* loaded from: classes4.dex */
public final class E implements L {

    /* renamed from: a, reason: collision with root package name */
    private final D f129549a;

    /* renamed from: b, reason: collision with root package name */
    private final d3.D f129550b = new d3.D(32);

    /* renamed from: c, reason: collision with root package name */
    private int f129551c;

    /* renamed from: d, reason: collision with root package name */
    private int f129552d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f129553e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f129554f;

    @Override // e4.L
    public void a(d3.D d10, int i10) {
        boolean z10 = (i10 & 1) != 0;
        int iF = z10 ? d10.f() + d10.H() : -1;
        if (this.f129554f) {
            if (!z10) {
                return;
            }
            this.f129554f = false;
            d10.W(iF);
            this.f129552d = 0;
        }
        while (d10.a() > 0) {
            int i11 = this.f129552d;
            if (i11 < 3) {
                if (i11 == 0) {
                    int iH = d10.H();
                    d10.W(d10.f() - 1);
                    if (iH == 255) {
                        this.f129554f = true;
                        return;
                    }
                }
                int iMin = Math.min(d10.a(), 3 - this.f129552d);
                d10.l(this.f129550b.e(), this.f129552d, iMin);
                int i12 = this.f129552d + iMin;
                this.f129552d = i12;
                if (i12 == 3) {
                    this.f129550b.W(0);
                    this.f129550b.V(3);
                    this.f129550b.X(1);
                    int iH2 = this.f129550b.H();
                    int iH3 = this.f129550b.H();
                    this.f129553e = (iH2 & 128) != 0;
                    this.f129551c = (((iH2 & 15) << 8) | iH3) + 3;
                    int iB = this.f129550b.b();
                    int i13 = this.f129551c;
                    if (iB < i13) {
                        this.f129550b.c(Math.min(4098, Math.max(i13, this.f129550b.b() * 2)));
                    }
                }
            } else {
                int iMin2 = Math.min(d10.a(), this.f129551c - this.f129552d);
                d10.l(this.f129550b.e(), this.f129552d, iMin2);
                int i14 = this.f129552d + iMin2;
                this.f129552d = i14;
                int i15 = this.f129551c;
                if (i14 != i15) {
                    continue;
                } else {
                    if (!this.f129553e) {
                        this.f129550b.V(i15);
                    } else {
                        if (P.w(this.f129550b.e(), 0, this.f129551c, -1) != 0) {
                            this.f129554f = true;
                            return;
                        }
                        this.f129550b.V(this.f129551c - 4);
                    }
                    this.f129550b.W(0);
                    this.f129549a.a(this.f129550b);
                    this.f129552d = 0;
                }
            }
        }
    }

    @Override // e4.L
    public void c() {
        this.f129554f = true;
    }

    @Override // e4.L
    public void b(d3.J j10, x3.r rVar, L.d dVar) {
        this.f129549a.b(j10, rVar, dVar);
        this.f129554f = true;
    }

    public E(D d10) {
        this.f129549a = d10;
    }
}
