package V1;

import V1.d;
import V1.e;

/* loaded from: classes.dex */
public class h extends e {

    /* renamed from: w0, reason: collision with root package name */
    protected float f39606w0 = -1.0f;

    /* renamed from: x0, reason: collision with root package name */
    protected int f39607x0 = -1;

    /* renamed from: y0, reason: collision with root package name */
    protected int f39608y0 = -1;

    /* renamed from: z0, reason: collision with root package name */
    private d f39609z0 = this.f39460C;

    /* renamed from: A0, reason: collision with root package name */
    private int f39604A0 = 0;

    /* renamed from: B0, reason: collision with root package name */
    private int f39605B0 = 0;

    public void O0(int i10) {
        if (i10 > -1) {
            this.f39606w0 = -1.0f;
            this.f39607x0 = i10;
            this.f39608y0 = -1;
        }
    }

    public void P0(int i10) {
        if (i10 > -1) {
            this.f39606w0 = -1.0f;
            this.f39607x0 = -1;
            this.f39608y0 = i10;
        }
    }

    @Override // V1.e
    public boolean g() {
        return true;
    }

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f39610a;

        static {
            int[] iArr = new int[d.b.values().length];
            f39610a = iArr;
            try {
                iArr[d.b.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f39610a[d.b.RIGHT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f39610a[d.b.TOP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f39610a[d.b.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f39610a[d.b.BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f39610a[d.b.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f39610a[d.b.CENTER_X.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f39610a[d.b.CENTER_Y.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f39610a[d.b.NONE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public int K0() {
        return this.f39604A0;
    }

    public int L0() {
        return this.f39607x0;
    }

    public int M0() {
        return this.f39608y0;
    }

    public float N0() {
        return this.f39606w0;
    }

    public void Q0(float f10) {
        if (f10 > -1.0f) {
            this.f39606w0 = f10;
            this.f39607x0 = -1;
            this.f39608y0 = -1;
        }
    }

    public void R0(int i10) {
        if (this.f39604A0 == i10) {
            return;
        }
        this.f39604A0 = i10;
        this.f39468K.clear();
        if (this.f39604A0 == 1) {
            this.f39609z0 = this.f39459B;
        } else {
            this.f39609z0 = this.f39460C;
        }
        this.f39468K.add(this.f39609z0);
        int length = this.f39467J.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f39467J[i11] = this.f39609z0;
        }
    }

    @Override // V1.e
    public d m(d.b bVar) {
        switch (a.f39610a[bVar.ordinal()]) {
            case 1:
            case 2:
                if (this.f39604A0 == 1) {
                    return this.f39609z0;
                }
                break;
            case 3:
            case 4:
                if (this.f39604A0 == 0) {
                    return this.f39609z0;
                }
                break;
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return null;
        }
        throw new AssertionError(bVar.name());
    }

    public h() {
        this.f39468K.clear();
        this.f39468K.add(this.f39609z0);
        int length = this.f39467J.length;
        for (int i10 = 0; i10 < length; i10++) {
            this.f39467J[i10] = this.f39609z0;
        }
    }

    @Override // V1.e
    public void J0(U1.d dVar) {
        if (G() == null) {
            return;
        }
        int iX = dVar.x(this.f39609z0);
        if (this.f39604A0 == 1) {
            F0(iX);
            G0(0);
            h0(G().v());
            E0(0);
            return;
        }
        F0(0);
        G0(iX);
        E0(G().P());
        h0(0);
    }

    @Override // V1.e
    public void f(U1.d dVar) {
        boolean z10;
        f fVar = (f) G();
        if (fVar != null) {
            d dVarM = fVar.m(d.b.LEFT);
            d dVarM2 = fVar.m(d.b.RIGHT);
            e eVar = this.f39471N;
            boolean z11 = true;
            if (eVar != null && eVar.f39470M[0] == e.b.WRAP_CONTENT) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (this.f39604A0 == 0) {
                dVarM = fVar.m(d.b.TOP);
                dVarM2 = fVar.m(d.b.BOTTOM);
                e eVar2 = this.f39471N;
                if (eVar2 == null || eVar2.f39470M[1] != e.b.WRAP_CONTENT) {
                    z11 = false;
                }
                z10 = z11;
            }
            if (this.f39607x0 != -1) {
                U1.i iVarQ = dVar.q(this.f39609z0);
                dVar.e(iVarQ, dVar.q(dVarM), this.f39607x0, 8);
                if (z10) {
                    dVar.h(dVar.q(dVarM2), iVarQ, 0, 5);
                    return;
                }
                return;
            }
            if (this.f39608y0 != -1) {
                U1.i iVarQ2 = dVar.q(this.f39609z0);
                U1.i iVarQ3 = dVar.q(dVarM2);
                dVar.e(iVarQ2, iVarQ3, -this.f39608y0, 8);
                if (z10) {
                    dVar.h(iVarQ2, dVar.q(dVarM), 0, 5);
                    dVar.h(iVarQ3, iVarQ2, 0, 5);
                    return;
                }
                return;
            }
            if (this.f39606w0 != -1.0f) {
                dVar.d(U1.d.s(dVar, dVar.q(this.f39609z0), dVar.q(dVarM2), this.f39606w0));
            }
        }
    }
}
