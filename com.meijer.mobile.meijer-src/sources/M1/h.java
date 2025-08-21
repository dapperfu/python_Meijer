package M1;

import M1.b;
import java.util.Arrays;
import java.util.Comparator;

/* loaded from: classes.dex */
public class h extends M1.b {

    /* renamed from: g, reason: collision with root package name */
    private int f19593g;

    /* renamed from: h, reason: collision with root package name */
    private i[] f19594h;

    /* renamed from: i, reason: collision with root package name */
    private i[] f19595i;

    /* renamed from: j, reason: collision with root package name */
    private int f19596j;

    /* renamed from: k, reason: collision with root package name */
    b f19597k;

    /* renamed from: l, reason: collision with root package name */
    c f19598l;

    class a implements Comparator<i> {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(i iVar, i iVar2) {
            return iVar.f19606c - iVar2.f19606c;
        }
    }

    class b {

        /* renamed from: a, reason: collision with root package name */
        i f19600a;

        /* renamed from: b, reason: collision with root package name */
        h f19601b;

        public b(h hVar) {
            this.f19601b = hVar;
        }

        public boolean a(i iVar, float f10) {
            boolean z10 = true;
            if (!this.f19600a.f19604a) {
                for (int i10 = 0; i10 < 9; i10++) {
                    float f11 = iVar.f19612i[i10];
                    if (f11 != 0.0f) {
                        float f12 = f11 * f10;
                        if (Math.abs(f12) < 1.0E-4f) {
                            f12 = 0.0f;
                        }
                        this.f19600a.f19612i[i10] = f12;
                    } else {
                        this.f19600a.f19612i[i10] = 0.0f;
                    }
                }
                return true;
            }
            for (int i11 = 0; i11 < 9; i11++) {
                float[] fArr = this.f19600a.f19612i;
                float f13 = fArr[i11] + (iVar.f19612i[i11] * f10);
                fArr[i11] = f13;
                if (Math.abs(f13) < 1.0E-4f) {
                    this.f19600a.f19612i[i11] = 0.0f;
                } else {
                    z10 = false;
                }
            }
            if (z10) {
                h.this.G(this.f19600a);
            }
            return false;
        }

        public void b(i iVar) {
            this.f19600a = iVar;
        }

        public final boolean c() {
            for (int i10 = 8; i10 >= 0; i10--) {
                float f10 = this.f19600a.f19612i[i10];
                if (f10 > 0.0f) {
                    return false;
                }
                if (f10 < 0.0f) {
                    return true;
                }
            }
            return false;
        }

        public final boolean d(i iVar) {
            int i10 = 8;
            while (true) {
                if (i10 < 0) {
                    break;
                }
                float f10 = iVar.f19612i[i10];
                float f11 = this.f19600a.f19612i[i10];
                if (f11 == f10) {
                    i10--;
                } else if (f11 < f10) {
                    return true;
                }
            }
            return false;
        }

        public void e() {
            Arrays.fill(this.f19600a.f19612i, 0.0f);
        }

        public String toString() {
            String str = "[ ";
            if (this.f19600a != null) {
                for (int i10 = 0; i10 < 9; i10++) {
                    str = str + this.f19600a.f19612i[i10] + " ";
                }
            }
            return str + "] " + this.f19600a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G(i iVar) {
        int i10 = 0;
        while (i10 < this.f19596j) {
            if (this.f19594h[i10] == iVar) {
                while (true) {
                    int i11 = this.f19596j;
                    if (i10 >= i11 - 1) {
                        this.f19596j = i11 - 1;
                        iVar.f19604a = false;
                        return;
                    } else {
                        i[] iVarArr = this.f19594h;
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
    @Override // M1.b, M1.d.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public M1.i b(M1.d r5, boolean[] r6) {
        /*
            r4 = this;
            r5 = -1
            r0 = 0
            r1 = r5
        L3:
            int r2 = r4.f19596j
            if (r0 >= r2) goto L32
            M1.i[] r2 = r4.f19594h
            r2 = r2[r0]
            int r3 = r2.f19606c
            boolean r3 = r6[r3]
            if (r3 == 0) goto L12
            goto L2f
        L12:
            M1.h$b r3 = r4.f19597k
            r3.b(r2)
            if (r1 != r5) goto L22
            M1.h$b r2 = r4.f19597k
            boolean r2 = r2.c()
            if (r2 == 0) goto L2f
            goto L2e
        L22:
            M1.h$b r2 = r4.f19597k
            M1.i[] r3 = r4.f19594h
            r3 = r3[r1]
            boolean r2 = r2.d(r3)
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
            M1.i[] r5 = r4.f19594h
            r5 = r5[r1]
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: M1.h.b(M1.d, boolean[]):M1.i");
    }

    @Override // M1.b, M1.d.a
    public void clear() {
        this.f19596j = 0;
        this.f19556b = 0.0f;
    }

    private final void F(i iVar) {
        int i10;
        int i11 = this.f19596j + 1;
        i[] iVarArr = this.f19594h;
        if (i11 > iVarArr.length) {
            i[] iVarArr2 = (i[]) Arrays.copyOf(iVarArr, iVarArr.length * 2);
            this.f19594h = iVarArr2;
            this.f19595i = (i[]) Arrays.copyOf(iVarArr2, iVarArr2.length * 2);
        }
        i[] iVarArr3 = this.f19594h;
        int i12 = this.f19596j;
        iVarArr3[i12] = iVar;
        int i13 = i12 + 1;
        this.f19596j = i13;
        if (i13 > 1 && iVarArr3[i12].f19606c > iVar.f19606c) {
            int i14 = 0;
            while (true) {
                i10 = this.f19596j;
                if (i14 >= i10) {
                    break;
                }
                this.f19595i[i14] = this.f19594h[i14];
                i14++;
            }
            Arrays.sort(this.f19595i, 0, i10, new a());
            for (int i15 = 0; i15 < this.f19596j; i15++) {
                this.f19594h[i15] = this.f19595i[i15];
            }
        }
        iVar.f19604a = true;
        iVar.a(this);
    }

    @Override // M1.b
    public void B(d dVar, M1.b bVar, boolean z10) {
        i iVar = bVar.f19555a;
        if (iVar == null) {
            return;
        }
        b.a aVar = bVar.f19559e;
        int iC = aVar.c();
        for (int i10 = 0; i10 < iC; i10++) {
            i iVarA = aVar.a(i10);
            float fD = aVar.d(i10);
            this.f19597k.b(iVarA);
            if (this.f19597k.a(iVar, fD)) {
                F(iVarA);
            }
            this.f19556b += bVar.f19556b * fD;
        }
        G(iVar);
    }

    @Override // M1.b, M1.d.a
    public void c(i iVar) {
        this.f19597k.b(iVar);
        this.f19597k.e();
        iVar.f19612i[iVar.f19608e] = 1.0f;
        F(iVar);
    }

    @Override // M1.b, M1.d.a
    public boolean isEmpty() {
        return this.f19596j == 0;
    }

    @Override // M1.b
    public String toString() {
        String str = " goal -> (" + this.f19556b + ") : ";
        for (int i10 = 0; i10 < this.f19596j; i10++) {
            this.f19597k.b(this.f19594h[i10]);
            str = str + this.f19597k + " ";
        }
        return str;
    }

    public h(c cVar) {
        super(cVar);
        this.f19593g = 128;
        this.f19594h = new i[128];
        this.f19595i = new i[128];
        this.f19596j = 0;
        this.f19597k = new b(this);
        this.f19598l = cVar;
    }
}
