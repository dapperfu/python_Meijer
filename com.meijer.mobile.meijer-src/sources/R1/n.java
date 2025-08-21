package R1;

import Q1.d;
import Q1.e;
import R1.f;
import R1.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f31617k;

    /* renamed from: l, reason: collision with root package name */
    g f31618l;

    @Override // R1.p
    void f() {
        this.f31637c = null;
        this.f31642h.c();
        this.f31643i.c();
        this.f31617k.c();
        this.f31639e.c();
        this.f31641g = false;
    }

    void q() {
        this.f31641g = false;
        this.f31642h.c();
        this.f31642h.f31591j = false;
        this.f31643i.c();
        this.f31643i.f31591j = false;
        this.f31617k.c();
        this.f31617k.f31591j = false;
        this.f31639e.f31591j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31619a;

        static {
            int[] iArr = new int[p.b.values().length];
            f31619a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31619a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31619a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // R1.p, R1.d
    public void a(d dVar) {
        float f10;
        float fQ;
        float fQ2;
        int i10;
        int i11 = a.f31619a[this.f31644j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            Q1.e eVar = this.f31636b;
            n(dVar, eVar.f27580O, eVar.f27582Q, 1);
            return;
        }
        g gVar = this.f31639e;
        if (gVar.f31584c && !gVar.f31591j && this.f31638d == e.b.MATCH_CONSTRAINT) {
            Q1.e eVar2 = this.f31636b;
            int i12 = eVar2.f27638x;
            if (i12 == 2) {
                Q1.e eVarD = eVar2.D();
                if (eVarD != null) {
                    if (eVarD.f27602f.f31639e.f31591j) {
                        this.f31639e.d((int) ((r7.f31588g * this.f31636b.f27565E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f27600e.f31639e.f31591j) {
                int iR = eVar2.r();
                if (iR == -1) {
                    Q1.e eVar3 = this.f31636b;
                    f10 = eVar3.f27600e.f31639e.f31588g;
                    fQ = eVar3.q();
                } else if (iR == 0) {
                    fQ2 = r7.f27600e.f31639e.f31588g * this.f31636b.q();
                    i10 = (int) (fQ2 + 0.5f);
                    this.f31639e.d(i10);
                } else if (iR != 1) {
                    i10 = 0;
                    this.f31639e.d(i10);
                } else {
                    Q1.e eVar4 = this.f31636b;
                    f10 = eVar4.f27600e.f31639e.f31588g;
                    fQ = eVar4.q();
                }
                fQ2 = f10 / fQ;
                i10 = (int) (fQ2 + 0.5f);
                this.f31639e.d(i10);
            }
        }
        f fVar = this.f31642h;
        if (fVar.f31584c) {
            f fVar2 = this.f31643i;
            if (fVar2.f31584c) {
                if (fVar.f31591j && fVar2.f31591j && this.f31639e.f31591j) {
                    return;
                }
                if (!this.f31639e.f31591j && this.f31638d == e.b.MATCH_CONSTRAINT) {
                    Q1.e eVar5 = this.f31636b;
                    if (eVar5.f27636w == 0 && !eVar5.Z()) {
                        f fVar3 = this.f31642h.f31593l.get(0);
                        f fVar4 = this.f31643i.f31593l.get(0);
                        int i13 = fVar3.f31588g;
                        f fVar5 = this.f31642h;
                        int i14 = i13 + fVar5.f31587f;
                        int i15 = fVar4.f31588g + this.f31643i.f31587f;
                        fVar5.d(i14);
                        this.f31643i.d(i15);
                        this.f31639e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f31639e.f31591j && this.f31638d == e.b.MATCH_CONSTRAINT && this.f31635a == 1 && this.f31642h.f31593l.size() > 0 && this.f31643i.f31593l.size() > 0) {
                    f fVar6 = this.f31642h.f31593l.get(0);
                    int i16 = (this.f31643i.f31593l.get(0).f31588g + this.f31643i.f31587f) - (fVar6.f31588g + this.f31642h.f31587f);
                    g gVar2 = this.f31639e;
                    int i17 = gVar2.f31603m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f31639e.f31591j && this.f31642h.f31593l.size() > 0 && this.f31643i.f31593l.size() > 0) {
                    f fVar7 = this.f31642h.f31593l.get(0);
                    f fVar8 = this.f31643i.f31593l.get(0);
                    int i18 = fVar7.f31588g + this.f31642h.f31587f;
                    int i19 = fVar8.f31588g + this.f31643i.f31587f;
                    float fI = this.f31636b.I();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f31588g;
                        i19 = fVar8.f31588g;
                        fI = 0.5f;
                    }
                    this.f31642h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f31639e.f31588g) * fI)));
                    this.f31643i.d(this.f31642h.f31588g + this.f31639e.f31588g);
                }
            }
        }
    }

    @Override // R1.p
    void d() {
        Q1.e eVarD;
        Q1.e eVarD2;
        Q1.e eVar = this.f31636b;
        if (eVar.f27592a) {
            this.f31639e.d(eVar.s());
        }
        if (!this.f31639e.f31591j) {
            this.f31638d = this.f31636b.K();
            if (this.f31636b.P()) {
                this.f31618l = new R1.a(this);
            }
            e.b bVar = this.f31638d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarD2 = this.f31636b.D()) != null && eVarD2.K() == e.b.FIXED) {
                    int iS = (eVarD2.s() - this.f31636b.f27580O.e()) - this.f31636b.f27582Q.e();
                    b(this.f31642h, eVarD2.f27602f.f31642h, this.f31636b.f27580O.e());
                    b(this.f31643i, eVarD2.f27602f.f31643i, -this.f31636b.f27582Q.e());
                    this.f31639e.d(iS);
                    return;
                }
                if (this.f31638d == e.b.FIXED) {
                    this.f31639e.d(this.f31636b.s());
                }
            }
        } else if (this.f31638d == e.b.MATCH_PARENT && (eVarD = this.f31636b.D()) != null && eVarD.K() == e.b.FIXED) {
            b(this.f31642h, eVarD.f27602f.f31642h, this.f31636b.f27580O.e());
            b(this.f31643i, eVarD.f27602f.f31643i, -this.f31636b.f27582Q.e());
            return;
        }
        g gVar = this.f31639e;
        boolean z10 = gVar.f31591j;
        if (z10) {
            Q1.e eVar2 = this.f31636b;
            if (eVar2.f27592a) {
                Q1.d[] dVarArr = eVar2.f27587V;
                Q1.d dVar = dVarArr[2];
                Q1.d dVar2 = dVar.f27541f;
                if (dVar2 != null && dVarArr[3].f27541f != null) {
                    if (eVar2.Z()) {
                        this.f31642h.f31587f = this.f31636b.f27587V[2].e();
                        this.f31643i.f31587f = -this.f31636b.f27587V[3].e();
                    } else {
                        f fVarH = h(this.f31636b.f27587V[2]);
                        if (fVarH != null) {
                            b(this.f31642h, fVarH, this.f31636b.f27587V[2].e());
                        }
                        f fVarH2 = h(this.f31636b.f27587V[3]);
                        if (fVarH2 != null) {
                            b(this.f31643i, fVarH2, -this.f31636b.f27587V[3].e());
                        }
                        this.f31642h.f31583b = true;
                        this.f31643i.f31583b = true;
                    }
                    if (this.f31636b.P()) {
                        b(this.f31617k, this.f31642h, this.f31636b.k());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f31642h, fVarH3, this.f31636b.f27587V[2].e());
                        b(this.f31643i, this.f31642h, this.f31639e.f31588g);
                        if (this.f31636b.P()) {
                            b(this.f31617k, this.f31642h, this.f31636b.k());
                            return;
                        }
                        return;
                    }
                    return;
                }
                Q1.d dVar3 = dVarArr[3];
                if (dVar3.f27541f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f31643i, fVarH4, -this.f31636b.f27587V[3].e());
                        b(this.f31642h, this.f31643i, -this.f31639e.f31588g);
                    }
                    if (this.f31636b.P()) {
                        b(this.f31617k, this.f31642h, this.f31636b.k());
                        return;
                    }
                    return;
                }
                Q1.d dVar4 = dVarArr[4];
                if (dVar4.f27541f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f31617k, fVarH5, 0);
                        b(this.f31642h, this.f31617k, -this.f31636b.k());
                        b(this.f31643i, this.f31642h, this.f31639e.f31588g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof Q1.h) || eVar2.D() == null || this.f31636b.j(d.b.CENTER).f27541f != null) {
                    return;
                }
                b(this.f31642h, this.f31636b.D().f27602f.f31642h, this.f31636b.O());
                b(this.f31643i, this.f31642h, this.f31639e.f31588g);
                if (this.f31636b.P()) {
                    b(this.f31617k, this.f31642h, this.f31636b.k());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f31638d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            Q1.e eVar3 = this.f31636b;
            int i10 = eVar3.f27638x;
            if (i10 == 2) {
                Q1.e eVarD3 = eVar3.D();
                if (eVarD3 != null) {
                    g gVar2 = eVarD3.f27602f.f31639e;
                    this.f31639e.f31593l.add(gVar2);
                    gVar2.f31592k.add(this.f31639e);
                    g gVar3 = this.f31639e;
                    gVar3.f31583b = true;
                    gVar3.f31592k.add(this.f31642h);
                    this.f31639e.f31592k.add(this.f31643i);
                }
            } else if (i10 == 3 && !eVar3.Z()) {
                Q1.e eVar4 = this.f31636b;
                if (eVar4.f27636w != 3) {
                    g gVar4 = eVar4.f27600e.f31639e;
                    this.f31639e.f31593l.add(gVar4);
                    gVar4.f31592k.add(this.f31639e);
                    g gVar5 = this.f31639e;
                    gVar5.f31583b = true;
                    gVar5.f31592k.add(this.f31642h);
                    this.f31639e.f31592k.add(this.f31643i);
                }
            }
        }
        Q1.e eVar5 = this.f31636b;
        Q1.d[] dVarArr2 = eVar5.f27587V;
        Q1.d dVar5 = dVarArr2[2];
        Q1.d dVar6 = dVar5.f27541f;
        if (dVar6 != null && dVarArr2[3].f27541f != null) {
            if (eVar5.Z()) {
                this.f31642h.f31587f = this.f31636b.f27587V[2].e();
                this.f31643i.f31587f = -this.f31636b.f27587V[3].e();
            } else {
                f fVarH6 = h(this.f31636b.f27587V[2]);
                f fVarH7 = h(this.f31636b.f27587V[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f31644j = p.b.CENTER;
            }
            if (this.f31636b.P()) {
                c(this.f31617k, this.f31642h, 1, this.f31618l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f31642h, fVarH8, this.f31636b.f27587V[2].e());
                c(this.f31643i, this.f31642h, 1, this.f31639e);
                if (this.f31636b.P()) {
                    c(this.f31617k, this.f31642h, 1, this.f31618l);
                }
                e.b bVar2 = this.f31638d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f31636b.q() > 0.0f) {
                    l lVar = this.f31636b.f27600e;
                    if (lVar.f31638d == bVar3) {
                        lVar.f31639e.f31592k.add(this.f31639e);
                        this.f31639e.f31593l.add(this.f31636b.f27600e.f31639e);
                        this.f31639e.f31582a = this;
                    }
                }
            }
        } else {
            Q1.d dVar7 = dVarArr2[3];
            if (dVar7.f27541f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f31643i, fVarH9, -this.f31636b.f27587V[3].e());
                    c(this.f31642h, this.f31643i, -1, this.f31639e);
                    if (this.f31636b.P()) {
                        c(this.f31617k, this.f31642h, 1, this.f31618l);
                    }
                }
            } else {
                Q1.d dVar8 = dVarArr2[4];
                if (dVar8.f27541f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f31617k, fVarH10, 0);
                        c(this.f31642h, this.f31617k, -1, this.f31618l);
                        c(this.f31643i, this.f31642h, 1, this.f31639e);
                    }
                } else if (!(eVar5 instanceof Q1.h) && eVar5.D() != null) {
                    b(this.f31642h, this.f31636b.D().f27602f.f31642h, this.f31636b.O());
                    c(this.f31643i, this.f31642h, 1, this.f31639e);
                    if (this.f31636b.P()) {
                        c(this.f31617k, this.f31642h, 1, this.f31618l);
                    }
                    e.b bVar4 = this.f31638d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f31636b.q() > 0.0f) {
                        l lVar2 = this.f31636b.f27600e;
                        if (lVar2.f31638d == bVar5) {
                            lVar2.f31639e.f31592k.add(this.f31639e);
                            this.f31639e.f31593l.add(this.f31636b.f27600e.f31639e);
                            this.f31639e.f31582a = this;
                        }
                    }
                }
            }
        }
        if (this.f31639e.f31593l.size() == 0) {
            this.f31639e.f31584c = true;
        }
    }

    @Override // R1.p
    public void e() {
        f fVar = this.f31642h;
        if (fVar.f31591j) {
            this.f31636b.T0(fVar.f31588g);
        }
    }

    @Override // R1.p
    boolean m() {
        return this.f31638d != e.b.MATCH_CONSTRAINT || this.f31636b.f27638x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f31636b.o();
    }

    public n(Q1.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f31617k = fVar;
        this.f31618l = null;
        this.f31642h.f31586e = f.a.TOP;
        this.f31643i.f31586e = f.a.BOTTOM;
        fVar.f31586e = f.a.BASELINE;
        this.f31640f = 1;
    }
}
