package w6;

/* renamed from: w6.o, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17793o {
    static void a(float[] fArr, int i10, int i11, float[] fArr2) {
        if (i11 == 1) {
            return;
        }
        int i12 = i11 / 2;
        for (int i13 = 0; i13 < i12; i13++) {
            int i14 = i10 + i13;
            float f10 = fArr[i14];
            float f11 = fArr[((i10 + i11) - 1) - i13];
            fArr2[i14] = f10 + f11;
            fArr2[i14 + i12] = (f10 - f11) / (((float) Math.cos(((i13 + 0.5d) * 3.141592653589793d) / i11)) * 2.0f);
        }
        a(fArr2, i10, i12, fArr);
        int i15 = i10 + i12;
        a(fArr2, i15, i12, fArr);
        for (int i16 = 0; i16 < i12 - 1; i16++) {
            int i17 = (i16 * 2) + i10;
            int i18 = i10 + i16;
            fArr[i17] = fArr2[i18];
            int i19 = i18 + i12;
            fArr[i17 + 1] = fArr2[i19] + fArr2[i19 + 1];
        }
        int i20 = i10 + i11;
        fArr[i20 - 2] = fArr2[i15 - 1];
        int i21 = i20 - 1;
        fArr[i21] = fArr2[i21];
    }
}
