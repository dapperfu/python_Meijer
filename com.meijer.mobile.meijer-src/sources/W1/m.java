package W1;

import V1.d;
import V1.e;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f40680a;

    /* renamed from: b, reason: collision with root package name */
    V1.e f40681b;

    /* renamed from: c, reason: collision with root package name */
    k f40682c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f40683d;

    /* renamed from: e, reason: collision with root package name */
    g f40684e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f40685f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f40686g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f40687h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f40688i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f40689j = b.NONE;

    enum b {
        NONE,
        START,
        END,
        CENTER
    }

    @Override // W1.d
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
        static final /* synthetic */ int[] f40690a;

        static {
            int[] iArr = new int[d.b.values().length];
            f40690a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f40690a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f40690a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f40690a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f40690a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void l(int i10, int i11) {
        int i12 = this.f40680a;
        if (i12 == 0) {
            this.f40684e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f40684e.d(Math.min(g(this.f40684e.f40666m, i10), i11));
            return;
        }
        if (i12 == 2) {
            V1.e eVarG = this.f40681b.G();
            if (eVarG != null) {
                if ((i10 == 0 ? eVarG.f39492e : eVarG.f39494f).f40684e.f40654j) {
                    V1.e eVar = this.f40681b;
                    this.f40684e.d(g((int) ((r9.f40651g * (i10 == 0 ? eVar.f39516q : eVar.f39522t)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        V1.e eVar2 = this.f40681b;
        m mVar = eVar2.f39492e;
        e.b bVar = mVar.f40683d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f40680a == 3) {
            l lVar = eVar2.f39494f;
            if (lVar.f40683d == bVar2 && lVar.f40680a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            mVar = eVar2.f39494f;
        }
        if (mVar.f40684e.f40654j) {
            float fT = eVar2.t();
            this.f40684e.d(i10 == 1 ? (int) ((mVar.f40684e.f40651g / fT) + 0.5f) : (int) ((fT * mVar.f40684e.f40651g) + 0.5f));
        }
    }

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f40656l.add(fVar2);
        fVar.f40650f = i10;
        fVar2.f40655k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f40656l.add(fVar2);
        fVar.f40656l.add(this.f40684e);
        fVar.f40652h = i10;
        fVar.f40653i = gVar;
        fVar2.f40655k.add(fVar);
        gVar.f40655k.add(fVar);
    }

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            V1.e eVar = this.f40681b;
            int i12 = eVar.f39514p;
            int iMax = Math.max(eVar.f39512o, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            V1.e eVar2 = this.f40681b;
            int i13 = eVar2.f39520s;
            int iMax2 = Math.max(eVar2.f39518r, i10);
            if (i13 > 0) {
                iMax2 = Math.min(i13, i10);
            }
            if (iMax2 != i10) {
                return iMax2;
            }
        }
        return i10;
    }

    protected final f h(V1.d dVar) {
        V1.d dVar2 = dVar.f39442d;
        if (dVar2 == null) {
            return null;
        }
        V1.e eVar = dVar2.f39440b;
        int i10 = a.f40690a[dVar2.f39441c.ordinal()];
        if (i10 == 1) {
            return eVar.f39492e.f40687h;
        }
        if (i10 == 2) {
            return eVar.f39492e.f40688i;
        }
        if (i10 == 3) {
            return eVar.f39494f.f40687h;
        }
        if (i10 == 4) {
            return eVar.f39494f.f40677k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f39494f.f40688i;
    }

    protected final f i(V1.d dVar, int i10) {
        V1.d dVar2 = dVar.f39442d;
        if (dVar2 == null) {
            return null;
        }
        V1.e eVar = dVar2.f39440b;
        m mVar = i10 == 0 ? eVar.f39492e : eVar.f39494f;
        int i11 = a.f40690a[dVar2.f39441c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f40688i;
        }
        return mVar.f40687h;
    }

    public long j() {
        if (this.f40684e.f40654j) {
            return r0.f40651g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f40686g;
    }

    public m(V1.e eVar) {
        this.f40681b = eVar;
    }

    protected void n(d dVar, V1.d dVar2, V1.d dVar3, int i10) {
        float fK;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f40654j && fVarH2.f40654j) {
            int iC = fVarH.f40651g + dVar2.c();
            int iC2 = fVarH2.f40651g - dVar3.c();
            int i11 = iC2 - iC;
            if (!this.f40684e.f40654j && this.f40683d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f40684e;
            if (gVar.f40654j) {
                if (gVar.f40651g == i11) {
                    this.f40687h.d(iC);
                    this.f40688i.d(iC2);
                    return;
                }
                V1.e eVar = this.f40681b;
                if (i10 == 0) {
                    fK = eVar.w();
                } else {
                    fK = eVar.K();
                }
                if (fVarH == fVarH2) {
                    iC = fVarH.f40651g;
                    iC2 = fVarH2.f40651g;
                    fK = 0.5f;
                }
                this.f40687h.d((int) (iC + 0.5f + (((iC2 - iC) - this.f40684e.f40651g) * fK)));
                this.f40688i.d(this.f40687h.f40651g + this.f40684e.f40651g);
            }
        }
    }
}
