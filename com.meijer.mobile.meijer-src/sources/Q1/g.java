package Q1;

import Q1.d;
import Q1.e;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: K0, reason: collision with root package name */
    protected float f27681K0 = -1.0f;

    /* renamed from: L0, reason: collision with root package name */
    protected int f27682L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    protected int f27683M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    protected boolean f27684N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private d f27685O0 = this.f27580O;

    /* renamed from: P0, reason: collision with root package name */
    private int f27686P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f27687Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f27688R0;

    public void d1(int i10) {
        if (i10 > -1) {
            this.f27681K0 = -1.0f;
            this.f27682L0 = i10;
            this.f27683M0 = -1;
        }
    }

    @Override // Q1.e
    public boolean e() {
        return true;
    }

    public void e1(int i10) {
        if (i10 > -1) {
            this.f27681K0 = -1.0f;
            this.f27682L0 = -1;
            this.f27683M0 = i10;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f27689a;

        static {
            int[] iArr = new int[d.b.values().length];
            f27689a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f27689a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f27689a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f27689a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f27689a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f27689a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f27689a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f27689a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f27689a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public d X0() {
        return this.f27685O0;
    }

    public int Y0() {
        return this.f27686P0;
    }

    public int Z0() {
        return this.f27682L0;
    }

    public int a1() {
        return this.f27683M0;
    }

    public float b1() {
        return this.f27681K0;
    }

    @Override // Q1.e
    public boolean c0() {
        return this.f27688R0;
    }

    public void c1(int i10) {
        this.f27685O0.s(i10);
        this.f27688R0 = true;
    }

    @Override // Q1.e
    public boolean d0() {
        return this.f27688R0;
    }

    public void f1(float f10) {
        if (f10 > -1.0f) {
            this.f27681K0 = f10;
            this.f27682L0 = -1;
            this.f27683M0 = -1;
        }
    }

    public void g1(int i10) {
        if (this.f27686P0 == i10) {
            return;
        }
        this.f27686P0 = i10;
        this.f27588W.clear();
        if (this.f27686P0 == 1) {
            this.f27685O0 = this.f27579N;
        } else {
            this.f27685O0 = this.f27580O;
        }
        this.f27588W.add(this.f27685O0);
        int length = this.f27587V.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f27587V[i11] = this.f27685O0;
        }
    }

    @Override // Q1.e
    public d j(d.b bVar) {
        int i10 = a.f27689a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f27686P0 == 1) {
                return this.f27685O0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f27686P0 == 0) {
            return this.f27685O0;
        }
        return null;
    }

    public g() {
        this.f27588W.clear();
        this.f27588W.add(this.f27685O0);
        int length = this.f27587V.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f27587V[i10] = this.f27685O0;
        }
    }

    @Override // Q1.e
    public void W0(M1.d dVar, boolean z10) {
        if (D() == null) {
            return;
        }
        int iX = dVar.x(this.f27685O0);
        if (this.f27686P0 == 1) {
            S0(iX);
            T0(0);
            w0(D().s());
            R0(0);
            return;
        }
        S0(0);
        T0(iX);
        R0(D().M());
        w0(0);
    }

    @Override // Q1.e
    public void d(M1.d dVar, boolean z10) {
        boolean z11;
        f fVar = (f) D();
        if (fVar != null) {
            d dVarJ = fVar.j(d.b.LEFT);
            d dVarJ2 = fVar.j(d.b.RIGHT);
            e eVar = this.f27591Z;
            boolean z12 = true;
            if (eVar != null && eVar.f27590Y[0] == e.b.WRAP_CONTENT) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f27686P0 == 0) {
                dVarJ = fVar.j(d.b.TOP);
                dVarJ2 = fVar.j(d.b.BOTTOM);
                e eVar2 = this.f27591Z;
                if (eVar2 == null || eVar2.f27590Y[1] != e.b.WRAP_CONTENT) {
                    z12 = false;
                }
                z11 = z12;
            }
            if (this.f27688R0 && this.f27685O0.m()) {
                M1.i iVarQ = dVar.q(this.f27685O0);
                dVar.f(iVarQ, this.f27685O0.d());
                if (this.f27682L0 != -1) {
                    if (z11) {
                        dVar.h(dVar.q(dVarJ2), iVarQ, 0, 5);
                    }
                } else if (this.f27683M0 != -1 && z11) {
                    M1.i iVarQ2 = dVar.q(dVarJ2);
                    dVar.h(iVarQ, dVar.q(dVarJ), 0, 5);
                    dVar.h(iVarQ2, iVarQ, 0, 5);
                }
                this.f27688R0 = false;
                return;
            }
            if (this.f27682L0 != -1) {
                M1.i iVarQ3 = dVar.q(this.f27685O0);
                dVar.e(iVarQ3, dVar.q(dVarJ), this.f27682L0, 8);
                if (z11) {
                    dVar.h(dVar.q(dVarJ2), iVarQ3, 0, 5);
                    return;
                }
                return;
            }
            if (this.f27683M0 != -1) {
                M1.i iVarQ4 = dVar.q(this.f27685O0);
                M1.i iVarQ5 = dVar.q(dVarJ2);
                dVar.e(iVarQ4, iVarQ5, -this.f27683M0, 8);
                if (z11) {
                    dVar.h(iVarQ4, dVar.q(dVarJ), 0, 5);
                    dVar.h(iVarQ5, iVarQ4, 0, 5);
                    return;
                }
                return;
            }
            if (this.f27681K0 != -1.0f) {
                dVar.d(M1.d.s(dVar, dVar.q(this.f27685O0), dVar.q(dVarJ2), this.f27681K0));
            }
        }
    }
}
