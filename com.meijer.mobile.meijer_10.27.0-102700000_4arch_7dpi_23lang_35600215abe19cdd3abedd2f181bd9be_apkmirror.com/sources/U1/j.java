package U1;

import U1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f35686n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f35687a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f35688b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f35689c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f35690d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f35691e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f35692f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f35693g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f35694h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f35695i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f35696j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f35697k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f35698l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f35699m;

    private int n() {
        for (int i10 = 0; i10 < this.f35688b; i10++) {
            if (this.f35692f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f35668c % this.f35689c;
        int[] iArr2 = this.f35690d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f35691e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f35691e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f35692f[i10] = iVar.f35668c;
        this.f35693g[i10] = f10;
        this.f35694h[i10] = -1;
        this.f35695i[i10] = -1;
        iVar.a(this.f35698l);
        iVar.f35678m++;
        this.f35696j++;
    }

    private void o() {
        int i10 = this.f35688b * 2;
        this.f35692f = Arrays.copyOf(this.f35692f, i10);
        this.f35693g = Arrays.copyOf(this.f35693g, i10);
        this.f35694h = Arrays.copyOf(this.f35694h, i10);
        this.f35695i = Arrays.copyOf(this.f35695i, i10);
        this.f35691e = Arrays.copyOf(this.f35691e, i10);
        for (int i11 = this.f35688b; i11 < i10; i11++) {
            this.f35692f[i11] = -1;
            this.f35691e[i11] = -1;
        }
        this.f35688b = i10;
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f35668c;
        int i12 = i11 % this.f35689c;
        int[] iArr2 = this.f35690d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f35692f[i13] == i11) {
            int[] iArr3 = this.f35691e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f35691e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f35692f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f35692f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // U1.b.a
    public i a(int i10) {
        int i11 = this.f35696j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f35697k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f35699m.f35631d[this.f35692f[i12]];
            }
            i12 = this.f35695i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // U1.b.a
    public void b() {
        int i10 = this.f35696j;
        int i11 = this.f35697k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f35693g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f35695i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // U1.b.a
    public int c() {
        return this.f35696j;
    }

    @Override // U1.b.a
    public void clear() {
        int i10 = this.f35696j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarA = a(i11);
            if (iVarA != null) {
                iVarA.c(this.f35698l);
            }
        }
        for (int i12 = 0; i12 < this.f35688b; i12++) {
            this.f35692f[i12] = -1;
            this.f35691e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f35689c; i13++) {
            this.f35690d[i13] = -1;
        }
        this.f35696j = 0;
        this.f35697k = -1;
    }

    @Override // U1.b.a
    public float d(int i10) {
        int i11 = this.f35696j;
        int i12 = this.f35697k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f35693g[i12];
            }
            i12 = this.f35695i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // U1.b.a
    public void e(float f10) {
        int i10 = this.f35696j;
        int i11 = this.f35697k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f35693g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f35695i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // U1.b.a
    public void g(i iVar, float f10, boolean z10) {
        float f11 = f35686n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                j(iVar, f10);
                return;
            }
            float[] fArr = this.f35693g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f35686n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            k(iVar, z10);
        }
    }

    @Override // U1.b.a
    public float h(b bVar, boolean z10) {
        float fI = i(bVar.f35622a);
        k(bVar.f35622a, z10);
        j jVar = (j) bVar.f35626e;
        int iC = jVar.c();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iC) {
            int i12 = jVar.f35692f[i11];
            if (i12 != -1) {
                g(this.f35699m.f35631d[i12], jVar.f35693g[i11] * fI, z10);
                i10++;
            }
            i11++;
        }
        return fI;
    }

    @Override // U1.b.a
    public void j(i iVar, float f10) {
        float f11 = f35686n;
        if (f10 > (-f11) && f10 < f11) {
            k(iVar, true);
            return;
        }
        if (this.f35696j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f35697k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f35693g[iP] = f10;
            return;
        }
        if (this.f35696j + 1 >= this.f35688b) {
            o();
        }
        int i10 = this.f35696j;
        int i11 = this.f35697k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f35692f[i11];
            int i15 = iVar.f35668c;
            if (i14 == i15) {
                this.f35693g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f35695i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    public int p(i iVar) {
        if (this.f35696j == 0) {
            return -1;
        }
        int i10 = iVar.f35668c;
        int i11 = this.f35690d[i10 % this.f35689c];
        if (i11 == -1) {
            return -1;
        }
        if (this.f35692f[i11] == i10) {
            return i11;
        }
        do {
            i11 = this.f35691e[i11];
            if (i11 == -1) {
                break;
            }
        } while (this.f35692f[i11] != i10);
        if (i11 != -1 && this.f35692f[i11] == i10) {
            return i11;
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f35696j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarA = a(i11);
            if (iVarA != null) {
                String str2 = str + iVarA + " = " + d(i11) + " ";
                int iP = p(iVarA);
                String str3 = str2 + "[p: ";
                String str4 = (this.f35694h[iP] != -1 ? str3 + this.f35699m.f35631d[this.f35692f[this.f35694h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f35695i[iP] != -1 ? str4 + this.f35699m.f35631d[this.f35692f[this.f35695i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    j(b bVar, c cVar) {
        this.f35698l = bVar;
        this.f35699m = cVar;
        clear();
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f35694h[iN] = i10;
            int[] iArr = this.f35695i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f35694h[iN] = -1;
            if (this.f35696j > 0) {
                this.f35695i[iN] = this.f35697k;
                this.f35697k = iN;
            } else {
                this.f35695i[iN] = -1;
            }
        }
        int i11 = this.f35695i[iN];
        if (i11 != -1) {
            this.f35694h[i11] = iN;
        }
        l(iVar, iN);
    }

    @Override // U1.b.a
    public boolean f(i iVar) {
        if (p(iVar) != -1) {
            return true;
        }
        return false;
    }

    @Override // U1.b.a
    public float i(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f35693g[iP];
        }
        return 0.0f;
    }

    @Override // U1.b.a
    public float k(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f35693g[iP];
        if (this.f35697k == iP) {
            this.f35697k = this.f35695i[iP];
        }
        this.f35692f[iP] = -1;
        int[] iArr = this.f35694h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f35695i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f35695i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f35696j--;
        iVar.f35678m--;
        if (z10) {
            iVar.c(this.f35698l);
        }
        return f10;
    }
}
