package Ig;

/* loaded from: classes7.dex */
final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f13884a;

    /* renamed from: b, reason: collision with root package name */
    private final int[] f13885b;

    int c(int i10) {
        if (i10 == 0) {
            return d(0);
        }
        if (i10 == 1) {
            int iA = 0;
            for (int i11 : this.f13885b) {
                iA = a.a(iA, i11);
            }
            return iA;
        }
        int[] iArr = this.f13885b;
        int iA2 = iArr[0];
        int length = iArr.length;
        for (int i12 = 1; i12 < length; i12++) {
            iA2 = a.a(this.f13884a.j(i10, iA2), this.f13885b[i12]);
        }
        return iA2;
    }

    b a(b bVar) {
        if (!this.f13884a.equals(bVar.f13884a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g()) {
            return bVar;
        }
        if (bVar.g()) {
            return this;
        }
        int[] iArr = this.f13885b;
        int[] iArr2 = bVar.f13885b;
        if (iArr.length <= iArr2.length) {
            iArr = iArr2;
            iArr2 = iArr;
        }
        int[] iArr3 = new int[iArr.length];
        int length = iArr.length - iArr2.length;
        System.arraycopy(iArr, 0, iArr3, 0, length);
        for (int i10 = length; i10 < iArr.length; i10++) {
            iArr3[i10] = a.a(iArr2[i10 - length], iArr[i10]);
        }
        return new b(this.f13884a, iArr3);
    }

    b[] b(b bVar) {
        if (!this.f13884a.equals(bVar.f13884a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (bVar.g()) {
            throw new IllegalArgumentException("Divide by 0");
        }
        b bVarG = this.f13884a.g();
        int iH = this.f13884a.h(bVar.d(bVar.f()));
        b bVarA = this;
        while (bVarA.f() >= bVar.f() && !bVarA.g()) {
            int iF = bVarA.f() - bVar.f();
            int iJ = this.f13884a.j(bVarA.d(bVarA.f()), iH);
            b bVarJ = bVar.j(iF, iJ);
            bVarG = bVarG.a(this.f13884a.b(iF, iJ));
            bVarA = bVarA.a(bVarJ);
        }
        return new b[]{bVarG, bVarA};
    }

    int d(int i10) {
        return this.f13885b[(r0.length - 1) - i10];
    }

    int[] e() {
        return this.f13885b;
    }

    int f() {
        return this.f13885b.length - 1;
    }

    boolean g() {
        return this.f13885b[0] == 0;
    }

    b h(int i10) {
        if (i10 == 0) {
            return this.f13884a.g();
        }
        if (i10 == 1) {
            return this;
        }
        int length = this.f13885b.length;
        int[] iArr = new int[length];
        for (int i11 = 0; i11 < length; i11++) {
            iArr[i11] = this.f13884a.j(this.f13885b[i11], i10);
        }
        return new b(this.f13884a, iArr);
    }

    b i(b bVar) {
        if (!this.f13884a.equals(bVar.f13884a)) {
            throw new IllegalArgumentException("GenericGFPolys do not have same GenericGF field");
        }
        if (g() || bVar.g()) {
            return this.f13884a.g();
        }
        int[] iArr = this.f13885b;
        int length = iArr.length;
        int[] iArr2 = bVar.f13885b;
        int length2 = iArr2.length;
        int[] iArr3 = new int[(length + length2) - 1];
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = iArr[i10];
            for (int i12 = 0; i12 < length2; i12++) {
                int i13 = i10 + i12;
                iArr3[i13] = a.a(iArr3[i13], this.f13884a.j(i11, iArr2[i12]));
            }
        }
        return new b(this.f13884a, iArr3);
    }

    b j(int i10, int i11) {
        if (i10 < 0) {
            throw new IllegalArgumentException();
        }
        if (i11 == 0) {
            return this.f13884a.g();
        }
        int length = this.f13885b.length;
        int[] iArr = new int[i10 + length];
        for (int i12 = 0; i12 < length; i12++) {
            iArr[i12] = this.f13884a.j(this.f13885b[i12], i11);
        }
        return new b(this.f13884a, iArr);
    }

    b(a aVar, int[] iArr) {
        if (iArr.length != 0) {
            this.f13884a = aVar;
            int length = iArr.length;
            int i10 = 1;
            if (length > 1 && iArr[0] == 0) {
                while (i10 < length && iArr[i10] == 0) {
                    i10++;
                }
                if (i10 == length) {
                    this.f13885b = new int[]{0};
                    return;
                }
                int[] iArr2 = new int[length - i10];
                this.f13885b = iArr2;
                System.arraycopy(iArr, i10, iArr2, 0, iArr2.length);
                return;
            }
            this.f13885b = iArr;
            return;
        }
        throw new IllegalArgumentException();
    }

    public String toString() {
        if (g()) {
            return "0";
        }
        StringBuilder sb2 = new StringBuilder(f() * 8);
        for (int iF = f(); iF >= 0; iF--) {
            int iD = d(iF);
            if (iD != 0) {
                if (iD < 0) {
                    if (iF == f()) {
                        sb2.append("-");
                    } else {
                        sb2.append(" - ");
                    }
                    iD = -iD;
                } else if (sb2.length() > 0) {
                    sb2.append(" + ");
                }
                if (iF == 0 || iD != 1) {
                    int i10 = this.f13884a.i(iD);
                    if (i10 == 0) {
                        sb2.append('1');
                    } else if (i10 == 1) {
                        sb2.append('a');
                    } else {
                        sb2.append("a^");
                        sb2.append(i10);
                    }
                }
                if (iF != 0) {
                    if (iF == 1) {
                        sb2.append('x');
                    } else {
                        sb2.append("x^");
                        sb2.append(iF);
                    }
                }
            }
        }
        return sb2.toString();
    }
}
