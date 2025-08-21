package t6;

import android.graphics.Color;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes4.dex */
public class o implements N<q6.d> {

    /* renamed from: a, reason: collision with root package name */
    private int f162319a;

    private int d(float f10, int i10, float[] fArr, float[] fArr2) {
        float fI;
        if (fArr2.length < 2 || f10 <= fArr[0]) {
            return Color.argb((int) (fArr2[0] * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
        }
        for (int i11 = 1; i11 < fArr.length; i11++) {
            float f11 = fArr[i11];
            if (f11 >= f10 || i11 == fArr.length - 1) {
                if (f11 <= f10) {
                    fI = fArr2[i11];
                } else {
                    int i12 = i11 - 1;
                    float f12 = fArr[i12];
                    fI = v6.l.i(fArr2[i12], fArr2[i11], (f10 - f12) / (f11 - f12));
                }
                return Color.argb((int) (fI * 255.0f), Color.red(i10), Color.green(i10), Color.blue(i10));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    protected static float[] e(float[] fArr, float[] fArr2) {
        if (fArr.length == 0) {
            return fArr2;
        }
        if (fArr2.length == 0) {
            return fArr;
        }
        int length = fArr.length + fArr2.length;
        float[] fArr3 = new float[length];
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < length; i13++) {
            float f10 = i11 < fArr.length ? fArr[i11] : Float.NaN;
            float f11 = i12 < fArr2.length ? fArr2[i12] : Float.NaN;
            if (Float.isNaN(f11) || f10 < f11) {
                fArr3[i13] = f10;
                i11++;
            } else if (Float.isNaN(f10) || f11 < f10) {
                fArr3[i13] = f11;
                i12++;
            } else {
                fArr3[i13] = f10;
                i11++;
                i12++;
                i10++;
            }
        }
        return i10 == 0 ? fArr3 : Arrays.copyOf(fArr3, length - i10);
    }

    int c(float f10, float f11, float[] fArr, int[] iArr) {
        if (iArr.length < 2 || f10 == fArr[0]) {
            return iArr[0];
        }
        for (int i10 = 1; i10 < fArr.length; i10++) {
            float f12 = fArr[i10];
            if (f12 >= f10 || i10 == fArr.length - 1) {
                if (i10 == fArr.length - 1 && f10 >= f12) {
                    return Color.argb((int) (f11 * 255.0f), Color.red(iArr[i10]), Color.green(iArr[i10]), Color.blue(iArr[i10]));
                }
                int i11 = i10 - 1;
                float f13 = fArr[i11];
                int iC = v6.e.c((f10 - f13) / (f12 - f13), iArr[i11], iArr[i10]);
                return Color.argb((int) (f11 * 255.0f), Color.red(iC), Color.green(iC), Color.blue(iC));
            }
        }
        throw new IllegalArgumentException("Unreachable code.");
    }

    private q6.d b(q6.d dVar, List<Float> list) {
        int i10 = this.f162319a * 4;
        if (list.size() <= i10) {
            return dVar;
        }
        float[] fArrE = dVar.e();
        int[] iArrD = dVar.d();
        int size = (list.size() - i10) / 2;
        float[] fArr = new float[size];
        float[] fArr2 = new float[size];
        int i11 = 0;
        while (i10 < list.size()) {
            if (i10 % 2 == 0) {
                fArr[i11] = list.get(i10).floatValue();
            } else {
                fArr2[i11] = list.get(i10).floatValue();
                i11++;
            }
            i10++;
        }
        float[] fArrE2 = e(dVar.e(), fArr);
        int length = fArrE2.length;
        int[] iArr = new int[length];
        for (int i12 = 0; i12 < length; i12++) {
            float f10 = fArrE2[i12];
            int iBinarySearch = Arrays.binarySearch(fArrE, f10);
            int iBinarySearch2 = Arrays.binarySearch(fArr, f10);
            if (iBinarySearch < 0 || iBinarySearch2 > 0) {
                if (iBinarySearch2 < 0) {
                    iBinarySearch2 = -(iBinarySearch2 + 1);
                }
                iArr[i12] = c(f10, fArr2[iBinarySearch2], fArrE, iArrD);
            } else {
                iArr[i12] = d(f10, iArrD[iBinarySearch], fArr, fArr2);
            }
        }
        return new q6.d(fArrE2, iArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00cf  */
    @Override // t6.N
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public q6.d a(u6.AbstractC17353c r18, float r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 223
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t6.o.a(u6.c, float):q6.d");
    }

    public o(int i10) {
        this.f162319a = i10;
    }
}
