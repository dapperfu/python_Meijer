package M1;

import M1.b;
import java.util.Arrays;

/* loaded from: classes.dex */
public class j implements b.a {

    /* renamed from: n, reason: collision with root package name */
    private static float f19627n = 0.001f;

    /* renamed from: a, reason: collision with root package name */
    private final int f19628a = -1;

    /* renamed from: b, reason: collision with root package name */
    private int f19629b = 16;

    /* renamed from: c, reason: collision with root package name */
    private int f19630c = 16;

    /* renamed from: d, reason: collision with root package name */
    int[] f19631d = new int[16];

    /* renamed from: e, reason: collision with root package name */
    int[] f19632e = new int[16];

    /* renamed from: f, reason: collision with root package name */
    int[] f19633f = new int[16];

    /* renamed from: g, reason: collision with root package name */
    float[] f19634g = new float[16];

    /* renamed from: h, reason: collision with root package name */
    int[] f19635h = new int[16];

    /* renamed from: i, reason: collision with root package name */
    int[] f19636i = new int[16];

    /* renamed from: j, reason: collision with root package name */
    int f19637j = 0;

    /* renamed from: k, reason: collision with root package name */
    int f19638k = -1;

    /* renamed from: l, reason: collision with root package name */
    private final b f19639l;

    /* renamed from: m, reason: collision with root package name */
    protected final c f19640m;

    private int n() {
        for (int i10 = 0; i10 < this.f19629b; i10++) {
            if (this.f19633f[i10] == -1) {
                return i10;
            }
        }
        return -1;
    }

    private void l(i iVar, int i10) {
        int[] iArr;
        int i11 = iVar.f19606c % this.f19630c;
        int[] iArr2 = this.f19631d;
        int i12 = iArr2[i11];
        if (i12 == -1) {
            iArr2[i11] = i10;
        } else {
            while (true) {
                iArr = this.f19632e;
                int i13 = iArr[i12];
                if (i13 == -1) {
                    break;
                } else {
                    i12 = i13;
                }
            }
            iArr[i12] = i10;
        }
        this.f19632e[i10] = -1;
    }

    private void m(int i10, i iVar, float f10) {
        this.f19633f[i10] = iVar.f19606c;
        this.f19634g[i10] = f10;
        this.f19635h[i10] = -1;
        this.f19636i[i10] = -1;
        iVar.a(this.f19639l);
        iVar.f19616m++;
        this.f19637j++;
    }

    private void o() {
        int i10 = this.f19629b * 2;
        this.f19633f = Arrays.copyOf(this.f19633f, i10);
        this.f19634g = Arrays.copyOf(this.f19634g, i10);
        this.f19635h = Arrays.copyOf(this.f19635h, i10);
        this.f19636i = Arrays.copyOf(this.f19636i, i10);
        this.f19632e = Arrays.copyOf(this.f19632e, i10);
        for (int i11 = this.f19629b; i11 < i10; i11++) {
            this.f19633f[i11] = -1;
            this.f19632e[i11] = -1;
        }
        this.f19629b = i10;
    }

    private void r(i iVar) {
        int[] iArr;
        int i10;
        int i11 = iVar.f19606c;
        int i12 = i11 % this.f19630c;
        int[] iArr2 = this.f19631d;
        int i13 = iArr2[i12];
        if (i13 == -1) {
            return;
        }
        if (this.f19633f[i13] == i11) {
            int[] iArr3 = this.f19632e;
            iArr2[i12] = iArr3[i13];
            iArr3[i13] = -1;
            return;
        }
        while (true) {
            iArr = this.f19632e;
            i10 = iArr[i13];
            if (i10 == -1 || this.f19633f[i10] == i11) {
                break;
            } else {
                i13 = i10;
            }
        }
        if (i10 == -1 || this.f19633f[i10] != i11) {
            return;
        }
        iArr[i13] = iArr[i10];
        iArr[i10] = -1;
    }

    @Override // M1.b.a
    public i a(int i10) {
        int i11 = this.f19637j;
        if (i11 == 0) {
            return null;
        }
        int i12 = this.f19638k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10 && i12 != -1) {
                return this.f19640m.f19564d[this.f19633f[i12]];
            }
            i12 = this.f19636i[i12];
            if (i12 == -1) {
                break;
            }
        }
        return null;
    }

    @Override // M1.b.a
    public void b() {
        int i10 = this.f19637j;
        int i11 = this.f19638k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f19634g;
            fArr[i11] = fArr[i11] * (-1.0f);
            i11 = this.f19636i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // M1.b.a
    public int c() {
        return this.f19637j;
    }

    @Override // M1.b.a
    public void clear() {
        int i10 = this.f19637j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarA = a(i11);
            if (iVarA != null) {
                iVarA.l(this.f19639l);
            }
        }
        for (int i12 = 0; i12 < this.f19629b; i12++) {
            this.f19633f[i12] = -1;
            this.f19632e[i12] = -1;
        }
        for (int i13 = 0; i13 < this.f19630c; i13++) {
            this.f19631d[i13] = -1;
        }
        this.f19637j = 0;
        this.f19638k = -1;
    }

    @Override // M1.b.a
    public float d(int i10) {
        int i11 = this.f19637j;
        int i12 = this.f19638k;
        for (int i13 = 0; i13 < i11; i13++) {
            if (i13 == i10) {
                return this.f19634g[i12];
            }
            i12 = this.f19636i[i12];
            if (i12 == -1) {
                return 0.0f;
            }
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public void e(float f10) {
        int i10 = this.f19637j;
        int i11 = this.f19638k;
        for (int i12 = 0; i12 < i10; i12++) {
            float[] fArr = this.f19634g;
            fArr[i11] = fArr[i11] / f10;
            i11 = this.f19636i[i11];
            if (i11 == -1) {
                return;
            }
        }
    }

    @Override // M1.b.a
    public void h(i iVar, float f10, boolean z10) {
        float f11 = f19627n;
        if (f10 <= (-f11) || f10 >= f11) {
            int iP = p(iVar);
            if (iP == -1) {
                j(iVar, f10);
                return;
            }
            float[] fArr = this.f19634g;
            float f12 = fArr[iP] + f10;
            fArr[iP] = f12;
            float f13 = f19627n;
            if (f12 <= (-f13) || f12 >= f13) {
                return;
            }
            fArr[iP] = 0.0f;
            g(iVar, z10);
        }
    }

    @Override // M1.b.a
    public void j(i iVar, float f10) {
        float f11 = f19627n;
        if (f10 > (-f11) && f10 < f11) {
            g(iVar, true);
            return;
        }
        if (this.f19637j == 0) {
            m(0, iVar, f10);
            l(iVar, 0);
            this.f19638k = 0;
            return;
        }
        int iP = p(iVar);
        if (iP != -1) {
            this.f19634g[iP] = f10;
            return;
        }
        if (this.f19637j + 1 >= this.f19629b) {
            o();
        }
        int i10 = this.f19637j;
        int i11 = this.f19638k;
        int i12 = -1;
        for (int i13 = 0; i13 < i10; i13++) {
            int i14 = this.f19633f[i11];
            int i15 = iVar.f19606c;
            if (i14 == i15) {
                this.f19634g[i11] = f10;
                return;
            }
            if (i14 < i15) {
                i12 = i11;
            }
            i11 = this.f19636i[i11];
            if (i11 == -1) {
                break;
            }
        }
        q(i12, iVar, f10);
    }

    @Override // M1.b.a
    public float k(b bVar, boolean z10) {
        float f10 = f(bVar.f19555a);
        g(bVar.f19555a, z10);
        j jVar = (j) bVar.f19559e;
        int iC = jVar.c();
        int i10 = 0;
        int i11 = 0;
        while (i10 < iC) {
            int i12 = jVar.f19633f[i11];
            if (i12 != -1) {
                h(this.f19640m.f19564d[i12], jVar.f19634g[i11] * f10, z10);
                i10++;
            }
            i11++;
        }
        return f10;
    }

    public int p(i iVar) {
        if (this.f19637j != 0 && iVar != null) {
            int i10 = iVar.f19606c;
            int i11 = this.f19631d[i10 % this.f19630c];
            if (i11 == -1) {
                return -1;
            }
            if (this.f19633f[i11] == i10) {
                return i11;
            }
            do {
                i11 = this.f19632e[i11];
                if (i11 == -1) {
                    break;
                }
            } while (this.f19633f[i11] != i10);
            if (i11 != -1 && this.f19633f[i11] == i10) {
                return i11;
            }
        }
        return -1;
    }

    public String toString() {
        String str = hashCode() + " { ";
        int i10 = this.f19637j;
        for (int i11 = 0; i11 < i10; i11++) {
            i iVarA = a(i11);
            if (iVarA != null) {
                String str2 = str + iVarA + " = " + d(i11) + " ";
                int iP = p(iVarA);
                String str3 = str2 + "[p: ";
                String str4 = (this.f19635h[iP] != -1 ? str3 + this.f19640m.f19564d[this.f19633f[this.f19635h[iP]]] : str3 + "none") + ", n: ";
                str = (this.f19636i[iP] != -1 ? str4 + this.f19640m.f19564d[this.f19633f[this.f19636i[iP]]] : str4 + "none") + "]";
            }
        }
        return str + " }";
    }

    j(b bVar, c cVar) {
        this.f19639l = bVar;
        this.f19640m = cVar;
        clear();
    }

    private void q(int i10, i iVar, float f10) {
        int iN = n();
        m(iN, iVar, f10);
        if (i10 != -1) {
            this.f19635h[iN] = i10;
            int[] iArr = this.f19636i;
            iArr[iN] = iArr[i10];
            iArr[i10] = iN;
        } else {
            this.f19635h[iN] = -1;
            if (this.f19637j > 0) {
                this.f19636i[iN] = this.f19638k;
                this.f19638k = iN;
            } else {
                this.f19636i[iN] = -1;
            }
        }
        int i11 = this.f19636i[iN];
        if (i11 != -1) {
            this.f19635h[i11] = iN;
        }
        l(iVar, iN);
    }

    @Override // M1.b.a
    public float f(i iVar) {
        int iP = p(iVar);
        if (iP != -1) {
            return this.f19634g[iP];
        }
        return 0.0f;
    }

    @Override // M1.b.a
    public float g(i iVar, boolean z10) {
        int iP = p(iVar);
        if (iP == -1) {
            return 0.0f;
        }
        r(iVar);
        float f10 = this.f19634g[iP];
        if (this.f19638k == iP) {
            this.f19638k = this.f19636i[iP];
        }
        this.f19633f[iP] = -1;
        int[] iArr = this.f19635h;
        int i10 = iArr[iP];
        if (i10 != -1) {
            int[] iArr2 = this.f19636i;
            iArr2[i10] = iArr2[iP];
        }
        int i11 = this.f19636i[iP];
        if (i11 != -1) {
            iArr[i11] = iArr[iP];
        }
        this.f19637j--;
        iVar.f19616m--;
        if (z10) {
            iVar.l(this.f19639l);
        }
        return f10;
    }

    @Override // M1.b.a
    public boolean i(i iVar) {
        if (p(iVar) != -1) {
            return true;
        }
        return false;
    }
}
