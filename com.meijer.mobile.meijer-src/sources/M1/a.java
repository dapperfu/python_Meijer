package M1;

import M1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f19543l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f19545b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f19546c;

    /* renamed from: a, reason: collision with root package name */
    int f19544a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f19547d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f19548e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f19549f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f19550g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f19551h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f19552i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f19553j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f19554k = false;

    @Override // M1.b.a
    public final void j(i iVar, float f10) {
        if (f10 == 0.0f) {
            g(iVar, true);
            return;
        }
        int i10 = this.f19552i;
        if (i10 == -1) {
            this.f19552i = 0;
            this.f19551h[0] = f10;
            this.f19549f[0] = iVar.f19606c;
            this.f19550g[0] = -1;
            iVar.f19616m++;
            iVar.a(this.f19545b);
            this.f19544a++;
            if (this.f19554k) {
                return;
            }
            int i11 = this.f19553j + 1;
            this.f19553j = i11;
            int[] iArr = this.f19549f;
            if (i11 >= iArr.length) {
                this.f19554k = true;
                this.f19553j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f19544a; i13++) {
            int i14 = this.f19549f[i10];
            int i15 = iVar.f19606c;
            if (i14 == i15) {
                this.f19551h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f19550g[i10];
        }
        int length = this.f19553j;
        int i16 = length + 1;
        if (this.f19554k) {
            int[] iArr2 = this.f19549f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f19549f;
        if (length >= iArr3.length && this.f19544a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f19549f;
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
        int[] iArr5 = this.f19549f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f19547d * 2;
            this.f19547d = i18;
            this.f19554k = false;
            this.f19553j = length - 1;
            this.f19551h = Arrays.copyOf(this.f19551h, i18);
            this.f19549f = Arrays.copyOf(this.f19549f, this.f19547d);
            this.f19550g = Arrays.copyOf(this.f19550g, this.f19547d);
        }
        this.f19549f[length] = iVar.f19606c;
        this.f19551h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f19550g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f19550g[length] = this.f19552i;
            this.f19552i = length;
        }
        iVar.f19616m++;
        iVar.a(this.f19545b);
        int i19 = this.f19544a + 1;
        this.f19544a = i19;
        if (!this.f19554k) {
            this.f19553j++;
        }
        int[] iArr7 = this.f19549f;
        if (i19 >= iArr7.length) {
            this.f19554k = true;
        }
        if (this.f19553j >= iArr7.length) {
            this.f19554k = true;
            this.f19553j = iArr7.length - 1;
        }
    }

    @Override // M1.b.a
    public i a(int i10) {
        int i11 = this.f19552i;
        for (int i12 = 0; i11 != -1 && i12 < this.f19544a; i12++) {
            if (i12 == i10) {
                return this.f19546c.f19564d[this.f19549f[i11]];
            }
            i11 = this.f19550g[i11];
        }
        return null;
    }

    @Override // M1.b.a
    public void b() {
        int i10 = this.f19552i;
        for (int i11 = 0; i10 != -1 && i11 < this.f19544a; i11++) {
            float[] fArr = this.f19551h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f19550g[i10];
        }
    }

    @Override // M1.b.a
    public int c() {
        return this.f19544a;
    }

    @Override // M1.b.a
    public final void clear() {
        int i10 = this.f19552i;
        for (int i11 = 0; i10 != -1 && i11 < this.f19544a; i11++) {
            i iVar = this.f19546c.f19564d[this.f19549f[i10]];
            if (iVar != null) {
                iVar.l(this.f19545b);
            }
            i10 = this.f19550g[i10];
        }
        this.f19552i = -1;
        this.f19553j = -1;
        this.f19554k = false;
        this.f19544a = 0;
    }

    @Override // M1.b.a
    public float d(int i10) {
        int i11 = this.f19552i;
        for (int i12 = 0; i11 != -1 && i12 < this.f19544a; i12++) {
            if (i12 == i10) {
                return this.f19551h[i11];
            }
            i11 = this.f19550g[i11];
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public void e(float f10) {
        int i10 = this.f19552i;
        for (int i11 = 0; i10 != -1 && i11 < this.f19544a; i11++) {
            float[] fArr = this.f19551h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f19550g[i10];
        }
    }

    @Override // M1.b.a
    public final float f(i iVar) {
        int i10 = this.f19552i;
        for (int i11 = 0; i10 != -1 && i11 < this.f19544a; i11++) {
            if (this.f19549f[i10] == iVar.f19606c) {
                return this.f19551h[i10];
            }
            i10 = this.f19550g[i10];
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public final float g(i iVar, boolean z10) {
        if (this.f19548e == iVar) {
            this.f19548e = null;
        }
        int i10 = this.f19552i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f19544a) {
            if (this.f19549f[i10] == iVar.f19606c) {
                if (i10 == this.f19552i) {
                    this.f19552i = this.f19550g[i10];
                } else {
                    int[] iArr = this.f19550g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.l(this.f19545b);
                }
                iVar.f19616m--;
                this.f19544a--;
                this.f19549f[i10] = -1;
                if (this.f19554k) {
                    this.f19553j = i10;
                }
                return this.f19551h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f19550g[i10];
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public void h(i iVar, float f10, boolean z10) {
        float f11 = f19543l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f19552i;
            if (i10 == -1) {
                this.f19552i = 0;
                this.f19551h[0] = f10;
                this.f19549f[0] = iVar.f19606c;
                this.f19550g[0] = -1;
                iVar.f19616m++;
                iVar.a(this.f19545b);
                this.f19544a++;
                if (this.f19554k) {
                    return;
                }
                int i11 = this.f19553j + 1;
                this.f19553j = i11;
                int[] iArr = this.f19549f;
                if (i11 >= iArr.length) {
                    this.f19554k = true;
                    this.f19553j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f19544a; i13++) {
                int i14 = this.f19549f[i10];
                int i15 = iVar.f19606c;
                if (i14 == i15) {
                    float[] fArr = this.f19551h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f19543l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f19552i) {
                            this.f19552i = this.f19550g[i10];
                        } else {
                            int[] iArr2 = this.f19550g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.l(this.f19545b);
                        }
                        if (this.f19554k) {
                            this.f19553j = i10;
                        }
                        iVar.f19616m--;
                        this.f19544a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f19550g[i10];
            }
            int length = this.f19553j;
            int i16 = length + 1;
            if (this.f19554k) {
                int[] iArr3 = this.f19549f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f19549f;
            if (length >= iArr4.length && this.f19544a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f19549f;
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
            int[] iArr6 = this.f19549f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f19547d * 2;
                this.f19547d = i18;
                this.f19554k = false;
                this.f19553j = length - 1;
                this.f19551h = Arrays.copyOf(this.f19551h, i18);
                this.f19549f = Arrays.copyOf(this.f19549f, this.f19547d);
                this.f19550g = Arrays.copyOf(this.f19550g, this.f19547d);
            }
            this.f19549f[length] = iVar.f19606c;
            this.f19551h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f19550g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f19550g[length] = this.f19552i;
                this.f19552i = length;
            }
            iVar.f19616m++;
            iVar.a(this.f19545b);
            this.f19544a++;
            if (!this.f19554k) {
                this.f19553j++;
            }
            int i19 = this.f19553j;
            int[] iArr8 = this.f19549f;
            if (i19 >= iArr8.length) {
                this.f19554k = true;
                this.f19553j = iArr8.length - 1;
            }
        }
    }

    @Override // M1.b.a
    public boolean i(i iVar) {
        int i10 = this.f19552i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f19544a; i11++) {
            if (this.f19549f[i10] == iVar.f19606c) {
                return true;
            }
            i10 = this.f19550g[i10];
        }
        return false;
    }

    @Override // M1.b.a
    public float k(b bVar, boolean z10) {
        float f10 = f(bVar.f19555a);
        g(bVar.f19555a, z10);
        b.a aVar = bVar.f19559e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarA = aVar.a(i10);
            h(iVarA, aVar.f(iVarA) * f10, z10);
        }
        return f10;
    }

    public String toString() {
        int i10 = this.f19552i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f19544a; i11++) {
            str = ((str + " -> ") + this.f19551h[i10] + " : ") + this.f19546c.f19564d[this.f19549f[i10]];
            i10 = this.f19550g[i10];
        }
        return str;
    }

    a(b bVar, c cVar) {
        this.f19545b = bVar;
        this.f19546c = cVar;
    }
}
