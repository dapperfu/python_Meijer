package R1;

import Q1.d;
import Q1.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f31633a;

    /* renamed from: b, reason: collision with root package name */
    Q1.e f31634b;

    /* renamed from: c, reason: collision with root package name */
    m f31635c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f31636d;

    /* renamed from: e, reason: collision with root package name */
    g f31637e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f31638f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f31639g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f31640h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f31641i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f31642j = b.NONE;

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    @Override // R1.d
    public void a(d dVar) {
    }

    abstract void d();

    abstract void e();

    abstract void f();

    abstract boolean m();

    protected void o(d dVar) {
    }

    protected void p(d dVar) {
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31643a;

        static {
            int[] iArr = new int[d.b.values().length];
            f31643a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31643a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31643a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31643a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31643a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void l(int i10, int i11) {
        int i12 = this.f31633a;
        if (i12 == 0) {
            this.f31637e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f31637e.d(Math.min(g(this.f31637e.f31601m, i10), i11));
            return;
        }
        if (i12 == 2) {
            Q1.e eVarD = this.f31634b.D();
            if (eVarD != null) {
                if ((i10 == 0 ? eVarD.f29587e : eVarD.f29589f).f31637e.f31589j) {
                    Q1.e eVar = this.f31634b;
                    this.f31637e.d(g((int) ((r9.f31586g * (i10 == 0 ? eVar.f29546B : eVar.f29552E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        Q1.e eVar2 = this.f31634b;
        p pVar = eVar2.f29587e;
        e.b bVar = pVar.f31636d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f31633a == 3) {
            n nVar = eVar2.f29589f;
            if (nVar.f31636d == bVar2 && nVar.f31633a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar2.f29589f;
        }
        if (pVar.f31637e.f31589j) {
            float fQ = eVar2.q();
            this.f31637e.d(i10 == 1 ? (int) ((pVar.f31637e.f31586g / fQ) + 0.5f) : (int) ((fQ * pVar.f31637e.f31586g) + 0.5f));
        }
    }

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f31591l.add(fVar2);
        fVar.f31585f = i10;
        fVar2.f31590k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f31591l.add(fVar2);
        fVar.f31591l.add(this.f31637e);
        fVar.f31587h = i10;
        fVar.f31588i = gVar;
        fVar2.f31590k.add(fVar);
        gVar.f31590k.add(fVar);
    }

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            Q1.e eVar = this.f31634b;
            int i12 = eVar.f29544A;
            int iMax = Math.max(eVar.f29629z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            Q1.e eVar2 = this.f31634b;
            int i13 = eVar2.f29550D;
            int iMax2 = Math.max(eVar2.f29548C, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(Q1.d dVar) {
        Q1.d dVar2 = dVar.f29528f;
        if (dVar2 == null) {
            return null;
        }
        Q1.e eVar = dVar2.f29526d;
        int i10 = a.f31643a[dVar2.f29527e.ordinal()];
        if (i10 == 1) {
            return eVar.f29587e.f31640h;
        }
        if (i10 == 2) {
            return eVar.f29587e.f31641i;
        }
        if (i10 == 3) {
            return eVar.f29589f.f31640h;
        }
        if (i10 == 4) {
            return eVar.f29589f.f31615k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f29589f.f31641i;
    }

    protected final f i(Q1.d dVar, int i10) {
        Q1.d dVar2 = dVar.f29528f;
        if (dVar2 == null) {
            return null;
        }
        Q1.e eVar = dVar2.f29526d;
        p pVar = i10 == 0 ? eVar.f29587e : eVar.f29589f;
        int i11 = a.f31643a[dVar2.f29527e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f31641i;
        }
        return pVar.f31640h;
    }

    public long j() {
        if (this.f31637e.f31589j) {
            return r0.f31586g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f31639g;
    }

    public p(Q1.e eVar) {
        this.f31634b = eVar;
    }

    protected void n(d dVar, Q1.d dVar2, Q1.d dVar3, int i10) {
        float fI;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f31589j && fVarH2.f31589j) {
            int iE = fVarH.f31586g + dVar2.e();
            int iE2 = fVarH2.f31586g - dVar3.e();
            int i11 = iE2 - iE;
            if (!this.f31637e.f31589j && this.f31636d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f31637e;
            if (gVar.f31589j) {
                if (gVar.f31586g == i11) {
                    this.f31640h.d(iE);
                    this.f31641i.d(iE2);
                    return;
                }
                Q1.e eVar = this.f31634b;
                if (i10 == 0) {
                    fI = eVar.t();
                } else {
                    fI = eVar.I();
                }
                if (fVarH == fVarH2) {
                    iE = fVarH.f31586g;
                    iE2 = fVarH2.f31586g;
                    fI = 0.5f;
                }
                this.f31640h.d((int) (iE + 0.5f + (((iE2 - iE) - this.f31637e.f31586g) * fI)));
                this.f31641i.d(this.f31640h.f31586g + this.f31637e.f31586g);
            }
        }
    }
}
