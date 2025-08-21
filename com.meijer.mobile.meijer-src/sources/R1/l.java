package R1;

import Q1.d;
import Q1.e;
import R1.f;
import R1.p;

/* loaded from: classes.dex */
public class l extends p {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f31607k = new int[2];

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
        this.f31637c = null;
        this.f31642h.c();
        this.f31643i.c();
        this.f31639e.c();
        this.f31641g = false;
    }

    void r() {
        this.f31641g = false;
        this.f31642h.c();
        this.f31642h.f31591j = false;
        this.f31643i.c();
        this.f31643i.f31591j = false;
        this.f31639e.f31591j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31608a;

        static {
            int[] iArr = new int[p.b.values().length];
            f31608a = iArr;
            try {
                iArr[p.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31608a[p.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31608a[p.b.CENTER.ordinal()] = 3;
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
        Q1.e eVar = this.f31636b;
        if (eVar.f27592a) {
            this.f31639e.d(eVar.M());
        }
        if (this.f31639e.f31591j) {
            e.b bVar = this.f31638d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (eVarD = this.f31636b.D()) != null && (eVarD.v() == e.b.FIXED || eVarD.v() == bVar2)) {
                b(this.f31642h, eVarD.f27600e.f31642h, this.f31636b.f27579N.e());
                b(this.f31643i, eVarD.f27600e.f31643i, -this.f31636b.f27581P.e());
                return;
            }
        } else {
            e.b bVarV = this.f31636b.v();
            this.f31638d = bVarV;
            if (bVarV != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarV == bVar3 && (eVarD2 = this.f31636b.D()) != null && (eVarD2.v() == e.b.FIXED || eVarD2.v() == bVar3)) {
                    int iM = (eVarD2.M() - this.f31636b.f27579N.e()) - this.f31636b.f27581P.e();
                    b(this.f31642h, eVarD2.f27600e.f31642h, this.f31636b.f27579N.e());
                    b(this.f31643i, eVarD2.f27600e.f31643i, -this.f31636b.f27581P.e());
                    this.f31639e.d(iM);
                    return;
                }
                if (this.f31638d == e.b.FIXED) {
                    this.f31639e.d(this.f31636b.M());
                }
            }
        }
        g gVar = this.f31639e;
        if (gVar.f31591j) {
            Q1.e eVar2 = this.f31636b;
            if (eVar2.f27592a) {
                Q1.d[] dVarArr = eVar2.f27587V;
                Q1.d dVar = dVarArr[0];
                Q1.d dVar2 = dVar.f27541f;
                if (dVar2 != null && dVarArr[1].f27541f != null) {
                    if (eVar2.Y()) {
                        this.f31642h.f31587f = this.f31636b.f27587V[0].e();
                        this.f31643i.f31587f = -this.f31636b.f27587V[1].e();
                        return;
                    }
                    f fVarH = h(this.f31636b.f27587V[0]);
                    if (fVarH != null) {
                        b(this.f31642h, fVarH, this.f31636b.f27587V[0].e());
                    }
                    f fVarH2 = h(this.f31636b.f27587V[1]);
                    if (fVarH2 != null) {
                        b(this.f31643i, fVarH2, -this.f31636b.f27587V[1].e());
                    }
                    this.f31642h.f31583b = true;
                    this.f31643i.f31583b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f31642h, fVarH3, this.f31636b.f27587V[0].e());
                        b(this.f31643i, this.f31642h, this.f31639e.f31588g);
                        return;
                    }
                    return;
                }
                Q1.d dVar3 = dVarArr[1];
                if (dVar3.f27541f != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f31643i, fVarH4, -this.f31636b.f27587V[1].e());
                        b(this.f31642h, this.f31643i, -this.f31639e.f31588g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof Q1.h) || eVar2.D() == null || this.f31636b.j(d.b.CENTER).f27541f != null) {
                    return;
                }
                b(this.f31642h, this.f31636b.D().f27600e.f31642h, this.f31636b.N());
                b(this.f31643i, this.f31642h, this.f31639e.f31588g);
                return;
            }
        }
        if (this.f31638d == e.b.MATCH_CONSTRAINT) {
            Q1.e eVar3 = this.f31636b;
            int i10 = eVar3.f27636w;
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
            } else if (i10 == 3) {
                if (eVar3.f27638x == 3) {
                    this.f31642h.f31582a = this;
                    this.f31643i.f31582a = this;
                    n nVar = eVar3.f27602f;
                    nVar.f31642h.f31582a = this;
                    nVar.f31643i.f31582a = this;
                    gVar.f31582a = this;
                    if (eVar3.Z()) {
                        this.f31639e.f31593l.add(this.f31636b.f27602f.f31639e);
                        this.f31636b.f27602f.f31639e.f31592k.add(this.f31639e);
                        n nVar2 = this.f31636b.f27602f;
                        nVar2.f31639e.f31582a = this;
                        this.f31639e.f31593l.add(nVar2.f31642h);
                        this.f31639e.f31593l.add(this.f31636b.f27602f.f31643i);
                        this.f31636b.f27602f.f31642h.f31592k.add(this.f31639e);
                        this.f31636b.f27602f.f31643i.f31592k.add(this.f31639e);
                    } else if (this.f31636b.Y()) {
                        this.f31636b.f27602f.f31639e.f31593l.add(this.f31639e);
                        this.f31639e.f31592k.add(this.f31636b.f27602f.f31639e);
                    } else {
                        this.f31636b.f27602f.f31639e.f31593l.add(this.f31639e);
                    }
                } else {
                    g gVar4 = eVar3.f27602f.f31639e;
                    gVar.f31593l.add(gVar4);
                    gVar4.f31592k.add(this.f31639e);
                    this.f31636b.f27602f.f31642h.f31592k.add(this.f31639e);
                    this.f31636b.f27602f.f31643i.f31592k.add(this.f31639e);
                    g gVar5 = this.f31639e;
                    gVar5.f31583b = true;
                    gVar5.f31592k.add(this.f31642h);
                    this.f31639e.f31592k.add(this.f31643i);
                    this.f31642h.f31593l.add(this.f31639e);
                    this.f31643i.f31593l.add(this.f31639e);
                }
            }
        }
        Q1.e eVar4 = this.f31636b;
        Q1.d[] dVarArr2 = eVar4.f27587V;
        Q1.d dVar4 = dVarArr2[0];
        Q1.d dVar5 = dVar4.f27541f;
        if (dVar5 != null && dVarArr2[1].f27541f != null) {
            if (eVar4.Y()) {
                this.f31642h.f31587f = this.f31636b.f27587V[0].e();
                this.f31643i.f31587f = -this.f31636b.f27587V[1].e();
                return;
            }
            f fVarH5 = h(this.f31636b.f27587V[0]);
            f fVarH6 = h(this.f31636b.f27587V[1]);
            if (fVarH5 != null) {
                fVarH5.b(this);
            }
            if (fVarH6 != null) {
                fVarH6.b(this);
            }
            this.f31644j = p.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f31642h, fVarH7, this.f31636b.f27587V[0].e());
                c(this.f31643i, this.f31642h, 1, this.f31639e);
                return;
            }
            return;
        }
        Q1.d dVar6 = dVarArr2[1];
        if (dVar6.f27541f != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f31643i, fVarH8, -this.f31636b.f27587V[1].e());
                c(this.f31642h, this.f31643i, -1, this.f31639e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof Q1.h) || eVar4.D() == null) {
            return;
        }
        b(this.f31642h, this.f31636b.D().f27600e.f31642h, this.f31636b.N());
        c(this.f31643i, this.f31642h, 1, this.f31639e);
    }

    @Override // R1.p
    public void e() {
        f fVar = this.f31642h;
        if (fVar.f31591j) {
            this.f31636b.S0(fVar.f31588g);
        }
    }

    @Override // R1.p
    boolean m() {
        return this.f31638d != e.b.MATCH_CONSTRAINT || this.f31636b.f27636w == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f31636b.o();
    }

    public l(Q1.e eVar) {
        super(eVar);
        this.f31642h.f31586e = f.a.LEFT;
        this.f31643i.f31586e = f.a.RIGHT;
        this.f31640f = 0;
    }
}
