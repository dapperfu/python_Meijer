package Ug;

import java.lang.reflect.Array;

/* loaded from: classes7.dex */
final class i {

    /* renamed from: a, reason: collision with root package name */
    private static final float[][] f36037a = (float[][]) Array.newInstance((Class<?>) Float.TYPE, Tg.a.f34973b.length, 8);

    static {
        int i10;
        int i11 = 0;
        while (true) {
            int[] iArr = Tg.a.f34973b;
            if (i11 >= iArr.length) {
                return;
            }
            int i12 = iArr[i11];
            int i13 = i12 & 1;
            int i14 = 0;
            while (i14 < 8) {
                float f10 = 0.0f;
                while (true) {
                    i10 = i12 & 1;
                    if (i10 == i13) {
                        f10 += 1.0f;
                        i12 >>= 1;
                    }
                }
                f36037a[i11][7 - i14] = f10 / 17.0f;
                i14++;
                i13 = i10;
            }
            i11++;
        }
    }

    private static int a(int[] iArr) {
        long j10 = 0;
        for (int i10 = 0; i10 < iArr.length; i10++) {
            for (int i11 = 0; i11 < iArr[i10]; i11++) {
                int i12 = 1;
                long j11 = j10 << 1;
                if (i10 % 2 != 0) {
                    i12 = 0;
                }
                j10 = j11 | i12;
            }
        }
        return (int) j10;
    }

    private static int b(int[] iArr) {
        int iD = Hg.a.d(iArr);
        float[] fArr = new float[8];
        if (iD > 1) {
            for (int i10 = 0; i10 < 8; i10++) {
                fArr[i10] = iArr[i10] / iD;
            }
        }
        float f10 = Float.MAX_VALUE;
        int i11 = -1;
        int i12 = 0;
        while (true) {
            float[][] fArr2 = f36037a;
            if (i12 < fArr2.length) {
                float[] fArr3 = fArr2[i12];
                float f11 = 0.0f;
                for (int i13 = 0; i13 < 8; i13++) {
                    float f12 = fArr3[i13] - fArr[i13];
                    f11 += f12 * f12;
                    if (f11 >= f10) {
                        break;
                    }
                }
                if (f11 < f10) {
                    i11 = Tg.a.f34973b[i12];
                    f10 = f11;
                }
                i12++;
            } else {
                return i11;
            }
        }
    }

    private static int c(int[] iArr) {
        int iA = a(iArr);
        if (Tg.a.a(iA) == -1) {
            return -1;
        }
        return iA;
    }

    static int d(int[] iArr) {
        int iC = c(e(iArr));
        if (iC != -1) {
            return iC;
        }
        return b(iArr);
    }

    private static int[] e(int[] iArr) {
        float fD = Hg.a.d(iArr);
        int[] iArr2 = new int[8];
        int i10 = 0;
        int i11 = 0;
        for (int i12 = 0; i12 < 17; i12++) {
            float f10 = (fD / 34.0f) + ((i12 * fD) / 17.0f);
            int i13 = iArr[i11];
            if (i10 + i13 <= f10) {
                i10 += i13;
                i11++;
            }
            iArr2[i11] = iArr2[i11] + 1;
        }
        return iArr2;
    }
}
