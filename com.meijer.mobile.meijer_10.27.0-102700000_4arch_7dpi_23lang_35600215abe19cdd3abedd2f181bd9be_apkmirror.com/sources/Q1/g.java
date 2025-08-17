package Q1;

import Q1.d;
import Q1.e;

/* loaded from: classes.dex */
public class g extends e {

    /* renamed from: K0, reason: collision with root package name */
    protected float f29668K0 = -1.0f;

    /* renamed from: L0, reason: collision with root package name */
    protected int f29669L0 = -1;

    /* renamed from: M0, reason: collision with root package name */
    protected int f29670M0 = -1;

    /* renamed from: N0, reason: collision with root package name */
    protected boolean f29671N0 = true;

    /* renamed from: O0, reason: collision with root package name */
    private d f29672O0 = this.f29567O;

    /* renamed from: P0, reason: collision with root package name */
    private int f29673P0 = 0;

    /* renamed from: Q0, reason: collision with root package name */
    private int f29674Q0 = 0;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f29675R0;

    public void d1(int i10) {
        if (i10 > -1) {
            this.f29668K0 = -1.0f;
            this.f29669L0 = i10;
            this.f29670M0 = -1;
        }
    }

    @Override // Q1.e
    public boolean e() {
        return true;
    }

    public void e1(int i10) {
        if (i10 > -1) {
            this.f29668K0 = -1.0f;
            this.f29669L0 = -1;
            this.f29670M0 = i10;
        }
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f29676a;

        static {
            int[] iArr = new int[d.b.values().length];
            f29676a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f29676a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f29676a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f29676a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f29676a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f29676a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f29676a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f29676a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f29676a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public d X0() {
        return this.f29672O0;
    }

    public int Y0() {
        return this.f29673P0;
    }

    public int Z0() {
        return this.f29669L0;
    }

    public int a1() {
        return this.f29670M0;
    }

    public float b1() {
        return this.f29668K0;
    }

    @Override // Q1.e
    public boolean c0() {
        return this.f29675R0;
    }

    public void c1(int i10) {
        this.f29672O0.s(i10);
        this.f29675R0 = true;
    }

    @Override // Q1.e
    public boolean d0() {
        return this.f29675R0;
    }

    public void f1(float f10) {
        if (f10 > -1.0f) {
            this.f29668K0 = f10;
            this.f29669L0 = -1;
            this.f29670M0 = -1;
        }
    }

    public void g1(int i10) {
        if (this.f29673P0 == i10) {
            return;
        }
        this.f29673P0 = i10;
        this.f29575W.clear();
        if (this.f29673P0 == 1) {
            this.f29672O0 = this.f29566N;
        } else {
            this.f29672O0 = this.f29567O;
        }
        this.f29575W.add(this.f29672O0);
        int length = this.f29574V.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f29574V[i11] = this.f29672O0;
        }
    }

    @Override // Q1.e
    public d j(d.b bVar) {
        int i10 = a.f29676a[bVar.ordinal()];
        if (i10 == 1 || i10 == 2) {
            if (this.f29673P0 == 1) {
                return this.f29672O0;
            }
            return null;
        }
        if ((i10 == 3 || i10 == 4) && this.f29673P0 == 0) {
            return this.f29672O0;
        }
        return null;
    }

    public g() {
        this.f29575W.clear();
        this.f29575W.add(this.f29672O0);
        int length = this.f29574V.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f29574V[i10] = this.f29672O0;
        }
    }

    @Override // Q1.e
    public void W0(M1.d dVar, boolean z10) {
        if (D() == null) {
            return;
        }
        int iX = dVar.x(this.f29672O0);
        if (this.f29673P0 == 1) {
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
            e eVar = this.f29578Z;
            boolean z12 = true;
            if (eVar != null && eVar.f29577Y[0] == e.b.WRAP_CONTENT) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (this.f29673P0 == 0) {
                dVarJ = fVar.j(d.b.TOP);
                dVarJ2 = fVar.j(d.b.BOTTOM);
                e eVar2 = this.f29578Z;
                if (eVar2 == null || eVar2.f29577Y[1] != e.b.WRAP_CONTENT) {
                    z12 = false;
                }
                z11 = z12;
            }
            if (this.f29675R0 && this.f29672O0.m()) {
                M1.i iVarQ = dVar.q(this.f29672O0);
                dVar.f(iVarQ, this.f29672O0.d());
                if (this.f29669L0 != -1) {
                    if (z11) {
                        dVar.h(dVar.q(dVarJ2), iVarQ, 0, 5);
                    }
                } else if (this.f29670M0 != -1 && z11) {
                    M1.i iVarQ2 = dVar.q(dVarJ2);
                    dVar.h(iVarQ, dVar.q(dVarJ), 0, 5);
                    dVar.h(iVarQ2, iVarQ, 0, 5);
                }
                this.f29675R0 = false;
                return;
            }
            if (this.f29669L0 != -1) {
                M1.i iVarQ3 = dVar.q(this.f29672O0);
                dVar.e(iVarQ3, dVar.q(dVarJ), this.f29669L0, 8);
                if (z11) {
                    dVar.h(dVar.q(dVarJ2), iVarQ3, 0, 5);
                    return;
                }
                return;
            }
            if (this.f29670M0 != -1) {
                M1.i iVarQ4 = dVar.q(this.f29672O0);
                M1.i iVarQ5 = dVar.q(dVarJ2);
                dVar.e(iVarQ4, iVarQ5, -this.f29670M0, 8);
                if (z11) {
                    dVar.h(iVarQ4, dVar.q(dVarJ), 0, 5);
                    dVar.h(iVarQ5, iVarQ4, 0, 5);
                    return;
                }
                return;
            }
            if (this.f29668K0 != -1.0f) {
                dVar.d(M1.d.s(dVar, dVar.q(this.f29672O0), dVar.q(dVarJ2), this.f29668K0));
            }
        }
    }
}
