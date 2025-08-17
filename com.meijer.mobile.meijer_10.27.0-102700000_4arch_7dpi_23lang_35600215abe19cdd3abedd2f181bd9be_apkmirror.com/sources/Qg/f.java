package Qg;

/* loaded from: classes7.dex */
public final class f {
    private static int a(int i10, int i11) {
        int i12 = i10 - i11;
        if (i12 <= i11) {
            i12 = i11;
            i11 = i12;
        }
        int i13 = 1;
        int i14 = 1;
        while (i10 > i12) {
            i13 *= i10;
            if (i14 <= i11) {
                i13 /= i14;
                i14++;
            }
            i10--;
        }
        while (i14 <= i11) {
            i13 /= i14;
            i14++;
        }
        return i13;
    }

    public static int b(int[] iArr, int i10, boolean z10) {
        boolean z11;
        int[] iArr2 = iArr;
        int i11 = 0;
        for (int i12 : iArr2) {
            i11 += i12;
        }
        int length = iArr2.length;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        while (true) {
            int i16 = length - 1;
            if (i13 >= i16) {
                return i14;
            }
            int i17 = 1 << i13;
            i15 |= i17;
            int i18 = 1;
            while (i18 < iArr2[i13]) {
                int i19 = i11 - i18;
                int i20 = length - i13;
                int i21 = i20 - 2;
                int iA = a(i19 - 1, i21);
                if (z10 && i15 == 0) {
                    int i22 = i20 - 1;
                    if (i19 - i22 >= i22) {
                        iA -= a(i19 - i20, i21);
                    }
                }
                boolean z12 = true;
                if (i20 - 1 > 1) {
                    int i23 = i19 - i21;
                    int iA2 = 0;
                    while (i23 > i10) {
                        iA2 += a((i19 - i23) - 1, i20 - 3);
                        i23--;
                        z12 = z12;
                    }
                    z11 = z12;
                    iA -= iA2 * (i16 - i13);
                } else {
                    z11 = true;
                    if (i19 > i10) {
                        iA--;
                    }
                }
                i14 += iA;
                i18++;
                i15 &= ~i17;
                iArr2 = iArr;
            }
            i11 -= i18;
            i13++;
            iArr2 = iArr;
        }
    }
}
