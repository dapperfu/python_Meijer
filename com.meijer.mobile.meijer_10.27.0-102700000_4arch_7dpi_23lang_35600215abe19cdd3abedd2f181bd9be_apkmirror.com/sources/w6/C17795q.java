package w6;

import java.util.Arrays;

/* renamed from: w6.q, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17795q {
    static float b(float[] fArr, float f10) {
        int length = fArr.length;
        Float[] fArr2 = new Float[length];
        for (int i10 = 0; i10 < length; i10++) {
            fArr2[i10] = Float.valueOf(Math.abs(fArr[i10]));
        }
        Arrays.sort(fArr2);
        float fFloatValue = fArr2[(int) Math.floor((length - 1) * f10)].floatValue();
        for (int i11 = 0; i11 < length; i11++) {
            if (Math.abs(fArr[i11]) < fFloatValue) {
                fArr[i11] = 0.0f;
            }
        }
        return fFloatValue;
    }

    static String d(float[] fArr, float f10, float f11) {
        int length = fArr.length;
        StringBuilder sb2 = new StringBuilder();
        float f12 = (f11 - f10) / 60.0f;
        for (int i10 = 0; i10 < length; i10++) {
            char cFloor = (char) (((int) Math.floor((fArr[i10] - f10) / f12)) + 65);
            if (fArr[i10] == f11) {
                cFloor = '}';
            }
            sb2.append(a(cFloor));
        }
        return sb2.toString();
    }

    private static char a(char c10) {
        if (c10 == '\\') {
            return '.';
        }
        if (c10 == '.') {
            return '\\';
        }
        return c10;
    }

    public static long c(long j10) {
        if (j10 == 0) {
            return 0L;
        }
        long j11 = j10 | (j10 >>> 1);
        long j12 = j11 | (j11 >>> 2);
        long j13 = j12 | (j12 >>> 4);
        long j14 = j13 | (j13 >>> 8);
        long j15 = j14 | (j14 >>> 16);
        return j15 - (j15 >>> 1);
    }
}
