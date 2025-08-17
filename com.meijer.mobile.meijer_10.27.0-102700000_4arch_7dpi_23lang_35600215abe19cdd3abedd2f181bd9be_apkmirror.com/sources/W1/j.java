package W1;

import V1.d;
import V1.e;
import W1.f;
import W1.m;

/* loaded from: classes.dex */
public class j extends m {

    /* renamed from: k, reason: collision with root package name */
    private static int[] f38379k = new int[2];

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
        this.f38394c = null;
        this.f38399h.c();
        this.f38400i.c();
        this.f38396e.c();
        this.f38398g = false;
    }

    void r() {
        this.f38398g = false;
        this.f38399h.c();
        this.f38399h.f38366j = false;
        this.f38400i.c();
        this.f38400i.f38366j = false;
        this.f38396e.f38366j = false;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38380a;

        static {
            int[] iArr = new int[m.b.values().length];
            f38380a = iArr;
            try {
                iArr[m.b.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38380a[m.b.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38380a[m.b.CENTER.ordinal()] = 3;
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
        V1.e eVar = this.f38393b;
        if (eVar.f36624a) {
            this.f38396e.d(eVar.P());
        }
        if (this.f38396e.f38366j) {
            e.b bVar = this.f38395d;
            e.b bVar2 = e.b.MATCH_PARENT;
            if (bVar == bVar2 && (((eVarG = this.f38393b.G()) != null && eVarG.y() == e.b.FIXED) || eVarG.y() == bVar2)) {
                b(this.f38399h, eVarG.f36632e.f38399h, this.f38393b.f36599B.c());
                b(this.f38400i, eVarG.f36632e.f38400i, -this.f38393b.f36601D.c());
                return;
            }
        } else {
            e.b bVarY = this.f38393b.y();
            this.f38395d = bVarY;
            if (bVarY != e.b.MATCH_CONSTRAINT) {
                e.b bVar3 = e.b.MATCH_PARENT;
                if (bVarY == bVar3 && (((eVarG2 = this.f38393b.G()) != null && eVarG2.y() == e.b.FIXED) || eVarG2.y() == bVar3)) {
                    int iP = (eVarG2.P() - this.f38393b.f36599B.c()) - this.f38393b.f36601D.c();
                    b(this.f38399h, eVarG2.f36632e.f38399h, this.f38393b.f36599B.c());
                    b(this.f38400i, eVarG2.f36632e.f38400i, -this.f38393b.f36601D.c());
                    this.f38396e.d(iP);
                    return;
                }
                if (this.f38395d == e.b.FIXED) {
                    this.f38396e.d(this.f38393b.P());
                }
            }
        }
        g gVar = this.f38396e;
        if (gVar.f38366j) {
            V1.e eVar2 = this.f38393b;
            if (eVar2.f36624a) {
                V1.d[] dVarArr = eVar2.f36607J;
                V1.d dVar = dVarArr[0];
                V1.d dVar2 = dVar.f36582d;
                if (dVar2 != null && dVarArr[1].f36582d != null) {
                    if (eVar2.V()) {
                        this.f38399h.f38362f = this.f38393b.f36607J[0].c();
                        this.f38400i.f38362f = -this.f38393b.f36607J[1].c();
                        return;
                    }
                    f fVarH = h(this.f38393b.f36607J[0]);
                    if (fVarH != null) {
                        b(this.f38399h, fVarH, this.f38393b.f36607J[0].c());
                    }
                    f fVarH2 = h(this.f38393b.f36607J[1]);
                    if (fVarH2 != null) {
                        b(this.f38400i, fVarH2, -this.f38393b.f36607J[1].c());
                    }
                    this.f38399h.f38358b = true;
                    this.f38400i.f38358b = true;
                    return;
                }
                if (dVar2 != null) {
                    f fVarH3 = h(dVar);
                    if (fVarH3 != null) {
                        b(this.f38399h, fVarH3, this.f38393b.f36607J[0].c());
                        b(this.f38400i, this.f38399h, this.f38396e.f38363g);
                        return;
                    }
                    return;
                }
                V1.d dVar3 = dVarArr[1];
                if (dVar3.f36582d != null) {
                    f fVarH4 = h(dVar3);
                    if (fVarH4 != null) {
                        b(this.f38400i, fVarH4, -this.f38393b.f36607J[1].c());
                        b(this.f38399h, this.f38400i, -this.f38396e.f38363g);
                        return;
                    }
                    return;
                }
                if ((eVar2 instanceof V1.i) || eVar2.G() == null || this.f38393b.m(d.b.CENTER).f36582d != null) {
                    return;
                }
                b(this.f38399h, this.f38393b.G().f36632e.f38399h, this.f38393b.Q());
                b(this.f38400i, this.f38399h, this.f38396e.f38363g);
                return;
            }
        }
        if (this.f38395d == e.b.MATCH_CONSTRAINT) {
            V1.e eVar3 = this.f38393b;
            int i10 = eVar3.f36646l;
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
            } else if (i10 == 3) {
                if (eVar3.f36648m == 3) {
                    this.f38399h.f38357a = this;
                    this.f38400i.f38357a = this;
                    l lVar = eVar3.f36634f;
                    lVar.f38399h.f38357a = this;
                    lVar.f38400i.f38357a = this;
                    gVar.f38357a = this;
                    if (eVar3.X()) {
                        this.f38396e.f38368l.add(this.f38393b.f36634f.f38396e);
                        this.f38393b.f36634f.f38396e.f38367k.add(this.f38396e);
                        l lVar2 = this.f38393b.f36634f;
                        lVar2.f38396e.f38357a = this;
                        this.f38396e.f38368l.add(lVar2.f38399h);
                        this.f38396e.f38368l.add(this.f38393b.f36634f.f38400i);
                        this.f38393b.f36634f.f38399h.f38367k.add(this.f38396e);
                        this.f38393b.f36634f.f38400i.f38367k.add(this.f38396e);
                    } else if (this.f38393b.V()) {
                        this.f38393b.f36634f.f38396e.f38368l.add(this.f38396e);
                        this.f38396e.f38367k.add(this.f38393b.f36634f.f38396e);
                    } else {
                        this.f38393b.f36634f.f38396e.f38368l.add(this.f38396e);
                    }
                } else {
                    g gVar4 = eVar3.f36634f.f38396e;
                    gVar.f38368l.add(gVar4);
                    gVar4.f38367k.add(this.f38396e);
                    this.f38393b.f36634f.f38399h.f38367k.add(this.f38396e);
                    this.f38393b.f36634f.f38400i.f38367k.add(this.f38396e);
                    g gVar5 = this.f38396e;
                    gVar5.f38358b = true;
                    gVar5.f38367k.add(this.f38399h);
                    this.f38396e.f38367k.add(this.f38400i);
                    this.f38399h.f38368l.add(this.f38396e);
                    this.f38400i.f38368l.add(this.f38396e);
                }
            }
        }
        V1.e eVar4 = this.f38393b;
        V1.d[] dVarArr2 = eVar4.f36607J;
        V1.d dVar4 = dVarArr2[0];
        V1.d dVar5 = dVar4.f36582d;
        if (dVar5 != null && dVarArr2[1].f36582d != null) {
            if (eVar4.V()) {
                this.f38399h.f38362f = this.f38393b.f36607J[0].c();
                this.f38400i.f38362f = -this.f38393b.f36607J[1].c();
                return;
            }
            f fVarH5 = h(this.f38393b.f36607J[0]);
            f fVarH6 = h(this.f38393b.f36607J[1]);
            fVarH5.b(this);
            fVarH6.b(this);
            this.f38401j = m.b.CENTER;
            return;
        }
        if (dVar5 != null) {
            f fVarH7 = h(dVar4);
            if (fVarH7 != null) {
                b(this.f38399h, fVarH7, this.f38393b.f36607J[0].c());
                c(this.f38400i, this.f38399h, 1, this.f38396e);
                return;
            }
            return;
        }
        V1.d dVar6 = dVarArr2[1];
        if (dVar6.f36582d != null) {
            f fVarH8 = h(dVar6);
            if (fVarH8 != null) {
                b(this.f38400i, fVarH8, -this.f38393b.f36607J[1].c());
                c(this.f38399h, this.f38400i, -1, this.f38396e);
                return;
            }
            return;
        }
        if ((eVar4 instanceof V1.i) || eVar4.G() == null) {
            return;
        }
        b(this.f38399h, this.f38393b.G().f36632e.f38399h, this.f38393b.Q());
        c(this.f38400i, this.f38399h, 1, this.f38396e);
    }

    @Override // W1.m
    public void e() {
        f fVar = this.f38399h;
        if (fVar.f38366j) {
            this.f38393b.F0(fVar.f38363g);
        }
    }

    @Override // W1.m
    boolean m() {
        return this.f38395d != e.b.MATCH_CONSTRAINT || this.f38393b.f36646l == 0;
    }

    public String toString() {
        return "HorizontalRun " + this.f38393b.r();
    }

    public j(V1.e eVar) {
        super(eVar);
        this.f38399h.f38361e = f.a.LEFT;
        this.f38400i.f38361e = f.a.RIGHT;
        this.f38397f = 0;
    }
}
