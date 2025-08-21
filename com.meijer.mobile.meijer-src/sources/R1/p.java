package R1;

import Q1.d;
import Q1.e;

/* loaded from: classes.dex */
public abstract class p implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f31635a;

    /* renamed from: b, reason: collision with root package name */
    Q1.e f31636b;

    /* renamed from: c, reason: collision with root package name */
    m f31637c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f31638d;

    /* renamed from: e, reason: collision with root package name */
    g f31639e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f31640f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f31641g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f31642h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f31643i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f31644j = b.NONE;

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
        static final /* synthetic */ int[] f31645a;

        static {
            int[] iArr = new int[d.b.values().length];
            f31645a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31645a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31645a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31645a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31645a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void l(int i10, int i11) {
        int i12 = this.f31635a;
        if (i12 == 0) {
            this.f31639e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f31639e.d(Math.min(g(this.f31639e.f31603m, i10), i11));
            return;
        }
        if (i12 == 2) {
            Q1.e eVarD = this.f31636b.D();
            if (eVarD != null) {
                if ((i10 == 0 ? eVarD.f27600e : eVarD.f27602f).f31639e.f31591j) {
                    Q1.e eVar = this.f31636b;
                    this.f31639e.d(g((int) ((r9.f31588g * (i10 == 0 ? eVar.f27559B : eVar.f27565E)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        Q1.e eVar2 = this.f31636b;
        p pVar = eVar2.f27600e;
        e.b bVar = pVar.f31638d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && pVar.f31635a == 3) {
            n nVar = eVar2.f27602f;
            if (nVar.f31638d == bVar2 && nVar.f31635a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            pVar = eVar2.f27602f;
        }
        if (pVar.f31639e.f31591j) {
            float fQ = eVar2.q();
            this.f31639e.d(i10 == 1 ? (int) ((pVar.f31639e.f31588g / fQ) + 0.5f) : (int) ((fQ * pVar.f31639e.f31588g) + 0.5f));
        }
    }

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f31593l.add(fVar2);
        fVar.f31587f = i10;
        fVar2.f31592k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f31593l.add(fVar2);
        fVar.f31593l.add(this.f31639e);
        fVar.f31589h = i10;
        fVar.f31590i = gVar;
        fVar2.f31592k.add(fVar);
        gVar.f31592k.add(fVar);
    }

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            Q1.e eVar = this.f31636b;
            int i12 = eVar.f27557A;
            int iMax = Math.max(eVar.f27642z, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            Q1.e eVar2 = this.f31636b;
            int i13 = eVar2.f27563D;
            int iMax2 = Math.max(eVar2.f27561C, i10);
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
        Q1.d dVar2 = dVar.f27541f;
        if (dVar2 == null) {
            return null;
        }
        Q1.e eVar = dVar2.f27539d;
        int i10 = a.f31645a[dVar2.f27540e.ordinal()];
        if (i10 == 1) {
            return eVar.f27600e.f31642h;
        }
        if (i10 == 2) {
            return eVar.f27600e.f31643i;
        }
        if (i10 == 3) {
            return eVar.f27602f.f31642h;
        }
        if (i10 == 4) {
            return eVar.f27602f.f31617k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f27602f.f31643i;
    }

    protected final f i(Q1.d dVar, int i10) {
        Q1.d dVar2 = dVar.f27541f;
        if (dVar2 == null) {
            return null;
        }
        Q1.e eVar = dVar2.f27539d;
        p pVar = i10 == 0 ? eVar.f27600e : eVar.f27602f;
        int i11 = a.f31645a[dVar2.f27540e.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return pVar.f31643i;
        }
        return pVar.f31642h;
    }

    public long j() {
        if (this.f31639e.f31591j) {
            return r0.f31588g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f31641g;
    }

    public p(Q1.e eVar) {
        this.f31636b = eVar;
    }

    protected void n(d dVar, Q1.d dVar2, Q1.d dVar3, int i10) {
        float fI;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f31591j && fVarH2.f31591j) {
            int iE = fVarH.f31588g + dVar2.e();
            int iE2 = fVarH2.f31588g - dVar3.e();
            int i11 = iE2 - iE;
            if (!this.f31639e.f31591j && this.f31638d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f31639e;
            if (gVar.f31591j) {
                if (gVar.f31588g == i11) {
                    this.f31642h.d(iE);
                    this.f31643i.d(iE2);
                    return;
                }
                Q1.e eVar = this.f31636b;
                if (i10 == 0) {
                    fI = eVar.t();
                } else {
                    fI = eVar.I();
                }
                if (fVarH == fVarH2) {
                    iE = fVarH.f31588g;
                    iE2 = fVarH2.f31588g;
                    fI = 0.5f;
                }
                this.f31642h.d((int) (iE + 0.5f + (((iE2 - iE) - this.f31639e.f31588g) * fI)));
                this.f31643i.d(this.f31642h.f31588g + this.f31639e.f31588g);
            }
        }
    }
}
