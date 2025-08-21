package W1;

import V1.d;
import V1.e;
import W1.f;
import W1.m;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f40667k = new int[2];

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

    @Override // W1.m
    void f() {
        this.f40682c = null;
        this.f40687h.c();
        this.f40688i.c();
        this.f40684e.c();
        this.f40686g = false;
    }

    void r() {
        this.f40686g = false;
        this.f40687h.c();
        this.f40687h.f40654j = false;
        this.f40688i.c();
        this.f40688i.f40654j = false;
        this.f40684e.f40654j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f40668a;

        static {
            int[] iArr = new int[m.b.values().length];
            f40668a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40668a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40668a[m.b.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:122:0x02ca  */
    @Override // W1.m, W1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(W1.d r14) {
        /*
            Method dump skipped, instructions count: 1067
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: W1.j.a(W1.d):void");
    }

    @Override // W1.m
    void d() {
        V1.e eVarG;
        V1.e eVarG2;
        V1.e eVar = this.f40681b;
        if (eVar.f39484a) {
            this.f40684e.d(eVar.P());
        }
        if (this.f40684e.f40654j) {
            e.b bVar = this.f40683d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarG = this.f40681b.G()) != null && eVarG.y() == e.b.FIXED) || eVarG.y() == bVar2)) {
                b(this.f40687h, eVarG.f39492e.f40687h, this.f40681b.f39459B.c());
                b(this.f40688i, eVarG.f39492e.f40688i, -this.f40681b.f39461D.c());
                return;
            }
        } else {
            e.b bVarY = this.f40681b.y();
            this.f40683d = bVarY;
            if (bVarY != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((eVarG2 = this.f40681b.G()) != null && eVarG2.y() == e.b.FIXED) || eVarG2.y() == bVar3)) {
                    int iP = (eVarG2.P() - this.f40681b.f39459B.c()) - this.f40681b.f39461D.c();
                    b(this.f40687h, eVarG2.f39492e.f40687h, this.f40681b.f39459B.c());
                    b(this.f40688i, eVarG2.f39492e.f40688i, -this.f40681b.f39461D.c());
                    this.f40684e.d(iP);
                    return;
                }
                if (this.f40683d == e.b.FIXED) {
                    this.f40684e.d(this.f40681b.P());
                }
            }
        }
        g gVar = this.f40684e;
        if (gVar.f40654j) {
            V1.e eVar2 = this.f40681b;
            if (eVar2.f39484a) {
                V1.d[] dVarArr = eVar2.f39467J;
                V1.d dVar = dVarArr[0];
                V1.d dVar2 = dVar.f39442d;
                if (dVar2 != null && dVarArr[1].f39442d != null) {
                    if (eVar2.V()) {
                        this.f40687h.f40650f = this.f40681b.f39467J[0].c();
                        this.f40688i.f40650f = -this.f40681b.f39467J[1].c();
                        return;
                    }
                    f fVarH = h(this.f40681b.f39467J[0]);
                    if (fVarH != null) {
                        b(this.f40687h, fVarH, this.f40681b.f39467J[0].c());
                    }
                    f fVarH2 = h(this.f40681b.f39467J[1]);
                    if (fVarH2 != null) {
                        b(this.f40688i, fVarH2, -this.f40681b.f39467J[1].c());
                    }
                    this.f40687h.f40646b = true;
                    this.f40688i.f40646b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f40687h, fVarH3, this.f40681b.f39467J[0].c());
                        b(this.f40688i, this.f40687h, this.f40684e.f40651g);
                        return;
                    }
                    return;
                }
                V1.d dVar3 = dVarArr[1];
                if (dVar3.f39442d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f40688i, fVarH4, -this.f40681b.f39467J[1].c());
                        b(this.f40687h, this.f40688i, -this.f40684e.f40651g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof V1.i) || eVar2.G() == null || this.f40681b.m(d.b.CENTER).f39442d != null) {
                    return;
                }
                b(this.f40687h, this.f40681b.G().f39492e.f40687h, this.f40681b.Q());
                b(this.f40688i, this.f40687h, this.f40684e.f40651g);
                return;
            }
        }
        if (this.f40683d == e.b.MATCH_CONSTRAINT) {
            V1.e eVar3 = this.f40681b;
            int i10 = eVar3.f39506l;
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
            } else if (i10 == 3) {
                if (eVar3.f39508m == 3) {
                    this.f40687h.f40645a = this;
                    this.f40688i.f40645a = this;
                    l lVar = eVar3.f39494f;
                    lVar.f40687h.f40645a = this;
                    lVar.f40688i.f40645a = this;
                    gVar.f40645a = this;
                    if (eVar3.X()) {
                        this.f40684e.f40656l.add(this.f40681b.f39494f.f40684e);
                        this.f40681b.f39494f.f40684e.f40655k.add(this.f40684e);
                        l lVar2 = this.f40681b.f39494f;
                        lVar2.f40684e.f40645a = this;
                        this.f40684e.f40656l.add(lVar2.f40687h);
                        this.f40684e.f40656l.add(this.f40681b.f39494f.f40688i);
                        this.f40681b.f39494f.f40687h.f40655k.add(this.f40684e);
                        this.f40681b.f39494f.f40688i.f40655k.add(this.f40684e);
                    } else if (this.f40681b.V()) {
                        this.f40681b.f39494f.f40684e.f40656l.add(this.f40684e);
                        this.f40684e.f40655k.add(this.f40681b.f39494f.f40684e);
                    } else {
                        this.f40681b.f39494f.f40684e.f40656l.add(this.f40684e);
                    }
                } else {
                    g gVar4 = eVar3.f39494f.f40684e;
                    gVar.f40656l.add(gVar4);
                    gVar4.f40655k.add(this.f40684e);
                    this.f40681b.f39494f.f40687h.f40655k.add(this.f40684e);
                    this.f40681b.f39494f.f40688i.f40655k.add(this.f40684e);
                    g gVar5 = this.f40684e;
                    gVar5.f40646b = true;
                    gVar5.f40655k.add(this.f40687h);
                    this.f40684e.f40655k.add(this.f40688i);
                    this.f40687h.f40656l.add(this.f40684e);
                    this.f40688i.f40656l.add(this.f40684e);
                }
            }
        }
        V1.e eVar4 = this.f40681b;
        V1.d[] dVarArr2 = eVar4.f39467J;
        V1.d dVar4 = dVarArr2[0];
        V1.d dVar5 = dVar4.f39442d;
        if (dVar5 != null && dVarArr2[1].f39442d != null) {
            if (eVar4.V()) {
                this.f40687h.f40650f = this.f40681b.f39467J[0].c();
                this.f40688i.f40650f = -this.f40681b.f39467J[1].c();
                return;
            }
            f fVarH5 = h(this.f40681b.f39467J[0]);
            f fVarH6 = h(this.f40681b.f39467J[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f40689j = m.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f40687h, fVarH7, this.f40681b.f39467J[0].c());
                c(this.f40688i, this.f40687h, 1, this.f40684e);
                return;
            }
            return;
        }
        V1.d dVar6 = dVarArr2[1];
        if (dVar6.f39442d != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f40688i, fVarH8, -this.f40681b.f39467J[1].c());
                c(this.f40687h, this.f40688i, -1, this.f40684e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof V1.i) || eVar4.G() == null) {
            return;
        }
        b(this.f40687h, this.f40681b.G().f39492e.f40687h, this.f40681b.Q());
        c(this.f40688i, this.f40687h, 1, this.f40684e);
    }

    @Override // W1.m
    public void e() {
        f fVar = this.f40687h;
        if (fVar.f40654j) {
            this.f40681b.F0(fVar.f40651g);
        }
    }

    @Override // W1.m
    boolean m() {
        return this.f40683d != e.b.MATCH_CONSTRAINT || this.f40681b.f39506l == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f40681b.r();
    }

    public j(V1.e eVar) {
        super(eVar);
        this.f40687h.f40649e = f.a.LEFT;
        this.f40688i.f40649e = f.a.RIGHT;
        this.f40685f = 0;
    }
}
