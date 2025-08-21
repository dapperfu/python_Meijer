package W1;

import V1.d;
import V1.e;
import W1.f;
import W1.m;

/* loaded from: classes.dex */
public class l extends m {

    /* renamed from: k, reason: collision with root package name */
    public f f40677k;

    /* renamed from: l, reason: collision with root package name */
    g f40678l;

    @Override // W1.m
    void f() {
        this.f40682c = null;
        this.f40687h.c();
        this.f40688i.c();
        this.f40677k.c();
        this.f40684e.c();
        this.f40686g = false;
    }

    void q() {
        this.f40686g = false;
        this.f40687h.c();
        this.f40687h.f40654j = false;
        this.f40688i.c();
        this.f40688i.f40654j = false;
        this.f40677k.c();
        this.f40677k.f40654j = false;
        this.f40684e.f40654j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40679a;

        static {
            int[] iArr = new int[m.b.values().length];
            f40679a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40679a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40679a[m.b.CENTER.ordinal()] = 3;
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
        int i11 = a.f40679a[this.f40689j.ordinal()];
        if (i11 == 1) {
            p(dVar);
        } else if (i11 == 2) {
            o(dVar);
        } else if (i11 == 3) {
            V1.e eVar = this.f40681b;
            n(dVar, eVar.f39460C, eVar.f39462E, 1);
            return;
        }
        g gVar = this.f40684e;
        if (gVar.f40647c && !gVar.f40654j && this.f40683d == e.b.MATCH_CONSTRAINT) {
            V1.e eVar2 = this.f40681b;
            int i12 = eVar2.f39508m;
            if (i12 == 2) {
                V1.e eVarG = eVar2.G();
                if (eVarG != null) {
                    if (eVarG.f39494f.f40684e.f40654j) {
                        this.f40684e.d((int) ((r7.f40651g * this.f40681b.f39522t) + 0.5f));
                    }
                }
            } else if (i12 == 3 && eVar2.f39492e.f40684e.f40654j) {
                int iU = eVar2.u();
                if (iU == -1) {
                    V1.e eVar3 = this.f40681b;
                    f10 = eVar3.f39492e.f40684e.f40651g;
                    fT = eVar3.t();
                } else if (iU == 0) {
                    fT2 = r7.f39492e.f40684e.f40651g * this.f40681b.t();
                    i10 = (int) (fT2 + 0.5f);
                    this.f40684e.d(i10);
                } else if (iU != 1) {
                    i10 = 0;
                    this.f40684e.d(i10);
                } else {
                    V1.e eVar4 = this.f40681b;
                    f10 = eVar4.f39492e.f40684e.f40651g;
                    fT = eVar4.t();
                }
                fT2 = f10 / fT;
                i10 = (int) (fT2 + 0.5f);
                this.f40684e.d(i10);
            }
        }
        f fVar = this.f40687h;
        if (fVar.f40647c) {
            f fVar2 = this.f40688i;
            if (fVar2.f40647c) {
                if (fVar.f40654j && fVar2.f40654j && this.f40684e.f40654j) {
                    return;
                }
                if (!this.f40684e.f40654j && this.f40683d == e.b.MATCH_CONSTRAINT) {
                    V1.e eVar5 = this.f40681b;
                    if (eVar5.f39506l == 0 && !eVar5.X()) {
                        f fVar3 = this.f40687h.f40656l.get(0);
                        f fVar4 = this.f40688i.f40656l.get(0);
                        int i13 = fVar3.f40651g;
                        f fVar5 = this.f40687h;
                        int i14 = i13 + fVar5.f40650f;
                        int i15 = fVar4.f40651g + this.f40688i.f40650f;
                        fVar5.d(i14);
                        this.f40688i.d(i15);
                        this.f40684e.d(i15 - i14);
                        return;
                    }
                }
                if (!this.f40684e.f40654j && this.f40683d == e.b.MATCH_CONSTRAINT && this.f40680a == 1 && this.f40687h.f40656l.size() > 0 && this.f40688i.f40656l.size() > 0) {
                    f fVar6 = this.f40687h.f40656l.get(0);
                    int i16 = (this.f40688i.f40656l.get(0).f40651g + this.f40688i.f40650f) - (fVar6.f40651g + this.f40687h.f40650f);
                    g gVar2 = this.f40684e;
                    int i17 = gVar2.f40666m;
                    if (i16 < i17) {
                        gVar2.d(i16);
                    } else {
                        gVar2.d(i17);
                    }
                }
                if (this.f40684e.f40654j && this.f40687h.f40656l.size() > 0 && this.f40688i.f40656l.size() > 0) {
                    f fVar7 = this.f40687h.f40656l.get(0);
                    f fVar8 = this.f40688i.f40656l.get(0);
                    int i18 = fVar7.f40651g + this.f40687h.f40650f;
                    int i19 = fVar8.f40651g + this.f40688i.f40650f;
                    float fK = this.f40681b.K();
                    if (fVar7 == fVar8) {
                        i18 = fVar7.f40651g;
                        i19 = fVar8.f40651g;
                        fK = 0.5f;
                    }
                    this.f40687h.d((int) (i18 + 0.5f + (((i19 - i18) - this.f40684e.f40651g) * fK)));
                    this.f40688i.d(this.f40687h.f40651g + this.f40684e.f40651g);
                }
            }
        }
    }

    @Override // W1.m
    void d() {
        V1.e eVarG;
        V1.e eVarG2;
        V1.e eVar = this.f40681b;
        if (eVar.f39484a) {
            this.f40684e.d(eVar.v());
        }
        if (!this.f40684e.f40654j) {
            this.f40683d = this.f40681b.M();
            if (this.f40681b.S()) {
                this.f40678l = new W1.a(this);
            }
            e.b bVar = this.f40683d;
            if (bVar != e.b.MATCH_CONSTRAINT) {
                if (bVar == e.b.MATCH_PARENT && (eVarG2 = this.f40681b.G()) != null && eVarG2.M() == e.b.FIXED) {
                    int iV = (eVarG2.v() - this.f40681b.f39460C.c()) - this.f40681b.f39462E.c();
                    b(this.f40687h, eVarG2.f39494f.f40687h, this.f40681b.f39460C.c());
                    b(this.f40688i, eVarG2.f39494f.f40688i, -this.f40681b.f39462E.c());
                    this.f40684e.d(iV);
                    return;
                }
                if (this.f40683d == e.b.FIXED) {
                    this.f40684e.d(this.f40681b.v());
                }
            }
        } else if (this.f40683d == e.b.MATCH_PARENT && (eVarG = this.f40681b.G()) != null && eVarG.M() == e.b.FIXED) {
            b(this.f40687h, eVarG.f39494f.f40687h, this.f40681b.f39460C.c());
            b(this.f40688i, eVarG.f39494f.f40688i, -this.f40681b.f39462E.c());
            return;
        }
        g gVar = this.f40684e;
        boolean z10 = gVar.f40654j;
        if (z10) {
            V1.e eVar2 = this.f40681b;
            if (eVar2.f39484a) {
                V1.d[] dVarArr = eVar2.f39467J;
                V1.d dVar = dVarArr[2];
                V1.d dVar2 = dVar.f39442d;
                if (dVar2 != null && dVarArr[3].f39442d != null) {
                    if (eVar2.X()) {
                        this.f40687h.f40650f = this.f40681b.f39467J[2].c();
                        this.f40688i.f40650f = -this.f40681b.f39467J[3].c();
                    } else {
                        f fVarH = h(this.f40681b.f39467J[2]);
                        if (fVarH != null) {
                            b(this.f40687h, fVarH, this.f40681b.f39467J[2].c());
                        }
                        f fVarH2 = h(this.f40681b.f39467J[3]);
                        if (fVarH2 != null) {
                            b(this.f40688i, fVarH2, -this.f40681b.f39467J[3].c());
                        }
                        this.f40687h.f40646b = true;
                        this.f40688i.f40646b = true;
                    }
                    if (this.f40681b.S()) {
                        b(this.f40677k, this.f40687h, this.f40681b.n());
                        return;
                    }
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f40687h, fVarH3, this.f40681b.f39467J[2].c());
                        b(this.f40688i, this.f40687h, this.f40684e.f40651g);
                        if (this.f40681b.S()) {
                            b(this.f40677k, this.f40687h, this.f40681b.n());
                            return;
                        }
                        return;
                    }
                    return;
                }
                V1.d dVar3 = dVarArr[3];
                if (dVar3.f39442d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f40688i, fVarH4, -this.f40681b.f39467J[3].c());
                        b(this.f40687h, this.f40688i, -this.f40684e.f40651g);
                    }
                    if (this.f40681b.S()) {
                        b(this.f40677k, this.f40687h, this.f40681b.n());
                        return;
                    }
                    return;
                }
                V1.d dVar4 = dVarArr[4];
                if (dVar4.f39442d != null) {
                    f fVarH5 = h(dVar4);
                    if (fVarH5 != null) {
                        b(this.f40677k, fVarH5, 0);
                        b(this.f40687h, this.f40677k, -this.f40681b.n());
                        b(this.f40688i, this.f40687h, this.f40684e.f40651g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof V1.i) || eVar2.G() == null || this.f40681b.m(d.b.CENTER).f39442d != null) {
                    return;
                }
                b(this.f40687h, this.f40681b.G().f39494f.f40687h, this.f40681b.R());
                b(this.f40688i, this.f40687h, this.f40684e.f40651g);
                if (this.f40681b.S()) {
                    b(this.f40677k, this.f40687h, this.f40681b.n());
                    return;
                }
                return;
            }
        }
        if (z10 || this.f40683d != e.b.MATCH_CONSTRAINT) {
            gVar.b(this);
        } else {
            V1.e eVar3 = this.f40681b;
            int i10 = eVar3.f39508m;
            if (i10 == 2) {
                V1.e eVarG3 = eVar3.G();
                if (eVarG3 != null) {
                    g gVar2 = eVarG3.f39494f.f40684e;
                    this.f40684e.f40656l.add(gVar2);
                    gVar2.f40655k.add(this.f40684e);
                    g gVar3 = this.f40684e;
                    gVar3.f40646b = true;
                    gVar3.f40655k.add(this.f40687h);
                    this.f40684e.f40655k.add(this.f40688i);
                }
            } else if (i10 == 3 && !eVar3.X()) {
                V1.e eVar4 = this.f40681b;
                if (eVar4.f39506l != 3) {
                    g gVar4 = eVar4.f39492e.f40684e;
                    this.f40684e.f40656l.add(gVar4);
                    gVar4.f40655k.add(this.f40684e);
                    g gVar5 = this.f40684e;
                    gVar5.f40646b = true;
                    gVar5.f40655k.add(this.f40687h);
                    this.f40684e.f40655k.add(this.f40688i);
                }
            }
        }
        V1.e eVar5 = this.f40681b;
        V1.d[] dVarArr2 = eVar5.f39467J;
        V1.d dVar5 = dVarArr2[2];
        V1.d dVar6 = dVar5.f39442d;
        if (dVar6 != null && dVarArr2[3].f39442d != null) {
            if (eVar5.X()) {
                this.f40687h.f40650f = this.f40681b.f39467J[2].c();
                this.f40688i.f40650f = -this.f40681b.f39467J[3].c();
            } else {
                f fVarH6 = h(this.f40681b.f39467J[2]);
                f fVarH7 = h(this.f40681b.f39467J[3]);
                fVarH6.b(this);
                fVarH7.b(this);
                this.f40689j = m.b.CENTER;
            }
            if (this.f40681b.S()) {
                c(this.f40677k, this.f40687h, 1, this.f40678l);
            }
        } else if (dVar6 != null) {
            f fVarH8 = h(dVar5);
            if (fVarH8 != null) {
                b(this.f40687h, fVarH8, this.f40681b.f39467J[2].c());
                c(this.f40688i, this.f40687h, 1, this.f40684e);
                if (this.f40681b.S()) {
                    c(this.f40677k, this.f40687h, 1, this.f40678l);
                }
                e.b bVar2 = this.f40683d;
                e.b bVar3 = e.b.MATCH_CONSTRAINT;
                if (bVar2 == bVar3 && this.f40681b.t() > 0.0f) {
                    j jVar = this.f40681b.f39492e;
                    if (jVar.f40683d == bVar3) {
                        jVar.f40684e.f40655k.add(this.f40684e);
                        this.f40684e.f40656l.add(this.f40681b.f39492e.f40684e);
                        this.f40684e.f40645a = this;
                    }
                }
            }
        } else {
            V1.d dVar7 = dVarArr2[3];
            if (dVar7.f39442d != null) {
                f fVarH9 = h(dVar7);
                if (fVarH9 != null) {
                    b(this.f40688i, fVarH9, -this.f40681b.f39467J[3].c());
                    c(this.f40687h, this.f40688i, -1, this.f40684e);
                    if (this.f40681b.S()) {
                        c(this.f40677k, this.f40687h, 1, this.f40678l);
                    }
                }
            } else {
                V1.d dVar8 = dVarArr2[4];
                if (dVar8.f39442d != null) {
                    f fVarH10 = h(dVar8);
                    if (fVarH10 != null) {
                        b(this.f40677k, fVarH10, 0);
                        c(this.f40687h, this.f40677k, -1, this.f40678l);
                        c(this.f40688i, this.f40687h, 1, this.f40684e);
                    }
                } else if (!(eVar5 instanceof V1.i) && eVar5.G() != null) {
                    b(this.f40687h, this.f40681b.G().f39494f.f40687h, this.f40681b.R());
                    c(this.f40688i, this.f40687h, 1, this.f40684e);
                    if (this.f40681b.S()) {
                        c(this.f40677k, this.f40687h, 1, this.f40678l);
                    }
                    e.b bVar4 = this.f40683d;
                    e.b bVar5 = e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar5 && this.f40681b.t() > 0.0f) {
                        j jVar2 = this.f40681b.f39492e;
                        if (jVar2.f40683d == bVar5) {
                            jVar2.f40684e.f40655k.add(this.f40684e);
                            this.f40684e.f40656l.add(this.f40681b.f39492e.f40684e);
                            this.f40684e.f40645a = this;
                        }
                    }
                }
            }
        }
        if (this.f40684e.f40656l.size() == 0) {
            this.f40684e.f40647c = true;
        }
    }

    @Override // W1.m
    public void e() {
        f fVar = this.f40687h;
        if (fVar.f40654j) {
            this.f40681b.G0(fVar.f40651g);
        }
    }

    @Override // W1.m
    boolean m() {
        return this.f40683d != e.b.MATCH_CONSTRAINT || this.f40681b.f39508m == 0;
    }

    public String toString() {
        return "VerticalRun " + this.f40681b.r();
    }

    public l(V1.e eVar) {
        super(eVar);
        f fVar = new f(this);
        this.f40677k = fVar;
        this.f40678l = null;
        this.f40687h.f40649e = f.a.TOP;
        this.f40688i.f40649e = f.a.BOTTOM;
        fVar.f40649e = f.a.BASELINE;
        this.f40685f = 1;
    }
}
