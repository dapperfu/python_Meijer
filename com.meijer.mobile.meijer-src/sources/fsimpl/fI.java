package fsimpl;

/* loaded from: classes15.dex */
public class fI {

    /* renamed from: a, reason: collision with root package name */
    private final float f133462a;

    /* renamed from: b, reason: collision with root package name */
    private int[] f133463b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f133464c;

    /* renamed from: d, reason: collision with root package name */
    private int f133465d;

    /* renamed from: e, reason: collision with root package name */
    private int f133466e;

    /* renamed from: f, reason: collision with root package name */
    private int f133467f;

    /* renamed from: g, reason: collision with root package name */
    private int f133468g;

    /* renamed from: h, reason: collision with root package name */
    private int f133469h;

    public fI(int i10, float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("FillFactor must be in (0, 1)");
        }
        if (i10 <= 0) {
            throw new IllegalArgumentException("Size must be positive!");
        }
        int iA = fJ.a(i10, f10);
        this.f133468g = iA - 1;
        int i11 = iA * 2;
        this.f133469h = i11 - 1;
        this.f133462a = f10;
        this.f133463b = new int[i11];
        this.f133466e = (int) (iA * f10);
    }

    private int c(int i10) {
        int i11;
        int i12;
        int[] iArr = this.f133463b;
        while (true) {
            int i13 = i10 + 2;
            while (true) {
                i11 = i13 & this.f133469h;
                i12 = iArr[i11];
                if (i12 == 0) {
                    iArr[i10] = 0;
                    return i10;
                }
                int iA = (fJ.a(i12) & this.f133468g) << 1;
                if (i10 <= i11) {
                    if (i10 >= iA || iA > i11) {
                        break;
                    }
                    i13 = i11 + 2;
                } else if (i10 < iA || iA <= i11) {
                    i13 = i11 + 2;
                }
            }
            iArr[i10] = i12;
            iArr[i10 + 1] = iArr[i11 + 1];
            i10 = i11;
        }
    }

    private void d(int i10) {
        int i11 = i10 / 2;
        this.f133466e = (int) (i11 * this.f133462a);
        this.f133468g = i11 - 1;
        this.f133469h = i10 - 1;
        int[] iArr = this.f133463b;
        int length = iArr.length;
        this.f133463b = new int[i10];
        this.f133467f = this.f133464c ? 1 : 0;
        for (int i12 = 0; i12 < length; i12 += 2) {
            int i13 = iArr[i12];
            if (i13 != 0) {
                b(i13, iArr[i12 + 1]);
            }
        }
    }

    public int a(int i10) {
        return a(i10, 0);
    }

    public int a(int i10, int i11) {
        int[] iArr;
        int i12;
        int iA = (fJ.a(i10) & this.f133468g) << 1;
        if (i10 == 0) {
            return this.f133464c ? this.f133465d : i11;
        }
        int[] iArr2 = this.f133463b;
        int i13 = iArr2[iA];
        if (i13 == 0) {
            return i11;
        }
        if (i13 == i10) {
            return iArr2[iA + 1];
        }
        do {
            iA = (iA + 2) & this.f133469h;
            iArr = this.f133463b;
            i12 = iArr[iA];
            if (i12 == 0) {
                return i11;
            }
        } while (i12 != i10);
        return iArr[iA + 1];
    }

    public int b(int i10) {
        int i11;
        if (i10 == 0) {
            if (!this.f133464c) {
                return 0;
            }
            this.f133464c = false;
            this.f133467f--;
            return this.f133465d;
        }
        int iA = (fJ.a(i10) & this.f133468g) << 1;
        int[] iArr = this.f133463b;
        int i12 = iArr[iA];
        if (i12 == i10) {
            int i13 = iArr[iA + 1];
            c(iA);
            this.f133467f--;
            return i13;
        }
        if (i12 == 0) {
            return 0;
        }
        do {
            iA = (iA + 2) & this.f133469h;
            int[] iArr2 = this.f133463b;
            i11 = iArr2[iA];
            if (i11 == i10) {
                int i14 = iArr2[iA + 1];
                c(iA);
                this.f133467f--;
                return i14;
            }
        } while (i11 != 0);
        return 0;
    }

    public int b(int i10, int i11) {
        int[] iArr;
        int i12;
        if (i10 == 0) {
            int i13 = this.f133465d;
            if (!this.f133464c) {
                this.f133467f++;
            }
            this.f133464c = true;
            this.f133465d = i11;
            return i13;
        }
        int iA = (fJ.a(i10) & this.f133468g) << 1;
        int[] iArr2 = this.f133463b;
        int i14 = iArr2[iA];
        if (i14 == 0) {
            iArr2[iA] = i10;
            iArr2[iA + 1] = i11;
            int i15 = this.f133467f;
            if (i15 >= this.f133466e) {
                d(iArr2.length * 2);
            } else {
                this.f133467f = i15 + 1;
            }
            return 0;
        }
        if (i14 == i10) {
            int i16 = iA + 1;
            int i17 = iArr2[i16];
            iArr2[i16] = i11;
            return i17;
        }
        do {
            iA = (iA + 2) & this.f133469h;
            iArr = this.f133463b;
            i12 = iArr[iA];
            if (i12 == 0) {
                iArr[iA] = i10;
                iArr[iA + 1] = i11;
                int i18 = this.f133467f;
                if (i18 >= this.f133466e) {
                    d(iArr.length * 2);
                } else {
                    this.f133467f = i18 + 1;
                }
                return 0;
            }
        } while (i12 != i10);
        int i19 = iA + 1;
        int i20 = iArr[i19];
        iArr[i19] = i11;
        return i20;
    }
}
