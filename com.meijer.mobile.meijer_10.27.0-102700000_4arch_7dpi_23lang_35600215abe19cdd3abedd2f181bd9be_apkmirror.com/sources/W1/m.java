package W1;

import V1.d;
import V1.e;

/* loaded from: classes.dex */
public abstract class m implements d {

    /* renamed from: a, reason: collision with root package name */
    public int f38392a;

    /* renamed from: b, reason: collision with root package name */
    V1.e f38393b;

    /* renamed from: c, reason: collision with root package name */
    k f38394c;

    /* renamed from: d, reason: collision with root package name */
    protected e.b f38395d;

    /* renamed from: e, reason: collision with root package name */
    g f38396e = new g(this);

    /* renamed from: f, reason: collision with root package name */
    public int f38397f = 0;

    /* renamed from: g, reason: collision with root package name */
    boolean f38398g = false;

    /* renamed from: h, reason: collision with root package name */
    public f f38399h = new f(this);

    /* renamed from: i, reason: collision with root package name */
    public f f38400i = new f(this);

    /* renamed from: j, reason: collision with root package name */
    protected b f38401j = b.NONE;

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
        static final /* synthetic */ int[] f38402a;

        static {
            int[] iArr = new int[d.b.values().length];
            f38402a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38402a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f38402a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f38402a[d.b.BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f38402a[d.b.BOTTOM.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    private void l(int i10, int i11) {
        int i12 = this.f38392a;
        if (i12 == 0) {
            this.f38396e.d(g(i11, i10));
            return;
        }
        if (i12 == 1) {
            this.f38396e.d(Math.min(g(this.f38396e.f38378m, i10), i11));
            return;
        }
        if (i12 == 2) {
            V1.e eVarG = this.f38393b.G();
            if (eVarG != null) {
                if ((i10 == 0 ? eVarG.f36632e : eVarG.f36634f).f38396e.f38366j) {
                    V1.e eVar = this.f38393b;
                    this.f38396e.d(g((int) ((r9.f38363g * (i10 == 0 ? eVar.f36656q : eVar.f36662t)) + 0.5f), i10));
                    return;
                }
                return;
            }
            return;
        }
        if (i12 != 3) {
            return;
        }
        V1.e eVar2 = this.f38393b;
        m mVar = eVar2.f36632e;
        e.b bVar = mVar.f38395d;
        e.b bVar2 = e.b.MATCH_CONSTRAINT;
        if (bVar == bVar2 && mVar.f38392a == 3) {
            l lVar = eVar2.f36634f;
            if (lVar.f38395d == bVar2 && lVar.f38392a == 3) {
                return;
            }
        }
        if (i10 == 0) {
            mVar = eVar2.f36634f;
        }
        if (mVar.f38396e.f38366j) {
            float fT = eVar2.t();
            this.f38396e.d(i10 == 1 ? (int) ((mVar.f38396e.f38363g / fT) + 0.5f) : (int) ((fT * mVar.f38396e.f38363g) + 0.5f));
        }
    }

    protected final void b(f fVar, f fVar2, int i10) {
        fVar.f38368l.add(fVar2);
        fVar.f38362f = i10;
        fVar2.f38367k.add(fVar);
    }

    protected final void c(f fVar, f fVar2, int i10, g gVar) {
        fVar.f38368l.add(fVar2);
        fVar.f38368l.add(this.f38396e);
        fVar.f38364h = i10;
        fVar.f38365i = gVar;
        fVar2.f38367k.add(fVar);
        gVar.f38367k.add(fVar);
    }

    protected final int g(int i10, int i11) {
        if (i11 == 0) {
            V1.e eVar = this.f38393b;
            int i12 = eVar.f36654p;
            int iMax = Math.max(eVar.f36652o, i10);
            if (i12 > 0) {
                iMax = Math.min(i12, i10);
            }
            if (iMax != i10) {
                return iMax;
            }
        } else {
            V1.e eVar2 = this.f38393b;
            int i13 = eVar2.f36660s;
            int iMax2 = Math.max(eVar2.f36658r, i10);
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
        V1.d dVar2 = dVar.f36582d;
        if (dVar2 == null) {
            return null;
        }
        V1.e eVar = dVar2.f36580b;
        int i10 = a.f38402a[dVar2.f36581c.ordinal()];
        if (i10 == 1) {
            return eVar.f36632e.f38399h;
        }
        if (i10 == 2) {
            return eVar.f36632e.f38400i;
        }
        if (i10 == 3) {
            return eVar.f36634f.f38399h;
        }
        if (i10 == 4) {
            return eVar.f36634f.f38389k;
        }
        if (i10 != 5) {
            return null;
        }
        return eVar.f36634f.f38400i;
    }

    protected final f i(V1.d dVar, int i10) {
        V1.d dVar2 = dVar.f36582d;
        if (dVar2 == null) {
            return null;
        }
        V1.e eVar = dVar2.f36580b;
        m mVar = i10 == 0 ? eVar.f36632e : eVar.f36634f;
        int i11 = a.f38402a[dVar2.f36581c.ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 5) {
                        return null;
                    }
                }
            }
            return mVar.f38400i;
        }
        return mVar.f38399h;
    }

    public long j() {
        if (this.f38396e.f38366j) {
            return r0.f38363g;
        }
        return 0L;
    }

    public boolean k() {
        return this.f38398g;
    }

    public m(V1.e eVar) {
        this.f38393b = eVar;
    }

    protected void n(d dVar, V1.d dVar2, V1.d dVar3, int i10) {
        float fK;
        f fVarH = h(dVar2);
        f fVarH2 = h(dVar3);
        if (fVarH.f38366j && fVarH2.f38366j) {
            int iC = fVarH.f38363g + dVar2.c();
            int iC2 = fVarH2.f38363g - dVar3.c();
            int i11 = iC2 - iC;
            if (!this.f38396e.f38366j && this.f38395d == e.b.MATCH_CONSTRAINT) {
                l(i10, i11);
            }
            g gVar = this.f38396e;
            if (gVar.f38366j) {
                if (gVar.f38363g == i11) {
                    this.f38399h.d(iC);
                    this.f38400i.d(iC2);
                    return;
                }
                V1.e eVar = this.f38393b;
                if (i10 == 0) {
                    fK = eVar.w();
                } else {
                    fK = eVar.K();
                }
                if (fVarH == fVarH2) {
                    iC = fVarH.f38363g;
                    iC2 = fVarH2.f38363g;
                    fK = 0.5f;
                }
                this.f38399h.d((int) (iC + 0.5f + (((iC2 - iC) - this.f38396e.f38363g) * fK)));
                this.f38400i.d(this.f38399h.f38363g + this.f38396e.f38363g);
            }
        }
    }
}
