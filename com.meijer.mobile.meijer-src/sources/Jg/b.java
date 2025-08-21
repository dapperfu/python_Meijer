package Jg;

import com.google.zxing.NotFoundException;
import com.google.zxing.o;

/* loaded from: classes8.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final Ig.b f15714a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15715b;

    /* renamed from: c, reason: collision with root package name */
    private final int f15716c;

    /* renamed from: d, reason: collision with root package name */
    private final int f15717d;

    /* renamed from: e, reason: collision with root package name */
    private final int f15718e;

    /* renamed from: f, reason: collision with root package name */
    private final int f15719f;

    /* renamed from: g, reason: collision with root package name */
    private final int f15720g;

    public b(Ig.b bVar) throws NotFoundException {
        this(bVar, 10, bVar.m() / 2, bVar.j() / 2);
    }

    private boolean b(int i10, int i11, int i12, boolean z10) {
        if (z10) {
            while (i10 <= i11) {
                if (this.f15714a.f(i10, i12)) {
                    return true;
                }
                i10++;
            }
            return false;
        }
        while (i10 <= i11) {
            if (this.f15714a.f(i12, i10)) {
                return true;
            }
            i10++;
        }
        return false;
    }

    public b(Ig.b bVar, int i10, int i11, int i12) throws NotFoundException {
        this.f15714a = bVar;
        int iJ = bVar.j();
        this.f15715b = iJ;
        int iM = bVar.m();
        this.f15716c = iM;
        int i13 = i10 / 2;
        int i14 = i11 - i13;
        this.f15717d = i14;
        int i15 = i11 + i13;
        this.f15718e = i15;
        int i16 = i12 - i13;
        this.f15720g = i16;
        int i17 = i12 + i13;
        this.f15719f = i17;
        if (i16 < 0 || i14 < 0 || i17 >= iJ || i15 >= iM) {
            throw NotFoundException.a();
        }
    }

    public o[] c() throws NotFoundException {
        int i10 = this.f15717d;
        int i11 = this.f15718e;
        int i12 = this.f15720g;
        int i13 = this.f15719f;
        boolean z10 = false;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        boolean z14 = false;
        boolean z15 = true;
        while (z15) {
            boolean z16 = false;
            boolean zB = true;
            while (true) {
                if ((!zB && z11) || i11 >= this.f15716c) {
                    break;
                }
                zB = b(i12, i13, i11, false);
                if (zB) {
                    i11++;
                    z11 = true;
                    z16 = true;
                } else if (!z11) {
                    i11++;
                }
            }
            if (i11 < this.f15716c) {
                boolean zB2 = true;
                while (true) {
                    if ((!zB2 && z12) || i13 >= this.f15715b) {
                        break;
                    }
                    zB2 = b(i10, i11, i13, true);
                    if (zB2) {
                        i13++;
                        z12 = true;
                        z16 = true;
                    } else if (!z12) {
                        i13++;
                    }
                }
                if (i13 < this.f15715b) {
                    boolean zB3 = true;
                    while (true) {
                        if ((!zB3 && z13) || i10 < 0) {
                            break;
                        }
                        zB3 = b(i12, i13, i10, false);
                        if (zB3) {
                            i10--;
                            z13 = true;
                            z16 = true;
                        } else if (!z13) {
                            i10--;
                        }
                    }
                    if (i10 >= 0) {
                        z15 = z16;
                        boolean zB4 = true;
                        while (true) {
                            if ((!zB4 && z14) || i12 < 0) {
                                break;
                            }
                            zB4 = b(i10, i11, i12, true);
                            if (zB4) {
                                i12--;
                                z15 = true;
                                z14 = true;
                            } else if (!z14) {
                                i12--;
                            }
                        }
                        if (i12 < 0) {
                        }
                    }
                }
            }
            z10 = true;
            break;
        }
        if (z10) {
            throw NotFoundException.a();
        }
        int i14 = i11 - i10;
        o oVarD = null;
        o oVarD2 = null;
        for (int i15 = 1; oVarD2 == null && i15 < i14; i15++) {
            oVarD2 = d(i10, i13 - i15, i10 + i15, i13);
        }
        if (oVarD2 == null) {
            throw NotFoundException.a();
        }
        o oVarD3 = null;
        for (int i16 = 1; oVarD3 == null && i16 < i14; i16++) {
            oVarD3 = d(i10, i12 + i16, i10 + i16, i12);
        }
        if (oVarD3 == null) {
            throw NotFoundException.a();
        }
        o oVarD4 = null;
        for (int i17 = 1; oVarD4 == null && i17 < i14; i17++) {
            oVarD4 = d(i11, i12 + i17, i11 - i17, i12);
        }
        if (oVarD4 == null) {
            throw NotFoundException.a();
        }
        for (int i18 = 1; oVarD == null && i18 < i14; i18++) {
            oVarD = d(i11, i13 - i18, i11 - i18, i13);
        }
        if (oVarD != null) {
            return a(oVarD, oVarD2, oVarD4, oVarD3);
        }
        throw NotFoundException.a();
    }

    private o[] a(o oVar, o oVar2, o oVar3, o oVar4) {
        float fC = oVar.c();
        float fD = oVar.d();
        float fC2 = oVar2.c();
        float fD2 = oVar2.d();
        float fC3 = oVar3.c();
        float fD3 = oVar3.d();
        float fC4 = oVar4.c();
        float fD4 = oVar4.d();
        if (fC < this.f15716c / 2.0f) {
            return new o[]{new o(fC4 - 1.0f, fD4 + 1.0f), new o(fC2 + 1.0f, fD2 + 1.0f), new o(fC3 - 1.0f, fD3 - 1.0f), new o(fC + 1.0f, fD - 1.0f)};
        }
        return new o[]{new o(fC4 + 1.0f, fD4 + 1.0f), new o(fC2 + 1.0f, fD2 - 1.0f), new o(fC3 - 1.0f, fD3 + 1.0f), new o(fC - 1.0f, fD - 1.0f)};
    }

    private o d(float f10, float f11, float f12, float f13) {
        int iC = a.c(a.a(f10, f11, f12, f13));
        float f14 = iC;
        float f15 = (f12 - f10) / f14;
        float f16 = (f13 - f11) / f14;
        for (int i10 = 0; i10 < iC; i10++) {
            float f17 = i10;
            int iC2 = a.c((f17 * f15) + f10);
            int iC3 = a.c((f17 * f16) + f11);
            if (this.f15714a.f(iC2, iC3)) {
                return new o(iC2, iC3);
            }
        }
        return null;
    }
}
