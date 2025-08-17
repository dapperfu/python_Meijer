package M1;

import M1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f18802l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f18804b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f18805c;

    /* renamed from: a, reason: collision with root package name */
    int f18803a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f18806d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f18807e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f18808f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f18809g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f18810h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f18811i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f18812j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f18813k = false;

    @Override // M1.b.a
    public final void j(i iVar, float f10) {
        if (f10 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i10 = this.f18811i;
        if (i10 == -1) {
            this.f18811i = 0;
            this.f18810h[0] = f10;
            this.f18808f[0] = iVar.f18865c;
            this.f18809g[0] = -1;
            iVar.f18875m++;
            iVar.a(this.f18804b);
            this.f18803a++;
            if (this.f18813k) {
                return;
            }
            int i11 = this.f18812j + 1;
            this.f18812j = i11;
            int[] iArr = this.f18808f;
            if (i11 >= iArr.length) {
                this.f18813k = true;
                this.f18812j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f18803a; i13++) {
            int i14 = this.f18808f[i10];
            int i15 = iVar.f18865c;
            if (i14 == i15) {
                this.f18810h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f18809g[i10];
        }
        int length = this.f18812j;
        int i16 = length + 1;
        if (this.f18813k) {
            int[] iArr2 = this.f18808f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f18808f;
        if (length >= iArr3.length && this.f18803a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f18808f;
                if (i17 >= iArr4.length) {
                    break;
                }
                if (iArr4[i17] == -1) {
                    length = i17;
                    break;
                }
                i17++;
            }
        }
        int[] iArr5 = this.f18808f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f18806d * 2;
            this.f18806d = i18;
            this.f18813k = false;
            this.f18812j = length - 1;
            this.f18810h = Arrays.copyOf(this.f18810h, i18);
            this.f18808f = Arrays.copyOf(this.f18808f, this.f18806d);
            this.f18809g = Arrays.copyOf(this.f18809g, this.f18806d);
        }
        this.f18808f[length] = iVar.f18865c;
        this.f18810h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f18809g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f18809g[length] = this.f18811i;
            this.f18811i = length;
        }
        iVar.f18875m++;
        iVar.a(this.f18804b);
        int i19 = this.f18803a + 1;
        this.f18803a = i19;
        if (!this.f18813k) {
            this.f18812j++;
        }
        int[] iArr7 = this.f18808f;
        if (i19 >= iArr7.length) {
            this.f18813k = true;
        }
        if (this.f18812j >= iArr7.length) {
            this.f18813k = true;
            this.f18812j = iArr7.length - 1;
        }
    }

    @Override // M1.b.a
    public i a(int i10) {
        int i11 = this.f18811i;
        for (int i12 = 0; i11 != -1 && i12 < this.f18803a; i12++) {
            if (i12 == i10) {
                return this.f18805c.f18823d[this.f18808f[i11]];
            }
            i11 = this.f18809g[i11];
        }
        return null;
    }

    @Override // M1.b.a
    public void b() {
        int i10 = this.f18811i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18803a; i11++) {
            float[] fArr = this.f18810h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f18809g[i10];
        }
    }

    @Override // M1.b.a
    public int c() {
        return this.f18803a;
    }

    @Override // M1.b.a
    public final void clear() {
        int i10 = this.f18811i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18803a; i11++) {
            i iVar = this.f18805c.f18823d[this.f18808f[i10]];
            if (iVar != null) {
                iVar.l(this.f18804b);
            }
            i10 = this.f18809g[i10];
        }
        this.f18811i = -1;
        this.f18812j = -1;
        this.f18813k = false;
        this.f18803a = 0;
    }

    @Override // M1.b.a
    public float d(int i10) {
        int i11 = this.f18811i;
        for (int i12 = 0; i11 != -1 && i12 < this.f18803a; i12++) {
            if (i12 == i10) {
                return this.f18810h[i11];
            }
            i11 = this.f18809g[i11];
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public void e(float f10) {
        int i10 = this.f18811i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18803a; i11++) {
            float[] fArr = this.f18810h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f18809g[i10];
        }
    }

    @Override // M1.b.a
    public final float f(i iVar) {
        int i10 = this.f18811i;
        for (int i11 = 0; i10 != -1 && i11 < this.f18803a; i11++) {
            if (this.f18808f[i10] == iVar.f18865c) {
                return this.f18810h[i10];
            }
            i10 = this.f18809g[i10];
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public final float g(i iVar, boolean z10) {
        if (this.f18807e == iVar) {
            this.f18807e = null;
        }
        int i10 = this.f18811i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f18803a) {
            if (this.f18808f[i10] == iVar.f18865c) {
                if (i10 == this.f18811i) {
                    this.f18811i = this.f18809g[i10];
                } else {
                    int[] iArr = this.f18809g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.l(this.f18804b);
                }
                iVar.f18875m--;
                this.f18803a--;
                this.f18808f[i10] = -1;
                if (this.f18813k) {
                    this.f18812j = i10;
                }
                return this.f18810h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f18809g[i10];
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public void h(i iVar, float f10, boolean z10) {
        float f11 = f18802l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f18811i;
            if (i10 == -1) {
                this.f18811i = 0;
                this.f18810h[0] = f10;
                this.f18808f[0] = iVar.f18865c;
                this.f18809g[0] = -1;
                iVar.f18875m++;
                iVar.a(this.f18804b);
                this.f18803a++;
                if (this.f18813k) {
                    return;
                }
                int i11 = this.f18812j + 1;
                this.f18812j = i11;
                int[] iArr = this.f18808f;
                if (i11 >= iArr.length) {
                    this.f18813k = true;
                    this.f18812j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f18803a; i13++) {
                int i14 = this.f18808f[i10];
                int i15 = iVar.f18865c;
                if (i14 == i15) {
                    float[] fArr = this.f18810h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f18802l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f18811i) {
                            this.f18811i = this.f18809g[i10];
                        } else {
                            int[] iArr2 = this.f18809g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.l(this.f18804b);
                        }
                        if (this.f18813k) {
                            this.f18812j = i10;
                        }
                        iVar.f18875m--;
                        this.f18803a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f18809g[i10];
            }
            int length = this.f18812j;
            int i16 = length + 1;
            if (this.f18813k) {
                int[] iArr3 = this.f18808f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f18808f;
            if (length >= iArr4.length && this.f18803a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f18808f;
                    if (i17 >= iArr5.length) {
                        break;
                    }
                    if (iArr5[i17] == -1) {
                        length = i17;
                        break;
                    }
                    i17++;
                }
            }
            int[] iArr6 = this.f18808f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f18806d * 2;
                this.f18806d = i18;
                this.f18813k = false;
                this.f18812j = length - 1;
                this.f18810h = Arrays.copyOf(this.f18810h, i18);
                this.f18808f = Arrays.copyOf(this.f18808f, this.f18806d);
                this.f18809g = Arrays.copyOf(this.f18809g, this.f18806d);
            }
            this.f18808f[length] = iVar.f18865c;
            this.f18810h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f18809g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f18809g[length] = this.f18811i;
                this.f18811i = length;
            }
            iVar.f18875m++;
            iVar.a(this.f18804b);
            this.f18803a++;
            if (!this.f18813k) {
                this.f18812j++;
            }
            int i19 = this.f18812j;
            int[] iArr8 = this.f18808f;
            if (i19 >= iArr8.length) {
                this.f18813k = true;
                this.f18812j = iArr8.length - 1;
            }
        }
    }

    @Override // M1.b.a
    public boolean i(i iVar) {
        int i10 = this.f18811i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f18803a; i11++) {
            if (this.f18808f[i10] == iVar.f18865c) {
                return true;
            }
            i10 = this.f18809g[i10];
        }
        return false;
    }

    @Override // M1.b.a
    public float k(b bVar, boolean z10) {
        float f10 = f(bVar.f18814a);
        g(bVar.f18814a, z10);
        b.a aVar = bVar.f18818e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarA = aVar.a(i10);
            h(iVarA, aVar.f(iVarA) * f10, z10);
        }
        return f10;
    }

    public String toString() {
        int i10 = this.f18811i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f18803a; i11++) {
            str = ((str + " -> ") + this.f18810h[i10] + " : ") + this.f18805c.f18823d[this.f18808f[i10]];
            i10 = this.f18809g[i10];
        }
        return str;
    }

    a(b bVar, c cVar) {
        this.f18804b = bVar;
        this.f18805c = cVar;
    }
}
