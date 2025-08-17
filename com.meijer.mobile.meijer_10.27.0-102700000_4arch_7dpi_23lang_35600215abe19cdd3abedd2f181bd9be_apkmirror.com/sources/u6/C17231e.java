package u6;

import com.medallia.digital.mobilesdk.l3;

/* renamed from: u6.e, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C17231e {
    public static int c(float f10, int i10, int i11) {
        if (i10 == i11 || f10 <= 0.0f) {
            return i10;
        }
        if (f10 >= 1.0f) {
            return i11;
        }
        float f11 = ((i10 >> 24) & l3.f92484c) / 255.0f;
        float f12 = ((i10 >> 16) & l3.f92484c) / 255.0f;
        float f13 = ((i10 >> 8) & l3.f92484c) / 255.0f;
        float f14 = ((i11 >> 24) & l3.f92484c) / 255.0f;
        float f15 = ((i11 >> 16) & l3.f92484c) / 255.0f;
        float f16 = ((i11 >> 8) & l3.f92484c) / 255.0f;
        float fA = a(f12);
        float fA2 = a(f13);
        float fA3 = a((i10 & l3.f92484c) / 255.0f);
        float fA4 = a(f15);
        float f17 = f11 + ((f14 - f11) * f10);
        float fA5 = fA2 + ((a(f16) - fA2) * f10);
        float fA6 = fA3 + (f10 * (a((i11 & l3.f92484c) / 255.0f) - fA3));
        return (Math.round(b(fA + ((fA4 - fA) * f10)) * 255.0f) << 16) | (Math.round(f17 * 255.0f) << 24) | (Math.round(b(fA5) * 255.0f) << 8) | Math.round(b(fA6) * 255.0f);
    }

    private static float a(float f10) {
        if (f10 <= 0.04045f) {
            return f10 / 12.92f;
        }
        return (float) Math.pow((f10 + 0.055f) / 1.055f, 2.4000000953674316d);
    }

    private static float b(float f10) {
        if (f10 <= 0.0031308f) {
            return f10 * 12.92f;
        }
        return (float) ((Math.pow(f10, 0.4166666567325592d) * 1.0549999475479126d) - 0.054999999701976776d);
    }
}
