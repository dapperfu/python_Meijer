package U1;

import U1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f36946l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f36948b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f36949c;

    /* renamed from: a, reason: collision with root package name */
    int f36947a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f36950d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f36951e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f36952f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f36953g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f36954h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f36955i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f36956j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f36957k = false;

    @Override // U1.b.a
    public final void j(i iVar, float f10) {
        if (f10 == 0.0f) {
            k(iVar, true);
            return;
        }
        int i10 = this.f36955i;
        if (i10 == -1) {
            this.f36955i = 0;
            this.f36954h[0] = f10;
            this.f36952f[0] = iVar.f37004c;
            this.f36953g[0] = -1;
            iVar.f37014m++;
            iVar.a(this.f36948b);
            this.f36947a++;
            if (this.f36957k) {
                return;
            }
            int i11 = this.f36956j + 1;
            this.f36956j = i11;
            int[] iArr = this.f36952f;
            if (i11 >= iArr.length) {
                this.f36957k = true;
                this.f36956j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f36947a; i13++) {
            int i14 = this.f36952f[i10];
            int i15 = iVar.f37004c;
            if (i14 == i15) {
                this.f36954h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f36953g[i10];
        }
        int length = this.f36956j;
        int i16 = length + 1;
        if (this.f36957k) {
            int[] iArr2 = this.f36952f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f36952f;
        if (length >= iArr3.length && this.f36947a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f36952f;
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
        int[] iArr5 = this.f36952f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f36950d * 2;
            this.f36950d = i18;
            this.f36957k = false;
            this.f36956j = length - 1;
            this.f36954h = Arrays.copyOf(this.f36954h, i18);
            this.f36952f = Arrays.copyOf(this.f36952f, this.f36950d);
            this.f36953g = Arrays.copyOf(this.f36953g, this.f36950d);
        }
        this.f36952f[length] = iVar.f37004c;
        this.f36954h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f36953g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f36953g[length] = this.f36955i;
            this.f36955i = length;
        }
        iVar.f37014m++;
        iVar.a(this.f36948b);
        int i19 = this.f36947a + 1;
        this.f36947a = i19;
        if (!this.f36957k) {
            this.f36956j++;
        }
        int[] iArr7 = this.f36952f;
        if (i19 >= iArr7.length) {
            this.f36957k = true;
        }
        if (this.f36956j >= iArr7.length) {
            this.f36957k = true;
            this.f36956j = iArr7.length - 1;
        }
    }

    @Override // U1.b.a
    public i a(int i10) {
        int i11 = this.f36955i;
        for (int i12 = 0; i11 != -1 && i12 < this.f36947a; i12++) {
            if (i12 == i10) {
                return this.f36949c.f36967d[this.f36952f[i11]];
            }
            i11 = this.f36953g[i11];
        }
        return null;
    }

    @Override // U1.b.a
    public void b() {
        int i10 = this.f36955i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36947a; i11++) {
            float[] fArr = this.f36954h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f36953g[i10];
        }
    }

    @Override // U1.b.a
    public int c() {
        return this.f36947a;
    }

    @Override // U1.b.a
    public final void clear() {
        int i10 = this.f36955i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36947a; i11++) {
            i iVar = this.f36949c.f36967d[this.f36952f[i10]];
            if (iVar != null) {
                iVar.c(this.f36948b);
            }
            i10 = this.f36953g[i10];
        }
        this.f36955i = -1;
        this.f36956j = -1;
        this.f36957k = false;
        this.f36947a = 0;
    }

    @Override // U1.b.a
    public float d(int i10) {
        int i11 = this.f36955i;
        for (int i12 = 0; i11 != -1 && i12 < this.f36947a; i12++) {
            if (i12 == i10) {
                return this.f36954h[i11];
            }
            i11 = this.f36953g[i11];
        }
        return 0.0f;
    }

    @Override // U1.b.a
    public void e(float f10) {
        int i10 = this.f36955i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36947a; i11++) {
            float[] fArr = this.f36954h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f36953g[i10];
        }
    }

    @Override // U1.b.a
    public boolean f(i iVar) {
        int i10 = this.f36955i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f36947a; i11++) {
            if (this.f36952f[i10] == iVar.f37004c) {
                return true;
            }
            i10 = this.f36953g[i10];
        }
        return false;
    }

    @Override // U1.b.a
    public void g(i iVar, float f10, boolean z10) {
        float f11 = f36946l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f36955i;
            if (i10 == -1) {
                this.f36955i = 0;
                this.f36954h[0] = f10;
                this.f36952f[0] = iVar.f37004c;
                this.f36953g[0] = -1;
                iVar.f37014m++;
                iVar.a(this.f36948b);
                this.f36947a++;
                if (this.f36957k) {
                    return;
                }
                int i11 = this.f36956j + 1;
                this.f36956j = i11;
                int[] iArr = this.f36952f;
                if (i11 >= iArr.length) {
                    this.f36957k = true;
                    this.f36956j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f36947a; i13++) {
                int i14 = this.f36952f[i10];
                int i15 = iVar.f37004c;
                if (i14 == i15) {
                    float[] fArr = this.f36954h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f36946l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f36955i) {
                            this.f36955i = this.f36953g[i10];
                        } else {
                            int[] iArr2 = this.f36953g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.c(this.f36948b);
                        }
                        if (this.f36957k) {
                            this.f36956j = i10;
                        }
                        iVar.f37014m--;
                        this.f36947a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f36953g[i10];
            }
            int length = this.f36956j;
            int i16 = length + 1;
            if (this.f36957k) {
                int[] iArr3 = this.f36952f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f36952f;
            if (length >= iArr4.length && this.f36947a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f36952f;
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
            int[] iArr6 = this.f36952f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f36950d * 2;
                this.f36950d = i18;
                this.f36957k = false;
                this.f36956j = length - 1;
                this.f36954h = Arrays.copyOf(this.f36954h, i18);
                this.f36952f = Arrays.copyOf(this.f36952f, this.f36950d);
                this.f36953g = Arrays.copyOf(this.f36953g, this.f36950d);
            }
            this.f36952f[length] = iVar.f37004c;
            this.f36954h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f36953g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f36953g[length] = this.f36955i;
                this.f36955i = length;
            }
            iVar.f37014m++;
            iVar.a(this.f36948b);
            this.f36947a++;
            if (!this.f36957k) {
                this.f36956j++;
            }
            int i19 = this.f36956j;
            int[] iArr8 = this.f36952f;
            if (i19 >= iArr8.length) {
                this.f36957k = true;
                this.f36956j = iArr8.length - 1;
            }
        }
    }

    @Override // U1.b.a
    public float h(b bVar, boolean z10) {
        float fI = i(bVar.f36958a);
        k(bVar.f36958a, z10);
        b.a aVar = bVar.f36962e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarA = aVar.a(i10);
            g(iVarA, aVar.i(iVarA) * fI, z10);
        }
        return fI;
    }

    @Override // U1.b.a
    public final float i(i iVar) {
        int i10 = this.f36955i;
        for (int i11 = 0; i10 != -1 && i11 < this.f36947a; i11++) {
            if (this.f36952f[i10] == iVar.f37004c) {
                return this.f36954h[i10];
            }
            i10 = this.f36953g[i10];
        }
        return 0.0f;
    }

    @Override // U1.b.a
    public final float k(i iVar, boolean z10) {
        if (this.f36951e == iVar) {
            this.f36951e = null;
        }
        int i10 = this.f36955i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f36947a) {
            if (this.f36952f[i10] == iVar.f37004c) {
                if (i10 == this.f36955i) {
                    this.f36955i = this.f36953g[i10];
                } else {
                    int[] iArr = this.f36953g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.c(this.f36948b);
                }
                iVar.f37014m--;
                this.f36947a--;
                this.f36952f[i10] = -1;
                if (this.f36957k) {
                    this.f36956j = i10;
                }
                return this.f36954h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f36953g[i10];
        }
        return 0.0f;
    }

    public String toString() {
        int i10 = this.f36955i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f36947a; i11++) {
            str = ((str + " -> ") + this.f36954h[i10] + " : ") + this.f36949c.f36967d[this.f36952f[i10]];
            i10 = this.f36953g[i10];
        }
        return str;
    }

    a(b bVar, c cVar) {
        this.f36948b = bVar;
        this.f36949c = cVar;
    }
}
