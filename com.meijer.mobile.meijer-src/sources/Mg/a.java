package Mg;

import com.google.zxing.FormatException;

/* loaded from: classes8.dex */
final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Ig.b f19878a;

    /* renamed from: b, reason: collision with root package name */
    private final Ig.b f19879b;

    /* renamed from: c, reason: collision with root package name */
    private final e f19880c;

    private Ig.b a(Ig.b bVar) {
        int iF = this.f19880c.f();
        int iE = this.f19880c.e();
        if (bVar.j() != iF) {
            throw new IllegalArgumentException("Dimension of bitMatrix must match the version size");
        }
        int iC = this.f19880c.c();
        int iB = this.f19880c.b();
        int i10 = iF / iC;
        int i11 = iE / iB;
        Ig.b bVar2 = new Ig.b(i11 * iB, i10 * iC);
        for (int i12 = 0; i12 < i10; i12++) {
            int i13 = i12 * iC;
            for (int i14 = 0; i14 < i11; i14++) {
                int i15 = i14 * iB;
                for (int i16 = 0; i16 < iC; i16++) {
                    int i17 = ((iC + 2) * i12) + 1 + i16;
                    int i18 = i13 + i16;
                    for (int i19 = 0; i19 < iB; i19++) {
                        if (bVar.f(((iB + 2) * i14) + 1 + i19, i17)) {
                            bVar2.q(i15 + i19, i18);
                        }
                    }
                }
            }
        }
        return bVar2;
    }

    private int d(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        if (h(i12, 1, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(i12, 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        int i17 = i11 - 1;
        if (h(0, i17, i10, i11)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        if (h(1, i17, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        if (h(2, i17, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        return h(3, i17, i10, i11) ? i20 | 1 : i20;
    }

    private int e(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 4, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        if (h(0, i11 - 3, i10, i11)) {
            i15 |= 1;
        }
        int i16 = i15 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i16 |= 1;
        }
        int i17 = i16 << 1;
        int i18 = i11 - 1;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        return h(1, i18, i10, i11) ? i19 | 1 : i19;
    }

    private int f(int i10, int i11) {
        int i12 = i10 - 1;
        int i13 = (h(i12, 0, i10, i11) ? 1 : 0) << 1;
        int i14 = i11 - 1;
        if (h(i12, i14, i10, i11)) {
            i13 |= 1;
        }
        int i15 = i13 << 1;
        int i16 = i11 - 3;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        int i18 = i11 - 2;
        if (h(0, i18, i10, i11)) {
            i17 |= 1;
        }
        int i19 = i17 << 1;
        if (h(0, i14, i10, i11)) {
            i19 |= 1;
        }
        int i20 = i19 << 1;
        if (h(1, i16, i10, i11)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(1, i18, i10, i11)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        return h(1, i14, i10, i11) ? i22 | 1 : i22;
    }

    private int g(int i10, int i11) {
        int i12 = (h(i10 + (-3), 0, i10, i11) ? 1 : 0) << 1;
        if (h(i10 - 2, 0, i10, i11)) {
            i12 |= 1;
        }
        int i13 = i12 << 1;
        if (h(i10 - 1, 0, i10, i11)) {
            i13 |= 1;
        }
        int i14 = i13 << 1;
        if (h(0, i11 - 2, i10, i11)) {
            i14 |= 1;
        }
        int i15 = i14 << 1;
        int i16 = i11 - 1;
        if (h(0, i16, i10, i11)) {
            i15 |= 1;
        }
        int i17 = i15 << 1;
        if (h(1, i16, i10, i11)) {
            i17 |= 1;
        }
        int i18 = i17 << 1;
        if (h(2, i16, i10, i11)) {
            i18 |= 1;
        }
        int i19 = i18 << 1;
        return h(3, i16, i10, i11) ? i19 | 1 : i19;
    }

    private boolean h(int i10, int i11, int i12, int i13) {
        if (i10 < 0) {
            i10 += i12;
            i11 += 4 - ((i12 + 4) & 7);
        }
        if (i11 < 0) {
            i11 += i13;
            i10 += 4 - ((i13 + 4) & 7);
        }
        if (i10 >= i12) {
            i10 -= i12;
        }
        this.f19879b.q(i11, i10);
        return this.f19878a.f(i11, i10);
    }

    private int i(int i10, int i11, int i12, int i13) {
        int i14 = i10 - 2;
        int i15 = i11 - 2;
        int i16 = (h(i14, i15, i12, i13) ? 1 : 0) << 1;
        int i17 = i11 - 1;
        if (h(i14, i17, i12, i13)) {
            i16 |= 1;
        }
        int i18 = i16 << 1;
        int i19 = i10 - 1;
        if (h(i19, i15, i12, i13)) {
            i18 |= 1;
        }
        int i20 = i18 << 1;
        if (h(i19, i17, i12, i13)) {
            i20 |= 1;
        }
        int i21 = i20 << 1;
        if (h(i19, i11, i12, i13)) {
            i21 |= 1;
        }
        int i22 = i21 << 1;
        if (h(i10, i15, i12, i13)) {
            i22 |= 1;
        }
        int i23 = i22 << 1;
        if (h(i10, i17, i12, i13)) {
            i23 |= 1;
        }
        int i24 = i23 << 1;
        return h(i10, i11, i12, i13) ? i24 | 1 : i24;
    }

    e b() {
        return this.f19880c;
    }

    byte[] c() throws FormatException {
        byte[] bArr = new byte[this.f19880c.g()];
        int iJ = this.f19878a.j();
        int iM = this.f19878a.m();
        int i10 = 0;
        boolean z10 = false;
        int i11 = 0;
        boolean z11 = false;
        boolean z12 = false;
        boolean z13 = false;
        int i12 = 4;
        while (true) {
            if (i12 == iJ && i10 == 0 && !z10) {
                bArr[i11] = (byte) d(iJ, iM);
                i12 -= 2;
                i10 += 2;
                i11++;
                z10 = true;
            } else {
                int i13 = iJ - 2;
                if (i12 == i13 && i10 == 0 && (iM & 3) != 0 && !z11) {
                    bArr[i11] = (byte) e(iJ, iM);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z11 = true;
                } else if (i12 == iJ + 4 && i10 == 2 && (iM & 7) == 0 && !z12) {
                    bArr[i11] = (byte) f(iJ, iM);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z12 = true;
                } else if (i12 == i13 && i10 == 0 && (iM & 7) == 4 && !z13) {
                    bArr[i11] = (byte) g(iJ, iM);
                    i12 -= 2;
                    i10 += 2;
                    i11++;
                    z13 = true;
                } else {
                    while (true) {
                        if (i12 < iJ && i10 >= 0 && !this.f19879b.f(i10, i12)) {
                            bArr[i11] = (byte) i(i12, i10, iJ, iM);
                            i11++;
                        }
                        int i14 = i12 - 2;
                        int i15 = i10 + 2;
                        if (i14 < 0 || i15 >= iM) {
                            break;
                        }
                        i12 = i14;
                        i10 = i15;
                    }
                    int i16 = i12 - 1;
                    int i17 = i10 + 5;
                    while (true) {
                        if (i16 >= 0 && i17 < iM && !this.f19879b.f(i17, i16)) {
                            bArr[i11] = (byte) i(i16, i17, iJ, iM);
                            i11++;
                        }
                        int i18 = i16 + 2;
                        int i19 = i17 - 2;
                        if (i18 >= iJ || i19 < 0) {
                            break;
                        }
                        i16 = i18;
                        i17 = i19;
                    }
                    i12 = i16 + 5;
                    i10 = i17 - 1;
                }
            }
            if (i12 >= iJ && i10 >= iM) {
                break;
            }
        }
        if (i11 == this.f19880c.g()) {
            return bArr;
        }
        throw FormatException.a();
    }

    a(Ig.b bVar) throws FormatException {
        int iJ = bVar.j();
        if (iJ >= 8 && iJ <= 144 && (iJ & 1) == 0) {
            this.f19880c = j(bVar);
            Ig.b bVarA = a(bVar);
            this.f19878a = bVarA;
            this.f19879b = new Ig.b(bVarA.m(), bVarA.j());
            return;
        }
        throw FormatException.a();
    }

    private static e j(Ig.b bVar) throws FormatException {
        return e.h(bVar.j(), bVar.m());
    }
}
