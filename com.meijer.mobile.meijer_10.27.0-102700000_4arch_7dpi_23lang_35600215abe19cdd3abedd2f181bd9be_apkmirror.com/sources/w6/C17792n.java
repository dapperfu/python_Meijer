package w6;

import android.util.Pair;

/* renamed from: w6.n, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C17792n {
    private static Pair<Float, Float> b(float[] fArr) {
        float f10 = fArr[0];
        float f11 = f10;
        for (float f12 : fArr) {
            if (f12 < f10) {
                f10 = f12;
            } else if (f12 > f11) {
                f11 = f12;
            }
        }
        return new Pair<>(Float.valueOf(f10), Float.valueOf(f11));
    }

    private static float a(float f10) {
        return Math.round(f10 * 100.0f) / 100.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x0118: MOVE (r2 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]) (LINE:282), block:B:15:0x0118 */
    /* JADX WARN: Removed duplicated region for block: B:29:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.String, java.lang.Long> c(float[] r18, float r19) {
        /*
            Method dump skipped, instructions count: 394
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: w6.C17792n.c(float[], float):android.util.Pair");
    }
}
