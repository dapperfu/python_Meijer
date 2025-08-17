package U1;

import U1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class a implements b.a {

    /* renamed from: l, reason: collision with root package name */
    private static float f35610l = 0.001f;

    /* renamed from: b, reason: collision with root package name */
    private final b f35612b;

    /* renamed from: c, reason: collision with root package name */
    protected final c f35613c;

    /* renamed from: a, reason: collision with root package name */
    int f35611a = 0;

    /* renamed from: d, reason: collision with root package name */
    private int f35614d = 8;

    /* renamed from: e, reason: collision with root package name */
    private i f35615e = null;

    /* renamed from: f, reason: collision with root package name */
    private int[] f35616f = new int[8];

    /* renamed from: g, reason: collision with root package name */
    private int[] f35617g = new int[8];

    /* renamed from: h, reason: collision with root package name */
    private float[] f35618h = new float[8];

    /* renamed from: i, reason: collision with root package name */
    private int f35619i = -1;

    /* renamed from: j, reason: collision with root package name */
    private int f35620j = -1;

    /* renamed from: k, reason: collision with root package name */
    private boolean f35621k = false;

    @Override // U1.b.a
    public final void j(i iVar, float f10) {
        if (f10 == 0.0f) {
            k(iVar, true);
            return;
        }
        int i10 = this.f35619i;
        if (i10 == -1) {
            this.f35619i = 0;
            this.f35618h[0] = f10;
            this.f35616f[0] = iVar.f35668c;
            this.f35617g[0] = -1;
            iVar.f35678m++;
            iVar.a(this.f35612b);
            this.f35611a++;
            if (this.f35621k) {
                return;
            }
            int i11 = this.f35620j + 1;
            this.f35620j = i11;
            int[] iArr = this.f35616f;
            if (i11 >= iArr.length) {
                this.f35621k = true;
                this.f35620j = iArr.length - 1;
                return;
            }
            return;
        }
        int i12 = -1;
        for (int i13 = 0; i10 != -1 && i13 < this.f35611a; i13++) {
            int i14 = this.f35616f[i10];
            int i15 = iVar.f35668c;
            if (i14 == i15) {
                this.f35618h[i10] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i10;
            }
            i10 = this.f35617g[i10];
        }
        int length = this.f35620j;
        int i16 = length + 1;
        if (this.f35621k) {
            int[] iArr2 = this.f35616f;
            if (iArr2[length] != -1) {
                length = iArr2.length;
            }
        } else {
            length = i16;
        }
        int[] iArr3 = this.f35616f;
        if (length >= iArr3.length && this.f35611a < iArr3.length) {
            int i17 = 0;
            while (true) {
                int[] iArr4 = this.f35616f;
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
        int[] iArr5 = this.f35616f;
        if (length >= iArr5.length) {
            length = iArr5.length;
            int i18 = this.f35614d * 2;
            this.f35614d = i18;
            this.f35621k = false;
            this.f35620j = length - 1;
            this.f35618h = Arrays.copyOf(this.f35618h, i18);
            this.f35616f = Arrays.copyOf(this.f35616f, this.f35614d);
            this.f35617g = Arrays.copyOf(this.f35617g, this.f35614d);
        }
        this.f35616f[length] = iVar.f35668c;
        this.f35618h[length] = f10;
        if (i12 != -1) {
            int[] iArr6 = this.f35617g;
            iArr6[length] = iArr6[i12];
            iArr6[i12] = length;
        } else {
            this.f35617g[length] = this.f35619i;
            this.f35619i = length;
        }
        iVar.f35678m++;
        iVar.a(this.f35612b);
        int i19 = this.f35611a + 1;
        this.f35611a = i19;
        if (!this.f35621k) {
            this.f35620j++;
        }
        int[] iArr7 = this.f35616f;
        if (i19 >= iArr7.length) {
            this.f35621k = true;
        }
        if (this.f35620j >= iArr7.length) {
            this.f35621k = true;
            this.f35620j = iArr7.length - 1;
        }
    }

    @Override // U1.b.a
    public i a(int i10) {
        int i11 = this.f35619i;
        for (int i12 = 0; i11 != -1 && i12 < this.f35611a; i12++) {
            if (i12 == i10) {
                return this.f35613c.f35631d[this.f35616f[i11]];
            }
            i11 = this.f35617g[i11];
        }
        return null;
    }

    @Override // U1.b.a
    public void b() {
        int i10 = this.f35619i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35611a; i11++) {
            float[] fArr = this.f35618h;
            fArr[i10] = fArr[i10] * (-1.0f);
            i10 = this.f35617g[i10];
        }
    }

    @Override // U1.b.a
    public int c() {
        return this.f35611a;
    }

    @Override // U1.b.a
    public final void clear() {
        int i10 = this.f35619i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35611a; i11++) {
            i iVar = this.f35613c.f35631d[this.f35616f[i10]];
            if (iVar != null) {
                iVar.c(this.f35612b);
            }
            i10 = this.f35617g[i10];
        }
        this.f35619i = -1;
        this.f35620j = -1;
        this.f35621k = false;
        this.f35611a = 0;
    }

    @Override // U1.b.a
    public float d(int i10) {
        int i11 = this.f35619i;
        for (int i12 = 0; i11 != -1 && i12 < this.f35611a; i12++) {
            if (i12 == i10) {
                return this.f35618h[i11];
            }
            i11 = this.f35617g[i11];
        }
        return 0.0f;
    }

    @Override // U1.b.a
    public void e(float f10) {
        int i10 = this.f35619i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35611a; i11++) {
            float[] fArr = this.f35618h;
            fArr[i10] = fArr[i10] / f10;
            i10 = this.f35617g[i10];
        }
    }

    @Override // U1.b.a
    public boolean f(i iVar) {
        int i10 = this.f35619i;
        if (i10 == -1) {
            return false;
        }
        for (int i11 = 0; i10 != -1 && i11 < this.f35611a; i11++) {
            if (this.f35616f[i10] == iVar.f35668c) {
                return true;
            }
            i10 = this.f35617g[i10];
        }
        return false;
    }

    @Override // U1.b.a
    public void g(i iVar, float f10, boolean z10) {
        float f11 = f35610l;
        if (f10 <= (-f11) || f10 >= f11) {
            int i10 = this.f35619i;
            if (i10 == -1) {
                this.f35619i = 0;
                this.f35618h[0] = f10;
                this.f35616f[0] = iVar.f35668c;
                this.f35617g[0] = -1;
                iVar.f35678m++;
                iVar.a(this.f35612b);
                this.f35611a++;
                if (this.f35621k) {
                    return;
                }
                int i11 = this.f35620j + 1;
                this.f35620j = i11;
                int[] iArr = this.f35616f;
                if (i11 >= iArr.length) {
                    this.f35621k = true;
                    this.f35620j = iArr.length - 1;
                    return;
                }
                return;
            }
            int i12 = -1;
            for (int i13 = 0; i10 != -1 && i13 < this.f35611a; i13++) {
                int i14 = this.f35616f[i10];
                int i15 = iVar.f35668c;
                if (i14 == i15) {
                    float[] fArr = this.f35618h;
                    float f12 = fArr[i10] + f10;
                    float f13 = f35610l;
                    if (f12 > (-f13) && f12 < f13) {
                        f12 = 0.0f;
                    }
                    fArr[i10] = f12;
                    if (f12 == 0.0f) {
                        if (i10 == this.f35619i) {
                            this.f35619i = this.f35617g[i10];
                        } else {
                            int[] iArr2 = this.f35617g;
                            iArr2[i12] = iArr2[i10];
                        }
                        if (z10) {
                            iVar.c(this.f35612b);
                        }
                        if (this.f35621k) {
                            this.f35620j = i10;
                        }
                        iVar.f35678m--;
                        this.f35611a--;
                        return;
                    }
                    return;
                }
                if (i14 < i15) {
                    i12 = i10;
                }
                i10 = this.f35617g[i10];
            }
            int length = this.f35620j;
            int i16 = length + 1;
            if (this.f35621k) {
                int[] iArr3 = this.f35616f;
                if (iArr3[length] != -1) {
                    length = iArr3.length;
                }
            } else {
                length = i16;
            }
            int[] iArr4 = this.f35616f;
            if (length >= iArr4.length && this.f35611a < iArr4.length) {
                int i17 = 0;
                while (true) {
                    int[] iArr5 = this.f35616f;
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
            int[] iArr6 = this.f35616f;
            if (length >= iArr6.length) {
                length = iArr6.length;
                int i18 = this.f35614d * 2;
                this.f35614d = i18;
                this.f35621k = false;
                this.f35620j = length - 1;
                this.f35618h = Arrays.copyOf(this.f35618h, i18);
                this.f35616f = Arrays.copyOf(this.f35616f, this.f35614d);
                this.f35617g = Arrays.copyOf(this.f35617g, this.f35614d);
            }
            this.f35616f[length] = iVar.f35668c;
            this.f35618h[length] = f10;
            if (i12 != -1) {
                int[] iArr7 = this.f35617g;
                iArr7[length] = iArr7[i12];
                iArr7[i12] = length;
            } else {
                this.f35617g[length] = this.f35619i;
                this.f35619i = length;
            }
            iVar.f35678m++;
            iVar.a(this.f35612b);
            this.f35611a++;
            if (!this.f35621k) {
                this.f35620j++;
            }
            int i19 = this.f35620j;
            int[] iArr8 = this.f35616f;
            if (i19 >= iArr8.length) {
                this.f35621k = true;
                this.f35620j = iArr8.length - 1;
            }
        }
    }

    @Override // U1.b.a
    public float h(b bVar, boolean z10) {
        float fI = i(bVar.f35622a);
        k(bVar.f35622a, z10);
        b.a aVar = bVar.f35626e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarA = aVar.a(i10);
            g(iVarA, aVar.i(iVarA) * fI, z10);
        }
        return fI;
    }

    @Override // U1.b.a
    public final float i(i iVar) {
        int i10 = this.f35619i;
        for (int i11 = 0; i10 != -1 && i11 < this.f35611a; i11++) {
            if (this.f35616f[i10] == iVar.f35668c) {
                return this.f35618h[i10];
            }
            i10 = this.f35617g[i10];
        }
        return 0.0f;
    }

    @Override // U1.b.a
    public final float k(i iVar, boolean z10) {
        if (this.f35615e == iVar) {
            this.f35615e = null;
        }
        int i10 = this.f35619i;
        if (i10 == -1) {
            return 0.0f;
        }
        int i11 = 0;
        int i12 = -1;
        while (i10 != -1 && i11 < this.f35611a) {
            if (this.f35616f[i10] == iVar.f35668c) {
                if (i10 == this.f35619i) {
                    this.f35619i = this.f35617g[i10];
                } else {
                    int[] iArr = this.f35617g;
                    iArr[i12] = iArr[i10];
                }
                if (z10) {
                    iVar.c(this.f35612b);
                }
                iVar.f35678m--;
                this.f35611a--;
                this.f35616f[i10] = -1;
                if (this.f35621k) {
                    this.f35620j = i10;
                }
                return this.f35618h[i10];
            }
            i11++;
            i12 = i10;
            i10 = this.f35617g[i10];
        }
        return 0.0f;
    }

    public String toString() {
        int i10 = this.f35619i;
        String str = "";
        for (int i11 = 0; i10 != -1 && i11 < this.f35611a; i11++) {
            str = ((str + " -> ") + this.f35618h[i10] + " : ") + this.f35613c.f35631d[this.f35616f[i10]];
            i10 = this.f35617g[i10];
        }
        return str;
    }

    a(b bVar, c cVar) {
        this.f35612b = bVar;
        this.f35613c = cVar;
    }
}
