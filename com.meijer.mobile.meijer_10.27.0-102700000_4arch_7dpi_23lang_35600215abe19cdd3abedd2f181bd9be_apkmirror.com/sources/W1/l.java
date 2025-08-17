package W1;

import V1.d;
import V1.e;
import W1.f;
import W1.m;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f38389k;

    /* renamed from: l, reason: collision with root package name */
    g f38390l;

    @Override // W1.m
    void f() {
        this.f38394c = null;
        this.f38399h.c();
        this.f38400i.c();
        this.f38389k.c();
        this.f38396e.c();
        this.f38398g = false;
    }

    void q() {
        this.f38398g = false;
        this.f38399h.c();
        this.f38399h.f38366j = false;
        this.f38400i.c();
        this.f38400i.f38366j = false;
        this.f38389k.c();
        this.f38389k.f38366j = false;
        this.f38396e.f38366j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38391a;

        static {
            int[] iArr = new int[m.b.values().length];
            f38391a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38391a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38391a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    @Override // W1.m, W1.d
    public void a(d dVar) {
        float f10;
        float fT;
        float fT2;
        int i10;
        int i11 = a.f38391a[this.f38401j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            V1.e eVar = this.f38393b;
            n(dVar, eVar.f36600C, eVar.f36602E, 1);
            return;
        }
        g gVar = this.f38396e;
        if (gVar.f38359c && !gVar.f38366j && this.f38395d == e.b.MATCH_CONSTRAINT) {
            V1.e eVar2 = this.f38393b;
            int i12 = eVar2.f36648m;
            if (i12 == 2) {
                V1.e eVarG = eVar2.G();
                if (eVarG != null) {
                    if (eVarG.f36634f.f38396e.f38366j) {
                        this.f38396e.d((int) ((r7.f38363g * this.f38393b.f36662t) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f36632e.f38396e.f38366j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    V1.e eVar3 = this.f38393b;
                    f10 = eVar3.f36632e.f38396e.f38363g;
                    fT = eVar3.t();
                } else if (iU == 0) {
                    fT2 = r7.f36632e.f38396e.f38363g * this.f38393b.t();
                    i10 = (int) (fT2 + 0.5f);
                    this.f38396e.d(i10);
                } else if (iU != 1) {
                    i10 = 0;
                    this.f38396e.d(i10);
                } else {
                    V1.e eVar4 = this.f38393b;
                    f10 = eVar4.f36632e.f38396e.f38363g;
                    fT = eVar4.t();
                }
                fT2 = f10 / fT;
                i10 = (int) (fT2 + 0.5f);
                this.f38396e.d(i10);
            }
        }
        f fVar = this.f38399h;
        if (fVar.f38359c) {
            f fVar2 = this.f38400i;
            if (fVar2.f38359c) {
                if (fVar.f38366j && fVar2.f38366j && this.f38396e.f38366j) {
                    return;
                }
                if (!this.f38396e.f38366j && this.f38395d == e.b.MATCH_CONSTRAINT) {
                    V1.e eVar5 = this.f38393b;
                    if (eVar5.f36646l == 0 && !eVar5.X()) {
                        f fVar3 = this.f38399h.f38368l.get(0);
                        f fVar4 = this.f38400i.f38368l.get(0);
                        int i13 = fVar3.f38363g;
                        f fVar5 = this.f38399h;
                        int i14 = i13 + fVar5.f38362f;
                        int i15 = fVar4.f38363g + this.f38400i.f38362f;
                        fVar5.d(i14);
                        this.f38400i.d(i15);
                        this.f38396e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f38396e.f38366j && this.f38395d == e.b.MATCH_CONSTRAINT && this.f38392a == 1 && this.f38399h.f38368l.size() > 0 && this.f38400i.f38368l.size() > 0) {
                    f fVar6 = this.f38399h.f38368l.get(0);
                    int i16 = (this.f38400i.f38368l.get(0).f38363g + this.f38400i.f38362f) - (fVar6.f38363g + this.f38399h.f38362f);
                    g gVar2 = this.f38396e;
                    int i17 = gVar2.f38378m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f38396e.f38366j && this.f38399h.f38368l.size() > 0 && this.f38400i.f38368l.size() > 0) {
                    f fVar7 = this.f38399h.f38368l.get(0);
                    f fVar8 = this.f38400i.f38368l.get(0);
                    int i18 = fVar7.f38363g + this.f38399h.f38362f;
                    int i19 = fVar8.f38363g + this.f38400i.f38362f;
                    float fK = this.f38393b.K();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f38363g;
                        i19 = fVar8.f38363g;
                        fK = 0.5f;
                    }
                    this.f38399h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f38396e.f38363g) * fK)));
                    this.f38400i.d(this.f38399h.f38363g + this.f38396e.f38363g);
                }
            }
        }
    }

    @Override // W1.m
    void d() {
        V1.e eVarG;
        V1.e eVarG2;
        V1.e eVar = this.f38393b;
        if (eVar.f36624a) {
            this.f38396e.d(eVar.v());
        }
        if (!this.f38396e.f38366j) {
            this.f38395d = this.f38393b.M();
            if (this.f38393b.S()) {
                this.f38390l = new W1.a(this);
            }
            e.b bVar = this.f38395d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarG2 = this.f38393b.G()) != null && eVarG2.M() == e.b.FIXED) {
                    int iV = (eVarG2.v() - this.f38393b.f36600C.c()) - this.f38393b.f36602E.c();
                    b(this.f38399h, eVarG2.f36634f.f38399h, this.f38393b.f36600C.c());
                    b(this.f38400i, eVarG2.f36634f.f38400i, -this.f38393b.f36602E.c());
                    this.f38396e.d(iV);
                    return;
                }
                if (this.f38395d == e.b.FIXED) {
                    this.f38396e.d(this.f38393b.v());
                }
            }
        } else if (this.f38395d == e.b.MATCH_PARENT && (eVarG = this.f38393b.G()) != null && eVarG.M() == e.b.FIXED) {
            b(this.f38399h, eVarG.f36634f.f38399h, this.f38393b.f36600C.c());
            b(this.f38400i, eVarG.f36634f.f38400i, -this.f38393b.f36602E.c());
            return;
        }
        g gVar = this.f38396e;
        boolean z10 = gVar.f38366j;
        if (z10) {
            V1.e eVar2 = this.f38393b;
            if (eVar2.f36624a) {
                V1.d[] dVarArr = eVar2.f36607J;
                V1.d dVar = dVarArr[2];
                V1.d dVar2 = dVar.f36582d;
                if (dVar2 != null && dVarArr[3].f36582d != null) {
                    if (eVar2.X()) {
                        this.f38399h.f38362f = this.f38393b.f36607J[2].c();
                        this.f38400i.f38362f = -this.f38393b.f36607J[3].c();
                    } else {
                        f fVarH = h(this.f38393b.f36607J[2]);
                        if (fVarH != null) {
                            b(this.f38399h, fVarH, this.f38393b.f36607J[2].c());
                        }
                        f fVarH2 = h(this.f38393b.f36607J[3]);
                        if (fVarH2 != null) {
                            b(this.f38400i, fVarH2, -this.f38393b.f36607J[3].c());
                        }
                        this.f38399h.f38358b = true;
                        this.f38400i.f38358b = true;
                    }
                    if (this.f38393b.S()) {
                        b(this.f38389k, this.f38399h, this.f38393b.n());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f38399h, fVarH3, this.f38393b.f36607J[2].c());
                        b(this.f38400i, this.f38399h, this.f38396e.f38363g);
                        if (this.f38393b.S()) {
                            b(this.f38389k, this.f38399h, this.f38393b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                V1.d dVar3 = dVarArr[3];
                if (dVar3.f36582d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f38400i, fVarH4, -this.f38393b.f36607J[3].c());
                        b(this.f38399h, this.f38400i, -this.f38396e.f38363g);
                    }
                    if (this.f38393b.S()) {
                        b(this.f38389k, this.f38399h, this.f38393b.n());
                        return;
                    }
                    return;
                }
                V1.d dVar4 = dVarArr[4];
                if (dVar4.f36582d != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f38389k, fVarH5, 0);
                        b(this.f38399h, this.f38389k, -this.f38393b.n());
                        b(this.f38400i, this.f38399h, this.f38396e.f38363g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof V1.i) || eVar2.G() == null || this.f38393b.m(d.b.CENTER).f36582d != null) {
                    return;
                }
                b(this.f38399h, this.f38393b.G().f36634f.f38399h, this.f38393b.R());
                b(this.f38400i, this.f38399h, this.f38396e.f38363g);
                if (this.f38393b.S()) {
                    b(this.f38389k, this.f38399h, this.f38393b.n());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f38395d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            V1.e eVar3 = this.f38393b;
            int i10 = eVar3.f36648m;
            if (i10 == 2) {
                V1.e eVarG3 = eVar3.G();
                if (eVarG3 != null) {
                    g gVar2 = eVarG3.f36634f.f38396e;
                    this.f38396e.f38368l.add(gVar2);
                    gVar2.f38367k.add(this.f38396e);
                    g gVar3 = this.f38396e;
                    gVar3.f38358b = true;
                    gVar3.f38367k.add(this.f38399h);
                    this.f38396e.f38367k.add(this.f38400i);
                }
            } else if (i10 == 3 && !eVar3.X()) {
                V1.e eVar4 = this.f38393b;
                if (eVar4.f36646l != 3) {
                    g gVar4 = eVar4.f36632e.f38396e;
                    this.f38396e.f38368l.add(gVar4);
                    gVar4.f38367k.add(this.f38396e);
                    g gVar5 = this.f38396e;
                    gVar5.f38358b = true;
                    gVar5.f38367k.add(this.f38399h);
                    this.f38396e.f38367k.add(this.f38400i);
                }
            }
        }
        V1.e eVar5 = this.f38393b;
        V1.d[] dVarArr2 = eVar5.f36607J;
        V1.d dVar5 = dVarArr2[2];
        V1.d dVar6 = dVar5.f36582d;
        if (dVar6 != null && dVarArr2[3].f36582d != null) {
            if (eVar5.X()) {
                this.f38399h.f38362f = this.f38393b.f36607J[2].c();
                this.f38400i.f38362f = -this.f38393b.f36607J[3].c();
            } else {
                f fVarH6 = h(this.f38393b.f36607J[2]);
                f fVarH7 = h(this.f38393b.f36607J[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f38401j = m.b.CENTER;
            }
            if (this.f38393b.S()) {
                c(this.f38389k, this.f38399h, 1, this.f38390l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f38399h, fVarH8, this.f38393b.f36607J[2].c());
                c(this.f38400i, this.f38399h, 1, this.f38396e);
                if (this.f38393b.S()) {
                    c(this.f38389k, this.f38399h, 1, this.f38390l);
                }
                e.b bVar2 = this.f38395d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f38393b.t() > 0.0f) {
                    j jVar = this.f38393b.f36632e;
                    if (jVar.f38395d == bVar3) {
                        jVar.f38396e.f38367k.add(this.f38396e);
                        this.f38396e.f38368l.add(this.f38393b.f36632e.f38396e);
                        this.f38396e.f38357a = this;
                    }
                }
            }
        } else {
            V1.d dVar7 = dVarArr2[3];
            if (dVar7.f36582d != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f38400i, fVarH9, -this.f38393b.f36607J[3].c());
                    c(this.f38399h, this.f38400i, -1, this.f38396e);
                    if (this.f38393b.S()) {
                        c(this.f38389k, this.f38399h, 1, this.f38390l);
                    }
                }
            } else {
                V1.d dVar8 = dVarArr2[4];
                if (dVar8.f36582d != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f38389k, fVarH10, 0);
                        c(this.f38399h, this.f38389k, -1, this.f38390l);
                        c(this.f38400i, this.f38399h, 1, this.f38396e);
                    }
                } else if (!(eVar5 instanceof V1.i) && eVar5.G() != null) {
                    b(this.f38399h, this.f38393b.G().f36634f.f38399h, this.f38393b.R());
                    c(this.f38400i, this.f38399h, 1, this.f38396e);
                    if (this.f38393b.S()) {
                        c(this.f38389k, this.f38399h, 1, this.f38390l);
                    }
                    e.b bVar4 = this.f38395d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f38393b.t() > 0.0f) {
                        j jVar2 = this.f38393b.f36632e;
                        if (jVar2.f38395d == bVar5) {
                            jVar2.f38396e.f38367k.add(this.f38396e);
                            this.f38396e.f38368l.add(this.f38393b.f36632e.f38396e);
                            this.f38396e.f38357a = this;
                        }
                    }
                }
            }
        }
        if (this.f38396e.f38368l.size() == 0) {
            this.f38396e.f38359c = true;
        }
    }

    @Override // W1.m
    public void e() {
        f fVar = this.f38399h;
        if (fVar.f38366j) {
            this.f38393b.G0(fVar.f38363g);
        }
    }

    @Override // W1.m
    boolean m() {
        return this.f38395d != e.b.MATCH_CONSTRAINT || this.f38393b.f36648m == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f38393b.r();
    }

    public l(V1.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f38389k = fVar;
        this.f38390l = null;
        this.f38399h.f38361e = f.a.TOP;
        this.f38400i.f38361e = f.a.BOTTOM;
        fVar.f38361e = f.a.BASELINE;
        this.f38397f = 1;
    }
}
