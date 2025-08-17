package R1;

import Q1.d;
import Q1.e;
import R1.f;
import R1.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f31605k = new int[2];

    private void q(int[] iArr, int i10, int i11, int i12, int i13, float f10, int i14) {
        int i15 = i11 - i10;
        int i16 = i13 - i12;
        if (i14 != -1) {
            if (i14 == 0) {
                iArr[0] = (int) ((i16 * f10) + 0.5f);
                iArr[1] = i16;
                return;
            } else {
                if (i14 != 1) {
                    return;
                }
                iArr[0] = i15;
                iArr[1] = (int) ((i15 * f10) + 0.5f);
                return;
            }
        }
        int i17 = (int) ((i16 * f10) + 0.5f);
        int i18 = (int) ((i15 / f10) + 0.5f);
        if (i17 <= i15) {
            iArr[0] = i17;
            iArr[1] = i16;
        } else if (i18 <= i16) {
            iArr[0] = i15;
            iArr[1] = i18;
        }
    }

    @Override // R1.p
    void f() {
        this.f31635c = null;
        this.f31640h.c();
        this.f31641i.c();
        this.f31637e.c();
        this.f31639g = false;
    }

    void r() {
        this.f31639g = false;
        this.f31640h.c();
        this.f31640h.f31589j = false;
        this.f31641i.c();
        this.f31641i.f31589j = false;
        this.f31637e.f31589j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31606a;

        static {
            int[] iArr = new int[p.b.values().length];
            f31606a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31606a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31606a[p.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    @Override // R1.p, R1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(R1.d r14) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: R1.l.a(R1.d):void");
    }

    @Override // R1.p
    void d() {
        Q1.e eVarD;
        Q1.e eVarD2;
        Q1.e eVar = this.f31634b;
        if (eVar.f29579a) {
            this.f31637e.d(eVar.M());
        }
        if (this.f31637e.f31589j) {
            e.b bVar = this.f31636d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarD = this.f31634b.D()) != null && (eVarD.v() == e.b.FIXED || eVarD.v() == bVar2)) {
                b(this.f31640h, eVarD.f29587e.f31640h, this.f31634b.f29566N.e());
                b(this.f31641i, eVarD.f29587e.f31641i, -this.f31634b.f29568P.e());
                return;
            }
        } else {
            e.b bVarV = this.f31634b.v();
            this.f31636d = bVarV;
            if (bVarV != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarV == bVar3 && (eVarD2 = this.f31634b.D()) != null && (eVarD2.v() == e.b.FIXED || eVarD2.v() == bVar3)) {
                    int iM = (eVarD2.M() - this.f31634b.f29566N.e()) - this.f31634b.f29568P.e();
                    b(this.f31640h, eVarD2.f29587e.f31640h, this.f31634b.f29566N.e());
                    b(this.f31641i, eVarD2.f29587e.f31641i, -this.f31634b.f29568P.e());
                    this.f31637e.d(iM);
                    return;
                }
                if (this.f31636d == e.b.FIXED) {
                    this.f31637e.d(this.f31634b.M());
                }
            }
        }
        g gVar = this.f31637e;
        if (gVar.f31589j) {
            Q1.e eVar2 = this.f31634b;
            if (eVar2.f29579a) {
                Q1.d[] dVarArr = eVar2.f29574V;
                Q1.d dVar = dVarArr[0];
                Q1.d dVar2 = dVar.f29528f;
                if (dVar2 != null && dVarArr[1].f29528f != null) {
                    if (eVar2.Y()) {
                        this.f31640h.f31585f = this.f31634b.f29574V[0].e();
                        this.f31641i.f31585f = -this.f31634b.f29574V[1].e();
                        return;
                    }
                    f fVarH = h(this.f31634b.f29574V[0]);
                    if (fVarH != null) {
                        b(this.f31640h, fVarH, this.f31634b.f29574V[0].e());
                    }
                    f fVarH2 = h(this.f31634b.f29574V[1]);
                    if (fVarH2 != null) {
                        b(this.f31641i, fVarH2, -this.f31634b.f29574V[1].e());
                    }
                    this.f31640h.f31581b = true;
                    this.f31641i.f31581b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f31640h, fVarH3, this.f31634b.f29574V[0].e());
                        b(this.f31641i, this.f31640h, this.f31637e.f31586g);
                        return;
                    }
                    return;
                }
                Q1.d dVar3 = dVarArr[1];
                if (dVar3.f29528f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f31641i, fVarH4, -this.f31634b.f29574V[1].e());
                        b(this.f31640h, this.f31641i, -this.f31637e.f31586g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof Q1.h) || eVar2.D() == null || this.f31634b.j(d.b.CENTER).f29528f != null) {
                    return;
                }
                b(this.f31640h, this.f31634b.D().f29587e.f31640h, this.f31634b.N());
                b(this.f31641i, this.f31640h, this.f31637e.f31586g);
                return;
            }
        }
        if (this.f31636d == e.b.MATCH_CONSTRAINT) {
            Q1.e eVar3 = this.f31634b;
            int i10 = eVar3.f29623w;
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
            } else if (i10 == 3) {
                if (eVar3.f29625x == 3) {
                    this.f31640h.f31580a = this;
                    this.f31641i.f31580a = this;
                    n nVar = eVar3.f29589f;
                    nVar.f31640h.f31580a = this;
                    nVar.f31641i.f31580a = this;
                    gVar.f31580a = this;
                    if (eVar3.Z()) {
                        this.f31637e.f31591l.add(this.f31634b.f29589f.f31637e);
                        this.f31634b.f29589f.f31637e.f31590k.add(this.f31637e);
                        n nVar2 = this.f31634b.f29589f;
                        nVar2.f31637e.f31580a = this;
                        this.f31637e.f31591l.add(nVar2.f31640h);
                        this.f31637e.f31591l.add(this.f31634b.f29589f.f31641i);
                        this.f31634b.f29589f.f31640h.f31590k.add(this.f31637e);
                        this.f31634b.f29589f.f31641i.f31590k.add(this.f31637e);
                    } else if (this.f31634b.Y()) {
                        this.f31634b.f29589f.f31637e.f31591l.add(this.f31637e);
                        this.f31637e.f31590k.add(this.f31634b.f29589f.f31637e);
                    } else {
                        this.f31634b.f29589f.f31637e.f31591l.add(this.f31637e);
                    }
                } else {
                    g gVar4 = eVar3.f29589f.f31637e;
                    gVar.f31591l.add(gVar4);
                    gVar4.f31590k.add(this.f31637e);
                    this.f31634b.f29589f.f31640h.f31590k.add(this.f31637e);
                    this.f31634b.f29589f.f31641i.f31590k.add(this.f31637e);
                    g gVar5 = this.f31637e;
                    gVar5.f31581b = true;
                    gVar5.f31590k.add(this.f31640h);
                    this.f31637e.f31590k.add(this.f31641i);
                    this.f31640h.f31591l.add(this.f31637e);
                    this.f31641i.f31591l.add(this.f31637e);
                }
            }
        }
        Q1.e eVar4 = this.f31634b;
        Q1.d[] dVarArr2 = eVar4.f29574V;
        Q1.d dVar4 = dVarArr2[0];
        Q1.d dVar5 = dVar4.f29528f;
        if (dVar5 != null && dVarArr2[1].f29528f != null) {
            if (eVar4.Y()) {
                this.f31640h.f31585f = this.f31634b.f29574V[0].e();
                this.f31641i.f31585f = -this.f31634b.f29574V[1].e();
                return;
            }
            f fVarH5 = h(this.f31634b.f29574V[0]);
            f fVarH6 = h(this.f31634b.f29574V[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f31642j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f31640h, fVarH7, this.f31634b.f29574V[0].e());
                c(this.f31641i, this.f31640h, 1, this.f31637e);
                return;
            }
            return;
        }
        Q1.d dVar6 = dVarArr2[1];
        if (dVar6.f29528f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f31641i, fVarH8, -this.f31634b.f29574V[1].e());
                c(this.f31640h, this.f31641i, -1, this.f31637e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof Q1.h) || eVar4.D() == null) {
            return;
        }
        b(this.f31640h, this.f31634b.D().f29587e.f31640h, this.f31634b.N());
        c(this.f31641i, this.f31640h, 1, this.f31637e);
    }

    @Override // R1.p
    public void e() {
        f fVar = this.f31640h;
        if (fVar.f31589j) {
            this.f31634b.S0(fVar.f31586g);
        }
    }

    @Override // R1.p
    boolean m() {
        return this.f31636d != e.b.MATCH_CONSTRAINT || this.f31634b.f29623w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f31634b.o();
    }

    public l(Q1.e eVar) {
        super(eVar);
        this.f31640h.f31584e = f.a.LEFT;
        this.f31641i.f31584e = f.a.RIGHT;
        this.f31638f = 0;
    }
}
