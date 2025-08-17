package R1;

import Q1.d;
import Q1.e;
import R1.f;
import R1.p;

/* loaded from: classes.dex */
public class n extends p {

    /* renamed from: k, reason: collision with root package name */
    public f f31615k;

    /* renamed from: l, reason: collision with root package name */
    g f31616l;

    @Override // R1.p
    void f() {
        this.f31635c = null;
        this.f31640h.c();
        this.f31641i.c();
        this.f31615k.c();
        this.f31637e.c();
        this.f31639g = false;
    }

    void q() {
        this.f31639g = false;
        this.f31640h.c();
        this.f31640h.f31589j = false;
        this.f31641i.c();
        this.f31641i.f31589j = false;
        this.f31615k.c();
        this.f31615k.f31589j = false;
        this.f31637e.f31589j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31617a;

        static {
            int[] iArr = new int[p.b.values().length];
            f31617a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31617a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31617a[p.b.CENTER.ordinal()] = 3;
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
        int i11 = a.f31617a[this.f31642j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            Q1.e eVar = this.f31634b;
            n(dVar, eVar.f29567O, eVar.f29569Q, 1);
            return;
        }
        g gVar = this.f31637e;
        if (gVar.f31582c && !gVar.f31589j && this.f31636d == e.b.MATCH_CONSTRAINT) {
            Q1.e eVar2 = this.f31634b;
            int i12 = eVar2.f29625x;
            if (i12 == 2) {
                Q1.e eVarD = eVar2.D();
                if (eVarD != null) {
                    if (eVarD.f29589f.f31637e.f31589j) {
                        this.f31637e.d((int) ((r7.f31586g * this.f31634b.f29552E) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f29587e.f31637e.f31589j) {
                int iR = eVar2.r();
                if (iR == -1) {
                    Q1.e eVar3 = this.f31634b;
                    f10 = eVar3.f29587e.f31637e.f31586g;
                    fQ = eVar3.q();
                } else if (iR == 0) {
                    fQ2 = r7.f29587e.f31637e.f31586g * this.f31634b.q();
                    i10 = (int) (fQ2 + 0.5f);
                    this.f31637e.d(i10);
                } else if (iR != 1) {
                    i10 = 0;
                    this.f31637e.d(i10);
                } else {
                    Q1.e eVar4 = this.f31634b;
                    f10 = eVar4.f29587e.f31637e.f31586g;
                    fQ = eVar4.q();
                }
                fQ2 = f10 / fQ;
                i10 = (int) (fQ2 + 0.5f);
                this.f31637e.d(i10);
            }
        }
        f fVar = this.f31640h;
        if (fVar.f31582c) {
            f fVar2 = this.f31641i;
            if (fVar2.f31582c) {
                if (fVar.f31589j && fVar2.f31589j && this.f31637e.f31589j) {
                    return;
                }
                if (!this.f31637e.f31589j && this.f31636d == e.b.MATCH_CONSTRAINT) {
                    Q1.e eVar5 = this.f31634b;
                    if (eVar5.f29623w == 0 && !eVar5.Z()) {
                        f fVar3 = this.f31640h.f31591l.get(0);
                        f fVar4 = this.f31641i.f31591l.get(0);
                        int i13 = fVar3.f31586g;
                        f fVar5 = this.f31640h;
                        int i14 = i13 + fVar5.f31585f;
                        int i15 = fVar4.f31586g + this.f31641i.f31585f;
                        fVar5.d(i14);
                        this.f31641i.d(i15);
                        this.f31637e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f31637e.f31589j && this.f31636d == e.b.MATCH_CONSTRAINT && this.f31633a == 1 && this.f31640h.f31591l.size() > 0 && this.f31641i.f31591l.size() > 0) {
                    f fVar6 = this.f31640h.f31591l.get(0);
                    int i16 = (this.f31641i.f31591l.get(0).f31586g + this.f31641i.f31585f) - (fVar6.f31586g + this.f31640h.f31585f);
                    g gVar2 = this.f31637e;
                    int i17 = gVar2.f31601m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f31637e.f31589j && this.f31640h.f31591l.size() > 0 && this.f31641i.f31591l.size() > 0) {
                    f fVar7 = this.f31640h.f31591l.get(0);
                    f fVar8 = this.f31641i.f31591l.get(0);
                    int i18 = fVar7.f31586g + this.f31640h.f31585f;
                    int i19 = fVar8.f31586g + this.f31641i.f31585f;
                    float fI = this.f31634b.I();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f31586g;
                        i19 = fVar8.f31586g;
                        fI = 0.5f;
                    }
                    this.f31640h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f31637e.f31586g) * fI)));
                    this.f31641i.d(this.f31640h.f31586g + this.f31637e.f31586g);
                }
            }
        }
    }

    @Override // R1.p
    void d() {
        Q1.e eVarD;
        Q1.e eVarD2;
        Q1.e eVar = this.f31634b;
        if (eVar.f29579a) {
            this.f31637e.d(eVar.s());
        }
        if (!this.f31637e.f31589j) {
            this.f31636d = this.f31634b.K();
            if (this.f31634b.P()) {
                this.f31616l = new R1.a(this);
            }
            e.b bVar = this.f31636d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarD2 = this.f31634b.D()) != null && eVarD2.K() == e.b.FIXED) {
                    int iS = (eVarD2.s() - this.f31634b.f29567O.e()) - this.f31634b.f29569Q.e();
                    b(this.f31640h, eVarD2.f29589f.f31640h, this.f31634b.f29567O.e());
                    b(this.f31641i, eVarD2.f29589f.f31641i, -this.f31634b.f29569Q.e());
                    this.f31637e.d(iS);
                    return;
                }
                if (this.f31636d == e.b.FIXED) {
                    this.f31637e.d(this.f31634b.s());
                }
            }
        } else if (this.f31636d == e.b.MATCH_PARENT && (eVarD = this.f31634b.D()) != null && eVarD.K() == e.b.FIXED) {
            b(this.f31640h, eVarD.f29589f.f31640h, this.f31634b.f29567O.e());
            b(this.f31641i, eVarD.f29589f.f31641i, -this.f31634b.f29569Q.e());
            return;
        }
        g gVar = this.f31637e;
        boolean z10 = gVar.f31589j;
        if (z10) {
            Q1.e eVar2 = this.f31634b;
            if (eVar2.f29579a) {
                Q1.d[] dVarArr = eVar2.f29574V;
                Q1.d dVar = dVarArr[2];
                Q1.d dVar2 = dVar.f29528f;
                if (dVar2 != null && dVarArr[3].f29528f != null) {
                    if (eVar2.Z()) {
                        this.f31640h.f31585f = this.f31634b.f29574V[2].e();
                        this.f31641i.f31585f = -this.f31634b.f29574V[3].e();
                    } else {
                        f fVarH = h(this.f31634b.f29574V[2]);
                        if (fVarH != null) {
                            b(this.f31640h, fVarH, this.f31634b.f29574V[2].e());
                        }
                        f fVarH2 = h(this.f31634b.f29574V[3]);
                        if (fVarH2 != null) {
                            b(this.f31641i, fVarH2, -this.f31634b.f29574V[3].e());
                        }
                        this.f31640h.f31581b = true;
                        this.f31641i.f31581b = true;
                    }
                    if (this.f31634b.P()) {
                        b(this.f31615k, this.f31640h, this.f31634b.k());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f31640h, fVarH3, this.f31634b.f29574V[2].e());
                        b(this.f31641i, this.f31640h, this.f31637e.f31586g);
                        if (this.f31634b.P()) {
                            b(this.f31615k, this.f31640h, this.f31634b.k());
                            return;
                        }
                        return;
                    }
                    return;
                }
                Q1.d dVar3 = dVarArr[3];
                if (dVar3.f29528f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f31641i, fVarH4, -this.f31634b.f29574V[3].e());
                        b(this.f31640h, this.f31641i, -this.f31637e.f31586g);
                    }
                    if (this.f31634b.P()) {
                        b(this.f31615k, this.f31640h, this.f31634b.k());
                        return;
                    }
                    return;
                }
                Q1.d dVar4 = dVarArr[4];
                if (dVar4.f29528f != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f31615k, fVarH5, 0);
                        b(this.f31640h, this.f31615k, -this.f31634b.k());
                        b(this.f31641i, this.f31640h, this.f31637e.f31586g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof Q1.h) || eVar2.D() == null || this.f31634b.j(d.b.CENTER).f29528f != null) {
                    return;
                }
                b(this.f31640h, this.f31634b.D().f29589f.f31640h, this.f31634b.O());
                b(this.f31641i, this.f31640h, this.f31637e.f31586g);
                if (this.f31634b.P()) {
                    b(this.f31615k, this.f31640h, this.f31634b.k());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f31636d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            Q1.e eVar3 = this.f31634b;
            int i10 = eVar3.f29625x;
            if (i10 == 2) {
                Q1.e eVarD3 = eVar3.D();
                if (eVarD3 != null) {
                    g gVar2 = eVarD3.f29589f.f31637e;
                    this.f31637e.f31591l.add(gVar2);
                    gVar2.f31590k.add(this.f31637e);
                    g gVar3 = this.f31637e;
                    gVar3.f31581b = true;
                    gVar3.f31590k.add(this.f31640h);
                    this.f31637e.f31590k.add(this.f31641i);
                }
            } else if (i10 == 3 && !eVar3.Z()) {
                Q1.e eVar4 = this.f31634b;
                if (eVar4.f29623w != 3) {
                    g gVar4 = eVar4.f29587e.f31637e;
                    this.f31637e.f31591l.add(gVar4);
                    gVar4.f31590k.add(this.f31637e);
                    g gVar5 = this.f31637e;
                    gVar5.f31581b = true;
                    gVar5.f31590k.add(this.f31640h);
                    this.f31637e.f31590k.add(this.f31641i);
                }
            }
        }
        Q1.e eVar5 = this.f31634b;
        Q1.d[] dVarArr2 = eVar5.f29574V;
        Q1.d dVar5 = dVarArr2[2];
        Q1.d dVar6 = dVar5.f29528f;
        if (dVar6 != null && dVarArr2[3].f29528f != null) {
            if (eVar5.Z()) {
                this.f31640h.f31585f = this.f31634b.f29574V[2].e();
                this.f31641i.f31585f = -this.f31634b.f29574V[3].e();
            } else {
                f fVarH6 = h(this.f31634b.f29574V[2]);
                f fVarH7 = h(this.f31634b.f29574V[3]);
                if (fVarH6 != null) {
                    fVarH6.b(this);
                }
                if (fVarH7 != null) {
                    fVarH7.b(this);
                }
                this.f31642j = p.b.CENTER;
            }
            if (this.f31634b.P()) {
                c(this.f31615k, this.f31640h, 1, this.f31616l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f31640h, fVarH8, this.f31634b.f29574V[2].e());
                c(this.f31641i, this.f31640h, 1, this.f31637e);
                if (this.f31634b.P()) {
                    c(this.f31615k, this.f31640h, 1, this.f31616l);
                }
                e.b bVar2 = this.f31636d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f31634b.q() > 0.0f) {
                    l lVar = this.f31634b.f29587e;
                    if (lVar.f31636d == bVar3) {
                        lVar.f31637e.f31590k.add(this.f31637e);
                        this.f31637e.f31591l.add(this.f31634b.f29587e.f31637e);
                        this.f31637e.f31580a = this;
                    }
                }
            }
        } else {
            Q1.d dVar7 = dVarArr2[3];
            if (dVar7.f29528f != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f31641i, fVarH9, -this.f31634b.f29574V[3].e());
                    c(this.f31640h, this.f31641i, -1, this.f31637e);
                    if (this.f31634b.P()) {
                        c(this.f31615k, this.f31640h, 1, this.f31616l);
                    }
                }
            } else {
                Q1.d dVar8 = dVarArr2[4];
                if (dVar8.f29528f != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f31615k, fVarH10, 0);
                        c(this.f31640h, this.f31615k, -1, this.f31616l);
                        c(this.f31641i, this.f31640h, 1, this.f31637e);
                    }
                } else if (!(eVar5 instanceof Q1.h) && eVar5.D() != null) {
                    b(this.f31640h, this.f31634b.D().f29589f.f31640h, this.f31634b.O());
                    c(this.f31641i, this.f31640h, 1, this.f31637e);
                    if (this.f31634b.P()) {
                        c(this.f31615k, this.f31640h, 1, this.f31616l);
                    }
                    e.b bVar4 = this.f31636d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f31634b.q() > 0.0f) {
                        l lVar2 = this.f31634b.f29587e;
                        if (lVar2.f31636d == bVar5) {
                            lVar2.f31637e.f31590k.add(this.f31637e);
                            this.f31637e.f31591l.add(this.f31634b.f29587e.f31637e);
                            this.f31637e.f31580a = this;
                        }
                    }
                }
            }
        }
        if (this.f31637e.f31591l.size() == 0) {
            this.f31637e.f31582c = true;
        }
    }

    @Override // R1.p
    public void e() {
        f fVar = this.f31640h;
        if (fVar.f31589j) {
            this.f31634b.T0(fVar.f31586g);
        }
    }

    @Override // R1.p
    boolean m() {
        return this.f31636d != e.b.MATCH_CONSTRAINT || this.f31634b.f29625x == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f31634b.o();
    }

    public n(Q1.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f31615k = fVar;
        this.f31616l = null;
        this.f31640h.f31584e = f.a.TOP;
        this.f31641i.f31584e = f.a.BOTTOM;
        fVar.f31584e = f.a.BASELINE;
        this.f31638f = 1;
    }
}
