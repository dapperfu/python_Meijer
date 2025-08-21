package U1;

import U1.b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h extends U1.b {

    /* renamed from: g, reason: collision with root package name */
    private int f36991g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f36992h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f36993i;

    /* renamed from: j, reason: collision with root package name */
    private int f36994j;

    /* renamed from: k, reason: collision with root package name */
    b f36995k;

    /* renamed from: l, reason: collision with root package name */
    c f36996l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f37004c - iVar2.f37004c;
        }
    }

    class b implements Comparable {

        /* renamed from: a, reason: collision with root package name */
        i f36998a;

        /* renamed from: b, reason: collision with root package name */
        h f36999b;

        public b(h hVar) {
            this.f36999b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f36998a.f37002a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f37010i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f36998a.f37010i[i10] = f12;
                    } else {
                        this.f36998a.f37010i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f36998a.f37010i;
                float f13 = fArr[i11] + (iVar.f37010i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f36998a.f37010i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f36998a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f36998a = iVar;
        }

        @Override // java.lang.Comparable
        public int compareTo(Object obj) {
            return this.f36998a.f37004c - ((i) obj).f37004c;
        }

        public final boolean e() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f36998a.f37010i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean l(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f37010i[i10];
                float f11 = this.f36998a.f37010i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void m() {
            Arrays.fill(this.f36998a.f37010i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f36998a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f36998a.f37010i[i10] + " ";
                }
            }
            return str + "] " + this.f36998a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f36994j) {
            if (this.f36992h[i10] == iVar) {
                while (true) {
                    int i11 = this.f36994j;
                    if (i10 >= i11 - 1) {
                        this.f36994j = i11 - 1;
                        iVar.f37002a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f36992h;
                        int i12 = i10 + 1;
                        iVarArr[i10] = iVarArr[i12];
                        i10 = i12;
                    }
                }
            } else {
                i10++;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    @Override // U1.b, U1.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public U1.i a(U1.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f36994j
            if (r0 >= r2) goto L32
            U1.i[] r2 = r4.f36992h
            r2 = r2[r0]
            int r3 = r2.f37004c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            U1.h$b r3 = r4.f36995k
            r3.b(r2)
            if (r1 != r5) goto L22
            U1.h$b r2 = r4.f36995k
            boolean r2 = r2.e()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            U1.h$b r2 = r4.f36995k
            U1.i[] r3 = r4.f36992h
            r3 = r3[r1]
            boolean r2 = r2.l(r3)
            if (r2 == 0) goto L2f
        L2e:
            r1 = r0
        L2f:
            int r0 = r0 + 1
            goto L3
        L32:
            if (r1 != r5) goto L36
            r5 = 0
            return r5
        L36:
            U1.i[] r5 = r4.f36992h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: U1.h.a(U1.d, boolean[]):U1.i");
    }

    @Override // U1.b, U1.d.a
    public void clear() {
        this.f36994j = 0;
        this.f36959b = 0.0f;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f36994j + 1;
        i[] iVarArr = this.f36992h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f36992h = iVarArr2;
            this.f36993i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f36992h;
        int i12 = this.f36994j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f36994j = i13;
        if (i13 > 1 && iVarArr3[i12].f37004c > iVar.f37004c) {
            int i14 = 0;
            while (true) {
                i10 = this.f36994j;
                if (i14 >= i10) {
                    break;
                }
                this.f36993i[i14] = this.f36992h[i14];
                i14++;
            }
            Arrays.sort(this.f36993i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f36994j; i15++) {
                this.f36992h[i15] = this.f36993i[i15];
            }
        }
        iVar.f37002a = true;
        iVar.a(this);
    }

    @Override // U1.b
    public void C(U1.b bVar, boolean z10) {
        i iVar = bVar.f36958a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f36962e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarA = aVar.a(i10);
            float fD = aVar.d(i10);
            this.f36995k.b(iVarA);
            if (this.f36995k.a(iVar, fD)) {
                F(iVarA);
            }
            this.f36959b += bVar.f36959b * fD;
        }
        G(iVar);
    }

    @Override // U1.b, U1.d.a
    public void c(i iVar) {
        this.f36995k.b(iVar);
        this.f36995k.m();
        iVar.f37010i[iVar.f37006e] = 1.0f;
        F(iVar);
    }

    @Override // U1.b
    public String toString() {
        String str = " goal -> (" + this.f36959b + ") : ";
        for (int i10 = 0; i10 < this.f36994j; i10++) {
            this.f36995k.b(this.f36992h[i10]);
            str = str + this.f36995k + " ";
        }
        return str;
    }

    public h(c cVar) {
        super(cVar);
        this.f36991g = 128;
        this.f36992h = new i[128];
        this.f36993i = new i[128];
        this.f36994j = 0;
        this.f36995k = new b(this);
        this.f36996l = cVar;
    }
}
